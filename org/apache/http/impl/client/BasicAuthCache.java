package org.apache.http.impl.client;

import java.util.HashMap;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.util.Args;

public class BasicAuthCache
  implements AuthCache
{
  private final HashMap map;
  private final SchemePortResolver schemePortResolver;
  
  public BasicAuthCache()
  {
    this(null);
  }
  
  public BasicAuthCache(SchemePortResolver paramSchemePortResolver)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.map = localHashMap;
    if (paramSchemePortResolver != null) {}
    for (;;)
    {
      this.schemePortResolver = paramSchemePortResolver;
      return;
      paramSchemePortResolver = DefaultSchemePortResolver.INSTANCE;
    }
  }
  
  public void clear()
  {
    this.map.clear();
  }
  
  public AuthScheme get(HttpHost paramHttpHost)
  {
    Args.notNull(paramHttpHost, "HTTP host");
    HashMap localHashMap = this.map;
    HttpHost localHttpHost = getKey(paramHttpHost);
    return (AuthScheme)localHashMap.get(localHttpHost);
  }
  
  protected HttpHost getKey(HttpHost paramHttpHost)
  {
    int i = paramHttpHost.getPort();
    if (i <= 0) {}
    try
    {
      Object localObject = this.schemePortResolver;
      int j = ((SchemePortResolver)localObject).resolve(paramHttpHost);
      localObject = new org/apache/http/HttpHost;
      String str1 = paramHttpHost.getHostName();
      String str2 = paramHttpHost.getSchemeName();
      ((HttpHost)localObject).<init>(str1, j, str2);
      paramHttpHost = (HttpHost)localObject;
    }
    catch (UnsupportedSchemeException localUnsupportedSchemeException)
    {
      for (;;) {}
    }
    return paramHttpHost;
  }
  
  public void put(HttpHost paramHttpHost, AuthScheme paramAuthScheme)
  {
    Args.notNull(paramHttpHost, "HTTP host");
    HashMap localHashMap = this.map;
    HttpHost localHttpHost = getKey(paramHttpHost);
    localHashMap.put(localHttpHost, paramAuthScheme);
  }
  
  public void remove(HttpHost paramHttpHost)
  {
    Args.notNull(paramHttpHost, "HTTP host");
    HashMap localHashMap = this.map;
    HttpHost localHttpHost = getKey(paramHttpHost);
    localHashMap.remove(localHttpHost);
  }
  
  public String toString()
  {
    return this.map.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\BasicAuthCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */