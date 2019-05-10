package org.apache.http.impl.cookie;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.util.Args;

public class NetscapeDomainHandler
  extends BasicDomainHandler
{
  private static boolean isSpecialDomain(String paramString)
  {
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toUpperCase((Locale)localObject);
    String str = ".COM";
    boolean bool1 = ((String)localObject).endsWith(str);
    if (!bool1)
    {
      str = ".EDU";
      bool1 = ((String)localObject).endsWith(str);
      if (!bool1)
      {
        str = ".NET";
        bool1 = ((String)localObject).endsWith(str);
        if (!bool1)
        {
          str = ".GOV";
          bool1 = ((String)localObject).endsWith(str);
          if (!bool1)
          {
            str = ".MIL";
            bool1 = ((String)localObject).endsWith(str);
            if (!bool1)
            {
              str = ".ORG";
              bool1 = ((String)localObject).endsWith(str);
              if (!bool1)
              {
                str = ".INT";
                bool2 = ((String)localObject).endsWith(str);
                if (!bool2) {
                  break label109;
                }
              }
            }
          }
        }
      }
    }
    boolean bool2 = true;
    for (;;)
    {
      return bool2;
      label109:
      bool2 = false;
      localObject = null;
    }
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str1 = paramCookieOrigin.getHost();
    String str2 = paramCookie.getDomain();
    boolean bool;
    if (str2 == null)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      bool = str1.endsWith(str2);
    }
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    super.validate(paramCookie, paramCookieOrigin);
    Object localObject1 = paramCookieOrigin.getHost();
    String str = paramCookie.getDomain();
    Object localObject2 = ".";
    boolean bool1 = ((String)localObject1).contains((CharSequence)localObject2);
    if (bool1)
    {
      localObject1 = new java/util/StringTokenizer;
      localObject2 = ".";
      ((StringTokenizer)localObject1).<init>(str, (String)localObject2);
      int i = ((StringTokenizer)localObject1).countTokens();
      boolean bool2 = isSpecialDomain(str);
      int j;
      if (bool2)
      {
        j = 2;
        if (i < j)
        {
          localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Domain attribute \"" + str + "\" violates the Netscape cookie specification for " + "special domains";
          ((CookieRestrictionViolationException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        j = 3;
        if (i < j)
        {
          localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Domain attribute \"" + str + "\" violates the Netscape cookie specification";
          ((CookieRestrictionViolationException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\NetscapeDomainHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */