package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public static zzh zzdl(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzh$zza$zza;
      ((zzh.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    String str = null;
    int k = 1;
    float f2 = Float.MIN_VALUE;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface(str);
      remove();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface(str);
      clearTileCache();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
      str = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface(str);
      f1 = paramParcel1.readFloat();
      setZIndex(f1);
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface(str);
      f1 = getZIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      Object localObject = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface((String)localObject);
      int m = paramParcel1.readInt();
      if (m != 0)
      {
        i = k;
        f1 = f2;
      }
      setVisible(i);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface((String)localObject);
      boolean bool1 = isVisible();
      paramParcel2.writeNoException();
      if (bool1)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
      localObject = zzdl(paramParcel1.readStrongBinder());
      bool1 = zza((zzh)localObject);
      paramParcel2.writeNoException();
      if (bool1)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      str = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface(str);
      int j = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      continue;
      localObject = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface((String)localObject);
      int n = paramParcel1.readInt();
      if (n != 0)
      {
        j = k;
        f1 = f2;
      }
      setFadeIn(j);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.maps.model.internal.ITileOverlayDelegate";
      paramParcel1.enforceInterface((String)localObject);
      boolean bool2 = getFadeIn();
      paramParcel2.writeNoException();
      if (bool2)
      {
        j = k;
        f1 = f2;
      }
      paramParcel2.writeInt(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */