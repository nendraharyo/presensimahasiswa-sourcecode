package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public zza$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  public static zza zzZ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/reward/client/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.ads.internal.reward.client.IRewardItem";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      str = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.reward.client.IRewardItem";
      paramParcel1.enforceInterface(str);
      int i = getAmount();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */