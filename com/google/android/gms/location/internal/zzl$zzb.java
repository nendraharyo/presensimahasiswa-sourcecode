package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.location.LocationStatusCodes;

final class zzl$zzb
  extends zzh.zza
{
  private zza.zzb zzaON;
  
  public zzl$zzb(zza.zzb paramzzb)
  {
    this.zzaON = paramzzb;
  }
  
  private void zzhC(int paramInt)
  {
    Object localObject1 = this.zzaON;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "LocationClientImpl";
      localObject2 = "onRemoveGeofencesResult called multiple times";
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
  
  public void zza(int paramInt, PendingIntent paramPendingIntent)
  {
    zzhC(paramInt);
  }
  
  public void zza(int paramInt, String[] paramArrayOfString)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
  }
  
  public void zzb(int paramInt, String[] paramArrayOfString)
  {
    zzhC(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzl$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */