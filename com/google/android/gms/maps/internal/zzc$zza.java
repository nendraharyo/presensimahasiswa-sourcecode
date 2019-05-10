package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.zzb;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzcu(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject1 = "com.google.android.gms.maps.internal.ICreator";
      paramParcel2.writeString((String)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      init((zzd)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      Object localObject2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      localObject2 = zzs((zzd)localObject2);
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((IMapFragmentDelegate)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject2 = paramParcel1.readStrongBinder();
      zzd localzzd = zzd.zza.zzbs((IBinder)localObject2);
      int i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject2 = GoogleMapOptions.CREATOR.zzft(paramParcel1);; localObject2 = null)
      {
        localObject2 = zza(localzzd, (GoogleMapOptions)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((IMapViewDelegate)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool1 = bool2;
        break;
        i = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject2 = zzAe();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((ICameraUpdateFactoryDelegate)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject2 = zzAf();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((com.google.android.gms.maps.model.internal.zza)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      zzd((zzd)localObject1, i);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject2 = paramParcel1.readStrongBinder();
      localzzd = zzd.zza.zzbs((IBinder)localObject2);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject2 = StreetViewPanoramaOptions.CREATOR.zzfu(paramParcel1);; localObject2 = null)
      {
        localObject2 = zza(localzzd, (StreetViewPanoramaOptions)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((IStreetViewPanoramaViewDelegate)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        bool1 = bool2;
        break;
        i = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      localObject2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      localObject2 = zzt((zzd)localObject2);
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((IStreetViewPanoramaFragmentDelegate)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */