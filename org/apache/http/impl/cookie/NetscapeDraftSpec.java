package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class NetscapeDraftSpec
  extends CookieSpecBase
{
  protected static final String EXPIRES_PATTERN = "EEE, dd-MMM-yy HH:mm:ss z";
  private final String[] datepatterns;
  
  public NetscapeDraftSpec()
  {
    this(null);
  }
  
  public NetscapeDraftSpec(String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString != null) {
      arrayOfString = (String[])paramArrayOfString.clone();
    }
    for (this.datepatterns = arrayOfString;; this.datepatterns = arrayOfString)
    {
      Object localObject1 = new org/apache/http/impl/cookie/BasicPathHandler;
      ((BasicPathHandler)localObject1).<init>();
      registerAttribHandler("path", (CookieAttributeHandler)localObject1);
      localObject1 = new org/apache/http/impl/cookie/NetscapeDomainHandler;
      ((NetscapeDomainHandler)localObject1).<init>();
      registerAttribHandler("domain", (CookieAttributeHandler)localObject1);
      localObject1 = new org/apache/http/impl/cookie/BasicSecureHandler;
      ((BasicSecureHandler)localObject1).<init>();
      registerAttribHandler("secure", (CookieAttributeHandler)localObject1);
      localObject1 = new org/apache/http/impl/cookie/BasicCommentHandler;
      ((BasicCommentHandler)localObject1).<init>();
      registerAttribHandler("comment", (CookieAttributeHandler)localObject1);
      localObject1 = new org/apache/http/impl/cookie/BasicExpiresHandler;
      Object localObject2 = this.datepatterns;
      ((BasicExpiresHandler)localObject1).<init>((String[])localObject2);
      registerAttribHandler("expires", (CookieAttributeHandler)localObject1);
      return;
      int i = 1;
      arrayOfString = new String[i];
      localObject1 = null;
      localObject2 = "EEE, dd-MMM-yy HH:mm:ss z";
      arrayOfString[0] = localObject2;
    }
  }
  
  public List formatCookies(List paramList)
  {
    Args.notEmpty(paramList, "List of cookies");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramList.size() * 20;
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append("Cookie");
    localCharArrayBuffer.append(": ");
    i = 0;
    Object localObject = null;
    int j = 0;
    BufferedHeader localBufferedHeader = null;
    for (;;)
    {
      i = paramList.size();
      if (j >= i) {
        break;
      }
      localObject = (Cookie)paramList.get(j);
      if (j > 0)
      {
        str = "; ";
        localCharArrayBuffer.append(str);
      }
      String str = ((Cookie)localObject).getName();
      localCharArrayBuffer.append(str);
      localObject = ((Cookie)localObject).getValue();
      if (localObject != null)
      {
        str = "=";
        localCharArrayBuffer.append(str);
        localCharArrayBuffer.append((String)localObject);
      }
      i = j + 1;
      j = i;
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
      localObject3 = paramHeader.toString();
      localObject2 = (String)localObject3 + "'";
      ((MalformedCookieException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = NetscapeDraftHeaderParser.DEFAULT;
    bool = paramHeader instanceof FormattedHeader;
    int i;
    if (bool)
    {
      localObject1 = paramHeader;
      localObject2 = ((FormattedHeader)paramHeader).getBuffer();
      localObject1 = new org/apache/http/message/ParserCursor;
      paramHeader = (FormattedHeader)paramHeader;
      i = paramHeader.getValuePos();
      int j = ((CharArrayBuffer)localObject2).length();
      ((ParserCursor)localObject1).<init>(i, j);
    }
    for (;;)
    {
      HeaderElement[] arrayOfHeaderElement = new HeaderElement[1];
      localObject1 = ((NetscapeDraftHeaderParser)localObject3).parseHeader((CharArrayBuffer)localObject2, (ParserCursor)localObject1);
      arrayOfHeaderElement[0] = localObject1;
      return parse(arrayOfHeaderElement, paramCookieOrigin);
      localObject1 = paramHeader.getValue();
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        ((MalformedCookieException)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      localObject2 = new org/apache/http/util/CharArrayBuffer;
      i = ((String)localObject1).length();
      ((CharArrayBuffer)localObject2).<init>(i);
      ((CharArrayBuffer)localObject2).append((String)localObject1);
      localObject1 = new org/apache/http/message/ParserCursor;
      i = ((CharArrayBuffer)localObject2).length();
      ((ParserCursor)localObject1).<init>(0, i);
    }
  }
  
  public String toString()
  {
    return "netscape";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\NetscapeDraftSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */