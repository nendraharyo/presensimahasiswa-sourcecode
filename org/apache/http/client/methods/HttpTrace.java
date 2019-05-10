package org.apache.http.client.methods;

import java.net.URI;

public class HttpTrace
  extends HttpRequestBase
{
  public static final String METHOD_NAME = "TRACE";
  
  public HttpTrace() {}
  
  public HttpTrace(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpTrace(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "TRACE";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpTrace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */