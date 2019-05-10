package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IUiSettingsDelegate$zza
  extends Binder
  implements IUiSettingsDelegate
{
  public static IUiSettingsDelegate zzdc(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IUiSettingsDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IUiSettingsDelegate;
        if (bool)
        {
          localObject = (IUiSettingsDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IUiSettingsDelegate$zza$zza;
      ((IUiSettingsDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      str1 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel2.writeString(str1);
      continue;
      String str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      int k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setZoomControlsEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setCompassEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setMyLocationButtonEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setScrollGesturesEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setZoomGesturesEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setTiltGesturesEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setRotateGesturesEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      k = paramParcel1.readInt();
      if (k != 0) {
        i = j;
      }
      setAllGesturesEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      boolean bool1 = isZoomControlsEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isCompassEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isMyLocationButtonEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isScrollGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isZoomGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isTiltGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      bool1 = isRotateGesturesEnabled();
      paramParcel2.writeNoException();
      if (bool1) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      int m = paramParcel1.readInt();
      if (m != 0) {
        i = j;
      }
      setIndoorLevelPickerEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      boolean bool2 = isIndoorLevelPickerEnabled();
      paramParcel2.writeNoException();
      if (bool2) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      int n = paramParcel1.readInt();
      if (n != 0) {
        i = j;
      }
      setMapToolbarEnabled(i);
      paramParcel2.writeNoException();
      continue;
      str2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate";
      paramParcel1.enforceInterface(str2);
      boolean bool3 = isMapToolbarEnabled();
      paramParcel2.writeNoException();
      if (bool3) {
        i = j;
      }
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IUiSettingsDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */