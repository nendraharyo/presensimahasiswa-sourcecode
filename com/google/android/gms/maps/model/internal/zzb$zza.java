package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.zze;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public static zzb zzde(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzb;
        if (bool)
        {
          localObject = (zzb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzb$zza$zza;
      ((zzb.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
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
      localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      remove();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localObject1 = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = LatLng.CREATOR.zzfz(paramParcel1);; localObject1 = null)
      {
        setCenter((LatLng)localObject1);
        paramParcel2.writeNoException();
        break;
        i = 0;
        f1 = 0.0F;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
      Object localObject2 = getCenter();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(k);
        ((LatLng)localObject2).writeToParcel(paramParcel2, k);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        double d = paramParcel1.readDouble();
        setRadius(d);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        d = getRadius();
        paramParcel2.writeNoException();
        paramParcel2.writeDouble(d);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        setStrokeWidth(f1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = getStrokeWidth();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        setStrokeColor(i);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        i = getStrokeColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        setFillColor(i);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        i = getFillColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        setZIndex(f1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = getZIndex();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int m = paramParcel1.readInt();
        if (m != 0)
        {
          i = k;
          f1 = f2;
        }
        setVisible(i);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool = isVisible();
        paramParcel2.writeNoException();
        if (bool)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        localObject2 = zzde(paramParcel1.readStrongBinder());
        bool = zza((zzb)localObject2);
        paramParcel2.writeNoException();
        if (bool)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.ICircleDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        int j = hashCodeRemote();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */