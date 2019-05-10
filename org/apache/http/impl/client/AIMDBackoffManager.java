package org.apache.http.impl.client;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.BackoffManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.util.Args;

public class AIMDBackoffManager
  implements BackoffManager
{
  private double backoffFactor = 0.5D;
  private int cap = 2;
  private final Clock clock;
  private final ConnPoolControl connPerRoute;
  private long coolDown = 5000L;
  private final Map lastRouteBackoffs;
  private final Map lastRouteProbes;
  
  public AIMDBackoffManager(ConnPoolControl paramConnPoolControl)
  {
    this(paramConnPoolControl, localSystemClock);
  }
  
  AIMDBackoffManager(ConnPoolControl paramConnPoolControl, Clock paramClock)
  {
    this.clock = paramClock;
    this.connPerRoute = paramConnPoolControl;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.lastRouteProbes = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.lastRouteBackoffs = localHashMap;
  }
  
  private int getBackedOffPoolSize(int paramInt)
  {
    int i = 1;
    if (paramInt <= i) {}
    for (;;)
    {
      return i;
      double d1 = this.backoffFactor;
      double d2 = paramInt;
      d1 = Math.floor(d1 * d2);
      i = (int)d1;
    }
  }
  
  private Long getLastUpdate(Map paramMap, HttpRoute paramHttpRoute)
  {
    Long localLong = (Long)paramMap.get(paramHttpRoute);
    if (localLong == null)
    {
      long l = 0L;
      localLong = Long.valueOf(l);
    }
    return localLong;
  }
  
  public void backOff(HttpRoute paramHttpRoute)
  {
    synchronized (this.connPerRoute)
    {
      Object localObject1 = this.connPerRoute;
      int i = ((ConnPoolControl)localObject1).getMaxPerRoute(paramHttpRoute);
      Object localObject3 = this.lastRouteBackoffs;
      localObject3 = getLastUpdate((Map)localObject3, paramHttpRoute);
      Clock localClock = this.clock;
      long l1 = localClock.getCurrentTime();
      long l2 = ((Long)localObject3).longValue();
      l2 = l1 - l2;
      long l3 = this.coolDown;
      boolean bool = l2 < l3;
      if (bool) {
        return;
      }
      localObject3 = this.connPerRoute;
      i = getBackedOffPoolSize(i);
      ((ConnPoolControl)localObject3).setMaxPerRoute(paramHttpRoute, i);
      localObject1 = this.lastRouteBackoffs;
      localObject3 = Long.valueOf(l1);
      ((Map)localObject1).put(paramHttpRoute, localObject3);
    }
  }
  
  public void probe(HttpRoute paramHttpRoute)
  {
    synchronized (this.connPerRoute)
    {
      Object localObject1 = this.connPerRoute;
      int i = ((ConnPoolControl)localObject1).getMaxPerRoute(paramHttpRoute);
      int j = this.cap;
      if (i >= j) {
        i = this.cap;
      }
      long l1;
      for (;;)
      {
        localObject3 = this.lastRouteProbes;
        localObject3 = getLastUpdate((Map)localObject3, paramHttpRoute);
        Object localObject4 = this.lastRouteBackoffs;
        localObject4 = getLastUpdate((Map)localObject4, paramHttpRoute);
        Clock localClock = this.clock;
        l1 = localClock.getCurrentTime();
        long l2 = ((Long)localObject3).longValue();
        l2 = l1 - l2;
        long l3 = this.coolDown;
        boolean bool = l2 < l3;
        if (!bool)
        {
          long l4 = ((Long)localObject4).longValue();
          l4 = l1 - l4;
          l2 = this.coolDown;
          bool = l4 < l2;
          if (!bool) {
            break;
          }
        }
        return;
        i += 1;
      }
      Object localObject3 = this.connPerRoute;
      ((ConnPoolControl)localObject3).setMaxPerRoute(paramHttpRoute, i);
      localObject1 = this.lastRouteProbes;
      localObject3 = Long.valueOf(l1);
      ((Map)localObject1).put(paramHttpRoute, localObject3);
    }
  }
  
  public void setBackoffFactor(double paramDouble)
  {
    double d = 0.0D;
    boolean bool = paramDouble < d;
    if (bool)
    {
      d = 1.0D;
      bool = paramDouble < d;
      if (!bool) {}
    }
    for (bool = true;; bool = false)
    {
      Args.check(bool, "Backoff factor must be 0.0 < f < 1.0");
      this.backoffFactor = paramDouble;
      return;
    }
  }
  
  public void setCooldownMillis(long paramLong)
  {
    Args.positive(this.coolDown, "Cool down");
    this.coolDown = paramLong;
  }
  
  public void setPerHostConnectionCap(int paramInt)
  {
    Args.positive(paramInt, "Per host connection cap");
    this.cap = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AIMDBackoffManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */