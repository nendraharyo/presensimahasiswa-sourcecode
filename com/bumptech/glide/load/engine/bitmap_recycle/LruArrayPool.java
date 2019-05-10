package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class LruArrayPool
  implements ArrayPool
{
  private static final int DEFAULT_SIZE = 4194304;
  static final int MAX_OVER_SIZE_MULTIPLE = 8;
  private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
  private final Map adapters;
  private int currentSize;
  private final GroupedLinkedMap groupedMap;
  private final LruArrayPool.KeyPool keyPool;
  private final int maxSize;
  private final Map sortedSizes;
  
  public LruArrayPool()
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap;
    ((GroupedLinkedMap)localObject).<init>();
    this.groupedMap = ((GroupedLinkedMap)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool;
    ((LruArrayPool.KeyPool)localObject).<init>();
    this.keyPool = ((LruArrayPool.KeyPool)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.sortedSizes = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.adapters = ((Map)localObject);
    this.maxSize = 4194304;
  }
  
  public LruArrayPool(int paramInt)
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap;
    ((GroupedLinkedMap)localObject).<init>();
    this.groupedMap = ((GroupedLinkedMap)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool;
    ((LruArrayPool.KeyPool)localObject).<init>();
    this.keyPool = ((LruArrayPool.KeyPool)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.sortedSizes = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.adapters = ((Map)localObject);
    this.maxSize = paramInt;
  }
  
  private void decrementArrayOfSize(int paramInt, Class paramClass)
  {
    Object localObject1 = getSizesForAdapter(paramClass);
    Object localObject2 = Integer.valueOf(paramInt);
    localObject2 = (Integer)((NavigableMap)localObject1).get(localObject2);
    if (localObject2 == null)
    {
      localObject2 = new java/lang/NullPointerException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Tried to decrement empty size, size: " + paramInt + ", this: " + this;
      ((NullPointerException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    int i = ((Integer)localObject2).intValue();
    int j = 1;
    if (i == j)
    {
      localObject2 = Integer.valueOf(paramInt);
      ((NavigableMap)localObject1).remove(localObject2);
    }
    for (;;)
    {
      return;
      Integer localInteger = Integer.valueOf(paramInt);
      int k = ((Integer)localObject2).intValue() + -1;
      localObject2 = Integer.valueOf(k);
      ((NavigableMap)localObject1).put(localInteger, localObject2);
    }
  }
  
  private void evict()
  {
    int i = this.maxSize;
    evictToSize(i);
  }
  
  private void evictToSize(int paramInt)
  {
    for (;;)
    {
      int i = this.currentSize;
      if (i <= paramInt) {
        break;
      }
      Object localObject1 = this.groupedMap.removeLast();
      Preconditions.checkNotNull(localObject1);
      ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromObject(localObject1);
      int j = this.currentSize;
      int k = localArrayAdapterInterface.getArrayLength(localObject1);
      int m = localArrayAdapterInterface.getElementSizeInBytes();
      k *= m;
      j -= k;
      this.currentSize = j;
      j = localArrayAdapterInterface.getArrayLength(localObject1);
      Object localObject2 = localObject1.getClass();
      decrementArrayOfSize(j, (Class)localObject2);
      String str1 = localArrayAdapterInterface.getTag();
      k = 2;
      boolean bool = Log.isLoggable(str1, k);
      if (bool)
      {
        str1 = localArrayAdapterInterface.getTag();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "evicted: ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        i = localArrayAdapterInterface.getArrayLength(localObject1);
        localObject1 = i;
        Log.v(str1, (String)localObject1);
      }
    }
  }
  
  private ArrayAdapterInterface getAdapterFromObject(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    return getAdapterFromType(localClass);
  }
  
  private ArrayAdapterInterface getAdapterFromType(Class paramClass)
  {
    Object localObject1 = (ArrayAdapterInterface)this.adapters.get(paramClass);
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = int[].class;
      bool = paramClass.equals(localObject1);
      if (!bool) {
        break label57;
      }
      localObject1 = new com/bumptech/glide/load/engine/bitmap_recycle/IntegerArrayAdapter;
      ((IntegerArrayAdapter)localObject1).<init>();
    }
    for (;;)
    {
      localObject2 = this.adapters;
      ((Map)localObject2).put(paramClass, localObject1);
      return (ArrayAdapterInterface)localObject1;
      label57:
      localObject1 = byte[].class;
      bool = paramClass.equals(localObject1);
      if (!bool) {
        break;
      }
      localObject1 = new com/bumptech/glide/load/engine/bitmap_recycle/ByteArrayAdapter;
      ((ByteArrayAdapter)localObject1).<init>();
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("No array pool found for: ");
    String str = paramClass.getSimpleName();
    localObject2 = str;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private Object getArrayForKey(LruArrayPool.Key paramKey)
  {
    return this.groupedMap.get(paramKey);
  }
  
  private Object getForKey(LruArrayPool.Key paramKey, Class paramClass)
  {
    ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromType(paramClass);
    Object localObject1 = getArrayForKey(paramKey);
    int i;
    int j;
    if (localObject1 != null)
    {
      i = this.currentSize;
      j = localArrayAdapterInterface.getArrayLength(localObject1);
      int k = localArrayAdapterInterface.getElementSizeInBytes();
      j *= k;
      i -= j;
      this.currentSize = i;
      i = localArrayAdapterInterface.getArrayLength(localObject1);
      decrementArrayOfSize(i, paramClass);
    }
    if (localObject1 == null)
    {
      localObject1 = localArrayAdapterInterface.getTag();
      i = 2;
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = localArrayAdapterInterface.getTag();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Allocated ");
        j = paramKey.size;
        localObject2 = ((StringBuilder)localObject2).append(j);
        String str = " bytes";
        localObject2 = str;
        Log.v((String)localObject1, (String)localObject2);
      }
      int m = paramKey.size;
      localObject1 = localArrayAdapterInterface.newArray(m);
    }
    return localObject1;
  }
  
  private NavigableMap getSizesForAdapter(Class paramClass)
  {
    Object localObject = (NavigableMap)this.sortedSizes.get(paramClass);
    if (localObject == null)
    {
      localObject = new java/util/TreeMap;
      ((TreeMap)localObject).<init>();
      Map localMap = this.sortedSizes;
      localMap.put(paramClass, localObject);
    }
    return (NavigableMap)localObject;
  }
  
  private boolean isNoMoreThanHalfFull()
  {
    int i = this.currentSize;
    if (i != 0)
    {
      i = this.maxSize;
      int k = this.currentSize;
      i /= k;
      int m = 2;
      if (i < m) {
        break label34;
      }
    }
    label34:
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private boolean isSmallEnoughForReuse(int paramInt)
  {
    int i = this.maxSize / 2;
    if (paramInt <= i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private boolean mayFillRequest(int paramInt, Integer paramInteger)
  {
    if (paramInteger != null)
    {
      boolean bool = isNoMoreThanHalfFull();
      if (!bool)
      {
        i = paramInteger.intValue();
        int k = paramInt * 8;
        if (i > k) {
          break label34;
        }
      }
    }
    label34:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public void clearMemory()
  {
    Object localObject1 = null;
    try
    {
      evictToSize(0);
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  /* Error */
  public Object get(int paramInt, Class paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokespecial 51	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool:getSizesForAdapter	(Ljava/lang/Class;)Ljava/util/NavigableMap;
    //   7: astore_3
    //   8: iload_1
    //   9: invokestatic 57	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   12: astore 4
    //   14: aload_3
    //   15: aload 4
    //   17: invokeinterface 215 2 0
    //   22: astore_3
    //   23: aload_3
    //   24: checkcast 53	java/lang/Integer
    //   27: astore_3
    //   28: aload_0
    //   29: iload_1
    //   30: aload_3
    //   31: invokespecial 219	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool:mayFillRequest	(ILjava/lang/Integer;)Z
    //   34: istore 5
    //   36: iload 5
    //   38: ifeq +35 -> 73
    //   41: aload_0
    //   42: getfield 37	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool:keyPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool;
    //   45: astore 4
    //   47: aload_3
    //   48: invokevirtual 93	java/lang/Integer:intValue	()I
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: invokevirtual 222	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool:get	(ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$Key;
    //   61: astore_3
    //   62: aload_0
    //   63: aload_3
    //   64: aload_2
    //   65: invokespecial 226	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool:getForKey	(Lcom/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$Key;Ljava/lang/Class;)Ljava/lang/Object;
    //   68: astore_3
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_3
    //   72: areturn
    //   73: aload_0
    //   74: getfield 37	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool:keyPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool;
    //   77: astore_3
    //   78: aload_3
    //   79: iload_1
    //   80: aload_2
    //   81: invokevirtual 222	com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$KeyPool:get	(ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$Key;
    //   84: astore_3
    //   85: goto -23 -> 62
    //   88: astore_3
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_3
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	LruArrayPool
    //   0	93	1	paramInt	int
    //   0	93	2	paramClass	Class
    //   7	78	3	localObject1	Object
    //   88	4	3	localObject2	Object
    //   12	42	4	localObject3	Object
    //   34	3	5	bool	boolean
    //   51	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   3	7	88	finally
    //   8	12	88	finally
    //   15	22	88	finally
    //   23	27	88	finally
    //   30	34	88	finally
    //   41	45	88	finally
    //   47	51	88	finally
    //   57	61	88	finally
    //   64	68	88	finally
    //   73	77	88	finally
    //   80	84	88	finally
  }
  
  int getCurrentSize()
  {
    boolean bool1 = false;
    Class localClass = null;
    Object localObject = this.sortedSizes.keySet();
    Iterator localIterator1 = ((Set)localObject).iterator();
    int i = 0;
    NavigableMap localNavigableMap = null;
    for (;;)
    {
      bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      localClass = (Class)localIterator1.next();
      localObject = ((NavigableMap)this.sortedSizes.get(localClass)).keySet();
      Iterator localIterator2 = ((Set)localObject).iterator();
      int j = i;
      for (;;)
      {
        boolean bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (Integer)localIterator2.next();
        ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromType(localClass);
        int m = ((Integer)localObject).intValue();
        localNavigableMap = (NavigableMap)this.sortedSizes.get(localClass);
        localObject = (Integer)localNavigableMap.get(localObject);
        int k = ((Integer)localObject).intValue() * m;
        i = localArrayAdapterInterface.getElementSizeInBytes();
        k *= i;
        j += k;
      }
      i = j;
    }
    return i;
  }
  
  public Object getExact(int paramInt, Class paramClass)
  {
    try
    {
      Object localObject1 = this.keyPool;
      localObject1 = ((LruArrayPool.KeyPool)localObject1).get(paramInt, paramClass);
      localObject1 = getForKey((LruArrayPool.Key)localObject1, paramClass);
      return localObject1;
    }
    finally {}
  }
  
  public void put(Object paramObject)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = paramObject.getClass();
        ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromType((Class)localObject1);
        int i = localArrayAdapterInterface.getArrayLength(paramObject);
        int j = localArrayAdapterInterface.getElementSizeInBytes() * i;
        boolean bool = isSmallEnoughForReuse(j);
        if (!bool) {
          return;
        }
        Object localObject3 = this.keyPool;
        Object localObject4 = ((LruArrayPool.KeyPool)localObject3).get(i, (Class)localObject1);
        localObject3 = this.groupedMap;
        ((GroupedLinkedMap)localObject3).put((Poolable)localObject4, paramObject);
        localObject3 = getSizesForAdapter((Class)localObject1);
        int k = ((LruArrayPool.Key)localObject4).size;
        localObject1 = Integer.valueOf(k);
        localObject1 = ((NavigableMap)localObject3).get(localObject1);
        localObject1 = (Integer)localObject1;
        i = ((LruArrayPool.Key)localObject4).size;
        localObject4 = Integer.valueOf(i);
        if (localObject1 == null)
        {
          k = 1;
          localObject1 = Integer.valueOf(k);
          ((NavigableMap)localObject3).put(localObject4, localObject1);
          k = this.currentSize + j;
          this.currentSize = k;
          evict();
        }
        else
        {
          k = ((Integer)localObject2).intValue() + 1;
        }
      }
      finally {}
    }
  }
  
  public void put(Object paramObject, Class paramClass)
  {
    put(paramObject);
  }
  
  public void trimMemory(int paramInt)
  {
    int i = 40;
    if (paramInt >= i) {}
    for (;;)
    {
      try
      {
        clearMemory();
        return;
      }
      finally {}
      i = 20;
      if (paramInt < i)
      {
        i = 15;
        if (paramInt != i) {}
      }
      else
      {
        i = this.maxSize;
        i /= 2;
        evictToSize(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\LruArrayPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */