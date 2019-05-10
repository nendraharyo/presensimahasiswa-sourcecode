package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zza;
import com.google.android.gms.maps.model.zze;

public abstract class ICameraUpdateFactoryDelegate$zza
  extends Binder
  implements ICameraUpdateFactoryDelegate
{
  public static ICameraUpdateFactoryDelegate zzcs(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ICameraUpdateFactoryDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ICameraUpdateFactoryDelegate;
        if (bool)
        {
          localObject = (ICameraUpdateFactoryDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza;
      ((ICameraUpdateFactoryDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    float f1;
    float f2;
    int i;
    int j;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        return bool2;
        localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
        paramParcel2.writeString((String)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        localObject2 = zoomIn();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        localObject2 = zoomOut();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        f1 = paramParcel1.readFloat();
        f2 = paramParcel1.readFloat();
        localObject2 = scrollBy(f1, f2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        f1 = paramParcel1.readFloat();
        localObject2 = zoomTo(f1);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        f1 = paramParcel1.readFloat();
        localObject2 = zoomBy(f1);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        f1 = paramParcel1.readFloat();
        i = paramParcel1.readInt();
        j = paramParcel1.readInt();
        localObject2 = zoomByWithFocus(f1, i, j);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
      }
    case 7: 
      localObject2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      if (k != 0) {
        localObject2 = CameraPosition.CREATOR.zzfv(paramParcel1);
      }
      for (;;)
      {
        localObject2 = newCameraPosition((CameraPosition)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        break;
        k = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
    case 8: 
      localObject2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      if (k != 0) {
        localObject2 = LatLng.CREATOR.zzfz(paramParcel1);
      }
      for (;;)
      {
        localObject2 = newLatLng((LatLng)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        break;
        k = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
    case 9: 
      localObject2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      if (k != 0) {
        localObject2 = LatLng.CREATOR.zzfz(paramParcel1);
      }
      for (;;)
      {
        f2 = paramParcel1.readFloat();
        localObject2 = newLatLngZoom((LatLng)localObject2, f2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        break;
        k = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
    case 10: 
      localObject2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      if (k != 0) {
        localObject2 = LatLngBounds.CREATOR.zzfy(paramParcel1);
      }
      for (;;)
      {
        i = paramParcel1.readInt();
        localObject2 = newLatLngBounds((LatLngBounds)localObject2, i);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool2 = bool1;
        break;
        k = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
    }
    Object localObject2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    paramParcel1.enforceInterface((String)localObject2);
    int k = paramParcel1.readInt();
    if (k != 0) {
      localObject2 = LatLngBounds.CREATOR.zzfy(paramParcel1);
    }
    for (;;)
    {
      i = paramParcel1.readInt();
      j = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      localObject2 = newLatLngBoundsWithSize((LatLngBounds)localObject2, i, j, m);
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool2 = bool1;
      break;
      k = 0;
      localObject2 = null;
      f1 = 0.0F;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\ICameraUpdateFactoryDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */