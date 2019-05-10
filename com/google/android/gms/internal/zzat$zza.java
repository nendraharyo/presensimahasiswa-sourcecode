package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzat$zza
  extends Binder
  implements zzat
{
  public static zzat zzb(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzat)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzat;
        if (bool)
        {
          localObject = (zzat)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzat$zza$zza;
      ((zzat.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      String str = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
      paramParcel1.enforceInterface(str);
      int k = paramParcel1.readInt();
      if (k != 0) {
        k = j;
      }
      for (;;)
      {
        boolean bool = zzc(k);
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool = false;
        str = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = paramParcel1.readString();
      str = zzo(str);
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = paramParcel1.readString();
      int m = paramParcel1.readInt();
      if (m != 0) {
        i = j;
      }
      zzb(str, i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzat$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */