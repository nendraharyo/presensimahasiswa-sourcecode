package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzk$zza
  extends Binder
  implements zzk
{
  public static zzk zzcG(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzk)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzk;
        if (bool)
        {
          localObject = (zzk)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzk$zza$zza;
      ((zzk.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
      for (;;)
      {
        return bool;
        localObject = "com.google.android.gms.maps.internal.IOnLocationChangeListener";
        paramParcel2.writeString((String)localObject);
        bool = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
        localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
        zzu((zzd)localObject);
        paramParcel2.writeNoException();
        bool = i;
      }
    }
    Object localObject = "com.google.android.gms.maps.internal.IOnLocationChangeListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zzd((Location)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */