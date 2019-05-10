package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract class zzqe$zza
  extends Binder
  implements zzqe
{
  public static zzqe zzdq(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqe)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqe;
        if (bool)
        {
          localObject = (zzqe)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqe$zza$zza;
      ((zzqe.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (Device)Device.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        byte[] arrayOfByte = paramParcel1.createByteArray();
        zza((Device)localObject, arrayOfByte);
        j = i;
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
      paramParcel1.enforceInterface((String)localObject);
      onDisconnected();
      j = i;
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      onError(j);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      localObject = paramParcel1.readString();
      zzfw((String)localObject);
      j = i;
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
      paramParcel1.enforceInterface((String)localObject);
      zzEc();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      localObject = paramParcel1.readString();
      zzfx((String)localObject);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqe$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */