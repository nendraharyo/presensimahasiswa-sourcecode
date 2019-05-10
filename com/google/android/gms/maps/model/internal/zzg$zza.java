package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public static zzg zzdj(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzg;
        if (bool)
        {
          localObject = (zzg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzg$zza$zza;
      ((zzg.zza.zza)localObject).<init>(paramIBinder);
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
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      remove();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject1 = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject1 = LatLng.CREATOR;
      localObject1 = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject1);
      setPoints((List)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject1 = getPoints();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList((List)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject1 = getClass().getClassLoader();
      localObject1 = paramParcel1.readArrayList((ClassLoader)localObject1);
      setHoles((List)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject1 = getHoles();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = paramParcel1.readFloat();
      setStrokeWidth(f1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = getStrokeWidth();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      setStrokeColor(i);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = getStrokeColor();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      setFillColor(i);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = getFillColor();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = paramParcel1.readFloat();
      setZIndex(f1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = getZIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      Object localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
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
      localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool1 = isVisible();
      paramParcel2.writeNoException();
      if (bool1)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      int n = paramParcel1.readInt();
      if (n != 0)
      {
        i = k;
        f1 = f2;
      }
      setGeodesic(i);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool2 = isGeodesic();
      paramParcel2.writeNoException();
      if (bool2)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      localObject2 = zzdj(paramParcel1.readStrongBinder());
      bool2 = zzb((zzg)localObject2);
      paramParcel2.writeNoException();
      if (bool2)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      int j = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      continue;
      localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      int i1 = paramParcel1.readInt();
      if (i1 != 0)
      {
        j = k;
        f1 = f2;
      }
      setClickable(j);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.model.internal.IPolygonDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool3 = isClickable();
      paramParcel2.writeNoException();
      if (bool3)
      {
        j = k;
        f1 = f2;
      }
      paramParcel2.writeInt(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */