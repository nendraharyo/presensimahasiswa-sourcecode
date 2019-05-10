package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.zzg;

public abstract class zzt$zza
  extends Binder
  implements zzt
{
  public static zzt zzcP(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzt)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzt;
        if (bool)
        {
          localObject = (zzt)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzt$zza$zza;
      ((zzt.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.maps.internal.IOnPoiClickListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.maps.internal.IOnPoiClickListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = PointOfInterest.CREATOR.zzfB(paramParcel1);; localObject = null)
    {
      zza((PointOfInterest)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzt$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */