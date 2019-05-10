package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

public abstract class HttpRequestBase
  extends AbstractExecutionAwareRequest
  implements Configurable, HttpUriRequest
{
  private RequestConfig config;
  private URI uri;
  private ProtocolVersion version;
  
  public RequestConfig getConfig()
  {
    return this.config;
  }
  
  public abstract String getMethod();
  
  public ProtocolVersion getProtocolVersion()
  {
    ProtocolVersion localProtocolVersion = this.version;
    if (localProtocolVersion != null) {}
    for (localProtocolVersion = this.version;; localProtocolVersion = HttpProtocolParams.getVersion(getParams())) {
      return localProtocolVersion;
    }
  }
  
  public RequestLine getRequestLine()
  {
    String str1 = getMethod();
    ProtocolVersion localProtocolVersion = getProtocolVersion();
    Object localObject = getURI();
    String str2 = null;
    if (localObject != null) {
      str2 = ((URI)localObject).toASCIIString();
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
  
  public void releaseConnection()
  {
    reset();
  }
  
  public void setConfig(RequestConfig paramRequestConfig)
  {
    this.config = paramRequestConfig;
  }
  
  public void setProtocolVersion(ProtocolVersion paramProtocolVersion)
  {
    this.version = paramProtocolVersion;
  }
  
  public void setURI(URI paramURI)
  {
    this.uri = paramURI;
  }
  
  public void started() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getMethod();
    localStringBuilder = localStringBuilder.append((String)localObject).append(" ");
    localObject = getURI();
    localStringBuilder = localStringBuilder.append(localObject).append(" ");
    localObject = getProtocolVersion();
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpRequestBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */