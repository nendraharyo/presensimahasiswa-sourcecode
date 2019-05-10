package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

public abstract class NativeContentAd
  extends NativeAd
{
  public abstract void destroy();
  
  public abstract CharSequence getAdvertiser();
  
  public abstract CharSequence getBody();
  
  public abstract CharSequence getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract CharSequence getHeadline();
  
  public abstract List getImages();
  
  public abstract NativeAd.Image getLogo();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\formats\NativeContentAd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */