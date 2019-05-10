package android.support.v4.h;

public class k$b
  implements k.a
{
  private final Object[] a;
  private int b;
  
  public k$b(int paramInt)
  {
    if (paramInt <= 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The max pool size must be > 0");
      throw ((Throwable)localObject);
    }
    Object localObject = new Object[paramInt];
    this.a = ((Object[])localObject);
  }
  
  private boolean a(Object paramObject)
  {
    boolean bool = false;
    int i = 0;
    for (;;)
    {
      int j = this.b;
      if (i < j)
      {
        Object localObject = this.a[i];
        if (localObject == paramObject) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      i += 1;
    }
  }
  
  public Object acquire()
  {
    int i = 0;
    int j = this.b;
    Object localObject;
    if (j > 0)
    {
      j = this.b;
      int k = j + -1;
      localObject = this.a[k];
      Object[] arrayOfObject = this.a;
      arrayOfObject[k] = null;
      i = this.b + -1;
      this.b = i;
    }
    for (;;)
    {
      return localObject;
      j = 0;
      localObject = null;
    }
  }
  
  public boolean release(Object paramObject)
  {
    boolean bool = a(paramObject);
    Object localObject;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Already in the pool!");
      throw ((Throwable)localObject);
    }
    int i = this.b;
    Object[] arrayOfObject = this.a;
    int k = arrayOfObject.length;
    if (i < k)
    {
      localObject = this.a;
      int m = this.b;
      localObject[m] = paramObject;
      i = this.b + 1;
      this.b = i;
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\k$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */