package android.support.v4.h;

public class f
  implements Cloneable
{
  private static final Object a;
  private boolean b = false;
  private long[] c;
  private Object[] d;
  private int e;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public f()
  {
    this(10);
  }
  
  public f(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = c.b;
      this.c = ((long[])localObject);
      localObject = c.c;
    }
    for (this.d = ((Object[])localObject);; this.d = ((Object[])localObject))
    {
      this.e = 0;
      return;
      int i = c.b(paramInt);
      long[] arrayOfLong = new long[i];
      this.c = arrayOfLong;
      localObject = new Object[i];
    }
  }
  
  private void d()
  {
    int i = this.e;
    long[] arrayOfLong = this.c;
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
          long l = arrayOfLong[j];
          arrayOfLong[k] = l;
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
  
  public f a()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.clone();
      localObject2 = (f)localObject2;
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
      localObject1 = ((long[])localObject1).clone();
      localObject1 = (long[])localObject1;
      ((f)localObject2).c = ((long[])localObject1);
      localObject1 = this.d;
      localObject1 = ((Object[])localObject1).clone();
      localObject1 = (Object[])localObject1;
      ((f)localObject2).d = ((Object[])localObject1);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      break label52;
    }
    return (f)localObject2;
  }
  
  public Object a(long paramLong)
  {
    return a(paramLong, null);
  }
  
  public Object a(long paramLong, Object paramObject)
  {
    long[] arrayOfLong = this.c;
    int i = this.e;
    int j = c.a(arrayOfLong, i, paramLong);
    Object localObject1;
    if (j >= 0)
    {
      localObject1 = this.d[j];
      Object localObject2 = a;
      if (localObject1 != localObject2) {
        break label50;
      }
    }
    for (;;)
    {
      return paramObject;
      label50:
      localObject1 = this.d;
      paramObject = localObject1[j];
    }
  }
  
  public void a(int paramInt)
  {
    Object localObject1 = this.d[paramInt];
    Object localObject2 = a;
    if (localObject1 != localObject2)
    {
      localObject1 = this.d;
      localObject2 = a;
      localObject1[paramInt] = localObject2;
      boolean bool = true;
      this.b = bool;
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
  
  public long b(int paramInt)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    return this.c[paramInt];
  }
  
  public void b(long paramLong)
  {
    long[] arrayOfLong = this.c;
    int i = this.e;
    int j = c.a(arrayOfLong, i, paramLong);
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
  
  public void b(long paramLong, Object paramObject)
  {
    long[] arrayOfLong = this.c;
    int i = this.e;
    int k = c.a(arrayOfLong, i, paramLong);
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
          this.c[k] = paramLong;
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
          arrayOfLong = this.c;
          j = this.e;
          k = c.a(arrayOfLong, j, paramLong) ^ 0xFFFFFFFF;
        }
      }
      int j = this.e;
      Object localObject2 = this.c;
      int m = localObject2.length;
      int n;
      if (j >= m)
      {
        j = c.b(this.e + 1);
        localObject2 = new long[j];
        localObject1 = new Object[j];
        Object localObject3 = this.c;
        n = this.c.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = this.d;
        Object[] arrayOfObject = this.d;
        n = arrayOfObject.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        this.c = ((long[])localObject2);
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
      this.c[k] = paramLong;
      localObject1 = this.d;
      localObject1[k] = paramObject;
      k = this.e + 1;
      this.e = k;
    }
  }
  
  public int c(long paramLong)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    long[] arrayOfLong = this.c;
    int i = this.e;
    return c.a(arrayOfLong, i, paramLong);
  }
  
  public Object c(int paramInt)
  {
    boolean bool = this.b;
    if (bool) {
      d();
    }
    return this.d[paramInt];
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
        long l = b(i);
        localStringBuilder.append(l);
        char c1 = '=';
        localStringBuilder.append(c1);
        Object localObject = c(i);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */