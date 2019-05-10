package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

class AbstractAdViewAdapter$1
  implements RewardedVideoAdListener
{
  AbstractAdViewAdapter$1(AbstractAdViewAdapter paramAbstractAdViewAdapter) {}
  
  public void onRewarded(RewardItem paramRewardItem)
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onRewarded(localAbstractAdViewAdapter, paramRewardItem);
  }
  
  public void onRewardedVideoAdClosed()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onAdClosed(localAbstractAdViewAdapter);
    AbstractAdViewAdapter.zza(this.zzaY, null);
  }
  
  public void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onAdFailedToLoad(localAbstractAdViewAdapter, paramInt);
  }
  
  public void onRewardedVideoAdLeftApplication()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onAdLeftApplication(localAbstractAdViewAdapter);
  }
  
  public void onRewardedVideoAdLoaded()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onAdLoaded(localAbstractAdViewAdapter);
  }
  
  public void onRewardedVideoAdOpened()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onAdOpened(localAbstractAdViewAdapter);
  }
  
  public void onRewardedVideoStarted()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = AbstractAdViewAdapter.zza(this.zzaY);
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzaY;
    localMediationRewardedVideoAdListener.onVideoStarted(localAbstractAdViewAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */