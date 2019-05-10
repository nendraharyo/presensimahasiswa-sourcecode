package android.support.v4.h;

public class n
  implements Cloneable
{
  private static final Object a;
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public n()
  {
    this(10);
  }
  
  public n(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = c.a;
      this.c = ((int[])localObject);
      localObject = c.c;
    }
    for (this.d = ((Object[])localObject);; this.d = ((Object[])localObject))
    {
      this.e = 0;
      return;
      int i = c.a(paramInt);
      int[] arrayOfInt = new int[i];
      this.c = arrayOfInt;
      localObject = new Object[i];
    }
  }
  
  private void d()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfObject[j];
      Object localObject2 = a;
      if (localObject1 != localObject2)
      {
        if (j != k)
        {
          int m = arrayOfInt[j];
          arrayOfInt[k] = m;
          arrayOfObject[k] = localObject1;
          localObject1 = null;
          arrayOfObject[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    this.b = false;
    this.e = k;
  }
  
  public n a()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.clone();
      localObject2 = (n)localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException2)
    {
      for (;;)
      {
        Object localObject2;
        label52:
        Object localObject3 = null;
      }
    }
    try
    {
      localObject1 = this.c;
      localObject1 = ((int[])localObject1).clone();
      localObject1 = (int[])localObject1;
      ((n)localObject2).c = ((int[])localObject1);
      localObject1 = this.d;
      localObject1 = ((Object[])localObject1).clone();
      localObject1 = (Object[])localObject1;
      ((n)localObject2).d = ((Object[])localObject1);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      break label52;
    }
    return (n)localObject2;
  }
  
  public Object a(int paramInt)
  {
    return a(paramInt, null);
  }
  
  public Object a(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = this.c;
    int i = this.e;
    int j = c.a(arrayOfInt, i, paramInt);
    Object localObject1;
    if (j >= 0)
    {
      localObject1 = this.d[j];
      Object localObject2 = a;
      if (localObject1 != localObject2) {
        break label48;
      }
    }
    for (;;)
    {
      return paramObject;
      label48:
      localObject1 = this.d;
      paramObject = localObject1[j];
    }
  }
  
  public int b()
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    return this.e;
  }
  
  public void b(int paramInt)
  {
    int[] arrayOfInt = this.c;
    int i = this.e;
    int j = c.a(arrayOfInt, i, paramInt);
    if (j >= 0)
    {
      Object localObject1 = this.d[j];
      Object localObject2 = a;
      if (localObject1 != localObject2)
      {
        localObject1 = this.d;
        localObject2 = a;
        localObject1[j] = localObject2;
        j = 1;
        this.b = j;
      }
    }
  }
  
  public void b(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = this.c;
    int i = this.e;
    int k = c.a(arrayOfInt, i, paramInt);
    Object localObject1;
    if (k >= 0)
    {
      localObject1 = this.d;
      localObject1[k] = paramObject;
    }
    for (;;)
    {
      return;
      k ^= 0xFFFFFFFF;
      i = this.e;
      if (k < i)
      {
        localObject1 = this.d[k];
        localObject2 = a;
        if (localObject1 == localObject2)
        {
          this.c[k] = paramInt;
          localObject1 = this.d;
          localObject1[k] = paramObject;
          continue;
        }
      }
      boolean bool = this.b;
      if (bool)
      {
        j = this.e;
        localObject2 = this.c;
        m = localObject2.length;
        if (j >= m)
        {
          d();
          arrayOfInt = this.c;
          j = this.e;
          k = c.a(arrayOfInt, j, paramInt) ^ 0xFFFFFFFF;
        }
      }
      int j = this.e;
      Object localObject2 = this.c;
      int m = localObject2.length;
      int n;
      if (j >= m)
      {
        j = c.a(this.e + 1);
        localObject2 = new int[j];
        localObject1 = new Object[j];
        Object localObject3 = this.c;
        n = this.c.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = this.d;
        Object[] arrayOfObject = this.d;
        n = arrayOfObject.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        this.c = ((int[])localObject2);
        this.d = ((Object[])localObject1);
      }
      j = this.e - k;
      if (j != 0)
      {
        localObject1 = this.c;
        localObject2 = this.c;
        int i1 = k + 1;
        n = this.e - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
        localObject1 = this.d;
        localObject2 = this.d;
        i1 = k + 1;
        n = this.e - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
      }
      this.c[k] = paramInt;
      localObject1 = this.d;
      localObject1[k] = paramObject;
      k = this.e + 1;
      this.e = k;
    }
  }
  
  public void c()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    this.e = 0;
    this.b = false;
  }
  
  public void c(int paramInt)
  {
    b(paramInt);
  }
  
  public void c(int paramInt, Object paramObject)
  {
    int i = this.e;
    int k;
    if (i != 0)
    {
      int[] arrayOfInt1 = this.c;
      k = this.e + -1;
      i = arrayOfInt1[k];
      if (paramInt <= i) {
        b(paramInt, paramObject);
      }
    }
    for (;;)
    {
      return;
      boolean bool = this.b;
      if (bool)
      {
        j = this.e;
        localObject1 = this.c;
        k = localObject1.length;
        if (j >= k) {
          d();
        }
      }
      int j = this.e;
      Object localObject1 = this.c;
      k = localObject1.length;
      if (j >= k)
      {
        k = c.a(j + 1);
        int[] arrayOfInt2 = new int[k];
        localObject1 = new Object[k];
        Object localObject2 = this.c;
        int m = this.c.length;
        System.arraycopy(localObject2, 0, arrayOfInt2, 0, m);
        localObject2 = this.d;
        Object[] arrayOfObject = this.d;
        m = arrayOfObject.length;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        this.c = arrayOfInt2;
        this.d = ((Object[])localObject1);
      }
      this.c[j] = paramInt;
      localObject1 = this.d;
      localObject1[j] = paramObject;
      j += 1;
      this.e = j;
    }
  }
  
  public int d(int paramInt)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    return this.c[paramInt];
  }
  
  public Object e(int paramInt)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    return this.d[paramInt];
  }
  
  public int f(int paramInt)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    int[] arrayOfInt = this.c;
    int i = this.e;
    return c.a(arrayOfInt, i, paramInt);
  }
  
  public String toString()
  {
    int i = b();
    if (i <= 0) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      i = this.e * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = this.e;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        int k = d(i);
        localStringBuilder.append(k);
        k = 61;
        localStringBuilder.append(k);
        Object localObject = e(i);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
        }
      }
      i = 125;
      localStringBuilder.append(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */