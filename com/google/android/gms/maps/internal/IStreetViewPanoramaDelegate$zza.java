package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.zze;
import com.google.android.gms.maps.model.zzj;
import com.google.android.gms.maps.model.zzm;

public abstract class IStreetViewPanoramaDelegate$zza
  extends Binder
  implements IStreetViewPanoramaDelegate
{
  public static IStreetViewPanoramaDelegate zzcZ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IStreetViewPanoramaDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IStreetViewPanoramaDelegate;
        if (bool)
        {
          localObject = (IStreetViewPanoramaDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$zza$zza;
      ((IStreetViewPanoramaDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel2.writeString((String)localObject2);
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        j = m;
      }
      enableZoom(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        j = m;
      }
      enablePanning(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        j = m;
      }
      enableUserNavigation(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        j = m;
      }
      enableStreetNames(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      boolean bool = isZoomGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool) {
        j = m;
      }
      paramParcel2.writeInt(j);
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      bool = isPanningGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool) {
        j = m;
      }
      paramParcel2.writeInt(j);
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      bool = isUserNavigationEnabled();
      paramParcel2.writeNoException();
      if (bool) {
        j = m;
      }
      paramParcel2.writeInt(j);
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      bool = isStreetNamesEnabled();
      paramParcel2.writeNoException();
      if (bool) {
        j = m;
      }
      paramParcel2.writeInt(j);
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      int k = paramParcel1.readInt();
      if (k != 0) {}
      for (localObject2 = StreetViewPanoramaCamera.CREATOR.zzfE(paramParcel1);; localObject2 = null)
      {
        long l = paramParcel1.readLong();
        animateTo((StreetViewPanoramaCamera)localObject2, l);
        paramParcel2.writeNoException();
        break;
        k = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      localObject1 = getPanoramaCamera();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(m);
        ((StreetViewPanoramaCamera)localObject1).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        localObject2 = paramParcel1.readString();
        setPositionWithID((String)localObject2);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject2 = LatLng.CREATOR;
          localObject1 = ((zze)localObject2).zzfz(paramParcel1);
        }
        setPosition((LatLng)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject2 = LatLng.CREATOR;
          localObject1 = ((zze)localObject2).zzfz(paramParcel1);
        }
        k = paramParcel1.readInt();
        setPositionWithRadius((LatLng)localObject1, k);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        localObject1 = getStreetViewPanoramaLocation();
        paramParcel2.writeNoException();
        if (localObject1 != null)
        {
          paramParcel2.writeInt(m);
          ((StreetViewPanoramaLocation)localObject1).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
          localObject2 = zzx.zza.zzcT(paramParcel1.readStrongBinder());
          setOnStreetViewPanoramaChangeListener((zzx)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
          localObject2 = zzw.zza.zzcS(paramParcel1.readStrongBinder());
          setOnStreetViewPanoramaCameraChangeListener((zzw)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
          localObject2 = zzy.zza.zzcU(paramParcel1.readStrongBinder());
          setOnStreetViewPanoramaClickListener((zzy)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
          localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
          localObject1 = pointToOrientation((zzd)localObject1);
          paramParcel2.writeNoException();
          if (localObject1 != null)
          {
            paramParcel2.writeInt(m);
            ((StreetViewPanoramaOrientation)localObject1).writeToParcel(paramParcel2, m);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate";
            paramParcel1.enforceInterface((String)localObject2);
            k = paramParcel1.readInt();
            if (k != 0) {}
            for (localObject2 = StreetViewPanoramaOrientation.CREATOR.zzfH(paramParcel1);; localObject2 = null)
            {
              localObject2 = orientationToPoint((StreetViewPanoramaOrientation)localObject2);
              paramParcel2.writeNoException();
              if (localObject2 != null) {
                localObject1 = ((zzd)localObject2).asBinder();
              }
              paramParcel2.writeStrongBinder((IBinder)localObject1);
              break;
              k = 0;
            }
            paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            localObject2 = zzz.zza.zzcV(paramParcel1.readStrongBinder());
            setOnStreetViewPanoramaLongClickListener((zzz)localObject2);
            paramParcel2.writeNoException();
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IStreetViewPanoramaDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */