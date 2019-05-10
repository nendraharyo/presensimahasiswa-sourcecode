package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.location.places.zzl.zzc;
import java.util.Arrays;
import java.util.List;

class zzd$2
  extends zzl.zzc
{
  zzd$2(zzd paramzzd, Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient, String[] paramArrayOfString)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    List localList = Arrays.asList(this.zzaQm);
    zzl localzzl = new com/google/android/gms/location/places/zzl;
    Context localContext = paramzze.getContext();
    localzzl.<init>(this, localContext);
    paramzze.zza(localzzl, localList);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */