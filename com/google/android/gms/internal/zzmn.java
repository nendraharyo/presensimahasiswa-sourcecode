package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;

public final class zzmn
{
  public static int zza(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = 0;
    if (paramArrayOfObject != null)
    {
      j = paramArrayOfObject.length;
      if (i >= j) {
        break label48;
      }
      Object localObject = paramArrayOfObject[i];
      boolean bool = zzw.equal(localObject, paramObject);
      if (!bool) {
        break label41;
      }
    }
    label41:
    label48:
    for (int j = i;; j = -1)
    {
      return j;
      j = 0;
      break;
      i += 1;
      break;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, double[] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      double d = paramArrayOfDouble[j];
      String str = Double.toString(d);
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, float[] paramArrayOfFloat)
  {
    int i = paramArrayOfFloat.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      float f = paramArrayOfFloat[j];
      String str = Float.toString(f);
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      int k = paramArrayOfInt[j];
      String str = Integer.toString(k);
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    int i = paramArrayOfLong.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      long l = paramArrayOfLong[j];
      String str = Long.toString(l);
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      String str = paramArrayOfObject[j].toString();
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        localObject = ",";
        paramStringBuilder.append((String)localObject);
      }
      Object localObject = paramStringBuilder.append("\"");
      String str = paramArrayOfString[j];
      localObject = ((StringBuilder)localObject).append(str);
      str = "\"";
      ((StringBuilder)localObject).append(str);
      j += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, boolean[] paramArrayOfBoolean)
  {
    int i = paramArrayOfBoolean.length;
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        str = ",";
        paramStringBuilder.append(str);
      }
      int k = paramArrayOfBoolean[j];
      String str = Boolean.toString(k);
      paramStringBuilder.append(str);
      j += 1;
    }
  }
  
  public static Integer[] zza(int[] paramArrayOfInt)
  {
    Integer[] arrayOfInteger;
    if (paramArrayOfInt == null) {
      arrayOfInteger = null;
    }
    for (;;)
    {
      return arrayOfInteger;
      int i = paramArrayOfInt.length;
      arrayOfInteger = new Integer[i];
      int j = 0;
      while (j < i)
      {
        int k = paramArrayOfInt[j];
        Integer localInteger = Integer.valueOf(k);
        arrayOfInteger[j] = localInteger;
        j += 1;
      }
    }
  }
  
  public static ArrayList zzb(Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      localArrayList.add(localObject);
      j += 1;
    }
    return localArrayList;
  }
  
  public static boolean zzb(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = zza(paramArrayOfObject, paramObject);
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static ArrayList zzsa()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */