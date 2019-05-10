package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public static zzd zzac(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/reward/client/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      onRewardedVideoAdLoaded();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      onRewardedVideoAdOpened();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      onRewardedVideoStarted();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      onRewardedVideoAdClosed();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
      localObject = zza.zza.zzZ(paramParcel1.readStrongBinder());
      zza((zza)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      onRewardedVideoAdLeftApplication();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
      paramParcel1.enforceInterface((String)localObject);
      int i = paramParcel1.readInt();
      onRewardedVideoAdFailedToLoad(i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */