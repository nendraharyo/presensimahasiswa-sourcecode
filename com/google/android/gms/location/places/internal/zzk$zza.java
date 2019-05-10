package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.PlacesOptions.Builder;

public class zzk$zza
  extends Api.zza
{
  private final String zzaQs;
  
  public zzk$zza(String paramString)
  {
    this.zzaQs = paramString;
  }
  
  public zzk zzb(Context paramContext, Looper paramLooper, zzf paramzzf, PlacesOptions paramPlacesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Object localObject = this.zzaQs;
    String str;
    if (localObject != null)
    {
      str = this.zzaQs;
      if (paramPlacesOptions != null) {
        break label72;
      }
      localObject = new com/google/android/gms/location/places/PlacesOptions$Builder;
      ((PlacesOptions.Builder)localObject).<init>();
    }
    label72:
    for (PlacesOptions localPlacesOptions = ((PlacesOptions.Builder)localObject).build();; localPlacesOptions = paramPlacesOptions)
    {
      localObject = new com/google/android/gms/location/places/internal/zzk;
      ((zzk)localObject).<init>(paramContext, paramLooper, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener, str, localPlacesOptions);
      return (zzk)localObject;
      str = paramContext.getPackageName();
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */