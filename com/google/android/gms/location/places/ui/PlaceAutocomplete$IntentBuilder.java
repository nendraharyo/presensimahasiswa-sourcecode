package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;

public class PlaceAutocomplete$IntentBuilder
  extends zza.zza
{
  public PlaceAutocomplete$IntentBuilder(int paramInt)
  {
    super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
    Intent localIntent = this.mIntent;
    int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    localIntent.putExtra("gmscore_client_jar_version", i);
    this.mIntent.putExtra("mode", paramInt);
    this.mIntent.putExtra("origin", 2);
  }
  
  public Intent build(Activity paramActivity)
  {
    return super.build(paramActivity);
  }
  
  public IntentBuilder setBoundsBias(LatLngBounds paramLatLngBounds)
  {
    Intent localIntent;
    String str;
    if (paramLatLngBounds != null)
    {
      localIntent = this.mIntent;
      str = "bounds";
      localIntent.putExtra(str, paramLatLngBounds);
    }
    for (;;)
    {
      return this;
      localIntent = this.mIntent;
      str = "bounds";
      localIntent.removeExtra(str);
    }
  }
  
  public IntentBuilder setFilter(AutocompleteFilter paramAutocompleteFilter)
  {
    Intent localIntent;
    String str;
    if (paramAutocompleteFilter != null)
    {
      localIntent = this.mIntent;
      str = "filter";
      localIntent.putExtra(str, paramAutocompleteFilter);
    }
    for (;;)
    {
      return this;
      localIntent = this.mIntent;
      str = "filter";
      localIntent.removeExtra(str);
    }
  }
  
  public IntentBuilder zzeq(String paramString)
  {
    Intent localIntent;
    String str;
    if (paramString != null)
    {
      localIntent = this.mIntent;
      str = "initial_query";
      localIntent.putExtra(str, paramString);
    }
    for (;;)
    {
      return this;
      localIntent = this.mIntent;
      str = "initial_query";
      localIntent.removeExtra(str);
    }
  }
  
  public IntentBuilder zzig(int paramInt)
  {
    this.mIntent.putExtra("origin", paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\PlaceAutocomplete$IntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */