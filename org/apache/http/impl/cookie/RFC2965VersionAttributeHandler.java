package org.apache.http.impl.cookie;

import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.util.Args;

public class RFC2965VersionAttributeHandler
  implements CookieAttributeHandler
{
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    return true;
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject);
    if (paramString == null)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Missing value for version attribute");
      throw ((Throwable)localObject);
    }
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i;
      for (;;)
      {
        i = -1;
      }
      paramSetCookie.setVersion(i);
    }
    if (i < 0)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Invalid cookie version.");
      throw ((Throwable)localObject);
    }
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Object localObject = "Cookie";
    Args.notNull(paramCookie, (String)localObject);
    boolean bool = paramCookie instanceof SetCookie2;
    if (bool)
    {
      bool = paramCookie instanceof ClientCookie;
      if (bool)
      {
        paramCookie = (ClientCookie)paramCookie;
        localObject = "version";
        bool = paramCookie.containsAttribute((String)localObject);
        if (!bool)
        {
          localObject = new org/apache/http/cookie/CookieRestrictionViolationException;
          ((CookieRestrictionViolationException)localObject).<init>("Violates RFC 2965. Version attribute is required.");
          throw ((Throwable)localObject);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2965VersionAttributeHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */