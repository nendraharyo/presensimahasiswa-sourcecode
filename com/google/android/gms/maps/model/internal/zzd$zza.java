package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public static zzd zzdg(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = getActiveLevelIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = getDefaultLevelIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      localObject1 = getLevels();
      paramParcel2.writeNoException();
      paramParcel2.writeBinderList((List)localObject1);
      continue;
      Object localObject2 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool = isUnderground();
      paramParcel2.writeNoException();
      if (bool) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      localObject2 = zzdg(paramParcel1.readStrongBinder());
      bool = zzb((zzd)localObject2);
      paramParcel2.writeNoException();
      if (bool) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */