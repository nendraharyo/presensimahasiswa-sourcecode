package io.fabric.sdk.android.services.network;

import java.io.IOException;

public class HttpRequest$HttpRequestException
  extends RuntimeException
{
  private static final long serialVersionUID = -1170466989781746231L;
  
  protected HttpRequest$HttpRequestException(IOException paramIOException)
  {
    super(paramIOException);
  }
  
  public IOException getCause()
  {
    return (IOException)super.getCause();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$HttpRequestException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */