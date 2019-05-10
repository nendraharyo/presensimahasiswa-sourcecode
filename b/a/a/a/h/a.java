package b.a.a.a.h;

public class a
{
  static
  {
    Class localClass = a.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      a = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    return a(paramArrayOfByte, 0, i, paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    a.b localb = new b/a/a/a/h/a$b;
    Object localObject = new byte[paramInt2 * 3 / 4];
    localb.<init>(paramInt3, (byte[])localObject);
    boolean bool = localb.a(paramArrayOfByte, paramInt1, paramInt2, true);
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("bad base-64");
      throw ((Throwable)localObject);
    }
    int i = localb.b;
    byte[] arrayOfByte = localb.a;
    int j = arrayOfByte.length;
    if (i == j) {
      localObject = localb.a;
    }
    for (;;)
    {
      return (byte[])localObject;
      i = localb.b;
      localObject = new byte[i];
      arrayOfByte = localb.a;
      int k = localb.b;
      System.arraycopy(arrayOfByte, 0, localObject, 0, k);
    }
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    return b(paramArrayOfByte, 0, i, paramInt);
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    a.c localc = new b/a/a/a/h/a$c;
    AssertionError localAssertionError = null;
    localc.<init>(paramInt3, null);
    int j = paramInt2 / 3 * 4;
    boolean bool1 = localc.d;
    int i1;
    if (bool1)
    {
      int k = paramInt2 % 3;
      if (k > 0) {
        j += 4;
      }
      boolean bool2 = localc.e;
      if ((bool2) && (paramInt2 > 0))
      {
        i1 = (paramInt2 + -1) / 57 + 1;
        bool2 = localc.f;
        if (!bool2) {
          break label225;
        }
      }
    }
    int n;
    label225:
    for (int m = 2;; n = i)
    {
      m *= i1;
      j += m;
      byte[] arrayOfByte = new byte[j];
      localc.a = arrayOfByte;
      localc.a(paramArrayOfByte, paramInt1, paramInt2, i);
      boolean bool3 = a;
      if (bool3) {
        break label232;
      }
      n = localc.b;
      if (n == j) {
        break label232;
      }
      localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>();
      throw localAssertionError;
      n = paramInt2 % 3;
      switch (n)
      {
      case 0: 
      default: 
        break;
      case 1: 
        j += 2;
        break;
      case 2: 
        j += 3;
        break;
      }
    }
    label232:
    return localc.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\h\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */