package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.util.Args;

public abstract class CookieSpecBase
  extends AbstractCookieSpec
{
  protected static String getDefaultDomain(CookieOrigin paramCookieOrigin)
  {
    return paramCookieOrigin.getHost();
  }
  
  protected static String getDefaultPath(CookieOrigin paramCookieOrigin)
  {
    String str1 = paramCookieOrigin.getPath();
    int i = str1.lastIndexOf('/');
    if (i >= 0) {
      if (i == 0) {
        i = 1;
      }
    }
    for (String str2 = str1.substring(0, i);; str2 = str1) {
      return str2;
    }
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject = getAttribHandlers();
    Iterator localIterator = ((Collection)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (CookieAttributeHandler)localIterator.next();
      bool = ((CookieAttributeHandler)localObject).match(paramCookie, paramCookieOrigin);
    } while (bool);
    boolean bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  protected List parse(HeaderElement[] paramArrayOfHeaderElement, CookieOrigin paramCookieOrigin)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOfHeaderElement.length;
    localArrayList.<init>(i);
    int j = paramArrayOfHeaderElement.length;
    i = 0;
    Object localObject1 = null;
    for (int k = 0; k < j; k = i)
    {
      localObject1 = paramArrayOfHeaderElement[k];
      Object localObject2 = ((HeaderElement)localObject1).getName();
      String str = ((HeaderElement)localObject1).getValue();
      if (localObject2 != null)
      {
        int m = ((String)localObject2).length();
        if (m != 0) {}
      }
      else
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        ((MalformedCookieException)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
      }
      BasicClientCookie localBasicClientCookie = new org/apache/http/impl/cookie/BasicClientCookie;
      localBasicClientCookie.<init>((String)localObject2, str);
      localObject2 = getDefaultPath(paramCookieOrigin);
      localBasicClientCookie.setPath((String)localObject2);
      localObject2 = getDefaultDomain(paramCookieOrigin);
      localBasicClientCookie.setDomain((String)localObject2);
      localObject2 = ((HeaderElement)localObject1).getParameters();
      i = localObject2.length + -1;
      while (i >= 0)
      {
        str = localObject2[i];
        Object localObject3 = str.getName();
        Object localObject4 = Locale.ENGLISH;
        localObject3 = ((String)localObject3).toLowerCase((Locale)localObject4);
        localObject4 = str.getValue();
        localBasicClientCookie.setAttribute((String)localObject3, (String)localObject4);
        localObject3 = findAttribHandler((String)localObject3);
        if (localObject3 != null)
        {
          str = str.getValue();
          ((CookieAttributeHandler)localObject3).parse(localBasicClientCookie, str);
        }
        i += -1;
      }
      localArrayList.add(localBasicClientCookie);
      i = k + 1;
    }
    return localArrayList;
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject = getAttribHandlers();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (CookieAttributeHandler)localIterator.next();
      ((CookieAttributeHandler)localObject).validate(paramCookie, paramCookieOrigin);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\CookieSpecBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */