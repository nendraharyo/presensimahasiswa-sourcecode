package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzss
{
  public static final Object zzbut;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzbut = localObject;
  }
  
  public static boolean equals(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i;
    if (paramArrayOfFloat1 != null)
    {
      i = paramArrayOfFloat1.length;
      if (i != 0) {}
    }
    else if (paramArrayOfFloat2 != null)
    {
      i = paramArrayOfFloat2.length;
      if (i != 0) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      boolean bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfFloat1, paramArrayOfFloat2);
    }
  }
  
  public static boolean equals(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i;
    if (paramArrayOfInt1 != null)
    {
      i = paramArrayOfInt1.length;
      if (i != 0) {}
    }
    else if (paramArrayOfInt2 != null)
    {
      i = paramArrayOfInt2.length;
      if (i != 0) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      boolean bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
    }
  }
  
  public static boolean equals(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i;
    if (paramArrayOfLong1 != null)
    {
      i = paramArrayOfLong1.length;
      if (i != 0) {}
    }
    else if (paramArrayOfLong2 != null)
    {
      i = paramArrayOfLong2.length;
      if (i != 0) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      boolean bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfLong1, paramArrayOfLong2);
    }
  }
  
  public static boolean equals(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = 1;
    boolean bool1 = false;
    int j;
    if (paramArrayOfObject1 == null)
    {
      j = 0;
      if (paramArrayOfObject2 != null) {
        break label69;
      }
    }
    int m;
    Object localObject1;
    int i1;
    Object localObject2;
    int i2;
    label69:
    for (int k = 0;; k = paramArrayOfObject2.length)
    {
      m = 0;
      localObject1 = null;
      for (i1 = 0; i1 < j; i1 = i2)
      {
        localObject2 = paramArrayOfObject1[i1];
        if (localObject2 != null) {
          break;
        }
        i2 = i1 + 1;
      }
      k = paramArrayOfObject1.length;
      j = k;
      break;
    }
    for (;;)
    {
      if (i3 < k)
      {
        localObject1 = paramArrayOfObject2[i3];
        if (localObject1 == null)
        {
          m = i3 + 1;
          i3 = m;
          continue;
        }
      }
      if (i1 >= j)
      {
        i2 = i;
        if (i3 < k) {
          break label150;
        }
        m = i;
        label127:
        if ((i2 == 0) || (m == 0)) {
          break label159;
        }
        bool1 = i;
      }
      label150:
      label159:
      boolean bool2;
      do
      {
        do
        {
          return bool1;
          i2 = 0;
          localObject2 = null;
          break;
          m = 0;
          localObject1 = null;
          break label127;
        } while (i2 != m);
        localObject1 = paramArrayOfObject1[i1];
        localObject2 = paramArrayOfObject2[i3];
        bool2 = localObject1.equals(localObject2);
      } while (!bool2);
      i2 = i1 + 1;
      int n = i3 + 1;
      i1 = i2;
      break;
      int i3 = n;
    }
  }
  
  public static int hashCode(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      i = paramArrayOfFloat.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    for (int i = 0;; i = Arrays.hashCode(paramArrayOfFloat)) {
      return i;
    }
  }
  
  public static int hashCode(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    for (int i = 0;; i = Arrays.hashCode(paramArrayOfInt)) {
      return i;
    }
  }
  
  public static int hashCode(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      i = paramArrayOfLong.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    for (int i = 0;; i = Arrays.hashCode(paramArrayOfLong)) {
      return i;
    }
  }
  
  public static int hashCode(Object[] paramArrayOfObject)
  {
    int i = 0;
    if (paramArrayOfObject == null) {}
    for (int j = 0;; j = paramArrayOfObject.length)
    {
      int k = 0;
      while (k < j)
      {
        Object localObject = paramArrayOfObject[k];
        if (localObject != null)
        {
          i *= 31;
          int m = localObject.hashCode();
          i += m;
        }
        k += 1;
      }
    }
    return i;
  }
  
  public static int zza(byte[][] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {}
    for (int j = 0;; j = paramArrayOfByte.length)
    {
      int k = 0;
      while (k < j)
      {
        byte[] arrayOfByte = paramArrayOfByte[k];
        if (arrayOfByte != null)
        {
          i *= 31;
          int m = Arrays.hashCode(arrayOfByte);
          i += m;
        }
        k += 1;
      }
    }
    return i;
  }
  
  public static void zza(zzso paramzzso1, zzso paramzzso2)
  {
    zzsq localzzsq = paramzzso1.zzbuj;
    if (localzzsq != null)
    {
      localzzsq = paramzzso1.zzbuj.zzJq();
      paramzzso2.zzbuj = localzzsq;
    }
  }
  
  public static boolean zza(byte[][] paramArrayOfByte1, byte[][] paramArrayOfByte2)
  {
    int i = 1;
    boolean bool1 = false;
    int j;
    if (paramArrayOfByte1 == null)
    {
      j = 0;
      if (paramArrayOfByte2 != null) {
        break label69;
      }
    }
    int m;
    byte[] arrayOfByte1;
    int i1;
    byte[] arrayOfByte2;
    int i2;
    label69:
    for (int k = 0;; k = paramArrayOfByte2.length)
    {
      m = 0;
      arrayOfByte1 = null;
      for (i1 = 0; i1 < j; i1 = i2)
      {
        arrayOfByte2 = paramArrayOfByte1[i1];
        if (arrayOfByte2 != null) {
          break;
        }
        i2 = i1 + 1;
      }
      k = paramArrayOfByte1.length;
      j = k;
      break;
    }
    for (;;)
    {
      if (i3 < k)
      {
        arrayOfByte1 = paramArrayOfByte2[i3];
        if (arrayOfByte1 == null)
        {
          m = i3 + 1;
          i3 = m;
          continue;
        }
      }
      if (i1 >= j)
      {
        i2 = i;
        if (i3 < k) {
          break label150;
        }
        m = i;
        label127:
        if ((i2 == 0) || (m == 0)) {
          break label159;
        }
        bool1 = i;
      }
      label150:
      label159:
      boolean bool2;
      do
      {
        do
        {
          return bool1;
          i2 = 0;
          arrayOfByte2 = null;
          break;
          m = 0;
          arrayOfByte1 = null;
          break label127;
        } while (i2 != m);
        arrayOfByte1 = paramArrayOfByte1[i1];
        arrayOfByte2 = paramArrayOfByte2[i3];
        bool2 = Arrays.equals(arrayOfByte1, arrayOfByte2);
      } while (!bool2);
      i2 = i1 + 1;
      int n = i3 + 1;
      i1 = i2;
      break;
      int i3 = n;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzss.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */