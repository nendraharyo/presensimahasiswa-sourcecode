package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeContentAdMapper
  extends NativeAdMapper
{
  private NativeAd.Image zzOp;
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private String zzya;
  private String zzyh;
  
  public final String getAdvertiser()
  {
    return this.zzyh;
  }
  
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
  
  public final List getImages()
  {
    return this.zzxX;
  }
  
  public final NativeAd.Image getLogo()
  {
    return this.zzOp;
  }
  
  public final void setAdvertiser(String paramString)
  {
    this.zzyh = paramString;
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
  
  public final void setImages(List paramList)
  {
    this.zzxX = paramList;
  }
  
  public final void setLogo(NativeAd.Image paramImage)
  {
    this.zzOp = paramImage;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\NativeContentAdMapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */