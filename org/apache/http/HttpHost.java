package org.apache.http;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public final class HttpHost
  implements Serializable, Cloneable
{
  public static final String DEFAULT_SCHEME_NAME = "http";
  private static final long serialVersionUID = -7529410654042457626L;
  protected final InetAddress address;
  protected final String hostname;
  protected final String lcHostname;
  protected final int port;
  protected final String schemeName;
  
  public HttpHost(String paramString)
  {
    this(paramString, -1, null);
  }
  
  public HttpHost(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }
  
  public HttpHost(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = (String)Args.notBlank(paramString1, "Host name");
    this.hostname = ((String)localObject);
    localObject = Locale.ENGLISH;
    localObject = paramString1.toLowerCase((Locale)localObject);
    this.lcHostname = ((String)localObject);
    if (paramString2 != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString2.toLowerCase((Locale)localObject);
    }
    for (this.schemeName = ((String)localObject);; this.schemeName = ((String)localObject))
    {
      this.port = paramInt;
      this.address = null;
      return;
      localObject = "http";
    }
  }
  
  public HttpHost(InetAddress paramInetAddress)
  {
    this(paramInetAddress, -1, null);
  }
  
  public HttpHost(InetAddress paramInetAddress, int paramInt)
  {
    this(paramInetAddress, paramInt, null);
  }
  
  public HttpHost(InetAddress paramInetAddress, int paramInt, String paramString)
  {
    Object localObject = (InetAddress)Args.notNull(paramInetAddress, "Inet address");
    this.address = ((InetAddress)localObject);
    localObject = paramInetAddress.getHostAddress();
    this.hostname = ((String)localObject);
    localObject = this.hostname;
    Locale localLocale = Locale.ENGLISH;
    localObject = ((String)localObject).toLowerCase(localLocale);
    this.lcHostname = ((String)localObject);
    if (paramString != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString.toLowerCase((Locale)localObject);
    }
    for (this.schemeName = ((String)localObject);; this.schemeName = ((String)localObject))
    {
      this.port = paramInt;
      return;
      localObject = "http";
    }
  }
  
  public HttpHost(HttpHost paramHttpHost)
  {
    Args.notNull(paramHttpHost, "HTTP host");
    Object localObject = paramHttpHost.hostname;
    this.hostname = ((String)localObject);
    localObject = paramHttpHost.lcHostname;
    this.lcHostname = ((String)localObject);
    localObject = paramHttpHost.schemeName;
    this.schemeName = ((String)localObject);
    int i = paramHttpHost.port;
    this.port = i;
    localObject = paramHttpHost.address;
    this.address = ((InetAddress)localObject);
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof HttpHost;
      if (bool2)
      {
        paramObject = (HttpHost)paramObject;
        String str1 = this.lcHostname;
        String str2 = ((HttpHost)paramObject).lcHostname;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.port;
          int j = ((HttpHost)paramObject).port;
          if (i == j)
          {
            str1 = this.schemeName;
            str2 = ((HttpHost)paramObject).schemeName;
            boolean bool3 = str1.equals(str2);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public InetAddress getAddress()
  {
    return this.address;
  }
  
  public String getHostName()
  {
    return this.hostname;
  }
  
  public int getPort()
  {
    return this.port;
  }
  
  public String getSchemeName()
  {
    return this.schemeName;
  }
  
  public int hashCode()
  {
    String str = this.lcHostname;
    int i = LangUtils.hashCode(17, str);
    int j = this.port;
    i = LangUtils.hashCode(i, j);
    str = this.schemeName;
    return LangUtils.hashCode(i, str);
  }
  
  public String toHostString()
  {
    int i = this.port;
    int j = -1;
    if (i != j)
    {
      localObject = new java/lang/StringBuilder;
      j = this.hostname.length() + 6;
      ((StringBuilder)localObject).<init>(j);
      String str = this.hostname;
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(":");
      j = this.port;
      str = Integer.toString(j);
      ((StringBuilder)localObject).append(str);
    }
    for (Object localObject = ((StringBuilder)localObject).toString();; localObject = this.hostname) {
      return (String)localObject;
    }
  }
  
  public String toString()
  {
    return toURI();
  }
  
  public String toURI()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.schemeName;
    localStringBuilder.append(str);
    localStringBuilder.append("://");
    str = this.hostname;
    localStringBuilder.append(str);
    int i = this.port;
    int j = -1;
    if (i != j)
    {
      localStringBuilder.append(':');
      i = this.port;
      str = Integer.toString(i);
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpHost.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */