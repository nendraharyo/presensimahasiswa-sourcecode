package org.apache.http.impl.cookie;

import java.util.Iterator;
import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BestMatchSpec
  implements CookieSpec
{
  private BrowserCompatSpec compat;
  private final String[] datepatterns;
  private RFC2109Spec obsoleteStrict;
  private final boolean oneHeader;
  private RFC2965Spec strict;
  
  public BestMatchSpec()
  {
    this(null, false);
  }
  
  public BestMatchSpec(String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null) {}
    for (String[] arrayOfString = null;; arrayOfString = (String[])paramArrayOfString.clone())
    {
      this.datepatterns = arrayOfString;
      this.oneHeader = paramBoolean;
      return;
    }
  }
  
  private BrowserCompatSpec getCompat()
  {
    BrowserCompatSpec localBrowserCompatSpec = this.compat;
    if (localBrowserCompatSpec == null)
    {
      localBrowserCompatSpec = new org/apache/http/impl/cookie/BrowserCompatSpec;
      String[] arrayOfString = this.datepatterns;
      localBrowserCompatSpec.<init>(arrayOfString);
      this.compat = localBrowserCompatSpec;
    }
    return this.compat;
  }
  
  private RFC2109Spec getObsoleteStrict()
  {
    RFC2109Spec localRFC2109Spec = this.obsoleteStrict;
    if (localRFC2109Spec == null)
    {
      localRFC2109Spec = new org/apache/http/impl/cookie/RFC2109Spec;
      String[] arrayOfString = this.datepatterns;
      boolean bool = this.oneHeader;
      localRFC2109Spec.<init>(arrayOfString, bool);
      this.obsoleteStrict = localRFC2109Spec;
    }
    return this.obsoleteStrict;
  }
  
  private RFC2965Spec getStrict()
  {
    RFC2965Spec localRFC2965Spec = this.strict;
    if (localRFC2965Spec == null)
    {
      localRFC2965Spec = new org/apache/http/impl/cookie/RFC2965Spec;
      String[] arrayOfString = this.datepatterns;
      boolean bool = this.oneHeader;
      localRFC2965Spec.<init>(arrayOfString, bool);
      this.strict = localRFC2965Spec;
    }
    return this.strict;
  }
  
  public List formatCookies(List paramList)
  {
    Object localObject = "List of cookies";
    Args.notNull(paramList, (String)localObject);
    boolean bool1 = true;
    Iterator localIterator = paramList.iterator();
    int j = -1 >>> 1;
    boolean bool2 = bool1;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (Cookie)localIterator.next();
      boolean bool3 = localObject instanceof SetCookie2;
      if (!bool3) {
        bool2 = false;
      }
      int k = ((Cookie)localObject).getVersion();
      if (k >= j) {
        break label143;
      }
    }
    label143:
    for (int i = ((Cookie)localObject).getVersion();; i = j)
    {
      j = i;
      break;
      if (j > 0) {
        if (bool2) {
          localObject = getStrict().formatCookies(paramList);
        }
      }
      for (;;)
      {
        return (List)localObject;
        localObject = getObsoleteStrict().formatCookies(paramList);
        continue;
        localObject = getCompat().formatCookies(paramList);
      }
    }
  }
  
  public int getVersion()
  {
    return getStrict().getVersion();
  }
  
  public Header getVersionHeader()
  {
    return getStrict().getVersionHeader();
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Object localObject = "Cookie origin";
    Args.notNull(paramCookieOrigin, (String)localObject);
    int i = paramCookie.getVersion();
    boolean bool;
    if (i > 0)
    {
      bool = paramCookie instanceof SetCookie2;
      if (bool)
      {
        localObject = getStrict();
        bool = ((RFC2965Spec)localObject).match((Cookie)paramCookie, paramCookieOrigin);
      }
    }
    for (;;)
    {
      return bool;
      localObject = getObsoleteStrict();
      bool = ((RFC2109Spec)localObject).match(paramCookie, paramCookieOrigin);
      continue;
      localObject = getCompat();
      bool = ((BrowserCompatSpec)localObject).match(paramCookie, paramCookieOrigin);
    }
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    boolean bool1 = true;
    Args.notNull(paramHeader, "Header");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    HeaderElement[] arrayOfHeaderElement = paramHeader.getElements();
    int i = arrayOfHeaderElement.length;
    int j = 0;
    NetscapeDraftHeaderParser localNetscapeDraftHeaderParser = null;
    int k = 0;
    CharArrayBuffer localCharArrayBuffer = null;
    boolean bool2 = false;
    Object localObject1 = null;
    while (j < i)
    {
      Object localObject2 = arrayOfHeaderElement[j];
      Object localObject3 = ((HeaderElement)localObject2).getParameterByName("version");
      if (localObject3 != null) {
        bool2 = bool1;
      }
      localObject3 = "expires";
      localObject2 = ((HeaderElement)localObject2).getParameterByName((String)localObject3);
      if (localObject2 != null) {
        k = bool1;
      }
      j += 1;
    }
    int m;
    Object localObject4;
    if ((k != 0) || (!bool2))
    {
      localNetscapeDraftHeaderParser = NetscapeDraftHeaderParser.DEFAULT;
      bool2 = paramHeader instanceof FormattedHeader;
      if (bool2)
      {
        localObject1 = paramHeader;
        localCharArrayBuffer = ((FormattedHeader)paramHeader).getBuffer();
        localObject1 = new org/apache/http/message/ParserCursor;
        paramHeader = (FormattedHeader)paramHeader;
        m = paramHeader.getValuePos();
        i = localCharArrayBuffer.length();
        ((ParserCursor)localObject1).<init>(m, i);
        localObject4 = new HeaderElement[bool1];
        localObject1 = localNetscapeDraftHeaderParser.parseHeader(localCharArrayBuffer, (ParserCursor)localObject1);
        localObject4[0] = localObject1;
        localObject1 = getCompat().parse((HeaderElement[])localObject4, paramCookieOrigin);
      }
    }
    for (;;)
    {
      return (List)localObject1;
      localObject1 = paramHeader.getValue();
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        ((MalformedCookieException)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      m = ((String)localObject1).length();
      localCharArrayBuffer.<init>(m);
      localCharArrayBuffer.append((String)localObject1);
      localObject1 = new org/apache/http/message/ParserCursor;
      m = localCharArrayBuffer.length();
      ((ParserCursor)localObject1).<init>(0, m);
      break;
      localObject1 = "Set-Cookie2";
      localObject4 = paramHeader.getName();
      bool2 = ((String)localObject1).equals(localObject4);
      if (bool2) {
        localObject1 = getStrict().parse(arrayOfHeaderElement, paramCookieOrigin);
      } else {
        localObject1 = getObsoleteStrict().parse(arrayOfHeaderElement, paramCookieOrigin);
      }
    }
  }
  
  public String toString()
  {
    return "best-match";
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Object localObject = "Cookie origin";
    Args.notNull(paramCookieOrigin, (String)localObject);
    int i = paramCookie.getVersion();
    if (i > 0)
    {
      boolean bool = paramCookie instanceof SetCookie2;
      if (bool)
      {
        localObject = getStrict();
        ((RFC2965Spec)localObject).validate((Cookie)paramCookie, paramCookieOrigin);
      }
    }
    for (;;)
    {
      return;
      localObject = getObsoleteStrict();
      ((RFC2109Spec)localObject).validate(paramCookie, paramCookieOrigin);
      continue;
      localObject = getCompat();
      ((BrowserCompatSpec)localObject).validate(paramCookie, paramCookieOrigin);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BestMatchSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */