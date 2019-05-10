package org.apache.http.cookie;

import java.util.Locale;
import org.apache.http.util.Args;

public final class CookieOrigin
{
  private final String host;
  private final String path;
  private final int port;
  private final boolean secure;
  
  public CookieOrigin(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    Args.notBlank(paramString1, "Host");
    Args.notNegative(paramInt, "Port");
    Args.notNull(paramString2, "Path");
    Object localObject = Locale.ENGLISH;
    localObject = paramString1.toLowerCase((Locale)localObject);
    this.host = ((String)localObject);
    this.port = paramInt;
    localObject = paramString2.trim();
    int i = ((String)localObject).length();
    if (i != 0) {}
    for (this.path = paramString2;; this.path = ((String)localObject))
    {
      this.secure = paramBoolean;
      return;
      localObject = "/";
    }
  }
  
  public String getHost()
  {
    return this.host;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public int getPort()
  {
    return this.port;
  }
  
  public boolean isSecure()
  {
    return this.secure;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('[');
    boolean bool = this.secure;
    if (bool)
    {
      str = "(secure)";
      localStringBuilder.append(str);
    }
    String str = this.host;
    localStringBuilder.append(str);
    localStringBuilder.append(':');
    str = Integer.toString(this.port);
    localStringBuilder.append(str);
    str = this.path;
    localStringBuilder.append(str);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\CookieOrigin.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */