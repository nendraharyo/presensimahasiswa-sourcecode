package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.TextUtils;

public class BrowserCompatSpec
  extends CookieSpecBase
{
  private static final String[] DEFAULT_DATE_PATTERNS;
  private final String[] datepatterns;
  
  static
  {
    String[] arrayOfString = new String[14];
    arrayOfString[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    arrayOfString[1] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    arrayOfString[2] = "EEE MMM d HH:mm:ss yyyy";
    arrayOfString[3] = "EEE, dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[4] = "EEE, dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[5] = "EEE, dd MMM yy HH:mm:ss z";
    arrayOfString[6] = "EEE dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[7] = "EEE dd MMM yyyy HH:mm:ss z";
    arrayOfString[8] = "EEE dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[9] = "EEE dd-MMM-yy HH:mm:ss z";
    arrayOfString[10] = "EEE dd MMM yy HH:mm:ss z";
    arrayOfString[11] = "EEE,dd-MMM-yy HH:mm:ss z";
    arrayOfString[12] = "EEE,dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[13] = "EEE, dd-MM-yyyy HH:mm:ss z";
    DEFAULT_DATE_PATTERNS = arrayOfString;
  }
  
  public BrowserCompatSpec()
  {
    this(null, localSecurityLevel);
  }
  
  public BrowserCompatSpec(String[] paramArrayOfString)
  {
    this(paramArrayOfString, localSecurityLevel);
  }
  
  public BrowserCompatSpec(String[] paramArrayOfString, BrowserCompatSpecFactory.SecurityLevel paramSecurityLevel)
  {
    if (paramArrayOfString != null) {
      localObject1 = (String[])paramArrayOfString.clone();
    }
    for (this.datepatterns = ((String[])localObject1);; this.datepatterns = ((String[])localObject1))
    {
      localObject1 = BrowserCompatSpec.2.$SwitchMap$org$apache$http$impl$cookie$BrowserCompatSpecFactory$SecurityLevel;
      int i = paramSecurityLevel.ordinal();
      int j = localObject1[i];
      switch (j)
      {
      default: 
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("Unknown security level");
        throw ((Throwable)localObject1);
        localObject1 = DEFAULT_DATE_PATTERNS;
      }
    }
    Object localObject1 = "path";
    Object localObject2 = new org/apache/http/impl/cookie/BasicPathHandler;
    ((BasicPathHandler)localObject2).<init>();
    registerAttribHandler((String)localObject1, (CookieAttributeHandler)localObject2);
    for (;;)
    {
      localObject2 = new org/apache/http/impl/cookie/BasicDomainHandler;
      ((BasicDomainHandler)localObject2).<init>();
      registerAttribHandler("domain", (CookieAttributeHandler)localObject2);
      localObject2 = new org/apache/http/impl/cookie/BasicMaxAgeHandler;
      ((BasicMaxAgeHandler)localObject2).<init>();
      registerAttribHandler("max-age", (CookieAttributeHandler)localObject2);
      localObject2 = new org/apache/http/impl/cookie/BasicSecureHandler;
      ((BasicSecureHandler)localObject2).<init>();
      registerAttribHandler("secure", (CookieAttributeHandler)localObject2);
      localObject2 = new org/apache/http/impl/cookie/BasicCommentHandler;
      ((BasicCommentHandler)localObject2).<init>();
      registerAttribHandler("comment", (CookieAttributeHandler)localObject2);
      localObject2 = new org/apache/http/impl/cookie/BasicExpiresHandler;
      String[] arrayOfString = this.datepatterns;
      ((BasicExpiresHandler)localObject2).<init>(arrayOfString);
      registerAttribHandler("expires", (CookieAttributeHandler)localObject2);
      localObject2 = new org/apache/http/impl/cookie/BrowserCompatVersionAttributeHandler;
      ((BrowserCompatVersionAttributeHandler)localObject2).<init>();
      registerAttribHandler("version", (CookieAttributeHandler)localObject2);
      return;
      localObject1 = "path";
      localObject2 = new org/apache/http/impl/cookie/BrowserCompatSpec$1;
      ((BrowserCompatSpec.1)localObject2).<init>(this);
      registerAttribHandler((String)localObject1, (CookieAttributeHandler)localObject2);
    }
  }
  
  private static boolean isQuoteEnclosed(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "\"";
      bool = paramString.startsWith(str);
      if (bool)
      {
        str = "\"";
        bool = paramString.endsWith(str);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public List formatCookies(List paramList)
  {
    Args.notEmpty(paramList, "List of cookies");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramList.size() * 20;
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append("Cookie");
    Object localObject = ": ";
    localCharArrayBuffer.append((String)localObject);
    int k = 0;
    BufferedHeader localBufferedHeader = null;
    i = paramList.size();
    if (k < i)
    {
      localObject = (Cookie)paramList.get(k);
      if (k > 0)
      {
        str1 = "; ";
        localCharArrayBuffer.append(str1);
      }
      String str1 = ((Cookie)localObject).getName();
      String str2 = ((Cookie)localObject).getValue();
      i = ((Cookie)localObject).getVersion();
      if (i > 0)
      {
        boolean bool = isQuoteEnclosed(str2);
        if (!bool)
        {
          localObject = BasicHeaderValueFormatter.INSTANCE;
          BasicHeaderElement localBasicHeaderElement = new org/apache/http/message/BasicHeaderElement;
          localBasicHeaderElement.<init>(str1, str2);
          ((BasicHeaderValueFormatter)localObject).formatHeaderElement(localCharArrayBuffer, localBasicHeaderElement, false);
        }
      }
      for (;;)
      {
        int j = k + 1;
        k = j;
        break;
        localCharArrayBuffer.append(str1);
        localObject = "=";
        localCharArrayBuffer.append((String)localObject);
        if (str2 != null) {
          localCharArrayBuffer.append(str2);
        }
      }
    }
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(1);
    localBufferedHeader = new org/apache/http/message/BufferedHeader;
    localBufferedHeader.<init>(localCharArrayBuffer);
    ((List)localObject).add(localBufferedHeader);
    return (List)localObject;
  }
  
  public int getVersion()
  {
    return 0;
  }
  
  public Header getVersionHeader()
  {
    return null;
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    boolean bool1 = true;
    Args.notNull(paramHeader, "Header");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject1 = paramHeader.getName();
    String str = "Set-Cookie";
    boolean bool2 = ((String)localObject1).equalsIgnoreCase(str);
    Object localObject2;
    if (!bool2)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized cookie header '");
      str = paramHeader.toString();
      localObject2 = str + "'";
      ((MalformedCookieException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = paramHeader.getElements();
    int j = localObject3.length;
    int k = 0;
    Object localObject4 = null;
    int m = 0;
    str = null;
    bool2 = false;
    localObject1 = null;
    Object localObject5;
    while (k < j)
    {
      localObject5 = localObject3[k];
      Object localObject6 = ((HeaderElement)localObject5).getParameterByName("version");
      if (localObject6 != null) {
        bool2 = bool1;
      }
      localObject6 = "expires";
      localObject5 = ((HeaderElement)localObject5).getParameterByName((String)localObject6);
      if (localObject5 != null) {
        m = bool1;
      }
      k += 1;
    }
    if ((m != 0) || (!bool2))
    {
      localObject4 = NetscapeDraftHeaderParser.DEFAULT;
      bool2 = paramHeader instanceof FormattedHeader;
      if (bool2)
      {
        localObject1 = paramHeader;
        localObject2 = ((FormattedHeader)paramHeader).getBuffer();
        localObject1 = new org/apache/http/message/ParserCursor;
        paramHeader = (FormattedHeader)paramHeader;
        int n = paramHeader.getValuePos();
        j = ((CharArrayBuffer)localObject2).length();
        ((ParserCursor)localObject1).<init>(n, j);
      }
      for (;;)
      {
        localObject1 = ((NetscapeDraftHeaderParser)localObject4).parseHeader((CharArrayBuffer)localObject2, (ParserCursor)localObject1);
        localObject2 = ((HeaderElement)localObject1).getName();
        localObject4 = ((HeaderElement)localObject1).getValue();
        if (localObject2 != null)
        {
          boolean bool3 = TextUtils.isBlank((CharSequence)localObject2);
          if (!bool3) {
            break;
          }
        }
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        ((MalformedCookieException)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
        localObject1 = paramHeader.getValue();
        if (localObject1 == null)
        {
          localObject1 = new org/apache/http/cookie/MalformedCookieException;
          ((MalformedCookieException)localObject1).<init>("Header value is null");
          throw ((Throwable)localObject1);
        }
        localObject2 = new org/apache/http/util/CharArrayBuffer;
        int i1 = ((String)localObject1).length();
        ((CharArrayBuffer)localObject2).<init>(i1);
        ((CharArrayBuffer)localObject2).append((String)localObject1);
        localObject1 = new org/apache/http/message/ParserCursor;
        i1 = ((CharArrayBuffer)localObject2).length();
        ((ParserCursor)localObject1).<init>(0, i1);
      }
      localObject3 = new org/apache/http/impl/cookie/BasicClientCookie;
      ((BasicClientCookie)localObject3).<init>((String)localObject2, (String)localObject4);
      localObject2 = getDefaultPath(paramCookieOrigin);
      ((BasicClientCookie)localObject3).setPath((String)localObject2);
      localObject2 = getDefaultDomain(paramCookieOrigin);
      ((BasicClientCookie)localObject3).setDomain((String)localObject2);
      localObject2 = ((HeaderElement)localObject1).getParameters();
      int i = localObject2.length + -1;
      while (i >= 0)
      {
        localObject4 = localObject2[i];
        Object localObject7 = ((NameValuePair)localObject4).getName();
        localObject5 = Locale.ENGLISH;
        localObject7 = ((String)localObject7).toLowerCase((Locale)localObject5);
        localObject5 = ((NameValuePair)localObject4).getValue();
        ((BasicClientCookie)localObject3).setAttribute((String)localObject7, (String)localObject5);
        localObject7 = findAttribHandler((String)localObject7);
        if (localObject7 != null)
        {
          localObject4 = ((NameValuePair)localObject4).getValue();
          ((CookieAttributeHandler)localObject7).parse((SetCookie)localObject3, (String)localObject4);
        }
        i += -1;
      }
      if (m != 0) {
        ((BasicClientCookie)localObject3).setVersion(0);
      }
    }
    for (localObject1 = Collections.singletonList(localObject3);; localObject1 = parse((HeaderElement[])localObject3, paramCookieOrigin)) {
      return (List)localObject1;
    }
  }
  
  public String toString()
  {
    return "compatibility";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BrowserCompatSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */