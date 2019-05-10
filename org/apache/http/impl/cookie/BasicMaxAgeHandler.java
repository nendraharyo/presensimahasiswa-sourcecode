package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicMaxAgeHandler
  extends AbstractCookieAttributeHandler
{
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject1 = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject1).<init>("Missing value for max-age attribute");
      throw ((Throwable)localObject1);
    }
    int i;
    try
    {
      i = Integer.parseInt(paramString);
      if (i < 0)
      {
        localObject1 = new org/apache/http/cookie/MalformedCookieException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Negative max-age attribute: " + paramString;
        ((MalformedCookieException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      MalformedCookieException localMalformedCookieException = new org/apache/http/cookie/MalformedCookieException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid max-age attribute: " + paramString;
      localMalformedCookieException.<init>((String)localObject2);
      throw localMalformedCookieException;
    }
    Object localObject2 = new java/util/Date;
    long l1 = System.currentTimeMillis();
    long l2 = i * 1000L;
    l1 += l2;
    ((Date)localObject2).<init>(l1);
    paramSetCookie.setExpiryDate((Date)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicMaxAgeHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */