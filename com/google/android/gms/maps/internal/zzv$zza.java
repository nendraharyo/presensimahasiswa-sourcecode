package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.IPolylineDelegate.zza;

public abstract class zzv$zza
  extends Binder
  implements zzv
{
  public zzv$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnPolylineClickListener");
  }
  
  public static zzv zzcR(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzv)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzv;
        if (bool)
        {
          localObject = (zzv)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzv$zza$zza;
      ((zzv.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.maps.internal.IOnPolylineClickListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
      localObject = IPolylineDelegate.zza.zzdk(paramParcel1.readStrongBinder());
      zza((IPolylineDelegate)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */