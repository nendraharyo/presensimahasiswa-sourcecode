package org.apache.http.impl.cookie;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

public class BasicPathHandler
  implements CookieAttributeHandler
{
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    int i = 1;
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    String str1 = paramCookieOrigin.getPath();
    String str2 = paramCookie.getPath();
    if (str2 == null) {
      str2 = "/";
    }
    int j = str2.length();
    if (j > i)
    {
      String str3 = "/";
      boolean bool1 = str2.endsWith(str3);
      if (bool1)
      {
        int k = str2.length() + -1;
        str2 = str2.substring(0, k);
      }
    }
    boolean bool2 = str1.startsWith(str2);
    int i2;
    int m;
    if (bool2)
    {
      int n = str1.length();
      int i1 = str2.length();
      if (n != i1)
      {
        String str4 = "/";
        boolean bool3 = str2.endsWith(str4);
        if (!bool3)
        {
          i2 = str2.length();
          i2 = str1.charAt(i2);
          m = 47;
          if (i2 == m) {
            i2 = i;
          }
        }
      }
    }
    for (;;)
    {
      return i2;
      int i3 = 0;
      str2 = null;
      continue;
      i3 = m;
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    String str = "Cookie";
    Args.notNull(paramSetCookie, str);
    boolean bool = TextUtils.isBlank(paramString);
    if (!bool) {}
    for (;;)
    {
      paramSetCookie.setPath(paramString);
      return;
      paramString = "/";
    }
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    boolean bool = match(paramCookie, paramCookieOrigin);
    if (!bool)
    {
      CookieRestrictionViolationException localCookieRestrictionViolationException = new org/apache/http/cookie/CookieRestrictionViolationException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Illegal path attribute \"");
      String str = paramCookie.getPath();
      localObject = ((StringBuilder)localObject).append(str).append("\". Path of origin: \"");
      str = paramCookieOrigin.getPath();
      localObject = str + "\"";
      localCookieRestrictionViolationException.<init>((String)localObject);
      throw localCookieRestrictionViolationException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicPathHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */