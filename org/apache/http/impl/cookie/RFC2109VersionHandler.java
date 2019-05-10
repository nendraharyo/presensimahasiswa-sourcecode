package org.apache.http.impl.cookie;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class RFC2109VersionHandler
  extends AbstractCookieAttributeHandler
{
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
    localObject = paramString.trim();
    int i = ((String)localObject).length();
    if (i == 0)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Blank value for version attribute");
      throw ((Throwable)localObject);
    }
    try
    {
      i = Integer.parseInt(paramString);
      paramSetCookie.setVersion(i);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      MalformedCookieException localMalformedCookieException = new org/apache/http/cookie/MalformedCookieException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("Invalid version: ");
      String str = localNumberFormatException.getMessage();
      str = str;
      localMalformedCookieException.<init>(str);
      throw localMalformedCookieException;
    }
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Object localObject = "Cookie";
    Args.notNull(paramCookie, (String)localObject);
    int i = paramCookie.getVersion();
    if (i < 0)
    {
      localObject = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject).<init>("Cookie version may not be negative");
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2109VersionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */