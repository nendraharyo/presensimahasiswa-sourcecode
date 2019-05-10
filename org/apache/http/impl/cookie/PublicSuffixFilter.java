package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.client.utils.Punycode;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;

public class PublicSuffixFilter
  implements CookieAttributeHandler
{
  private Set exceptions;
  private Set suffixes;
  private final CookieAttributeHandler wrapped;
  
  public PublicSuffixFilter(CookieAttributeHandler paramCookieAttributeHandler)
  {
    this.wrapped = paramCookieAttributeHandler;
  }
  
  private boolean isForPublicSuffix(Cookie paramCookie)
  {
    int i = 1;
    String str1 = paramCookie.getDomain();
    Object localObject = ".";
    boolean bool1 = str1.startsWith((String)localObject);
    if (bool1) {
      str1 = str1.substring(i);
    }
    str1 = Punycode.toUnicode(str1);
    localObject = this.exceptions;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.exceptions;
      bool1 = ((Set)localObject).contains(str1);
      if (bool1)
      {
        bool2 = false;
        str1 = null;
      }
    }
    for (;;)
    {
      return bool2;
      localObject = this.suffixes;
      if (localObject == null)
      {
        bool2 = false;
        str1 = null;
      }
      else
      {
        label96:
        localObject = this.suffixes;
        bool1 = ((Set)localObject).contains(str1);
        if (!bool1) {
          break;
        }
        bool2 = i;
      }
    }
    localObject = "*.";
    bool1 = str1.startsWith((String)localObject);
    if (bool1)
    {
      j = 2;
      str1 = str1.substring(j);
    }
    int j = str1.indexOf('.');
    int k = -1;
    if (j == k) {}
    for (;;)
    {
      bool2 = false;
      str1 = null;
      break;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "*";
      localStringBuilder = localStringBuilder.append(str2);
      str1 = str1.substring(j);
      str1 = str1;
      j = str1.length();
      if (j > 0) {
        break label96;
      }
    }
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    boolean bool = isForPublicSuffix(paramCookie);
    CookieAttributeHandler localCookieAttributeHandler;
    if (bool)
    {
      bool = false;
      localCookieAttributeHandler = null;
    }
    for (;;)
    {
      return bool;
      localCookieAttributeHandler = this.wrapped;
      bool = localCookieAttributeHandler.match(paramCookie, paramCookieOrigin);
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    this.wrapped.parse(paramSetCookie, paramString);
  }
  
  public void setExceptions(Collection paramCollection)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>(paramCollection);
    this.exceptions = localHashSet;
  }
  
  public void setPublicSuffixes(Collection paramCollection)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>(paramCollection);
    this.suffixes = localHashSet;
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    this.wrapped.validate(paramCookie, paramCookieOrigin);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\PublicSuffixFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */