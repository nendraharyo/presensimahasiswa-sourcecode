package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;

public abstract class IStreetViewPanoramaViewDelegate$zza
  extends Binder
  implements IStreetViewPanoramaViewDelegate
{
  public static IStreetViewPanoramaViewDelegate zzdb(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IStreetViewPanoramaViewDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IStreetViewPanoramaViewDelegate;
        if (bool)
        {
          localObject = (IStreetViewPanoramaViewDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate$zza$zza;
      ((IStreetViewPanoramaViewDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
      Object localObject2 = getStreetViewPanorama();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((IStreetViewPanoramaDelegate)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      onCreate((Bundle)localObject1);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      onResume();
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      onPause();
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      onDestroy();
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      onLowMemory();
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      onSaveInstanceState((Bundle)localObject1);
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject1 = null;
        paramParcel2.writeInt(0);
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
      localObject2 = getView();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((zzd)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
      localObject1 = zzaa.zza.zzcW(paramParcel1.readStrongBinder());
      getStreetViewPanoramaAsync((zzaa)localObject1);
      paramParcel2.writeNoException();
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IStreetViewPanoramaViewDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */