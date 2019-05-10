package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzs$zza
  extends Binder
  implements zzs
{
  public zzs$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
  }
  
  public static zzs zzcO(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzs)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzs;
        if (bool)
        {
          localObject = (zzs)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzs$zza$zza;
      ((zzs.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.IOnMyLocationChangeListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzq((zzd)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */