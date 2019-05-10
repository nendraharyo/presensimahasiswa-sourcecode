package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public zzi$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
  }
  
  public static zzi zzdm(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzi;
        if (bool)
        {
          localObject = (zzi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzi$zza$zza;
      ((zzi.zza.zza)localObject).<init>(paramIBinder);
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
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.maps.model.internal.ITileProviderDelegate";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
      int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      localObject = getTile(j, k, m);
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((Tile)localObject).writeToParcel(paramParcel2, i);
      }
      else
      {
        j = 0;
        localObject = null;
        paramParcel2.writeInt(0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */