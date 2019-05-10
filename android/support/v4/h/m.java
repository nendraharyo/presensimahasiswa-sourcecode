package android.support.v4.h;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class m
{
  private static final int BASE_SIZE = 4;
  private static final int CACHE_SIZE = 10;
  private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
  private static final boolean DEBUG = false;
  private static final String TAG = "ArrayMap";
  static Object[] mBaseCache;
  static int mBaseCacheSize;
  static Object[] mTwiceBaseCache;
  static int mTwiceBaseCacheSize;
  Object[] mArray;
  int[] mHashes;
  int mSize;
  
  public m()
  {
    Object localObject = c.a;
    this.mHashes = ((int[])localObject);
    localObject = c.c;
    this.mArray = ((Object[])localObject);
    this.mSize = 0;
  }
  
  public m(int paramInt)
  {
    if (paramInt == 0)
    {
      Object localObject = c.a;
      this.mHashes = ((int[])localObject);
      localObject = c.c;
      this.mArray = ((Object[])localObject);
    }
    for (;;)
    {
      this.mSize = 0;
      return;
      allocArrays(paramInt);
    }
  }
  
  public m(m paramm)
  {
    this();
    if (paramm != null) {
      putAll(paramm);
    }
  }
  
  private void allocArrays(int paramInt)
  {
    int i = 8;
    if (paramInt == i) {}
    for (;;)
    {
      Object[] arrayOfObject;
      int j;
      synchronized (a.class)
      {
        Object localObject1 = mTwiceBaseCache;
        if (localObject1 != null)
        {
          arrayOfObject = mTwiceBaseCache;
          this.mArray = arrayOfObject;
          i = 0;
          localObject1 = null;
          localObject1 = arrayOfObject[0];
          localObject1 = (Object[])localObject1;
          localObject1 = (Object[])localObject1;
          mTwiceBaseCache = (Object[])localObject1;
          i = 1;
          localObject1 = arrayOfObject[i];
          localObject1 = (int[])localObject1;
          localObject1 = (int[])localObject1;
          this.mHashes = ((int[])localObject1);
          i = 0;
          localObject1 = null;
          j = 1;
          arrayOfObject[j] = null;
          arrayOfObject[0] = null;
          i = mTwiceBaseCacheSize + -1;
          mTwiceBaseCacheSize = i;
          return;
        }
        localObject1 = new int[paramInt];
        this.mHashes = ((int[])localObject1);
        i = paramInt << 1;
        localObject1 = new Object[i];
        this.mArray = ((Object[])localObject1);
      }
      i = 4;
      if (paramInt == i) {
        synchronized (a.class)
        {
          Object localObject3 = mBaseCache;
          if (localObject3 != null)
          {
            arrayOfObject = mBaseCache;
            this.mArray = arrayOfObject;
            i = 0;
            localObject3 = null;
            localObject3 = arrayOfObject[0];
            localObject3 = (Object[])localObject3;
            localObject3 = (Object[])localObject3;
            mBaseCache = (Object[])localObject3;
            i = 1;
            localObject3 = arrayOfObject[i];
            localObject3 = (int[])localObject3;
            localObject3 = (int[])localObject3;
            this.mHashes = ((int[])localObject3);
            i = 0;
            localObject3 = null;
            j = 1;
            arrayOfObject[j] = null;
            arrayOfObject[0] = null;
            i = mBaseCacheSize + -1;
            mBaseCacheSize = i;
          }
        }
      }
    }
  }
  
  private static int binarySearchHashes(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      return c.a(paramArrayOfInt, paramInt1, paramInt2);
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      ConcurrentModificationException localConcurrentModificationException = new java/util/ConcurrentModificationException;
      localConcurrentModificationException.<init>();
      throw localConcurrentModificationException;
    }
  }
  
  private static void freeArrays(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int i = 10;
    int j = 2;
    int k = paramArrayOfInt.length;
    int m = 8;
    if (k == m) {}
    for (;;)
    {
      Object[] arrayOfObject;
      synchronized (a.class)
      {
        k = mTwiceBaseCacheSize;
        if (k < i)
        {
          k = 0;
          Object localObject1 = null;
          arrayOfObject = mTwiceBaseCache;
          paramArrayOfObject[0] = arrayOfObject;
          k = 1;
          paramArrayOfObject[k] = paramArrayOfInt;
          k = (paramInt << 1) + -1;
          if (k >= j)
          {
            i = 0;
            arrayOfObject = null;
            paramArrayOfObject[k] = null;
            k += -1;
            continue;
          }
          mTwiceBaseCache = paramArrayOfObject;
          k = mTwiceBaseCacheSize + 1;
          mTwiceBaseCacheSize = k;
        }
        return;
      }
      k = paramArrayOfInt.length;
      m = 4;
      if (k != m) {
        continue;
      }
      synchronized (a.class)
      {
        k = mBaseCacheSize;
        if (k < i)
        {
          k = 0;
          Object localObject3 = null;
          arrayOfObject = mBaseCache;
          paramArrayOfObject[0] = arrayOfObject;
          k = 1;
          paramArrayOfObject[k] = paramArrayOfInt;
          k = (paramInt << 1) + -1;
          while (k >= j)
          {
            i = 0;
            arrayOfObject = null;
            paramArrayOfObject[k] = null;
            k += -1;
          }
          mBaseCache = paramArrayOfObject;
          k = mBaseCacheSize + 1;
          mBaseCacheSize = k;
        }
      }
    }
  }
  
  public void clear()
  {
    int i = this.mSize;
    Object localObject1;
    if (i > 0)
    {
      localObject1 = this.mHashes;
      Object[] arrayOfObject = this.mArray;
      int j = this.mSize;
      Object localObject2 = c.a;
      this.mHashes = ((int[])localObject2);
      localObject2 = c.c;
      this.mArray = ((Object[])localObject2);
      localObject2 = null;
      this.mSize = 0;
      freeArrays((int[])localObject1, arrayOfObject, j);
    }
    i = this.mSize;
    if (i > 0)
    {
      localObject1 = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean containsValue(Object paramObject)
  {
    int i = indexOfValue(paramObject);
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void ensureCapacity(int paramInt)
  {
    int i = this.mSize;
    int[] arrayOfInt = this.mHashes;
    int j = arrayOfInt.length;
    if (j < paramInt)
    {
      arrayOfInt = this.mHashes;
      Object[] arrayOfObject = this.mArray;
      allocArrays(paramInt);
      int k = this.mSize;
      if (k > 0)
      {
        Object localObject = this.mHashes;
        System.arraycopy(arrayOfInt, 0, localObject, 0, i);
        localObject = this.mArray;
        int m = i << 1;
        System.arraycopy(arrayOfObject, 0, localObject, 0, m);
      }
      freeArrays(arrayOfInt, arrayOfObject, i);
    }
    j = this.mSize;
    if (j != i)
    {
      ConcurrentModificationException localConcurrentModificationException = new java/util/ConcurrentModificationException;
      localConcurrentModificationException.<init>();
      throw localConcurrentModificationException;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof m;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (bool2)
      {
        paramObject = (m)paramObject;
        int i = size();
        int k = ((m)paramObject).size();
        if (i != k)
        {
          bool1 = false;
        }
        else
        {
          i = 0;
          try
          {
            for (;;)
            {
              k = this.mSize;
              if (i >= k) {
                break;
              }
              localObject1 = keyAt(i);
              localObject2 = valueAt(i);
              localObject3 = ((m)paramObject).get(localObject1);
              if (localObject2 == null)
              {
                if (localObject3 == null)
                {
                  bool4 = ((m)paramObject).containsKey(localObject1);
                  if (bool4) {
                    break label128;
                  }
                }
                bool1 = false;
                break;
              }
              boolean bool4 = localObject2.equals(localObject3);
              if (!bool4)
              {
                bool1 = false;
                break;
              }
              label128:
              i += 1;
            }
          }
          catch (NullPointerException localNullPointerException1)
          {
            bool1 = false;
          }
          catch (ClassCastException localClassCastException1)
          {
            bool1 = false;
          }
        }
      }
      else
      {
        boolean bool3 = paramObject instanceof Map;
        if (bool3)
        {
          paramObject = (Map)paramObject;
          int j = size();
          int m = ((Map)paramObject).size();
          if (j != m)
          {
            bool1 = false;
          }
          else
          {
            j = 0;
            try
            {
              for (;;)
              {
                m = this.mSize;
                if (j >= m) {
                  break;
                }
                localObject1 = keyAt(j);
                localObject2 = valueAt(j);
                localObject3 = ((Map)paramObject).get(localObject1);
                if (localObject2 == null)
                {
                  if (localObject3 == null)
                  {
                    bool5 = ((Map)paramObject).containsKey(localObject1);
                    if (bool5) {
                      break label272;
                    }
                  }
                  bool1 = false;
                  break;
                }
                boolean bool5 = localObject2.equals(localObject3);
                if (!bool5)
                {
                  bool1 = false;
                  break;
                }
                label272:
                j += 1;
              }
            }
            catch (NullPointerException localNullPointerException2)
            {
              bool1 = false;
            }
            catch (ClassCastException localClassCastException2)
            {
              bool1 = false;
            }
          }
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Object get(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    Object[] arrayOfObject;
    if (i >= 0)
    {
      arrayOfObject = this.mArray;
      i = (i << 1) + 1;
    }
    for (Object localObject = arrayOfObject[i];; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.mHashes;
    Object[] arrayOfObject = this.mArray;
    int i = 1;
    int j = this.mSize;
    int k = i;
    int m = 0;
    int n = 0;
    if (m < j)
    {
      Object localObject = arrayOfObject[k];
      int i1 = arrayOfInt[m];
      if (localObject == null)
      {
        i = 0;
        localObject = null;
      }
      for (;;)
      {
        i ^= i1;
        n += i;
        m += 1;
        i = k + 2;
        k = i;
        break;
        i = localObject.hashCode();
      }
    }
    return n;
  }
  
  int indexOf(Object paramObject, int paramInt)
  {
    int i = this.mSize;
    int j;
    if (i == 0) {
      j = -1;
    }
    for (;;)
    {
      return j;
      int[] arrayOfInt = this.mHashes;
      j = binarySearchHashes(arrayOfInt, i, paramInt);
      if (j >= 0)
      {
        Object localObject1 = this.mArray;
        int k = j << 1;
        localObject1 = localObject1[k];
        boolean bool3 = paramObject.equals(localObject1);
        if (!bool3)
        {
          int n = j + 1;
          for (;;)
          {
            if (n >= i) {
              break label146;
            }
            Object localObject2 = this.mHashes;
            k = localObject2[n];
            if (k != paramInt) {
              break label146;
            }
            localObject2 = this.mArray;
            int i1 = n << 1;
            localObject2 = localObject2[i1];
            boolean bool2 = paramObject.equals(localObject2);
            if (bool2)
            {
              j = n;
              break;
            }
            n += 1;
          }
          label146:
          j += -1;
          for (;;)
          {
            if (j < 0) {
              break label213;
            }
            Object localObject3 = this.mHashes;
            i = localObject3[j];
            if (i != paramInt) {
              break label213;
            }
            localObject3 = this.mArray;
            int m = j << 1;
            localObject3 = localObject3[m];
            boolean bool1 = paramObject.equals(localObject3);
            if (bool1) {
              break;
            }
            j += -1;
          }
          label213:
          j = n ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  public int indexOfKey(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = indexOfNull();; i = indexOf(paramObject, i))
    {
      return i;
      i = paramObject.hashCode();
    }
  }
  
  int indexOfNull()
  {
    int i = this.mSize;
    int j;
    if (i == 0) {
      j = -1;
    }
    for (;;)
    {
      return j;
      int[] arrayOfInt = this.mHashes;
      int k = 0;
      Object localObject1 = null;
      j = binarySearchHashes(arrayOfInt, i, 0);
      if (j >= 0)
      {
        localObject1 = this.mArray;
        int m = j << 1;
        localObject1 = localObject1[m];
        if (localObject1 != null)
        {
          k = j + 1;
          for (;;)
          {
            if (k >= i) {
              break label126;
            }
            Object localObject2 = this.mHashes;
            m = localObject2[k];
            if (m != 0) {
              break label126;
            }
            localObject2 = this.mArray;
            int n = k << 1;
            localObject2 = localObject2[n];
            if (localObject2 == null)
            {
              j = k;
              break;
            }
            k += 1;
          }
          label126:
          j += -1;
          for (;;)
          {
            if (j < 0) {
              break label179;
            }
            Object localObject3 = this.mHashes;
            i = localObject3[j];
            if (i != 0) {
              break label179;
            }
            localObject3 = this.mArray;
            m = j << 1;
            localObject3 = localObject3[m];
            if (localObject3 == null) {
              break;
            }
            j += -1;
          }
          label179:
          j = k ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  int indexOfValue(Object paramObject)
  {
    int i = 1;
    int j = this.mSize * 2;
    Object[] arrayOfObject = this.mArray;
    Object localObject;
    if (paramObject == null)
    {
      if (i >= j) {
        break label83;
      }
      localObject = arrayOfObject[i];
      if (localObject == null) {
        i >>= 1;
      }
    }
    for (;;)
    {
      return i;
      i += 2;
      break;
      boolean bool;
      do
      {
        i += 2;
        if (i >= j) {
          break;
        }
        localObject = arrayOfObject[i];
        bool = paramObject.equals(localObject);
      } while (!bool);
      i >>= 1;
      continue;
      label83:
      i = -1;
    }
  }
  
  public boolean isEmpty()
  {
    int i = this.mSize;
    if (i <= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object keyAt(int paramInt)
  {
    Object[] arrayOfObject = this.mArray;
    int i = paramInt << 1;
    return arrayOfObject[i];
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = 8;
    int j = 4;
    int k = 0;
    Object[] arrayOfObject1 = null;
    int m = this.mSize;
    int n;
    int i1;
    Object localObject1;
    if (paramObject1 == null)
    {
      n = indexOfNull();
      i1 = 0;
      if (n < 0) {
        break label88;
      }
      i = n << 1;
      j = i + 1;
      localObject1 = this.mArray[j];
      Object[] arrayOfObject2 = this.mArray;
      arrayOfObject2[j] = paramObject2;
    }
    for (;;)
    {
      return localObject1;
      i1 = paramObject1.hashCode();
      n = indexOf(paramObject1, i1);
      break;
      label88:
      n ^= 0xFFFFFFFF;
      Object localObject2 = this.mHashes;
      int i2 = localObject2.length;
      int[] arrayOfInt;
      int i3;
      if (m >= i2)
      {
        if (m >= i) {
          i = (m >> 1) + m;
        }
        for (;;)
        {
          arrayOfInt = this.mHashes;
          localObject2 = this.mArray;
          allocArrays(i);
          i = this.mSize;
          if (m == i) {
            break;
          }
          localObject1 = new java/util/ConcurrentModificationException;
          ((ConcurrentModificationException)localObject1).<init>();
          throw ((Throwable)localObject1);
          if (m < j) {
            i = j;
          }
        }
        localObject1 = this.mHashes;
        i = localObject1.length;
        if (i > 0)
        {
          localObject1 = this.mHashes;
          i3 = arrayOfInt.length;
          System.arraycopy(arrayOfInt, 0, localObject1, 0, i3);
          localObject1 = this.mArray;
          i3 = localObject2.length;
          System.arraycopy(localObject2, 0, localObject1, 0, i3);
        }
        freeArrays(arrayOfInt, (Object[])localObject2, m);
      }
      if (n < m)
      {
        localObject1 = this.mHashes;
        arrayOfInt = this.mHashes;
        k = n + 1;
        i2 = m - n;
        System.arraycopy(localObject1, n, arrayOfInt, k, i2);
        localObject1 = this.mArray;
        j = n << 1;
        arrayOfObject1 = this.mArray;
        i2 = n + 1 << 1;
        i3 = this.mSize - n << 1;
        System.arraycopy(localObject1, j, arrayOfObject1, i2, i3);
      }
      i = this.mSize;
      if (m == i)
      {
        localObject1 = this.mHashes;
        i = localObject1.length;
        if (n < i) {}
      }
      else
      {
        localObject1 = new java/util/ConcurrentModificationException;
        ((ConcurrentModificationException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      this.mHashes[n] = i1;
      localObject1 = this.mArray;
      j = n << 1;
      localObject1[j] = paramObject1;
      localObject1 = this.mArray;
      j = (n << 1) + 1;
      localObject1[j] = paramObject2;
      i = this.mSize + 1;
      this.mSize = i;
      i = 0;
      localObject1 = null;
    }
  }
  
  public void putAll(m paramm)
  {
    int i = 0;
    int j = paramm.mSize;
    int k = this.mSize + j;
    ensureCapacity(k);
    k = this.mSize;
    Object localObject1;
    Object localObject2;
    if (k == 0) {
      if (j > 0)
      {
        localObject1 = paramm.mHashes;
        localObject2 = this.mHashes;
        System.arraycopy(localObject1, 0, localObject2, 0, j);
        localObject1 = paramm.mArray;
        localObject2 = this.mArray;
        int m = j << 1;
        System.arraycopy(localObject1, 0, localObject2, 0, m);
        this.mSize = j;
      }
    }
    for (;;)
    {
      return;
      while (i < j)
      {
        localObject1 = paramm.keyAt(i);
        localObject2 = paramm.valueAt(i);
        put(localObject1, localObject2);
        i += 1;
      }
    }
  }
  
  public Object remove(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {}
    for (Object localObject = removeAt(i);; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public Object removeAt(int paramInt)
  {
    int i = 8;
    int j = 0;
    Object localObject1 = null;
    Object[] arrayOfObject = this.mArray;
    int k = (paramInt << 1) + 1;
    Object localObject2 = arrayOfObject[k];
    int m = this.mSize;
    int n = 1;
    Object localObject3;
    if (m <= n)
    {
      localObject3 = this.mHashes;
      arrayOfObject = this.mArray;
      freeArrays((int[])localObject3, arrayOfObject, m);
      localObject3 = c.a;
      this.mHashes = ((int[])localObject3);
      localObject3 = c.c;
      this.mArray = ((Object[])localObject3);
      i = 0;
      localObject3 = null;
    }
    for (;;)
    {
      j = this.mSize;
      if (m == j) {
        break;
      }
      localObject3 = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject3).<init>();
      throw ((Throwable)localObject3);
      n = m + -1;
      Object localObject4 = this.mHashes;
      int i1 = localObject4.length;
      int i2;
      int i3;
      if (i1 > i)
      {
        i1 = this.mSize;
        Object localObject5 = this.mHashes;
        i2 = localObject5.length / 3;
        if (i1 < i2)
        {
          if (m > i) {
            i = (m >> 1) + m;
          }
          localObject4 = this.mHashes;
          localObject5 = this.mArray;
          allocArrays(i);
          i = this.mSize;
          if (m != i)
          {
            localObject3 = new java/util/ConcurrentModificationException;
            ((ConcurrentModificationException)localObject3).<init>();
            throw ((Throwable)localObject3);
          }
          if (paramInt > 0)
          {
            localObject3 = this.mHashes;
            System.arraycopy(localObject4, 0, localObject3, 0, paramInt);
            localObject3 = this.mArray;
            i3 = paramInt << 1;
            System.arraycopy(localObject5, 0, localObject3, 0, i3);
          }
          if (paramInt < n)
          {
            i = paramInt + 1;
            localObject1 = this.mHashes;
            i3 = n - paramInt;
            System.arraycopy(localObject4, i, localObject1, paramInt, i3);
            i = paramInt + 1 << 1;
            localObject1 = this.mArray;
            i1 = paramInt << 1;
            i3 = n - paramInt << 1;
            System.arraycopy(localObject5, i, localObject1, i1, i3);
          }
          i = n;
          continue;
        }
      }
      if (paramInt < n)
      {
        localObject3 = this.mHashes;
        j = paramInt + 1;
        localObject4 = this.mHashes;
        i2 = n - paramInt;
        System.arraycopy(localObject3, j, localObject4, paramInt, i2);
        localObject3 = this.mArray;
        j = paramInt + 1 << 1;
        localObject4 = this.mArray;
        i2 = paramInt << 1;
        i3 = n - paramInt << 1;
        System.arraycopy(localObject3, j, localObject4, i2, i3);
      }
      localObject3 = this.mArray;
      j = n << 1;
      localObject3[j] = null;
      localObject3 = this.mArray;
      j = (n << 1) + 1;
      localObject3[j] = null;
      i = n;
    }
    this.mSize = i;
    return localObject2;
  }
  
  public Object setValueAt(int paramInt, Object paramObject)
  {
    int i = (paramInt << 1) + 1;
    Object localObject = this.mArray[i];
    this.mArray[i] = paramObject;
    return localObject;
  }
  
  public int size()
  {
    return this.mSize;
  }
  
  public String toString()
  {
    boolean bool = isEmpty();
    if (bool) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      int i = this.mSize * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = this.mSize;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        Object localObject = keyAt(i);
        if (localObject != this)
        {
          localStringBuilder.append(localObject);
          label89:
          char c = '=';
          localStringBuilder.append(c);
          localObject = valueAt(i);
          if (localObject == this) {
            break label141;
          }
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
          break label89;
          label141:
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
        }
      }
      i = 125;
      localStringBuilder.append(i);
    }
  }
  
  public Object valueAt(int paramInt)
  {
    Object[] arrayOfObject = this.mArray;
    int i = (paramInt << 1) + 1;
    return arrayOfObject[i];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */