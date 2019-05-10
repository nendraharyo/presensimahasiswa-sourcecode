package org.apache.http.conn.params;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

public final class ConnPerRouteBean
  implements ConnPerRoute
{
  public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
  private volatile int defaultMax;
  private final ConcurrentHashMap maxPerHostMap;
  
  public ConnPerRouteBean()
  {
    this(2);
  }
  
  public ConnPerRouteBean(int paramInt)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.maxPerHostMap = localConcurrentHashMap;
    setDefaultMaxPerRoute(paramInt);
  }
  
  public int getDefaultMax()
  {
    return this.defaultMax;
  }
  
  public int getDefaultMaxPerRoute()
  {
    return this.defaultMax;
  }
  
  public int getMaxForRoute(HttpRoute paramHttpRoute)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Integer localInteger = (Integer)this.maxPerHostMap.get(paramHttpRoute);
    if (localInteger != null) {}
    for (int i = localInteger.intValue();; i = this.defaultMax) {
      return i;
    }
  }
  
  public void setDefaultMaxPerRoute(int paramInt)
  {
    Args.positive(paramInt, "Defautl max per route");
    this.defaultMax = paramInt;
  }
  
  public void setMaxForRoute(HttpRoute paramHttpRoute, int paramInt)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Args.positive(paramInt, "Max per route");
    ConcurrentHashMap localConcurrentHashMap = this.maxPerHostMap;
    Integer localInteger = Integer.valueOf(paramInt);
    localConcurrentHashMap.put(paramHttpRoute, localInteger);
  }
  
  public void setMaxForRoutes(Map paramMap)
  {
    if (paramMap == null) {}
    for (;;)
    {
      return;
      this.maxPerHostMap.clear();
      ConcurrentHashMap localConcurrentHashMap = this.maxPerHostMap;
      localConcurrentHashMap.putAll(paramMap);
    }
  }
  
  public String toString()
  {
    return this.maxPerHostMap.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\params\ConnPerRouteBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */