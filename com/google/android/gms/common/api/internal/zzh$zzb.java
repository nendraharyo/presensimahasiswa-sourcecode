package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzrn;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzh$zzb
  extends zzh.zzf
{
  private final Map zzahE;
  
  public zzh$zzb(zzh paramzzh, Map paramMap)
  {
    super(paramzzh, null);
    this.zzahE = paramMap;
  }
  
  public void zzpt()
  {
    Object localObject1 = zzh.zzb(this.zzahC);
    Object localObject2 = zzh.zza(this.zzahC);
    int i = ((zzc)localObject1).isGooglePlayServicesAvailable((Context)localObject2);
    if (i != 0)
    {
      localObject2 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject2).<init>(i, null);
      localObject1 = zzh.zzd(this.zzahC);
      localObject3 = new com/google/android/gms/common/api/internal/zzh$zzb$1;
      zzh localzzh = this.zzahC;
      ((zzh.zzb.1)localObject3).<init>(this, localzzh, (ConnectionResult)localObject2);
      ((zzl)localObject1).zza((zzl.zza)localObject3);
      return;
    }
    localObject1 = this.zzahC;
    boolean bool = zzh.zze((zzh)localObject1);
    if (bool)
    {
      localObject1 = zzh.zzf(this.zzahC);
      ((zzrn)localObject1).connect();
    }
    localObject1 = this.zzahE.keySet();
    Object localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Api.zzb)((Iterator)localObject3).next();
      localObject2 = (GoogleApiClient.zza)this.zzahE.get(localObject1);
      ((Api.zzb)localObject1).zza((GoogleApiClient.zza)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */