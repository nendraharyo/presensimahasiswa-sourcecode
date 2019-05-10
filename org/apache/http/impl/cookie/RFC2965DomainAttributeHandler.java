package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class RFC2965DomainAttributeHandler
  implements CookieAttributeHandler
{
  public boolean domainMatch(String paramString1, String paramString2)
  {
    boolean bool = paramString1.equals(paramString2);
    String str;
    if (!bool)
    {
      str = ".";
      bool = paramString2.startsWith(str);
      if (bool)
      {
        bool = paramString1.endsWith(paramString2);
        if (!bool) {}
      }
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
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    boolean bool1 = false;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str = paramCookieOrigin.getHost();
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    localObject = paramCookie.getDomain();
    boolean bool2 = domainMatch(str, (String)localObject);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      int i = str.length();
      int j = ((String)localObject).length();
      j = i - j;
      str = str.substring(0, j);
      int k = str.indexOf('.');
      j = -1;
      if (k == j) {
        bool1 = true;
      }
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject1 = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject1).<init>("Missing value for domain attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramString.trim();
    int i = ((String)localObject1).length();
    if (i == 0)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject1).<init>("Blank value for domain attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = Locale.ENGLISH;
    localObject1 = paramString.toLowerCase((Locale)localObject1);
    Object localObject2 = ".";
    boolean bool = paramString.startsWith((String)localObject2);
    if (!bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      char c = '.';
      localObject2 = ((StringBuilder)localObject2).append(c);
      localObject1 = (String)localObject1;
    }
    paramSetCookie.setDomain((String)localObject1);
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    int i = 46;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject1 = paramCookieOrigin.getHost();
    Object localObject2 = Locale.ENGLISH;
    localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
    localObject1 = paramCookie.getDomain();
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject1).<init>("Invalid cookie state: domain not specified");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramCookie.getDomain();
    Object localObject3 = Locale.ENGLISH;
    localObject3 = ((String)localObject1).toLowerCase((Locale)localObject3);
    boolean bool1 = paramCookie instanceof ClientCookie;
    String str;
    if (bool1)
    {
      localObject1 = paramCookie;
      localObject1 = (ClientCookie)paramCookie;
      str = "domain";
      bool1 = ((ClientCookie)localObject1).containsAttribute(str);
      if (bool1)
      {
        localObject1 = ".";
        bool1 = ((String)localObject3).startsWith((String)localObject1);
        if (!bool1)
        {
          localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
          localObject3 = ((Cookie)paramCookie).getDomain();
          localObject2 = (String)localObject3 + "\" violates RFC 2109: domain must start with a dot";
          ((CookieRestrictionViolationException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        int j = ((String)localObject3).indexOf(i, 1);
        if (j >= 0)
        {
          m = ((String)localObject3).length() + -1;
          if (j != m) {}
        }
        else
        {
          localObject1 = ".local";
          bool2 = ((String)localObject3).equals(localObject1);
          if (!bool2)
          {
            localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
            localObject3 = ((Cookie)paramCookie).getDomain();
            localObject2 = (String)localObject3 + "\" violates RFC 2965: the value contains no embedded dots " + "and the value is not .local";
            ((CookieRestrictionViolationException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        boolean bool2 = domainMatch((String)localObject2, (String)localObject3);
        if (!bool2)
        {
          localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
          localObject3 = ((Cookie)paramCookie).getDomain();
          localObject2 = (String)localObject3 + "\" violates RFC 2965: effective host name does not " + "domain-match domain attribute.";
          ((CookieRestrictionViolationException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        int m = ((String)localObject2).length();
        int n = ((String)localObject3).length();
        n = m - n;
        localObject1 = ((String)localObject2).substring(0, n);
        int k = ((String)localObject1).indexOf(i);
        int i1 = -1;
        if (k == i1) {
          return;
        }
        localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
        localObject3 = ((Cookie)paramCookie).getDomain();
        localObject2 = (String)localObject3 + "\" violates RFC 2965: " + "effective host minus domain may not contain any dots";
        ((CookieRestrictionViolationException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = ((Cookie)paramCookie).getDomain();
    boolean bool3 = ((String)localObject1).equals(localObject2);
    if (!bool3)
    {
      localObject1 = new org/apache/http/cookie/CookieRestrictionViolationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Illegal domain attribute: \"");
      str = ((Cookie)paramCookie).getDomain();
      localObject2 = str + "\"." + "Domain of origin: \"" + (String)localObject2 + "\"";
      ((CookieRestrictionViolationException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2965DomainAttributeHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */