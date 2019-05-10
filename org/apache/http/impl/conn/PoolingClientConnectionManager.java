package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class PoolingClientConnectionManager
  implements ClientConnectionManager, ConnPoolControl
{
  private final DnsResolver dnsResolver;
  private final Log log;
  private final ClientConnectionOperator operator;
  private final HttpConnPool pool;
  private final SchemeRegistry schemeRegistry;
  
  public PoolingClientConnectionManager()
  {
    this(localSchemeRegistry);
  }
  
  public PoolingClientConnectionManager(SchemeRegistry paramSchemeRegistry)
  {
    this(paramSchemeRegistry, -1, localTimeUnit);
  }
  
  public PoolingClientConnectionManager(SchemeRegistry paramSchemeRegistry, long paramLong, TimeUnit paramTimeUnit)
  {
    this(paramSchemeRegistry, paramLong, paramTimeUnit, localSystemDefaultDnsResolver);
  }
  
  public PoolingClientConnectionManager(SchemeRegistry paramSchemeRegistry, long paramLong, TimeUnit paramTimeUnit, DnsResolver paramDnsResolver)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    Args.notNull(paramDnsResolver, "DNS resolver");
    this.schemeRegistry = paramSchemeRegistry;
    this.dnsResolver = paramDnsResolver;
    localObject = createConnectionOperator(paramSchemeRegistry);
    this.operator = ((ClientConnectionOperator)localObject);
    HttpConnPool localHttpConnPool = new org/apache/http/impl/conn/HttpConnPool;
    Log localLog = this.log;
    ClientConnectionOperator localClientConnectionOperator = this.operator;
    localHttpConnPool.<init>(localLog, localClientConnectionOperator, 2, 20, paramLong, paramTimeUnit);
    this.pool = localHttpConnPool;
  }
  
  public PoolingClientConnectionManager(SchemeRegistry paramSchemeRegistry, DnsResolver paramDnsResolver)
  {
    this(paramSchemeRegistry, -1, localTimeUnit, paramDnsResolver);
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
  
  private String format(HttpPoolEntry paramHttpPoolEntry)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = localStringBuilder.append("[id: ");
    Object localObject2 = paramHttpPoolEntry.getId();
    ((StringBuilder)localObject1).append((String)localObject2).append("]");
    localObject1 = localStringBuilder.append("[route: ");
    localObject2 = paramHttpPoolEntry.getRoute();
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = "]";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = paramHttpPoolEntry.getState();
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
  
  protected ClientConnectionOperator createConnectionOperator(SchemeRegistry paramSchemeRegistry)
  {
    DefaultClientConnectionOperator localDefaultClientConnectionOperator = new org/apache/http/impl/conn/DefaultClientConnectionOperator;
    DnsResolver localDnsResolver = this.dnsResolver;
    localDefaultClientConnectionOperator.<init>(paramSchemeRegistry, localDnsResolver);
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
  
  public int getDefaultMaxPerRoute()
  {
    return this.pool.getDefaultMaxPerRoute();
  }
  
  public int getMaxPerRoute(HttpRoute paramHttpRoute)
  {
    return this.pool.getMaxPerRoute(paramHttpRoute);
  }
  
  public int getMaxTotal()
  {
    return this.pool.getMaxTotal();
  }
  
  public SchemeRegistry getSchemeRegistry()
  {
    return this.schemeRegistry;
  }
  
  public PoolStats getStats(HttpRoute paramHttpRoute)
  {
    return this.pool.getStats(paramHttpRoute);
  }
  
  public PoolStats getTotalStats()
  {
    return this.pool.getTotalStats();
  }
  
  ManagedClientConnection leaseConnection(Future paramFuture, long paramLong, TimeUnit paramTimeUnit)
  {
    for (;;)
    {
      Object localObject3;
      try
      {
        Object localObject1 = paramFuture.get(paramLong, paramTimeUnit);
        localObject1 = (HttpPoolEntry)localObject1;
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
      catch (ExecutionException localExecutionException)
      {
        boolean bool;
        localObject3 = localExecutionException.getCause();
        if (localObject3 == null)
        {
          this.log.error("Unexpected exception leasing connection from pool", localExecutionException);
          InterruptedException localInterruptedException = new java/lang/InterruptedException;
          localInterruptedException.<init>();
          throw localInterruptedException;
          localObject3 = localInterruptedException.getConnection();
          if (localObject3 != null)
          {
            bool = true;
            Object localObject4 = "Pool entry with no connection";
            Asserts.check(bool, (String)localObject4);
            localObject3 = this.log;
            bool = ((Log)localObject3).isDebugEnabled();
            if (bool)
            {
              localObject4 = this.log;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              Object localObject5 = "Connection leased: ";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject5 = format(localInterruptedException);
              localObject5 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject3 = localInterruptedException.getRoute();
              localObject3 = (HttpRoute)localObject3;
              localObject3 = formatStats((HttpRoute)localObject3);
              localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
              localObject3 = ((StringBuilder)localObject3).toString();
              ((Log)localObject4).debug(localObject3);
            }
            localObject3 = new org/apache/http/impl/conn/ManagedClientConnectionImpl;
            localObject4 = this.operator;
            ((ManagedClientConnectionImpl)localObject3).<init>(this, (ClientConnectionOperator)localObject4, localInterruptedException);
            return (ManagedClientConnection)localObject3;
          }
          bool = false;
          localObject3 = null;
          continue;
        }
      }
      catch (TimeoutException localTimeoutException)
      {
        localObject2 = new org/apache/http/conn/ConnectionPoolTimeoutException;
        ((ConnectionPoolTimeoutException)localObject2).<init>("Timeout waiting for connection from pool");
        throw ((Throwable)localObject2);
      }
      Object localObject2 = localObject3;
    }
  }
  
  /* Error */
  public void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 257
    //   4: istore 5
    //   6: ldc_w 271
    //   9: astore 6
    //   11: iload 5
    //   13: aload 6
    //   15: invokestatic 272	org/apache/http/util/Args:check	(ZLjava/lang/String;)V
    //   18: aload_1
    //   19: checkcast 257	org/apache/http/impl/conn/ManagedClientConnectionImpl
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 276	org/apache/http/impl/conn/ManagedClientConnectionImpl:getManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   27: astore 7
    //   29: aload 7
    //   31: aload_0
    //   32: if_acmpne +34 -> 66
    //   35: iconst_1
    //   36: istore 5
    //   38: ldc_w 278
    //   41: astore 6
    //   43: iload 5
    //   45: aload 6
    //   47: invokestatic 245	org/apache/http/util/Asserts:check	(ZLjava/lang/String;)V
    //   50: aload_1
    //   51: monitorenter
    //   52: aload_1
    //   53: invokevirtual 282	org/apache/http/impl/conn/ManagedClientConnectionImpl:detach	()Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   56: astore 6
    //   58: aload 6
    //   60: ifnonnull +15 -> 75
    //   63: aload_1
    //   64: monitorexit
    //   65: return
    //   66: iconst_0
    //   67: istore 5
    //   69: aconst_null
    //   70: astore 7
    //   72: goto -34 -> 38
    //   75: aload_1
    //   76: invokevirtual 285	org/apache/http/impl/conn/ManagedClientConnectionImpl:isOpen	()Z
    //   79: istore 5
    //   81: iload 5
    //   83: ifeq +18 -> 101
    //   86: aload_1
    //   87: invokevirtual 288	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   90: istore 5
    //   92: iload 5
    //   94: ifne +7 -> 101
    //   97: aload_1
    //   98: invokevirtual 289	org/apache/http/impl/conn/ManagedClientConnectionImpl:shutdown	()V
    //   101: aload_1
    //   102: invokevirtual 288	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   105: istore 5
    //   107: iload 5
    //   109: ifeq +201 -> 310
    //   112: aload 4
    //   114: ifnull +416 -> 530
    //   117: aload 4
    //   119: astore 7
    //   121: aload 6
    //   123: lload_2
    //   124: aload 7
    //   126: invokevirtual 292	org/apache/http/impl/conn/HttpPoolEntry:updateExpiry	(JLjava/util/concurrent/TimeUnit;)V
    //   129: aload_0
    //   130: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   133: astore 7
    //   135: aload 7
    //   137: invokeinterface 169 1 0
    //   142: istore 5
    //   144: iload 5
    //   146: ifeq +164 -> 310
    //   149: lconst_0
    //   150: lstore 8
    //   152: lload_2
    //   153: lload 8
    //   155: lcmp
    //   156: istore 5
    //   158: iload 5
    //   160: ifle +378 -> 538
    //   163: new 89	java/lang/StringBuilder
    //   166: astore 7
    //   168: aload 7
    //   170: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   173: ldc_w 294
    //   176: astore 10
    //   178: aload 7
    //   180: aload 10
    //   182: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: astore 7
    //   187: aload 7
    //   189: lload_2
    //   190: invokevirtual 174	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   193: astore 7
    //   195: ldc -80
    //   197: astore 10
    //   199: aload 7
    //   201: aload 10
    //   203: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: astore 7
    //   208: aload 7
    //   210: aload 4
    //   212: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   215: astore 7
    //   217: aload 7
    //   219: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: astore 7
    //   224: aload_0
    //   225: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   228: astore 10
    //   230: new 89	java/lang/StringBuilder
    //   233: astore 11
    //   235: aload 11
    //   237: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   240: ldc_w 296
    //   243: astore 12
    //   245: aload 11
    //   247: aload 12
    //   249: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: astore 11
    //   254: aload_0
    //   255: aload 6
    //   257: invokespecial 251	org/apache/http/impl/conn/PoolingClientConnectionManager:format	(Lorg/apache/http/impl/conn/HttpPoolEntry;)Ljava/lang/String;
    //   260: astore 12
    //   262: aload 11
    //   264: aload 12
    //   266: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: astore 11
    //   271: ldc_w 298
    //   274: astore 12
    //   276: aload 11
    //   278: aload 12
    //   280: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: astore 11
    //   285: aload 11
    //   287: aload 7
    //   289: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: astore 7
    //   294: aload 7
    //   296: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: astore 7
    //   301: aload 10
    //   303: aload 7
    //   305: invokeinterface 162 2 0
    //   310: aload_0
    //   311: getfield 87	org/apache/http/impl/conn/PoolingClientConnectionManager:pool	Lorg/apache/http/impl/conn/HttpConnPool;
    //   314: astore 7
    //   316: aload_1
    //   317: invokevirtual 288	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   320: istore 13
    //   322: aload 7
    //   324: aload 6
    //   326: iload 13
    //   328: invokevirtual 302	org/apache/http/impl/conn/HttpConnPool:release	(Lorg/apache/http/pool/PoolEntry;Z)V
    //   331: aload_0
    //   332: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   335: astore 7
    //   337: aload 7
    //   339: invokeinterface 169 1 0
    //   344: istore 5
    //   346: iload 5
    //   348: ifeq +97 -> 445
    //   351: aload_0
    //   352: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   355: astore 10
    //   357: new 89	java/lang/StringBuilder
    //   360: astore 7
    //   362: aload 7
    //   364: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   367: ldc_w 304
    //   370: astore 11
    //   372: aload 7
    //   374: aload 11
    //   376: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: astore 7
    //   381: aload_0
    //   382: aload 6
    //   384: invokespecial 251	org/apache/http/impl/conn/PoolingClientConnectionManager:format	(Lorg/apache/http/impl/conn/HttpPoolEntry;)Ljava/lang/String;
    //   387: astore 11
    //   389: aload 7
    //   391: aload 11
    //   393: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: astore 11
    //   398: aload 6
    //   400: invokevirtual 118	org/apache/http/impl/conn/HttpPoolEntry:getRoute	()Ljava/lang/Object;
    //   403: astore 7
    //   405: aload 7
    //   407: checkcast 196	org/apache/http/conn/routing/HttpRoute
    //   410: astore 7
    //   412: aload_0
    //   413: aload 7
    //   415: invokespecial 255	org/apache/http/impl/conn/PoolingClientConnectionManager:formatStats	(Lorg/apache/http/conn/routing/HttpRoute;)Ljava/lang/String;
    //   418: astore 7
    //   420: aload 11
    //   422: aload 7
    //   424: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: astore 7
    //   429: aload 7
    //   431: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   434: astore 7
    //   436: aload 10
    //   438: aload 7
    //   440: invokeinterface 162 2 0
    //   445: aload_1
    //   446: monitorexit
    //   447: goto -382 -> 65
    //   450: astore 7
    //   452: aload_1
    //   453: monitorexit
    //   454: aload 7
    //   456: athrow
    //   457: astore 7
    //   459: aload_0
    //   460: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   463: astore 10
    //   465: aload 10
    //   467: invokeinterface 169 1 0
    //   472: istore 13
    //   474: iload 13
    //   476: ifeq -375 -> 101
    //   479: aload_0
    //   480: getfield 58	org/apache/http/impl/conn/PoolingClientConnectionManager:log	Lorg/apache/commons/logging/Log;
    //   483: astore 10
    //   485: ldc_w 306
    //   488: astore 11
    //   490: aload 10
    //   492: aload 11
    //   494: aload 7
    //   496: invokeinterface 308 3 0
    //   501: goto -400 -> 101
    //   504: astore 7
    //   506: aload_0
    //   507: getfield 87	org/apache/http/impl/conn/PoolingClientConnectionManager:pool	Lorg/apache/http/impl/conn/HttpConnPool;
    //   510: astore 10
    //   512: aload_1
    //   513: invokevirtual 288	org/apache/http/impl/conn/ManagedClientConnectionImpl:isMarkedReusable	()Z
    //   516: istore 14
    //   518: aload 10
    //   520: aload 6
    //   522: iload 14
    //   524: invokevirtual 302	org/apache/http/impl/conn/HttpConnPool:release	(Lorg/apache/http/pool/PoolEntry;Z)V
    //   527: aload 7
    //   529: athrow
    //   530: getstatic 34	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   533: astore 7
    //   535: goto -414 -> 121
    //   538: ldc_w 310
    //   541: astore 7
    //   543: goto -319 -> 224
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	546	0	this	PoolingClientConnectionManager
    //   0	546	1	paramManagedClientConnection	ManagedClientConnection
    //   0	546	2	paramLong	long
    //   0	546	4	paramTimeUnit	TimeUnit
    //   4	343	5	bool1	boolean
    //   9	512	6	localObject1	Object
    //   27	412	7	localObject2	Object
    //   450	5	7	localObject3	Object
    //   457	38	7	localIOException	IOException
    //   504	24	7	localObject4	Object
    //   533	9	7	localObject5	Object
    //   150	4	8	l	long
    //   176	343	10	localObject6	Object
    //   233	260	11	localObject7	Object
    //   243	36	12	str	String
    //   320	155	13	bool2	boolean
    //   516	7	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   52	56	450	finally
    //   63	65	450	finally
    //   310	314	450	finally
    //   316	320	450	finally
    //   326	331	450	finally
    //   331	335	450	finally
    //   337	344	450	finally
    //   351	355	450	finally
    //   357	360	450	finally
    //   362	367	450	finally
    //   374	379	450	finally
    //   382	387	450	finally
    //   391	396	450	finally
    //   398	403	450	finally
    //   405	410	450	finally
    //   413	418	450	finally
    //   422	427	450	finally
    //   429	434	450	finally
    //   438	445	450	finally
    //   445	447	450	finally
    //   452	454	450	finally
    //   506	510	450	finally
    //   512	516	450	finally
    //   522	527	450	finally
    //   527	530	450	finally
    //   97	101	457	java/io/IOException
    //   75	79	504	finally
    //   86	90	504	finally
    //   97	101	504	finally
    //   101	105	504	finally
    //   124	129	504	finally
    //   129	133	504	finally
    //   135	142	504	finally
    //   163	166	504	finally
    //   168	173	504	finally
    //   180	185	504	finally
    //   189	193	504	finally
    //   201	206	504	finally
    //   210	215	504	finally
    //   217	222	504	finally
    //   224	228	504	finally
    //   230	233	504	finally
    //   235	240	504	finally
    //   247	252	504	finally
    //   255	260	504	finally
    //   264	269	504	finally
    //   278	283	504	finally
    //   287	292	504	finally
    //   294	299	504	finally
    //   303	310	504	finally
    //   459	463	504	finally
    //   465	472	504	finally
    //   479	483	504	finally
    //   494	501	504	finally
    //   530	533	504	finally
  }
  
  public ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
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
    localObject1 = this.pool.lease(paramHttpRoute, paramObject);
    Object localObject2 = new org/apache/http/impl/conn/PoolingClientConnectionManager$1;
    ((PoolingClientConnectionManager.1)localObject2).<init>(this, (Future)localObject1);
    return (ClientConnectionRequest)localObject2;
  }
  
  public void setDefaultMaxPerRoute(int paramInt)
  {
    this.pool.setDefaultMaxPerRoute(paramInt);
  }
  
  public void setMaxPerRoute(HttpRoute paramHttpRoute, int paramInt)
  {
    this.pool.setMaxPerRoute(paramHttpRoute, paramInt);
  }
  
  public void setMaxTotal(int paramInt)
  {
    this.pool.setMaxTotal(paramInt);
  }
  
  public void shutdown()
  {
    Object localObject1 = this.log;
    localObject2 = "Connection manager is shutting down";
    ((Log)localObject1).debug(localObject2);
    try
    {
      localObject1 = this.pool;
      ((HttpConnPool)localObject1).shutdown();
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
    this.log.debug("Connection manager shut down");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\PoolingClientConnectionManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */