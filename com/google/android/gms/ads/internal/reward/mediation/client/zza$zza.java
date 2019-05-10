package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public zza$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public static zza zzae(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/reward/mediation/client/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzg((zzd)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      zzb((zzd)localObject, k);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzh((zzd)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzi((zzd)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzj((zzd)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzk((zzd)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = paramParcel1.readStrongBinder();
      zzd localzzd = zzd.zza.zzbs((IBinder)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = RewardItemParcel.CREATOR.zzo(paramParcel1);; localObject = null)
      {
        zza(localzzd, (RewardItemParcel)localObject);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzl((zzd)localObject);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      k = paramParcel1.readInt();
      zzc((zzd)localObject, k);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzm((zzd)localObject);
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\mediation\client\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */