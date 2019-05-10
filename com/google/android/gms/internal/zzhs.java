package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public class zzhs
  extends zzb.zza
{
  private final Context mContext;
  private final zzht zzKu;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  
  public zzhs(Context paramContext, com.google.android.gms.ads.internal.zzd paramzzd, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    this.mContext = paramContext;
    this.zzpT = paramVersionInfoParcel;
    Object localObject = new com/google/android/gms/internal/zzht;
    AdSizeParcel localAdSizeParcel = AdSizeParcel.zzcP();
    ((zzht)localObject).<init>(paramContext, paramzzd, localAdSizeParcel, paramzzex, paramVersionInfoParcel);
    this.zzKu = ((zzht)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
  }
  
  public void destroy()
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.destroy();
      return;
    }
  }
  
  public boolean isLoaded()
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      boolean bool = localzzht.isLoaded();
      return bool;
    }
  }
  
  public void pause()
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.pause();
      return;
    }
  }
  
  public void resume()
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.resume();
      return;
    }
  }
  
  public void setUserId(String paramString)
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.setUserId(paramString);
      return;
    }
  }
  
  public void show()
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.zzgL();
      return;
    }
  }
  
  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.zza(paramRewardedVideoAdRequestParcel);
      return;
    }
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      zzht localzzht = this.zzKu;
      localzzht.zza(paramzzd);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */