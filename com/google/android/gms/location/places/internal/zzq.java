package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadata;

public class zzq
  extends zzt
  implements PlacePhotoMetadata
{
  private final String zzaQR;
  
  public zzq(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    String str = getString("photo_fife_url");
    this.zzaQR = str;
  }
  
  public CharSequence getAttributions()
  {
    return zzG("photo_attributions", null);
  }
  
  public int getMaxHeight()
  {
    return zzz("photo_max_height", 0);
  }
  
  public int getMaxWidth()
  {
    return zzz("photo_max_width", 0);
  }
  
  public PendingResult getPhoto(GoogleApiClient paramGoogleApiClient)
  {
    int i = getMaxWidth();
    int j = getMaxHeight();
    return getScaledPhoto(paramGoogleApiClient, i, j);
  }
  
  public PendingResult getScaledPhoto(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return zzzz().getScaledPhoto(paramGoogleApiClient, paramInt1, paramInt2);
  }
  
  public PlacePhotoMetadata zzzz()
  {
    zzp localzzp = new com/google/android/gms/location/places/internal/zzp;
    String str = this.zzaQR;
    int i = getMaxWidth();
    int j = getMaxHeight();
    CharSequence localCharSequence = getAttributions();
    int k = this.zzaje;
    localzzp.<init>(str, i, j, localCharSequence, k);
    return localzzp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */