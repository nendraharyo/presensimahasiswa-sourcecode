package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzo$zza
  extends Binder
  implements zzo
{
  public zzo$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
  }
  
  public static zzo zzcK(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzo)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzo;
        if (bool)
        {
          localObject = (zzo)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzo$zza$zza;
      ((zzo.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.IOnMapReadyCallback";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
      localObject = IGoogleMapDelegate.zza.zzcv(paramParcel1.readStrongBinder());
      zza((IGoogleMapDelegate)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */