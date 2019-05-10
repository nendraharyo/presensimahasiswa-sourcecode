package org.apache.http.auth.params;

import java.nio.charset.Charset;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

public final class AuthParams
{
  public static String getCredentialCharset(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    String str = (String)paramHttpParams.getParameter("http.auth.credential-charset");
    if (str == null) {
      str = HTTP.DEF_PROTOCOL_CHARSET.name();
    }
    return str;
  }
  
  public static void setCredentialCharset(HttpParams paramHttpParams, String paramString)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.auth.credential-charset", paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\params\AuthParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */