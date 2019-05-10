package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class RFC2109DomainHandler
  implements CookieAttributeHandler
{
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    boolean bool1 = false;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str1 = paramCookieOrigin.getHost();
    String str2 = paramCookie.getDomain();
    if (str2 == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        String str3 = ".";
        bool2 = str2.startsWith(str3);
        if (bool2)
        {
          boolean bool3 = str1.endsWith(str2);
          if (!bool3) {}
        }
      }
      else
      {
        bool1 = true;
      }
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
    int i = -1;
    int j = 46;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject1 = paramCookieOrigin.getHost();
    String str = paramCookie.getDomain();
    if (str == null)
    {
      localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject1).<init>("Cookie domain may not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool1 = str.equals(localObject1);
    if (!bool1)
    {
      int k = str.indexOf(j);
      StringBuilder localStringBuilder;
      if (k == i)
      {
        localObject2 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Domain attribute \"" + str + "\" does not match the host \"" + (String)localObject1 + "\"";
        ((CookieRestrictionViolationException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      Object localObject2 = ".";
      boolean bool2 = str.startsWith((String)localObject2);
      if (!bool2)
      {
        localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: domain must start with a dot";
        ((CookieRestrictionViolationException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
      int m = str.indexOf(j, 1);
      if (m >= 0)
      {
        n = str.length() + -1;
        if (m != n) {}
      }
      else
      {
        localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: domain must contain an embedded dot";
        ((CookieRestrictionViolationException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
      localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      boolean bool3 = ((String)localObject1).endsWith(str);
      if (!bool3)
      {
        localObject2 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Illegal domain attribute \"" + str + "\". Domain of origin: \"" + (String)localObject1 + "\"";
        ((CookieRestrictionViolationException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      bool3 = false;
      localObject2 = null;
      int n = ((String)localObject1).length();
      int i1 = str.length();
      n -= i1;
      localObject1 = ((String)localObject1).substring(0, n);
      int i2 = ((String)localObject1).indexOf(j);
      if (i2 != i)
      {
        localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: host minus domain may not contain any dots";
        ((CookieRestrictionViolationException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2109DomainHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */