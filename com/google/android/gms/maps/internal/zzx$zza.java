package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.zzl;

public abstract class zzx$zza
  extends Binder
  implements zzx
{
  public zzx$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
  }
  
  public static zzx zzcT(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzx)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzx;
        if (bool)
        {
          localObject = (zzx)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzx$zza$zza;
      ((zzx.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = StreetViewPanoramaLocation.CREATOR.zzfG(paramParcel1);; localObject = null)
    {
      onStreetViewPanoramaChange((StreetViewPanoramaLocation)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */