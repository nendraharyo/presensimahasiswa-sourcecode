package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzc;
import com.google.android.gms.maps.model.internal.zzc.zza;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public zzf$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
  }
  
  public static zzf zzcB(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzf;
        if (bool)
        {
          localObject = (zzf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzf$zza$zza;
      ((zzf.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.IOnGroundOverlayClickListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
      localObject = zzc.zza.zzdf(paramParcel1.readStrongBinder());
      zza((zzc)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */