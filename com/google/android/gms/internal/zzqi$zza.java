package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract class zzqi$zza
  extends Binder
  implements zzqi
{
  public static zzqi zzdu(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqi;
        if (bool)
        {
          localObject = (zzqi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqi$zza$zza;
      ((zzqi.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.nearby.bootstrap.internal.IScanListener";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IScanListener";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (Device)Device.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        zza((Device)localObject);
        j = i;
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IScanListener";
      paramParcel1.enforceInterface((String)localObject);
      onScanStopped();
      j = i;
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IScanListener";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      onError(j);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */