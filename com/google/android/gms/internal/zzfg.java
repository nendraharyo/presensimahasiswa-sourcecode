package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzfg
  extends zzfb.zza
{
  private final NativeAppInstallAdMapper zzCM;
  
  public zzfg(NativeAppInstallAdMapper paramNativeAppInstallAdMapper)
  {
    this.zzCM = paramNativeAppInstallAdMapper;
  }
  
  public String getBody()
  {
    return this.zzCM.getBody();
  }
  
  public String getCallToAction()
  {
    return this.zzCM.getCallToAction();
  }
  
  public Bundle getExtras()
  {
    return this.zzCM.getExtras();
  }
  
  public String getHeadline()
  {
    return this.zzCM.getHeadline();
  }
  
  public List getImages()
  {
    Object localObject = this.zzCM.getImages();
    ArrayList localArrayList;
    boolean bool;
    if (localObject != null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (NativeAd.Image)localIterator.next();
        zzc localzzc = new com/google/android/gms/ads/internal/formats/zzc;
        Drawable localDrawable = ((NativeAd.Image)localObject).getDrawable();
        Uri localUri = ((NativeAd.Image)localObject).getUri();
        double d = ((NativeAd.Image)localObject).getScale();
        localzzc.<init>(localDrawable, localUri, d);
        localArrayList.add(localzzc);
      }
    }
    for (localObject = localArrayList;; localObject = null)
    {
      return (List)localObject;
      bool = false;
    }
  }
  
  public boolean getOverrideClickHandling()
  {
    return this.zzCM.getOverrideClickHandling();
  }
  
  public boolean getOverrideImpressionRecording()
  {
    return this.zzCM.getOverrideImpressionRecording();
  }
  
  public String getPrice()
  {
    return this.zzCM.getPrice();
  }
  
  public double getStarRating()
  {
    return this.zzCM.getStarRating();
  }
  
  public String getStore()
  {
    return this.zzCM.getStore();
  }
  
  public void recordImpression()
  {
    this.zzCM.recordImpression();
  }
  
  public void zzc(zzd paramzzd)
  {
    NativeAppInstallAdMapper localNativeAppInstallAdMapper = this.zzCM;
    View localView = (View)zze.zzp(paramzzd);
    localNativeAppInstallAdMapper.handleClick(localView);
  }
  
  public void zzd(zzd paramzzd)
  {
    NativeAppInstallAdMapper localNativeAppInstallAdMapper = this.zzCM;
    View localView = (View)zze.zzp(paramzzd);
    localNativeAppInstallAdMapper.trackView(localView);
  }
  
  public zzch zzdK()
  {
    Object localObject = this.zzCM;
    NativeAd.Image localImage = ((NativeAppInstallAdMapper)localObject).getIcon();
    if (localImage != null)
    {
      localObject = new com/google/android/gms/ads/internal/formats/zzc;
      Drawable localDrawable = localImage.getDrawable();
      Uri localUri = localImage.getUri();
      double d = localImage.getScale();
      ((zzc)localObject).<init>(localDrawable, localUri, d);
    }
    for (;;)
    {
      return (zzch)localObject;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */