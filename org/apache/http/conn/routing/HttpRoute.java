package org.apache.http.conn.routing;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public final class HttpRoute
  implements Cloneable, RouteInfo
{
  private final RouteInfo.LayerType layered;
  private final InetAddress localAddress;
  private final List proxyChain;
  private final boolean secure;
  private final HttpHost targetHost;
  private final RouteInfo.TunnelType tunnelled;
  
  public HttpRoute(HttpHost paramHttpHost)
  {
    this(paramHttpHost, null, localList, false, localTunnelType, localLayerType);
  }
  
  private HttpRoute(HttpHost paramHttpHost, InetAddress paramInetAddress, List paramList, boolean paramBoolean, RouteInfo.TunnelType paramTunnelType, RouteInfo.LayerType paramLayerType)
  {
    Object localObject = "Target host";
    Args.notNull(paramHttpHost, (String)localObject);
    this.targetHost = paramHttpHost;
    this.localAddress = paramInetAddress;
    boolean bool;
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>(paramList);
        this.proxyChain = ((List)localObject);
        localObject = RouteInfo.TunnelType.TUNNELLED;
        if (paramTunnelType == localObject)
        {
          localObject = this.proxyChain;
          if (localObject == null) {
            break label139;
          }
          bool = true;
          label85:
          String str = "Proxy required if tunnelled";
          Args.check(bool, str);
        }
        this.secure = paramBoolean;
        if (paramTunnelType == null) {
          break label148;
        }
        label107:
        this.tunnelled = paramTunnelType;
        if (paramLayerType == null) {
          break label156;
        }
      }
    }
    for (;;)
    {
      this.layered = paramLayerType;
      return;
      bool = false;
      localObject = null;
      this.proxyChain = null;
      break;
      label139:
      bool = false;
      localObject = null;
      break label85;
      label148:
      paramTunnelType = RouteInfo.TunnelType.PLAIN;
      break label107;
      label156:
      paramLayerType = RouteInfo.LayerType.PLAIN;
    }
  }
  
  public HttpRoute(HttpHost paramHttpHost1, InetAddress paramInetAddress, HttpHost paramHttpHost2, boolean paramBoolean) {}
  
  public HttpRoute(HttpHost paramHttpHost1, InetAddress paramInetAddress, HttpHost paramHttpHost2, boolean paramBoolean, RouteInfo.TunnelType paramTunnelType, RouteInfo.LayerType paramLayerType) {}
  
  public HttpRoute(HttpHost paramHttpHost, InetAddress paramInetAddress, boolean paramBoolean)
  {
    this(paramHttpHost, paramInetAddress, localList, paramBoolean, localTunnelType, localLayerType);
  }
  
  public HttpRoute(HttpHost paramHttpHost, InetAddress paramInetAddress, HttpHost[] paramArrayOfHttpHost, boolean paramBoolean, RouteInfo.TunnelType paramTunnelType, RouteInfo.LayerType paramLayerType) {}
  
  public HttpRoute(HttpHost paramHttpHost1, HttpHost paramHttpHost2)
  {
    this(paramHttpHost1, null, paramHttpHost2, false);
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof HttpRoute;
      if (bool2)
      {
        paramObject = (HttpRoute)paramObject;
        bool2 = this.secure;
        boolean bool3 = ((HttpRoute)paramObject).secure;
        if (bool2 == bool3)
        {
          Object localObject1 = this.tunnelled;
          Object localObject2 = ((HttpRoute)paramObject).tunnelled;
          if (localObject1 == localObject2)
          {
            localObject1 = this.layered;
            localObject2 = ((HttpRoute)paramObject).layered;
            if (localObject1 == localObject2)
            {
              localObject1 = this.targetHost;
              localObject2 = ((HttpRoute)paramObject).targetHost;
              bool2 = LangUtils.equals(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.localAddress;
                localObject2 = ((HttpRoute)paramObject).localAddress;
                bool2 = LangUtils.equals(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.proxyChain;
                  localObject2 = ((HttpRoute)paramObject).proxyChain;
                  bool2 = LangUtils.equals(localObject1, localObject2);
                  if (bool2) {
                    continue;
                  }
                }
              }
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
  
  public final int getHopCount()
  {
    List localList = this.proxyChain;
    if (localList != null) {
      localList = this.proxyChain;
    }
    for (int i = localList.size() + 1;; i = 1) {
      return i;
    }
  }
  
  public final HttpHost getHopTarget(int paramInt)
  {
    Object localObject = "Hop index";
    Args.notNegative(paramInt, (String)localObject);
    int i = getHopCount();
    int j;
    if (paramInt < i)
    {
      boolean bool = true;
      String str = "Hop index exceeds tracked route length";
      Args.check(bool, str);
      j = i + -1;
      if (paramInt >= j) {
        break label68;
      }
    }
    label68:
    for (localObject = (HttpHost)this.proxyChain.get(paramInt);; localObject = this.targetHost)
    {
      return (HttpHost)localObject;
      j = 0;
      localObject = null;
      break;
    }
  }
  
  public final RouteInfo.LayerType getLayerType()
  {
    return this.layered;
  }
  
  public final InetAddress getLocalAddress()
  {
    return this.localAddress;
  }
  
  public final InetSocketAddress getLocalSocketAddress()
  {
    Object localObject = this.localAddress;
    if (localObject != null)
    {
      localObject = new java/net/InetSocketAddress;
      InetAddress localInetAddress = this.localAddress;
      ((InetSocketAddress)localObject).<init>(localInetAddress, 0);
    }
    for (;;)
    {
      return (InetSocketAddress)localObject;
      localObject = null;
    }
  }
  
  public final HttpHost getProxyHost()
  {
    Object localObject = this.proxyChain;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.proxyChain;
      bool = ((List)localObject).isEmpty();
      if (bool) {}
    }
    for (localObject = (HttpHost)this.proxyChain.get(0);; localObject = null)
    {
      return (HttpHost)localObject;
      bool = false;
    }
  }
  
  public final HttpHost getTargetHost()
  {
    return this.targetHost;
  }
  
  public final RouteInfo.TunnelType getTunnelType()
  {
    return this.tunnelled;
  }
  
  public final int hashCode()
  {
    Object localObject = this.targetHost;
    int i = LangUtils.hashCode(17, localObject);
    localObject = this.localAddress;
    i = LangUtils.hashCode(i, localObject);
    localObject = this.proxyChain;
    int j;
    if (localObject != null)
    {
      localObject = this.proxyChain;
      Iterator localIterator = ((List)localObject).iterator();
      for (m = i;; m = j)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        HttpHost localHttpHost = (HttpHost)localIterator.next();
        j = LangUtils.hashCode(m, localHttpHost);
      }
    }
    int m = j;
    boolean bool2 = this.secure;
    int k = LangUtils.hashCode(m, bool2);
    localObject = this.tunnelled;
    k = LangUtils.hashCode(k, localObject);
    localObject = this.layered;
    return LangUtils.hashCode(k, localObject);
  }
  
  public final boolean isLayered()
  {
    RouteInfo.LayerType localLayerType1 = this.layered;
    RouteInfo.LayerType localLayerType2 = RouteInfo.LayerType.LAYERED;
    boolean bool;
    if (localLayerType1 == localLayerType2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLayerType1 = null;
    }
  }
  
  public final boolean isSecure()
  {
    return this.secure;
  }
  
  public final boolean isTunnelled()
  {
    RouteInfo.TunnelType localTunnelType1 = this.tunnelled;
    RouteInfo.TunnelType localTunnelType2 = RouteInfo.TunnelType.TUNNELLED;
    boolean bool;
    if (localTunnelType1 == localTunnelType2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTunnelType1 = null;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = getHopCount() * 30 + 50;
    localStringBuilder.<init>(i);
    Object localObject1 = this.localAddress;
    if (localObject1 != null)
    {
      localObject1 = this.localAddress;
      localStringBuilder.append(localObject1);
      localObject1 = "->";
      localStringBuilder.append((String)localObject1);
    }
    i = 123;
    localStringBuilder.append(i);
    localObject1 = this.tunnelled;
    Object localObject2 = RouteInfo.TunnelType.TUNNELLED;
    char c1;
    if (localObject1 == localObject2)
    {
      c1 = 't';
      localStringBuilder.append(c1);
    }
    localObject1 = this.layered;
    localObject2 = RouteInfo.LayerType.LAYERED;
    if (localObject1 == localObject2)
    {
      c1 = 'l';
      localStringBuilder.append(c1);
    }
    boolean bool1 = this.secure;
    if (bool1)
    {
      char c2 = 's';
      localStringBuilder.append(c2);
    }
    localStringBuilder.append("}->");
    localObject1 = this.proxyChain;
    if (localObject1 != null)
    {
      localObject1 = this.proxyChain;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (HttpHost)((Iterator)localObject2).next();
        localStringBuilder.append(localObject1);
        localObject1 = "->";
        localStringBuilder.append((String)localObject1);
      }
    }
    localObject1 = this.targetHost;
    localStringBuilder.append(localObject1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\routing\HttpRoute.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */