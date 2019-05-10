package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.Args;

public class RequestWrapper
  extends AbstractHttpMessage
  implements HttpUriRequest
{
  private int execCount;
  private String method;
  private final HttpRequest original;
  private URI uri;
  private ProtocolVersion version;
  
  public RequestWrapper(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    this.original = paramHttpRequest;
    Object localObject1 = paramHttpRequest.getParams();
    setParams((HttpParams)localObject1);
    localObject1 = paramHttpRequest.getAllHeaders();
    setHeaders((Header[])localObject1);
    boolean bool = paramHttpRequest instanceof HttpUriRequest;
    if (bool)
    {
      localObject1 = paramHttpRequest;
      localObject1 = ((HttpUriRequest)paramHttpRequest).getURI();
      this.uri = ((URI)localObject1);
      paramHttpRequest = (HttpUriRequest)paramHttpRequest;
      localObject1 = paramHttpRequest.getMethod();
      this.method = ((String)localObject1);
      bool = false;
      localObject1 = null;
      this.version = null;
    }
    for (;;)
    {
      this.execCount = 0;
      return;
      Object localObject2 = paramHttpRequest.getRequestLine();
      try
      {
        localObject1 = new java/net/URI;
        localObject3 = ((RequestLine)localObject2).getUri();
        ((URI)localObject1).<init>((String)localObject3);
        this.uri = ((URI)localObject1);
        localObject1 = ((RequestLine)localObject2).getMethod();
        this.method = ((String)localObject1);
        localObject1 = paramHttpRequest.getProtocolVersion();
        this.version = ((ProtocolVersion)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Object localObject3 = new org/apache/http/ProtocolException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Invalid request URI: ");
        localObject2 = ((RequestLine)localObject2).getUri();
        localObject2 = (String)localObject2;
        ((ProtocolException)localObject3).<init>((String)localObject2, localURISyntaxException);
        throw ((Throwable)localObject3);
      }
    }
  }
  
  public void abort()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public int getExecCount()
  {
    return this.execCount;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public HttpRequest getOriginal()
  {
    return this.original;
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    ProtocolVersion localProtocolVersion = this.version;
    if (localProtocolVersion == null)
    {
      localProtocolVersion = HttpProtocolParams.getVersion(getParams());
      this.version = localProtocolVersion;
    }
    return this.version;
  }
  
  public RequestLine getRequestLine()
  {
    String str1 = getMethod();
    ProtocolVersion localProtocolVersion = getProtocolVersion();
    String str2 = null;
    Object localObject = this.uri;
    if (localObject != null) {
      str2 = this.uri.toASCIIString();
    }
    if (str2 != null)
    {
      int i = str2.length();
      if (i != 0) {}
    }
    else
    {
      str2 = "/";
    }
    localObject = new org/apache/http/message/BasicRequestLine;
    ((BasicRequestLine)localObject).<init>(str1, str2, localProtocolVersion);
    return (RequestLine)localObject;
  }
  
  public URI getURI()
  {
    return this.uri;
  }
  
  public void incrementExecCount()
  {
    int i = this.execCount + 1;
    this.execCount = i;
  }
  
  public boolean isAborted()
  {
    return false;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public void resetHeaders()
  {
    this.headergroup.clear();
    Header[] arrayOfHeader = this.original.getAllHeaders();
    setHeaders(arrayOfHeader);
  }
  
  public void setMethod(String paramString)
  {
    Args.notNull(paramString, "Method name");
    this.method = paramString;
  }
  
  public void setProtocolVersion(ProtocolVersion paramProtocolVersion)
  {
    this.version = paramProtocolVersion;
  }
  
  public void setURI(URI paramURI)
  {
    this.uri = paramURI;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\RequestWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */