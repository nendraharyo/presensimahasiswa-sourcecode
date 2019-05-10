package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

public abstract class CloseableHttpClient
  implements Closeable, HttpClient
{
  private final Log log;
  
  public CloseableHttpClient()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  private static HttpHost determineTarget(HttpUriRequest paramHttpUriRequest)
  {
    Object localObject1 = null;
    Object localObject2 = paramHttpUriRequest.getURI();
    boolean bool = ((URI)localObject2).isAbsolute();
    if (bool)
    {
      localObject1 = URIUtils.extractHost((URI)localObject2);
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/client/ClientProtocolException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "URI does not specify a valid host name: " + localObject2;
        ((ClientProtocolException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    return (HttpHost)localObject1;
  }
  
  protected abstract CloseableHttpResponse doExecute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext);
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpHost, paramHttpRequest, paramResponseHandler, null);
  }
  
  public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    Object localObject1 = "Response handler";
    Args.notNull(paramResponseHandler, (String)localObject1);
    Object localObject2 = execute(paramHttpHost, paramHttpRequest, paramHttpContext);
    try
    {
      localObject1 = paramResponseHandler.handleResponse((HttpResponse)localObject2);
      EntityUtils.consume(((HttpResponse)localObject2).getEntity());
      return localObject1;
    }
    catch (Exception localException1)
    {
      localObject2 = ((HttpResponse)localObject2).getEntity();
      try
      {
        EntityUtils.consume((HttpEntity)localObject2);
        bool = localException1 instanceof RuntimeException;
        if (bool) {
          throw ((RuntimeException)localException1);
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Log localLog = this.log;
          String str = "Error consuming content after an exception.";
          localLog.warn(str, localException2);
        }
        boolean bool = localException1 instanceof IOException;
        if (bool) {
          throw ((IOException)localException1);
        }
        UndeclaredThrowableException localUndeclaredThrowableException = new java/lang/reflect/UndeclaredThrowableException;
        localUndeclaredThrowableException.<init>(localException1);
        throw localUndeclaredThrowableException;
      }
    }
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpUriRequest, paramResponseHandler, null);
  }
  
  public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    HttpHost localHttpHost = determineTarget(paramHttpUriRequest);
    return execute(localHttpHost, paramHttpUriRequest, paramResponseHandler, paramHttpContext);
  }
  
  public CloseableHttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    ((HttpContext)null);
    return doExecute(paramHttpHost, paramHttpRequest, null);
  }
  
  public CloseableHttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return doExecute(paramHttpHost, paramHttpRequest, paramHttpContext);
  }
  
  public CloseableHttpResponse execute(HttpUriRequest paramHttpUriRequest)
  {
    ((HttpContext)null);
    return execute(paramHttpUriRequest, null);
  }
  
  public CloseableHttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpUriRequest, "HTTP request");
    HttpHost localHttpHost = determineTarget(paramHttpUriRequest);
    return doExecute(localHttpHost, paramHttpUriRequest, paramHttpContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\CloseableHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */