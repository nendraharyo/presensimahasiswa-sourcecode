package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzaf
  extends zzd
{
  private static String zzSW = "3";
  private static String zzSX = "01VDIWEA?";
  private static zzaf zzSY;
  
  public zzaf(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public static zzaf zzlx()
  {
    return zzSY;
  }
  
  public void zza(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = (String)zzy.zzRL.get();
    boolean bool = Log.isLoggable(str1, paramInt);
    if (bool)
    {
      String str2 = zzc(paramString, paramObject1, paramObject2, paramObject3);
      Log.println(paramInt, str1, str2);
    }
    int i = 5;
    if (paramInt >= i) {
      zzb(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public void zza(zzab paramzzab, String paramString)
  {
    if (paramString == null) {
      paramString = "no reason provided";
    }
    if (paramzzab != null) {}
    for (String str = paramzzab.toString();; str = "no hit data")
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Discarding hit. " + paramString;
      zzd((String)localObject, str);
      return;
    }
  }
  
  public void zzb(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 1024;
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        zzx.zzz(paramString);
        if (paramInt >= 0) {
          break label356;
        }
        Object localObject3 = zzSX;
        int m = ((String)localObject3).length();
        if (j >= m)
        {
          localObject1 = zzSX;
          j = ((String)localObject1).length() + -1;
          m = j;
          localObject1 = zzjn();
          boolean bool1 = ((zzr)localObject1).zzks();
          if (bool1)
          {
            localObject1 = zzjn();
            bool1 = ((zzr)localObject1).zzkr();
            if (bool1)
            {
              c = 'P';
              Object localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              String str = zzSW;
              localObject4 = ((StringBuilder)localObject4).append(str);
              str = zzSX;
              m = str.charAt(m);
              localObject3 = ((StringBuilder)localObject4).append(m);
              localObject1 = ((StringBuilder)localObject3).append(c);
              localObject3 = zze.VERSION;
              localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
              localObject3 = ":";
              localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
              localObject3 = zzl(paramObject1);
              localObject4 = zzl(paramObject2);
              str = zzl(paramObject3);
              localObject3 = zzc(paramString, localObject3, localObject4, str);
              localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
              localObject1 = ((StringBuilder)localObject1).toString();
              n = ((String)localObject1).length();
              if (n > i)
              {
                n = 0;
                localObject3 = null;
                int i1 = 1024;
                localObject1 = ((String)localObject1).substring(0, i1);
              }
              localObject3 = zzji();
              localObject3 = ((zzf)localObject3).zzjA();
              if (localObject3 != null)
              {
                localObject3 = ((zzai)localObject3).zzlK();
                ((zzai.zza)localObject3).zzbq((String)localObject1);
              }
              return;
            }
            char c = 'C';
            continue;
          }
          localObject1 = zzjn();
          boolean bool2 = ((zzr)localObject1).zzkr();
          if (bool2)
          {
            k = 112;
            continue;
          }
          k = 99;
          continue;
        }
        int n = k;
      }
      finally {}
      continue;
      label356:
      int k = paramInt;
    }
  }
  
  public void zzh(Map paramMap, String paramString)
  {
    if (paramString == null) {
      paramString = "no reason provided";
    }
    StringBuilder localStringBuilder;
    Object localObject2;
    if (paramMap != null)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        int i = localStringBuilder.length();
        if (i > 0)
        {
          i = 44;
          localStringBuilder.append(i);
        }
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localStringBuilder.append((String)localObject2);
        char c = '=';
        localStringBuilder.append(c);
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        localStringBuilder.append((String)localObject1);
      }
    }
    for (Object localObject1 = localStringBuilder.toString();; localObject1 = "no hit data")
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Discarding hit. " + paramString;
      zzd((String)localObject2, localObject1);
      return;
    }
  }
  
  protected void zziJ()
  {
    synchronized (zzaf.class)
    {
      zzSY = this;
      return;
    }
  }
  
  protected String zzl(Object paramObject)
  {
    double d1 = 10.0D;
    Object localObject1;
    if (paramObject == null)
    {
      bool1 = false;
      localObject1 = null;
      return (String)localObject1;
    }
    boolean bool1 = paramObject instanceof Integer;
    Object localObject2;
    long l1;
    if (bool1)
    {
      localObject2 = new java/lang/Long;
      paramObject = (Integer)paramObject;
      int i = ((Integer)paramObject).intValue();
      l1 = i;
      ((Long)localObject2).<init>(l1);
    }
    for (;;)
    {
      boolean bool2 = localObject2 instanceof Long;
      if (bool2)
      {
        localObject1 = localObject2;
        localObject1 = (Long)localObject2;
        l1 = Math.abs(((Long)localObject1).longValue());
        long l2 = 100;
        double d2 = 4.94E-322D;
        bool2 = l1 < l2;
        if (bool2)
        {
          localObject1 = String.valueOf(localObject2);
          break;
        }
        localObject1 = String.valueOf(localObject2);
        StringBuilder localStringBuilder = null;
        int j = ((String)localObject1).charAt(0);
        int k = 45;
        if (j == k) {}
        for (localObject1 = "-";; localObject1 = "")
        {
          l1 = Math.abs(((Long)localObject2).longValue());
          localObject2 = String.valueOf(l1);
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append((String)localObject1);
          int m = ((String)localObject2).length() + -1;
          d2 = m;
          l2 = Math.round(Math.pow(d1, d2));
          localStringBuilder.append(l2);
          String str = "...";
          localStringBuilder.append(str);
          localStringBuilder.append((String)localObject1);
          j = ((String)localObject2).length();
          double d3 = j;
          d3 = Math.pow(d1, d3);
          l2 = 4607182418800017408L;
          d2 = 1.0D;
          d3 -= d2;
          long l3 = Math.round(d3);
          localStringBuilder.append(l3);
          localObject1 = localStringBuilder.toString();
          break;
        }
      }
      boolean bool3 = localObject2 instanceof Boolean;
      if (bool3)
      {
        localObject1 = String.valueOf(localObject2);
        break;
      }
      bool3 = localObject2 instanceof Throwable;
      if (bool3)
      {
        localObject1 = localObject2.getClass().getCanonicalName();
        break;
      }
      localObject1 = "-";
      break;
      localObject2 = paramObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzaf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */