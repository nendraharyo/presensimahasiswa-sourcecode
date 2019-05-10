package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpParams;

public class HttpRequestWrapper
  extends AbstractHttpMessage
  implements HttpUriRequest
{
  private final String method;
  private final HttpRequest original;
  private URI uri;
  private ProtocolVersion version;
  
  private HttpRequestWrapper(HttpRequest paramHttpRequest)
  {
    this.original = paramHttpRequest;
    Object localObject = this.original.getRequestLine().getProtocolVersion();
    this.version = ((ProtocolVersion)localObject);
    localObject = this.original.getRequestLine().getMethod();
    this.method = ((String)localObject);
    boolean bool = paramHttpRequest instanceof HttpUriRequest;
    if (bool)
    {
      localObject = paramHttpRequest;
      localObject = ((HttpUriRequest)paramHttpRequest).getURI();
    }
    for (this.uri = ((URI)localObject);; this.uri = null)
    {
      localObject = ((HttpRequest)paramHttpRequest).getAllHeaders();
      setHeaders((Header[])localObject);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public static HttpRequestWrapper wrap(HttpRequest paramHttpRequest)
  {
    boolean bool;
    Object localObject;
    if (paramHttpRequest == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (HttpRequestWrapper)localObject;
      bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
      if (bool)
      {
        localObject = new org/apache/http/client/methods/HttpRequestWrapper$HttpEntityEnclosingRequestWrapper;
        paramHttpRequest = (HttpEntityEnclosingRequest)paramHttpRequest;
        ((HttpRequestWrapper.HttpEntityEnclosingRequestWrapper)localObject).<init>(paramHttpRequest);
      }
      else
      {
        localObject = new org/apache/http/client/methods/HttpRequestWrapper;
        ((HttpRequestWrapper)localObject).<init>(paramHttpRequest);
      }
    }
  }
  
  public void abort()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public HttpRequest getOriginal()
  {
    return this.original;
  }
  
  public HttpParams getParams()
  {
    HttpParams localHttpParams = this.params;
    if (localHttpParams == null)
    {
      localHttpParams = this.original.getParams().copy();
      this.params = localHttpParams;
    }
    return this.params;
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    ProtocolVersion localProtocolVersion = this.version;
    if (localProtocolVersion != null) {}
    for (localProtocolVersion = this.version;; localProtocolVersion = this.original.getProtocolVersion()) {
      return localProtocolVersion;
    }
  }
  
  public RequestLine getRequestLine()
  {
    Object localObject = this.uri;
    if (localObject != null) {}
    for (localObject = this.uri.toASCIIString();; localObject = this.original.getRequestLine().getUri())
    {
      if (localObject != null)
      {
        int i = ((String)localObject).length();
        if (i != 0) {}
      }
      else
      {
        localObject = "/";
      }
      BasicRequestLine localBasicRequestLine = new org/apache/http/message/BasicRequestLine;
      String str = this.method;
      ProtocolVersion localProtocolVersion = getProtocolVersion();
      localBasicRequestLine.<init>(str, (String)localObject, localProtocolVersion);
      return localBasicRequestLine;
    }
  }
  
  public URI getURI()
  {
    return this.uri;
  }
  
  public boolean isAborted()
  {
    return false;
  }
  
  public void setProtocolVersion(ProtocolVersion paramProtocolVersion)
  {
    this.version = paramProtocolVersion;
  }
  
  public void setURI(URI paramURI)
  {
    this.uri = paramURI;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getRequestLine();
    localStringBuilder = localStringBuilder.append(localObject).append(" ");
    localObject = this.headergroup;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpRequestWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */