package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;

public class zzn
  extends zzj
{
  public zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    boolean bool = zzx(paramContext);
    if (!bool) {
      bool = false;
    }
    zzc localzzc;
    for (Object localObject = null;; localObject = localzzc)
    {
      return (zzi)localObject;
      localzzc = new com/google/android/gms/ads/internal/overlay/zzc;
      localObject = new com/google/android/gms/ads/internal/overlay/zzt;
      VersionInfoParcel localVersionInfoParcel = paramzzjp.zzhX();
      String str = paramzzjp.getRequestId();
      ((zzt)localObject).<init>(paramContext, localVersionInfoParcel, str, paramzzcb, paramzzbz);
      localzzc.<init>(paramContext, (zzt)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */