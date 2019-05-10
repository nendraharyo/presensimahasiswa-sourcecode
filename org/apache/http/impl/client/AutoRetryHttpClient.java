package org.apache.http.impl.client;

import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class AutoRetryHttpClient
  implements HttpClient
{
  private final HttpClient backend;
  private final Log log;
  private final ServiceUnavailableRetryStrategy retryStrategy;
  
  public AutoRetryHttpClient()
  {
    this(localDefaultHttpClient, localDefaultServiceUnavailableRetryStrategy);
  }
  
  public AutoRetryHttpClient(HttpClient paramHttpClient)
  {
    this(paramHttpClient, localDefaultServiceUnavailableRetryStrategy);
  }
  
  public AutoRetryHttpClient(HttpClient paramHttpClient, ServiceUnavailableRetryStrategy paramServiceUnavailableRetryStrategy)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramHttpClient, "HttpClient");
    Args.notNull(paramServiceUnavailableRetryStrategy, "ServiceUnavailableRetryStrategy");
    this.backend = paramHttpClient;
    this.retryStrategy = paramServiceUnavailableRetryStrategy;
  }
  
  public AutoRetryHttpClient(ServiceUnavailableRetryStrategy paramServiceUnavailableRetryStrategy)
  {
    this(localDefaultHttpClient, paramServiceUnavailableRetryStrategy);
  }
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpHost, paramHttpRequest, paramResponseHandler, null);
  }
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    HttpResponse localHttpResponse = execute(paramHttpHost, paramHttpRequest, paramHttpContext);
    return paramResponseHandler.handleResponse(localHttpResponse);
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpUriRequest, paramResponseHandler, null);
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    HttpResponse localHttpResponse = execute(paramHttpUriRequest, paramHttpContext);
    return paramResponseHandler.handleResponse(localHttpResponse);
  }
  
  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    return execute(paramHttpHost, paramHttpRequest, null);
  }
  
  /* Error */
  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: getfield 49	org/apache/http/impl/client/AutoRetryHttpClient:backend	Lorg/apache/http/client/HttpClient;
    //   7: aload_1
    //   8: aload_2
    //   9: aload_3
    //   10: invokeinterface 72 4 0
    //   15: astore 5
    //   17: aload_0
    //   18: getfield 51	org/apache/http/impl/client/AutoRetryHttpClient:retryStrategy	Lorg/apache/http/client/ServiceUnavailableRetryStrategy;
    //   21: astore 6
    //   23: aload 6
    //   25: aload 5
    //   27: iload 4
    //   29: aload_3
    //   30: invokeinterface 78 4 0
    //   35: istore 7
    //   37: iload 7
    //   39: ifeq +170 -> 209
    //   42: aload 5
    //   44: invokeinterface 84 1 0
    //   49: astore 6
    //   51: aload 6
    //   53: invokestatic 90	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   56: aload_0
    //   57: getfield 51	org/apache/http/impl/client/AutoRetryHttpClient:retryStrategy	Lorg/apache/http/client/ServiceUnavailableRetryStrategy;
    //   60: astore 6
    //   62: aload 6
    //   64: invokeinterface 94 1 0
    //   69: lstore 8
    //   71: aload_0
    //   72: getfield 37	org/apache/http/impl/client/AutoRetryHttpClient:log	Lorg/apache/commons/logging/Log;
    //   75: astore 10
    //   77: new 96	java/lang/StringBuilder
    //   80: astore 11
    //   82: aload 11
    //   84: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   87: ldc 99
    //   89: astore 12
    //   91: aload 11
    //   93: aload 12
    //   95: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: astore 11
    //   100: aload 11
    //   102: lload 8
    //   104: invokevirtual 106	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   107: astore 11
    //   109: aload 11
    //   111: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: astore 11
    //   116: aload 10
    //   118: aload 11
    //   120: invokeinterface 116 2 0
    //   125: lload 8
    //   127: invokestatic 122	java/lang/Thread:sleep	(J)V
    //   130: iload 4
    //   132: iconst_1
    //   133: iadd
    //   134: istore 4
    //   136: goto -133 -> 3
    //   139: astore 13
    //   141: invokestatic 126	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   144: astore 13
    //   146: aload 13
    //   148: invokevirtual 129	java/lang/Thread:interrupt	()V
    //   151: new 131	java/io/InterruptedIOException
    //   154: astore 13
    //   156: aload 13
    //   158: invokespecial 132	java/io/InterruptedIOException:<init>	()V
    //   161: aload 13
    //   163: athrow
    //   164: astore 13
    //   166: aload 5
    //   168: invokeinterface 84 1 0
    //   173: astore 5
    //   175: aload 5
    //   177: invokestatic 90	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   180: aload 13
    //   182: athrow
    //   183: astore 5
    //   185: aload_0
    //   186: getfield 37	org/apache/http/impl/client/AutoRetryHttpClient:log	Lorg/apache/commons/logging/Log;
    //   189: astore 6
    //   191: ldc -122
    //   193: astore 14
    //   195: aload 6
    //   197: aload 14
    //   199: aload 5
    //   201: invokeinterface 138 3 0
    //   206: goto -26 -> 180
    //   209: aload 5
    //   211: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	AutoRetryHttpClient
    //   0	212	1	paramHttpHost	HttpHost
    //   0	212	2	paramHttpRequest	HttpRequest
    //   0	212	3	paramHttpContext	HttpContext
    //   1	134	4	i	int
    //   15	161	5	localObject1	Object
    //   183	27	5	localIOException	java.io.IOException
    //   21	175	6	localObject2	Object
    //   35	3	7	bool	boolean
    //   69	57	8	l	long
    //   75	42	10	localLog	Log
    //   80	39	11	localObject3	Object
    //   89	5	12	str1	String
    //   139	1	13	localInterruptedException	InterruptedException
    //   144	18	13	localObject4	Object
    //   164	17	13	localRuntimeException	RuntimeException
    //   193	5	14	str2	String
    // Exception table:
    //   from	to	target	type
    //   71	75	139	java/lang/InterruptedException
    //   77	80	139	java/lang/InterruptedException
    //   82	87	139	java/lang/InterruptedException
    //   93	98	139	java/lang/InterruptedException
    //   102	107	139	java/lang/InterruptedException
    //   109	114	139	java/lang/InterruptedException
    //   118	125	139	java/lang/InterruptedException
    //   125	130	139	java/lang/InterruptedException
    //   17	21	164	java/lang/RuntimeException
    //   29	35	164	java/lang/RuntimeException
    //   42	49	164	java/lang/RuntimeException
    //   51	56	164	java/lang/RuntimeException
    //   56	60	164	java/lang/RuntimeException
    //   62	69	164	java/lang/RuntimeException
    //   71	75	164	java/lang/RuntimeException
    //   77	80	164	java/lang/RuntimeException
    //   82	87	164	java/lang/RuntimeException
    //   93	98	164	java/lang/RuntimeException
    //   102	107	164	java/lang/RuntimeException
    //   109	114	164	java/lang/RuntimeException
    //   118	125	164	java/lang/RuntimeException
    //   125	130	164	java/lang/RuntimeException
    //   141	144	164	java/lang/RuntimeException
    //   146	151	164	java/lang/RuntimeException
    //   151	154	164	java/lang/RuntimeException
    //   156	161	164	java/lang/RuntimeException
    //   161	164	164	java/lang/RuntimeException
    //   166	173	183	java/io/IOException
    //   175	180	183	java/io/IOException
  }
  
  public HttpResponse execute(HttpUriRequest paramHttpUriRequest)
  {
    return execute(paramHttpUriRequest, null);
  }
  
  public HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    Object localObject = paramHttpUriRequest.getURI();
    HttpHost localHttpHost = new org/apache/http/HttpHost;
    String str = ((URI)localObject).getHost();
    int i = ((URI)localObject).getPort();
    localObject = ((URI)localObject).getScheme();
    localHttpHost.<init>(str, i, (String)localObject);
    return execute(localHttpHost, paramHttpUriRequest, paramHttpContext);
  }
  
  public ClientConnectionManager getConnectionManager()
  {
    return this.backend.getConnectionManager();
  }
  
  public HttpParams getParams()
  {
    return this.backend.getParams();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AutoRetryHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */