package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.zzm;

public abstract class zzz$zza
  extends Binder
  implements zzz
{
  public zzz$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
  }
  
  public static zzz zzcV(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzz)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzz;
        if (bool)
        {
          localObject = (zzz)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzz$zza$zza;
      ((zzz.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = StreetViewPanoramaOrientation.CREATOR.zzfH(paramParcel1);; localObject = null)
    {
      onStreetViewPanoramaLongClick((StreetViewPanoramaOrientation)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */