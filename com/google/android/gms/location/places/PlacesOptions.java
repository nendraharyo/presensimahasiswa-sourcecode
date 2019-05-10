package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public final class PlacesOptions
  implements Api.ApiOptions.Optional
{
  public final String zzaPU;
  public final int zzaPV;
  
  private PlacesOptions(PlacesOptions.Builder paramBuilder)
  {
    String str = PlacesOptions.Builder.zza(paramBuilder);
    this.zzaPU = str;
    int i = PlacesOptions.Builder.zzb(paramBuilder);
    this.zzaPV = i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacesOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */