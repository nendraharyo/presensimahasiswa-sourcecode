package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;

public final class zzc
{
  public static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    zzc.1 local1 = new com/google/android/gms/ads/internal/request/zzc$1;
    local1.<init>(paramContext);
    return zza(paramContext, paramVersionInfoParcel, paramzzji, paramzza, local1);
  }
  
  static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza, zzc.zzb paramzzb)
  {
    boolean bool = paramzzb.zza(paramVersionInfoParcel);
    if (bool) {}
    for (zzit localzzit = zza(paramContext, paramzzji, paramzza);; localzzit = zzb(paramContext, paramVersionInfoParcel, paramzzji, paramzza)) {
      return localzzit;
    }
  }
  
  private static zzit zza(Context paramContext, zzji paramzzji, zzc.zza paramzza)
  {
    zzin.zzaI("Fetching ad response from local ad request service.");
    zzd.zza localzza = new com/google/android/gms/ads/internal/request/zzd$zza;
    localzza.<init>(paramContext, paramzzji, paramzza);
    localzza.zzga();
    return localzza;
  }
  
  private static zzit zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    zzin.zzaI("Fetching ad response from remote ad request service.");
    Object localObject = zzn.zzcS();
    boolean bool = ((zza)localObject).zzU(paramContext);
    if (!bool)
    {
      zzin.zzaK("Failed to connect to remote ad request service.");
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (zzit)localObject;
      localObject = new com/google/android/gms/ads/internal/request/zzd$zzb;
      ((zzd.zzb)localObject).<init>(paramContext, paramVersionInfoParcel, paramzzji, paramzza);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */