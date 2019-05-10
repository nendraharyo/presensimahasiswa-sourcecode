package android.support.v4.h;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;
  
  public g(int paramInt)
  {
    if (paramInt <= 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("maxSize <= 0");
      throw ((Throwable)localObject);
    }
    this.maxSize = paramInt;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>(0, 0.75F, true);
    this.map = ((LinkedHashMap)localObject);
  }
  
  private int safeSizeOf(Object paramObject1, Object paramObject2)
  {
    int i = sizeOf(paramObject1, paramObject2);
    if (i < 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Negative size: " + paramObject1 + "=" + paramObject2;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    return i;
  }
  
  protected Object create(Object paramObject)
  {
    return null;
  }
  
  public final int createCount()
  {
    try
    {
      int i = this.createCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final void evictAll()
  {
    trimToSize(-1);
  }
  
  public final int evictionCount()
  {
    try
    {
      int i = this.evictionCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object get(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null");
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      int j;
      Object localObject6;
      try
      {
        localObject1 = this.map;
        localObject1 = ((LinkedHashMap)localObject1).get(paramObject);
        if (localObject1 != null)
        {
          int i = this.hitCount + 1;
          this.hitCount = i;
          return localObject1;
        }
        j = this.missCount + 1;
        this.missCount = j;
        localObject6 = create(paramObject);
        if (localObject6 == null)
        {
          j = 0;
          localObject1 = null;
          continue;
        }
      }
      finally {}
      try
      {
        j = this.createCount + 1;
        this.createCount = j;
        Object localObject3 = this.map;
        localObject3 = ((LinkedHashMap)localObject3).put(paramObject, localObject6);
        LinkedHashMap localLinkedHashMap;
        if (localObject3 != null)
        {
          localLinkedHashMap = this.map;
          localLinkedHashMap.put(paramObject, localObject3);
        }
        for (;;)
        {
          if (localObject3 == null) {
            break label197;
          }
          int k = 0;
          localLinkedHashMap = null;
          entryRemoved(false, paramObject, localObject6, localObject3);
          break;
          k = this.size;
          int m = safeSizeOf(paramObject, localObject6);
          k += m;
          this.size = k;
        }
        j = this.maxSize;
      }
      finally {}
      label197:
      trimToSize(j);
      Object localObject5 = localObject6;
    }
  }
  
  public final int hitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int maxSize()
  {
    try
    {
      int i = this.maxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int missCount()
  {
    try
    {
      int i = this.missCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    if ((paramObject1 == null) || (paramObject2 == null))
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null || value == null");
      throw ((Throwable)localObject1);
    }
    try
    {
      int i = this.putCount + 1;
      this.putCount = i;
      i = this.size;
      int j = safeSizeOf(paramObject1, paramObject2);
      i += j;
      this.size = i;
      localObject1 = this.map;
      localObject1 = ((LinkedHashMap)localObject1).put(paramObject1, paramObject2);
      if (localObject1 != null)
      {
        j = this.size;
        int k = safeSizeOf(paramObject1, localObject1);
        j -= k;
        this.size = j;
      }
      if (localObject1 != null)
      {
        j = 0;
        entryRemoved(false, paramObject1, localObject1, paramObject2);
      }
      j = this.maxSize;
      trimToSize(j);
      return localObject1;
    }
    finally {}
  }
  
  public final int putCount()
  {
    try
    {
      int i = this.putCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object remove(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.map;
      localObject1 = ((LinkedHashMap)localObject1).remove(paramObject);
      int i;
      int j;
      if (localObject1 != null)
      {
        i = this.size;
        j = safeSizeOf(paramObject, localObject1);
        i -= j;
        this.size = i;
      }
      if (localObject1 != null)
      {
        i = 0;
        j = 0;
        entryRemoved(false, paramObject, localObject1, null);
      }
      return localObject1;
    }
    finally {}
  }
  
  public void resize(int paramInt)
  {
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("maxSize <= 0");
      throw localIllegalArgumentException;
    }
    try
    {
      this.maxSize = paramInt;
      trimToSize(paramInt);
      return;
    }
    finally {}
  }
  
  public final int size()
  {
    try
    {
      int i = this.size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected int sizeOf(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  public final Map snapshot()
  {
    try
    {
      LinkedHashMap localLinkedHashMap1 = new java/util/LinkedHashMap;
      LinkedHashMap localLinkedHashMap2 = this.map;
      localLinkedHashMap1.<init>(localLinkedHashMap2);
      return localLinkedHashMap1;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    Object localObject1 = null;
    try
    {
      int j = this.hitCount;
      int k = this.missCount;
      j += k;
      if (j != 0)
      {
        i = this.hitCount * 100;
        i /= j;
      }
      Locale localLocale = Locale.US;
      String str = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]";
      int m = 4;
      Object[] arrayOfObject = new Object[m];
      int n = 0;
      int i1 = this.maxSize;
      Integer localInteger = Integer.valueOf(i1);
      arrayOfObject[0] = localInteger;
      n = 1;
      i1 = this.hitCount;
      localInteger = Integer.valueOf(i1);
      arrayOfObject[n] = localInteger;
      n = 2;
      i1 = this.missCount;
      localInteger = Integer.valueOf(i1);
      arrayOfObject[n] = localInteger;
      n = 3;
      localObject1 = Integer.valueOf(i);
      arrayOfObject[n] = localObject1;
      localObject1 = String.format(localLocale, str, arrayOfObject);
      return (String)localObject1;
    }
    finally {}
  }
  
  public void trimToSize(int paramInt)
  {
    for (;;)
    {
      try
      {
        int i = this.size;
        Object localObject1;
        if (i >= 0)
        {
          localObject1 = this.map;
          boolean bool1 = ((LinkedHashMap)localObject1).isEmpty();
          if (bool1)
          {
            j = this.size;
            if (j == 0) {}
          }
        }
        else
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = getClass();
          localObject5 = ((Class)localObject5).getName();
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ".sizeOf() is reporting inconsistent results!";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
      finally {}
      int j = this.size;
      if (j > paramInt)
      {
        localObject3 = this.map;
        boolean bool2 = ((LinkedHashMap)localObject3).isEmpty();
        if (!bool2) {}
      }
      else
      {
        return;
      }
      Object localObject3 = this.map;
      localObject3 = ((LinkedHashMap)localObject3).entrySet();
      localObject3 = ((Set)localObject3).iterator();
      localObject3 = ((Iterator)localObject3).next();
      localObject3 = (Map.Entry)localObject3;
      Object localObject4 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      Object localObject5 = this.map;
      ((LinkedHashMap)localObject5).remove(localObject4);
      int k = this.size;
      int m = safeSizeOf(localObject4, localObject3);
      k -= m;
      this.size = k;
      k = this.evictionCount + 1;
      this.evictionCount = k;
      k = 1;
      int n = 0;
      entryRemoved(k, localObject4, localObject3, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */