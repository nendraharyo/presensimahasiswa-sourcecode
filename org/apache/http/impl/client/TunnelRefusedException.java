package org.apache.http.impl.client;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

public class TunnelRefusedException
  extends HttpException
{
  private static final long serialVersionUID = -8646722842745617323L;
  private final HttpResponse response;
  
  public TunnelRefusedException(String paramString, HttpResponse paramHttpResponse)
  {
    super(paramString);
    this.response = paramHttpResponse;
  }
  
  public HttpResponse getResponse()
  {
    return this.response;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\TunnelRefusedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */