package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.zze;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzdi(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzf;
        if (bool)
        {
          localObject = (zzf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/model/internal/zzf$zza$zza;
      ((zzf.zza.zza)localObject).<init>(paramIBinder);
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
      localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      remove();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
      localObject1 = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = LatLng.CREATOR.zzfz(paramParcel1);; localObject1 = null)
      {
        setPosition((LatLng)localObject1);
        paramParcel2.writeNoException();
        break;
        i = 0;
        f1 = 0.0F;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
      Object localObject2 = getPosition();
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
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject1 = paramParcel1.readString();
        setTitle((String)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject1 = getTitle();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject1 = paramParcel1.readString();
        setSnippet((String)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject1 = getSnippet();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int m = paramParcel1.readInt();
        if (m != 0)
        {
          i = k;
          f1 = f2;
        }
        setDraggable(i);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool1 = isDraggable();
        paramParcel2.writeNoException();
        if (bool1)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        showInfoWindow();
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        hideInfoWindow();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        bool1 = isInfoWindowShown();
        paramParcel2.writeNoException();
        if (bool1)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int n = paramParcel1.readInt();
        if (n != 0)
        {
          i = k;
          f1 = f2;
        }
        setVisible(i);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool2 = isVisible();
        paramParcel2.writeNoException();
        if (bool2)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject2 = zzdi(paramParcel1.readStrongBinder());
        bool2 = zzj((zzf)localObject2);
        paramParcel2.writeNoException();
        if (bool2)
        {
          i = k;
          f1 = f2;
        }
        paramParcel2.writeInt(i);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        int j = hashCodeRemote();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(j);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
        zzw((zzd)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        float f3 = paramParcel1.readFloat();
        setAnchor(f1, f3);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        int i1 = paramParcel1.readInt();
        if (i1 != 0)
        {
          j = k;
          f1 = f2;
        }
        setFlat(j);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool3 = isFlat();
        paramParcel2.writeNoException();
        if (bool3)
        {
          j = k;
          f1 = f2;
        }
        paramParcel2.writeInt(j);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        setRotation(f1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = getRotation();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        f3 = paramParcel1.readFloat();
        setInfoWindowAnchor(f1, f3);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = paramParcel1.readFloat();
        setAlpha(f1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate";
        paramParcel1.enforceInterface((String)localObject1);
        f1 = getAlpha();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */