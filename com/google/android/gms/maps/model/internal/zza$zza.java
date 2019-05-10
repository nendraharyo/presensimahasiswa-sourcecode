package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzdd(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
      paramParcel2.writeString((String)localObject);
      bool = i;
      float f2 = f1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      int j = paramParcel1.readInt();
      localObject = zziz(j);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localObject = ((zzd)localObject).asBinder();
      }
      for (;;)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        j = i;
        f2 = f1;
        break;
        j = 0;
        localObject = null;
        f2 = 0.0F;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      localObject = paramParcel1.readString();
      localObject = zzer((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      f2 = f1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      localObject = paramParcel1.readString();
      localObject = zzes((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      f2 = f1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      localObject = zzAn();
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      f2 = f1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      f2 = paramParcel1.readFloat();
      localObject = zzh(f2);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      f2 = f1;
      continue;
      localObject = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);
      }
      for (;;)
      {
        localObject = zzc((Bitmap)localObject);
        paramParcel2.writeNoException();
        if (localObject != null) {
          localIBinder = ((zzd)localObject).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        f2 = f1;
        break;
        j = 0;
        localObject = null;
        f2 = 0.0F;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      localObject = paramParcel1.readString();
      localObject = zzet((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      f2 = f1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */