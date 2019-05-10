package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzfh
  extends zzfc.zza
{
  private final NativeContentAdMapper zzCN;
  
  public zzfh(NativeContentAdMapper paramNativeContentAdMapper)
  {
    this.zzCN = paramNativeContentAdMapper;
  }
  
  public String getAdvertiser()
  {
    return this.zzCN.getAdvertiser();
  }
  
  public String getBody()
  {
    return this.zzCN.getBody();
  }
  
  public String getCallToAction()
  {
    return this.zzCN.getCallToAction();
  }
  
  public Bundle getExtras()
  {
    return this.zzCN.getExtras();
  }
  
  public String getHeadline()
  {
    return this.zzCN.getHeadline();
  }
  
  public List getImages()
  {
    Object localObject = this.zzCN.getImages();
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
    return this.zzCN.getOverrideClickHandling();
  }
  
  public boolean getOverrideImpressionRecording()
  {
    return this.zzCN.getOverrideImpressionRecording();
  }
  
  public void recordImpression()
  {
    this.zzCN.recordImpression();
  }
  
  public void zzc(zzd paramzzd)
  {
    NativeContentAdMapper localNativeContentAdMapper = this.zzCN;
    View localView = (View)zze.zzp(paramzzd);
    localNativeContentAdMapper.handleClick(localView);
  }
  
  public void zzd(zzd paramzzd)
  {
    NativeContentAdMapper localNativeContentAdMapper = this.zzCN;
    View localView = (View)zze.zzp(paramzzd);
    localNativeContentAdMapper.trackView(localView);
  }
  
  public zzch zzdO()
  {
    Object localObject = this.zzCN;
    NativeAd.Image localImage = ((NativeContentAdMapper)localObject).getLogo();
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */