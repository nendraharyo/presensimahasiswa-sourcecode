package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public class zze
  extends zzj
{
  private final PlacesParams zzaQq;
  private final Locale zzaQr;
  
  public zze(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, PlacesOptions paramPlacesOptions)
  {
    super(paramContext, paramLooper, 65, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
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
  
  public void zza(com.google.android.gms.location.places.zzf paramzzf, String paramString)
  {
    zzx.zzb(paramString, "placeId cannot be null");
    zzg localzzg = (zzg)zzqJ();
    PlacesParams localPlacesParams = this.zzaQq;
    localzzg.zza(paramString, localPlacesParams, paramzzf);
  }
  
  public void zza(com.google.android.gms.location.places.zzf paramzzf, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    Object localObject = "fifeUrl cannot be null";
    zzx.zzb(paramString, localObject);
    boolean bool2;
    if (paramInt1 > 0)
    {
      bool2 = bool1;
      String str = "width should be > 0";
      zzx.zzb(bool2, str);
      if (paramInt1 <= 0) {
        break label85;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "height should be > 0");
      localObject = (zzg)zzqJ();
      PlacesParams localPlacesParams = this.zzaQq;
      ((zzg)localObject).zza(paramString, paramInt1, paramInt2, paramInt3, localPlacesParams, paramzzf);
      return;
      bool2 = false;
      localObject = null;
      break;
      label85:
      bool1 = false;
    }
  }
  
  public void zza(zzl paramzzl, AddPlaceRequest paramAddPlaceRequest)
  {
    zzx.zzb(paramAddPlaceRequest, "userAddedPlace == null");
    zzg localzzg = (zzg)zzqJ();
    PlacesParams localPlacesParams = this.zzaQq;
    localzzg.zza(paramAddPlaceRequest, localPlacesParams, paramzzl);
  }
  
  public void zza(zzl paramzzl, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    Object localObject = "callback == null";
    zzx.zzb(paramzzl, localObject);
    if (paramString == null) {}
    for (String str = "";; str = paramString)
    {
      if (paramAutocompleteFilter == null) {
        localObject = null;
      }
      for (AutocompleteFilter localAutocompleteFilter = AutocompleteFilter.create(null);; localAutocompleteFilter = paramAutocompleteFilter)
      {
        localObject = (zzg)zzqJ();
        PlacesParams localPlacesParams = this.zzaQq;
        ((zzg)localObject).zza(str, paramLatLngBounds, localAutocompleteFilter, localPlacesParams, paramzzl);
        return;
      }
    }
  }
  
  public void zza(zzl paramzzl, List paramList)
  {
    zzg localzzg = (zzg)zzqJ();
    PlacesParams localPlacesParams = this.zzaQq;
    localzzg.zzb(paramList, localPlacesParams, paramzzl);
  }
  
  protected zzg zzcl(IBinder paramIBinder)
  {
    return zzg.zza.zzcn(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.location.places.GeoDataApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlacesService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */