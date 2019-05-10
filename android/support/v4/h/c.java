package android.support.v4.h;

class c
{
  static final int[] a = new int[0];
  static final long[] b = new long[0];
  static final Object[] c = new Object[0];
  
  public static int a(int paramInt)
  {
    return c(paramInt * 4) / 4;
  }
  
  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 + -1;
    int k;
    for (;;)
    {
      if (i > j) {
        break label63;
      }
      k = i + j >>> 1;
      int m = paramArrayOfInt[k];
      if (m < paramInt2)
      {
        i = k + 1;
      }
      else
      {
        if (m <= paramInt2) {
          break;
        }
        j = k + -1;
      }
    }
    label63:
    for (j = k;; j = i ^ 0xFFFFFFFF) {
      return j;
    }
  }
  
  static int a(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = 0;
    int j = paramInt + -1;
    int m;
    for (;;)
    {
      if (i > j) {
        break label77;
      }
      m = i + j >>> 1;
      long l = paramArrayOfLong[m];
      boolean bool2 = l < paramLong;
      if (bool2)
      {
        i = m + 1;
      }
      else
      {
        boolean bool1 = l < paramLong;
        if (!bool1) {
          break;
        }
        k = m + -1;
      }
    }
    label77:
    for (int k = m;; k = i ^ 0xFFFFFFFF) {
      return k;
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static int b(int paramInt)
  {
    return c(paramInt * 8) / 8;
  }
  
  public static int c(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          j = i << j;
          paramInt = j + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */