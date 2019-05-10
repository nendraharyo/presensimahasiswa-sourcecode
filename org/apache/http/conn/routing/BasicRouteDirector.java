package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

public class BasicRouteDirector
  implements HttpRouteDirector
{
  protected int directStep(RouteInfo paramRouteInfo1, RouteInfo paramRouteInfo2)
  {
    int i = -1;
    int j = paramRouteInfo2.getHopCount();
    int k = 1;
    if (j > k) {}
    for (;;)
    {
      return i;
      Object localObject1 = paramRouteInfo1.getTargetHost();
      Object localObject2 = paramRouteInfo2.getTargetHost();
      boolean bool1 = ((HttpHost)localObject1).equals(localObject2);
      if (bool1)
      {
        bool1 = paramRouteInfo1.isSecure();
        boolean bool2 = paramRouteInfo2.isSecure();
        if (bool1 == bool2)
        {
          localObject1 = paramRouteInfo1.getLocalAddress();
          if (localObject1 != null)
          {
            localObject1 = paramRouteInfo1.getLocalAddress();
            localObject2 = paramRouteInfo2.getLocalAddress();
            bool1 = ((InetAddress)localObject1).equals(localObject2);
            if (!bool1) {}
          }
          else
          {
            i = 0;
          }
        }
      }
    }
  }
  
  protected int firstStep(RouteInfo paramRouteInfo)
  {
    int i = 1;
    int j = paramRouteInfo.getHopCount();
    if (j > i) {
      i = 2;
    }
    return i;
  }
  
  public int nextStep(RouteInfo paramRouteInfo1, RouteInfo paramRouteInfo2)
  {
    int i = 1;
    String str = "Planned route";
    Args.notNull(paramRouteInfo1, str);
    int j;
    if (paramRouteInfo2 != null)
    {
      j = paramRouteInfo2.getHopCount();
      if (j >= i) {}
    }
    else
    {
      j = firstStep(paramRouteInfo1);
    }
    for (;;)
    {
      return j;
      j = paramRouteInfo1.getHopCount();
      if (j > i) {
        j = proxiedStep(paramRouteInfo1, paramRouteInfo2);
      } else {
        j = directStep(paramRouteInfo1, paramRouteInfo2);
      }
    }
  }
  
  protected int proxiedStep(RouteInfo paramRouteInfo1, RouteInfo paramRouteInfo2)
  {
    int i = -1;
    int j = paramRouteInfo2.getHopCount();
    int n = 1;
    if (j <= n) {}
    for (;;)
    {
      return i;
      HttpHost localHttpHost1 = paramRouteInfo1.getTargetHost();
      HttpHost localHttpHost2 = paramRouteInfo2.getTargetHost();
      int k = localHttpHost1.equals(localHttpHost2);
      if (k != 0)
      {
        n = paramRouteInfo1.getHopCount();
        int i1 = paramRouteInfo2.getHopCount();
        if (n >= i1)
        {
          k = 0;
          localHttpHost1 = null;
          for (;;)
          {
            int i2 = i1 + -1;
            if (k >= i2) {
              break label137;
            }
            HttpHost localHttpHost3 = paramRouteInfo1.getHopTarget(k);
            HttpHost localHttpHost4 = paramRouteInfo2.getHopTarget(k);
            boolean bool3 = localHttpHost3.equals(localHttpHost4);
            if (!bool3) {
              break;
            }
            int m;
            k += 1;
          }
          label137:
          if (n > i1)
          {
            i = 4;
          }
          else
          {
            boolean bool1 = paramRouteInfo2.isTunnelled();
            if (bool1)
            {
              bool1 = paramRouteInfo1.isTunnelled();
              if (!bool1) {}
            }
            else
            {
              bool1 = paramRouteInfo2.isLayered();
              if (bool1)
              {
                bool1 = paramRouteInfo1.isLayered();
                if (!bool1) {}
              }
              else
              {
                bool1 = paramRouteInfo1.isTunnelled();
                if (bool1)
                {
                  bool1 = paramRouteInfo2.isTunnelled();
                  if (!bool1)
                  {
                    i = 3;
                    continue;
                  }
                }
                bool1 = paramRouteInfo1.isLayered();
                if (bool1)
                {
                  bool1 = paramRouteInfo2.isLayered();
                  if (!bool1)
                  {
                    i = 5;
                    continue;
                  }
                }
                bool1 = paramRouteInfo1.isSecure();
                boolean bool2 = paramRouteInfo2.isSecure();
                if (bool1 == bool2) {
                  i = 0;
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\routing\BasicRouteDirector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */