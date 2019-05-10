package com.loopj.android.http;

import b.a.a.a.b.c.e;
import java.net.URI;

public final class HttpDelete
  extends e
{
  public static final String METHOD_NAME = "DELETE";
  
  public HttpDelete() {}
  
  public HttpDelete(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpDelete(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "DELETE";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\HttpDelete.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */