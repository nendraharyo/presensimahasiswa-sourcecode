package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class ConnPoolByRoute
  extends AbstractConnPool
{
  protected final ConnPerRoute connPerRoute;
  private final long connTTL;
  private final TimeUnit connTTLTimeUnit;
  protected final Queue freeConnections;
  protected final Set leasedConnections;
  private final Log log;
  protected volatile int maxTotalConnections;
  protected volatile int numConnections;
  protected final ClientConnectionOperator operator;
  private final Lock poolLock;
  protected final Map routeToPool;
  protected volatile boolean shutdown;
  protected final Queue waitingThreads;
  
  public ConnPoolByRoute(ClientConnectionOperator paramClientConnectionOperator, ConnPerRoute paramConnPerRoute, int paramInt)
  {
    this(paramClientConnectionOperator, paramConnPerRoute, paramInt, -1, localTimeUnit);
  }
  
  public ConnPoolByRoute(ClientConnectionOperator paramClientConnectionOperator, ConnPerRoute paramConnPerRoute, int paramInt, long paramLong, TimeUnit paramTimeUnit)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramClientConnectionOperator, "Connection operator");
    Args.notNull(paramConnPerRoute, "Connections per route");
    localObject = this.poolLock;
    this.poolLock = ((Lock)localObject);
    localObject = this.leasedConnections;
    this.leasedConnections = ((Set)localObject);
    this.operator = paramClientConnectionOperator;
    this.connPerRoute = paramConnPerRoute;
    this.maxTotalConnections = paramInt;
    localObject = createFreeConnQueue();
    this.freeConnections = ((Queue)localObject);
    localObject = createWaitingThreadQueue();
    this.waitingThreads = ((Queue)localObject);
    localObject = createRouteToPoolMap();
    this.routeToPool = ((Map)localObject);
    this.connTTL = paramLong;
    this.connTTLTimeUnit = paramTimeUnit;
  }
  
  public ConnPoolByRoute(ClientConnectionOperator paramClientConnectionOperator, HttpParams paramHttpParams)
  {
    this(paramClientConnectionOperator, localConnPerRoute, i);
  }
  
  private void closeConnection(BasicPoolEntry paramBasicPoolEntry)
  {
    OperatedClientConnection localOperatedClientConnection = paramBasicPoolEntry.getConnection();
    if (localOperatedClientConnection != null) {}
    try
    {
      localOperatedClientConnection.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log localLog = this.log;
        String str = "I/O error closing connection";
        localLog.debug(str, localIOException);
      }
    }
  }
  
  public void closeExpiredConnections()
  {
    Object localObject1 = this.log;
    Object localObject3 = "Closing expired connections";
    ((Log)localObject1).debug(localObject3);
    long l1 = System.currentTimeMillis();
    localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.freeConnections;
      localObject3 = ((Queue)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (BasicPoolEntry)localObject1;
        boolean bool2 = ((BasicPoolEntry)localObject1).isExpired(l1);
        if (bool2)
        {
          Log localLog = this.log;
          bool2 = localLog.isDebugEnabled();
          if (bool2)
          {
            localLog = this.log;
            Object localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            Object localObject5 = "Closing connection expired @ ";
            localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
            localObject5 = new java/util/Date;
            long l2 = ((BasicPoolEntry)localObject1).getExpiry();
            ((Date)localObject5).<init>(l2);
            localObject4 = ((StringBuilder)localObject4).append(localObject5);
            localObject4 = ((StringBuilder)localObject4).toString();
            localLog.debug(localObject4);
          }
          ((Iterator)localObject3).remove();
          deleteEntry((BasicPoolEntry)localObject1);
        }
      }
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    String str = "Time unit";
    Args.notNull(paramTimeUnit, str);
    boolean bool1 = paramLong < l1;
    if (bool1) {}
    for (;;)
    {
      Object localObject1 = this.log;
      boolean bool2 = ((Log)localObject1).isDebugEnabled();
      Object localObject3;
      if (bool2)
      {
        localObject1 = this.log;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Closing connections idle longer than ").append(paramLong);
        str = " ";
        localObject3 = str + paramTimeUnit;
        ((Log)localObject1).debug(localObject3);
      }
      l1 = System.currentTimeMillis();
      long l2 = paramTimeUnit.toMillis(paramLong);
      l2 = l1 - l2;
      localObject1 = this.poolLock;
      ((Lock)localObject1).lock();
      try
      {
        localObject1 = this.freeConnections;
        localObject3 = ((Queue)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (BasicPoolEntry)localObject1;
          long l3 = ((BasicPoolEntry)localObject1).getUpdated();
          boolean bool3 = l3 < l2;
          if (!bool3)
          {
            Log localLog = this.log;
            bool3 = localLog.isDebugEnabled();
            if (bool3)
            {
              localLog = this.log;
              Object localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              Object localObject5 = "Closing connection last used @ ";
              localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
              localObject5 = new java/util/Date;
              long l4 = ((BasicPoolEntry)localObject1).getUpdated();
              ((Date)localObject5).<init>(l4);
              localObject4 = ((StringBuilder)localObject4).append(localObject5);
              localObject4 = ((StringBuilder)localObject4).toString();
              localLog.debug(localObject4);
            }
            ((Iterator)localObject3).remove();
            deleteEntry((BasicPoolEntry)localObject1);
          }
        }
        paramLong = l1;
      }
      finally
      {
        this.poolLock.unlock();
      }
    }
    this.poolLock.unlock();
  }
  
  protected BasicPoolEntry createEntry(RouteSpecificPool paramRouteSpecificPool, ClientConnectionOperator paramClientConnectionOperator)
  {
    Object localObject1 = this.log;
    boolean bool = ((Log)localObject1).isDebugEnabled();
    if (bool)
    {
      localObject1 = this.log;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Creating new connection [");
      localObject4 = paramRouteSpecificPool.getRoute();
      localObject3 = ((StringBuilder)localObject3).append(localObject4);
      localObject4 = "]";
      localObject3 = (String)localObject4;
      ((Log)localObject1).debug(localObject3);
    }
    Object localObject3 = new org/apache/http/impl/conn/tsccm/BasicPoolEntry;
    HttpRoute localHttpRoute = paramRouteSpecificPool.getRoute();
    long l = this.connTTL;
    TimeUnit localTimeUnit = this.connTTLTimeUnit;
    Object localObject4 = paramClientConnectionOperator;
    ((BasicPoolEntry)localObject3).<init>(paramClientConnectionOperator, localHttpRoute, l, localTimeUnit);
    localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      paramRouteSpecificPool.createdEntry((BasicPoolEntry)localObject3);
      int i = this.numConnections + 1;
      this.numConnections = i;
      localObject1 = this.leasedConnections;
      ((Set)localObject1).add(localObject3);
      return (BasicPoolEntry)localObject3;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  protected Queue createFreeConnQueue()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    return localLinkedList;
  }
  
  protected Map createRouteToPoolMap()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    return localHashMap;
  }
  
  protected Queue createWaitingThreadQueue()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    return localLinkedList;
  }
  
  public void deleteClosedConnections()
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.freeConnections;
      Iterator localIterator = ((Queue)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (BasicPoolEntry)localObject1;
        OperatedClientConnection localOperatedClientConnection = ((BasicPoolEntry)localObject1).getConnection();
        boolean bool2 = localOperatedClientConnection.isOpen();
        if (!bool2)
        {
          localIterator.remove();
          deleteEntry((BasicPoolEntry)localObject1);
        }
      }
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  protected void deleteEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    HttpRoute localHttpRoute = paramBasicPoolEntry.getPlannedRoute();
    Object localObject2 = this.log;
    boolean bool = ((Log)localObject2).isDebugEnabled();
    if (bool)
    {
      localObject2 = this.log;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Deleting connection [").append(localHttpRoute).append("][");
      Object localObject4 = paramBasicPoolEntry.getState();
      localObject3 = ((StringBuilder)localObject3).append(localObject4);
      localObject4 = "]";
      localObject3 = (String)localObject4;
      ((Log)localObject2).debug(localObject3);
    }
    localObject2 = this.poolLock;
    ((Lock)localObject2).lock();
    try
    {
      closeConnection(paramBasicPoolEntry);
      bool = true;
      localObject2 = getRoutePool(localHttpRoute, bool);
      ((RouteSpecificPool)localObject2).deleteEntry(paramBasicPoolEntry);
      int i = this.numConnections + -1;
      this.numConnections = i;
      bool = ((RouteSpecificPool)localObject2).isUnused();
      if (bool)
      {
        localObject2 = this.routeToPool;
        ((Map)localObject2).remove(localHttpRoute);
      }
      return;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  /* Error */
  protected void deleteLeastUsedEntry()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 147 1 0
    //   11: aload_0
    //   12: getfield 82	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:freeConnections	Ljava/util/Queue;
    //   15: astore_1
    //   16: aload_1
    //   17: invokeinterface 286 1 0
    //   22: astore_1
    //   23: aload_1
    //   24: checkcast 112	org/apache/http/impl/conn/tsccm/BasicPoolEntry
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +18 -> 47
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual 201	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:deleteEntry	(Lorg/apache/http/impl/conn/tsccm/BasicPoolEntry;)V
    //   37: aload_0
    //   38: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   41: invokeinterface 204 1 0
    //   46: return
    //   47: aload_0
    //   48: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   51: astore_1
    //   52: aload_1
    //   53: invokeinterface 170 1 0
    //   58: istore_2
    //   59: iload_2
    //   60: ifeq -23 -> 37
    //   63: aload_0
    //   64: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   67: astore_1
    //   68: ldc_w 288
    //   71: astore_3
    //   72: aload_1
    //   73: aload_3
    //   74: invokeinterface 136 2 0
    //   79: goto -42 -> 37
    //   82: astore_1
    //   83: aload_0
    //   84: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   87: invokeinterface 204 1 0
    //   92: aload_1
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	ConnPoolByRoute
    //   4	69	1	localObject1	Object
    //   82	11	1	localObject2	Object
    //   58	2	2	bool	boolean
    //   71	3	3	str	String
    // Exception table:
    //   from	to	target	type
    //   11	15	82	finally
    //   16	22	82	finally
    //   23	27	82	finally
    //   33	37	82	finally
    //   47	51	82	finally
    //   52	58	82	finally
    //   63	67	82	finally
    //   73	79	82	finally
  }
  
  /* Error */
  public void freeEntry(BasicPoolEntry paramBasicPoolEntry, boolean paramBoolean, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 258	org/apache/http/impl/conn/tsccm/BasicPoolEntry:getPlannedRoute	()Lorg/apache/http/conn/routing/HttpRoute;
    //   4: astore 6
    //   6: aload_0
    //   7: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   10: astore 7
    //   12: aload 7
    //   14: invokeinterface 170 1 0
    //   19: istore 8
    //   21: iload 8
    //   23: ifeq +80 -> 103
    //   26: aload_0
    //   27: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   30: astore 7
    //   32: new 172	java/lang/StringBuilder
    //   35: astore 9
    //   37: aload 9
    //   39: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   42: aload 9
    //   44: ldc_w 290
    //   47: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload 6
    //   52: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   55: ldc_w 262
    //   58: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: astore 9
    //   63: aload_1
    //   64: invokevirtual 265	org/apache/http/impl/conn/tsccm/BasicPoolEntry:getState	()Ljava/lang/Object;
    //   67: astore 10
    //   69: aload 9
    //   71: aload 10
    //   73: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   76: astore 9
    //   78: ldc -24
    //   80: astore 10
    //   82: aload 9
    //   84: aload 10
    //   86: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: astore 9
    //   94: aload 7
    //   96: aload 9
    //   98: invokeinterface 136 2 0
    //   103: aload_0
    //   104: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   107: astore 7
    //   109: aload 7
    //   111: invokeinterface 147 1 0
    //   116: aload_0
    //   117: getfield 292	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:shutdown	Z
    //   120: istore 8
    //   122: iload 8
    //   124: ifeq +22 -> 146
    //   127: aload_0
    //   128: aload_1
    //   129: invokespecial 268	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:closeConnection	(Lorg/apache/http/impl/conn/tsccm/BasicPoolEntry;)V
    //   132: aload_0
    //   133: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   136: astore 7
    //   138: aload 7
    //   140: invokeinterface 204 1 0
    //   145: return
    //   146: aload_0
    //   147: getfield 70	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:leasedConnections	Ljava/util/Set;
    //   150: astore 7
    //   152: aload 7
    //   154: aload_1
    //   155: invokeinterface 294 2 0
    //   160: pop
    //   161: iconst_1
    //   162: istore 8
    //   164: aload_0
    //   165: aload 6
    //   167: iload 8
    //   169: invokevirtual 273	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:getRoutePool	(Lorg/apache/http/conn/routing/HttpRoute;Z)Lorg/apache/http/impl/conn/tsccm/RouteSpecificPool;
    //   172: astore 9
    //   174: iload_2
    //   175: ifeq +275 -> 450
    //   178: aload 9
    //   180: invokevirtual 298	org/apache/http/impl/conn/tsccm/RouteSpecificPool:getCapacity	()I
    //   183: istore 8
    //   185: iload 8
    //   187: iflt +263 -> 450
    //   190: aload_0
    //   191: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   194: astore 7
    //   196: aload 7
    //   198: invokeinterface 170 1 0
    //   203: istore 8
    //   205: iload 8
    //   207: ifeq +185 -> 392
    //   210: lconst_0
    //   211: lstore 11
    //   213: lload_3
    //   214: lload 11
    //   216: lcmp
    //   217: istore 8
    //   219: iload 8
    //   221: ifle +221 -> 442
    //   224: new 172	java/lang/StringBuilder
    //   227: astore 7
    //   229: aload 7
    //   231: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   234: ldc_w 300
    //   237: astore 10
    //   239: aload 7
    //   241: aload 10
    //   243: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: astore 7
    //   248: aload 7
    //   250: lload_3
    //   251: invokevirtual 211	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   254: astore 7
    //   256: ldc -43
    //   258: astore 10
    //   260: aload 7
    //   262: aload 10
    //   264: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: astore 7
    //   269: aload 7
    //   271: aload 5
    //   273: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   276: astore 7
    //   278: aload 7
    //   280: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: astore 7
    //   285: aload_0
    //   286: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   289: astore 10
    //   291: new 172	java/lang/StringBuilder
    //   294: astore 13
    //   296: aload 13
    //   298: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   301: ldc_w 302
    //   304: astore 14
    //   306: aload 13
    //   308: aload 14
    //   310: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: astore 13
    //   315: aload 13
    //   317: aload 6
    //   319: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   322: astore 6
    //   324: ldc_w 262
    //   327: astore 13
    //   329: aload 6
    //   331: aload 13
    //   333: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: astore 6
    //   338: aload_1
    //   339: invokevirtual 265	org/apache/http/impl/conn/tsccm/BasicPoolEntry:getState	()Ljava/lang/Object;
    //   342: astore 13
    //   344: aload 6
    //   346: aload 13
    //   348: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   351: astore 6
    //   353: ldc_w 304
    //   356: astore 13
    //   358: aload 6
    //   360: aload 13
    //   362: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: astore 6
    //   367: aload 6
    //   369: aload 7
    //   371: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: astore 7
    //   376: aload 7
    //   378: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: astore 7
    //   383: aload 10
    //   385: aload 7
    //   387: invokeinterface 136 2 0
    //   392: aload 9
    //   394: aload_1
    //   395: invokevirtual 307	org/apache/http/impl/conn/tsccm/RouteSpecificPool:freeEntry	(Lorg/apache/http/impl/conn/tsccm/BasicPoolEntry;)V
    //   398: aload_1
    //   399: lload_3
    //   400: aload 5
    //   402: invokevirtual 311	org/apache/http/impl/conn/tsccm/BasicPoolEntry:updateExpiry	(JLjava/util/concurrent/TimeUnit;)V
    //   405: aload_0
    //   406: getfield 82	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:freeConnections	Ljava/util/Queue;
    //   409: astore 7
    //   411: aload 7
    //   413: aload_1
    //   414: invokeinterface 312 2 0
    //   419: pop
    //   420: aload_0
    //   421: aload 9
    //   423: invokevirtual 316	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:notifyWaitingThread	(Lorg/apache/http/impl/conn/tsccm/RouteSpecificPool;)V
    //   426: aload_0
    //   427: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   430: astore 7
    //   432: aload 7
    //   434: invokeinterface 204 1 0
    //   439: goto -294 -> 145
    //   442: ldc_w 318
    //   445: astore 7
    //   447: goto -162 -> 285
    //   450: aload_0
    //   451: aload_1
    //   452: invokespecial 268	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:closeConnection	(Lorg/apache/http/impl/conn/tsccm/BasicPoolEntry;)V
    //   455: aload 9
    //   457: invokevirtual 321	org/apache/http/impl/conn/tsccm/RouteSpecificPool:dropEntry	()V
    //   460: aload_0
    //   461: getfield 240	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:numConnections	I
    //   464: iconst_m1
    //   465: iadd
    //   466: istore 8
    //   468: aload_0
    //   469: iload 8
    //   471: putfield 240	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:numConnections	I
    //   474: goto -54 -> 420
    //   477: astore 7
    //   479: aload_0
    //   480: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   483: invokeinterface 204 1 0
    //   488: aload 7
    //   490: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	491	0	this	ConnPoolByRoute
    //   0	491	1	paramBasicPoolEntry	BasicPoolEntry
    //   0	491	2	paramBoolean	boolean
    //   0	491	3	paramLong	long
    //   0	491	5	paramTimeUnit	TimeUnit
    //   4	364	6	localObject1	Object
    //   10	436	7	localObject2	Object
    //   477	12	7	localObject3	Object
    //   19	149	8	bool1	boolean
    //   183	3	8	i	int
    //   203	17	8	bool2	boolean
    //   466	4	8	j	int
    //   35	421	9	localObject4	Object
    //   67	317	10	localObject5	Object
    //   211	4	11	l	long
    //   294	67	13	localObject6	Object
    //   304	5	14	str	String
    // Exception table:
    //   from	to	target	type
    //   116	120	477	finally
    //   128	132	477	finally
    //   146	150	477	finally
    //   154	161	477	finally
    //   167	172	477	finally
    //   178	183	477	finally
    //   190	194	477	finally
    //   196	203	477	finally
    //   224	227	477	finally
    //   229	234	477	finally
    //   241	246	477	finally
    //   250	254	477	finally
    //   262	267	477	finally
    //   271	276	477	finally
    //   278	283	477	finally
    //   285	289	477	finally
    //   291	294	477	finally
    //   296	301	477	finally
    //   308	313	477	finally
    //   317	322	477	finally
    //   331	336	477	finally
    //   338	342	477	finally
    //   346	351	477	finally
    //   360	365	477	finally
    //   369	374	477	finally
    //   376	381	477	finally
    //   385	392	477	finally
    //   394	398	477	finally
    //   400	405	477	finally
    //   405	409	477	finally
    //   413	420	477	finally
    //   421	426	477	finally
    //   451	455	477	finally
    //   455	460	477	finally
    //   460	464	477	finally
    //   469	474	477	finally
  }
  
  public int getConnectionsInPool()
  {
    Lock localLock = this.poolLock;
    localLock.lock();
    try
    {
      int i = this.numConnections;
      return i;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  public int getConnectionsInPool(HttpRoute paramHttpRoute)
  {
    int i = 0;
    Object localObject1 = null;
    this.poolLock.lock();
    RouteSpecificPool localRouteSpecificPool = null;
    try
    {
      localRouteSpecificPool = getRoutePool(paramHttpRoute, false);
      if (localRouteSpecificPool != null) {
        i = localRouteSpecificPool.getEntryCount();
      }
      return i;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  protected BasicPoolEntry getEntryBlocking(HttpRoute paramHttpRoute, Object paramObject, long paramLong, TimeUnit paramTimeUnit, WaitingThreadAborter paramWaitingThreadAborter)
  {
    localObject1 = null;
    long l1 = 0L;
    boolean bool1 = paramLong < l1;
    if (bool1)
    {
      localObject1 = new java/util/Date;
      l1 = System.currentTimeMillis();
      l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
      ((Date)localObject1).<init>(l1);
    }
    boolean bool2 = false;
    Object localObject4 = null;
    localObject5 = this.poolLock;
    ((Lock)localObject5).lock();
    bool1 = true;
    for (;;)
    {
      try
      {
        localObject6 = getRoutePool(paramHttpRoute, bool1);
        bool1 = false;
        localObject5 = null;
      }
      finally
      {
        try
        {
          int i;
          int k;
          boolean bool3;
          Object localObject9;
          String str;
          int m;
          int j;
          int n;
          boolean bool5;
          ((RouteSpecificPool)localObject6).queueThread((WaitingThread)localObject5);
          Object localObject7 = this.waitingThreads;
          ((Queue)localObject7).add(localObject5);
          boolean bool4 = ((WaitingThread)localObject5).await((Date)localObject1);
          ((RouteSpecificPool)localObject6).removeThread((WaitingThread)localObject5);
          Object localObject8 = this.waitingThreads;
          ((Queue)localObject8).remove(localObject5);
          if ((bool4) || (localObject1 == null)) {
            continue;
          }
          l2 = ((Date)localObject1).getTime();
          long l3 = System.currentTimeMillis();
          bool4 = l2 < l3;
          if (bool4) {
            continue;
          }
          localObject1 = new org/apache/http/conn/ConnectionPoolTimeoutException;
          localObject5 = "Timeout waiting for connection from pool";
          ((ConnectionPoolTimeoutException)localObject1).<init>((String)localObject5);
          throw ((Throwable)localObject1);
        }
        finally
        {
          ((RouteSpecificPool)localObject6).removeThread((WaitingThread)localObject5);
          Object localObject6 = this.waitingThreads;
          ((Queue)localObject6).remove(localObject5);
        }
        localObject2 = finally;
        this.poolLock.unlock();
      }
      if (localObject4 == null)
      {
        bool2 = this.shutdown;
        if (!bool2)
        {
          bool2 = true;
          localObject7 = "Connection pool shut down";
          Asserts.check(bool2, (String)localObject7);
          localObject4 = this.log;
          bool2 = ((Log)localObject4).isDebugEnabled();
          if (bool2)
          {
            localObject4 = this.log;
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            localObject8 = "[";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            localObject7 = ((StringBuilder)localObject7).append(paramHttpRoute);
            localObject8 = "] total kept alive: ";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            localObject8 = this.freeConnections;
            i = ((Queue)localObject8).size();
            localObject7 = ((StringBuilder)localObject7).append(i);
            localObject8 = ", total issued: ";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            localObject8 = this.leasedConnections;
            i = ((Set)localObject8).size();
            localObject7 = ((StringBuilder)localObject7).append(i);
            localObject8 = ", total allocated: ";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            i = this.numConnections;
            localObject7 = ((StringBuilder)localObject7).append(i);
            localObject8 = " out of ";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            i = this.maxTotalConnections;
            localObject7 = ((StringBuilder)localObject7).append(i);
            localObject7 = ((StringBuilder)localObject7).toString();
            ((Log)localObject4).debug(localObject7);
          }
          localObject4 = getFreeEntry((RouteSpecificPool)localObject6, paramObject);
          if (localObject4 == null) {
            continue;
          }
        }
      }
      else
      {
        this.poolLock.unlock();
        return (BasicPoolEntry)localObject4;
      }
      bool2 = false;
      localObject4 = null;
      continue;
      k = ((RouteSpecificPool)localObject6).getCapacity();
      if (k > 0)
      {
        k = 1;
        localObject8 = this.log;
        bool3 = ((Log)localObject8).isDebugEnabled();
        if (bool3)
        {
          localObject8 = this.log;
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>();
          str = "Available capacity: ";
          localObject9 = ((StringBuilder)localObject9).append(str);
          m = ((RouteSpecificPool)localObject6).getCapacity();
          localObject9 = ((StringBuilder)localObject9).append(m);
          str = " out of ";
          localObject9 = ((StringBuilder)localObject9).append(str);
          m = ((RouteSpecificPool)localObject6).getMaxEntries();
          localObject9 = ((StringBuilder)localObject9).append(m);
          str = " [";
          localObject9 = ((StringBuilder)localObject9).append(str);
          localObject9 = ((StringBuilder)localObject9).append(paramHttpRoute);
          str = "][";
          localObject9 = ((StringBuilder)localObject9).append(str);
          localObject9 = ((StringBuilder)localObject9).append(paramObject);
          str = "]";
          localObject9 = ((StringBuilder)localObject9).append(str);
          localObject9 = ((StringBuilder)localObject9).toString();
          ((Log)localObject8).debug(localObject9);
        }
        if (k != 0)
        {
          j = this.numConnections;
          n = this.maxTotalConnections;
          if (j < n)
          {
            localObject4 = this.operator;
            localObject4 = createEntry((RouteSpecificPool)localObject6, (ClientConnectionOperator)localObject4);
          }
        }
      }
      else
      {
        k = 0;
        localObject7 = null;
        continue;
      }
      if (k == 0) {
        continue;
      }
      localObject7 = this.freeConnections;
      bool4 = ((Queue)localObject7).isEmpty();
      if (bool4) {
        continue;
      }
      deleteLeastUsedEntry();
      bool5 = true;
      localObject6 = getRoutePool(paramHttpRoute, bool5);
      localObject4 = this.operator;
      localObject4 = createEntry((RouteSpecificPool)localObject6, (ClientConnectionOperator)localObject4);
    }
    localObject7 = this.log;
    bool4 = ((Log)localObject7).isDebugEnabled();
    if (bool4)
    {
      localObject7 = this.log;
      localObject8 = new java/lang/StringBuilder;
      ((StringBuilder)localObject8).<init>();
      localObject9 = "Need to wait for connection [";
      localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
      localObject8 = ((StringBuilder)localObject8).append(paramHttpRoute);
      localObject9 = "][";
      localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
      localObject8 = ((StringBuilder)localObject8).append(paramObject);
      localObject9 = "]";
      localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
      localObject8 = ((StringBuilder)localObject8).toString();
      ((Log)localObject7).debug(localObject8);
    }
    if (localObject5 == null)
    {
      localObject5 = this.poolLock;
      localObject5 = ((Lock)localObject5).newCondition();
      localObject5 = newWaitingThread((Condition)localObject5, (RouteSpecificPool)localObject6);
      paramWaitingThreadAborter.setWaitingThread((WaitingThread)localObject5);
    }
  }
  
  protected BasicPoolEntry getFreeEntry(RouteSpecificPool paramRouteSpecificPool, Object paramObject)
  {
    boolean bool1 = true;
    BasicPoolEntry localBasicPoolEntry = null;
    this.poolLock.lock();
    boolean bool2 = false;
    Object localObject1 = null;
    for (;;)
    {
      if (!bool2)
      {
        Object localObject4;
        Object localObject5;
        try
        {
          localBasicPoolEntry = paramRouteSpecificPool.allocEntry(paramObject);
          if (localBasicPoolEntry == null) {
            break label367;
          }
          localObject4 = this.log;
          boolean bool3 = ((Log)localObject4).isDebugEnabled();
          Object localObject6;
          if (bool3)
          {
            localObject4 = this.log;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Getting free connection [";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = paramRouteSpecificPool.getRoute();
            localObject5 = ((StringBuilder)localObject5).append(localObject6);
            localObject6 = "][";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).append(paramObject);
            localObject6 = "]";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            ((Log)localObject4).debug(localObject5);
          }
          localObject4 = this.freeConnections;
          ((Queue)localObject4).remove(localBasicPoolEntry);
          long l = System.currentTimeMillis();
          bool3 = localBasicPoolEntry.isExpired(l);
          if (bool3)
          {
            localObject4 = this.log;
            bool3 = ((Log)localObject4).isDebugEnabled();
            if (bool3)
            {
              localObject4 = this.log;
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              localObject6 = "Closing expired free connection [";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject6 = paramRouteSpecificPool.getRoute();
              localObject5 = ((StringBuilder)localObject5).append(localObject6);
              localObject6 = "][";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject5 = ((StringBuilder)localObject5).append(paramObject);
              localObject6 = "]";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject5 = ((StringBuilder)localObject5).toString();
              ((Log)localObject4).debug(localObject5);
            }
            closeConnection(localBasicPoolEntry);
            paramRouteSpecificPool.dropEntry();
            int i = this.numConnections + -1;
            this.numConnections = i;
            continue;
          }
        }
        finally
        {
          this.poolLock.unlock();
        }
        Object localObject3 = this.leasedConnections;
        ((Set)localObject3).add(localBasicPoolEntry);
        bool2 = bool1;
        continue;
        label367:
        localObject3 = this.log;
        bool2 = ((Log)localObject3).isDebugEnabled();
        if (bool2)
        {
          localObject3 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = "No free connections [";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = paramRouteSpecificPool.getRoute();
          localObject4 = ((StringBuilder)localObject4).append(localObject5);
          localObject5 = "][";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).append(paramObject);
          localObject5 = "]";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((Log)localObject3).debug(localObject4);
          bool2 = bool1;
        }
      }
      else
      {
        this.poolLock.unlock();
        return localBasicPoolEntry;
      }
      bool2 = bool1;
    }
  }
  
  protected Lock getLock()
  {
    return this.poolLock;
  }
  
  public int getMaxTotalConnections()
  {
    return this.maxTotalConnections;
  }
  
  protected RouteSpecificPool getRoutePool(HttpRoute paramHttpRoute, boolean paramBoolean)
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.routeToPool;
      localObject1 = ((Map)localObject1).get(paramHttpRoute);
      localObject1 = (RouteSpecificPool)localObject1;
      if ((localObject1 == null) && (paramBoolean))
      {
        localObject1 = newRouteSpecificPool(paramHttpRoute);
        Map localMap = this.routeToPool;
        localMap.put(paramHttpRoute, localObject1);
      }
      return (RouteSpecificPool)localObject1;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  protected void handleLostEntry(HttpRoute paramHttpRoute)
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    boolean bool1 = true;
    try
    {
      localObject1 = getRoutePool(paramHttpRoute, bool1);
      ((RouteSpecificPool)localObject1).dropEntry();
      boolean bool2 = ((RouteSpecificPool)localObject1).isUnused();
      if (bool2)
      {
        Map localMap = this.routeToPool;
        localMap.remove(paramHttpRoute);
      }
      int i = this.numConnections + -1;
      this.numConnections = i;
      notifyWaitingThread((RouteSpecificPool)localObject1);
      return;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  protected RouteSpecificPool newRouteSpecificPool(HttpRoute paramHttpRoute)
  {
    RouteSpecificPool localRouteSpecificPool = new org/apache/http/impl/conn/tsccm/RouteSpecificPool;
    ConnPerRoute localConnPerRoute = this.connPerRoute;
    localRouteSpecificPool.<init>(paramHttpRoute, localConnPerRoute);
    return localRouteSpecificPool;
  }
  
  protected WaitingThread newWaitingThread(Condition paramCondition, RouteSpecificPool paramRouteSpecificPool)
  {
    WaitingThread localWaitingThread = new org/apache/http/impl/conn/tsccm/WaitingThread;
    localWaitingThread.<init>(paramCondition, paramRouteSpecificPool);
    return localWaitingThread;
  }
  
  /* Error */
  protected void notifyWaitingThread(RouteSpecificPool paramRouteSpecificPool)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   8: astore 4
    //   10: aload 4
    //   12: invokeinterface 147 1 0
    //   17: aload_1
    //   18: ifnull +125 -> 143
    //   21: aload_1
    //   22: invokevirtual 439	org/apache/http/impl/conn/tsccm/RouteSpecificPool:hasThread	()Z
    //   25: istore 5
    //   27: iload 5
    //   29: ifeq +114 -> 143
    //   32: aload_0
    //   33: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   36: astore_3
    //   37: aload_3
    //   38: invokeinterface 170 1 0
    //   43: istore_2
    //   44: iload_2
    //   45: ifeq +75 -> 120
    //   48: aload_0
    //   49: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   52: astore_3
    //   53: new 172	java/lang/StringBuilder
    //   56: astore 4
    //   58: aload 4
    //   60: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   63: ldc_w 441
    //   66: astore 6
    //   68: aload 4
    //   70: aload 6
    //   72: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: astore 4
    //   77: aload_1
    //   78: invokevirtual 230	org/apache/http/impl/conn/tsccm/RouteSpecificPool:getRoute	()Lorg/apache/http/conn/routing/HttpRoute;
    //   81: astore 6
    //   83: aload 4
    //   85: aload 6
    //   87: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   90: astore 4
    //   92: ldc -24
    //   94: astore 6
    //   96: aload 4
    //   98: aload 6
    //   100: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: astore 4
    //   105: aload 4
    //   107: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: astore 4
    //   112: aload_3
    //   113: aload 4
    //   115: invokeinterface 136 2 0
    //   120: aload_1
    //   121: invokevirtual 445	org/apache/http/impl/conn/tsccm/RouteSpecificPool:nextThread	()Lorg/apache/http/impl/conn/tsccm/WaitingThread;
    //   124: astore_3
    //   125: aload_3
    //   126: ifnull +7 -> 133
    //   129: aload_3
    //   130: invokevirtual 448	org/apache/http/impl/conn/tsccm/WaitingThread:wakeup	()V
    //   133: aload_0
    //   134: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   137: invokeinterface 204 1 0
    //   142: return
    //   143: aload_0
    //   144: getfield 87	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:waitingThreads	Ljava/util/Queue;
    //   147: astore 4
    //   149: aload 4
    //   151: invokeinterface 367 1 0
    //   156: istore 5
    //   158: iload 5
    //   160: ifne +57 -> 217
    //   163: aload_0
    //   164: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   167: astore_3
    //   168: aload_3
    //   169: invokeinterface 170 1 0
    //   174: istore_2
    //   175: iload_2
    //   176: ifeq +21 -> 197
    //   179: aload_0
    //   180: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   183: astore_3
    //   184: ldc_w 450
    //   187: astore 4
    //   189: aload_3
    //   190: aload 4
    //   192: invokeinterface 136 2 0
    //   197: aload_0
    //   198: getfield 87	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:waitingThreads	Ljava/util/Queue;
    //   201: astore_3
    //   202: aload_3
    //   203: invokeinterface 286 1 0
    //   208: astore_3
    //   209: aload_3
    //   210: checkcast 391	org/apache/http/impl/conn/tsccm/WaitingThread
    //   213: astore_3
    //   214: goto -89 -> 125
    //   217: aload_0
    //   218: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   221: astore 4
    //   223: aload 4
    //   225: invokeinterface 170 1 0
    //   230: istore 5
    //   232: iload 5
    //   234: ifeq -109 -> 125
    //   237: aload_0
    //   238: getfield 54	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:log	Lorg/apache/commons/logging/Log;
    //   241: astore 4
    //   243: ldc_w 452
    //   246: astore 6
    //   248: aload 4
    //   250: aload 6
    //   252: invokeinterface 136 2 0
    //   257: goto -132 -> 125
    //   260: astore_3
    //   261: aload_0
    //   262: getfield 67	org/apache/http/impl/conn/tsccm/ConnPoolByRoute:poolLock	Ljava/util/concurrent/locks/Lock;
    //   265: invokeinterface 204 1 0
    //   270: aload_3
    //   271: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	ConnPoolByRoute
    //   0	272	1	paramRouteSpecificPool	RouteSpecificPool
    //   1	175	2	bool1	boolean
    //   3	211	3	localObject1	Object
    //   260	11	3	localObject2	Object
    //   8	241	4	localObject3	Object
    //   25	208	5	bool2	boolean
    //   66	185	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   21	25	260	finally
    //   32	36	260	finally
    //   37	43	260	finally
    //   48	52	260	finally
    //   53	56	260	finally
    //   58	63	260	finally
    //   70	75	260	finally
    //   77	81	260	finally
    //   85	90	260	finally
    //   98	103	260	finally
    //   105	110	260	finally
    //   113	120	260	finally
    //   120	124	260	finally
    //   129	133	260	finally
    //   143	147	260	finally
    //   149	156	260	finally
    //   163	167	260	finally
    //   168	174	260	finally
    //   179	183	260	finally
    //   190	197	260	finally
    //   197	201	260	finally
    //   202	208	260	finally
    //   209	213	260	finally
    //   217	221	260	finally
    //   223	230	260	finally
    //   237	241	260	finally
    //   250	257	260	finally
  }
  
  public PoolEntryRequest requestPoolEntry(HttpRoute paramHttpRoute, Object paramObject)
  {
    WaitingThreadAborter localWaitingThreadAborter = new org/apache/http/impl/conn/tsccm/WaitingThreadAborter;
    localWaitingThreadAborter.<init>();
    ConnPoolByRoute.1 local1 = new org/apache/http/impl/conn/tsccm/ConnPoolByRoute$1;
    local1.<init>(this, localWaitingThreadAborter, paramHttpRoute, paramObject);
    return local1;
  }
  
  public void setMaxTotalConnections(int paramInt)
  {
    Lock localLock = this.poolLock;
    localLock.lock();
    try
    {
      this.maxTotalConnections = paramInt;
      return;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  public void shutdown()
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    for (;;)
    {
      boolean bool1;
      try
      {
        bool1 = this.shutdown;
        if (bool1)
        {
          localObject1 = this.poolLock;
          ((Lock)localObject1).unlock();
          return;
        }
        bool1 = true;
        this.shutdown = bool1;
        localObject1 = this.leasedConnections;
        localIterator = ((Set)localObject1).iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (BasicPoolEntry)localObject1;
          localIterator.remove();
          closeConnection((BasicPoolEntry)localObject1);
          continue;
        }
        localObject3 = this.freeConnections;
      }
      finally
      {
        this.poolLock.unlock();
      }
      Iterator localIterator = ((Queue)localObject3).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = localIterator.next();
        localObject3 = (BasicPoolEntry)localObject3;
        localIterator.remove();
        Log localLog = this.log;
        boolean bool2 = localLog.isDebugEnabled();
        if (bool2)
        {
          localLog = this.log;
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = "Closing connection [";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ((BasicPoolEntry)localObject3).getPlannedRoute();
          localObject4 = ((StringBuilder)localObject4).append(localObject5);
          localObject5 = "][";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ((BasicPoolEntry)localObject3).getState();
          localObject4 = ((StringBuilder)localObject4).append(localObject5);
          localObject5 = "]";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          localLog.debug(localObject4);
        }
        closeConnection((BasicPoolEntry)localObject3);
      }
      Object localObject3 = this.waitingThreads;
      localIterator = ((Queue)localObject3).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = localIterator.next();
        localObject3 = (WaitingThread)localObject3;
        localIterator.remove();
        ((WaitingThread)localObject3).wakeup();
      }
      localObject3 = this.routeToPool;
      ((Map)localObject3).clear();
      localObject3 = this.poolLock;
      ((Lock)localObject3).unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\ConnPoolByRoute.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */