package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zzd;

public class PlacePicker
  extends zza
{
  public static final int RESULT_ERROR = 2;
  
  public static String getAttributions(Intent paramIntent)
  {
    return paramIntent.getStringExtra("third_party_attributions");
  }
  
  public static LatLngBounds getLatLngBounds(Intent paramIntent)
  {
    zzd localzzd = LatLngBounds.CREATOR;
    return (LatLngBounds)zzc.zza(paramIntent, "final_latlng_bounds", localzzd);
  }
  
  public static Place getPlace(Context paramContext, Intent paramIntent)
  {
    return zza.getPlace(paramContext, paramIntent);
  }
  
  public static Place getPlace(Intent paramIntent, Context paramContext)
  {
    return zza.getPlace(paramContext, paramIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\PlacePicker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */