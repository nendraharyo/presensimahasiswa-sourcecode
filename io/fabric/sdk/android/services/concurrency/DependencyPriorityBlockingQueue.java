package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DependencyPriorityBlockingQueue
  extends PriorityBlockingQueue
{
  static final int PEEK = 1;
  static final int POLL = 2;
  static final int POLL_WITH_TIMEOUT = 3;
  static final int TAKE;
  final Queue blockedQueue;
  private final ReentrantLock lock;
  
  public DependencyPriorityBlockingQueue()
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.blockedQueue = ((Queue)localObject);
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.lock = ((ReentrantLock)localObject);
  }
  
  boolean canProcess(Dependency paramDependency)
  {
    return paramDependency.areDependenciesMet();
  }
  
  public void clear()
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      localObject1 = this.blockedQueue;
      ((Queue)localObject1).clear();
      super.clear();
      return;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  Object[] concatenate(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = paramArrayOfObject1.length;
    int j = paramArrayOfObject2.length;
    Object localObject = paramArrayOfObject1.getClass().getComponentType();
    int k = i + j;
    localObject = (Object[])Array.newInstance((Class)localObject, k);
    System.arraycopy(paramArrayOfObject1, 0, localObject, 0, i);
    System.arraycopy(paramArrayOfObject2, 0, localObject, i, j);
    return (Object[])localObject;
  }
  
  /* Error */
  public boolean contains(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 39	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 77	java/util/concurrent/PriorityBlockingQueue:contains	(Ljava/lang/Object;)Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifne +20 -> 36
    //   19: aload_0
    //   20: getfield 26	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:blockedQueue	Ljava/util/Queue;
    //   23: astore_2
    //   24: aload_2
    //   25: aload_1
    //   26: invokeinterface 78 2 0
    //   31: istore_3
    //   32: iload_3
    //   33: ifeq +14 -> 47
    //   36: iconst_1
    //   37: istore_3
    //   38: aload_0
    //   39: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   42: invokevirtual 48	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   45: iload_3
    //   46: ireturn
    //   47: iconst_0
    //   48: istore_3
    //   49: aconst_null
    //   50: astore_2
    //   51: goto -13 -> 38
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   59: invokevirtual 48	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	DependencyPriorityBlockingQueue
    //   0	64	1	paramObject	Object
    //   4	47	2	localObject1	Object
    //   54	9	2	localObject2	Object
    //   14	35	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	4	54	finally
    //   5	9	54	finally
    //   10	14	54	finally
    //   19	23	54	finally
    //   25	31	54	finally
  }
  
  public int drainTo(Collection paramCollection)
  {
    int i;
    try
    {
      ReentrantLock localReentrantLock = this.lock;
      localReentrantLock.lock();
      i = super.drainTo(paramCollection);
      Object localObject2 = this.blockedQueue;
      int j = ((Queue)localObject2).size();
      i += j;
      for (;;)
      {
        localObject2 = this.blockedQueue;
        boolean bool = ((Queue)localObject2).isEmpty();
        if (bool) {
          break;
        }
        localObject2 = this.blockedQueue;
        localObject2 = ((Queue)localObject2).poll();
        paramCollection.add(localObject2);
      }
    }
    finally
    {
      this.lock.unlock();
    }
    return i;
  }
  
  public int drainTo(Collection paramCollection, int paramInt)
  {
    try
    {
      ReentrantLock localReentrantLock = this.lock;
      localReentrantLock.lock();
      int i = super.drainTo(paramCollection, paramInt);
      for (;;)
      {
        Object localObject2 = this.blockedQueue;
        boolean bool = ((Queue)localObject2).isEmpty();
        if ((bool) || (i > paramInt)) {
          break;
        }
        localObject2 = this.blockedQueue;
        localObject2 = ((Queue)localObject2).poll();
        paramCollection.add(localObject2);
        i += 1;
      }
      return i;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  Dependency get(int paramInt, Long paramLong, TimeUnit paramTimeUnit)
  {
    for (;;)
    {
      Dependency localDependency = performOperation(paramInt, paramLong, paramTimeUnit);
      if (localDependency != null)
      {
        boolean bool = canProcess(localDependency);
        if (!bool) {}
      }
      else
      {
        return localDependency;
      }
      offerBlockedResult(paramInt, localDependency);
    }
  }
  
  boolean offerBlockedResult(int paramInt, Dependency paramDependency)
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      int i = 1;
      if (paramInt == i) {
        super.remove(paramDependency);
      }
      localObject1 = this.blockedQueue;
      boolean bool = ((Queue)localObject1).offer(paramDependency);
      return bool;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public Dependency peek()
  {
    Dependency localDependency = null;
    int i = 1;
    try
    {
      localDependency = get(i, null, null);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    return localDependency;
  }
  
  Dependency performOperation(int paramInt, Long paramLong, TimeUnit paramTimeUnit)
  {
    Dependency localDependency;
    switch (paramInt)
    {
    default: 
      localDependency = null;
    }
    for (;;)
    {
      return localDependency;
      localDependency = (Dependency)super.take();
      continue;
      localDependency = (Dependency)super.peek();
      continue;
      localDependency = (Dependency)super.poll();
      continue;
      long l = paramLong.longValue();
      localDependency = (Dependency)super.poll(l, paramTimeUnit);
    }
  }
  
  public Dependency poll()
  {
    Dependency localDependency = null;
    int i = 2;
    try
    {
      localDependency = get(i, null, null);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    return localDependency;
  }
  
  public Dependency poll(long paramLong, TimeUnit paramTimeUnit)
  {
    Long localLong = Long.valueOf(paramLong);
    return get(3, localLong, paramTimeUnit);
  }
  
  public void recycleBlockedQueue()
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      localObject1 = this.blockedQueue;
      Iterator localIterator = ((Queue)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (Dependency)localObject1;
        boolean bool2 = canProcess((Dependency)localObject1);
        if (bool2)
        {
          super.offer(localObject1);
          localIterator.remove();
        }
      }
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  /* Error */
  public boolean remove(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 39	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 117	java/util/concurrent/PriorityBlockingQueue:remove	(Ljava/lang/Object;)Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifne +20 -> 36
    //   19: aload_0
    //   20: getfield 26	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:blockedQueue	Ljava/util/Queue;
    //   23: astore_2
    //   24: aload_2
    //   25: aload_1
    //   26: invokeinterface 171 2 0
    //   31: istore_3
    //   32: iload_3
    //   33: ifeq +14 -> 47
    //   36: iconst_1
    //   37: istore_3
    //   38: aload_0
    //   39: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   42: invokevirtual 48	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   45: iload_3
    //   46: ireturn
    //   47: iconst_0
    //   48: istore_3
    //   49: aconst_null
    //   50: astore_2
    //   51: goto -13 -> 38
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 31	io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   59: invokevirtual 48	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	DependencyPriorityBlockingQueue
    //   0	64	1	paramObject	Object
    //   4	47	2	localObject1	Object
    //   54	9	2	localObject2	Object
    //   14	35	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	4	54	finally
    //   5	9	54	finally
    //   10	14	54	finally
    //   19	23	54	finally
    //   25	31	54	finally
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    try
    {
      ReentrantLock localReentrantLock = this.lock;
      localReentrantLock.lock();
      boolean bool1 = super.removeAll(paramCollection);
      Queue localQueue = this.blockedQueue;
      boolean bool2 = localQueue.removeAll(paramCollection);
      bool1 |= bool2;
      return bool1;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public int size()
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      localObject1 = this.blockedQueue;
      int i = ((Queue)localObject1).size();
      int j = super.size();
      i += j;
      return i;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public Dependency take()
  {
    return get(0, null, null);
  }
  
  public Object[] toArray()
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      localObject1 = super.toArray();
      Object localObject3 = this.blockedQueue;
      localObject3 = ((Queue)localObject3).toArray();
      localObject1 = concatenate((Object[])localObject1, (Object[])localObject3);
      return (Object[])localObject1;
    }
    finally
    {
      this.lock.unlock();
    }
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject1 = this.lock;
      ((ReentrantLock)localObject1).lock();
      localObject1 = super.toArray(paramArrayOfObject);
      Object localObject3 = this.blockedQueue;
      localObject3 = ((Queue)localObject3).toArray(paramArrayOfObject);
      localObject1 = concatenate((Object[])localObject1, (Object[])localObject3);
      return (Object[])localObject1;
    }
    finally
    {
      this.lock.unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\DependencyPriorityBlockingQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */