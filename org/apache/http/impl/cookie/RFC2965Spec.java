package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class RFC2965Spec
  extends RFC2109Spec
{
  public RFC2965Spec()
  {
    this(null, false);
  }
  
  public RFC2965Spec(String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramArrayOfString, paramBoolean);
    Object localObject = new org/apache/http/impl/cookie/RFC2965DomainAttributeHandler;
    ((RFC2965DomainAttributeHandler)localObject).<init>();
    registerAttribHandler("domain", (CookieAttributeHandler)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2965PortAttributeHandler;
    ((RFC2965PortAttributeHandler)localObject).<init>();
    registerAttribHandler("port", (CookieAttributeHandler)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2965CommentUrlAttributeHandler;
    ((RFC2965CommentUrlAttributeHandler)localObject).<init>();
    registerAttribHandler("commenturl", (CookieAttributeHandler)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2965DiscardAttributeHandler;
    ((RFC2965DiscardAttributeHandler)localObject).<init>();
    registerAttribHandler("discard", (CookieAttributeHandler)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2965VersionAttributeHandler;
    ((RFC2965VersionAttributeHandler)localObject).<init>();
    registerAttribHandler("version", (CookieAttributeHandler)localObject);
  }
  
  private static CookieOrigin adjustEffectiveHost(CookieOrigin paramCookieOrigin)
  {
    int i = 0;
    String str1 = null;
    String str2 = paramCookieOrigin.getHost();
    int j = 1;
    int k = 0;
    Object localObject = null;
    int m = str2.length();
    if (k < m)
    {
      m = str2.charAt(k);
      int n = 46;
      if (m != n)
      {
        n = 58;
        if (m != n) {
          break label128;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str1 = str2 + ".local";
        localObject = new org/apache/http/cookie/CookieOrigin;
        j = paramCookieOrigin.getPort();
        str2 = paramCookieOrigin.getPath();
        boolean bool = paramCookieOrigin.isSecure();
        ((CookieOrigin)localObject).<init>(str1, j, str2, bool);
        paramCookieOrigin = (CookieOrigin)localObject;
      }
      return paramCookieOrigin;
      label128:
      k += 1;
      break;
      i = j;
    }
  }
  
  private List createCookies(HeaderElement[] paramArrayOfHeaderElement, CookieOrigin paramCookieOrigin)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOfHeaderElement.length;
    localArrayList.<init>(i);
    int k = paramArrayOfHeaderElement.length;
    int j;
    for (int m = 0; m < k; m = j)
    {
      Object localObject1 = paramArrayOfHeaderElement[m];
      Object localObject2 = ((HeaderElement)localObject1).getName();
      Object localObject3 = ((HeaderElement)localObject1).getValue();
      if (localObject2 != null)
      {
        int n = ((String)localObject2).length();
        if (n != 0) {}
      }
      else
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        ((MalformedCookieException)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
      }
      BasicClientCookie2 localBasicClientCookie2 = new org/apache/http/impl/cookie/BasicClientCookie2;
      localBasicClientCookie2.<init>((String)localObject2, (String)localObject3);
      localObject2 = getDefaultPath(paramCookieOrigin);
      localBasicClientCookie2.setPath((String)localObject2);
      localObject2 = getDefaultDomain(paramCookieOrigin);
      localBasicClientCookie2.setDomain((String)localObject2);
      int i1 = 1;
      localObject2 = new int[i1];
      int i2 = paramCookieOrigin.getPort();
      localObject2[0] = i2;
      localBasicClientCookie2.setPorts((int[])localObject2);
      localObject2 = ((HeaderElement)localObject1).getParameters();
      localObject3 = new java/util/HashMap;
      i = localObject2.length;
      ((HashMap)localObject3).<init>(i);
      i = localObject2.length + -1;
      Object localObject4;
      while (i >= 0)
      {
        localObject4 = localObject2[i];
        String str = ((NameValuePair)localObject4).getName();
        Locale localLocale = Locale.ENGLISH;
        str = str.toLowerCase(localLocale);
        ((Map)localObject3).put(str, localObject4);
        i += -1;
      }
      localObject1 = ((Map)localObject3).entrySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (NameValuePair)((Map.Entry)((Iterator)localObject2).next()).getValue();
        localObject3 = ((NameValuePair)localObject1).getName();
        localObject4 = Locale.ENGLISH;
        localObject3 = ((String)localObject3).toLowerCase((Locale)localObject4);
        localObject4 = ((NameValuePair)localObject1).getValue();
        localBasicClientCookie2.setAttribute((String)localObject3, (String)localObject4);
        localObject3 = findAttribHandler((String)localObject3);
        if (localObject3 != null)
        {
          localObject1 = ((NameValuePair)localObject1).getValue();
          ((CookieAttributeHandler)localObject3).parse(localBasicClientCookie2, (String)localObject1);
        }
      }
      localArrayList.add(localBasicClientCookie2);
      j = m + 1;
    }
    return localArrayList;
  }
  
  protected void formatCookieAsVer(CharArrayBuffer paramCharArrayBuffer, Cookie paramCookie, int paramInt)
  {
    super.formatCookieAsVer(paramCharArrayBuffer, paramCookie, paramInt);
    boolean bool = paramCookie instanceof ClientCookie;
    if (bool)
    {
      Object localObject1 = paramCookie;
      localObject1 = (ClientCookie)paramCookie;
      Object localObject2 = "port";
      localObject1 = ((ClientCookie)localObject1).getAttribute((String)localObject2);
      if (localObject1 != null)
      {
        paramCharArrayBuffer.append("; $Port");
        localObject2 = "=\"";
        paramCharArrayBuffer.append((String)localObject2);
        localObject1 = ((String)localObject1).trim();
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          localObject2 = ((Cookie)paramCookie).getPorts();
          if (localObject2 != null)
          {
            int j = localObject2.length;
            i = 0;
            localObject1 = null;
            while (i < j)
            {
              if (i > 0)
              {
                str = ",";
                paramCharArrayBuffer.append(str);
              }
              int k = localObject2[i];
              String str = Integer.toString(k);
              paramCharArrayBuffer.append(str);
              i += 1;
            }
          }
        }
        localObject1 = "\"";
        paramCharArrayBuffer.append((String)localObject1);
      }
    }
  }
  
  public int getVersion()
  {
    return 1;
  }
  
  public Header getVersionHeader()
  {
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    localCharArrayBuffer.<init>(40);
    localCharArrayBuffer.append("Cookie2");
    localCharArrayBuffer.append(": ");
    localCharArrayBuffer.append("$Version=");
    Object localObject = Integer.toString(getVersion());
    localCharArrayBuffer.append((String)localObject);
    localObject = new org/apache/http/message/BufferedHeader;
    ((BufferedHeader)localObject).<init>(localCharArrayBuffer);
    return (Header)localObject;
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    CookieOrigin localCookieOrigin = adjustEffectiveHost(paramCookieOrigin);
    return super.match(paramCookie, localCookieOrigin);
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramHeader, "Header");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject1 = paramHeader.getName();
    Object localObject2 = "Set-Cookie2";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (!bool)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized cookie header '");
      String str = paramHeader.toString();
      localObject2 = str + "'";
      ((MalformedCookieException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = paramHeader.getElements();
    localObject2 = adjustEffectiveHost(paramCookieOrigin);
    return createCookies((HeaderElement[])localObject1, (CookieOrigin)localObject2);
  }
  
  protected List parse(HeaderElement[] paramArrayOfHeaderElement, CookieOrigin paramCookieOrigin)
  {
    CookieOrigin localCookieOrigin = adjustEffectiveHost(paramCookieOrigin);
    return createCookies(paramArrayOfHeaderElement, localCookieOrigin);
  }
  
  public String toString()
  {
    return "rfc2965";
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    CookieOrigin localCookieOrigin = adjustEffectiveHost(paramCookieOrigin);
    super.validate(paramCookie, localCookieOrigin);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2965Spec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */