package org.apache.http.impl.cookie;

import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BrowserCompatVersionAttributeHandler
  extends AbstractCookieAttributeHandler
{
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Object localObject = "Cookie";
    Args.notNull(paramSetCookie, (String)localObject);
    if (paramString == null)
    {
      localObject = new org/apache/http/cookie/MalformedCookieException;
      ((MalformedCookieException)localObject).<init>("Missing value for version attribute");
      throw ((Throwable)localObject);
    }
    int i = 0;
    localObject = null;
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    paramSetCookie.setVersion(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BrowserCompatVersionAttributeHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */