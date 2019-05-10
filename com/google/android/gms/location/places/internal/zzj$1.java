package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.location.places.zzl.zzd;

class zzj$1
  extends zzl.zzd
{
  zzj$1(zzj paramzzj, Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient, PlaceFilter paramPlaceFilter)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zzk paramzzk)
  {
    zzl localzzl = new com/google/android/gms/location/places/zzl;
    Object localObject = paramzzk.getContext();
    localzzl.<init>(this, (Context)localObject);
    localObject = this.zzaQt;
    paramzzk.zza(localzzl, (PlaceFilter)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzj$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */