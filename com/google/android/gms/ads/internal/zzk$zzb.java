package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

class zzk$zzb
  extends zzim
{
  private final String zzqg;
  private final Bitmap zzqi;
  
  public zzk$zzb(zzk paramzzk, Bitmap paramBitmap, String paramString)
  {
    this.zzqi = paramBitmap;
    this.zzqg = paramString;
  }
  
  public void onStop() {}
  
  public void zzbr()
  {
    Object localObject1 = this.zzqh.zzpj;
    boolean bool1 = ((zzs)localObject1).zzql;
    Object localObject2;
    Object localObject3;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    if (bool1)
    {
      localObject1 = zzr.zzbC();
      localObject2 = this.zzqh.zzpj.context;
      localObject3 = this.zzqi;
      localObject4 = this.zzqg;
      bool1 = ((zzir)localObject1).zza((Context)localObject2, (Bitmap)localObject3, (String)localObject4);
      bool2 = bool1;
      localObject1 = new com/google/android/gms/ads/internal/InterstitialAdParameterParcel;
      localObject2 = this.zzqh.zzpj;
      bool3 = ((zzs)localObject2).zzql;
      localObject3 = this.zzqh;
      bool4 = ((zzk)localObject3).zzbo();
      if (!bool2) {
        break label308;
      }
    }
    for (Object localObject4 = this.zzqg;; localObject4 = null)
    {
      zzk localzzk = this.zzqh;
      boolean bool5 = zzk.zza(localzzk);
      Object localObject5 = this.zzqh;
      float f = zzk.zzb((zzk)localObject5);
      ((InterstitialAdParameterParcel)localObject1).<init>(bool3, bool4, (String)localObject4, bool5, f);
      localObject2 = this.zzqh.zzpj.zzrq.zzED;
      int j = ((zzjp)localObject2).getRequestedOrientation();
      int i = -1;
      if (j == i)
      {
        localObject2 = this.zzqh.zzpj.zzrq;
        j = ((zzif)localObject2).orientation;
      }
      localObject2 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
      localObject3 = this.zzqh;
      localObject4 = this.zzqh;
      localzzk = this.zzqh;
      localObject5 = this.zzqh.zzpj.zzrq.zzED;
      VersionInfoParcel localVersionInfoParcel = this.zzqh.zzpj.zzrl;
      String str = this.zzqh.zzpj.zzrq.zzHY;
      ((AdOverlayInfoParcel)localObject2).<init>((zza)localObject3, (zzg)localObject4, localzzk, (zzjp)localObject5, j, localVersionInfoParcel, str, (InterstitialAdParameterParcel)localObject1);
      localObject1 = zzir.zzMc;
      localObject3 = new com/google/android/gms/ads/internal/zzk$zzb$1;
      ((zzk.zzb.1)localObject3).<init>(this, (AdOverlayInfoParcel)localObject2);
      ((Handler)localObject1).post((Runnable)localObject3);
      return;
      bool1 = false;
      localObject1 = null;
      bool2 = false;
      localObject4 = null;
      break;
      label308:
      bool2 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzk$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */