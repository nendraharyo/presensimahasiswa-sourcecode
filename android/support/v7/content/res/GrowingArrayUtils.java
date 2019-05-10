package android.support.v7.content.res;

import java.lang.reflect.Array;

final class GrowingArrayUtils
{
  static
  {
    Class localClass = GrowingArrayUtils.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  public static int[] append(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfInt.length;
      if (paramInt1 > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt1 + 1;
    int j = paramArrayOfInt.length;
    if (i > j)
    {
      i = growSize(paramInt1);
      localObject = new int[i];
      System.arraycopy(paramArrayOfInt, 0, localObject, 0, paramInt1);
      paramArrayOfInt = (int[])localObject;
    }
    paramArrayOfInt[paramInt1] = paramInt2;
    return paramArrayOfInt;
  }
  
  public static long[] append(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfLong.length;
      if (paramInt > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt + 1;
    int j = paramArrayOfLong.length;
    if (i > j)
    {
      i = growSize(paramInt);
      localObject = new long[i];
      System.arraycopy(paramArrayOfLong, 0, localObject, 0, paramInt);
      paramArrayOfLong = (long[])localObject;
    }
    paramArrayOfLong[paramInt] = paramLong;
    return paramArrayOfLong;
  }
  
  public static Object[] append(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfObject.length;
      if (paramInt > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt + 1;
    int j = paramArrayOfObject.length;
    if (i > j)
    {
      localObject = paramArrayOfObject.getClass().getComponentType();
      j = growSize(paramInt);
      localObject = (Object[])Array.newInstance((Class)localObject, j);
      System.arraycopy(paramArrayOfObject, 0, localObject, 0, paramInt);
    }
    for (;;)
    {
      localObject[paramInt] = paramObject;
      return (Object[])localObject;
      localObject = paramArrayOfObject;
    }
  }
  
  public static boolean[] append(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfBoolean.length;
      if (paramInt > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt + 1;
    int j = paramArrayOfBoolean.length;
    if (i > j)
    {
      i = growSize(paramInt);
      localObject = new boolean[i];
      System.arraycopy(paramArrayOfBoolean, 0, localObject, 0, paramInt);
      paramArrayOfBoolean = (boolean[])localObject;
    }
    paramArrayOfBoolean[paramInt] = paramBoolean;
    return paramArrayOfBoolean;
  }
  
  public static int growSize(int paramInt)
  {
    int i = 4;
    if (paramInt <= i) {}
    for (i = 8;; i = paramInt * 2) {
      return i;
    }
  }
  
  public static int[] insert(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      j = paramArrayOfInt.length;
      if (paramInt1 > j)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int j = paramInt1 + 1;
    int k = paramArrayOfInt.length;
    if (j <= k)
    {
      j = paramInt2 + 1;
      k = paramInt1 - paramInt2;
      System.arraycopy(paramArrayOfInt, paramInt2, paramArrayOfInt, j, k);
      paramArrayOfInt[paramInt2] = paramInt3;
    }
    for (;;)
    {
      return paramArrayOfInt;
      j = growSize(paramInt1);
      localObject = new int[j];
      System.arraycopy(paramArrayOfInt, 0, localObject, 0, paramInt2);
      localObject[paramInt2] = paramInt3;
      k = paramInt2 + 1;
      i = paramArrayOfInt.length - paramInt2;
      System.arraycopy(paramArrayOfInt, paramInt2, localObject, k, i);
      paramArrayOfInt = (int[])localObject;
    }
  }
  
  public static long[] insert(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong)
  {
    int i = 0;
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      j = paramArrayOfLong.length;
      if (paramInt1 > j)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int j = paramInt1 + 1;
    int k = paramArrayOfLong.length;
    if (j <= k)
    {
      j = paramInt2 + 1;
      k = paramInt1 - paramInt2;
      System.arraycopy(paramArrayOfLong, paramInt2, paramArrayOfLong, j, k);
      paramArrayOfLong[paramInt2] = paramLong;
    }
    for (;;)
    {
      return paramArrayOfLong;
      j = growSize(paramInt1);
      localObject = new long[j];
      System.arraycopy(paramArrayOfLong, 0, localObject, 0, paramInt2);
      localObject[paramInt2] = paramLong;
      k = paramInt2 + 1;
      i = paramArrayOfLong.length - paramInt2;
      System.arraycopy(paramArrayOfLong, paramInt2, localObject, k, i);
      paramArrayOfLong = (long[])localObject;
    }
  }
  
  public static Object[] insert(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Object paramObject)
  {
    int i = 0;
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      j = paramArrayOfObject.length;
      if (paramInt1 > j)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int j = paramInt1 + 1;
    int k = paramArrayOfObject.length;
    if (j <= k)
    {
      j = paramInt2 + 1;
      k = paramInt1 - paramInt2;
      System.arraycopy(paramArrayOfObject, paramInt2, paramArrayOfObject, j, k);
      paramArrayOfObject[paramInt2] = paramObject;
    }
    for (;;)
    {
      return paramArrayOfObject;
      localObject = paramArrayOfObject.getClass().getComponentType();
      k = growSize(paramInt1);
      localObject = (Object[])Array.newInstance((Class)localObject, k);
      System.arraycopy(paramArrayOfObject, 0, localObject, 0, paramInt2);
      localObject[paramInt2] = paramObject;
      k = paramInt2 + 1;
      i = paramArrayOfObject.length - paramInt2;
      System.arraycopy(paramArrayOfObject, paramInt2, localObject, k, i);
      paramArrayOfObject = (Object[])localObject;
    }
  }
  
  public static boolean[] insert(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    boolean bool = $assertionsDisabled;
    Object localObject;
    if (!bool)
    {
      j = paramArrayOfBoolean.length;
      if (paramInt1 > j)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int j = paramInt1 + 1;
    int k = paramArrayOfBoolean.length;
    if (j <= k)
    {
      j = paramInt2 + 1;
      k = paramInt1 - paramInt2;
      System.arraycopy(paramArrayOfBoolean, paramInt2, paramArrayOfBoolean, j, k);
      paramArrayOfBoolean[paramInt2] = paramBoolean;
    }
    for (;;)
    {
      return paramArrayOfBoolean;
      j = growSize(paramInt1);
      localObject = new boolean[j];
      System.arraycopy(paramArrayOfBoolean, 0, localObject, 0, paramInt2);
      localObject[paramInt2] = paramBoolean;
      k = paramInt2 + 1;
      i = paramArrayOfBoolean.length - paramInt2;
      System.arraycopy(paramArrayOfBoolean, paramInt2, localObject, k, i);
      paramArrayOfBoolean = (boolean[])localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\content\res\GrowingArrayUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */