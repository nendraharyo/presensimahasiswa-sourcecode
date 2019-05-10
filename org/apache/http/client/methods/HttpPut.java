package org.apache.http.client.methods;

import java.net.URI;

public class HttpPut
  extends HttpEntityEnclosingRequestBase
{
  public static final String METHOD_NAME = "PUT";
  
  public HttpPut() {}
  
  public HttpPut(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpPut(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "PUT";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpPut.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */