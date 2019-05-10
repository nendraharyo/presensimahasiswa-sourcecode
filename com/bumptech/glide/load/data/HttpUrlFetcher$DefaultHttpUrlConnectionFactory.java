package com.bumptech.glide.load.data;

import java.net.HttpURLConnection;
import java.net.URL;

class HttpUrlFetcher$DefaultHttpUrlConnectionFactory
  implements HttpUrlFetcher.HttpUrlConnectionFactory
{
  public HttpURLConnection build(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\HttpUrlFetcher$DefaultHttpUrlConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */