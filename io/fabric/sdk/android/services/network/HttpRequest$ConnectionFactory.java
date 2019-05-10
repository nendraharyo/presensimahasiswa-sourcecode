package io.fabric.sdk.android.services.network;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public abstract interface HttpRequest$ConnectionFactory
{
  public static final ConnectionFactory DEFAULT;
  
  static
  {
    HttpRequest.ConnectionFactory.1 local1 = new io/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory$1;
    local1.<init>();
    DEFAULT = local1;
  }
  
  public abstract HttpURLConnection create(URL paramURL);
  
  public abstract HttpURLConnection create(URL paramURL, Proxy paramProxy);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$ConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */