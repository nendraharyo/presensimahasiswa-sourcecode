package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import java.util.List;

class AbstractAdViewAdapter$zzb
  extends NativeContentAdMapper
{
  private final NativeContentAd zzba;
  
  public AbstractAdViewAdapter$zzb(NativeContentAd paramNativeContentAd)
  {
    this.zzba = paramNativeContentAd;
    Object localObject = paramNativeContentAd.getHeadline().toString();
    setHeadline((String)localObject);
    localObject = paramNativeContentAd.getImages();
    setImages((List)localObject);
    localObject = paramNativeContentAd.getBody().toString();
    setBody((String)localObject);
    localObject = paramNativeContentAd.getLogo();
    setLogo((NativeAd.Image)localObject);
    localObject = paramNativeContentAd.getCallToAction().toString();
    setCallToAction((String)localObject);
    localObject = paramNativeContentAd.getAdvertiser().toString();
    setAdvertiser((String)localObject);
    setOverrideImpressionRecording(bool);
    setOverrideClickHandling(bool);
  }
  
  public void trackView(View paramView)
  {
    boolean bool = paramView instanceof NativeAdView;
    if (bool)
    {
      paramView = (NativeAdView)paramView;
      NativeContentAd localNativeContentAd = this.zzba;
      paramView.setNativeAd(localNativeContentAd);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */