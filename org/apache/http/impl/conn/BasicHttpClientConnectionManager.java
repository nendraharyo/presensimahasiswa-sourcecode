package org.apache.http.impl.conn;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class BasicHttpClientConnectionManager
  implements Closeable, HttpClientConnectionManager
{
  private ManagedHttpClientConnection conn;
  private ConnectionConfig connConfig;
  private final HttpConnectionFactory connFactory;
  private final HttpClientConnectionOperator connectionOperator;
  private long expiry;
  private final AtomicBoolean isShutdown;
  private boolean leased;
  private final Log log;
  private HttpRoute route;
  private SocketConfig socketConfig;
  private Object state;
  private long updated;
  
  public BasicHttpClientConnectionManager()
  {
    this(localRegistry, null, null, null);
  }
  
  public BasicHttpClientConnectionManager(Lookup paramLookup)
  {
    this(paramLookup, null, null, null);
  }
  
  public BasicHttpClientConnectionManager(Lookup paramLookup, HttpConnectionFactory paramHttpConnectionFactory)
  {
    this(paramLookup, paramHttpConnectionFactory, null, null);
  }
  
  public BasicHttpClientConnectionManager(Lookup paramLookup, HttpConnectionFactory paramHttpConnectionFactory, SchemePortResolver paramSchemePortResolver, DnsResolver paramDnsResolver)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new org/apache/http/impl/conn/HttpClientConnectionOperator;
    ((HttpClientConnectionOperator)localObject).<init>(paramLookup, paramSchemePortResolver, paramDnsResolver);
    this.connectionOperator = ((HttpClientConnectionOperator)localObject);
    if (paramHttpConnectionFactory != null) {}
    for (;;)
    {
      this.connFactory = paramHttpConnectionFactory;
      this.expiry = Long.MAX_VALUE;
      localObject = SocketConfig.DEFAULT;
      this.socketConfig = ((SocketConfig)localObject);
      localObject = ConnectionConfig.DEFAULT;
      this.connConfig = ((ConnectionConfig)localObject);
      localObject = new java/util/concurrent/atomic/AtomicBoolean;
      ((AtomicBoolean)localObject).<init>(false);
      this.isShutdown = ((AtomicBoolean)localObject);
      return;
      paramHttpConnectionFactory = ManagedHttpClientConnectionFactory.INSTANCE;
    }
  }
  
  private void checkExpiry()
  {
    Object localObject1 = this.conn;
    if (localObject1 != null)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.expiry;
      boolean bool = l1 < l2;
      if (!bool)
      {
        localObject1 = this.log;
        bool = ((Log)localObject1).isDebugEnabled();
        if (bool)
        {
          localObject1 = this.log;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Connection expired @ ");
          Date localDate = new java/util/Date;
          long l3 = this.expiry;
          localDate.<init>(l3);
          localObject2 = localDate;
          ((Log)localObject1).debug(localObject2);
        }
        closeConnection();
      }
    }
  }
  
  private void closeConnection()
  {
    Object localObject1 = this.conn;
    if (localObject1 != null)
    {
      localObject1 = this.log;
      localObject2 = "Closing connection";
      ((Log)localObject1).debug(localObject2);
    }
    try
    {
      localObject1 = this.conn;
      ((ManagedHttpClientConnection)localObject1).close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject2 = this.log;
        boolean bool = ((Log)localObject2).isDebugEnabled();
        if (bool)
        {
          localObject2 = this.log;
          String str = "I/O exception closing connection";
          ((Log)localObject2).debug(str, localIOException);
        }
      }
    }
    localObject1 = null;
    this.conn = null;
  }
  
  private static Registry getDefaultRegistry()
  {
    RegistryBuilder localRegistryBuilder = RegistryBuilder.create();
    Object localObject = PlainConnectionSocketFactory.getSocketFactory();
    localRegistryBuilder = localRegistryBuilder.register("http", localObject);
    localObject = SSLConnectionSocketFactory.getSocketFactory();
    return localRegistryBuilder.register("https", localObject).build();
  }
  
  private void shutdownConnection()
  {
    Object localObject1 = this.conn;
    if (localObject1 != null)
    {
      localObject1 = this.log;
      localObject2 = "Shutting down connection";
      ((Log)localObject1).debug(localObject2);
    }
    try
    {
      localObject1 = this.conn;
      ((ManagedHttpClientConnection)localObject1).shutdown();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject2 = this.log;
        boolean bool = ((Log)localObject2).isDebugEnabled();
        if (bool)
        {
          localObject2 = this.log;
          String str = "I/O exception shutting down connection";
          ((Log)localObject2).debug(str, localIOException);
        }
      }
    }
    localObject1 = null;
    this.conn = null;
  }
  
  public void close()
  {
    shutdown();
  }
  
  /* Error */
  public void closeExpiredConnections()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 87	org/apache/http/impl/conn/BasicHttpClientConnectionManager:isShutdown	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: astore_1
    //   7: aload_1
    //   8: invokevirtual 188	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +6 -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield 190	org/apache/http/impl/conn/BasicHttpClientConnectionManager:leased	Z
    //   23: istore_2
    //   24: iload_2
    //   25: ifne -9 -> 16
    //   28: aload_0
    //   29: invokespecial 193	org/apache/http/impl/conn/BasicHttpClientConnectionManager:checkExpiry	()V
    //   32: goto -16 -> 16
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	BasicHttpClientConnectionManager
    //   6	2	1	localAtomicBoolean	AtomicBoolean
    //   35	4	1	localObject	Object
    //   11	14	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	35	finally
    //   7	11	35	finally
    //   19	23	35	finally
    //   28	32	35	finally
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    Object localObject1 = "Time unit";
    for (;;)
    {
      try
      {
        Args.notNull(paramTimeUnit, (String)localObject1);
        localObject1 = this.isShutdown;
        boolean bool1 = ((AtomicBoolean)localObject1).get();
        if (bool1) {
          return;
        }
        bool1 = this.leased;
        if (!bool1)
        {
          long l2 = paramTimeUnit.toMillis(paramLong);
          boolean bool2 = l2 < l1;
          if (bool2)
          {
            l2 = System.currentTimeMillis();
            l1 = l2 - l1;
            l2 = this.updated;
            boolean bool3 = l2 < l1;
            if (!bool3) {
              closeConnection();
            }
          }
          else
          {
            l1 = l2;
          }
        }
      }
      finally {}
    }
  }
  
  public void connect(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, int paramInt, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpClientConnection, "Connection");
    Args.notNull(paramHttpRoute, "HTTP route");
    Object localObject1 = this.conn;
    boolean bool;
    Object localObject2;
    if (paramHttpClientConnection == localObject1)
    {
      bool = true;
      localObject2 = "Connection not obtained from this manager";
      Asserts.check(bool, (String)localObject2);
      localObject1 = paramHttpRoute.getProxyHost();
      if (localObject1 == null) {
        break label107;
      }
    }
    label107:
    for (HttpHost localHttpHost = paramHttpRoute.getProxyHost();; localHttpHost = paramHttpRoute.getTargetHost())
    {
      InetSocketAddress localInetSocketAddress = paramHttpRoute.getLocalSocketAddress();
      localObject1 = this.connectionOperator;
      localObject2 = this.conn;
      SocketConfig localSocketConfig = this.socketConfig;
      ((HttpClientConnectionOperator)localObject1).connect((ManagedHttpClientConnection)localObject2, localHttpHost, localInetSocketAddress, paramInt, localSocketConfig, paramHttpContext);
      return;
      bool = false;
      localObject1 = null;
      break;
    }
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
  HttpClientConnection getConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_1
    //   3: istore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 87	org/apache/http/impl/conn/BasicHttpClientConnectionManager:isShutdown	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   11: astore 5
    //   13: aload 5
    //   15: invokevirtual 188	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   18: istore 6
    //   20: iload 6
    //   22: ifne +233 -> 255
    //   25: iload 4
    //   27: istore 6
    //   29: ldc -12
    //   31: astore 7
    //   33: iload 6
    //   35: aload 7
    //   37: invokestatic 222	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   40: aload_0
    //   41: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   44: astore 5
    //   46: aload 5
    //   48: invokeinterface 107 1 0
    //   53: istore 6
    //   55: iload 6
    //   57: ifeq +56 -> 113
    //   60: aload_0
    //   61: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   64: astore 5
    //   66: new 109	java/lang/StringBuilder
    //   69: astore 7
    //   71: aload 7
    //   73: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   76: ldc -10
    //   78: astore 8
    //   80: aload 7
    //   82: aload 8
    //   84: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: astore 7
    //   89: aload 7
    //   91: aload_1
    //   92: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   95: astore 7
    //   97: aload 7
    //   99: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: astore 7
    //   104: aload 5
    //   106: aload 7
    //   108: invokeinterface 132 2 0
    //   113: aload_0
    //   114: getfield 190	org/apache/http/impl/conn/BasicHttpClientConnectionManager:leased	Z
    //   117: istore 6
    //   119: iload 6
    //   121: ifne +143 -> 264
    //   124: ldc -8
    //   126: astore_3
    //   127: iload 4
    //   129: aload_3
    //   130: invokestatic 222	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   133: aload_0
    //   134: getfield 250	org/apache/http/impl/conn/BasicHttpClientConnectionManager:route	Lorg/apache/http/conn/routing/HttpRoute;
    //   137: astore 9
    //   139: aload 9
    //   141: aload_1
    //   142: invokestatic 256	org/apache/http/util/LangUtils:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   145: istore 4
    //   147: iload 4
    //   149: ifeq +22 -> 171
    //   152: aload_0
    //   153: getfield 258	org/apache/http/impl/conn/BasicHttpClientConnectionManager:state	Ljava/lang/Object;
    //   156: astore 9
    //   158: aload 9
    //   160: aload_2
    //   161: invokestatic 256	org/apache/http/util/LangUtils:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   164: istore 4
    //   166: iload 4
    //   168: ifne +7 -> 175
    //   171: aload_0
    //   172: invokespecial 135	org/apache/http/impl/conn/BasicHttpClientConnectionManager:closeConnection	()V
    //   175: aload_0
    //   176: aload_1
    //   177: putfield 250	org/apache/http/impl/conn/BasicHttpClientConnectionManager:route	Lorg/apache/http/conn/routing/HttpRoute;
    //   180: aload_0
    //   181: aload_2
    //   182: putfield 258	org/apache/http/impl/conn/BasicHttpClientConnectionManager:state	Ljava/lang/Object;
    //   185: aload_0
    //   186: invokespecial 193	org/apache/http/impl/conn/BasicHttpClientConnectionManager:checkExpiry	()V
    //   189: aload_0
    //   190: getfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   193: astore 9
    //   195: aload 9
    //   197: ifnonnull +38 -> 235
    //   200: aload_0
    //   201: getfield 63	org/apache/http/impl/conn/BasicHttpClientConnectionManager:connFactory	Lorg/apache/http/conn/HttpConnectionFactory;
    //   204: astore 9
    //   206: aload_0
    //   207: getfield 80	org/apache/http/impl/conn/BasicHttpClientConnectionManager:connConfig	Lorg/apache/http/config/ConnectionConfig;
    //   210: astore_3
    //   211: aload 9
    //   213: aload_1
    //   214: aload_3
    //   215: invokeinterface 263 3 0
    //   220: astore 9
    //   222: aload 9
    //   224: checkcast 139	org/apache/http/conn/ManagedHttpClientConnection
    //   227: astore 9
    //   229: aload_0
    //   230: aload 9
    //   232: putfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   235: iconst_1
    //   236: istore 4
    //   238: aload_0
    //   239: iload 4
    //   241: putfield 190	org/apache/http/impl/conn/BasicHttpClientConnectionManager:leased	Z
    //   244: aload_0
    //   245: getfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   248: astore 9
    //   250: aload_0
    //   251: monitorexit
    //   252: aload 9
    //   254: areturn
    //   255: iconst_0
    //   256: istore 6
    //   258: aconst_null
    //   259: astore 5
    //   261: goto -232 -> 29
    //   264: iconst_0
    //   265: istore 4
    //   267: aconst_null
    //   268: astore 9
    //   270: goto -146 -> 124
    //   273: astore 9
    //   275: aload_0
    //   276: monitorexit
    //   277: aload 9
    //   279: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	280	0	this	BasicHttpClientConnectionManager
    //   0	280	1	paramHttpRoute	HttpRoute
    //   0	280	2	paramObject	Object
    //   1	214	3	localObject1	Object
    //   3	263	4	bool1	boolean
    //   11	249	5	localObject2	Object
    //   18	239	6	bool2	boolean
    //   31	76	7	localObject3	Object
    //   78	5	8	str	String
    //   137	132	9	localObject4	Object
    //   273	5	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   7	11	273	finally
    //   13	18	273	finally
    //   35	40	273	finally
    //   40	44	273	finally
    //   46	53	273	finally
    //   60	64	273	finally
    //   66	69	273	finally
    //   71	76	273	finally
    //   82	87	273	finally
    //   91	95	273	finally
    //   97	102	273	finally
    //   106	113	273	finally
    //   113	117	273	finally
    //   129	133	273	finally
    //   133	137	273	finally
    //   141	145	273	finally
    //   152	156	273	finally
    //   160	164	273	finally
    //   171	175	273	finally
    //   176	180	273	finally
    //   181	185	273	finally
    //   185	189	273	finally
    //   189	193	273	finally
    //   200	204	273	finally
    //   206	210	273	finally
    //   214	220	273	finally
    //   222	227	273	finally
    //   230	235	273	finally
    //   239	244	273	finally
    //   244	248	273	finally
  }
  
  public ConnectionConfig getConnectionConfig()
  {
    try
    {
      ConnectionConfig localConnectionConfig = this.connConfig;
      return localConnectionConfig;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  HttpRoute getRoute()
  {
    return this.route;
  }
  
  public SocketConfig getSocketConfig()
  {
    try
    {
      SocketConfig localSocketConfig = this.socketConfig;
      return localSocketConfig;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  Object getState()
  {
    return this.state;
  }
  
  /* Error */
  public void releaseConnection(HttpClientConnection paramHttpClientConnection, Object paramObject, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 6
    //   3: iconst_0
    //   4: istore 8
    //   6: aconst_null
    //   7: astore 9
    //   9: aload_0
    //   10: monitorenter
    //   11: ldc -45
    //   13: astore 10
    //   15: aload_1
    //   16: aload 10
    //   18: invokestatic 201	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: getfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   26: astore 10
    //   28: aload_1
    //   29: aload 10
    //   31: if_acmpne +6 -> 37
    //   34: iconst_1
    //   35: istore 8
    //   37: ldc -40
    //   39: astore 10
    //   41: iload 8
    //   43: aload 10
    //   45: invokestatic 222	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   48: aload_0
    //   49: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   52: astore 9
    //   54: aload 9
    //   56: invokeinterface 107 1 0
    //   61: istore 8
    //   63: iload 8
    //   65: ifeq +57 -> 122
    //   68: aload_0
    //   69: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   72: astore 9
    //   74: new 109	java/lang/StringBuilder
    //   77: astore 10
    //   79: aload 10
    //   81: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   84: ldc_w 265
    //   87: astore 11
    //   89: aload 10
    //   91: aload 11
    //   93: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: astore 10
    //   98: aload 10
    //   100: aload_1
    //   101: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   104: astore 10
    //   106: aload 10
    //   108: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore 10
    //   113: aload 9
    //   115: aload 10
    //   117: invokeinterface 132 2 0
    //   122: aload_0
    //   123: getfield 87	org/apache/http/impl/conn/BasicHttpClientConnectionManager:isShutdown	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   126: astore 9
    //   128: aload 9
    //   130: invokevirtual 188	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   133: istore 8
    //   135: iload 8
    //   137: ifeq +6 -> 143
    //   140: aload_0
    //   141: monitorexit
    //   142: return
    //   143: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   146: lstore 12
    //   148: aload_0
    //   149: lload 12
    //   151: putfield 209	org/apache/http/impl/conn/BasicHttpClientConnectionManager:updated	J
    //   154: aload_0
    //   155: getfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   158: astore 9
    //   160: aload 9
    //   162: invokeinterface 268 1 0
    //   167: istore 8
    //   169: iload 8
    //   171: ifne +68 -> 239
    //   174: iconst_0
    //   175: istore 8
    //   177: aconst_null
    //   178: astore 9
    //   180: aload_0
    //   181: aconst_null
    //   182: putfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   185: iconst_0
    //   186: istore 8
    //   188: aconst_null
    //   189: astore 9
    //   191: aload_0
    //   192: aconst_null
    //   193: putfield 250	org/apache/http/impl/conn/BasicHttpClientConnectionManager:route	Lorg/apache/http/conn/routing/HttpRoute;
    //   196: iconst_0
    //   197: istore 8
    //   199: aconst_null
    //   200: astore 9
    //   202: aload_0
    //   203: aconst_null
    //   204: putfield 95	org/apache/http/impl/conn/BasicHttpClientConnectionManager:conn	Lorg/apache/http/conn/ManagedHttpClientConnection;
    //   207: ldc2_w 64
    //   210: lstore 12
    //   212: aload_0
    //   213: lload 12
    //   215: putfield 67	org/apache/http/impl/conn/BasicHttpClientConnectionManager:expiry	J
    //   218: iconst_0
    //   219: istore 8
    //   221: aconst_null
    //   222: astore 9
    //   224: aload_0
    //   225: iconst_0
    //   226: putfield 190	org/apache/http/impl/conn/BasicHttpClientConnectionManager:leased	Z
    //   229: goto -89 -> 140
    //   232: astore 9
    //   234: aload_0
    //   235: monitorexit
    //   236: aload 9
    //   238: athrow
    //   239: aload_0
    //   240: aload_2
    //   241: putfield 258	org/apache/http/impl/conn/BasicHttpClientConnectionManager:state	Ljava/lang/Object;
    //   244: aload_0
    //   245: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   248: astore 9
    //   250: aload 9
    //   252: invokeinterface 107 1 0
    //   257: istore 8
    //   259: iload 8
    //   261: ifeq +131 -> 392
    //   264: lload_3
    //   265: lload 6
    //   267: lcmp
    //   268: istore 8
    //   270: iload 8
    //   272: ifle +174 -> 446
    //   275: new 109	java/lang/StringBuilder
    //   278: astore 9
    //   280: aload 9
    //   282: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   285: ldc_w 270
    //   288: astore 10
    //   290: aload 9
    //   292: aload 10
    //   294: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: astore 9
    //   299: aload 9
    //   301: lload_3
    //   302: invokevirtual 273	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   305: astore 9
    //   307: ldc_w 275
    //   310: astore 10
    //   312: aload 9
    //   314: aload 10
    //   316: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: astore 9
    //   321: aload 9
    //   323: aload 5
    //   325: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   328: astore 9
    //   330: aload 9
    //   332: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: astore 9
    //   337: aload_0
    //   338: getfield 54	org/apache/http/impl/conn/BasicHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   341: astore 10
    //   343: new 109	java/lang/StringBuilder
    //   346: astore 11
    //   348: aload 11
    //   350: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   353: ldc_w 277
    //   356: astore 14
    //   358: aload 11
    //   360: aload 14
    //   362: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: astore 11
    //   367: aload 11
    //   369: aload 9
    //   371: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: astore 9
    //   376: aload 9
    //   378: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: astore 9
    //   383: aload 10
    //   385: aload 9
    //   387: invokeinterface 132 2 0
    //   392: lload_3
    //   393: lload 6
    //   395: lcmp
    //   396: istore 8
    //   398: iload 8
    //   400: ifle +54 -> 454
    //   403: aload_0
    //   404: getfield 209	org/apache/http/impl/conn/BasicHttpClientConnectionManager:updated	J
    //   407: lstore 12
    //   409: aload 5
    //   411: lload_3
    //   412: invokevirtual 207	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   415: lstore 15
    //   417: lload 12
    //   419: lload 15
    //   421: ladd
    //   422: lstore 12
    //   424: aload_0
    //   425: lload 12
    //   427: putfield 67	org/apache/http/impl/conn/BasicHttpClientConnectionManager:expiry	J
    //   430: goto -212 -> 218
    //   433: astore 9
    //   435: aconst_null
    //   436: astore 10
    //   438: aload_0
    //   439: iconst_0
    //   440: putfield 190	org/apache/http/impl/conn/BasicHttpClientConnectionManager:leased	Z
    //   443: aload 9
    //   445: athrow
    //   446: ldc_w 279
    //   449: astore 9
    //   451: goto -114 -> 337
    //   454: ldc2_w 64
    //   457: lstore 12
    //   459: aload_0
    //   460: lload 12
    //   462: putfield 67	org/apache/http/impl/conn/BasicHttpClientConnectionManager:expiry	J
    //   465: goto -247 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	468	0	this	BasicHttpClientConnectionManager
    //   0	468	1	paramHttpClientConnection	HttpClientConnection
    //   0	468	2	paramObject	Object
    //   0	468	3	paramLong	long
    //   0	468	5	paramTimeUnit	TimeUnit
    //   1	393	6	l1	long
    //   4	395	8	bool	boolean
    //   7	216	9	localObject1	Object
    //   232	5	9	localObject2	Object
    //   248	138	9	localObject3	Object
    //   433	11	9	localObject4	Object
    //   449	1	9	str1	String
    //   13	424	10	localObject5	Object
    //   87	281	11	localObject6	Object
    //   146	315	12	l2	long
    //   356	5	14	str2	String
    //   415	5	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   16	22	232	finally
    //   22	26	232	finally
    //   43	48	232	finally
    //   48	52	232	finally
    //   54	61	232	finally
    //   68	72	232	finally
    //   74	77	232	finally
    //   79	84	232	finally
    //   91	96	232	finally
    //   100	104	232	finally
    //   106	111	232	finally
    //   115	122	232	finally
    //   122	126	232	finally
    //   128	133	232	finally
    //   225	229	232	finally
    //   439	443	232	finally
    //   443	446	232	finally
    //   143	146	433	finally
    //   149	154	433	finally
    //   154	158	433	finally
    //   160	167	433	finally
    //   181	185	433	finally
    //   192	196	433	finally
    //   203	207	433	finally
    //   213	218	433	finally
    //   240	244	433	finally
    //   244	248	433	finally
    //   250	257	433	finally
    //   275	278	433	finally
    //   280	285	433	finally
    //   292	297	433	finally
    //   301	305	433	finally
    //   314	319	433	finally
    //   323	328	433	finally
    //   330	335	433	finally
    //   337	341	433	finally
    //   343	346	433	finally
    //   348	353	433	finally
    //   360	365	433	finally
    //   369	374	433	finally
    //   376	381	433	finally
    //   385	392	433	finally
    //   403	407	433	finally
    //   411	415	433	finally
    //   425	430	433	finally
    //   460	465	433	finally
  }
  
  public final ConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    Args.notNull(paramHttpRoute, "Route");
    BasicHttpClientConnectionManager.1 local1 = new org/apache/http/impl/conn/BasicHttpClientConnectionManager$1;
    local1.<init>(this, paramHttpRoute, paramObject);
    return local1;
  }
  
  public void routeComplete(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, HttpContext paramHttpContext) {}
  
  public void setConnectionConfig(ConnectionConfig paramConnectionConfig)
  {
    if (paramConnectionConfig != null) {}
    for (;;)
    {
      try
      {
        this.connConfig = paramConnectionConfig;
        return;
      }
      finally {}
      paramConnectionConfig = ConnectionConfig.DEFAULT;
    }
  }
  
  public void setSocketConfig(SocketConfig paramSocketConfig)
  {
    if (paramSocketConfig != null) {}
    for (;;)
    {
      try
      {
        this.socketConfig = paramSocketConfig;
        return;
      }
      finally {}
      paramSocketConfig = SocketConfig.DEFAULT;
    }
  }
  
  public void shutdown()
  {
    try
    {
      AtomicBoolean localAtomicBoolean = this.isShutdown;
      boolean bool1 = true;
      boolean bool2 = localAtomicBoolean.compareAndSet(false, bool1);
      if (bool2) {
        shutdownConnection();
      }
      return;
    }
    finally {}
  }
  
  public void upgrade(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpClientConnection, "Connection");
    Args.notNull(paramHttpRoute, "HTTP route");
    Object localObject = this.conn;
    boolean bool;
    if (paramHttpClientConnection == localObject) {
      bool = true;
    }
    for (;;)
    {
      Asserts.check(bool, "Connection not obtained from this manager");
      localObject = this.connectionOperator;
      ManagedHttpClientConnection localManagedHttpClientConnection = this.conn;
      HttpHost localHttpHost = paramHttpRoute.getTargetHost();
      ((HttpClientConnectionOperator)localObject).upgrade(localManagedHttpClientConnection, localHttpHost, paramHttpContext);
      return;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\BasicHttpClientConnectionManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */