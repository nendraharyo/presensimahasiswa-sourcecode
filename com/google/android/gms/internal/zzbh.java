package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public class zzbh
{
  private final int zztp;
  private final int zztq;
  private final int zztr;
  private final zzbg zzts;
  
  public zzbh(int paramInt)
  {
    zzbj localzzbj = new com/google/android/gms/internal/zzbj;
    localzzbj.<init>();
    this.zzts = localzzbj;
    this.zztq = paramInt;
    this.zztp = 6;
    this.zztr = 0;
  }
  
  private String zzv(String paramString)
  {
    Object localObject1 = "\n";
    Object localObject2 = paramString.split((String)localObject1);
    int i = localObject2.length;
    if (i == 0) {}
    zzbh.zza localzza;
    String str1;
    for (localObject1 = "";; str1 = localzza.toString())
    {
      return (String)localObject1;
      localzza = zzcM();
      localObject1 = new com/google/android/gms/internal/zzbh$1;
      ((zzbh.1)localObject1).<init>(this);
      Arrays.sort((Object[])localObject2, (Comparator)localObject1);
      i = 0;
      localObject1 = null;
      int j = localObject2.length;
      if (i < j)
      {
        j = this.zztq;
        if (i < j)
        {
          Object localObject3 = localObject2[i].trim();
          j = ((String)localObject3).length();
          if (j == 0) {}
          for (;;)
          {
            i += 1;
            break;
            try
            {
              localObject3 = this.zzts;
              String str2 = localObject2[i];
              localObject3 = ((zzbg)localObject3).zzu(str2);
              localzza.write((byte[])localObject3);
            }
            catch (IOException localIOException)
            {
              localObject2 = "Error while writing hash to byteStream";
              zzin.zzb((String)localObject2, localIOException);
            }
          }
        }
      }
    }
  }
  
  public String zza(ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Iterator localIterator = paramArrayList.iterator();
    String str;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      str = (String)localIterator.next();
      Locale localLocale = Locale.US;
      str = str.toLowerCase(localLocale);
      localStringBuffer.append(str);
      char c = '\n';
      localStringBuffer.append(c);
    }
    int i = this.zztr;
    switch (i)
    {
    default: 
      str = "";
    }
    for (;;)
    {
      return str;
      str = localStringBuffer.toString();
      str = zzw(str);
      continue;
      str = localStringBuffer.toString();
      str = zzv(str);
    }
  }
  
  zzbh.zza zzcM()
  {
    zzbh.zza localzza = new com/google/android/gms/internal/zzbh$zza;
    localzza.<init>();
    return localzza;
  }
  
  String zzw(String paramString)
  {
    Object localObject1 = "\n";
    Object localObject2 = paramString.split((String)localObject1);
    int i = localObject2.length;
    if (i == 0) {}
    zzbh.zza localzza;
    String str;
    for (localObject1 = "";; str = localzza.toString())
    {
      return (String)localObject1;
      localzza = zzcM();
      Object localObject3 = new java/util/PriorityQueue;
      i = this.zztq;
      Object localObject4 = new com/google/android/gms/internal/zzbh$2;
      ((zzbh.2)localObject4).<init>(this);
      ((PriorityQueue)localObject3).<init>(i, (Comparator)localObject4);
      i = 0;
      localObject1 = null;
      int j = localObject2.length;
      if (i < j)
      {
        localObject4 = zzbi.zzy(localObject2[i]);
        int k = localObject4.length;
        if (k == 0) {}
        for (;;)
        {
          i += 1;
          break;
          k = this.zztq;
          int m = this.zztp;
          zzbk.zza((String[])localObject4, k, m, (PriorityQueue)localObject3);
        }
      }
      localObject2 = ((PriorityQueue)localObject3).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (bool)
        {
          localObject1 = (zzbk.zza)((Iterator)localObject2).next();
          try
          {
            localObject3 = this.zzts;
            localObject1 = ((zzbk.zza)localObject1).zztx;
            localObject1 = ((zzbg)localObject3).zzu((String)localObject1);
            localzza.write((byte[])localObject1);
          }
          catch (IOException localIOException)
          {
            localObject2 = "Error while writing hash to byteStream";
            zzin.zzb((String)localObject2, localIOException);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */