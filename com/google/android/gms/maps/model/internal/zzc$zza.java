package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zze;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzdf(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject = null;
    int k = 0;
    float f2 = 0.0F;
    String str = null;
    int m = 1;
    float f3 = Float.MIN_VALUE;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
      paramParcel1.enforceInterface((String)localObject);
      remove();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localObject = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      str = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
      paramParcel1.enforceInterface(str);
      k = paramParcel1.readInt();
      if (k != 0) {
        localObject = LatLng.CREATOR.zzfz(paramParcel1);
      }
      setPosition((LatLng)localObject);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localObject = getPosition();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(m);
        ((LatLng)localObject).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
        paramParcel1.enforceInterface((String)localObject);
        f1 = paramParcel1.readFloat();
        setDimensions(f1);
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
        paramParcel1.enforceInterface((String)localObject);
        f1 = paramParcel1.readFloat();
        f2 = paramParcel1.readFloat();
        zza(f1, f2);
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
        paramParcel1.enforceInterface((String)localObject);
        f1 = getWidth();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        continue;
        localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
        paramParcel1.enforceInterface((String)localObject);
        f1 = getHeight();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        continue;
        str = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
        paramParcel1.enforceInterface(str);
        k = paramParcel1.readInt();
        if (k != 0) {
          localObject = LatLngBounds.CREATOR.zzfy(paramParcel1);
        }
        setPositionFromBounds((LatLngBounds)localObject);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        localObject = getBounds();
        paramParcel2.writeNoException();
        if (localObject != null)
        {
          paramParcel2.writeInt(m);
          ((LatLngBounds)localObject).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = paramParcel1.readFloat();
          setBearing(f1);
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = getBearing();
          paramParcel2.writeNoException();
          paramParcel2.writeFloat(f1);
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = paramParcel1.readFloat();
          setZIndex(f1);
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = getZIndex();
          paramParcel2.writeNoException();
          paramParcel2.writeFloat(f1);
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          i = paramParcel1.readInt();
          if (i != 0) {
            i = m;
          }
          for (f1 = f3;; f1 = 0.0F)
          {
            setVisible(i);
            paramParcel2.writeNoException();
            break;
            bool1 = false;
            localObject = null;
          }
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          boolean bool1 = isVisible();
          paramParcel2.writeNoException();
          if (bool1)
          {
            k = m;
            f2 = f3;
          }
          paramParcel2.writeInt(k);
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = paramParcel1.readFloat();
          setTransparency(f1);
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          f1 = getTransparency();
          paramParcel2.writeNoException();
          paramParcel2.writeFloat(f1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
          localObject = zzdf(paramParcel1.readStrongBinder());
          bool1 = zzb((zzc)localObject);
          paramParcel2.writeNoException();
          if (bool1)
          {
            k = m;
            f2 = f3;
          }
          paramParcel2.writeInt(k);
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          int j = hashCodeRemote();
          paramParcel2.writeNoException();
          paramParcel2.writeInt(j);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
          localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
          zzv((com.google.android.gms.dynamic.zzd)localObject);
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          j = paramParcel1.readInt();
          if (j != 0)
          {
            k = m;
            f2 = f3;
          }
          setClickable(k);
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate";
          paramParcel1.enforceInterface((String)localObject);
          boolean bool2 = isClickable();
          paramParcel2.writeNoException();
          if (bool2)
          {
            k = m;
            f2 = f3;
          }
          paramParcel2.writeInt(k);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */