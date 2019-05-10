package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzf.zza;

public abstract class zzp$zza
  extends Binder
  implements zzp
{
  public zzp$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
  }
  
  public static zzp zzcL(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzp;
        if (bool)
        {
          localObject = (zzp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzp$zza$zza;
      ((zzp.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.maps.internal.IOnMarkerClickListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    Object localObject = zzf.zza.zzdi(paramParcel1.readStrongBinder());
    int j = zzd((zzf)localObject);
    paramParcel2.writeNoException();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      paramParcel2.writeInt(j);
      break;
      int k = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */