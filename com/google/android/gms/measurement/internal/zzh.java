package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.Set;

public class zzh
{
  final String mName;
  final String zzaUa;
  final String zzaVM;
  final long zzaVN;
  final EventParams zzaVO;
  final long zzaez;
  
  zzh(zzw paramzzw, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    this.zzaUa = paramString2;
    this.mName = paramString3;
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {
      paramString1 = null;
    }
    this.zzaVM = paramString1;
    this.zzaez = paramLong1;
    this.zzaVN = paramLong2;
    long l1 = this.zzaVN;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = this.zzaVN;
      l2 = this.zzaez;
      bool = l1 < l2;
      if (bool)
      {
        localObject = paramzzw.zzAo().zzCF();
        String str = "Event created with reverse previous/current timestamps";
        ((zzp.zza)localObject).zzfg(str);
      }
    }
    Object localObject = zza(paramzzw, paramBundle);
    this.zzaVO = ((EventParams)localObject);
  }
  
  private zzh(zzw paramzzw, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, EventParams paramEventParams)
  {
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    zzx.zzz(paramEventParams);
    this.zzaUa = paramString2;
    this.mName = paramString3;
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {
      paramString1 = null;
    }
    this.zzaVM = paramString1;
    this.zzaez = paramLong1;
    this.zzaVN = paramLong2;
    long l1 = this.zzaVN;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = this.zzaVN;
      l2 = this.zzaez;
      bool = l1 < l2;
      if (bool)
      {
        zzp.zza localzza = paramzzw.zzAo().zzCF();
        String str = "Event created with reverse previous/current timestamps";
        localzza.zzfg(str);
      }
    }
    this.zzaVO = paramEventParams;
  }
  
  private EventParams zza(zzw paramzzw, Bundle paramBundle)
  {
    Bundle localBundle;
    Object localObject1;
    if (paramBundle != null)
    {
      boolean bool = paramBundle.isEmpty();
      if (!bool)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>(paramBundle);
        localObject1 = localBundle.keySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (String)localIterator.next();
          if (localObject1 == null)
          {
            localIterator.remove();
          }
          else
          {
            Object localObject2 = paramzzw.zzCk();
            Object localObject3 = localBundle.get((String)localObject1);
            localObject2 = ((zzaj)localObject2).zzk((String)localObject1, localObject3);
            if (localObject2 == null)
            {
              localIterator.remove();
            }
            else
            {
              localObject3 = paramzzw.zzCk();
              ((zzaj)localObject3).zza(localBundle, (String)localObject1, localObject2);
            }
          }
        }
        localObject1 = new com/google/android/gms/measurement/internal/EventParams;
        ((EventParams)localObject1).<init>(localBundle);
      }
    }
    for (;;)
    {
      return (EventParams)localObject1;
      localObject1 = new com/google/android/gms/measurement/internal/EventParams;
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      ((EventParams)localObject1).<init>(localBundle);
    }
  }
  
  public String toString()
  {
    char c = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Event{appId='");
    Object localObject = this.zzaUa;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c).append(", name='");
    localObject = this.mName;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c).append(", params=");
    localObject = this.zzaVO;
    return localObject + '}';
  }
  
  zzh zza(zzw paramzzw, long paramLong)
  {
    zzh localzzh = new com/google/android/gms/measurement/internal/zzh;
    String str1 = this.zzaVM;
    String str2 = this.zzaUa;
    String str3 = this.mName;
    long l = this.zzaez;
    EventParams localEventParams = this.zzaVO;
    localzzh.<init>(paramzzw, str1, str2, str3, l, paramLong, localEventParams);
    return localzzh;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */