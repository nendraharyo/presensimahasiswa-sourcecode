package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class RFC2109Spec
  extends CookieSpecBase
{
  private static final String[] DATE_PATTERNS;
  private static final CookiePathComparator PATH_COMPARATOR;
  private final String[] datepatterns;
  private final boolean oneHeader;
  
  static
  {
    Object localObject = new org/apache/http/cookie/CookiePathComparator;
    ((CookiePathComparator)localObject).<init>();
    PATH_COMPARATOR = (CookiePathComparator)localObject;
    localObject = new String[3];
    localObject[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    localObject[1] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    localObject[2] = "EEE MMM d HH:mm:ss yyyy";
    DATE_PATTERNS = (String[])localObject;
  }
  
  public RFC2109Spec()
  {
    this(null, false);
  }
  
  public RFC2109Spec(String[] paramArrayOfString, boolean paramBoolean)
  {
    String[] arrayOfString1;
    if (paramArrayOfString != null) {
      arrayOfString1 = (String[])paramArrayOfString.clone();
    }
    for (this.datepatterns = arrayOfString1;; this.datepatterns = arrayOfString1)
    {
      this.oneHeader = paramBoolean;
      Object localObject = new org/apache/http/impl/cookie/RFC2109VersionHandler;
      ((RFC2109VersionHandler)localObject).<init>();
      registerAttribHandler("version", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/BasicPathHandler;
      ((BasicPathHandler)localObject).<init>();
      registerAttribHandler("path", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/RFC2109DomainHandler;
      ((RFC2109DomainHandler)localObject).<init>();
      registerAttribHandler("domain", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/BasicMaxAgeHandler;
      ((BasicMaxAgeHandler)localObject).<init>();
      registerAttribHandler("max-age", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/BasicSecureHandler;
      ((BasicSecureHandler)localObject).<init>();
      registerAttribHandler("secure", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/BasicCommentHandler;
      ((BasicCommentHandler)localObject).<init>();
      registerAttribHandler("comment", (CookieAttributeHandler)localObject);
      localObject = new org/apache/http/impl/cookie/BasicExpiresHandler;
      String[] arrayOfString2 = this.datepatterns;
      ((BasicExpiresHandler)localObject).<init>(arrayOfString2);
      registerAttribHandler("expires", (CookieAttributeHandler)localObject);
      return;
      arrayOfString1 = DATE_PATTERNS;
    }
  }
  
  private List doFormatManyHeaders(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramList.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Cookie)localIterator.next();
      int j = ((Cookie)localObject).getVersion();
      CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      int k = 40;
      localCharArrayBuffer.<init>(k);
      localCharArrayBuffer.append("Cookie: ");
      localCharArrayBuffer.append("$Version=");
      String str = Integer.toString(j);
      localCharArrayBuffer.append(str);
      str = "; ";
      localCharArrayBuffer.append(str);
      formatCookieAsVer(localCharArrayBuffer, (Cookie)localObject, j);
      localObject = new org/apache/http/message/BufferedHeader;
      ((BufferedHeader)localObject).<init>(localCharArrayBuffer);
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  private List doFormatOneHeader(List paramList)
  {
    int i = -1 >>> 1;
    Object localObject1 = paramList.iterator();
    int k = i;
    boolean bool1 = ((Iterator)localObject1).hasNext();
    Object localObject2;
    if (bool1)
    {
      localObject2 = (Cookie)((Iterator)localObject1).next();
      int m = ((Cookie)localObject2).getVersion();
      if (m >= k) {
        break label205;
      }
    }
    boolean bool2;
    label205:
    for (int j = ((Cookie)localObject2).getVersion();; bool2 = k)
    {
      k = j;
      break;
      localObject1 = new org/apache/http/util/CharArrayBuffer;
      j = paramList.size() * 40;
      ((CharArrayBuffer)localObject1).<init>(j);
      ((CharArrayBuffer)localObject1).append("Cookie");
      ((CharArrayBuffer)localObject1).append(": ");
      ((CharArrayBuffer)localObject1).append("$Version=");
      localObject2 = Integer.toString(k);
      ((CharArrayBuffer)localObject1).append((String)localObject2);
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (Cookie)localIterator.next();
        String str = "; ";
        ((CharArrayBuffer)localObject1).append(str);
        formatCookieAsVer((CharArrayBuffer)localObject1, (Cookie)localObject2, k);
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(1);
      BufferedHeader localBufferedHeader = new org/apache/http/message/BufferedHeader;
      localBufferedHeader.<init>((CharArrayBuffer)localObject1);
      ((List)localObject2).add(localBufferedHeader);
      return (List)localObject2;
    }
  }
  
  protected void formatCookieAsVer(CharArrayBuffer paramCharArrayBuffer, Cookie paramCookie, int paramInt)
  {
    Object localObject = paramCookie.getName();
    String str = paramCookie.getValue();
    formatParamAsVer(paramCharArrayBuffer, (String)localObject, str, paramInt);
    localObject = paramCookie.getPath();
    boolean bool;
    if (localObject != null)
    {
      bool = paramCookie instanceof ClientCookie;
      if (bool)
      {
        localObject = paramCookie;
        localObject = (ClientCookie)paramCookie;
        str = "path";
        bool = ((ClientCookie)localObject).containsAttribute(str);
        if (bool)
        {
          paramCharArrayBuffer.append("; ");
          localObject = "$Path";
          str = ((Cookie)paramCookie).getPath();
          formatParamAsVer(paramCharArrayBuffer, (String)localObject, str, paramInt);
        }
      }
    }
    localObject = ((Cookie)paramCookie).getDomain();
    if (localObject != null)
    {
      bool = paramCookie instanceof ClientCookie;
      if (bool)
      {
        localObject = paramCookie;
        localObject = (ClientCookie)paramCookie;
        str = "domain";
        bool = ((ClientCookie)localObject).containsAttribute(str);
        if (bool)
        {
          paramCharArrayBuffer.append("; ");
          localObject = "$Domain";
          str = ((Cookie)paramCookie).getDomain();
          formatParamAsVer(paramCharArrayBuffer, (String)localObject, str, paramInt);
        }
      }
    }
  }
  
  public List formatCookies(List paramList)
  {
    Object localObject = "List of cookies";
    Args.notEmpty(paramList, (String)localObject);
    int i = paramList.size();
    int j = 1;
    if (i > j)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList);
      CookiePathComparator localCookiePathComparator = PATH_COMPARATOR;
      Collections.sort((List)localObject, localCookiePathComparator);
      paramList = (List)localObject;
    }
    boolean bool = this.oneHeader;
    if (bool) {}
    for (localObject = doFormatOneHeader(paramList);; localObject = doFormatManyHeaders(paramList)) {
      return (List)localObject;
    }
  }
  
  protected void formatParamAsVer(CharArrayBuffer paramCharArrayBuffer, String paramString1, String paramString2, int paramInt)
  {
    char c = '"';
    paramCharArrayBuffer.append(paramString1);
    String str = "=";
    paramCharArrayBuffer.append(str);
    if (paramString2 != null)
    {
      if (paramInt <= 0) {
        break label46;
      }
      paramCharArrayBuffer.append(c);
      paramCharArrayBuffer.append(paramString2);
      paramCharArrayBuffer.append(c);
    }
    for (;;)
    {
      return;
      label46:
      paramCharArrayBuffer.append(paramString2);
    }
  }
  
  public int getVersion()
  {
    return 1;
  }
  
  public Header getVersionHeader()
  {
    return null;
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramHeader, "Header");
    Args.notNull(paramCookieOrigin, "Cookie origin");
    Object localObject1 = paramHeader.getName();
    Object localObject2 = "Set-Cookie";
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
    return parse((HeaderElement[])localObject1, paramCookieOrigin);
  }
  
  public String toString()
  {
    return "rfc2109";
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Object localObject = paramCookie.getName();
    int i = ((String)localObject).indexOf(' ');
    int j = -1;
    if (i != j)
    {
      localObject = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject).<init>("Cookie name may not contain blanks");
      throw ((Throwable)localObject);
    }
    String str = "$";
    boolean bool = ((String)localObject).startsWith(str);
    if (bool)
    {
      localObject = new org/apache/http/cookie/CookieRestrictionViolationException;
      ((CookieRestrictionViolationException)localObject).<init>("Cookie name may not start with $");
      throw ((Throwable)localObject);
    }
    super.validate(paramCookie, paramCookieOrigin);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2109Spec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */