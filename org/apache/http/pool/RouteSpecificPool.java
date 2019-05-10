package org.apache.http.pool;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

abstract class RouteSpecificPool
{
  private final LinkedList available;
  private final Set leased;
  private final LinkedList pending;
  private final Object route;
  
  RouteSpecificPool(Object paramObject)
  {
    this.route = paramObject;
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.leased = ((Set)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.available = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.pending = ((LinkedList)localObject);
  }
  
  public PoolEntry add(Object paramObject)
  {
    PoolEntry localPoolEntry = createEntry(paramObject);
    this.leased.add(localPoolEntry);
    return localPoolEntry;
  }
  
  protected abstract PoolEntry createEntry(Object paramObject);
  
  public void free(PoolEntry paramPoolEntry, boolean paramBoolean)
  {
    Args.notNull(paramPoolEntry, "Pool entry");
    Object localObject = this.leased;
    boolean bool = ((Set)localObject).remove(paramPoolEntry);
    String str = "Entry %s has not been leased from this pool";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramPoolEntry;
    Asserts.check(bool, str, arrayOfObject);
    if (paramBoolean)
    {
      localObject = this.available;
      ((LinkedList)localObject).addFirst(paramPoolEntry);
    }
  }
  
  public int getAllocatedCount()
  {
    int i = this.available.size();
    int j = this.leased.size();
    return i + j;
  }
  
  public int getAvailableCount()
  {
    return this.available.size();
  }
  
  public PoolEntry getFree(Object paramObject)
  {
    Object localObject1 = this.available;
    boolean bool1 = ((LinkedList)localObject1).isEmpty();
    Object localObject2;
    Object localObject3;
    if (!bool1) {
      if (paramObject != null)
      {
        localObject1 = this.available;
        localObject2 = ((LinkedList)localObject1).iterator();
        boolean bool2;
        do
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (PoolEntry)((Iterator)localObject2).next();
          localObject3 = ((PoolEntry)localObject1).getState();
          bool2 = paramObject.equals(localObject3);
        } while (!bool2);
        ((Iterator)localObject2).remove();
        localObject2 = this.leased;
        ((Set)localObject2).add(localObject1);
      }
    }
    for (;;)
    {
      return (PoolEntry)localObject1;
      localObject1 = this.available;
      localObject2 = ((LinkedList)localObject1).iterator();
      do
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (PoolEntry)((Iterator)localObject2).next();
        localObject3 = ((PoolEntry)localObject1).getState();
      } while (localObject3 != null);
      ((Iterator)localObject2).remove();
      localObject2 = this.leased;
      ((Set)localObject2).add(localObject1);
      continue;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public PoolEntry getLastUsed()
  {
    Object localObject = this.available;
    boolean bool = ((LinkedList)localObject).isEmpty();
    if (!bool) {}
    for (localObject = (PoolEntry)this.available.getLast();; localObject = null)
    {
      return (PoolEntry)localObject;
      bool = false;
    }
  }
  
  public int getLeasedCount()
  {
    return this.leased.size();
  }
  
  public int getPendingCount()
  {
    return this.pending.size();
  }
  
  public final Object getRoute()
  {
    return this.route;
  }
  
  public PoolEntryFuture nextPending()
  {
    return (PoolEntryFuture)this.pending.poll();
  }
  
  public void queue(PoolEntryFuture paramPoolEntryFuture)
  {
    if (paramPoolEntryFuture == null) {}
    for (;;)
    {
      return;
      LinkedList localLinkedList = this.pending;
      localLinkedList.add(paramPoolEntryFuture);
    }
  }
  
  public boolean remove(PoolEntry paramPoolEntry)
  {
    Args.notNull(paramPoolEntry, "Pool entry");
    Object localObject = this.available;
    boolean bool = ((LinkedList)localObject).remove(paramPoolEntry);
    if (!bool)
    {
      localObject = this.leased;
      bool = ((Set)localObject).remove(paramPoolEntry);
      if (!bool)
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  public void shutdown()
  {
    Object localObject = this.pending;
    Iterator localIterator = ((LinkedList)localObject).iterator();
    boolean bool1;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PoolEntryFuture)localIterator.next();
      boolean bool2 = true;
      ((PoolEntryFuture)localObject).cancel(bool2);
    }
    this.pending.clear();
    localObject = this.available;
    localIterator = ((LinkedList)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PoolEntry)localIterator.next();
      ((PoolEntry)localObject).close();
    }
    this.available.clear();
    localObject = this.leased;
    localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PoolEntry)localIterator.next();
      ((PoolEntry)localObject).close();
    }
    this.leased.clear();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[route: ");
    Object localObject = this.route;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][leased: ");
    int i = this.leased.size();
    localStringBuilder.append(i);
    localStringBuilder.append("][available: ");
    i = this.available.size();
    localStringBuilder.append(i);
    localStringBuilder.append("][pending: ");
    i = this.pending.size();
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void unqueue(PoolEntryFuture paramPoolEntryFuture)
  {
    if (paramPoolEntryFuture == null) {}
    for (;;)
    {
      return;
      LinkedList localLinkedList = this.pending;
      localLinkedList.remove(paramPoolEntryFuture);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\RouteSpecificPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */