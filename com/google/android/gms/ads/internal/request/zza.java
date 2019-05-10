package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzim;

public class zza
{
  public zzim zza(Context paramContext, AdRequestInfoParcel.zza paramzza, zzan paramzzan, zza.zza paramzza1)
  {
    Object localObject = paramzza.zzHt.extras;
    String str = "sdk_less_server_data";
    localObject = ((Bundle)localObject).getBundle(str);
    if (localObject != null)
    {
      localObject = new com/google/android/gms/ads/internal/request/zzm;
      ((zzm)localObject).<init>(paramContext, paramzza, paramzza1);
    }
    for (;;)
    {
      ((zzim)localObject).zzhn();
      return (zzim)localObject;
      localObject = new com/google/android/gms/ads/internal/request/zzb;
      ((zzb)localObject).<init>(paramContext, paramzza, paramzzan, paramzza1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */