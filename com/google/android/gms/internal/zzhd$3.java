package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;

final class zzhd$3
  implements Runnable
{
  zzhd$3(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzhf paramzzhf, zzcb paramzzcb, zzbz paramzzbz, String paramString, zzbm paramzzbm) {}
  
  public void run()
  {
    boolean bool1 = true;
    zzcb localzzcb = null;
    Object localObject1 = zzr.zzbD();
    Object localObject2 = this.zzxh;
    Object localObject3 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    ((AdSizeParcel)localObject3).<init>();
    VersionInfoParcel localVersionInfoParcel = this.zzIV.zzrl;
    Object localObject4 = null;
    localObject1 = ((zzjr)localObject1).zza((Context)localObject2, (AdSizeParcel)localObject3, false, false, null, localVersionInfoParcel);
    localObject2 = zzr.zzbF();
    boolean bool2 = ((zzih)localObject2).zzhi();
    if (bool2) {
      ((zzjp)localObject1).clearCache(bool1);
    }
    ((zzjp)localObject1).getWebView().setWillNotDraw(bool1);
    this.zzIY.zzh((zzjp)localObject1);
    localObject2 = this.zzpt;
    localObject3 = this.zzIZ;
    localObject4 = new String[bool1];
    localObject4[0] = "rwc";
    ((zzcb)localObject2).zza((zzbz)localObject3, (String[])localObject4);
    localObject2 = this.zzpt.zzdB();
    localObject3 = this.zzJa;
    localzzcb = this.zzpt;
    localObject2 = zzhd.zzb((String)localObject3, localzzcb, (zzbz)localObject2);
    localObject3 = ((zzjp)localObject1).zzhU();
    localObject4 = this.zzIY.zzJk;
    ((zzjq)localObject3).zza("/invalidRequest", (zzdf)localObject4);
    localObject4 = this.zzIY.zzJl;
    ((zzjq)localObject3).zza("/loadAdURL", (zzdf)localObject4);
    localObject4 = zzde.zzzf;
    ((zzjq)localObject3).zza("/log", (zzdf)localObject4);
    ((zzjq)localObject3).zza((zzjq.zza)localObject2);
    zzin.zzaI("Loading the JS library.");
    localObject2 = this.zzJd.zzdp();
    ((zzjp)localObject1).loadUrl((String)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhd$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */