package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.zze;

public abstract class IProjectionDelegate$zza
  extends Binder
  implements IProjectionDelegate
{
  public static IProjectionDelegate zzcX(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IProjectionDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IProjectionDelegate;
        if (bool)
        {
          localObject = (IProjectionDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IProjectionDelegate$zza$zza;
      ((IProjectionDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
    int i = 1;
    boolean bool;
    int j;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.maps.internal.IProjectionDelegate";
        paramParcel2.writeString((String)localObject);
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      localObject = fromScreenLocation((zzd)localObject);
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((LatLng)localObject).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        paramParcel2.writeInt(0);
      }
    case 2: 
      localObject = "com.google.android.gms.maps.internal.IProjectionDelegate";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = LatLng.CREATOR.zzfz(paramParcel1);; localObject = null)
      {
        localObject = toScreenLocation((LatLng)localObject);
        paramParcel2.writeNoException();
        if (localObject != null) {
          localIBinder = ((zzd)localObject).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        break;
        j = 0;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
    Object localObject = getVisibleRegion();
    paramParcel2.writeNoException();
    if (localObject != null)
    {
      paramParcel2.writeInt(i);
      ((VisibleRegion)localObject).writeToParcel(paramParcel2, i);
    }
    for (;;)
    {
      j = i;
      break;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IProjectionDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */