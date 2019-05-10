package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.wearable.internal.zzbp;

final class Wearable$1
  extends Api.zza
{
  public zzbp zza(Context paramContext, Looper paramLooper, zzf paramzzf, Wearable.WearableOptions paramWearableOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramWearableOptions != null) {}
    for (;;)
    {
      Object localObject1 = new com/google/android/gms/wearable/internal/zzbp;
      Object localObject2 = paramContext;
      ((zzbp)localObject1).<init>(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
      return (zzbp)localObject1;
      localObject1 = new com/google/android/gms/wearable/Wearable$WearableOptions;
      localObject2 = new com/google/android/gms/wearable/Wearable$WearableOptions$Builder;
      ((Wearable.WearableOptions.Builder)localObject2).<init>();
      ((Wearable.WearableOptions)localObject1).<init>((Wearable.WearableOptions.Builder)localObject2, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\Wearable$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */