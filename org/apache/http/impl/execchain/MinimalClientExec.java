package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;

public class MinimalClientExec
  implements ClientExecChain
{
  private final HttpClientConnectionManager connManager;
  private final HttpProcessor httpProcessor;
  private final ConnectionKeepAliveStrategy keepAliveStrategy;
  private final Log log;
  private final HttpRequestExecutor requestExecutor;
  private final ConnectionReuseStrategy reuseStrategy;
  
  public MinimalClientExec(HttpRequestExecutor paramHttpRequestExecutor, HttpClientConnectionManager paramHttpClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy)
  {
    Object localObject1 = LogFactory.getLog(getClass());
    this.log = ((Log)localObject1);
    Args.notNull(paramHttpRequestExecutor, "HTTP request executor");
    Args.notNull(paramHttpClientConnectionManager, "Client connection manager");
    Args.notNull(paramConnectionReuseStrategy, "Connection reuse strategy");
    Args.notNull(paramConnectionKeepAliveStrategy, "Connection keep alive strategy");
    localObject1 = new org/apache/http/protocol/ImmutableHttpProcessor;
    HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = new HttpRequestInterceptor[4];
    Object localObject2 = new org/apache/http/protocol/RequestContent;
    ((RequestContent)localObject2).<init>();
    arrayOfHttpRequestInterceptor[0] = localObject2;
    localObject2 = new org/apache/http/protocol/RequestTargetHost;
    ((RequestTargetHost)localObject2).<init>();
    arrayOfHttpRequestInterceptor[1] = localObject2;
    localObject2 = new org/apache/http/client/protocol/RequestClientConnControl;
    ((RequestClientConnControl)localObject2).<init>();
    arrayOfHttpRequestInterceptor[2] = localObject2;
    localObject2 = new org/apache/http/protocol/RequestUserAgent;
    Class localClass = getClass();
    String str = VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", localClass);
    ((RequestUserAgent)localObject2).<init>(str);
    arrayOfHttpRequestInterceptor[3] = localObject2;
    ((ImmutableHttpProcessor)localObject1).<init>(arrayOfHttpRequestInterceptor);
    this.httpProcessor = ((HttpProcessor)localObject1);
    this.requestExecutor = paramHttpRequestExecutor;
    this.connManager = paramHttpClientConnectionManager;
    this.reuseStrategy = paramConnectionReuseStrategy;
    this.keepAliveStrategy = paramConnectionKeepAliveStrategy;
  }
  
  /* Error */
  static void rewriteRequestURI(org.apache.http.client.methods.HttpRequestWrapper paramHttpRequestWrapper, org.apache.http.conn.routing.HttpRoute paramHttpRoute)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 99	org/apache/http/client/methods/HttpRequestWrapper:getURI	()Ljava/net/URI;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +33 -> 39
    //   9: aload_2
    //   10: invokevirtual 105	java/net/URI:isAbsolute	()Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +25 -> 40
    //   18: iconst_0
    //   19: istore_3
    //   20: aconst_null
    //   21: astore 4
    //   23: iconst_1
    //   24: istore 5
    //   26: aload_2
    //   27: aconst_null
    //   28: iload 5
    //   30: invokestatic 111	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   33: astore_2
    //   34: aload_0
    //   35: aload_2
    //   36: invokevirtual 115	org/apache/http/client/methods/HttpRequestWrapper:setURI	(Ljava/net/URI;)V
    //   39: return
    //   40: aload_2
    //   41: invokestatic 118	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;)Ljava/net/URI;
    //   44: astore_2
    //   45: goto -11 -> 34
    //   48: astore_2
    //   49: new 120	org/apache/http/ProtocolException
    //   52: astore 4
    //   54: new 122	java/lang/StringBuilder
    //   57: astore 6
    //   59: aload 6
    //   61: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   64: aload 6
    //   66: ldc 125
    //   68: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: astore 6
    //   73: aload_0
    //   74: invokevirtual 133	org/apache/http/client/methods/HttpRequestWrapper:getRequestLine	()Lorg/apache/http/RequestLine;
    //   77: invokeinterface 139 1 0
    //   82: astore 7
    //   84: aload 6
    //   86: aload 7
    //   88: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: astore 6
    //   96: aload 4
    //   98: aload 6
    //   100: aload_2
    //   101: invokespecial 145	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   104: aload 4
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramHttpRequestWrapper	org.apache.http.client.methods.HttpRequestWrapper
    //   0	107	1	paramHttpRoute	org.apache.http.conn.routing.HttpRoute
    //   4	41	2	localURI	java.net.URI
    //   48	53	2	localURISyntaxException	java.net.URISyntaxException
    //   13	7	3	bool1	boolean
    //   21	84	4	localProtocolException	org.apache.http.ProtocolException
    //   24	5	5	bool2	boolean
    //   57	42	6	localObject	Object
    //   82	5	7	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	48	java/net/URISyntaxException
    //   9	13	48	java/net/URISyntaxException
    //   28	33	48	java/net/URISyntaxException
    //   35	39	48	java/net/URISyntaxException
    //   40	44	48	java/net/URISyntaxException
  }
  
  /* Error */
  public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute paramHttpRoute, org.apache.http.client.methods.HttpRequestWrapper paramHttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext paramHttpClientContext, org.apache.http.client.methods.HttpExecutionAware paramHttpExecutionAware)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: ldc -107
    //   6: invokestatic 42	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: ldc -105
    //   13: invokestatic 42	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_3
    //   18: ldc -103
    //   20: invokestatic 42	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   23: pop
    //   24: aload_2
    //   25: aload_1
    //   26: invokestatic 157	org/apache/http/impl/execchain/MinimalClientExec:rewriteRequestURI	(Lorg/apache/http/client/methods/HttpRequestWrapper;Lorg/apache/http/conn/routing/HttpRoute;)V
    //   29: aload_0
    //   30: getfield 89	org/apache/http/impl/execchain/MinimalClientExec:connManager	Lorg/apache/http/conn/HttpClientConnectionManager;
    //   33: aload_1
    //   34: aconst_null
    //   35: invokeinterface 163 3 0
    //   40: astore 6
    //   42: aload 4
    //   44: ifnull +49 -> 93
    //   47: aload 4
    //   49: invokeinterface 168 1 0
    //   54: istore 7
    //   56: iload 7
    //   58: ifeq +26 -> 84
    //   61: aload 6
    //   63: invokeinterface 173 1 0
    //   68: pop
    //   69: new 175	org/apache/http/impl/execchain/RequestAbortedException
    //   72: astore 6
    //   74: aload 6
    //   76: ldc -79
    //   78: invokespecial 178	org/apache/http/impl/execchain/RequestAbortedException:<init>	(Ljava/lang/String;)V
    //   81: aload 6
    //   83: athrow
    //   84: aload 4
    //   86: aload 6
    //   88: invokeinterface 182 2 0
    //   93: aload_3
    //   94: invokevirtual 188	org/apache/http/client/protocol/HttpClientContext:getRequestConfig	()Lorg/apache/http/client/config/RequestConfig;
    //   97: astore 8
    //   99: aload 8
    //   101: invokevirtual 194	org/apache/http/client/config/RequestConfig:getConnectionRequestTimeout	()I
    //   104: istore 7
    //   106: iload 7
    //   108: ifle +122 -> 230
    //   111: iload 7
    //   113: i2l
    //   114: lstore 9
    //   116: getstatic 200	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   119: astore 11
    //   121: aload 6
    //   123: lload 9
    //   125: aload 11
    //   127: invokeinterface 204 4 0
    //   132: astore 12
    //   134: new 206	org/apache/http/impl/execchain/ConnectionHolder
    //   137: astore 13
    //   139: aload_0
    //   140: getfield 34	org/apache/http/impl/execchain/MinimalClientExec:log	Lorg/apache/commons/logging/Log;
    //   143: astore 6
    //   145: aload_0
    //   146: getfield 89	org/apache/http/impl/execchain/MinimalClientExec:connManager	Lorg/apache/http/conn/HttpClientConnectionManager;
    //   149: astore 11
    //   151: aload 13
    //   153: aload 6
    //   155: aload 11
    //   157: aload 12
    //   159: invokespecial 209	org/apache/http/impl/execchain/ConnectionHolder:<init>	(Lorg/apache/commons/logging/Log;Lorg/apache/http/conn/HttpClientConnectionManager;Lorg/apache/http/HttpClientConnection;)V
    //   162: aload 4
    //   164: ifnull +137 -> 301
    //   167: aload 4
    //   169: invokeinterface 168 1 0
    //   174: istore 14
    //   176: iload 14
    //   178: ifeq +114 -> 292
    //   181: aload 13
    //   183: invokevirtual 212	org/apache/http/impl/execchain/ConnectionHolder:close	()V
    //   186: new 175	org/apache/http/impl/execchain/RequestAbortedException
    //   189: astore 6
    //   191: ldc -79
    //   193: astore 5
    //   195: aload 6
    //   197: aload 5
    //   199: invokespecial 178	org/apache/http/impl/execchain/RequestAbortedException:<init>	(Ljava/lang/String;)V
    //   202: aload 6
    //   204: athrow
    //   205: astore 6
    //   207: new 214	java/io/InterruptedIOException
    //   210: astore 5
    //   212: aload 5
    //   214: ldc -40
    //   216: invokespecial 217	java/io/InterruptedIOException:<init>	(Ljava/lang/String;)V
    //   219: aload 5
    //   221: aload 6
    //   223: invokevirtual 221	java/io/InterruptedIOException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   226: pop
    //   227: aload 5
    //   229: athrow
    //   230: lconst_0
    //   231: lstore 9
    //   233: goto -117 -> 116
    //   236: astore 6
    //   238: invokestatic 227	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   241: invokevirtual 230	java/lang/Thread:interrupt	()V
    //   244: new 175	org/apache/http/impl/execchain/RequestAbortedException
    //   247: astore 5
    //   249: aload 5
    //   251: ldc -79
    //   253: aload 6
    //   255: invokespecial 231	org/apache/http/impl/execchain/RequestAbortedException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   258: aload 5
    //   260: athrow
    //   261: astore 6
    //   263: aload 6
    //   265: invokevirtual 237	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   268: astore 5
    //   270: aload 5
    //   272: ifnonnull +492 -> 764
    //   275: new 175	org/apache/http/impl/execchain/RequestAbortedException
    //   278: astore 5
    //   280: aload 5
    //   282: ldc -17
    //   284: aload 6
    //   286: invokespecial 231	org/apache/http/impl/execchain/RequestAbortedException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   289: aload 5
    //   291: athrow
    //   292: aload 4
    //   294: aload 13
    //   296: invokeinterface 182 2 0
    //   301: aload 12
    //   303: invokeinterface 244 1 0
    //   308: istore 14
    //   310: iload 14
    //   312: ifne +51 -> 363
    //   315: aload 8
    //   317: invokevirtual 247	org/apache/http/client/config/RequestConfig:getConnectTimeout	()I
    //   320: istore 14
    //   322: aload_0
    //   323: getfield 89	org/apache/http/impl/execchain/MinimalClientExec:connManager	Lorg/apache/http/conn/HttpClientConnectionManager;
    //   326: astore 11
    //   328: iload 14
    //   330: ifle +361 -> 691
    //   333: aload 11
    //   335: aload 12
    //   337: aload_1
    //   338: iload 14
    //   340: aload_3
    //   341: invokeinterface 251 5 0
    //   346: aload_0
    //   347: getfield 89	org/apache/http/impl/execchain/MinimalClientExec:connManager	Lorg/apache/http/conn/HttpClientConnectionManager;
    //   350: astore 6
    //   352: aload 6
    //   354: aload 12
    //   356: aload_1
    //   357: aload_3
    //   358: invokeinterface 255 4 0
    //   363: aload 8
    //   365: invokevirtual 258	org/apache/http/client/config/RequestConfig:getSocketTimeout	()I
    //   368: istore 14
    //   370: iload 14
    //   372: iflt +12 -> 384
    //   375: aload 12
    //   377: iload 14
    //   379: invokeinterface 262 2 0
    //   384: aload_2
    //   385: invokevirtual 266	org/apache/http/client/methods/HttpRequestWrapper:getOriginal	()Lorg/apache/http/HttpRequest;
    //   388: astore 6
    //   390: aload 6
    //   392: instanceof 268
    //   395: istore 15
    //   397: iload 15
    //   399: ifeq +356 -> 755
    //   402: aload 6
    //   404: checkcast 268	org/apache/http/client/methods/HttpUriRequest
    //   407: astore 6
    //   409: aload 6
    //   411: invokeinterface 269 1 0
    //   416: astore 8
    //   418: aload 8
    //   420: invokevirtual 105	java/net/URI:isAbsolute	()Z
    //   423: istore 14
    //   425: iload 14
    //   427: ifeq +328 -> 755
    //   430: new 271	org/apache/http/HttpHost
    //   433: astore 6
    //   435: aload 8
    //   437: invokevirtual 274	java/net/URI:getHost	()Ljava/lang/String;
    //   440: astore 5
    //   442: aload 8
    //   444: invokevirtual 277	java/net/URI:getPort	()I
    //   447: istore 16
    //   449: aload 8
    //   451: invokevirtual 280	java/net/URI:getScheme	()Ljava/lang/String;
    //   454: astore 8
    //   456: aload 6
    //   458: aload 5
    //   460: iload 16
    //   462: aload 8
    //   464: invokespecial 283	org/apache/http/HttpHost:<init>	(Ljava/lang/String;ILjava/lang/String;)V
    //   467: aload 6
    //   469: ifnonnull +9 -> 478
    //   472: aload_1
    //   473: invokevirtual 289	org/apache/http/conn/routing/HttpRoute:getTargetHost	()Lorg/apache/http/HttpHost;
    //   476: astore 6
    //   478: ldc_w 291
    //   481: astore 5
    //   483: aload_3
    //   484: aload 5
    //   486: aload 6
    //   488: invokevirtual 295	org/apache/http/client/protocol/HttpClientContext:setAttribute	(Ljava/lang/String;Ljava/lang/Object;)V
    //   491: ldc_w 297
    //   494: astore 6
    //   496: aload_3
    //   497: aload 6
    //   499: aload_2
    //   500: invokevirtual 295	org/apache/http/client/protocol/HttpClientContext:setAttribute	(Ljava/lang/String;Ljava/lang/Object;)V
    //   503: ldc_w 299
    //   506: astore 6
    //   508: aload_3
    //   509: aload 6
    //   511: aload 12
    //   513: invokevirtual 295	org/apache/http/client/protocol/HttpClientContext:setAttribute	(Ljava/lang/String;Ljava/lang/Object;)V
    //   516: ldc_w 301
    //   519: astore 6
    //   521: aload_3
    //   522: aload 6
    //   524: aload_1
    //   525: invokevirtual 295	org/apache/http/client/protocol/HttpClientContext:setAttribute	(Ljava/lang/String;Ljava/lang/Object;)V
    //   528: aload_0
    //   529: getfield 85	org/apache/http/impl/execchain/MinimalClientExec:httpProcessor	Lorg/apache/http/protocol/HttpProcessor;
    //   532: astore 6
    //   534: aload 6
    //   536: aload_2
    //   537: aload_3
    //   538: invokeinterface 307 3 0
    //   543: aload_0
    //   544: getfield 87	org/apache/http/impl/execchain/MinimalClientExec:requestExecutor	Lorg/apache/http/protocol/HttpRequestExecutor;
    //   547: astore 6
    //   549: aload 6
    //   551: aload_2
    //   552: aload 12
    //   554: aload_3
    //   555: invokevirtual 313	org/apache/http/protocol/HttpRequestExecutor:execute	(Lorg/apache/http/HttpRequest;Lorg/apache/http/HttpClientConnection;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    //   558: astore 5
    //   560: aload_0
    //   561: getfield 85	org/apache/http/impl/execchain/MinimalClientExec:httpProcessor	Lorg/apache/http/protocol/HttpProcessor;
    //   564: astore 6
    //   566: aload 6
    //   568: aload 5
    //   570: aload_3
    //   571: invokeinterface 316 3 0
    //   576: aload_0
    //   577: getfield 91	org/apache/http/impl/execchain/MinimalClientExec:reuseStrategy	Lorg/apache/http/ConnectionReuseStrategy;
    //   580: astore 6
    //   582: aload 6
    //   584: aload 5
    //   586: aload_3
    //   587: invokeinterface 322 3 0
    //   592: istore 14
    //   594: iload 14
    //   596: ifeq +104 -> 700
    //   599: aload_0
    //   600: getfield 93	org/apache/http/impl/execchain/MinimalClientExec:keepAliveStrategy	Lorg/apache/http/conn/ConnectionKeepAliveStrategy;
    //   603: astore 6
    //   605: aload 6
    //   607: aload 5
    //   609: aload_3
    //   610: invokeinterface 328 3 0
    //   615: lstore 17
    //   617: getstatic 200	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   620: astore 6
    //   622: aload 13
    //   624: lload 17
    //   626: aload 6
    //   628: invokevirtual 332	org/apache/http/impl/execchain/ConnectionHolder:setValidFor	(JLjava/util/concurrent/TimeUnit;)V
    //   631: aload 13
    //   633: invokevirtual 335	org/apache/http/impl/execchain/ConnectionHolder:markReusable	()V
    //   636: aload 5
    //   638: invokeinterface 341 1 0
    //   643: astore 6
    //   645: aload 6
    //   647: ifnull +17 -> 664
    //   650: aload 6
    //   652: invokeinterface 346 1 0
    //   657: istore 14
    //   659: iload 14
    //   661: ifne +57 -> 718
    //   664: aload 13
    //   666: invokevirtual 349	org/apache/http/impl/execchain/ConnectionHolder:releaseConnection	()V
    //   669: new 351	org/apache/http/impl/execchain/HttpResponseProxy
    //   672: astore 6
    //   674: iconst_0
    //   675: istore 7
    //   677: aconst_null
    //   678: astore 12
    //   680: aload 6
    //   682: aload 5
    //   684: aconst_null
    //   685: invokespecial 354	org/apache/http/impl/execchain/HttpResponseProxy:<init>	(Lorg/apache/http/HttpResponse;Lorg/apache/http/impl/execchain/ConnectionHolder;)V
    //   688: aload 6
    //   690: areturn
    //   691: iconst_0
    //   692: istore 14
    //   694: aconst_null
    //   695: astore 6
    //   697: goto -364 -> 333
    //   700: aload 13
    //   702: invokevirtual 357	org/apache/http/impl/execchain/ConnectionHolder:markNonReusable	()V
    //   705: goto -69 -> 636
    //   708: astore 6
    //   710: aload 13
    //   712: invokevirtual 360	org/apache/http/impl/execchain/ConnectionHolder:abortConnection	()V
    //   715: aload 6
    //   717: athrow
    //   718: new 351	org/apache/http/impl/execchain/HttpResponseProxy
    //   721: astore 6
    //   723: aload 6
    //   725: aload 5
    //   727: aload 13
    //   729: invokespecial 354	org/apache/http/impl/execchain/HttpResponseProxy:<init>	(Lorg/apache/http/HttpResponse;Lorg/apache/http/impl/execchain/ConnectionHolder;)V
    //   732: goto -44 -> 688
    //   735: astore 6
    //   737: aload 13
    //   739: invokevirtual 360	org/apache/http/impl/execchain/ConnectionHolder:abortConnection	()V
    //   742: aload 6
    //   744: athrow
    //   745: astore 6
    //   747: aload 13
    //   749: invokevirtual 360	org/apache/http/impl/execchain/ConnectionHolder:abortConnection	()V
    //   752: aload 6
    //   754: athrow
    //   755: iconst_0
    //   756: istore 14
    //   758: aconst_null
    //   759: astore 6
    //   761: goto -294 -> 467
    //   764: aload 5
    //   766: astore 6
    //   768: goto -493 -> 275
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	771	0	this	MinimalClientExec
    //   0	771	1	paramHttpRoute	org.apache.http.conn.routing.HttpRoute
    //   0	771	2	paramHttpRequestWrapper	org.apache.http.client.methods.HttpRequestWrapper
    //   0	771	3	paramHttpClientContext	org.apache.http.client.protocol.HttpClientContext
    //   0	771	4	paramHttpExecutionAware	org.apache.http.client.methods.HttpExecutionAware
    //   1	764	5	localObject1	Object
    //   40	163	6	localObject2	Object
    //   205	17	6	localConnectionShutdownException	org.apache.http.impl.conn.ConnectionShutdownException
    //   236	18	6	localInterruptedException	InterruptedException
    //   261	24	6	localExecutionException	java.util.concurrent.ExecutionException
    //   350	346	6	localObject3	Object
    //   708	8	6	localHttpException	org.apache.http.HttpException
    //   721	3	6	localHttpResponseProxy	HttpResponseProxy
    //   735	8	6	localIOException	java.io.IOException
    //   745	8	6	localRuntimeException	RuntimeException
    //   759	8	6	localObject4	Object
    //   54	3	7	bool1	boolean
    //   104	572	7	i	int
    //   97	366	8	localObject5	Object
    //   114	118	9	l1	long
    //   119	215	11	localObject6	Object
    //   132	547	12	localHttpClientConnection	org.apache.http.HttpClientConnection
    //   137	611	13	localConnectionHolder	ConnectionHolder
    //   174	137	14	bool2	boolean
    //   320	58	14	j	int
    //   423	334	14	bool3	boolean
    //   395	3	15	bool4	boolean
    //   447	14	16	k	int
    //   615	10	17	l2	long
    // Exception table:
    //   from	to	target	type
    //   167	174	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   181	186	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   186	189	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   197	202	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   202	205	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   294	301	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   301	308	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   315	320	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   322	326	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   340	346	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   346	350	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   357	363	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   363	368	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   377	384	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   384	388	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   402	407	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   409	416	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   418	423	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   430	433	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   435	440	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   442	447	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   449	454	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   462	467	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   472	476	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   486	491	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   499	503	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   511	516	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   524	528	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   528	532	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   537	543	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   543	547	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   554	558	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   560	564	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   570	576	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   576	580	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   586	592	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   599	603	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   609	615	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   617	620	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   626	631	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   631	636	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   636	643	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   650	657	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   664	669	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   669	672	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   684	688	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   700	705	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   718	721	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   727	732	205	org/apache/http/impl/conn/ConnectionShutdownException
    //   99	104	236	java/lang/InterruptedException
    //   116	119	236	java/lang/InterruptedException
    //   125	132	236	java/lang/InterruptedException
    //   99	104	261	java/util/concurrent/ExecutionException
    //   116	119	261	java/util/concurrent/ExecutionException
    //   125	132	261	java/util/concurrent/ExecutionException
    //   167	174	708	org/apache/http/HttpException
    //   181	186	708	org/apache/http/HttpException
    //   186	189	708	org/apache/http/HttpException
    //   197	202	708	org/apache/http/HttpException
    //   202	205	708	org/apache/http/HttpException
    //   294	301	708	org/apache/http/HttpException
    //   301	308	708	org/apache/http/HttpException
    //   315	320	708	org/apache/http/HttpException
    //   322	326	708	org/apache/http/HttpException
    //   340	346	708	org/apache/http/HttpException
    //   346	350	708	org/apache/http/HttpException
    //   357	363	708	org/apache/http/HttpException
    //   363	368	708	org/apache/http/HttpException
    //   377	384	708	org/apache/http/HttpException
    //   384	388	708	org/apache/http/HttpException
    //   402	407	708	org/apache/http/HttpException
    //   409	416	708	org/apache/http/HttpException
    //   418	423	708	org/apache/http/HttpException
    //   430	433	708	org/apache/http/HttpException
    //   435	440	708	org/apache/http/HttpException
    //   442	447	708	org/apache/http/HttpException
    //   449	454	708	org/apache/http/HttpException
    //   462	467	708	org/apache/http/HttpException
    //   472	476	708	org/apache/http/HttpException
    //   486	491	708	org/apache/http/HttpException
    //   499	503	708	org/apache/http/HttpException
    //   511	516	708	org/apache/http/HttpException
    //   524	528	708	org/apache/http/HttpException
    //   528	532	708	org/apache/http/HttpException
    //   537	543	708	org/apache/http/HttpException
    //   543	547	708	org/apache/http/HttpException
    //   554	558	708	org/apache/http/HttpException
    //   560	564	708	org/apache/http/HttpException
    //   570	576	708	org/apache/http/HttpException
    //   576	580	708	org/apache/http/HttpException
    //   586	592	708	org/apache/http/HttpException
    //   599	603	708	org/apache/http/HttpException
    //   609	615	708	org/apache/http/HttpException
    //   617	620	708	org/apache/http/HttpException
    //   626	631	708	org/apache/http/HttpException
    //   631	636	708	org/apache/http/HttpException
    //   636	643	708	org/apache/http/HttpException
    //   650	657	708	org/apache/http/HttpException
    //   664	669	708	org/apache/http/HttpException
    //   669	672	708	org/apache/http/HttpException
    //   684	688	708	org/apache/http/HttpException
    //   700	705	708	org/apache/http/HttpException
    //   718	721	708	org/apache/http/HttpException
    //   727	732	708	org/apache/http/HttpException
    //   167	174	735	java/io/IOException
    //   181	186	735	java/io/IOException
    //   186	189	735	java/io/IOException
    //   197	202	735	java/io/IOException
    //   202	205	735	java/io/IOException
    //   294	301	735	java/io/IOException
    //   301	308	735	java/io/IOException
    //   315	320	735	java/io/IOException
    //   322	326	735	java/io/IOException
    //   340	346	735	java/io/IOException
    //   346	350	735	java/io/IOException
    //   357	363	735	java/io/IOException
    //   363	368	735	java/io/IOException
    //   377	384	735	java/io/IOException
    //   384	388	735	java/io/IOException
    //   402	407	735	java/io/IOException
    //   409	416	735	java/io/IOException
    //   418	423	735	java/io/IOException
    //   430	433	735	java/io/IOException
    //   435	440	735	java/io/IOException
    //   442	447	735	java/io/IOException
    //   449	454	735	java/io/IOException
    //   462	467	735	java/io/IOException
    //   472	476	735	java/io/IOException
    //   486	491	735	java/io/IOException
    //   499	503	735	java/io/IOException
    //   511	516	735	java/io/IOException
    //   524	528	735	java/io/IOException
    //   528	532	735	java/io/IOException
    //   537	543	735	java/io/IOException
    //   543	547	735	java/io/IOException
    //   554	558	735	java/io/IOException
    //   560	564	735	java/io/IOException
    //   570	576	735	java/io/IOException
    //   576	580	735	java/io/IOException
    //   586	592	735	java/io/IOException
    //   599	603	735	java/io/IOException
    //   609	615	735	java/io/IOException
    //   617	620	735	java/io/IOException
    //   626	631	735	java/io/IOException
    //   631	636	735	java/io/IOException
    //   636	643	735	java/io/IOException
    //   650	657	735	java/io/IOException
    //   664	669	735	java/io/IOException
    //   669	672	735	java/io/IOException
    //   684	688	735	java/io/IOException
    //   700	705	735	java/io/IOException
    //   718	721	735	java/io/IOException
    //   727	732	735	java/io/IOException
    //   167	174	745	java/lang/RuntimeException
    //   181	186	745	java/lang/RuntimeException
    //   186	189	745	java/lang/RuntimeException
    //   197	202	745	java/lang/RuntimeException
    //   202	205	745	java/lang/RuntimeException
    //   294	301	745	java/lang/RuntimeException
    //   301	308	745	java/lang/RuntimeException
    //   315	320	745	java/lang/RuntimeException
    //   322	326	745	java/lang/RuntimeException
    //   340	346	745	java/lang/RuntimeException
    //   346	350	745	java/lang/RuntimeException
    //   357	363	745	java/lang/RuntimeException
    //   363	368	745	java/lang/RuntimeException
    //   377	384	745	java/lang/RuntimeException
    //   384	388	745	java/lang/RuntimeException
    //   402	407	745	java/lang/RuntimeException
    //   409	416	745	java/lang/RuntimeException
    //   418	423	745	java/lang/RuntimeException
    //   430	433	745	java/lang/RuntimeException
    //   435	440	745	java/lang/RuntimeException
    //   442	447	745	java/lang/RuntimeException
    //   449	454	745	java/lang/RuntimeException
    //   462	467	745	java/lang/RuntimeException
    //   472	476	745	java/lang/RuntimeException
    //   486	491	745	java/lang/RuntimeException
    //   499	503	745	java/lang/RuntimeException
    //   511	516	745	java/lang/RuntimeException
    //   524	528	745	java/lang/RuntimeException
    //   528	532	745	java/lang/RuntimeException
    //   537	543	745	java/lang/RuntimeException
    //   543	547	745	java/lang/RuntimeException
    //   554	558	745	java/lang/RuntimeException
    //   560	564	745	java/lang/RuntimeException
    //   570	576	745	java/lang/RuntimeException
    //   576	580	745	java/lang/RuntimeException
    //   586	592	745	java/lang/RuntimeException
    //   599	603	745	java/lang/RuntimeException
    //   609	615	745	java/lang/RuntimeException
    //   617	620	745	java/lang/RuntimeException
    //   626	631	745	java/lang/RuntimeException
    //   631	636	745	java/lang/RuntimeException
    //   636	643	745	java/lang/RuntimeException
    //   650	657	745	java/lang/RuntimeException
    //   664	669	745	java/lang/RuntimeException
    //   669	672	745	java/lang/RuntimeException
    //   684	688	745	java/lang/RuntimeException
    //   700	705	745	java/lang/RuntimeException
    //   718	721	745	java/lang/RuntimeException
    //   727	732	745	java/lang/RuntimeException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\MinimalClientExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */