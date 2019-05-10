package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzaa$zza
  extends Binder
  implements zzaa
{
  public zzaa$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
  }
  
  public static zzaa zzcW(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzaa)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzaa;
        if (bool)
        {
          localObject = (zzaa)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzaa$zza$zza;
      ((zzaa.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
      localObject = IStreetViewPanoramaDelegate.zza.zzcZ(paramParcel1.readStrongBinder());
      zza((IStreetViewPanoramaDelegate)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzaa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */