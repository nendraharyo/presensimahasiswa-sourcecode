package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.util.Args;

public class DefaultSchemePortResolver
  implements SchemePortResolver
{
  public static final DefaultSchemePortResolver INSTANCE;
  
  static
  {
    DefaultSchemePortResolver localDefaultSchemePortResolver = new org/apache/http/impl/conn/DefaultSchemePortResolver;
    localDefaultSchemePortResolver.<init>();
    INSTANCE = localDefaultSchemePortResolver;
  }
  
  public int resolve(HttpHost paramHttpHost)
  {
    String str = "HTTP host";
    Args.notNull(paramHttpHost, str);
    int i = paramHttpHost.getPort();
    if (i > 0) {}
    for (;;)
    {
      return i;
      str = paramHttpHost.getSchemeName();
      localObject = "http";
      boolean bool = str.equalsIgnoreCase((String)localObject);
      if (bool)
      {
        i = 80;
      }
      else
      {
        localObject = "https";
        bool = str.equalsIgnoreCase((String)localObject);
        if (!bool) {
          break;
        }
        i = 443;
      }
    }
    Object localObject = new org/apache/http/conn/UnsupportedSchemeException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    str = str + " protocol is not supported";
    ((UnsupportedSchemeException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultSchemePortResolver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */