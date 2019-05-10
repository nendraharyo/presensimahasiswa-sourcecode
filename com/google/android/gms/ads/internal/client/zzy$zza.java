package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzy$zza
  extends Binder
  implements zzy
{
  public zzy$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public static zzy zzo(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzy)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzy;
        if (bool)
        {
          localObject = (zzy)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzy$zza$zza;
      ((zzy.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      String str = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel1.enforceInterface(str);
      zza();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel1.enforceInterface(str);
      float f = paramParcel1.readFloat();
      setAppVolume(f);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzy$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */