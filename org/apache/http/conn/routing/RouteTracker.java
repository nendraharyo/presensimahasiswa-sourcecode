package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

public final class RouteTracker
  implements Cloneable, RouteInfo
{
  private boolean connected;
  private RouteInfo.LayerType layered;
  private final InetAddress localAddress;
  private HttpHost[] proxyChain;
  private boolean secure;
  private final HttpHost targetHost;
  private RouteInfo.TunnelType tunnelled;
  
  public RouteTracker(HttpHost paramHttpHost, InetAddress paramInetAddress)
  {
    Args.notNull(paramHttpHost, "Target host");
    this.targetHost = paramHttpHost;
    this.localAddress = paramInetAddress;
    Object localObject = RouteInfo.TunnelType.PLAIN;
    this.tunnelled = ((RouteInfo.TunnelType)localObject);
    localObject = RouteInfo.LayerType.PLAIN;
    this.layered = ((RouteInfo.LayerType)localObject);
  }
  
  public RouteTracker(HttpRoute paramHttpRoute)
  {
    this(localHttpHost, localInetAddress);
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public final void connectProxy(HttpHost paramHttpHost, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject = "Proxy host";
    Args.notNull(paramHttpHost, (String)localObject);
    boolean bool2 = this.connected;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      Asserts.check(bool2, "Already connected");
      this.connected = bool1;
      localObject = new HttpHost[bool1];
      localObject[0] = paramHttpHost;
      this.proxyChain = ((HttpHost[])localObject);
      this.secure = paramBoolean;
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public final void connectTarget(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.connected;
    if (!bool2) {}
    for (bool2 = bool1;; bool2 = false)
    {
      Asserts.check(bool2, "Already connected");
      this.connected = bool1;
      this.secure = paramBoolean;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof RouteTracker;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (RouteTracker)paramObject;
        bool2 = this.connected;
        boolean bool3 = ((RouteTracker)paramObject).connected;
        if (bool2 == bool3)
        {
          bool2 = this.secure;
          bool3 = ((RouteTracker)paramObject).secure;
          if (bool2 == bool3)
          {
            Object localObject1 = this.tunnelled;
            Object localObject2 = ((RouteTracker)paramObject).tunnelled;
            if (localObject1 == localObject2)
            {
              localObject1 = this.layered;
              localObject2 = ((RouteTracker)paramObject).layered;
              if (localObject1 == localObject2)
              {
                localObject1 = this.targetHost;
                localObject2 = ((RouteTracker)paramObject).targetHost;
                bool2 = LangUtils.equals(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.localAddress;
                  localObject2 = ((RouteTracker)paramObject).localAddress;
                  bool2 = LangUtils.equals(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = this.proxyChain;
                    localObject2 = ((RouteTracker)paramObject).proxyChain;
                    bool2 = LangUtils.equals((Object[])localObject1, (Object[])localObject2);
                    if (bool2) {
                      continue;
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final int getHopCount()
  {
    int i = 0;
    HttpHost[] arrayOfHttpHost = null;
    boolean bool = this.connected;
    if (bool)
    {
      arrayOfHttpHost = this.proxyChain;
      if (arrayOfHttpHost != null) {
        break label26;
      }
    }
    for (i = 1;; i = arrayOfHttpHost.length + 1)
    {
      return i;
      label26:
      arrayOfHttpHost = this.proxyChain;
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
        break label61;
      }
    }
    label61:
    for (localObject = this.proxyChain[paramInt];; localObject = this.targetHost)
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
  
  public final HttpHost getProxyHost()
  {
    Object localObject = this.proxyChain;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.proxyChain[0]) {
      return (HttpHost)localObject;
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
    if (localObject != null)
    {
      HttpHost[] arrayOfHttpHost = this.proxyChain;
      int j = arrayOfHttpHost.length;
      int k = 0;
      localObject = null;
      while (k < j)
      {
        HttpHost localHttpHost = arrayOfHttpHost[k];
        int m = LangUtils.hashCode(i, localHttpHost);
        k += 1;
        i = m;
      }
    }
    boolean bool = this.connected;
    i = LangUtils.hashCode(i, bool);
    bool = this.secure;
    i = LangUtils.hashCode(i, bool);
    localObject = this.tunnelled;
    i = LangUtils.hashCode(i, localObject);
    localObject = this.layered;
    return LangUtils.hashCode(i, localObject);
  }
  
  public final boolean isConnected()
  {
    return this.connected;
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
  
  public final void layerProtocol(boolean paramBoolean)
  {
    Asserts.check(this.connected, "No layered protocol unless connected");
    RouteInfo.LayerType localLayerType = RouteInfo.LayerType.LAYERED;
    this.layered = localLayerType;
    this.secure = paramBoolean;
  }
  
  public void reset()
  {
    this.connected = false;
    this.proxyChain = null;
    Object localObject = RouteInfo.TunnelType.PLAIN;
    this.tunnelled = ((RouteInfo.TunnelType)localObject);
    localObject = RouteInfo.LayerType.PLAIN;
    this.layered = ((RouteInfo.LayerType)localObject);
    this.secure = false;
  }
  
  public final HttpRoute toRoute()
  {
    boolean bool1 = this.connected;
    HttpRoute localHttpRoute;
    if (!bool1)
    {
      bool1 = false;
      localHttpRoute = null;
    }
    for (;;)
    {
      return localHttpRoute;
      localHttpRoute = new org/apache/http/conn/routing/HttpRoute;
      HttpHost localHttpHost = this.targetHost;
      InetAddress localInetAddress = this.localAddress;
      HttpHost[] arrayOfHttpHost = this.proxyChain;
      boolean bool2 = this.secure;
      RouteInfo.TunnelType localTunnelType = this.tunnelled;
      RouteInfo.LayerType localLayerType = this.layered;
      localHttpRoute.<init>(localHttpHost, localInetAddress, arrayOfHttpHost, bool2, localTunnelType, localLayerType);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = getHopCount() * 30 + 50;
    localStringBuilder.<init>(i);
    localStringBuilder.append("RouteTracker[");
    Object localObject1 = this.localAddress;
    if (localObject1 != null)
    {
      localObject1 = this.localAddress;
      localStringBuilder.append(localObject1);
      localObject1 = "->";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append('{');
    boolean bool1 = this.connected;
    char c;
    if (bool1)
    {
      c = 'c';
      localStringBuilder.append(c);
    }
    localObject1 = this.tunnelled;
    Object localObject2 = RouteInfo.TunnelType.TUNNELLED;
    if (localObject1 == localObject2)
    {
      c = 't';
      localStringBuilder.append(c);
    }
    localObject1 = this.layered;
    localObject2 = RouteInfo.LayerType.LAYERED;
    if (localObject1 == localObject2)
    {
      c = 'l';
      localStringBuilder.append(c);
    }
    boolean bool2 = this.secure;
    int j;
    if (bool2)
    {
      j = 115;
      localStringBuilder.append(j);
    }
    localStringBuilder.append("}->");
    localObject1 = this.proxyChain;
    if (localObject1 != null)
    {
      localObject2 = this.proxyChain;
      int m = localObject2.length;
      j = 0;
      localObject1 = null;
      while (j < m)
      {
        Object localObject3 = localObject2[j];
        localStringBuilder.append(localObject3);
        localObject3 = "->";
        localStringBuilder.append((String)localObject3);
        int k;
        j += 1;
      }
    }
    localObject1 = this.targetHost;
    localStringBuilder.append(localObject1);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public final void tunnelProxy(HttpHost paramHttpHost, boolean paramBoolean)
  {
    Args.notNull(paramHttpHost, "Proxy host");
    Asserts.check(this.connected, "No tunnel unless connected");
    Asserts.notNull(this.proxyChain, "No tunnel without proxy");
    HttpHost[] arrayOfHttpHost1 = new HttpHost[this.proxyChain.length + 1];
    HttpHost[] arrayOfHttpHost2 = this.proxyChain;
    int i = this.proxyChain.length;
    System.arraycopy(arrayOfHttpHost2, 0, arrayOfHttpHost1, 0, i);
    int j = arrayOfHttpHost1.length + -1;
    arrayOfHttpHost1[j] = paramHttpHost;
    this.proxyChain = arrayOfHttpHost1;
    this.secure = paramBoolean;
  }
  
  public final void tunnelTarget(boolean paramBoolean)
  {
    Asserts.check(this.connected, "No tunnel unless connected");
    Asserts.notNull(this.proxyChain, "No tunnel without proxy");
    RouteInfo.TunnelType localTunnelType = RouteInfo.TunnelType.TUNNELLED;
    this.tunnelled = localTunnelType;
    this.secure = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\routing\RouteTracker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */