package org.apache.http.impl.cookie;

import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicCommentHandler
  extends AbstractCookieAttributeHandler
{
  public void parse(SetCookie paramSetCookie, String paramString)
  {
    Args.notNull(paramSetCookie, "Cookie");
    paramSetCookie.setComment(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicCommentHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */