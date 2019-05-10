package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class ImageManager$zze
  implements ComponentCallbacks2
{
  private final ImageManager.zzb zzajE;
  
  public ImageManager$zze(ImageManager.zzb paramzzb)
  {
    this.zzajE = paramzzb;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory()
  {
    this.zzajE.evictAll();
  }
  
  public void onTrimMemory(int paramInt)
  {
    int i = 60;
    ImageManager.zzb localzzb1;
    if (paramInt >= i)
    {
      localzzb1 = this.zzajE;
      localzzb1.evictAll();
    }
    for (;;)
    {
      return;
      i = 20;
      if (paramInt >= i)
      {
        localzzb1 = this.zzajE;
        ImageManager.zzb localzzb2 = this.zzajE;
        int j = localzzb2.size() / 2;
        localzzb1.trimToSize(j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */