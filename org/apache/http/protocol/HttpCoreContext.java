package org.apache.http.protocol;

import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.util.Args;

public class HttpCoreContext
  implements HttpContext
{
  public static final String HTTP_CONNECTION = "http.connection";
  public static final String HTTP_REQUEST = "http.request";
  public static final String HTTP_REQ_SENT = "http.request_sent";
  public static final String HTTP_RESPONSE = "http.response";
  public static final String HTTP_TARGET_HOST = "http.target_host";
  private final HttpContext context;
  
  public HttpCoreContext()
  {
    BasicHttpContext localBasicHttpContext = new org/apache/http/protocol/BasicHttpContext;
    localBasicHttpContext.<init>();
    this.context = localBasicHttpContext;
  }
  
  public HttpCoreContext(HttpContext paramHttpContext)
  {
    this.context = paramHttpContext;
  }
  
  public static HttpCoreContext adapt(HttpContext paramHttpContext)
  {
    Object localObject = "HTTP context";
    Args.notNull(paramHttpContext, (String)localObject);
    boolean bool = paramHttpContext instanceof HttpCoreContext;
    if (bool) {}
    for (paramHttpContext = (HttpCoreContext)paramHttpContext;; paramHttpContext = (HttpContext)localObject)
    {
      return paramHttpContext;
      localObject = new org/apache/http/protocol/HttpCoreContext;
      ((HttpCoreContext)localObject).<init>(paramHttpContext);
    }
  }
  
  public static HttpCoreContext create()
  {
    HttpCoreContext localHttpCoreContext = new org/apache/http/protocol/HttpCoreContext;
    BasicHttpContext localBasicHttpContext = new org/apache/http/protocol/BasicHttpContext;
    localBasicHttpContext.<init>();
    localHttpCoreContext.<init>(localBasicHttpContext);
    return localHttpCoreContext;
  }
  
  public Object getAttribute(String paramString)
  {
    return this.context.getAttribute(paramString);
  }
  
  public Object getAttribute(String paramString, Class paramClass)
  {
    Args.notNull(paramClass, "Attribute class");
    Object localObject = getAttribute(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = paramClass.cast(localObject)) {
      return localObject;
    }
  }
  
  public HttpConnection getConnection()
  {
    return (HttpConnection)getAttribute("http.connection", HttpConnection.class);
  }
  
  public HttpConnection getConnection(Class paramClass)
  {
    return (HttpConnection)getAttribute("http.connection", paramClass);
  }
  
  public HttpRequest getRequest()
  {
    return (HttpRequest)getAttribute("http.request", HttpRequest.class);
  }
  
  public HttpResponse getResponse()
  {
    return (HttpResponse)getAttribute("http.response", HttpResponse.class);
  }
  
  public HttpHost getTargetHost()
  {
    return (HttpHost)getAttribute("http.target_host", HttpHost.class);
  }
  
  public boolean isRequestSent()
  {
    Class localClass = Boolean.class;
    Boolean localBoolean = (Boolean)getAttribute("http.request_sent", localClass);
    boolean bool;
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localBoolean = null;
    }
  }
  
  public Object removeAttribute(String paramString)
  {
    return this.context.removeAttribute(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    this.context.setAttribute(paramString, paramObject);
  }
  
  public void setTargetHost(HttpHost paramHttpHost)
  {
    setAttribute("http.target_host", paramHttpHost);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpCoreContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */