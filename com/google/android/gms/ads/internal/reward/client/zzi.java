package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class zzi
  implements RewardedVideoAd
{
  private final Context mContext;
  private final zzb zzKA;
  private RewardedVideoAdListener zzaX;
  private final Object zzpV;
  private String zzrG;
  
  public zzi(Context paramContext, zzb paramzzb)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzKA = paramzzb;
    this.mContext = paramContext;
  }
  
  public void destroy()
  {
    synchronized (this.zzpV)
    {
      zzb localzzb = this.zzKA;
      if (localzzb == null) {
        return;
      }
      try
      {
        localzzb = this.zzKA;
        localzzb.destroy();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str = "Could not forward destroy to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
    }
  }
  
  public RewardedVideoAdListener getRewardedVideoAdListener()
  {
    synchronized (this.zzpV)
    {
      RewardedVideoAdListener localRewardedVideoAdListener = this.zzaX;
      return localRewardedVideoAdListener;
    }
  }
  
  public String getUserId()
  {
    synchronized (this.zzpV)
    {
      String str = this.zzrG;
      return str;
    }
  }
  
  public boolean isLoaded()
  {
    boolean bool = false;
    Object localObject1 = null;
    String str;
    for (;;)
    {
      zzb localzzb;
      synchronized (this.zzpV)
      {
        localzzb = this.zzKA;
        if (localzzb == null) {
          return bool;
        }
      }
    }
  }
  
  public void loadAd(String paramString, AdRequest paramAdRequest)
  {
    synchronized (this.zzpV)
    {
      zzb localzzb = this.zzKA;
      if (localzzb == null) {
        return;
      }
      try
      {
        localzzb = this.zzKA;
        localObject3 = zzh.zzcO();
        Context localContext = this.mContext;
        zzaa localzzaa = paramAdRequest.zzaE();
        localObject3 = ((zzh)localObject3).zza(localContext, localzzaa, paramString);
        localzzb.zza((RewardedVideoAdRequestParcel)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject3 = "Could not forward loadAd to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject3, localRemoteException);
        }
      }
    }
  }
  
  public void pause()
  {
    synchronized (this.zzpV)
    {
      zzb localzzb = this.zzKA;
      if (localzzb == null) {
        return;
      }
      try
      {
        localzzb = this.zzKA;
        localzzb.pause();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str = "Could not forward pause to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
    }
  }
  
  public void resume()
  {
    synchronized (this.zzpV)
    {
      zzb localzzb = this.zzKA;
      if (localzzb == null) {
        return;
      }
      try
      {
        localzzb = this.zzKA;
        localzzb.resume();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str = "Could not forward resume to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
    }
  }
  
  public void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    synchronized (this.zzpV)
    {
      this.zzaX = paramRewardedVideoAdListener;
      zzb localzzb = this.zzKA;
      if (localzzb != null) {}
      try
      {
        localzzb = this.zzKA;
        localObject3 = new com/google/android/gms/ads/internal/reward/client/zzg;
        ((zzg)localObject3).<init>(paramRewardedVideoAdListener);
        localzzb.zza((zzd)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject3 = "Could not forward setRewardedVideoAdListener to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject3, localRemoteException);
        }
      }
      return;
    }
  }
  
  public void setUserId(String paramString)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzrG;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool)
      {
        localObject2 = "A user id has already been set, ignoring.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
        return;
      }
      this.zzrG = paramString;
      localObject2 = this.zzKA;
      if (localObject2 != null) {}
      try
      {
        localObject2 = this.zzKA;
        ((zzb)localObject2).setUserId(paramString);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str = "Could not forward setUserId to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
    }
  }
  
  public void show()
  {
    synchronized (this.zzpV)
    {
      zzb localzzb = this.zzKA;
      if (localzzb == null) {
        return;
      }
      try
      {
        localzzb = this.zzKA;
        localzzb.show();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str = "Could not forward show to RewardedVideoAd";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */