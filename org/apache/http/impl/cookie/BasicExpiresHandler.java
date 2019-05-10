package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicExpiresHandler
  extends AbstractCookieAttributeHandler
{
  private final String[] datepatterns;
  
  public BasicExpiresHandler(String[] paramArrayOfString)
  {
    Args.notNull(paramArrayOfString, "Array of date patterns");
    this.datepatterns = paramArrayOfString;
  }
  
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject1 = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject1).<init>("Missing value for expires attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.datepatterns;
    localObject1 = DateUtils.parseDate(paramString, (String[])localObject1);
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/cookie/MalformedCookieException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unable to parse expires attribute: " + paramString;
      ((MalformedCookieException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    paramSetCookie.setExpiryDate((Date)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicExpiresHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */