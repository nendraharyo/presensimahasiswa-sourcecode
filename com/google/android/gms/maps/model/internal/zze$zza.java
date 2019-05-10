package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zze$zza
  extends Binder
  implements zze
{
  public static zze zzdh(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zze)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zze;
        if (bool)
        {
          localObject = (zze)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zze$zza$zza;
      ((zze.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      localObject = getName();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      localObject = getShortName();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate";
      paramParcel1.enforceInterface((String)localObject);
      activate();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      localObject = zzdh(paramParcel1.readStrongBinder());
      int j = zza((zze)localObject);
      paramParcel2.writeNoException();
      if (j != 0) {
        j = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(j);
        break;
        k = 0;
        localObject = null;
      }
      localObject = "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate";
      paramParcel1.enforceInterface((String)localObject);
      int k = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */