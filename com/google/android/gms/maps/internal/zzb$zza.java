package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public zzb$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.ICancelableCallback");
  }
  
  public static zzb zzct(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzb;
        if (bool)
        {
          localObject = (zzb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzb$zza$zza;
      ((zzb.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.maps.internal.ICancelableCallback";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.maps.internal.ICancelableCallback";
      paramParcel1.enforceInterface(str);
      onFinish();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.maps.internal.ICancelableCallback";
      paramParcel1.enforceInterface(str);
      onCancel();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */