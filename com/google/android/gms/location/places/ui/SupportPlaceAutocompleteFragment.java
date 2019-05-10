package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLngBounds;

public class SupportPlaceAutocompleteFragment
  extends Fragment
{
  private View zzaRh;
  private View zzaRi;
  private EditText zzaRj;
  private LatLngBounds zzaRk;
  private AutocompleteFilter zzaRl;
  private PlaceSelectionListener zzaRm;
  
  private void zzzF()
  {
    int i = 0;
    String str = this.zzaRj.getText().toString();
    boolean bool = str.isEmpty();
    View localView;
    if (!bool)
    {
      bool = true;
      localView = this.zzaRi;
      if (!bool) {
        break label48;
      }
    }
    for (;;)
    {
      localView.setVisibility(i);
      return;
      bool = false;
      str = null;
      break;
      label48:
      i = 8;
    }
  }
  
  private void zzzG()
  {
    int i = 2;
    int j = -1;
    try
    {
      Object localObject1 = new com/google/android/gms/location/places/ui/PlaceAutocomplete$IntentBuilder;
      k = 2;
      ((PlaceAutocomplete.IntentBuilder)localObject1).<init>(k);
      localObject2 = this.zzaRk;
      localObject1 = ((PlaceAutocomplete.IntentBuilder)localObject1).setBoundsBias((LatLngBounds)localObject2);
      localObject2 = this.zzaRl;
      localObject1 = ((PlaceAutocomplete.IntentBuilder)localObject1).setFilter((AutocompleteFilter)localObject2);
      localObject2 = this.zzaRj;
      localObject2 = ((EditText)localObject2).getText();
      localObject2 = localObject2.toString();
      localObject1 = ((PlaceAutocomplete.IntentBuilder)localObject1).zzeq((String)localObject2);
      k = 1;
      localObject1 = ((PlaceAutocomplete.IntentBuilder)localObject1).zzig(k);
      localObject2 = getActivity();
      localObject1 = ((PlaceAutocomplete.IntentBuilder)localObject1).build((Activity)localObject2);
      k = 1;
      startActivityForResult((Intent)localObject1, k);
      m = j;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      for (;;)
      {
        Object localObject2;
        GoogleApiAvailability localGoogleApiAvailability;
        k = localGooglePlayServicesRepairableException.getConnectionStatusCode();
        str1 = "Places";
        str2 = "Could not open autocomplete activity";
        Log.e(str1, str2, localGooglePlayServicesRepairableException);
        m = k;
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        int k = localGooglePlayServicesNotAvailableException.errorCode;
        String str1 = "Places";
        String str2 = "Could not open autocomplete activity";
        Log.e(str1, str2, localGooglePlayServicesNotAvailableException);
        int m = k;
      }
    }
    if (m != j)
    {
      localGoogleApiAvailability = GoogleApiAvailability.getInstance();
      localObject2 = getActivity();
      localGoogleApiAvailability.showErrorDialogFragment((Activity)localObject2, m, i);
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    Object localObject;
    PlaceSelectionListener localPlaceSelectionListener;
    if (paramInt1 == i)
    {
      i = -1;
      if (paramInt2 != i) {
        break label82;
      }
      localObject = PlaceAutocomplete.getPlace(getActivity(), paramIntent);
      localPlaceSelectionListener = this.zzaRm;
      if (localPlaceSelectionListener != null)
      {
        localPlaceSelectionListener = this.zzaRm;
        localPlaceSelectionListener.onPlaceSelected((Place)localObject);
      }
      localObject = ((Place)localObject).getName().toString();
      setText((CharSequence)localObject);
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label82:
      i = 2;
      if (paramInt2 == i)
      {
        localObject = PlaceAutocomplete.getStatus(getActivity(), paramIntent);
        localPlaceSelectionListener = this.zzaRm;
        if (localPlaceSelectionListener != null)
        {
          localPlaceSelectionListener = this.zzaRm;
          localPlaceSelectionListener.onError((Status)localObject);
        }
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = R.layout.place_autocomplete_fragment;
    View localView = paramLayoutInflater.inflate(i, paramViewGroup, false);
    i = R.id.place_autocomplete_search_button;
    Object localObject = localView.findViewById(i);
    this.zzaRh = ((View)localObject);
    i = R.id.place_autocomplete_clear_button;
    localObject = localView.findViewById(i);
    this.zzaRi = ((View)localObject);
    i = R.id.place_autocomplete_search_input;
    localObject = (EditText)localView.findViewById(i);
    this.zzaRj = ((EditText)localObject);
    localObject = new com/google/android/gms/location/places/ui/SupportPlaceAutocompleteFragment$1;
    ((SupportPlaceAutocompleteFragment.1)localObject).<init>(this);
    this.zzaRh.setOnClickListener((View.OnClickListener)localObject);
    this.zzaRj.setOnClickListener((View.OnClickListener)localObject);
    localObject = this.zzaRi;
    SupportPlaceAutocompleteFragment.2 local2 = new com/google/android/gms/location/places/ui/SupportPlaceAutocompleteFragment$2;
    local2.<init>(this);
    ((View)localObject).setOnClickListener(local2);
    zzzF();
    return localView;
  }
  
  public void onDestroyView()
  {
    this.zzaRh = null;
    this.zzaRi = null;
    this.zzaRj = null;
    super.onDestroyView();
  }
  
  public void setBoundsBias(LatLngBounds paramLatLngBounds)
  {
    this.zzaRk = paramLatLngBounds;
  }
  
  public void setFilter(AutocompleteFilter paramAutocompleteFilter)
  {
    this.zzaRl = paramAutocompleteFilter;
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    this.zzaRj.setHint(paramCharSequence);
    this.zzaRh.setContentDescription(paramCharSequence);
  }
  
  public void setOnPlaceSelectedListener(PlaceSelectionListener paramPlaceSelectionListener)
  {
    this.zzaRm = paramPlaceSelectionListener;
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    this.zzaRj.setText(paramCharSequence);
    zzzF();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\SupportPlaceAutocompleteFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */