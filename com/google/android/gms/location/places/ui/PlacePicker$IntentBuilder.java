package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.LatLngBounds;

public class PlacePicker$IntentBuilder
  extends zza.zza
{
  public PlacePicker$IntentBuilder()
  {
    super("com.google.android.gms.location.places.ui.PICK_PLACE");
    Intent localIntent = this.mIntent;
    int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    localIntent.putExtra("gmscore_client_jar_version", i);
  }
  
  public Intent build(Activity paramActivity)
  {
    return super.build(paramActivity);
  }
  
  public IntentBuilder setLatLngBounds(LatLngBounds paramLatLngBounds)
  {
    zzx.zzz(paramLatLngBounds);
    Intent localIntent = this.mIntent;
    zzc.zza(paramLatLngBounds, localIntent, "latlng_bounds");
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\PlacePicker$IntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */