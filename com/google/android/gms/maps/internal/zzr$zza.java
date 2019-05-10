package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzr$zza
  extends Binder
  implements zzr
{
  public zzr$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
  }
  
  public static zzr zzcN(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzr)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzr;
        if (bool)
        {
          localObject = (zzr)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzr$zza$zza;
      ((zzr.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return i;
        str = "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener";
        paramParcel2.writeString(str);
      }
    }
    String str = "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener";
    paramParcel1.enforceInterface(str);
    int j = onMyLocationButtonClick();
    paramParcel2.writeNoException();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      paramParcel2.writeInt(j);
      break;
      int k = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzr$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */