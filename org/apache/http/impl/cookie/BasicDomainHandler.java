package org.apache.http.impl.cookie;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicDomainHandler
  implements CookieAttributeHandler
{
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    boolean bool1 = false;
    int i = 1;
    float f = Float.MIN_VALUE;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str1 = paramCookieOrigin.getHost();
    String str2 = paramCookie.getDomain();
    if (str2 == null) {}
    for (;;)
    {
      return bool1;
      bool2 = str1.equals(str2);
      if (!bool2) {
        break;
      }
      bool1 = i;
    }
    Object localObject = ".";
    boolean bool2 = str2.startsWith((String)localObject);
    if (!bool2)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      char c = '.';
      localObject = ((StringBuilder)localObject).append(c);
      str2 = str2;
    }
    bool2 = str1.endsWith(str2);
    boolean bool3;
    if (!bool2)
    {
      str2 = str2.substring(i);
      bool3 = str1.equals(str2);
      if (!bool3) {}
    }
    else
    {
      bool3 = i;
    }
    for (;;)
    {
      bool1 = bool3;
      break;
      bool3 = false;
      str2 = null;
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject);
    if (paramString == null)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Missing value for domain attribute");
      throw ((Throwable)localObject);
    }
    localObject = paramString.trim();
    int i = ((String)localObject).length();
    if (i == 0)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Blank value for domain attribute");
      throw ((Throwable)localObject);
    }
    paramSetCookie.setDomain(paramString);
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str = paramCookieOrigin.getHost();
    Object localObject1 = paramCookie.getDomain();
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject1).<init>("Cookie domain may not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = ".";
    int i = str.contains((CharSequence)localObject2);
    boolean bool;
    StringBuilder localStringBuilder;
    if (i != 0)
    {
      i = str.endsWith((String)localObject1);
      if (i == 0)
      {
        localObject2 = ".";
        i = ((String)localObject1).startsWith((String)localObject2);
        if (i != 0)
        {
          i = 1;
          int j = ((String)localObject1).length();
          localObject1 = ((String)localObject1).substring(i, j);
        }
        bool = str.equals(localObject1);
        if (!bool)
        {
          localObject2 = new org/apache/http/cookie/CookieRestrictionViolationException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject1 = "Illegal domain attribute \"" + (String)localObject1 + "\". Domain of origin: \"" + str + "\"";
          ((CookieRestrictionViolationException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
    }
    else
    {
      bool = str.equals(localObject1);
      if (!bool)
      {
        localObject2 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Illegal domain attribute \"" + (String)localObject1 + "\". Domain of origin: \"" + str + "\"";
        ((CookieRestrictionViolationException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicDomainHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */