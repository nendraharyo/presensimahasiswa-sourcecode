package org.apache.http.impl.cookie;

import java.util.StringTokenizer;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.util.Args;

public class RFC2965PortAttributeHandler
  implements CookieAttributeHandler
{
  private static int[] parsePortAttribute(String paramString)
  {
    Object localObject1 = new java/util/StringTokenizer;
    ((StringTokenizer)localObject1).<init>(paramString, ",");
    Object localObject2 = new int[((StringTokenizer)localObject1).countTokens()];
    int i = 0;
    MalformedCookieException localMalformedCookieException = null;
    for (;;)
    {
      try
      {
        boolean bool = ((StringTokenizer)localObject1).hasMoreTokens();
        if (!bool) {
          break;
        }
        String str2 = ((StringTokenizer)localObject1).nextToken();
        str2 = str2.trim();
        int j = Integer.parseInt(str2);
        localObject2[i] = j;
        j = localObject2[i];
        if (j < 0)
        {
          localMalformedCookieException = new org/apache/http/cookie/MalformedCookieException;
          localObject1 = "Invalid Port attribute.";
          localMalformedCookieException.<init>((String)localObject1);
          throw localMalformedCookieException;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Invalid Port attribute: ");
        String str1 = localNumberFormatException.getMessage();
        str1 = str1;
        ((MalformedCookieException)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
      }
      i += 1;
    }
    return (int[])localObject2;
  }
  
  private static boolean portMatch(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool = false;
    int i = paramArrayOfInt.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        int k = paramArrayOfInt[j];
        if (paramInt == k) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Object localObject = "Cookie origin";
    Args.notNull(paramCookieOrigin, (String)localObject);
    int i = paramCookieOrigin.getPort();
    boolean bool = paramCookie instanceof ClientCookie;
    if (bool)
    {
      localObject = paramCookie;
      localObject = (ClientCookie)paramCookie;
      String str = "port";
      bool = ((ClientCookie)localObject).containsAttribute(str);
      if (bool)
      {
        localObject = ((Cookie)paramCookie).getPorts();
        if (localObject == null)
        {
          bool = false;
          localObject = null;
        }
      }
    }
    for (;;)
    {
      return bool;
      localObject = ((Cookie)paramCookie).getPorts();
      bool = portMatch(i, (int[])localObject);
      if (!bool)
      {
        bool = false;
        localObject = null;
      }
      else
      {
        bool = true;
      }
    }
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject);
    boolean bool = paramSetCookie instanceof SetCookie2;
    if (bool)
    {
      paramSetCookie = (SetCookie2)paramSetCookie;
      if (paramString != null)
      {
        localObject = paramString.trim();
        int i = ((String)localObject).length();
        if (i > 0)
        {
          localObject = parsePortAttribute(paramString);
          paramSetCookie.setPorts((int[])localObject);
        }
      }
    }
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    Args.notNull(paramCookie, "Cookie");
    Object localObject = "Cookie origin";
    Args.notNull(paramCookieOrigin, (String)localObject);
    int i = paramCookieOrigin.getPort();
    boolean bool = paramCookie instanceof ClientCookie;
    if (bool)
    {
      localObject = paramCookie;
      localObject = (ClientCookie)paramCookie;
      String str = "port";
      bool = ((ClientCookie)localObject).containsAttribute(str);
      if (bool)
      {
        localObject = ((Cookie)paramCookie).getPorts();
        bool = portMatch(i, (int[])localObject);
        if (!bool)
        {
          localObject = new org/apache/http/cookie/CookieRestrictionViolationException;
          ((CookieRestrictionViolationException)localObject).<init>("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
          throw ((Throwable)localObject);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2965PortAttributeHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */