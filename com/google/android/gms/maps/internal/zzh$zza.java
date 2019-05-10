package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzf.zza;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
  }
  
  public static zzh zzcD(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzh$zza$zza;
      ((zzh.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.IOnInfoWindowClickListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
      localObject = zzf.zza.zzdi(paramParcel1.readStrongBinder());
      zzh((zzf)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */