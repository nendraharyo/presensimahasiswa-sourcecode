package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.zzc;

public abstract interface IGoogleMapDelegate
  extends IInterface
{
  public abstract com.google.android.gms.maps.model.internal.zzb addCircle(CircleOptions paramCircleOptions);
  
  public abstract zzc addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions);
  
  public abstract com.google.android.gms.maps.model.internal.zzf addMarker(MarkerOptions paramMarkerOptions);
  
  public abstract com.google.android.gms.maps.model.internal.zzg addPolygon(PolygonOptions paramPolygonOptions);
  
  public abstract IPolylineDelegate addPolyline(PolylineOptions paramPolylineOptions);
  
  public abstract com.google.android.gms.maps.model.internal.zzh addTileOverlay(TileOverlayOptions paramTileOverlayOptions);
  
  public abstract void animateCamera(com.google.android.gms.dynamic.zzd paramzzd);
  
  public abstract void animateCameraWithCallback(com.google.android.gms.dynamic.zzd paramzzd, zzb paramzzb);
  
  public abstract void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.zzd paramzzd, int paramInt, zzb paramzzb);
  
  public abstract void clear();
  
  public abstract CameraPosition getCameraPosition();
  
  public abstract com.google.android.gms.maps.model.internal.zzd getFocusedBuilding();
  
  public abstract void getMapAsync(zzo paramzzo);
  
  public abstract int getMapType();
  
  public abstract float getMaxZoomLevel();
  
  public abstract float getMinZoomLevel();
  
  public abstract Location getMyLocation();
  
  public abstract IProjectionDelegate getProjection();
  
  public abstract IUiSettingsDelegate getUiSettings();
  
  public abstract boolean isBuildingsEnabled();
  
  public abstract boolean isIndoorEnabled();
  
  public abstract boolean isMyLocationEnabled();
  
  public abstract boolean isTrafficEnabled();
  
  public abstract void moveCamera(com.google.android.gms.dynamic.zzd paramzzd);
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onEnterAmbient(Bundle paramBundle);
  
  public abstract void onExitAmbient();
  
  public abstract void onLowMemory();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  public abstract void setBuildingsEnabled(boolean paramBoolean);
  
  public abstract void setContentDescription(String paramString);
  
  public abstract boolean setIndoorEnabled(boolean paramBoolean);
  
  public abstract void setInfoWindowAdapter(zzd paramzzd);
  
  public abstract void setLocationSource(ILocationSourceDelegate paramILocationSourceDelegate);
  
  public abstract void setMapType(int paramInt);
  
  public abstract void setMyLocationEnabled(boolean paramBoolean);
  
  public abstract void setOnCameraChangeListener(zze paramzze);
  
  public abstract void setOnGroundOverlayClickListener(zzf paramzzf);
  
  public abstract void setOnIndoorStateChangeListener(zzg paramzzg);
  
  public abstract void setOnInfoWindowClickListener(zzh paramzzh);
  
  public abstract void setOnInfoWindowCloseListener(zzi paramzzi);
  
  public abstract void setOnInfoWindowLongClickListener(zzj paramzzj);
  
  public abstract void setOnMapClickListener(zzl paramzzl);
  
  public abstract void setOnMapLoadedCallback(zzm paramzzm);
  
  public abstract void setOnMapLongClickListener(zzn paramzzn);
  
  public abstract void setOnMarkerClickListener(zzp paramzzp);
  
  public abstract void setOnMarkerDragListener(zzq paramzzq);
  
  public abstract void setOnMyLocationButtonClickListener(zzr paramzzr);
  
  public abstract void setOnMyLocationChangeListener(zzs paramzzs);
  
  public abstract void setOnPoiClickListener(zzt paramzzt);
  
  public abstract void setOnPolygonClickListener(zzu paramzzu);
  
  public abstract void setOnPolylineClickListener(zzv paramzzv);
  
  public abstract void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void setTrafficEnabled(boolean paramBoolean);
  
  public abstract void snapshot(zzab paramzzab, com.google.android.gms.dynamic.zzd paramzzd);
  
  public abstract void stopAnimation();
  
  public abstract boolean useViewLifecycleWhenInFragment();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IGoogleMapDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */