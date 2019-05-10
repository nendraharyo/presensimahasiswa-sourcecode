package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ILocationSourceDelegate$zza
  extends Binder
  implements ILocationSourceDelegate
{
  public ILocationSourceDelegate$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
  }
  
  public static ILocationSourceDelegate zzcx(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ILocationSourceDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ILocationSourceDelegate;
        if (bool)
        {
          localObject = (ILocationSourceDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/ILocationSourceDelegate$zza$zza;
      ((ILocationSourceDelegate.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.ILocationSourceDelegate";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
      localObject = zzk.zza.zzcG(paramParcel1.readStrongBinder());
      activate((zzk)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.maps.internal.ILocationSourceDelegate";
      paramParcel1.enforceInterface((String)localObject);
      deactivate();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\ILocationSourceDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */