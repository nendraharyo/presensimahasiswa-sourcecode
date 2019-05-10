package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.location.LocationStatusCodes;

final class zzl$zza
  extends zzh.zza
{
  private zza.zzb zzaON;
  
  public zzl$zza(zza.zzb paramzzb)
  {
    this.zzaON = paramzzb;
  }
  
  public void zza(int paramInt, PendingIntent paramPendingIntent)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
  }
  
  public void zza(int paramInt, String[] paramArrayOfString)
  {
    Object localObject1 = this.zzaON;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "LocationClientImpl";
      localObject2 = "onAddGeofenceResult called multiple times";
      Log.wtf((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = LocationStatusCodes.zzhz(LocationStatusCodes.zzhy(paramInt));
      localObject2 = this.zzaON;
      ((zza.zzb)localObject2).zzs(localObject1);
      localObject1 = null;
      this.zzaON = null;
    }
  }
  
  public void zzb(int paramInt, String[] paramArrayOfString)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */