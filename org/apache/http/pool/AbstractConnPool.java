package org.apache.http.pool;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public abstract class AbstractConnPool
  implements ConnPool, ConnPoolControl
{
  private final LinkedList available;
  private final ConnFactory connFactory;
  private volatile int defaultMaxPerRoute;
  private volatile boolean isShutDown;
  private final Set leased;
  private final Lock lock;
  private final Map maxPerRoute;
  private volatile int maxTotal;
  private final LinkedList pending;
  private final Map routeToPool;
  
  public AbstractConnPool(ConnFactory paramConnFactory, int paramInt1, int paramInt2)
  {
    Object localObject = (ConnFactory)Args.notNull(paramConnFactory, "Connection factory");
    this.connFactory = ((ConnFactory)localObject);
    int i = Args.notNegative(paramInt1, "Max per route value");
    this.defaultMaxPerRoute = i;
    i = Args.notNegative(paramInt2, "Max total value");
    this.maxTotal = i;
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.lock = ((Lock)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.routeToPool = ((Map)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.leased = ((Set)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.available = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.pending = ((LinkedList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.maxPerRoute = ((Map)localObject);
  }
  
  private int getMax(Object paramObject)
  {
    Integer localInteger = (Integer)this.maxPerRoute.get(paramObject);
    if (localInteger != null) {}
    for (int i = localInteger.intValue();; i = this.defaultMaxPerRoute) {
      return i;
    }
  }
  
  private RouteSpecificPool getPool(Object paramObject)
  {
    Object localObject = (RouteSpecificPool)this.routeToPool.get(paramObject);
    if (localObject == null)
    {
      localObject = new org/apache/http/pool/AbstractConnPool$1;
      ((AbstractConnPool.1)localObject).<init>(this, paramObject, paramObject);
      Map localMap = this.routeToPool;
      localMap.put(paramObject, localObject);
    }
    return (RouteSpecificPool)localObject;
  }
  
  private PoolEntry getPoolEntryBlocking(Object paramObject1, Object paramObject2, long paramLong, TimeUnit paramTimeUnit, PoolEntryFuture paramPoolEntryFuture)
  {
    int i = 0;
    Object localObject1 = null;
    long l1 = 0L;
    boolean bool2 = paramLong < l1;
    long l2;
    if (bool2)
    {
      localObject1 = new java/util/Date;
      l1 = System.currentTimeMillis();
      l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
      ((Date)localObject1).<init>(l1);
    }
    Object localObject5 = this.lock;
    ((Lock)localObject5).lock();
    for (;;)
    {
      RouteSpecificPool localRouteSpecificPool;
      try
      {
        localRouteSpecificPool = getPool(paramObject1);
        bool2 = false;
        localObject5 = null;
        if (localObject5 != null) {
          break label652;
        }
        bool2 = this.isShutDown;
        if (!bool2)
        {
          bool2 = true;
          localObject6 = "Connection pool shut down";
          Asserts.check(bool2, (String)localObject6);
          localObject5 = localRouteSpecificPool.getFree(paramObject2);
          if (localObject5 == null)
          {
            if (localObject5 == null) {
              break label262;
            }
            localObject1 = this.available;
            ((LinkedList)localObject1).remove(localObject5);
            localObject1 = this.leased;
            ((Set)localObject1).add(localObject5);
            this.lock.unlock();
            localObject1 = localObject5;
            return (PoolEntry)localObject1;
          }
        }
        else
        {
          bool2 = false;
          localObject5 = null;
          continue;
        }
        k = ((PoolEntry)localObject5).isClosed();
        if (k == 0)
        {
          l2 = System.currentTimeMillis();
          k = ((PoolEntry)localObject5).isExpired(l2);
          if (k == 0) {
            continue;
          }
        }
        ((PoolEntry)localObject5).close();
        localObject6 = this.available;
        ((LinkedList)localObject6).remove(localObject5);
        k = 0;
        localObject6 = null;
        localRouteSpecificPool.free((PoolEntry)localObject5, false);
        continue;
        n = getMax(paramObject1);
      }
      finally
      {
        this.lock.unlock();
      }
      label262:
      int n;
      int k = 0;
      Object localObject6 = null;
      int i1 = localRouteSpecificPool.getAllocatedCount() + 1 - n;
      i1 = Math.max(0, i1);
      if (i1 > 0)
      {
        k = 0;
        localObject6 = null;
      }
      LinkedList localLinkedList1;
      Object localObject3;
      for (;;)
      {
        PoolEntry localPoolEntry;
        int m;
        if (k < i1)
        {
          localPoolEntry = localRouteSpecificPool.getLastUsed();
          if (localPoolEntry != null) {}
        }
        else
        {
          m = localRouteSpecificPool.getAllocatedCount();
          if (m >= n) {
            break label567;
          }
          localObject6 = this.leased;
          m = ((Set)localObject6).size();
          m = this.maxTotal - m;
          n = 0;
          localLinkedList1 = null;
          m = Math.max(m, 0);
          if (m <= 0) {
            break label567;
          }
          localObject3 = this.available;
          i = ((LinkedList)localObject3).size();
          int j = m + -1;
          if (i > j)
          {
            localObject3 = this.available;
            boolean bool1 = ((LinkedList)localObject3).isEmpty();
            if (!bool1)
            {
              localObject3 = this.available;
              localObject3 = ((LinkedList)localObject3).removeLast();
              localObject3 = (PoolEntry)localObject3;
              ((PoolEntry)localObject3).close();
              localObject5 = ((PoolEntry)localObject3).getRoute();
              localObject5 = getPool(localObject5);
              ((RouteSpecificPool)localObject5).remove((PoolEntry)localObject3);
            }
          }
          localObject3 = this.connFactory;
          localObject3 = ((ConnFactory)localObject3).create(paramObject1);
          localObject3 = localRouteSpecificPool.add(localObject3);
          localObject5 = this.leased;
          ((Set)localObject5).add(localObject3);
          localObject5 = this.lock;
          ((Lock)localObject5).unlock();
          break;
        }
        localPoolEntry.close();
        LinkedList localLinkedList2 = this.available;
        localLinkedList2.remove(localPoolEntry);
        localRouteSpecificPool.remove(localPoolEntry);
        m += 1;
      }
      try
      {
        label567:
        localRouteSpecificPool.queue(paramPoolEntryFuture);
        localObject6 = this.pending;
        ((LinkedList)localObject6).add(paramPoolEntryFuture);
        boolean bool3 = paramPoolEntryFuture.await((Date)localObject3);
        localRouteSpecificPool.unqueue(paramPoolEntryFuture);
        localLinkedList1 = this.pending;
        localLinkedList1.remove(paramPoolEntryFuture);
        if ((bool3) || (localObject3 == null)) {
          continue;
        }
        l2 = ((Date)localObject3).getTime();
        long l3 = System.currentTimeMillis();
        bool3 = l2 < l3;
        if (bool3) {
          continue;
        }
        label652:
        localObject3 = new java/util/concurrent/TimeoutException;
        localObject5 = "Timeout waiting for connection";
        ((TimeoutException)localObject3).<init>((String)localObject5);
        throw ((Throwable)localObject3);
      }
      finally
      {
        localRouteSpecificPool.unqueue(paramPoolEntryFuture);
        localObject5 = this.pending;
        ((LinkedList)localObject5).remove(paramPoolEntryFuture);
      }
    }
  }
  
  private void purgePoolMap()
  {
    Object localObject = this.routeToPool.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (RouteSpecificPool)((Map.Entry)localIterator.next()).getValue();
      int j = ((RouteSpecificPool)localObject).getPendingCount();
      int i = ((RouteSpecificPool)localObject).getAllocatedCount() + j;
      if (i == 0) {
        localIterator.remove();
      }
    }
  }
  
  public void closeExpired()
  {
    long l = System.currentTimeMillis();
    AbstractConnPool.4 local4 = new org/apache/http/pool/AbstractConnPool$4;
    local4.<init>(this, l);
    enumAvailable(local4);
  }
  
  public void closeIdle(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    Object localObject = "Time unit";
    Args.notNull(paramTimeUnit, (String)localObject);
    long l2 = paramTimeUnit.toMillis(paramLong);
    boolean bool = l2 < l1;
    if (bool) {}
    for (;;)
    {
      l1 = System.currentTimeMillis() - l1;
      localObject = new org/apache/http/pool/AbstractConnPool$3;
      ((AbstractConnPool.3)localObject).<init>(this, l1);
      enumAvailable((PoolEntryCallback)localObject);
      return;
      l1 = l2;
    }
  }
  
  protected abstract PoolEntry createEntry(Object paramObject1, Object paramObject2);
  
  protected void enumAvailable(PoolEntryCallback paramPoolEntryCallback)
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.available;
      Iterator localIterator = ((LinkedList)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (PoolEntry)localObject1;
        paramPoolEntryCallback.process((PoolEntry)localObject1);
        boolean bool2 = ((PoolEntry)localObject1).isClosed();
        if (bool2)
        {
          Object localObject3 = ((PoolEntry)localObject1).getRoute();
          localObject3 = getPool(localObject3);
          ((RouteSpecificPool)localObject3).remove((PoolEntry)localObject1);
          localIterator.remove();
        }
      }
      purgePoolMap();
    }
    finally
    {
      this.lock.unlock();
    }
    this.lock.unlock();
  }
  
  protected void enumLeased(PoolEntryCallback paramPoolEntryCallback)
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.leased;
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (PoolEntry)localObject1;
        paramPoolEntryCallback.process((PoolEntry)localObject1);
      }
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public int getDefaultMaxPerRoute()
  {
    Lock localLock = this.lock;
    localLock.lock();
    try
    {
      int i = this.defaultMaxPerRoute;
      return i;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public int getMaxPerRoute(Object paramObject)
  {
    Args.notNull(paramObject, "Route");
    Lock localLock = this.lock;
    localLock.lock();
    try
    {
      int i = getMax(paramObject);
      return i;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public int getMaxTotal()
  {
    Lock localLock = this.lock;
    localLock.lock();
    try
    {
      int i = this.maxTotal;
      return i;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public PoolStats getStats(Object paramObject)
  {
    Args.notNull(paramObject, "Route");
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = getPool(paramObject);
      PoolStats localPoolStats = new org/apache/http/pool/PoolStats;
      int i = ((RouteSpecificPool)localObject1).getLeasedCount();
      int j = ((RouteSpecificPool)localObject1).getPendingCount();
      int k = ((RouteSpecificPool)localObject1).getAvailableCount();
      int m = getMax(paramObject);
      localPoolStats.<init>(i, j, k, m);
      return localPoolStats;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public PoolStats getTotalStats()
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new org/apache/http/pool/PoolStats;
      Set localSet = this.leased;
      int i = localSet.size();
      LinkedList localLinkedList1 = this.pending;
      int j = localLinkedList1.size();
      LinkedList localLinkedList2 = this.available;
      int k = localLinkedList2.size();
      int m = this.maxTotal;
      ((PoolStats)localObject1).<init>(i, j, k, m);
      return (PoolStats)localObject1;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public boolean isShutdown()
  {
    return this.isShutDown;
  }
  
  public Future lease(Object paramObject1, Object paramObject2)
  {
    return lease(paramObject1, paramObject2, null);
  }
  
  public Future lease(Object paramObject1, Object paramObject2, FutureCallback paramFutureCallback)
  {
    Object localObject = "Route";
    Args.notNull(paramObject1, (String)localObject);
    boolean bool = this.isShutDown;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      Asserts.check(bool, "Connection pool shut down");
      localObject = new org/apache/http/pool/AbstractConnPool$2;
      Lock localLock = this.lock;
      ((AbstractConnPool.2)localObject).<init>(this, localLock, paramFutureCallback, paramObject1, paramObject2);
      return (Future)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  protected void onLease(PoolEntry paramPoolEntry) {}
  
  protected void onRelease(PoolEntry paramPoolEntry) {}
  
  public void release(PoolEntry paramPoolEntry, boolean paramBoolean)
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    for (;;)
    {
      try
      {
        localObject1 = this.leased;
        boolean bool1 = ((Set)localObject1).remove(paramPoolEntry);
        if (bool1)
        {
          localObject1 = paramPoolEntry.getRoute();
          localObject1 = getPool(localObject1);
          ((RouteSpecificPool)localObject1).free(paramPoolEntry, paramBoolean);
          if (!paramBoolean) {
            continue;
          }
          boolean bool2 = this.isShutDown;
          if (bool2) {
            continue;
          }
          LinkedList localLinkedList = this.available;
          localLinkedList.addFirst(paramPoolEntry);
          onRelease(paramPoolEntry);
          localObject1 = ((RouteSpecificPool)localObject1).nextPending();
          if (localObject1 == null) {
            break label138;
          }
          localLinkedList = this.pending;
          localLinkedList.remove(localObject1);
          if (localObject1 != null) {
            ((PoolEntryFuture)localObject1).wakeup();
          }
        }
        return;
        paramPoolEntry.close();
        continue;
        localObject3 = this.pending;
      }
      finally
      {
        this.lock.unlock();
      }
      label138:
      Object localObject3 = ((LinkedList)localObject3).poll();
      localObject3 = (PoolEntryFuture)localObject3;
    }
  }
  
  public void setDefaultMaxPerRoute(int paramInt)
  {
    Args.notNegative(paramInt, "Max per route value");
    Lock localLock = this.lock;
    localLock.lock();
    try
    {
      this.defaultMaxPerRoute = paramInt;
      return;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public void setMaxPerRoute(Object paramObject, int paramInt)
  {
    Args.notNull(paramObject, "Route");
    Args.notNegative(paramInt, "Max per route value");
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.maxPerRoute;
      Integer localInteger = Integer.valueOf(paramInt);
      ((Map)localObject1).put(paramObject, localInteger);
      return;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public void setMaxTotal(int paramInt)
  {
    Args.notNegative(paramInt, "Max value");
    Lock localLock = this.lock;
    localLock.lock();
    try
    {
      this.maxTotal = paramInt;
      return;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public void shutdown()
  {
    boolean bool = this.isShutDown;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.isShutDown = bool;
      Object localObject1 = this.lock;
      ((Lock)localObject1).lock();
      try
      {
        localObject1 = this.available;
        localIterator = ((LinkedList)localObject1).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (PoolEntry)localObject1;
          ((PoolEntry)localObject1).close();
        }
        localObject3 = this.leased;
      }
      finally
      {
        this.lock.unlock();
      }
      Iterator localIterator = ((Set)localObject3).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject3 = localIterator.next();
        localObject3 = (PoolEntry)localObject3;
        ((PoolEntry)localObject3).close();
      }
      Object localObject3 = this.routeToPool;
      localObject3 = ((Map)localObject3).values();
      localIterator = ((Collection)localObject3).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject3 = localIterator.next();
        localObject3 = (RouteSpecificPool)localObject3;
        ((RouteSpecificPool)localObject3).shutdown();
      }
      localObject3 = this.routeToPool;
      ((Map)localObject3).clear();
      localObject3 = this.leased;
      ((Set)localObject3).clear();
      localObject3 = this.available;
      ((LinkedList)localObject3).clear();
      localObject3 = this.lock;
      ((Lock)localObject3).unlock();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[leased: ");
    Object localObject = this.leased;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][available: ");
    localObject = this.available;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][pending: ");
    localObject = this.pending;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\AbstractConnPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */