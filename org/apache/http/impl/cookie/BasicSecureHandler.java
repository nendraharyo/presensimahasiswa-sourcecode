package org.apache.http.impl.cookie;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicSecureHandler
  extends AbstractCookieAttributeHandler
{
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    String str = "Cookie origin";
    Args.notNull(paramCookieOrigin, str);
    boolean bool = paramCookie.isSecure();
    if (bool)
    {
      bool = paramCookieOrigin.isSecure();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Args.notNull(paramSetCookie, "Cookie");
    paramSetCookie.setSecure(true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicSecureHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */