package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzjp;

class zzc$3
  implements Runnable
{
  zzc$3(zzc paramzzc, zzif.zza paramzza, zzcb paramzzcb) {}
  
  public void run()
  {
    int i = 1;
    zzan localzzan = null;
    Object localObject1 = this.zzps.zzLe;
    boolean bool = ((AdResponseParcel)localObject1).zzIc;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (bool)
    {
      localObject1 = this.zzpr.zzpj.zzrE;
      if (localObject1 != null)
      {
        bool = false;
        localObject1 = null;
        localObject3 = this.zzps.zzLe.zzEF;
        if (localObject3 != null)
        {
          localObject1 = zzr.zzbC();
          localObject3 = this.zzps.zzLe.zzEF;
          localObject1 = ((zzir)localObject1).zzaC((String)localObject3);
        }
        localObject3 = new com/google/android/gms/internal/zzcc;
        localObject4 = this.zzpr;
        localObject5 = this.zzps.zzLe.body;
        ((zzcc)localObject3).<init>((zzg)localObject4, (String)localObject1, (String)localObject5);
        localObject1 = this.zzpr.zzpj;
        ((zzs)localObject1).zzrL = i;
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = this.zzpr;
        localObject4 = null;
        ((zzc)localObject1).zzph = false;
        localObject1 = this.zzpr;
        localObject1 = ((zzc)localObject1).zzpj;
        localObject1 = ((zzs)localObject1).zzrE;
        ((zzcf)localObject1).zza((zzce)localObject3);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Could not call the onCustomRenderedAdLoadedListener.";
        zzin.zzd((String)localObject3, localRemoteException);
        localObject2 = this.zzpr;
        ((zzc)localObject2).zzph = i;
      }
      Object localObject2 = new com/google/android/gms/ads/internal/zze;
      ((zze)localObject2).<init>();
      localObject3 = this.zzpr;
      localObject4 = this.zzps;
      zzjp localzzjp = ((zzc)localObject3).zza((zzif.zza)localObject4, (zze)localObject2);
      localObject3 = new com/google/android/gms/ads/internal/zze$zzb;
      localObject4 = this.zzps;
      ((zze.zzb)localObject3).<init>((zzif.zza)localObject4, localzzjp);
      ((zze)localObject2).zza((zze.zza)localObject3);
      localObject3 = new com/google/android/gms/ads/internal/zzc$3$1;
      ((zzc.3.1)localObject3).<init>(this, (zze)localObject2);
      localzzjp.setOnTouchListener((View.OnTouchListener)localObject3);
      localObject3 = new com/google/android/gms/ads/internal/zzc$3$2;
      ((zzc.3.2)localObject3).<init>(this, (zze)localObject2);
      localzzjp.setOnClickListener((View.OnClickListener)localObject3);
      this.zzpr.zzpj.zzrL = 0;
      zzs localzzs = this.zzpr.zzpj;
      localObject2 = zzr.zzbB();
      localObject3 = this.zzpr.zzpj.context;
      localObject4 = this.zzpr;
      localObject5 = this.zzps;
      localzzan = this.zzpr.zzpj.zzrk;
      zzex localzzex = this.zzpr.zzpn;
      zzc localzzc = this.zzpr;
      zzcb localzzcb = this.zzpt;
      localObject2 = ((zzgr)localObject2).zza((Context)localObject3, (zza)localObject4, (zzif.zza)localObject5, localzzan, localzzjp, localzzex, localzzc, localzzcb);
      localzzs.zzro = ((zzit)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzc$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */