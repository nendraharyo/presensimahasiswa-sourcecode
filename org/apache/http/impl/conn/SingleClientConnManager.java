package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class SingleClientConnManager
  implements ClientConnectionManager
{
  public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
  protected final boolean alwaysShutDown;
  protected final ClientConnectionOperator connOperator;
  protected volatile long connectionExpiresTime;
  protected volatile boolean isShutDown;
  protected volatile long lastReleaseTime;
  private final Log log;
  protected volatile SingleClientConnManager.ConnAdapter managedConn;
  protected final SchemeRegistry schemeRegistry;
  protected volatile SingleClientConnManager.PoolEntry uniquePoolEntry;
  
  public SingleClientConnManager()
  {
    this(localSchemeRegistry);
  }
  
  public SingleClientConnManager(SchemeRegistry paramSchemeRegistry)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    this.schemeRegistry = paramSchemeRegistry;
    localObject = createConnectionOperator(paramSchemeRegistry);
    this.connOperator = ((ClientConnectionOperator)localObject);
    localObject = new org/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    ((SingleClientConnManager.PoolEntry)localObject).<init>(this);
    this.uniquePoolEntry = ((SingleClientConnManager.PoolEntry)localObject);
    this.managedConn = null;
    this.lastReleaseTime = -1;
    this.alwaysShutDown = false;
    this.isShutDown = false;
  }
  
  public SingleClientConnManager(HttpParams paramHttpParams, SchemeRegistry paramSchemeRegistry)
  {
    this(paramSchemeRegistry);
  }
  
  protected final void assertStillUp()
  {
    boolean bool = this.isShutDown;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Asserts.check(bool, "Manager is shut down");
      return;
    }
  }
  
  public void closeExpiredConnections()
  {
    long l1 = this.connectionExpiresTime;
    long l2 = System.currentTimeMillis();
    boolean bool = l2 < l1;
    if (!bool)
    {
      l1 = 0L;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      closeIdleConnections(l1, localTimeUnit);
    }
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    assertStillUp();
    Object localObject1 = "Time unit";
    Args.notNull(paramTimeUnit, (String)localObject1);
    try
    {
      localObject1 = this.managedConn;
      if (localObject1 == null)
      {
        localObject1 = this.uniquePoolEntry;
        localObject1 = ((SingleClientConnManager.PoolEntry)localObject1).connection;
        boolean bool = ((OperatedClientConnection)localObject1).isOpen();
        if (bool)
        {
          long l1 = System.currentTimeMillis();
          long l2 = paramTimeUnit.toMillis(paramLong);
          l1 -= l2;
          l2 = this.lastReleaseTime;
          bool = l2 < l1;
          if (bool) {}
        }
      }
      try
      {
        localObject1 = this.uniquePoolEntry;
        ((SingleClientConnManager.PoolEntry)localObject1).close();
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log localLog = this.log;
          String str = "Problem closing idle connection.";
          localLog.debug(str, localIOException);
        }
      }
      return;
    }
    finally {}
  }
  
  protected ClientConnectionOperator createConnectionOperator(SchemeRegistry paramSchemeRegistry)
  {
    DefaultClientConnectionOperator localDefaultClientConnectionOperator = new org/apache/http/impl/conn/DefaultClientConnectionOperator;
    localDefaultClientConnectionOperator.<init>(paramSchemeRegistry);
    return localDefaultClientConnectionOperator;
  }
  
  protected void finalize()
  {
    try
    {
      shutdown();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public ManagedClientConnection getConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i = 0;
    Object localObject1 = null;
    Args.notNull(paramHttpRoute, "Route");
    assertStillUp();
    Object localObject2 = this.log;
    boolean bool2 = ((Log)localObject2).isDebugEnabled();
    Object localObject4;
    if (bool2)
    {
      localObject2 = this.log;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      String str = "Get connection for route ";
      localObject4 = str + paramHttpRoute;
      ((Log)localObject2).debug(localObject4);
    }
    for (;;)
    {
      float f2;
      try
      {
        localObject2 = this.managedConn;
        if (localObject2 == null)
        {
          bool2 = bool1;
          f2 = f1;
          localObject4 = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
          Asserts.check(bool2, (String)localObject4);
          closeExpiredConnections();
          localObject2 = this.uniquePoolEntry;
          localObject2 = ((SingleClientConnManager.PoolEntry)localObject2).connection;
          bool2 = ((OperatedClientConnection)localObject2).isOpen();
          if (!bool2) {
            continue;
          }
          localObject2 = this.uniquePoolEntry;
          localObject2 = ((SingleClientConnManager.PoolEntry)localObject2).tracker;
          if (localObject2 != null)
          {
            localObject2 = ((RouteTracker)localObject2).toRoute();
            bool2 = ((HttpRoute)localObject2).equals(paramHttpRoute);
            if (bool2) {
              continue;
            }
          }
          bool2 = bool1;
          f2 = f1;
          boolean bool3 = bool2;
          bool2 = false;
          localObject2 = null;
          f2 = 0.0F;
          i = bool3;
          if (i == 0) {
            break label353;
          }
        }
        try
        {
          localObject2 = this.uniquePoolEntry;
          ((SingleClientConnManager.PoolEntry)localObject2).shutdown();
        }
        catch (IOException localIOException)
        {
          localObject1 = this.log;
          localObject4 = "Problem shutting down connection.";
          ((Log)localObject1).debug(localObject4, localIOException);
          continue;
        }
        if (bool1)
        {
          localObject2 = new org/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
          ((SingleClientConnManager.PoolEntry)localObject2).<init>(this);
          this.uniquePoolEntry = ((SingleClientConnManager.PoolEntry)localObject2);
        }
        localObject2 = new org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
        localObject1 = this.uniquePoolEntry;
        ((SingleClientConnManager.ConnAdapter)localObject2).<init>(this, (SingleClientConnManager.PoolEntry)localObject1, paramHttpRoute);
        this.managedConn = ((SingleClientConnManager.ConnAdapter)localObject2);
        localObject2 = this.managedConn;
        return (ManagedClientConnection)localObject2;
        bool2 = false;
        localObject2 = null;
        f2 = 0.0F;
        continue;
        bool2 = false;
        localObject2 = null;
        f2 = 0.0F;
        continue;
        bool2 = bool1;
        f2 = f1;
        continue;
        bool1 = bool2;
      }
      finally {}
      label353:
      f1 = f2;
    }
  }
  
  public SchemeRegistry getSchemeRegistry()
  {
    return this.schemeRegistry;
  }
  
  /* Error */
  public void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 5
    //   3: aload_1
    //   4: instanceof 197
    //   7: istore 7
    //   9: ldc -52
    //   11: astore 8
    //   13: iload 7
    //   15: aload 8
    //   17: invokestatic 205	org/apache/http/util/Args:check	(ZLjava/lang/String;)V
    //   20: aload_0
    //   21: invokevirtual 113	org/apache/http/impl/conn/SingleClientConnManager:assertStillUp	()V
    //   24: aload_0
    //   25: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   28: astore 9
    //   30: aload 9
    //   32: invokeinterface 156 1 0
    //   37: istore 7
    //   39: iload 7
    //   41: ifeq +48 -> 89
    //   44: aload_0
    //   45: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   48: astore 9
    //   50: new 158	java/lang/StringBuilder
    //   53: astore 8
    //   55: aload 8
    //   57: invokespecial 159	java/lang/StringBuilder:<init>	()V
    //   60: ldc -49
    //   62: astore 10
    //   64: aload 8
    //   66: aload 10
    //   68: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_1
    //   72: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore 8
    //   80: aload 9
    //   82: aload 8
    //   84: invokeinterface 175 2 0
    //   89: aload_1
    //   90: checkcast 197	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter
    //   93: astore_1
    //   94: aload_1
    //   95: monitorenter
    //   96: aload_1
    //   97: getfield 211	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:poolEntry	Lorg/apache/http/impl/conn/AbstractPoolEntry;
    //   100: astore 9
    //   102: aload 9
    //   104: ifnonnull +6 -> 110
    //   107: aload_1
    //   108: monitorexit
    //   109: return
    //   110: aload_1
    //   111: invokevirtual 215	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:getManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   114: astore 9
    //   116: aload 9
    //   118: aload_0
    //   119: if_acmpne +173 -> 292
    //   122: iconst_1
    //   123: istore 7
    //   125: ldc -39
    //   127: astore 8
    //   129: iload 7
    //   131: aload 8
    //   133: invokestatic 92	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   136: aload_1
    //   137: invokevirtual 218	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:isOpen	()Z
    //   140: istore 7
    //   142: iload 7
    //   144: ifeq +68 -> 212
    //   147: aload_0
    //   148: getfield 81	org/apache/http/impl/conn/SingleClientConnManager:alwaysShutDown	Z
    //   151: istore 7
    //   153: iload 7
    //   155: ifne +14 -> 169
    //   158: aload_1
    //   159: invokevirtual 221	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:isMarkedReusable	()Z
    //   162: istore 7
    //   164: iload 7
    //   166: ifne +46 -> 212
    //   169: aload_0
    //   170: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   173: astore 9
    //   175: aload 9
    //   177: invokeinterface 156 1 0
    //   182: istore 7
    //   184: iload 7
    //   186: ifeq +22 -> 208
    //   189: aload_0
    //   190: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   193: astore 9
    //   195: ldc -33
    //   197: astore 8
    //   199: aload 9
    //   201: aload 8
    //   203: invokeinterface 175 2 0
    //   208: aload_1
    //   209: invokevirtual 224	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:shutdown	()V
    //   212: aload_1
    //   213: invokevirtual 227	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:detach	()V
    //   216: aload_0
    //   217: monitorenter
    //   218: iconst_0
    //   219: istore 7
    //   221: aconst_null
    //   222: astore 9
    //   224: aload_0
    //   225: aconst_null
    //   226: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   229: invokestatic 100	java/lang/System:currentTimeMillis	()J
    //   232: lstore 11
    //   234: aload_0
    //   235: lload 11
    //   237: putfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   240: lload_2
    //   241: lload 5
    //   243: lcmp
    //   244: istore 7
    //   246: iload 7
    //   248: ifle +53 -> 301
    //   251: aload 4
    //   253: lload_2
    //   254: invokevirtual 129	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   257: lstore 11
    //   259: aload_0
    //   260: getfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   263: lstore 13
    //   265: lload 11
    //   267: lload 13
    //   269: ladd
    //   270: lstore 11
    //   272: aload_0
    //   273: lload 11
    //   275: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   278: aload_0
    //   279: monitorexit
    //   280: aload_1
    //   281: monitorexit
    //   282: goto -173 -> 109
    //   285: astore 9
    //   287: aload_1
    //   288: monitorexit
    //   289: aload 9
    //   291: athrow
    //   292: iconst_0
    //   293: istore 7
    //   295: aconst_null
    //   296: astore 9
    //   298: goto -173 -> 125
    //   301: ldc2_w 228
    //   304: lstore 11
    //   306: aload_0
    //   307: lload 11
    //   309: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   312: goto -34 -> 278
    //   315: astore 9
    //   317: aload_0
    //   318: monitorexit
    //   319: aload 9
    //   321: athrow
    //   322: astore 9
    //   324: aload_0
    //   325: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   328: astore 8
    //   330: aload 8
    //   332: invokeinterface 156 1 0
    //   337: istore 15
    //   339: iload 15
    //   341: ifeq +24 -> 365
    //   344: aload_0
    //   345: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   348: astore 8
    //   350: ldc -25
    //   352: astore 10
    //   354: aload 8
    //   356: aload 10
    //   358: aload 9
    //   360: invokeinterface 140 3 0
    //   365: aload_1
    //   366: invokevirtual 227	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:detach	()V
    //   369: aload_0
    //   370: monitorenter
    //   371: iconst_0
    //   372: istore 7
    //   374: aconst_null
    //   375: astore 9
    //   377: aload_0
    //   378: aconst_null
    //   379: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   382: invokestatic 100	java/lang/System:currentTimeMillis	()J
    //   385: lstore 11
    //   387: aload_0
    //   388: lload 11
    //   390: putfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   393: lload_2
    //   394: lload 5
    //   396: lcmp
    //   397: istore 7
    //   399: iload 7
    //   401: ifle +42 -> 443
    //   404: aload 4
    //   406: lload_2
    //   407: invokevirtual 129	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   410: lstore 11
    //   412: aload_0
    //   413: getfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   416: lstore 13
    //   418: lload 11
    //   420: lload 13
    //   422: ladd
    //   423: lstore 11
    //   425: aload_0
    //   426: lload 11
    //   428: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   431: aload_0
    //   432: monitorexit
    //   433: goto -153 -> 280
    //   436: astore 9
    //   438: aload_0
    //   439: monitorexit
    //   440: aload 9
    //   442: athrow
    //   443: ldc2_w 228
    //   446: lstore 11
    //   448: aload_0
    //   449: lload 11
    //   451: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   454: goto -23 -> 431
    //   457: astore 9
    //   459: aload_1
    //   460: invokevirtual 227	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:detach	()V
    //   463: aload_0
    //   464: monitorenter
    //   465: iconst_0
    //   466: istore 15
    //   468: aconst_null
    //   469: astore 8
    //   471: aload_0
    //   472: aconst_null
    //   473: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   476: invokestatic 100	java/lang/System:currentTimeMillis	()J
    //   479: lstore 13
    //   481: aload_0
    //   482: lload 13
    //   484: putfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   487: lload_2
    //   488: lload 5
    //   490: lcmp
    //   491: istore 15
    //   493: iload 15
    //   495: ifle +35 -> 530
    //   498: aload 4
    //   500: lload_2
    //   501: invokevirtual 129	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   504: lstore 13
    //   506: aload_0
    //   507: getfield 79	org/apache/http/impl/conn/SingleClientConnManager:lastReleaseTime	J
    //   510: lstore 5
    //   512: lload 13
    //   514: lload 5
    //   516: ladd
    //   517: lstore 13
    //   519: aload_0
    //   520: lload 13
    //   522: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   525: aload_0
    //   526: monitorexit
    //   527: aload 9
    //   529: athrow
    //   530: ldc2_w 228
    //   533: lstore 13
    //   535: aload_0
    //   536: lload 13
    //   538: putfield 94	org/apache/http/impl/conn/SingleClientConnManager:connectionExpiresTime	J
    //   541: goto -16 -> 525
    //   544: astore 9
    //   546: aload_0
    //   547: monitorexit
    //   548: aload 9
    //   550: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	551	0	this	SingleClientConnManager
    //   0	551	1	paramManagedClientConnection	ManagedClientConnection
    //   0	551	2	paramLong	long
    //   0	551	4	paramTimeUnit	TimeUnit
    //   1	514	5	l1	long
    //   7	393	7	bool1	boolean
    //   11	459	8	localObject1	Object
    //   28	195	9	localObject2	Object
    //   285	5	9	localObject3	Object
    //   296	1	9	localObject4	Object
    //   315	5	9	localObject5	Object
    //   322	37	9	localIOException	IOException
    //   375	1	9	localObject6	Object
    //   436	5	9	localObject7	Object
    //   457	71	9	localObject8	Object
    //   544	5	9	localObject9	Object
    //   62	295	10	str	String
    //   232	218	11	l2	long
    //   263	274	13	l3	long
    //   337	157	15	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   96	100	285	finally
    //   107	109	285	finally
    //   110	114	285	finally
    //   131	136	285	finally
    //   212	216	285	finally
    //   216	218	285	finally
    //   280	282	285	finally
    //   287	289	285	finally
    //   319	322	285	finally
    //   365	369	285	finally
    //   369	371	285	finally
    //   440	443	285	finally
    //   459	463	285	finally
    //   463	465	285	finally
    //   527	530	285	finally
    //   548	551	285	finally
    //   225	229	315	finally
    //   229	232	315	finally
    //   235	240	315	finally
    //   253	257	315	finally
    //   259	263	315	finally
    //   273	278	315	finally
    //   278	280	315	finally
    //   307	312	315	finally
    //   317	319	315	finally
    //   136	140	322	java/io/IOException
    //   147	151	322	java/io/IOException
    //   158	162	322	java/io/IOException
    //   169	173	322	java/io/IOException
    //   175	182	322	java/io/IOException
    //   189	193	322	java/io/IOException
    //   201	208	322	java/io/IOException
    //   208	212	322	java/io/IOException
    //   378	382	436	finally
    //   382	385	436	finally
    //   388	393	436	finally
    //   406	410	436	finally
    //   412	416	436	finally
    //   426	431	436	finally
    //   431	433	436	finally
    //   438	440	436	finally
    //   449	454	436	finally
    //   136	140	457	finally
    //   147	151	457	finally
    //   158	162	457	finally
    //   169	173	457	finally
    //   175	182	457	finally
    //   189	193	457	finally
    //   201	208	457	finally
    //   208	212	457	finally
    //   324	328	457	finally
    //   330	337	457	finally
    //   344	348	457	finally
    //   358	365	457	finally
    //   472	476	544	finally
    //   476	479	544	finally
    //   482	487	544	finally
    //   500	504	544	finally
    //   506	510	544	finally
    //   520	525	544	finally
    //   525	527	544	finally
    //   536	541	544	finally
    //   546	548	544	finally
  }
  
  public final ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    SingleClientConnManager.1 local1 = new org/apache/http/impl/conn/SingleClientConnManager$1;
    local1.<init>(this, paramHttpRoute, paramObject);
    return local1;
  }
  
  /* Error */
  protected void revokeConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +4 -> 10
    //   9: return
    //   10: aload_1
    //   11: invokevirtual 227	org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter:detach	()V
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   20: astore_1
    //   21: aload_1
    //   22: invokevirtual 195	org/apache/http/impl/conn/SingleClientConnManager$PoolEntry:shutdown	()V
    //   25: aload_0
    //   26: monitorexit
    //   27: goto -18 -> 9
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    //   35: astore_1
    //   36: aload_0
    //   37: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   40: astore_2
    //   41: ldc -18
    //   43: astore_3
    //   44: aload_2
    //   45: aload_3
    //   46: aload_1
    //   47: invokeinterface 140 3 0
    //   52: goto -27 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	SingleClientConnManager
    //   4	18	1	localObject1	Object
    //   30	4	1	localObject2	Object
    //   35	12	1	localIOException	IOException
    //   40	5	2	localLog	Log
    //   43	3	3	str	String
    // Exception table:
    //   from	to	target	type
    //   16	20	30	finally
    //   21	25	30	finally
    //   25	27	30	finally
    //   31	33	30	finally
    //   36	40	30	finally
    //   46	52	30	finally
    //   16	20	35	java/io/IOException
    //   21	25	35	java/io/IOException
  }
  
  /* Error */
  public void shutdown()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: iload_1
    //   4: putfield 83	org/apache/http/impl/conn/SingleClientConnManager:isShutDown	Z
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull +12 -> 27
    //   18: aload_0
    //   19: getfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   22: astore_2
    //   23: aload_2
    //   24: invokevirtual 195	org/apache/http/impl/conn/SingleClientConnManager$PoolEntry:shutdown	()V
    //   27: iconst_0
    //   28: istore_1
    //   29: aconst_null
    //   30: astore_2
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   36: iconst_0
    //   37: istore_1
    //   38: aconst_null
    //   39: astore_2
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_2
    //   49: aload_0
    //   50: getfield 52	org/apache/http/impl/conn/SingleClientConnManager:log	Lorg/apache/commons/logging/Log;
    //   53: astore_3
    //   54: ldc -16
    //   56: astore 4
    //   58: aload_3
    //   59: aload 4
    //   61: aload_2
    //   62: invokeinterface 140 3 0
    //   67: iconst_0
    //   68: istore_1
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_0
    //   72: aconst_null
    //   73: putfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   76: iconst_0
    //   77: istore_1
    //   78: aconst_null
    //   79: astore_2
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   85: goto -40 -> 45
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: astore_2
    //   94: aconst_null
    //   95: astore_3
    //   96: aload_0
    //   97: aconst_null
    //   98: putfield 75	org/apache/http/impl/conn/SingleClientConnManager:uniquePoolEntry	Lorg/apache/http/impl/conn/SingleClientConnManager$PoolEntry;
    //   101: aconst_null
    //   102: astore_3
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 77	org/apache/http/impl/conn/SingleClientConnManager:managedConn	Lorg/apache/http/impl/conn/SingleClientConnManager$ConnAdapter;
    //   108: aload_2
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	SingleClientConnManager
    //   1	77	1	bool	boolean
    //   13	27	2	localPoolEntry	SingleClientConnManager.PoolEntry
    //   48	14	2	localIOException	IOException
    //   70	10	2	localObject1	Object
    //   88	4	2	localObject2	Object
    //   93	16	2	localObject3	Object
    //   53	50	3	localLog	Log
    //   56	4	4	str	String
    // Exception table:
    //   from	to	target	type
    //   9	13	48	java/io/IOException
    //   18	22	48	java/io/IOException
    //   23	27	48	java/io/IOException
    //   32	36	88	finally
    //   41	45	88	finally
    //   45	47	88	finally
    //   72	76	88	finally
    //   81	85	88	finally
    //   89	91	88	finally
    //   97	101	88	finally
    //   104	108	88	finally
    //   108	110	88	finally
    //   9	13	93	finally
    //   18	22	93	finally
    //   23	27	93	finally
    //   49	53	93	finally
    //   61	67	93	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SingleClientConnManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */