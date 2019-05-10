package com.google.android.gms.ads.internal;

import android.support.v4.h.m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import java.lang.ref.WeakReference;
import java.util.List;

class zzi$1
  implements Runnable
{
  zzi$1(zzi paramzzi, AdRequestParcel paramAdRequestParcel) {}
  
  public void run()
  {
    Object localObject1 = this.zzpX;
    synchronized (zzi.zza((zzi)localObject1))
    {
      localObject1 = this.zzpX;
      localObject1 = ((zzi)localObject1).zzbm();
      Object localObject4 = this.zzpX;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(localObject1);
      zzi.zza((zzi)localObject4, localWeakReference);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzb((zzi)localObject4);
      ((zzp)localObject1).zzb((zzcr)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzc((zzi)localObject4);
      ((zzp)localObject1).zzb((zzcs)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzd((zzi)localObject4);
      ((zzp)localObject1).zza((m)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zze((zzi)localObject4);
      ((zzp)localObject1).zza((zzq)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzf((zzi)localObject4);
      ((zzp)localObject1).zzb((m)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzg((zzi)localObject4);
      ((zzp)localObject1).zza((List)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzh((zzi)localObject4);
      ((zzp)localObject1).zzb((NativeAdOptionsParcel)localObject4);
      localObject4 = this.zzpX;
      localObject4 = zzi.zzi((zzi)localObject4);
      ((zzp)localObject1).zza((zzx)localObject4);
      localObject4 = this.zzpW;
      ((zzp)localObject1).zzb((AdRequestParcel)localObject4);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzi$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */