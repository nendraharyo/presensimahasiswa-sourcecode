package org.apache.http.client;

public class HttpResponseException
  extends ClientProtocolException
{
  private static final long serialVersionUID = -7186627969477257933L;
  private final int statusCode;
  
  public HttpResponseException(int paramInt, String paramString)
  {
    super(paramString);
    this.statusCode = paramInt;
  }
  
  public int getStatusCode()
  {
    return this.statusCode;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\HttpResponseException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */