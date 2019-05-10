package com.loopj.android.http;

import b.a.a.a.b.c.e;
import java.net.URI;

public final class HttpGet
  extends e
{
  public static final String METHOD_NAME = "GET";
  
  public HttpGet() {}
  
  public HttpGet(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpGet(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "GET";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\HttpGet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */