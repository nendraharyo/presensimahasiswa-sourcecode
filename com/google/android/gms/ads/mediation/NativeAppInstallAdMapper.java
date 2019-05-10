package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeAppInstallAdMapper
  extends NativeAdMapper
{
  private NativeAd.Image zzOo;
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private String zzya;
  private double zzyb;
  private String zzyc;
  private String zzyd;
  
  public final String getBody()
  {
    return this.zzxY;
  }
  
  public final String getCallToAction()
  {
    return this.zzya;
  }
  
  public final String getHeadline()
  {
    return this.zzxW;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.zzOo;
  }
  
  public final List getImages()
  {
    return this.zzxX;
  }
  
  public final String getPrice()
  {
    return this.zzyd;
  }
  
  public final double getStarRating()
  {
    return this.zzyb;
  }
  
  public final String getStore()
  {
    return this.zzyc;
  }
  
  public final void setBody(String paramString)
  {
    this.zzxY = paramString;
  }
  
  public final void setCallToAction(String paramString)
  {
    this.zzya = paramString;
  }
  
  public final void setHeadline(String paramString)
  {
    this.zzxW = paramString;
  }
  
  public final void setIcon(NativeAd.Image paramImage)
  {
    this.zzOo = paramImage;
  }
  
  public final void setImages(List paramList)
  {
    this.zzxX = paramList;
  }
  
  public final void setPrice(String paramString)
  {
    this.zzyd = paramString;
  }
  
  public final void setStarRating(double paramDouble)
  {
    this.zzyb = paramDouble;
  }
  
  public final void setStore(String paramString)
  {
    this.zzyc = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\NativeAppInstallAdMapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */