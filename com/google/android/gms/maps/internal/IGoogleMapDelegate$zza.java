package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;

public abstract class IGoogleMapDelegate$zza
  extends Binder
  implements IGoogleMapDelegate
{
  public static IGoogleMapDelegate zzcv(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IGoogleMapDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IGoogleMapDelegate;
        if (bool)
        {
          localObject = (IGoogleMapDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IGoogleMapDelegate$zza$zza;
      ((IGoogleMapDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    zzb localzzb = null;
    int k = 0;
    Object localObject1 = null;
    int m = 1;
    float f1 = Float.MIN_VALUE;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      Object localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      localObject2 = getCameraPosition();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(m);
        ((CameraPosition)localObject2).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        float f2 = getMaxZoomLevel();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f2);
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        f2 = getMinZoomLevel();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        localObject2 = com.google.android.gms.dynamic.zzd.zza.zzbs(paramParcel1.readStrongBinder());
        moveCamera((com.google.android.gms.dynamic.zzd)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        localObject2 = com.google.android.gms.dynamic.zzd.zza.zzbs(paramParcel1.readStrongBinder());
        animateCamera((com.google.android.gms.dynamic.zzd)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        localObject2 = com.google.android.gms.dynamic.zzd.zza.zzbs(paramParcel1.readStrongBinder());
        localObject1 = zzb.zza.zzct(paramParcel1.readStrongBinder());
        animateCameraWithCallback((com.google.android.gms.dynamic.zzd)localObject2, (zzb)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        localObject2 = com.google.android.gms.dynamic.zzd.zza.zzbs(paramParcel1.readStrongBinder());
        k = paramParcel1.readInt();
        localzzb = zzb.zza.zzct(paramParcel1.readStrongBinder());
        animateCameraWithDurationAndCallback((com.google.android.gms.dynamic.zzd)localObject2, k, localzzb);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        stopAnimation();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int n = paramParcel1.readInt();
        if (n != 0) {
          localObject2 = PolylineOptions.CREATOR.zzfD(paramParcel1);
        }
        for (;;)
        {
          localObject2 = addPolyline((PolylineOptions)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((IPolylineDelegate)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          break;
          n = 0;
          localObject2 = null;
          f2 = 0.0F;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = paramParcel1.readInt();
        if (n != 0) {
          localObject2 = PolygonOptions.CREATOR.zzfC(paramParcel1);
        }
        for (;;)
        {
          localObject2 = addPolygon((PolygonOptions)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((com.google.android.gms.maps.model.internal.zzg)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          break;
          n = 0;
          localObject2 = null;
          f2 = 0.0F;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = paramParcel1.readInt();
        if (n != 0) {
          localObject2 = MarkerOptions.CREATOR.zzfA(paramParcel1);
        }
        for (;;)
        {
          localObject2 = addMarker((MarkerOptions)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((com.google.android.gms.maps.model.internal.zzf)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          break;
          n = 0;
          localObject2 = null;
          f2 = 0.0F;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = paramParcel1.readInt();
        if (n != 0) {
          localObject2 = GroundOverlayOptions.CREATOR.zzfx(paramParcel1);
        }
        for (;;)
        {
          localObject2 = addGroundOverlay((GroundOverlayOptions)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((com.google.android.gms.maps.model.internal.zzc)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          break;
          n = 0;
          localObject2 = null;
          f2 = 0.0F;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = paramParcel1.readInt();
        if (n != 0) {
          localObject2 = TileOverlayOptions.CREATOR.zzfJ(paramParcel1);
        }
        for (;;)
        {
          localObject2 = addTileOverlay((TileOverlayOptions)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((com.google.android.gms.maps.model.internal.zzh)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          break;
          n = 0;
          localObject2 = null;
          f2 = 0.0F;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        clear();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = getMapType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(n);
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        n = paramParcel1.readInt();
        setMapType(n);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int i1 = isTrafficEnabled();
        paramParcel2.writeNoException();
        if (i1 != 0) {
          i1 = m;
        }
        for (f2 = f1;; f2 = 0.0F)
        {
          paramParcel2.writeInt(i1);
          break;
          i2 = 0;
          localObject2 = null;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int i2 = paramParcel1.readInt();
        if (i2 != 0) {
          i = m;
        }
        setTrafficEnabled(i);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool1 = isIndoorEnabled();
        paramParcel2.writeNoException();
        if (bool1) {
          i = m;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int i3 = paramParcel1.readInt();
        if (i3 != 0) {
          i3 = m;
        }
        for (f2 = f1;; f2 = 0.0F)
        {
          bool2 = setIndoorEnabled(i3);
          paramParcel2.writeNoException();
          if (bool2) {
            i = m;
          }
          paramParcel2.writeInt(i);
          break;
          bool2 = false;
          localObject2 = null;
        }
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool2 = isMyLocationEnabled();
        paramParcel2.writeNoException();
        if (bool2) {
          i = m;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int i4 = paramParcel1.readInt();
        if (i4 != 0) {
          i = m;
        }
        setMyLocationEnabled(i);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        localObject2 = getMyLocation();
        paramParcel2.writeNoException();
        if (localObject2 != null)
        {
          paramParcel2.writeInt(m);
          ((Location)localObject2).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = ILocationSourceDelegate.zza.zzcx(paramParcel1.readStrongBinder());
          setLocationSource((ILocationSourceDelegate)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = getUiSettings();
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((IUiSettingsDelegate)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = getProjection();
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((IProjectionDelegate)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zze.zza.zzcA(paramParcel1.readStrongBinder());
          setOnCameraChangeListener((zze)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzl.zza.zzcH(paramParcel1.readStrongBinder());
          setOnMapClickListener((zzl)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzn.zza.zzcJ(paramParcel1.readStrongBinder());
          setOnMapLongClickListener((zzn)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzp.zza.zzcL(paramParcel1.readStrongBinder());
          setOnMarkerClickListener((zzp)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzq.zza.zzcM(paramParcel1.readStrongBinder());
          setOnMarkerDragListener((zzq)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzh.zza.zzcD(paramParcel1.readStrongBinder());
          setOnInfoWindowClickListener((zzh)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzd.zza.zzcw(paramParcel1.readStrongBinder());
          setInfoWindowAdapter((zzd)localObject2);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          i4 = paramParcel1.readInt();
          if (i4 != 0) {
            localObject2 = CircleOptions.CREATOR.zzfw(paramParcel1);
          }
          for (;;)
          {
            localObject2 = addCircle((CircleOptions)localObject2);
            paramParcel2.writeNoException();
            if (localObject2 != null) {
              localObject1 = ((com.google.android.gms.maps.model.internal.zzb)localObject2).asBinder();
            }
            paramParcel2.writeStrongBinder((IBinder)localObject1);
            break;
            i4 = 0;
            localObject2 = null;
            f2 = 0.0F;
          }
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzs.zza.zzcO(paramParcel1.readStrongBinder());
          setOnMyLocationChangeListener((zzs)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzr.zza.zzcN(paramParcel1.readStrongBinder());
          setOnMyLocationButtonClickListener((zzr)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzab.zza.zzcY(paramParcel1.readStrongBinder());
          localObject1 = com.google.android.gms.dynamic.zzd.zza.zzbs(paramParcel1.readStrongBinder());
          snapshot((zzab)localObject2, (com.google.android.gms.dynamic.zzd)localObject1);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          i4 = paramParcel1.readInt();
          k = paramParcel1.readInt();
          int j = paramParcel1.readInt();
          int i7 = paramParcel1.readInt();
          setPadding(i4, k, j, i7);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          boolean bool3 = isBuildingsEnabled();
          paramParcel2.writeNoException();
          if (bool3) {
            j = m;
          }
          paramParcel2.writeInt(j);
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          int i5 = paramParcel1.readInt();
          if (i5 != 0) {
            j = m;
          }
          setBuildingsEnabled(j);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzm.zza.zzcI(paramParcel1.readStrongBinder());
          setOnMapLoadedCallback((zzm)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = getFocusedBuilding();
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localObject1 = ((com.google.android.gms.maps.model.internal.zzd)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder((IBinder)localObject1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzg.zza.zzcC(paramParcel1.readStrongBinder());
          setOnIndoorStateChangeListener((zzg)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzo.zza.zzcK(paramParcel1.readStrongBinder());
          getMapAsync((zzo)localObject2);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          i5 = paramParcel1.readInt();
          if (i5 != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          for (;;)
          {
            onCreate((Bundle)localObject2);
            paramParcel2.writeNoException();
            break;
            i5 = 0;
            localObject2 = null;
            f2 = 0.0F;
          }
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          onResume();
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          onPause();
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          onDestroy();
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          onLowMemory();
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          boolean bool4 = useViewLifecycleWhenInFragment();
          paramParcel2.writeNoException();
          if (bool4) {
            j = m;
          }
          paramParcel2.writeInt(j);
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          int i6 = paramParcel1.readInt();
          if (i6 != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          for (;;)
          {
            onSaveInstanceState((Bundle)localObject2);
            paramParcel2.writeNoException();
            if (localObject2 == null) {
              break label2588;
            }
            paramParcel2.writeInt(m);
            ((Bundle)localObject2).writeToParcel(paramParcel2, m);
            break;
            i6 = 0;
            localObject2 = null;
            f2 = 0.0F;
          }
          label2588:
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = paramParcel1.readString();
          setContentDescription((String)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzt.zza.zzcP(paramParcel1.readStrongBinder());
          setOnPoiClickListener((zzt)localObject2);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          i6 = paramParcel1.readInt();
          if (i6 != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          for (;;)
          {
            onEnterAmbient((Bundle)localObject2);
            paramParcel2.writeNoException();
            break;
            i6 = 0;
            localObject2 = null;
            f2 = 0.0F;
          }
          localObject2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate";
          paramParcel1.enforceInterface((String)localObject2);
          onExitAmbient();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzf.zza.zzcB(paramParcel1.readStrongBinder());
          setOnGroundOverlayClickListener((zzf)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzj.zza.zzcF(paramParcel1.readStrongBinder());
          setOnInfoWindowLongClickListener((zzj)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzu.zza.zzcQ(paramParcel1.readStrongBinder());
          setOnPolygonClickListener((zzu)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzi.zza.zzcE(paramParcel1.readStrongBinder());
          setOnInfoWindowCloseListener((zzi)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localObject2 = zzv.zza.zzcR(paramParcel1.readStrongBinder());
          setOnPolylineClickListener((zzv)localObject2);
          paramParcel2.writeNoException();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IGoogleMapDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */