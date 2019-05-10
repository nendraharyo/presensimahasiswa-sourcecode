package com.google.android.gms.internal;

import java.util.PriorityQueue;

public class zzbk
{
  static long zza(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = 2147483647L;
    long l2 = 1073807359L;
    long l3 = (paramInt1 + l1) % l2 * paramLong2 % l2;
    l3 = (paramLong1 + l2 - l3) % l2 * paramLong3 % l2;
    long l4 = (paramInt2 + l1) % l2;
    return (l3 + l4) % l2;
  }
  
  static long zza(long paramLong, int paramInt)
  {
    long l1 = 1073807359L;
    if (paramInt == 0) {
      paramLong = 1L;
    }
    for (;;)
    {
      return paramLong;
      int i = 1;
      if (paramInt != i)
      {
        i = paramInt % 2;
        long l2;
        int j;
        if (i == 0)
        {
          l2 = paramLong * paramLong % l1;
          j = paramInt / 2;
          l2 = zza(l2, j);
          paramLong = l2 % l1;
        }
        else
        {
          l2 = paramLong * paramLong % l1;
          j = paramInt / 2;
          l2 = zza(l2, j) % l1 * paramLong;
          paramLong = l2 % l1;
        }
      }
    }
  }
  
  static String zza(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfString.length;
    int j = paramInt1 + paramInt2;
    if (i < j) {
      zzin.e("Unable to construct shingle");
    }
    StringBuffer localStringBuffer;
    for (String str1 = "";; str1 = localStringBuffer.toString())
    {
      return str1;
      localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      i = paramInt1;
      for (;;)
      {
        int k = paramInt1 + paramInt2 + -1;
        if (i >= k) {
          break;
        }
        String str2 = paramArrayOfString[i];
        localStringBuffer.append(str2);
        k = 32;
        localStringBuffer.append(k);
        i += 1;
      }
      i = paramInt1 + paramInt2 + -1;
      str1 = paramArrayOfString[i];
      localStringBuffer.append(str1);
    }
  }
  
  static void zza(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    zzbk.zza localzza1 = new com/google/android/gms/internal/zzbk$zza;
    localzza1.<init>(paramLong, paramString, paramInt2);
    int i = paramPriorityQueue.size();
    boolean bool;
    if (i == paramInt1)
    {
      zzbk.zza localzza2 = (zzbk.zza)paramPriorityQueue.peek();
      long l1 = localzza2.value;
      long l2 = localzza1.value;
      bool = l1 < l2;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = paramPriorityQueue.contains(localzza1);
      if (!bool)
      {
        paramPriorityQueue.add(localzza1);
        int j = paramPriorityQueue.size();
        if (j > paramInt1) {
          paramPriorityQueue.poll();
        }
      }
    }
  }
  
  public static void zza(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    int i = paramArrayOfString.length;
    if (i < paramInt2)
    {
      j = paramArrayOfString.length;
      l1 = zzb(paramArrayOfString, 0, j);
      i = 0;
      str1 = null;
      j = paramArrayOfString.length;
      str2 = zza(paramArrayOfString, 0, j);
      k = paramArrayOfString.length;
      j = paramInt1;
      zza(paramInt1, l1, str2, k, paramPriorityQueue);
      return;
    }
    long l1 = zzb(paramArrayOfString, 0, paramInt2);
    String str1 = null;
    String str2 = zza(paramArrayOfString, 0, paramInt2);
    int j = paramInt1;
    int k = paramInt2;
    zza(paramInt1, l1, str2, paramInt2, paramPriorityQueue);
    long l2 = 16785407L;
    int m = paramInt2 + -1;
    long l3 = zza(l2, m);
    i = 1;
    int n = i;
    for (;;)
    {
      i = paramArrayOfString.length - paramInt2 + 1;
      if (n >= i) {
        break;
      }
      i = n + -1;
      str1 = paramArrayOfString[i];
      i = zzbi.zzx(str1);
      j = n + paramInt2 + -1;
      String str3 = paramArrayOfString[j];
      j = zzbi.zzx(str3);
      long l4 = 16785407L;
      long l5 = zza(i, j, l1, l3, l4);
      String str4 = zza(paramArrayOfString, n, paramInt2);
      int i1 = paramArrayOfString.length;
      zza(paramInt1, l5, str4, i1, paramPriorityQueue);
      i = n + 1;
      n = i;
      l1 = l5;
    }
  }
  
  private static long zzb(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    long l1 = 2147483647L;
    long l2 = 1073807359L;
    String str1 = paramArrayOfString[paramInt1];
    long l3 = zzbi.zzx(str1) + l1;
    long l4 = l3 % l2;
    int i = paramInt1 + 1;
    for (;;)
    {
      int j = paramInt1 + paramInt2;
      if (i >= j) {
        break;
      }
      l4 = l4 * 16785407L % l2;
      String str2 = paramArrayOfString[i];
      j = zzbi.zzx(str2);
      long l5 = (j + l1) % l2;
      l4 = (l4 + l5) % l2;
      i += 1;
    }
    return l4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */