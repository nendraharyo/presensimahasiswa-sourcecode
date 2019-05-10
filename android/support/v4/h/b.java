package android.support.v4.h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements Collection, Set
{
  private static final int[] a = new int[0];
  private static final Object[] b = new Object[0];
  private static Object[] c;
  private static int d;
  private static Object[] e;
  private static int f;
  private int[] g;
  private Object[] h;
  private int i;
  private h j;
  
  public b()
  {
    this(0);
  }
  
  public b(int paramInt)
  {
    if (paramInt == 0)
    {
      Object localObject = a;
      this.g = ((int[])localObject);
      localObject = b;
      this.h = ((Object[])localObject);
    }
    for (;;)
    {
      this.i = 0;
      return;
      d(paramInt);
    }
  }
  
  private int a()
  {
    int k = this.i;
    int m;
    if (k == 0) {
      m = -1;
    }
    for (;;)
    {
      return m;
      int[] arrayOfInt = this.g;
      int n = 0;
      Object localObject1 = null;
      m = c.a(arrayOfInt, k, 0);
      if (m >= 0)
      {
        localObject1 = this.h[m];
        if (localObject1 != null)
        {
          n = m + 1;
          for (;;)
          {
            if (n >= k) {
              break label106;
            }
            Object localObject2 = this.g;
            int i1 = localObject2[n];
            if (i1 != 0) {
              break label106;
            }
            localObject2 = this.h[n];
            if (localObject2 == null)
            {
              m = n;
              break;
            }
            n += 1;
          }
          label106:
          m += -1;
          for (;;)
          {
            if (m < 0) {
              break label149;
            }
            Object localObject3 = this.g;
            k = localObject3[m];
            if (k != 0) {
              break label149;
            }
            localObject3 = this.h[m];
            if (localObject3 == null) {
              break;
            }
            m += -1;
          }
          label149:
          m = n ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int k = this.i;
    int m;
    if (k == 0) {
      m = -1;
    }
    for (;;)
    {
      return m;
      int[] arrayOfInt = this.g;
      m = c.a(arrayOfInt, k, paramInt);
      if (m >= 0)
      {
        Object localObject1 = this.h[m];
        boolean bool2 = paramObject.equals(localObject1);
        if (!bool2)
        {
          int n = m + 1;
          for (;;)
          {
            if (n >= k) {
              break label126;
            }
            Object localObject2 = this.g;
            int i1 = localObject2[n];
            if (i1 != paramInt) {
              break label126;
            }
            localObject2 = this.h[n];
            boolean bool3 = paramObject.equals(localObject2);
            if (bool3)
            {
              m = n;
              break;
            }
            n += 1;
          }
          label126:
          m += -1;
          for (;;)
          {
            if (m < 0) {
              break label183;
            }
            Object localObject3 = this.g;
            k = localObject3[m];
            if (k != paramInt) {
              break label183;
            }
            localObject3 = this.h[m];
            boolean bool1 = paramObject.equals(localObject3);
            if (bool1) {
              break;
            }
            m += -1;
          }
          label183:
          m = n ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int k = 10;
    int m = 2;
    int n = paramArrayOfInt.length;
    int i1 = 8;
    if (n == i1) {}
    for (;;)
    {
      Object[] arrayOfObject;
      synchronized (b.class)
      {
        n = f;
        if (n < k)
        {
          n = 0;
          Object localObject1 = null;
          arrayOfObject = e;
          paramArrayOfObject[0] = arrayOfObject;
          n = 1;
          paramArrayOfObject[n] = paramArrayOfInt;
          n = paramInt + -1;
          if (n >= m)
          {
            k = 0;
            arrayOfObject = null;
            paramArrayOfObject[n] = null;
            n += -1;
            continue;
          }
          e = paramArrayOfObject;
          n = f + 1;
          f = n;
        }
        return;
      }
      n = paramArrayOfInt.length;
      i1 = 4;
      if (n != i1) {
        continue;
      }
      synchronized (b.class)
      {
        n = d;
        if (n < k)
        {
          n = 0;
          Object localObject3 = null;
          arrayOfObject = c;
          paramArrayOfObject[0] = arrayOfObject;
          n = 1;
          paramArrayOfObject[n] = paramArrayOfInt;
          n = paramInt + -1;
          while (n >= m)
          {
            k = 0;
            arrayOfObject = null;
            paramArrayOfObject[n] = null;
            n += -1;
          }
          c = paramArrayOfObject;
          n = d + 1;
          d = n;
        }
      }
    }
  }
  
  private h b()
  {
    Object localObject = this.j;
    if (localObject == null)
    {
      localObject = new android/support/v4/h/b$1;
      ((b.1)localObject).<init>(this);
      this.j = ((h)localObject);
    }
    return this.j;
  }
  
  private void d(int paramInt)
  {
    int k = 8;
    if (paramInt == k) {}
    for (;;)
    {
      Object[] arrayOfObject;
      int m;
      synchronized (b.class)
      {
        Object localObject1 = e;
        if (localObject1 != null)
        {
          arrayOfObject = e;
          this.h = arrayOfObject;
          k = 0;
          localObject1 = null;
          localObject1 = arrayOfObject[0];
          localObject1 = (Object[])localObject1;
          localObject1 = (Object[])localObject1;
          e = (Object[])localObject1;
          k = 1;
          localObject1 = arrayOfObject[k];
          localObject1 = (int[])localObject1;
          localObject1 = (int[])localObject1;
          this.g = ((int[])localObject1);
          k = 0;
          localObject1 = null;
          m = 1;
          arrayOfObject[m] = null;
          arrayOfObject[0] = null;
          k = f + -1;
          f = k;
          return;
        }
        localObject1 = new int[paramInt];
        this.g = ((int[])localObject1);
        localObject1 = new Object[paramInt];
        this.h = ((Object[])localObject1);
      }
      k = 4;
      if (paramInt == k) {
        synchronized (b.class)
        {
          Object localObject3 = c;
          if (localObject3 != null)
          {
            arrayOfObject = c;
            this.h = arrayOfObject;
            k = 0;
            localObject3 = null;
            localObject3 = arrayOfObject[0];
            localObject3 = (Object[])localObject3;
            localObject3 = (Object[])localObject3;
            c = (Object[])localObject3;
            k = 1;
            localObject3 = arrayOfObject[k];
            localObject3 = (int[])localObject3;
            localObject3 = (int[])localObject3;
            this.g = ((int[])localObject3);
            k = 0;
            localObject3 = null;
            m = 1;
            arrayOfObject[m] = null;
            arrayOfObject[0] = null;
            k = d + -1;
            d = k;
          }
        }
      }
    }
  }
  
  public int a(Object paramObject)
  {
    if (paramObject == null) {}
    for (int k = a();; k = a(paramObject, k))
    {
      return k;
      k = paramObject.hashCode();
    }
  }
  
  public void a(int paramInt)
  {
    int[] arrayOfInt = this.g;
    int k = arrayOfInt.length;
    if (k < paramInt)
    {
      arrayOfInt = this.g;
      Object[] arrayOfObject = this.h;
      d(paramInt);
      int m = this.i;
      if (m > 0)
      {
        Object localObject = this.g;
        int n = this.i;
        System.arraycopy(arrayOfInt, 0, localObject, 0, n);
        localObject = this.h;
        n = this.i;
        System.arraycopy(arrayOfObject, 0, localObject, 0, n);
      }
      m = this.i;
      a(arrayOfInt, arrayOfObject, m);
    }
  }
  
  public boolean add(Object paramObject)
  {
    int k = 8;
    int n = 4;
    int i1 = 0;
    int i2;
    int i3;
    if (paramObject == null)
    {
      i2 = a();
      i3 = 0;
    }
    Object localObject1;
    while (i2 >= 0)
    {
      k = 0;
      localObject1 = null;
      return k;
      i3 = paramObject.hashCode();
      i2 = a(paramObject, i3);
    }
    i2 ^= 0xFFFFFFFF;
    int i4 = this.i;
    int[] arrayOfInt = this.g;
    int i6 = arrayOfInt.length;
    int m;
    if (i4 >= i6)
    {
      i4 = this.i;
      if (i4 < k) {
        break label326;
      }
      m = this.i;
      n = this.i >> 1;
      m += n;
    }
    for (;;)
    {
      Object localObject2 = this.g;
      Object[] arrayOfObject = this.h;
      d(m);
      localObject1 = this.g;
      m = localObject1.length;
      if (m > 0)
      {
        localObject1 = this.g;
        int i7 = localObject2.length;
        System.arraycopy(localObject2, 0, localObject1, 0, i7);
        localObject1 = this.h;
        i7 = arrayOfObject.length;
        System.arraycopy(arrayOfObject, 0, localObject1, 0, i7);
      }
      m = this.i;
      a((int[])localObject2, arrayOfObject, m);
      m = this.i;
      if (i2 < m)
      {
        localObject1 = this.g;
        localObject2 = this.g;
        i1 = i2 + 1;
        i5 = this.i - i2;
        System.arraycopy(localObject1, i2, localObject2, i1, i5);
        localObject1 = this.h;
        localObject2 = this.h;
        i1 = i2 + 1;
        i5 = this.i - i2;
        System.arraycopy(localObject1, i2, localObject2, i1, i5);
      }
      this.g[i2] = i3;
      localObject1 = this.h;
      localObject1[i2] = paramObject;
      m = this.i + 1;
      this.i = m;
      m = 1;
      break;
      label326:
      int i5 = this.i;
      if (i5 < n) {
        m = n;
      }
    }
  }
  
  public boolean addAll(Collection paramCollection)
  {
    int k = this.i;
    int m = paramCollection.size();
    k += m;
    a(k);
    k = 0;
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      int n = localIterator.hasNext();
      if (n == 0) {
        break;
      }
      Object localObject = localIterator.next();
      n = add(localObject);
      k |= n;
    }
    return k;
  }
  
  public Object b(int paramInt)
  {
    return this.h[paramInt];
  }
  
  public Object c(int paramInt)
  {
    int k = 8;
    int m = 0;
    int[] arrayOfInt = null;
    Object localObject1 = this.h[paramInt];
    int n = this.i;
    int i1 = 1;
    Object localObject2;
    Object localObject3;
    if (n <= i1)
    {
      localObject2 = this.g;
      localObject3 = this.h;
      i1 = this.i;
      a((int[])localObject2, (Object[])localObject3, i1);
      localObject2 = a;
      this.g = ((int[])localObject2);
      localObject2 = b;
      this.h = ((Object[])localObject2);
      this.i = 0;
    }
    for (;;)
    {
      return localObject1;
      localObject3 = this.g;
      n = localObject3.length;
      if (n > k)
      {
        n = this.i;
        localObject4 = this.g;
        i1 = localObject4.length / 3;
        if (n < i1)
        {
          n = this.i;
          if (n > k)
          {
            k = this.i;
            n = this.i >> 1;
            k += n;
          }
          localObject3 = this.g;
          localObject4 = this.h;
          d(k);
          k = this.i + -1;
          this.i = k;
          if (paramInt > 0)
          {
            localObject2 = this.g;
            System.arraycopy(localObject3, 0, localObject2, 0, paramInt);
            localObject2 = this.h;
            System.arraycopy(localObject4, 0, localObject2, 0, paramInt);
          }
          k = this.i;
          if (paramInt >= k) {
            continue;
          }
          k = paramInt + 1;
          arrayOfInt = this.g;
          int i2 = this.i - paramInt;
          System.arraycopy(localObject3, k, arrayOfInt, paramInt, i2);
          k = paramInt + 1;
          localObject3 = this.h;
          m = this.i - paramInt;
          System.arraycopy(localObject4, k, localObject3, paramInt, m);
          continue;
        }
      }
      k = this.i + -1;
      this.i = k;
      k = this.i;
      if (paramInt < k)
      {
        localObject2 = this.g;
        n = paramInt + 1;
        localObject4 = this.g;
        m = this.i - paramInt;
        System.arraycopy(localObject2, n, localObject4, paramInt, m);
        localObject2 = this.h;
        n = paramInt + 1;
        localObject4 = this.h;
        m = this.i - paramInt;
        System.arraycopy(localObject2, n, localObject4, paramInt, m);
      }
      localObject2 = this.h;
      n = this.i;
      i1 = 0;
      Object localObject4 = null;
      localObject2[n] = null;
    }
  }
  
  public void clear()
  {
    int k = this.i;
    if (k != 0)
    {
      Object localObject = this.g;
      Object[] arrayOfObject = this.h;
      int m = this.i;
      a((int[])localObject, arrayOfObject, m);
      localObject = a;
      this.g = ((int[])localObject);
      localObject = b;
      this.h = ((Object[])localObject);
      k = 0;
      localObject = null;
      this.i = 0;
    }
  }
  
  public boolean contains(Object paramObject)
  {
    int k = a(paramObject);
    if (k >= 0) {}
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    boolean bool1;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = localIterator.next();
      bool1 = contains(localObject);
    } while (bool1);
    boolean bool2 = false;
    localIterator = null;
    for (;;)
    {
      return bool2;
      bool2 = true;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Set;
      if (bool2)
      {
        paramObject = (Set)paramObject;
        int k = size();
        int m = ((Set)paramObject).size();
        if (k != m)
        {
          bool1 = false;
        }
        else
        {
          k = 0;
          try
          {
            for (;;)
            {
              m = this.i;
              if (k >= m) {
                break;
              }
              Object localObject = b(k);
              boolean bool3 = ((Set)paramObject).contains(localObject);
              if (!bool3)
              {
                bool1 = false;
                break;
              }
              k += 1;
            }
          }
          catch (NullPointerException localNullPointerException)
          {
            bool1 = false;
          }
          catch (ClassCastException localClassCastException)
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
  
  public int hashCode()
  {
    int k = 0;
    int[] arrayOfInt = this.g;
    int m = this.i;
    int n = 0;
    while (k < m)
    {
      int i1 = arrayOfInt[k];
      n += i1;
      k += 1;
    }
    return n;
  }
  
  public boolean isEmpty()
  {
    int k = this.i;
    if (k <= 0) {}
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
  
  public Iterator iterator()
  {
    return b().e().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    int k = a(paramObject);
    if (k >= 0) {
      c(k);
    }
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    boolean bool1 = false;
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Object localObject = localIterator.next();
      bool2 = remove(localObject);
      bool1 |= bool2;
    }
    return bool1;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    int k = this.i + -1;
    boolean bool1 = false;
    int m = k;
    while (m >= 0)
    {
      Object localObject = this.h[m];
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        c(m);
        bool1 = true;
      }
      m += -1;
    }
    return bool1;
  }
  
  public int size()
  {
    return this.i;
  }
  
  public Object[] toArray()
  {
    Object[] arrayOfObject1 = new Object[this.i];
    Object[] arrayOfObject2 = this.h;
    int k = this.i;
    System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, k);
    return arrayOfObject1;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    int k = paramArrayOfObject.length;
    int m = this.i;
    if (k < m)
    {
      localObject = paramArrayOfObject.getClass().getComponentType();
      m = this.i;
    }
    for (Object localObject = (Object[])Array.newInstance((Class)localObject, m);; localObject = paramArrayOfObject)
    {
      Object[] arrayOfObject = this.h;
      int n = this.i;
      System.arraycopy(arrayOfObject, 0, localObject, 0, n);
      m = localObject.length;
      n = this.i;
      if (m > n)
      {
        m = this.i;
        n = 0;
        localObject[m] = null;
      }
      return (Object[])localObject;
    }
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
      int k = this.i * 14;
      localStringBuilder.<init>(k);
      localStringBuilder.append('{');
      k = 0;
      str = null;
      int m = this.i;
      if (k < m)
      {
        if (k > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        Object localObject = b(k);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          k += 1;
          break;
          localObject = "(this Set)";
          localStringBuilder.append((String)localObject);
        }
      }
      k = 125;
      localStringBuilder.append(k);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */