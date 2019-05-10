package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import java.util.Locale;

public class zzk
  extends zzj
{
  private final PlacesParams zzaQq;
  private final Locale zzaQr;
  
  public zzk(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, PlacesOptions paramPlacesOptions)
  {
    super(paramContext, paramLooper, 67, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject1 = Locale.getDefault();
    this.zzaQr = ((Locale)localObject1);
    String str = null;
    localObject1 = paramzzf.getAccount();
    if (localObject1 != null)
    {
      localObject1 = paramzzf.getAccount();
      str = ((Account)localObject1).name;
    }
    localObject1 = new com/google/android/gms/location/places/internal/PlacesParams;
    localObject2 = this.zzaQr;
    localObject3 = paramPlacesOptions.zzaPU;
    int i = paramPlacesOptions.zzaPV;
    ((PlacesParams)localObject1).<init>(paramString, (Locale)localObject2, str, (String)localObject3, i);
    this.zzaQq = ((PlacesParams)localObject1);
  }
  
  public void zza(zzl paramzzl, PlaceFilter paramPlaceFilter)
  {
    if (paramPlaceFilter == null) {
      paramPlaceFilter = PlaceFilter.zzzd();
    }
    zzf localzzf = (zzf)zzqJ();
    PlacesParams localPlacesParams = this.zzaQq;
    localzzf.zza(paramPlaceFilter, localPlacesParams, paramzzl);
  }
  
  public void zza(zzl paramzzl, PlaceReport paramPlaceReport)
  {
    zzx.zzz(paramPlaceReport);
    zzf localzzf = (zzf)zzqJ();
    PlacesParams localPlacesParams = this.zzaQq;
    localzzf.zza(paramPlaceReport, localPlacesParams, paramzzl);
  }
  
  protected zzf zzcq(IBinder paramIBinder)
  {
    return zzf.zza.zzcm(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.location.places.PlaceDetectionApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */