package io.fabric.sdk.android.services.network;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class HttpRequest$ConnectionFactory$1
  implements HttpRequest.ConnectionFactory
{
  public HttpURLConnection create(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public HttpURLConnection create(URL paramURL, Proxy paramProxy)
  {
    return (HttpURLConnection)paramURL.openConnection(paramProxy);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$ConnectionFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */