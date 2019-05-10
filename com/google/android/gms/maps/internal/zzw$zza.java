package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.zzj;

public abstract class zzw$zza
  extends Binder
  implements zzw
{
  public zzw$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
  }
  
  public static zzw zzcS(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzw)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzw;
        if (bool)
        {
          localObject = (zzw)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzw$zza$zza;
      ((zzw.zza.zza)localObject).<init>(paramIBinder);
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
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = StreetViewPanoramaCamera.CREATOR.zzfE(paramParcel1);; localObject = null)
    {
      onStreetViewPanoramaCameraChange((StreetViewPanoramaCamera)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */