package org.apache.http.impl.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

public class DecompressingHttpClient
  implements HttpClient
{
  private final HttpRequestInterceptor acceptEncodingInterceptor;
  private final HttpClient backend;
  private final HttpResponseInterceptor contentEncodingInterceptor;
  
  public DecompressingHttpClient()
  {
    this(localDefaultHttpClient);
  }
  
  public DecompressingHttpClient(HttpClient paramHttpClient)
  {
    this(paramHttpClient, localRequestAcceptEncoding, localResponseContentEncoding);
  }
  
  DecompressingHttpClient(HttpClient paramHttpClient, HttpRequestInterceptor paramHttpRequestInterceptor, HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    this.backend = paramHttpClient;
    this.acceptEncodingInterceptor = paramHttpRequestInterceptor;
    this.contentEncodingInterceptor = paramHttpResponseInterceptor;
  }
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpHost, paramHttpRequest, paramResponseHandler, null);
  }
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    Object localObject1 = execute(paramHttpHost, paramHttpRequest, paramHttpContext);
    try
    {
      Object localObject2 = paramResponseHandler.handleResponse((HttpResponse)localObject1);
      return localObject2;
    }
    finally
    {
      localObject1 = ((HttpResponse)localObject1).getEntity();
      if (localObject1 != null) {
        EntityUtils.consume((HttpEntity)localObject1);
      }
    }
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler)
  {
    HttpHost localHttpHost = getHttpHost(paramHttpUriRequest);
    return execute(localHttpHost, paramHttpUriRequest, paramResponseHandler);
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    HttpHost localHttpHost = getHttpHost(paramHttpUriRequest);
    return execute(localHttpHost, paramHttpUriRequest, paramResponseHandler, paramHttpContext);
  }
  
  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    ((HttpContext)null);
    return execute(paramHttpHost, paramHttpRequest, null);
  }
  
  /* Error */
  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    // Byte code:
    //   0: aload_3
    //   1: ifnull +156 -> 157
    //   4: aload_2
    //   5: instanceof 73
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +173 -> 185
    //   15: new 75	org/apache/http/impl/client/EntityEnclosingRequestWrapper
    //   18: astore 5
    //   20: aload_2
    //   21: checkcast 73	org/apache/http/HttpEntityEnclosingRequest
    //   24: astore_2
    //   25: aload 5
    //   27: aload_2
    //   28: invokespecial 78	org/apache/http/impl/client/EntityEnclosingRequestWrapper:<init>	(Lorg/apache/http/HttpEntityEnclosingRequest;)V
    //   31: aload_0
    //   32: getfield 35	org/apache/http/impl/client/DecompressingHttpClient:acceptEncodingInterceptor	Lorg/apache/http/HttpRequestInterceptor;
    //   35: astore 6
    //   37: aload 6
    //   39: aload 5
    //   41: aload_3
    //   42: invokeinterface 84 3 0
    //   47: aload_0
    //   48: getfield 33	org/apache/http/impl/client/DecompressingHttpClient:backend	Lorg/apache/http/client/HttpClient;
    //   51: astore 6
    //   53: aload 6
    //   55: aload_1
    //   56: aload 5
    //   58: aload_3
    //   59: invokeinterface 85 4 0
    //   64: astore 6
    //   66: aload_0
    //   67: getfield 37	org/apache/http/impl/client/DecompressingHttpClient:contentEncodingInterceptor	Lorg/apache/http/HttpResponseInterceptor;
    //   70: astore 5
    //   72: aload 5
    //   74: aload 6
    //   76: aload_3
    //   77: invokeinterface 90 3 0
    //   82: getstatic 96	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   85: astore 5
    //   87: ldc 98
    //   89: astore 7
    //   91: aload_3
    //   92: aload 7
    //   94: invokeinterface 102 2 0
    //   99: astore 7
    //   101: aload 5
    //   103: aload 7
    //   105: invokevirtual 106	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   108: istore 4
    //   110: iload 4
    //   112: ifeq +42 -> 154
    //   115: ldc 108
    //   117: astore 5
    //   119: aload 6
    //   121: aload 5
    //   123: invokeinterface 112 2 0
    //   128: ldc 114
    //   130: astore 5
    //   132: aload 6
    //   134: aload 5
    //   136: invokeinterface 112 2 0
    //   141: ldc 116
    //   143: astore 5
    //   145: aload 6
    //   147: aload 5
    //   149: invokeinterface 112 2 0
    //   154: aload 6
    //   156: areturn
    //   157: new 118	org/apache/http/protocol/BasicHttpContext
    //   160: astore_3
    //   161: aload_3
    //   162: invokespecial 119	org/apache/http/protocol/BasicHttpContext:<init>	()V
    //   165: goto -161 -> 4
    //   168: astore 5
    //   170: new 121	org/apache/http/client/ClientProtocolException
    //   173: astore 6
    //   175: aload 6
    //   177: aload 5
    //   179: invokespecial 124	org/apache/http/client/ClientProtocolException:<init>	(Ljava/lang/Throwable;)V
    //   182: aload 6
    //   184: athrow
    //   185: new 126	org/apache/http/impl/client/RequestWrapper
    //   188: astore 5
    //   190: aload 5
    //   192: aload_2
    //   193: invokespecial 129	org/apache/http/impl/client/RequestWrapper:<init>	(Lorg/apache/http/HttpRequest;)V
    //   196: goto -165 -> 31
    //   199: astore 5
    //   201: aload 6
    //   203: invokeinterface 56 1 0
    //   208: astore 6
    //   210: aload 6
    //   212: invokestatic 62	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   215: aload 5
    //   217: athrow
    //   218: astore 5
    //   220: aload 6
    //   222: invokeinterface 56 1 0
    //   227: astore 6
    //   229: aload 6
    //   231: invokestatic 62	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   234: aload 5
    //   236: athrow
    //   237: astore 5
    //   239: aload 6
    //   241: invokeinterface 56 1 0
    //   246: astore 6
    //   248: aload 6
    //   250: invokestatic 62	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   253: aload 5
    //   255: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	DecompressingHttpClient
    //   0	256	1	paramHttpHost	HttpHost
    //   0	256	2	paramHttpRequest	HttpRequest
    //   0	256	3	paramHttpContext	HttpContext
    //   8	103	4	bool	boolean
    //   18	130	5	localObject1	Object
    //   168	10	5	localHttpException1	org.apache.http.HttpException
    //   188	3	5	localRequestWrapper	RequestWrapper
    //   199	17	5	localHttpException2	org.apache.http.HttpException
    //   218	17	5	localIOException	java.io.IOException
    //   237	17	5	localRuntimeException	RuntimeException
    //   35	214	6	localObject2	Object
    //   89	15	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   15	18	168	org/apache/http/HttpException
    //   20	24	168	org/apache/http/HttpException
    //   27	31	168	org/apache/http/HttpException
    //   31	35	168	org/apache/http/HttpException
    //   41	47	168	org/apache/http/HttpException
    //   47	51	168	org/apache/http/HttpException
    //   58	64	168	org/apache/http/HttpException
    //   157	160	168	org/apache/http/HttpException
    //   161	165	168	org/apache/http/HttpException
    //   185	188	168	org/apache/http/HttpException
    //   192	196	168	org/apache/http/HttpException
    //   201	208	168	org/apache/http/HttpException
    //   210	215	168	org/apache/http/HttpException
    //   215	218	168	org/apache/http/HttpException
    //   220	227	168	org/apache/http/HttpException
    //   229	234	168	org/apache/http/HttpException
    //   234	237	168	org/apache/http/HttpException
    //   239	246	168	org/apache/http/HttpException
    //   248	253	168	org/apache/http/HttpException
    //   253	256	168	org/apache/http/HttpException
    //   66	70	199	org/apache/http/HttpException
    //   76	82	199	org/apache/http/HttpException
    //   82	85	199	org/apache/http/HttpException
    //   92	99	199	org/apache/http/HttpException
    //   103	108	199	org/apache/http/HttpException
    //   121	128	199	org/apache/http/HttpException
    //   134	141	199	org/apache/http/HttpException
    //   147	154	199	org/apache/http/HttpException
    //   66	70	218	java/io/IOException
    //   76	82	218	java/io/IOException
    //   82	85	218	java/io/IOException
    //   92	99	218	java/io/IOException
    //   103	108	218	java/io/IOException
    //   121	128	218	java/io/IOException
    //   134	141	218	java/io/IOException
    //   147	154	218	java/io/IOException
    //   66	70	237	java/lang/RuntimeException
    //   76	82	237	java/lang/RuntimeException
    //   82	85	237	java/lang/RuntimeException
    //   92	99	237	java/lang/RuntimeException
    //   103	108	237	java/lang/RuntimeException
    //   121	128	237	java/lang/RuntimeException
    //   134	141	237	java/lang/RuntimeException
    //   147	154	237	java/lang/RuntimeException
  }
  
  public HttpResponse execute(HttpUriRequest paramHttpUriRequest)
  {
    HttpHost localHttpHost = getHttpHost(paramHttpUriRequest);
    ((HttpContext)null);
    return execute(localHttpHost, paramHttpUriRequest, null);
  }
  
  public HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    HttpHost localHttpHost = getHttpHost(paramHttpUriRequest);
    return execute(localHttpHost, paramHttpUriRequest, paramHttpContext);
  }
  
  public ClientConnectionManager getConnectionManager()
  {
    return this.backend.getConnectionManager();
  }
  
  public HttpClient getHttpClient()
  {
    return this.backend;
  }
  
  HttpHost getHttpHost(HttpUriRequest paramHttpUriRequest)
  {
    return URIUtils.extractHost(paramHttpUriRequest.getURI());
  }
  
  public HttpParams getParams()
  {
    return this.backend.getParams();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DecompressingHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */