package b.a.a.a.o;

public final class g
{
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 * 37 + paramInt2;
  }
  
  public static int a(int paramInt, Object paramObject)
  {
    if (paramObject != null) {}
    for (int i = paramObject.hashCode();; i = 0) {
      return a(paramInt, i);
    }
  }
  
  public static int a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return a(paramInt, i);
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramObject1.equals(paramObject2);
    }
  }
  
  public static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    boolean bool1 = true;
    if (paramArrayOfObject1 == null) {
      if (paramArrayOfObject2 != null) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      if (paramArrayOfObject2 != null)
      {
        int i = paramArrayOfObject1.length;
        int j = paramArrayOfObject2.length;
        if (i == j)
        {
          i = 0;
          for (;;)
          {
            j = paramArrayOfObject1.length;
            if (i >= j) {
              break;
            }
            Object localObject1 = paramArrayOfObject1[i];
            Object localObject2 = paramArrayOfObject2[i];
            boolean bool2 = a(localObject1, localObject2);
            if (!bool2)
            {
              bool1 = false;
              break;
            }
            i += 1;
          }
        }
      }
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */