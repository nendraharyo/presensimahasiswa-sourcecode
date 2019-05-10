package org.apache.http.client.methods;

import java.net.URI;

public class HttpHead
  extends HttpRequestBase
{
  public static final String METHOD_NAME = "HEAD";
  
  public HttpHead() {}
  
  public HttpHead(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpHead(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "HEAD";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpHead.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */