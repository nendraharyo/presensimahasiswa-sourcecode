package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public zzb$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public static zzb zzaa(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzb;
        if (bool)
        {
          localObject = (zzb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/reward/client/zzb$zza$zza;
      ((zzb.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = RewardedVideoAdRequestParcel.CREATOR.zzn(paramParcel1);; localObject = null)
      {
        zza((RewardedVideoAdRequestParcel)localObject);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      show();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = zzd.zza.zzac(paramParcel1.readStrongBinder());
      zza((zzd)localObject);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = paramParcel1.readString();
      setUserId((String)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      int k = isLoaded();
      paramParcel2.writeNoException();
      if (k != 0) {
        k = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(k);
        break;
        int m = 0;
        localObject = null;
      }
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      pause();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      resume();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      destroy();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */