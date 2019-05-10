package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import java.util.List;

class AbstractAdViewAdapter$zza
  extends NativeAppInstallAdMapper
{
  private final NativeAppInstallAd zzaZ;
  
  public AbstractAdViewAdapter$zza(NativeAppInstallAd paramNativeAppInstallAd)
  {
    this.zzaZ = paramNativeAppInstallAd;
    Object localObject = paramNativeAppInstallAd.getHeadline().toString();
    setHeadline((String)localObject);
    localObject = paramNativeAppInstallAd.getImages();
    setImages((List)localObject);
    localObject = paramNativeAppInstallAd.getBody().toString();
    setBody((String)localObject);
    localObject = paramNativeAppInstallAd.getIcon();
    setIcon((NativeAd.Image)localObject);
    localObject = paramNativeAppInstallAd.getCallToAction().toString();
    setCallToAction((String)localObject);
    double d = paramNativeAppInstallAd.getStarRating().doubleValue();
    setStarRating(d);
    localObject = paramNativeAppInstallAd.getStore().toString();
    setStore((String)localObject);
    localObject = paramNativeAppInstallAd.getPrice().toString();
    setPrice((String)localObject);
    setOverrideImpressionRecording(bool);
    setOverrideClickHandling(bool);
  }
  
  public void trackView(View paramView)
  {
    boolean bool = paramView instanceof NativeAdView;
    if (bool)
    {
      paramView = (NativeAdView)paramView;
      NativeAppInstallAd localNativeAppInstallAd = this.zzaZ;
      paramView.setNativeAd(localNativeAppInstallAd);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */