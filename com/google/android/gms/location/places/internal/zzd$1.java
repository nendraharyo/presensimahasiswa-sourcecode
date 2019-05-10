package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.location.places.zzl.zzc;

class zzd$1
  extends zzl.zzc
{
  zzd$1(zzd paramzzd, Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient, AddPlaceRequest paramAddPlaceRequest)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    zzl localzzl = new com/google/android/gms/location/places/zzl;
    Object localObject = paramzze.getContext();
    localzzl.<init>(this, (Context)localObject);
    localObject = this.zzaQk;
    paramzze.zza(localzzl, (AddPlaceRequest)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */