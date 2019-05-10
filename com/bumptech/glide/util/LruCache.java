package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LruCache
{
  private final Map cache;
  private long currentSize;
  private final long initialMaxSize;
  private long maxSize;
  
  public LruCache(long paramLong)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(100, 0.75F, true);
    this.cache = localLinkedHashMap;
    this.initialMaxSize = paramLong;
    this.maxSize = paramLong;
  }
  
  private void evict()
  {
    long l = this.maxSize;
    trimToSize(l);
  }
  
  public void clearMemory()
  {
    trimToSize(0L);
  }
  
  public boolean contains(Object paramObject)
  {
    try
    {
      Map localMap = this.cache;
      boolean bool = localMap.containsKey(paramObject);
      return bool;
    }
    finally {}
  }
  
  public Object get(Object paramObject)
  {
    try
    {
      Object localObject1 = this.cache;
      localObject1 = ((Map)localObject1).get(paramObject);
      return localObject1;
    }
    finally {}
  }
  
  protected int getCount()
  {
    try
    {
      Map localMap = this.cache;
      int i = localMap.size();
      return i;
    }
    finally {}
  }
  
  public long getCurrentSize()
  {
    try
    {
      long l = this.currentSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected int getSize(Object paramObject)
  {
    return 1;
  }
  
  protected void onItemEvicted(Object paramObject1, Object paramObject2) {}
  
  /* Error */
  public Object put(Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokevirtual 53	com/bumptech/glide/util/LruCache:getSize	(Ljava/lang/Object;)I
    //   7: istore_3
    //   8: iload_3
    //   9: i2l
    //   10: lstore 4
    //   12: aload_0
    //   13: getfield 29	com/bumptech/glide/util/LruCache:maxSize	J
    //   16: lstore 6
    //   18: lload 4
    //   20: lload 6
    //   22: lcmp
    //   23: istore 8
    //   25: iload 8
    //   27: iflt +19 -> 46
    //   30: aload_0
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 57	com/bumptech/glide/util/LruCache:onItemEvicted	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   36: iconst_0
    //   37: istore_3
    //   38: aconst_null
    //   39: astore 9
    //   41: aload_0
    //   42: monitorexit
    //   43: aload 9
    //   45: areturn
    //   46: aload_2
    //   47: ifnull +22 -> 69
    //   50: aload_0
    //   51: getfield 49	com/bumptech/glide/util/LruCache:currentSize	J
    //   54: lstore 4
    //   56: iload_3
    //   57: i2l
    //   58: lload 4
    //   60: ladd
    //   61: lstore 10
    //   63: aload_0
    //   64: lload 10
    //   66: putfield 49	com/bumptech/glide/util/LruCache:currentSize	J
    //   69: aload_0
    //   70: getfield 25	com/bumptech/glide/util/LruCache:cache	Ljava/util/Map;
    //   73: astore 9
    //   75: aload 9
    //   77: aload_1
    //   78: aload_2
    //   79: invokeinterface 61 3 0
    //   84: astore 9
    //   86: aload 9
    //   88: ifnull +55 -> 143
    //   91: aload_0
    //   92: getfield 49	com/bumptech/glide/util/LruCache:currentSize	J
    //   95: lstore 4
    //   97: aload_0
    //   98: aload 9
    //   100: invokevirtual 53	com/bumptech/glide/util/LruCache:getSize	(Ljava/lang/Object;)I
    //   103: istore 8
    //   105: iload 8
    //   107: i2l
    //   108: lstore 6
    //   110: lload 4
    //   112: lload 6
    //   114: lsub
    //   115: lstore 4
    //   117: aload_0
    //   118: lload 4
    //   120: putfield 49	com/bumptech/glide/util/LruCache:currentSize	J
    //   123: aload 9
    //   125: aload_2
    //   126: invokevirtual 64	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   129: istore 8
    //   131: iload 8
    //   133: ifne +10 -> 143
    //   136: aload_0
    //   137: aload_1
    //   138: aload 9
    //   140: invokevirtual 57	com/bumptech/glide/util/LruCache:onItemEvicted	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   143: aload_0
    //   144: invokespecial 67	com/bumptech/glide/util/LruCache:evict	()V
    //   147: goto -106 -> 41
    //   150: astore 9
    //   152: aload_0
    //   153: monitorexit
    //   154: aload 9
    //   156: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	LruCache
    //   0	157	1	paramObject1	Object
    //   0	157	2	paramObject2	Object
    //   7	50	3	i	int
    //   10	109	4	l1	long
    //   16	97	6	l2	long
    //   23	3	8	bool1	boolean
    //   103	3	8	j	int
    //   129	3	8	bool2	boolean
    //   39	100	9	localObject1	Object
    //   150	5	9	localObject2	Object
    //   61	4	10	l3	long
    // Exception table:
    //   from	to	target	type
    //   3	7	150	finally
    //   12	16	150	finally
    //   32	36	150	finally
    //   50	54	150	finally
    //   64	69	150	finally
    //   69	73	150	finally
    //   78	84	150	finally
    //   91	95	150	finally
    //   98	103	150	finally
    //   118	123	150	finally
    //   125	129	150	finally
    //   138	143	150	finally
    //   143	147	150	finally
  }
  
  public Object remove(Object paramObject)
  {
    try
    {
      Object localObject1 = this.cache;
      localObject1 = ((Map)localObject1).remove(paramObject);
      if (localObject1 != null)
      {
        long l1 = this.currentSize;
        int i = getSize(localObject1);
        long l2 = i;
        l1 -= l2;
        this.currentSize = l1;
      }
      return localObject1;
    }
    finally {}
  }
  
  public void setSizeMultiplier(float paramFloat)
  {
    float f = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (bool) {
      try
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        String str = "Multiplier must be >= 0";
        localIllegalArgumentException.<init>(str);
        throw localIllegalArgumentException;
      }
      finally {}
    }
    long l = this.initialMaxSize;
    f = (float)l * paramFloat;
    int i = Math.round(f);
    l = i;
    this.maxSize = l;
    evict();
  }
  
  protected void trimToSize(long paramLong)
  {
    try
    {
      for (;;)
      {
        long l1 = this.currentSize;
        boolean bool = l1 < paramLong;
        if (!bool) {
          break;
        }
        Object localObject1 = this.cache;
        localObject1 = ((Map)localObject1).entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        localObject1 = localIterator.next();
        localObject1 = (Map.Entry)localObject1;
        Object localObject3 = ((Map.Entry)localObject1).getValue();
        long l2 = this.currentSize;
        int i = getSize(localObject3);
        long l3 = i;
        l2 -= l3;
        this.currentSize = l2;
        localObject1 = ((Map.Entry)localObject1).getKey();
        localIterator.remove();
        onItemEvicted(localObject1, localObject3);
      }
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\LruCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */