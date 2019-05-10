package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.zzk;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class zzdw
{
  private final List zzpH;
  
  zzdw()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    this.zzpH = localLinkedList;
  }
  
  void zza(zzdx paramzzdx)
  {
    Handler localHandler = zzir.zzMc;
    Object localObject = this.zzpH;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzdw.zza)localIterator.next();
      zzdw.7 local7 = new com/google/android/gms/internal/zzdw$7;
      local7.<init>(this, (zzdw.zza)localObject, paramzzdx);
      localHandler.post(local7);
    }
  }
  
  void zzc(zzk paramzzk)
  {
    Object localObject = new com/google/android/gms/internal/zzdw$1;
    ((zzdw.1)localObject).<init>(this);
    paramzzk.zza((zzq)localObject);
    localObject = new com/google/android/gms/internal/zzdw$2;
    ((zzdw.2)localObject).<init>(this);
    paramzzk.zza((zzw)localObject);
    localObject = new com/google/android/gms/internal/zzdw$3;
    ((zzdw.3)localObject).<init>(this);
    paramzzk.zza((zzgd)localObject);
    localObject = new com/google/android/gms/internal/zzdw$4;
    ((zzdw.4)localObject).<init>(this);
    paramzzk.zza((zzcf)localObject);
    localObject = new com/google/android/gms/internal/zzdw$5;
    ((zzdw.5)localObject).<init>(this);
    paramzzk.zza((zzp)localObject);
    localObject = new com/google/android/gms/internal/zzdw$6;
    ((zzdw.6)localObject).<init>(this);
    paramzzk.zza((zzd)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */