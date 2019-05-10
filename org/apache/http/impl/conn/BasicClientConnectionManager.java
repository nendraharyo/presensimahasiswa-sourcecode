package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class BasicClientConnectionManager
  implements ClientConnectionManager
{
  private static final AtomicLong COUNTER;
  public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
  private ManagedClientConnectionImpl conn;
  private final ClientConnectionOperator connOperator;
  private final Log log;
  private HttpPoolEntry poolEntry;
  private final SchemeRegistry schemeRegistry;
  private volatile boolean shutdown;
  
  static
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>();
    COUNTER = localAtomicLong;
  }
  
  public BasicClientConnectionManager()
  {
    this(localSchemeRegistry);
  }
  
  public BasicClientConnectionManager(SchemeRegistry paramSchemeRegistry)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    this.schemeRegistry = paramSchemeRegistry;
    localObject = createConnectionOperator(paramSchemeRegistry);
    this.connOperator = ((ClientConnectionOperator)localObject);
  }
  
  private void assertNotShutdown()
  {
    boolean bool = this.shutdown;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Asserts.check(bool, "Connection manager has been shut down");
      return;
    }
  }
  
  private void shutdownConnection(HttpClientConnection paramHttpClientConnection)
  {
    try
    {
      paramHttpClientConnection.shutdown();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log localLog = this.log;
        boolean bool = localLog.isDebugEnabled();
        if (bool)
        {
          localLog = this.log;
          String str = "I/O exception shutting down connection";
          localLog.debug(str, localIOException);
        }
      }
    }
  }
  
  public void closeExpiredConnections()
  {
    try
    {
      assertNotShutdown();
      long l = System.currentTimeMillis();
      HttpPoolEntry localHttpPoolEntry = this.poolEntry;
      if (localHttpPoolEntry != null)
      {
        localHttpPoolEntry = this.poolEntry;
        boolean bool = localHttpPoolEntry.isExpired(l);
        if (bool)
        {
          Object localObject1 = this.poolEntry;
          ((HttpPoolEntry)localObject1).close();
          localObject1 = this.poolEntry;
          localObject1 = ((HttpPoolEntry)localObject1).getTracker();
          ((RouteTracker)localObject1).reset();
        }
      }
      return;
    }
    finally {}
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    Object localObject1 = "Time unit";
    Args.notNull(paramTimeUnit, (String)localObject1);
    for (;;)
    {
      long l2;
      try
      {
        assertNotShutdown();
        l2 = paramTimeUnit.toMillis(paramLong);
        boolean bool1 = l2 < l1;
        if (bool1)
        {
          l2 = System.currentTimeMillis();
          l1 = l2 - l1;
          localObject1 = this.poolEntry;
          if (localObject1 != null)
          {
            localObject1 = this.poolEntry;
            l2 = ((HttpPoolEntry)localObject1).getUpdated();
            boolean bool2 = l2 < l1;
            if (!bool2)
            {
              Object localObject2 = this.poolEntry;
              ((HttpPoolEntry)localObject2).close();
              localObject2 = this.poolEntry;
              localObject2 = ((HttpPoolEntry)localObject2).getTracker();
              ((RouteTracker)localObject2).reset();
            }
          }
          return;
        }
      }
      finally {}
      l1 = l2;
    }
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
  
  /* Error */
  org.apache.http.conn.ManagedClientConnection getConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    // Byte code:
    //   0: ldc -107
    //   2: astore_3
    //   3: aload_1
    //   4: aload_3
    //   5: invokestatic 63	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: invokespecial 103	org/apache/http/impl/conn/BasicClientConnectionManager:assertNotShutdown	()V
    //   15: aload_0
    //   16: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 92 1 0
    //   26: istore 4
    //   28: iload 4
    //   30: ifeq +54 -> 84
    //   33: aload_0
    //   34: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   37: astore_3
    //   38: new 151	java/lang/StringBuilder
    //   41: astore 5
    //   43: aload 5
    //   45: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   48: ldc -102
    //   50: astore 6
    //   52: aload 5
    //   54: aload 6
    //   56: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: astore 5
    //   61: aload 5
    //   63: aload_1
    //   64: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   67: astore 5
    //   69: aload 5
    //   71: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore 5
    //   76: aload_3
    //   77: aload 5
    //   79: invokeinterface 168 2 0
    //   84: aload_0
    //   85: getfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   88: astore_3
    //   89: aload_3
    //   90: ifnonnull +234 -> 324
    //   93: iconst_1
    //   94: istore 4
    //   96: ldc 13
    //   98: astore 5
    //   100: iload 4
    //   102: aload 5
    //   104: invokestatic 82	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   107: aload_0
    //   108: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   111: astore_3
    //   112: aload_3
    //   113: ifnull +44 -> 157
    //   116: aload_0
    //   117: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   120: astore_3
    //   121: aload_3
    //   122: invokevirtual 174	org/apache/http/impl/conn/HttpPoolEntry:getPlannedRoute	()Lorg/apache/http/conn/routing/HttpRoute;
    //   125: astore_3
    //   126: aload_3
    //   127: aload_1
    //   128: invokevirtual 180	org/apache/http/conn/routing/HttpRoute:equals	(Ljava/lang/Object;)Z
    //   131: istore 4
    //   133: iload 4
    //   135: ifne +22 -> 157
    //   138: aload_0
    //   139: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   142: astore_3
    //   143: aload_3
    //   144: invokevirtual 120	org/apache/http/impl/conn/HttpPoolEntry:close	()V
    //   147: iconst_0
    //   148: istore 4
    //   150: aconst_null
    //   151: astore_3
    //   152: aload_0
    //   153: aconst_null
    //   154: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   157: aload_0
    //   158: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   161: astore_3
    //   162: aload_3
    //   163: ifnonnull +74 -> 237
    //   166: getstatic 33	org/apache/http/impl/conn/BasicClientConnectionManager:COUNTER	Ljava/util/concurrent/atomic/AtomicLong;
    //   169: astore_3
    //   170: aload_3
    //   171: invokevirtual 183	java/util/concurrent/atomic/AtomicLong:getAndIncrement	()J
    //   174: lstore 7
    //   176: lload 7
    //   178: invokestatic 188	java/lang/Long:toString	(J)Ljava/lang/String;
    //   181: astore 9
    //   183: aload_0
    //   184: getfield 71	org/apache/http/impl/conn/BasicClientConnectionManager:connOperator	Lorg/apache/http/conn/ClientConnectionOperator;
    //   187: astore_3
    //   188: aload_3
    //   189: invokeinterface 194 1 0
    //   194: astore 10
    //   196: new 113	org/apache/http/impl/conn/HttpPoolEntry
    //   199: astore 5
    //   201: aload_0
    //   202: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   205: astore 6
    //   207: lconst_0
    //   208: lstore 11
    //   210: getstatic 198	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   213: astore 13
    //   215: aload 5
    //   217: aload 6
    //   219: aload 9
    //   221: aload_1
    //   222: aload 10
    //   224: lload 11
    //   226: aload 13
    //   228: invokespecial 201	org/apache/http/impl/conn/HttpPoolEntry:<init>	(Lorg/apache/commons/logging/Log;Ljava/lang/String;Lorg/apache/http/conn/routing/HttpRoute;Lorg/apache/http/conn/OperatedClientConnection;JLjava/util/concurrent/TimeUnit;)V
    //   231: aload_0
    //   232: aload 5
    //   234: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   237: invokestatic 109	java/lang/System:currentTimeMillis	()J
    //   240: lstore 7
    //   242: aload_0
    //   243: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   246: astore 6
    //   248: aload 6
    //   250: lload 7
    //   252: invokevirtual 117	org/apache/http/impl/conn/HttpPoolEntry:isExpired	(J)Z
    //   255: istore 4
    //   257: iload 4
    //   259: ifeq +26 -> 285
    //   262: aload_0
    //   263: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   266: astore_3
    //   267: aload_3
    //   268: invokevirtual 120	org/apache/http/impl/conn/HttpPoolEntry:close	()V
    //   271: aload_0
    //   272: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   275: astore_3
    //   276: aload_3
    //   277: invokevirtual 124	org/apache/http/impl/conn/HttpPoolEntry:getTracker	()Lorg/apache/http/conn/routing/RouteTracker;
    //   280: astore_3
    //   281: aload_3
    //   282: invokevirtual 129	org/apache/http/conn/routing/RouteTracker:reset	()V
    //   285: new 203	org/apache/http/impl/conn/ManagedClientConnectionImpl
    //   288: astore_3
    //   289: aload_0
    //   290: getfield 71	org/apache/http/impl/conn/BasicClientConnectionManager:connOperator	Lorg/apache/http/conn/ClientConnectionOperator;
    //   293: astore 5
    //   295: aload_0
    //   296: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   299: astore 6
    //   301: aload_3
    //   302: aload_0
    //   303: aload 5
    //   305: aload 6
    //   307: invokespecial 206	org/apache/http/impl/conn/ManagedClientConnectionImpl:<init>	(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/conn/ClientConnectionOperator;Lorg/apache/http/impl/conn/HttpPoolEntry;)V
    //   310: aload_0
    //   311: aload_3
    //   312: putfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   315: aload_0
    //   316: getfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   319: astore_3
    //   320: aload_0
    //   321: monitorexit
    //   322: aload_3
    //   323: areturn
    //   324: iconst_0
    //   325: istore 4
    //   327: aconst_null
    //   328: astore_3
    //   329: goto -233 -> 96
    //   332: astore_3
    //   333: aload_0
    //   334: monitorexit
    //   335: aload_3
    //   336: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	this	BasicClientConnectionManager
    //   0	337	1	paramHttpRoute	HttpRoute
    //   0	337	2	paramObject	Object
    //   2	327	3	localObject1	Object
    //   332	4	3	localObject2	Object
    //   26	300	4	bool	boolean
    //   41	263	5	localObject3	Object
    //   50	256	6	localObject4	Object
    //   174	77	7	l1	long
    //   181	39	9	str	String
    //   194	29	10	localOperatedClientConnection	org.apache.http.conn.OperatedClientConnection
    //   208	17	11	l2	long
    //   213	14	13	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   11	15	332	finally
    //   15	19	332	finally
    //   20	26	332	finally
    //   33	37	332	finally
    //   38	41	332	finally
    //   43	48	332	finally
    //   54	59	332	finally
    //   63	67	332	finally
    //   69	74	332	finally
    //   77	84	332	finally
    //   84	88	332	finally
    //   102	107	332	finally
    //   107	111	332	finally
    //   116	120	332	finally
    //   121	125	332	finally
    //   127	131	332	finally
    //   138	142	332	finally
    //   143	147	332	finally
    //   153	157	332	finally
    //   157	161	332	finally
    //   166	169	332	finally
    //   170	174	332	finally
    //   176	181	332	finally
    //   183	187	332	finally
    //   188	194	332	finally
    //   196	199	332	finally
    //   201	205	332	finally
    //   210	213	332	finally
    //   226	231	332	finally
    //   232	237	332	finally
    //   237	240	332	finally
    //   242	246	332	finally
    //   250	255	332	finally
    //   262	266	332	finally
    //   267	271	332	finally
    //   271	275	332	finally
    //   276	280	332	finally
    //   281	285	332	finally
    //   285	288	332	finally
    //   289	293	332	finally
    //   295	299	332	finally
    //   305	310	332	finally
    //   311	315	332	finally
    //   315	319	332	finally
    //   320	322	332	finally
    //   333	335	332	finally
  }
  
  public SchemeRegistry getSchemeRegistry()
  {
    return this.schemeRegistry;
  }
  
  /* Error */
  public void releaseConnection(org.apache.http.conn.ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 203
    //   4: istore 5
    //   6: ldc -48
    //   8: astore 6
    //   10: iload 5
    //   12: aload 6
    //   14: invokestatic 209	org/apache/http/util/Args:check	(ZLjava/lang/String;)V
    //   17: aload_1
    //   18: astore 7
    //   20: aload_1
    //   21: checkcast 203	org/apache/http/impl/conn/ManagedClientConnectionImpl
    //   24: astore 7
    //   26: aload 7
    //   28: monitorenter
    //   29: aload_0
    //   30: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   33: astore 6
    //   35: aload 6
    //   37: invokeinterface 92 1 0
    //   42: istore 8
    //   44: iload 8
    //   46: ifeq +56 -> 102
    //   49: aload_0
    //   50: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   53: astore 6
    //   55: new 151	java/lang/StringBuilder
    //   58: astore 9
    //   60: aload 9
    //   62: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   65: ldc -45
    //   67: astore 10
    //   69: aload 9
    //   71: aload 10
    //   73: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: astore 9
    //   78: aload 9
    //   80: aload_1
    //   81: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: astore 9
    //   86: aload 9
    //   88: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: astore 9
    //   93: aload 6
    //   95: aload 9
    //   97: invokeinterface 168 2 0
    //   102: aload 7
    //   104: invokevirtual 215	org/apache/http/impl/conn/ManagedClientConnectionImpl:getPoolEntry	()Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   107: astore 6
    //   109: aload 6
    //   111: ifnonnull +7 -> 118
    //   114: aload 7
    //   116: monitorexit
    //   117: return
    //   118: aload 7
    //   120: invokevirtual 219	org/apache/http/impl/conn/ManagedClientConnectionImpl:getManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   123: astore 6
    //   125: aload 6
    //   127: aload_0
    //   128: if_acmpne +52 -> 180
    //   131: iconst_1
    //   132: istore 8
    //   134: ldc -35
    //   136: astore 9
    //   138: iload 8
    //   140: aload 9
    //   142: invokestatic 82	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   145: aload_0
    //   146: monitorenter
    //   147: aload_0
    //   148: getfield 73	org/apache/http/impl/conn/BasicClientConnectionManager:shutdown	Z
    //   151: istore 8
    //   153: iload 8
    //   155: ifeq +34 -> 189
    //   158: aload_0
    //   159: aload 7
    //   161: invokespecial 225	org/apache/http/impl/conn/BasicClientConnectionManager:shutdownConnection	(Lorg/apache/http/HttpClientConnection;)V
    //   164: aload_0
    //   165: monitorexit
    //   166: aload 7
    //   168: monitorexit
    //   169: goto -52 -> 117
    //   172: astore 6
    //   174: aload 7
    //   176: monitorexit
    //   177: aload 6
    //   179: athrow
    //   180: iconst_0
    //   181: istore 8
    //   183: aconst_null
    //   184: astore 6
    //   186: goto -52 -> 134
    //   189: aload 7
    //   191: invokevirtual 228	org/apache/http/impl/conn/ManagedClientConnectionImpl:isOpen	()Z
    //   194: istore 8
    //   196: iload 8
    //   198: ifeq +21 -> 219
    //   201: aload 7
    //   203: invokevirtual 231	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   206: istore 8
    //   208: iload 8
    //   210: ifne +9 -> 219
    //   213: aload_0
    //   214: aload 7
    //   216: invokespecial 225	org/apache/http/impl/conn/BasicClientConnectionManager:shutdownConnection	(Lorg/apache/http/HttpClientConnection;)V
    //   219: aload 7
    //   221: invokevirtual 231	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   224: istore 8
    //   226: iload 8
    //   228: ifeq +174 -> 402
    //   231: aload_0
    //   232: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   235: astore 9
    //   237: aload 4
    //   239: ifnull +217 -> 456
    //   242: aload 4
    //   244: astore 6
    //   246: aload 9
    //   248: lload_2
    //   249: aload 6
    //   251: invokevirtual 235	org/apache/http/impl/conn/HttpPoolEntry:updateExpiry	(JLjava/util/concurrent/TimeUnit;)V
    //   254: aload_0
    //   255: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   258: astore 6
    //   260: aload 6
    //   262: invokeinterface 92 1 0
    //   267: istore 8
    //   269: iload 8
    //   271: ifeq +131 -> 402
    //   274: lconst_0
    //   275: lstore 11
    //   277: lload_2
    //   278: lload 11
    //   280: lcmp
    //   281: istore 8
    //   283: iload 8
    //   285: ifle +179 -> 464
    //   288: new 151	java/lang/StringBuilder
    //   291: astore 6
    //   293: aload 6
    //   295: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   298: ldc -19
    //   300: astore 9
    //   302: aload 6
    //   304: aload 9
    //   306: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: astore 6
    //   311: aload 6
    //   313: lload_2
    //   314: invokevirtual 240	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   317: astore 6
    //   319: ldc -14
    //   321: astore 9
    //   323: aload 6
    //   325: aload 9
    //   327: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: astore 6
    //   332: aload 6
    //   334: aload 4
    //   336: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   339: astore 6
    //   341: aload 6
    //   343: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: astore 6
    //   348: aload_0
    //   349: getfield 55	org/apache/http/impl/conn/BasicClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   352: astore 9
    //   354: new 151	java/lang/StringBuilder
    //   357: astore 10
    //   359: aload 10
    //   361: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   364: ldc -12
    //   366: astore 13
    //   368: aload 10
    //   370: aload 13
    //   372: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: astore 10
    //   377: aload 10
    //   379: aload 6
    //   381: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: astore 6
    //   386: aload 6
    //   388: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   391: astore 6
    //   393: aload 9
    //   395: aload 6
    //   397: invokeinterface 168 2 0
    //   402: aload 7
    //   404: invokevirtual 247	org/apache/http/impl/conn/ManagedClientConnectionImpl:detach	()Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   407: pop
    //   408: iconst_0
    //   409: istore 8
    //   411: aconst_null
    //   412: astore 6
    //   414: aload_0
    //   415: aconst_null
    //   416: putfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   419: aload_0
    //   420: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   423: astore 6
    //   425: aload 6
    //   427: invokevirtual 250	org/apache/http/impl/conn/HttpPoolEntry:isClosed	()Z
    //   430: istore 8
    //   432: iload 8
    //   434: ifeq +14 -> 448
    //   437: iconst_0
    //   438: istore 8
    //   440: aconst_null
    //   441: astore 6
    //   443: aload_0
    //   444: aconst_null
    //   445: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   448: aload_0
    //   449: monitorexit
    //   450: aload 7
    //   452: monitorexit
    //   453: goto -336 -> 117
    //   456: getstatic 198	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   459: astore 6
    //   461: goto -215 -> 246
    //   464: ldc -4
    //   466: astore 6
    //   468: goto -120 -> 348
    //   471: astore 6
    //   473: aload 7
    //   475: invokevirtual 247	org/apache/http/impl/conn/ManagedClientConnectionImpl:detach	()Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   478: pop
    //   479: iconst_0
    //   480: istore 14
    //   482: aconst_null
    //   483: astore 9
    //   485: aload_0
    //   486: aconst_null
    //   487: putfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   490: aload_0
    //   491: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   494: astore 9
    //   496: aload 9
    //   498: invokevirtual 250	org/apache/http/impl/conn/HttpPoolEntry:isClosed	()Z
    //   501: istore 14
    //   503: iload 14
    //   505: ifeq +14 -> 519
    //   508: iconst_0
    //   509: istore 14
    //   511: aconst_null
    //   512: astore 9
    //   514: aload_0
    //   515: aconst_null
    //   516: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   519: aload 6
    //   521: athrow
    //   522: astore 6
    //   524: aload_0
    //   525: monitorexit
    //   526: aload 6
    //   528: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	529	0	this	BasicClientConnectionManager
    //   0	529	1	paramManagedClientConnection	org.apache.http.conn.ManagedClientConnection
    //   0	529	2	paramLong	long
    //   0	529	4	paramTimeUnit	TimeUnit
    //   4	7	5	bool1	boolean
    //   8	118	6	localObject1	Object
    //   172	6	6	localObject2	Object
    //   184	283	6	localObject3	Object
    //   471	49	6	localObject4	Object
    //   522	5	6	localObject5	Object
    //   18	456	7	localObject6	Object
    //   42	397	8	bool2	boolean
    //   58	455	9	localObject7	Object
    //   67	311	10	localObject8	Object
    //   275	4	11	l	long
    //   366	5	13	str	String
    //   480	30	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   29	33	172	finally
    //   35	42	172	finally
    //   49	53	172	finally
    //   55	58	172	finally
    //   60	65	172	finally
    //   71	76	172	finally
    //   80	84	172	finally
    //   86	91	172	finally
    //   95	102	172	finally
    //   102	107	172	finally
    //   114	117	172	finally
    //   118	123	172	finally
    //   140	145	172	finally
    //   145	147	172	finally
    //   166	169	172	finally
    //   174	177	172	finally
    //   450	453	172	finally
    //   526	529	172	finally
    //   189	194	471	finally
    //   201	206	471	finally
    //   214	219	471	finally
    //   219	224	471	finally
    //   231	235	471	finally
    //   249	254	471	finally
    //   254	258	471	finally
    //   260	267	471	finally
    //   288	291	471	finally
    //   293	298	471	finally
    //   304	309	471	finally
    //   313	317	471	finally
    //   325	330	471	finally
    //   334	339	471	finally
    //   341	346	471	finally
    //   348	352	471	finally
    //   354	357	471	finally
    //   359	364	471	finally
    //   370	375	471	finally
    //   379	384	471	finally
    //   386	391	471	finally
    //   395	402	471	finally
    //   456	459	471	finally
    //   147	151	522	finally
    //   159	164	522	finally
    //   164	166	522	finally
    //   402	408	522	finally
    //   415	419	522	finally
    //   419	423	522	finally
    //   425	430	522	finally
    //   444	448	522	finally
    //   448	450	522	finally
    //   473	479	522	finally
    //   486	490	522	finally
    //   490	494	522	finally
    //   496	501	522	finally
    //   515	519	522	finally
    //   519	522	522	finally
    //   524	526	522	finally
  }
  
  public final ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    BasicClientConnectionManager.1 local1 = new org/apache/http/impl/conn/BasicClientConnectionManager$1;
    local1.<init>(this, paramHttpRoute, paramObject);
    return local1;
  }
  
  /* Error */
  public void shutdown()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_1
    //   3: istore_1
    //   4: aload_0
    //   5: iload_1
    //   6: putfield 73	org/apache/http/impl/conn/BasicClientConnectionManager:shutdown	Z
    //   9: aload_0
    //   10: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull +12 -> 27
    //   18: aload_0
    //   19: getfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   22: astore_2
    //   23: aload_2
    //   24: invokevirtual 120	org/apache/http/impl/conn/HttpPoolEntry:close	()V
    //   27: iconst_0
    //   28: istore_1
    //   29: aconst_null
    //   30: astore_2
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   36: iconst_0
    //   37: istore_1
    //   38: aconst_null
    //   39: astore_2
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_2
    //   49: aload_0
    //   50: aconst_null
    //   51: putfield 111	org/apache/http/impl/conn/BasicClientConnectionManager:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 170	org/apache/http/impl/conn/BasicClientConnectionManager:conn	Lorg/apache/http/impl/conn/ManagedClientConnectionImpl;
    //   59: aload_2
    //   60: athrow
    //   61: astore_2
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_2
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	BasicClientConnectionManager
    //   3	35	1	bool	boolean
    //   13	27	2	localHttpPoolEntry	HttpPoolEntry
    //   48	12	2	localObject1	Object
    //   61	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	13	48	finally
    //   18	22	48	finally
    //   23	27	48	finally
    //   5	9	61	finally
    //   32	36	61	finally
    //   41	45	61	finally
    //   45	47	61	finally
    //   50	54	61	finally
    //   55	59	61	finally
    //   59	61	61	finally
    //   62	64	61	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\BasicClientConnectionManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */