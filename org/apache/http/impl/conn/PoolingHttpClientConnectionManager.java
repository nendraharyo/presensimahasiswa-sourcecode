package org.apache.http.impl.conn;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class PoolingHttpClientConnectionManager
  implements Closeable, HttpClientConnectionManager, ConnPoolControl
{
  private final PoolingHttpClientConnectionManager.ConfigData configData;
  private final HttpClientConnectionOperator connectionOperator;
  private final AtomicBoolean isShutDown;
  private final Log log;
  private final CPool pool;
  
  public PoolingHttpClientConnectionManager()
  {
    this(localRegistry);
  }
  
  public PoolingHttpClientConnectionManager(long paramLong, TimeUnit paramTimeUnit)
  {
    this(localRegistry, null, null, null, paramLong, paramTimeUnit);
  }
  
  public PoolingHttpClientConnectionManager(Registry paramRegistry)
  {
    this(paramRegistry, null, null);
  }
  
  public PoolingHttpClientConnectionManager(Registry paramRegistry, DnsResolver paramDnsResolver)
  {
    this(paramRegistry, null, paramDnsResolver);
  }
  
  public PoolingHttpClientConnectionManager(Registry paramRegistry, HttpConnectionFactory paramHttpConnectionFactory)
  {
    this(paramRegistry, paramHttpConnectionFactory, null);
  }
  
  public PoolingHttpClientConnectionManager(Registry paramRegistry, HttpConnectionFactory paramHttpConnectionFactory, DnsResolver paramDnsResolver)
  {
    this(paramRegistry, paramHttpConnectionFactory, null, paramDnsResolver, -1, localTimeUnit);
  }
  
  public PoolingHttpClientConnectionManager(Registry paramRegistry, HttpConnectionFactory paramHttpConnectionFactory, SchemePortResolver paramSchemePortResolver, DnsResolver paramDnsResolver, long paramLong, TimeUnit paramTimeUnit)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager$ConfigData;
    ((PoolingHttpClientConnectionManager.ConfigData)localObject).<init>();
    this.configData = ((PoolingHttpClientConnectionManager.ConfigData)localObject);
    localObject = new org/apache/http/impl/conn/CPool;
    PoolingHttpClientConnectionManager.InternalConnectionFactory localInternalConnectionFactory = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager$InternalConnectionFactory;
    PoolingHttpClientConnectionManager.ConfigData localConfigData = this.configData;
    localInternalConnectionFactory.<init>(localConfigData, paramHttpConnectionFactory);
    ((CPool)localObject).<init>(localInternalConnectionFactory, 2, 20, paramLong, paramTimeUnit);
    this.pool = ((CPool)localObject);
    localObject = new org/apache/http/impl/conn/HttpClientConnectionOperator;
    ((HttpClientConnectionOperator)localObject).<init>(paramRegistry, paramSchemePortResolver, paramDnsResolver);
    this.connectionOperator = ((HttpClientConnectionOperator)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.isShutDown = ((AtomicBoolean)localObject);
  }
  
  public PoolingHttpClientConnectionManager(HttpConnectionFactory paramHttpConnectionFactory)
  {
    this(localRegistry, paramHttpConnectionFactory, null);
  }
  
  PoolingHttpClientConnectionManager(CPool paramCPool, Lookup paramLookup, SchemePortResolver paramSchemePortResolver, DnsResolver paramDnsResolver)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager$ConfigData;
    ((PoolingHttpClientConnectionManager.ConfigData)localObject).<init>();
    this.configData = ((PoolingHttpClientConnectionManager.ConfigData)localObject);
    this.pool = paramCPool;
    localObject = new org/apache/http/impl/conn/HttpClientConnectionOperator;
    ((HttpClientConnectionOperator)localObject).<init>(paramLookup, paramSchemePortResolver, paramDnsResolver);
    this.connectionOperator = ((HttpClientConnectionOperator)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.isShutDown = ((AtomicBoolean)localObject);
  }
  
  private String format(HttpRoute paramHttpRoute, Object paramObject)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[route: ").append(paramHttpRoute);
    String str = "]";
    localStringBuilder2.append(str);
    if (paramObject != null)
    {
      localStringBuilder2 = localStringBuilder1.append("[state: ").append(paramObject);
      str = "]";
      localStringBuilder2.append(str);
    }
    return localStringBuilder1.toString();
  }
  
  private String format(CPoolEntry paramCPoolEntry)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = localStringBuilder.append("[id: ");
    Object localObject2 = paramCPoolEntry.getId();
    ((StringBuilder)localObject1).append((String)localObject2).append("]");
    localObject1 = localStringBuilder.append("[route: ");
    localObject2 = paramCPoolEntry.getRoute();
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = "]";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = paramCPoolEntry.getState();
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("[state: ").append(localObject1);
      localObject2 = "]";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    return localStringBuilder.toString();
  }
  
  private String formatStats(HttpRoute paramHttpRoute)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    PoolStats localPoolStats = this.pool.getTotalStats();
    Object localObject = this.pool.getStats(paramHttpRoute);
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[total kept alive: ");
    int i = localPoolStats.getAvailable();
    localStringBuilder2.append(i).append("; ");
    localStringBuilder2 = localStringBuilder1.append("route allocated: ");
    i = ((PoolStats)localObject).getLeased();
    int j = ((PoolStats)localObject).getAvailable();
    i += j;
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(" of ");
    int k = ((PoolStats)localObject).getMax();
    localStringBuilder2.append(k).append("; ");
    localObject = localStringBuilder1.append("total allocated: ");
    int m = localPoolStats.getLeased();
    i = localPoolStats.getAvailable();
    m += i;
    ((StringBuilder)localObject).append(m);
    localObject = localStringBuilder1.append(" of ");
    int n = localPoolStats.getMax();
    ((StringBuilder)localObject).append(n).append("]");
    return localStringBuilder1.toString();
  }
  
  private static Registry getDefaultRegistry()
  {
    RegistryBuilder localRegistryBuilder = RegistryBuilder.create();
    Object localObject = PlainConnectionSocketFactory.getSocketFactory();
    localRegistryBuilder = localRegistryBuilder.register("http", localObject);
    localObject = SSLConnectionSocketFactory.getSocketFactory();
    return localRegistryBuilder.register("https", localObject).build();
  }
  
  public void close()
  {
    shutdown();
  }
  
  public void closeExpiredConnections()
  {
    this.log.debug("Closing expired connections");
    this.pool.closeExpired();
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Closing connections idle longer than ").append(paramLong);
      String str = " ";
      localObject = str + paramTimeUnit;
      localLog.debug(localObject);
    }
    this.pool.closeIdle(paramLong, paramTimeUnit);
  }
  
  public void connect(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, int paramInt, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpClientConnection, "Managed Connection");
    Object localObject1 = "HTTP route";
    Args.notNull(paramHttpRoute, (String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = CPoolProxy.getPoolEntry(paramHttpClientConnection);
        Object localObject3 = ((CPoolEntry)localObject1).getConnection();
        localObject3 = (ManagedHttpClientConnection)localObject3;
        localObject1 = paramHttpRoute.getProxyHost();
        if (localObject1 != null)
        {
          localHttpHost = paramHttpRoute.getProxyHost();
          InetSocketAddress localInetSocketAddress = paramHttpRoute.getLocalSocketAddress();
          localObject1 = this.configData;
          SocketConfig localSocketConfig = ((PoolingHttpClientConnectionManager.ConfigData)localObject1).getSocketConfig(localHttpHost);
          if (localSocketConfig == null)
          {
            localObject1 = this.configData;
            localSocketConfig = ((PoolingHttpClientConnectionManager.ConfigData)localObject1).getDefaultSocketConfig();
          }
          if (localSocketConfig == null) {
            localSocketConfig = SocketConfig.DEFAULT;
          }
          this.connectionOperator.connect((ManagedHttpClientConnection)localObject3, localHttpHost, localInetSocketAddress, paramInt, localSocketConfig, paramHttpContext);
          return;
        }
      }
      finally {}
      HttpHost localHttpHost = paramHttpRoute.getTargetHost();
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
  
  public ConnectionConfig getConnectionConfig(HttpHost paramHttpHost)
  {
    return this.configData.getConnectionConfig(paramHttpHost);
  }
  
  public ConnectionConfig getDefaultConnectionConfig()
  {
    return this.configData.getDefaultConnectionConfig();
  }
  
  public int getDefaultMaxPerRoute()
  {
    return this.pool.getDefaultMaxPerRoute();
  }
  
  public SocketConfig getDefaultSocketConfig()
  {
    return this.configData.getDefaultSocketConfig();
  }
  
  public int getMaxPerRoute(HttpRoute paramHttpRoute)
  {
    return this.pool.getMaxPerRoute(paramHttpRoute);
  }
  
  public int getMaxTotal()
  {
    return this.pool.getMaxTotal();
  }
  
  public SocketConfig getSocketConfig(HttpHost paramHttpHost)
  {
    return this.configData.getSocketConfig(paramHttpHost);
  }
  
  public PoolStats getStats(HttpRoute paramHttpRoute)
  {
    return this.pool.getStats(paramHttpRoute);
  }
  
  public PoolStats getTotalStats()
  {
    return this.pool.getTotalStats();
  }
  
  protected HttpClientConnection leaseConnection(Future paramFuture, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool;
    ConnectionPoolTimeoutException localConnectionPoolTimeoutException;
    try
    {
      Object localObject1 = paramFuture.get(paramLong, paramTimeUnit);
      localObject1 = (CPoolEntry)localObject1;
      if (localObject1 != null)
      {
        bool = paramFuture.isCancelled();
        if (!bool) {}
      }
      else
      {
        localObject1 = new java/lang/InterruptedException;
        ((InterruptedException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      localConnectionPoolTimeoutException = new org/apache/http/conn/ConnectionPoolTimeoutException;
      localConnectionPoolTimeoutException.<init>("Timeout waiting for connection from pool");
      throw localConnectionPoolTimeoutException;
    }
    Object localObject2 = localConnectionPoolTimeoutException.getConnection();
    if (localObject2 != null) {
      bool = true;
    }
    for (;;)
    {
      Object localObject3 = "Pool entry with no connection";
      Asserts.check(bool, (String)localObject3);
      localObject2 = this.log;
      bool = ((Log)localObject2).isDebugEnabled();
      if (bool)
      {
        localObject3 = this.log;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject4 = "Connection leased: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = format(localConnectionPoolTimeoutException);
        localObject4 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = localConnectionPoolTimeoutException.getRoute();
        localObject2 = (HttpRoute)localObject2;
        localObject2 = formatStats((HttpRoute)localObject2);
        localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((Log)localObject3).debug(localObject2);
      }
      return CPoolProxy.newProxy(localConnectionPoolTimeoutException);
      bool = false;
      localObject2 = null;
    }
  }
  
  /* Error */
  public void releaseConnection(HttpClientConnection paramHttpClientConnection, Object paramObject, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: ldc_w 337
    //   9: astore 8
    //   11: aload_1
    //   12: aload 8
    //   14: invokestatic 220	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   17: pop
    //   18: aload_1
    //   19: monitorenter
    //   20: aload_1
    //   21: invokestatic 340	org/apache/http/impl/conn/CPoolProxy:detach	(Lorg/apache/http/HttpClientConnection;)Lorg/apache/http/impl/conn/CPoolEntry;
    //   24: astore 9
    //   26: aload 9
    //   28: ifnonnull +6 -> 34
    //   31: aload_1
    //   32: monitorexit
    //   33: return
    //   34: aload 9
    //   36: invokevirtual 231	org/apache/http/impl/conn/CPoolEntry:getConnection	()Ljava/lang/Object;
    //   39: astore 8
    //   41: aload 8
    //   43: checkcast 233	org/apache/http/conn/ManagedHttpClientConnection
    //   46: astore 8
    //   48: aload 8
    //   50: invokeinterface 343 1 0
    //   55: istore 10
    //   57: iload 10
    //   59: ifeq +224 -> 283
    //   62: aload 5
    //   64: ifnull +386 -> 450
    //   67: aload 9
    //   69: aload_2
    //   70: invokevirtual 346	org/apache/http/impl/conn/CPoolEntry:setState	(Ljava/lang/Object;)V
    //   73: aload 9
    //   75: lload_3
    //   76: aload 5
    //   78: invokevirtual 349	org/apache/http/impl/conn/CPoolEntry:updateExpiry	(JLjava/util/concurrent/TimeUnit;)V
    //   81: aload_0
    //   82: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   85: astore 11
    //   87: aload 11
    //   89: invokeinterface 201 1 0
    //   94: istore 10
    //   96: iload 10
    //   98: ifeq +185 -> 283
    //   101: lconst_0
    //   102: lstore 12
    //   104: dconst_0
    //   105: dstore 14
    //   107: lload_3
    //   108: lload 12
    //   110: lcmp
    //   111: istore 10
    //   113: iload 10
    //   115: ifle +343 -> 458
    //   118: new 90	java/lang/StringBuilder
    //   121: astore 11
    //   123: aload 11
    //   125: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   128: ldc_w 351
    //   131: astore 16
    //   133: aload 11
    //   135: aload 16
    //   137: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: astore 11
    //   142: aload 5
    //   144: lload_3
    //   145: invokevirtual 355	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   148: lstore 12
    //   150: lload 12
    //   152: l2d
    //   153: dstore 14
    //   155: ldc2_w 358
    //   158: dstore 17
    //   160: dload 14
    //   162: dload 17
    //   164: ddiv
    //   165: dstore 14
    //   167: aload 11
    //   169: dload 14
    //   171: invokevirtual 362	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   174: astore 11
    //   176: ldc_w 364
    //   179: astore 16
    //   181: aload 11
    //   183: aload 16
    //   185: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: astore 11
    //   190: aload 11
    //   192: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: astore 11
    //   197: aload_0
    //   198: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   201: astore 16
    //   203: new 90	java/lang/StringBuilder
    //   206: astore 19
    //   208: aload 19
    //   210: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   213: ldc_w 366
    //   216: astore 20
    //   218: aload 19
    //   220: aload 20
    //   222: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: astore 19
    //   227: aload_0
    //   228: aload 9
    //   230: invokespecial 325	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:format	(Lorg/apache/http/impl/conn/CPoolEntry;)Ljava/lang/String;
    //   233: astore 20
    //   235: aload 19
    //   237: aload 20
    //   239: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: astore 19
    //   244: ldc_w 368
    //   247: astore 20
    //   249: aload 19
    //   251: aload 20
    //   253: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: astore 19
    //   258: aload 19
    //   260: aload 11
    //   262: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: astore 11
    //   267: aload 11
    //   269: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: astore 11
    //   274: aload 16
    //   276: aload 11
    //   278: invokeinterface 194 2 0
    //   283: aload_0
    //   284: getfield 74	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:pool	Lorg/apache/http/impl/conn/CPool;
    //   287: astore 11
    //   289: aload 8
    //   291: invokeinterface 343 1 0
    //   296: istore 21
    //   298: iload 21
    //   300: ifeq +166 -> 466
    //   303: aload 9
    //   305: invokevirtual 371	org/apache/http/impl/conn/CPoolEntry:isRouteComplete	()Z
    //   308: istore 21
    //   310: iload 21
    //   312: ifeq +154 -> 466
    //   315: aload 11
    //   317: aload 9
    //   319: iload 6
    //   321: invokevirtual 375	org/apache/http/impl/conn/CPool:release	(Lorg/apache/http/pool/PoolEntry;Z)V
    //   324: aload_0
    //   325: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   328: astore 8
    //   330: aload 8
    //   332: invokeinterface 201 1 0
    //   337: istore 21
    //   339: iload 21
    //   341: ifeq +97 -> 438
    //   344: aload_0
    //   345: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   348: astore 11
    //   350: new 90	java/lang/StringBuilder
    //   353: astore 8
    //   355: aload 8
    //   357: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   360: ldc_w 377
    //   363: astore 22
    //   365: aload 8
    //   367: aload 22
    //   369: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: astore 8
    //   374: aload_0
    //   375: aload 9
    //   377: invokespecial 325	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:format	(Lorg/apache/http/impl/conn/CPoolEntry;)Ljava/lang/String;
    //   380: astore 22
    //   382: aload 8
    //   384: aload 22
    //   386: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: astore 22
    //   391: aload 9
    //   393: invokevirtual 119	org/apache/http/impl/conn/CPoolEntry:getRoute	()Ljava/lang/Object;
    //   396: astore 8
    //   398: aload 8
    //   400: checkcast 235	org/apache/http/conn/routing/HttpRoute
    //   403: astore 8
    //   405: aload_0
    //   406: aload 8
    //   408: invokespecial 329	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:formatStats	(Lorg/apache/http/conn/routing/HttpRoute;)Ljava/lang/String;
    //   411: astore 8
    //   413: aload 22
    //   415: aload 8
    //   417: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: astore 8
    //   422: aload 8
    //   424: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: astore 8
    //   429: aload 11
    //   431: aload 8
    //   433: invokeinterface 194 2 0
    //   438: aload_1
    //   439: monitorexit
    //   440: goto -407 -> 33
    //   443: astore 8
    //   445: aload_1
    //   446: monitorexit
    //   447: aload 8
    //   449: athrow
    //   450: getstatic 40	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   453: astore 5
    //   455: goto -388 -> 67
    //   458: ldc_w 379
    //   461: astore 11
    //   463: goto -266 -> 197
    //   466: iconst_0
    //   467: istore 6
    //   469: aconst_null
    //   470: astore 22
    //   472: goto -157 -> 315
    //   475: astore 11
    //   477: aload_0
    //   478: getfield 74	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:pool	Lorg/apache/http/impl/conn/CPool;
    //   481: astore 16
    //   483: aload 8
    //   485: invokeinterface 343 1 0
    //   490: istore 21
    //   492: iload 21
    //   494: ifeq +145 -> 639
    //   497: aload 9
    //   499: invokevirtual 371	org/apache/http/impl/conn/CPoolEntry:isRouteComplete	()Z
    //   502: istore 21
    //   504: iload 21
    //   506: ifeq +133 -> 639
    //   509: iload 6
    //   511: istore 21
    //   513: aload 16
    //   515: aload 9
    //   517: iload 21
    //   519: invokevirtual 375	org/apache/http/impl/conn/CPool:release	(Lorg/apache/http/pool/PoolEntry;Z)V
    //   522: aload_0
    //   523: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   526: astore 8
    //   528: aload 8
    //   530: invokeinterface 201 1 0
    //   535: istore 21
    //   537: iload 21
    //   539: ifeq +97 -> 636
    //   542: aload_0
    //   543: getfield 55	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   546: astore 22
    //   548: new 90	java/lang/StringBuilder
    //   551: astore 8
    //   553: aload 8
    //   555: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   558: ldc_w 377
    //   561: astore 7
    //   563: aload 8
    //   565: aload 7
    //   567: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: astore 8
    //   572: aload_0
    //   573: aload 9
    //   575: invokespecial 325	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:format	(Lorg/apache/http/impl/conn/CPoolEntry;)Ljava/lang/String;
    //   578: astore 7
    //   580: aload 8
    //   582: aload 7
    //   584: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: astore 7
    //   589: aload 9
    //   591: invokevirtual 119	org/apache/http/impl/conn/CPoolEntry:getRoute	()Ljava/lang/Object;
    //   594: astore 8
    //   596: aload 8
    //   598: checkcast 235	org/apache/http/conn/routing/HttpRoute
    //   601: astore 8
    //   603: aload_0
    //   604: aload 8
    //   606: invokespecial 329	org/apache/http/impl/conn/PoolingHttpClientConnectionManager:formatStats	(Lorg/apache/http/conn/routing/HttpRoute;)Ljava/lang/String;
    //   609: astore 8
    //   611: aload 7
    //   613: aload 8
    //   615: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: astore 8
    //   620: aload 8
    //   622: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   625: astore 8
    //   627: aload 22
    //   629: aload 8
    //   631: invokeinterface 194 2 0
    //   636: aload 11
    //   638: athrow
    //   639: iconst_0
    //   640: istore 21
    //   642: aconst_null
    //   643: astore 8
    //   645: goto -132 -> 513
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	648	0	this	PoolingHttpClientConnectionManager
    //   0	648	1	paramHttpClientConnection	HttpClientConnection
    //   0	648	2	paramObject	Object
    //   0	648	3	paramLong	long
    //   0	648	5	paramTimeUnit	TimeUnit
    //   1	509	6	bool1	boolean
    //   4	608	7	localObject1	Object
    //   9	423	8	localObject2	Object
    //   443	41	8	localObject3	Object
    //   526	118	8	localObject4	Object
    //   24	566	9	localCPoolEntry	CPoolEntry
    //   55	59	10	bool2	boolean
    //   85	377	11	localObject5	Object
    //   475	162	11	localObject6	Object
    //   102	49	12	l	long
    //   105	65	14	d1	double
    //   131	383	16	localObject7	Object
    //   158	5	17	d2	double
    //   206	53	19	localStringBuilder	StringBuilder
    //   216	36	20	str	String
    //   296	345	21	bool3	boolean
    //   363	265	22	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   20	24	443	finally
    //   31	33	443	finally
    //   34	39	443	finally
    //   41	46	443	finally
    //   283	287	443	finally
    //   289	296	443	finally
    //   303	308	443	finally
    //   319	324	443	finally
    //   324	328	443	finally
    //   330	337	443	finally
    //   344	348	443	finally
    //   350	353	443	finally
    //   355	360	443	finally
    //   367	372	443	finally
    //   375	380	443	finally
    //   384	389	443	finally
    //   391	396	443	finally
    //   398	403	443	finally
    //   406	411	443	finally
    //   415	420	443	finally
    //   422	427	443	finally
    //   431	438	443	finally
    //   438	440	443	finally
    //   445	447	443	finally
    //   477	481	443	finally
    //   483	490	443	finally
    //   497	502	443	finally
    //   517	522	443	finally
    //   522	526	443	finally
    //   528	535	443	finally
    //   542	546	443	finally
    //   548	551	443	finally
    //   553	558	443	finally
    //   565	570	443	finally
    //   573	578	443	finally
    //   582	587	443	finally
    //   589	594	443	finally
    //   596	601	443	finally
    //   604	609	443	finally
    //   613	618	443	finally
    //   620	625	443	finally
    //   629	636	443	finally
    //   636	639	443	finally
    //   48	55	475	finally
    //   69	73	475	finally
    //   76	81	475	finally
    //   81	85	475	finally
    //   87	94	475	finally
    //   118	121	475	finally
    //   123	128	475	finally
    //   135	140	475	finally
    //   144	148	475	finally
    //   169	174	475	finally
    //   183	188	475	finally
    //   190	195	475	finally
    //   197	201	475	finally
    //   203	206	475	finally
    //   208	213	475	finally
    //   220	225	475	finally
    //   228	233	475	finally
    //   237	242	475	finally
    //   251	256	475	finally
    //   260	265	475	finally
    //   267	272	475	finally
    //   276	283	475	finally
    //   450	453	475	finally
  }
  
  public ConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Object localObject1 = this.log;
    boolean bool = ((Log)localObject1).isDebugEnabled();
    if (bool)
    {
      localObject1 = this.log;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Connection request: ");
      String str = format(paramHttpRoute, paramObject);
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = formatStats(paramHttpRoute);
      localObject2 = str;
      ((Log)localObject1).debug(localObject2);
    }
    localObject1 = this.pool.lease(paramHttpRoute, paramObject, null);
    Object localObject2 = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager$1;
    ((PoolingHttpClientConnectionManager.1)localObject2).<init>(this, (Future)localObject1);
    return (ConnectionRequest)localObject2;
  }
  
  public void routeComplete(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpClientConnection, "Managed Connection");
    Object localObject1 = "HTTP route";
    Args.notNull(paramHttpRoute, (String)localObject1);
    try
    {
      localObject1 = CPoolProxy.getPoolEntry(paramHttpClientConnection);
      ((CPoolEntry)localObject1).markRouteComplete();
      return;
    }
    finally {}
  }
  
  public void setConnectionConfig(HttpHost paramHttpHost, ConnectionConfig paramConnectionConfig)
  {
    this.configData.setConnectionConfig(paramHttpHost, paramConnectionConfig);
  }
  
  public void setDefaultConnectionConfig(ConnectionConfig paramConnectionConfig)
  {
    this.configData.setDefaultConnectionConfig(paramConnectionConfig);
  }
  
  public void setDefaultMaxPerRoute(int paramInt)
  {
    this.pool.setDefaultMaxPerRoute(paramInt);
  }
  
  public void setDefaultSocketConfig(SocketConfig paramSocketConfig)
  {
    this.configData.setDefaultSocketConfig(paramSocketConfig);
  }
  
  public void setMaxPerRoute(HttpRoute paramHttpRoute, int paramInt)
  {
    this.pool.setMaxPerRoute(paramHttpRoute, paramInt);
  }
  
  public void setMaxTotal(int paramInt)
  {
    this.pool.setMaxTotal(paramInt);
  }
  
  public void setSocketConfig(HttpHost paramHttpHost, SocketConfig paramSocketConfig)
  {
    this.configData.setSocketConfig(paramHttpHost, paramSocketConfig);
  }
  
  public void shutdown()
  {
    Object localObject1 = this.isShutDown;
    localObject2 = null;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject1).compareAndSet(false, bool1);
    if (bool2)
    {
      localObject1 = this.log;
      localObject2 = "Connection manager is shutting down";
      ((Log)localObject1).debug(localObject2);
    }
    try
    {
      localObject1 = this.pool;
      ((CPool)localObject1).shutdown();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject2 = this.log;
        String str = "I/O exception shutting down connection manager";
        ((Log)localObject2).debug(str, localIOException);
      }
    }
    localObject1 = this.log;
    localObject2 = "Connection manager shut down";
    ((Log)localObject1).debug(localObject2);
  }
  
  public void upgrade(HttpClientConnection paramHttpClientConnection, HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpClientConnection, "Managed Connection");
    Object localObject1 = "HTTP route";
    Args.notNull(paramHttpRoute, (String)localObject1);
    try
    {
      localObject1 = CPoolProxy.getPoolEntry(paramHttpClientConnection);
      localObject1 = ((CPoolEntry)localObject1).getConnection();
      localObject1 = (ManagedHttpClientConnection)localObject1;
      HttpClientConnectionOperator localHttpClientConnectionOperator = this.connectionOperator;
      HttpHost localHttpHost = paramHttpRoute.getTargetHost();
      localHttpClientConnectionOperator.upgrade((ManagedHttpClientConnection)localObject1, localHttpHost, paramHttpContext);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\PoolingHttpClientConnectionManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */