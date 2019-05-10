package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class GifDrawable$GifState
  extends Drawable.ConstantState
{
  final GifFrameLoader frameLoader;
  
  GifDrawable$GifState(GifFrameLoader paramGifFrameLoader)
  {
    this.frameLoader = paramGifFrameLoader;
  }
  
  public int getChangingConfigurations()
  {
    return 0;
  }
  
  public Drawable newDrawable()
  {
    GifDrawable localGifDrawable = new com/bumptech/glide/load/resource/gif/GifDrawable;
    localGifDrawable.<init>(this);
    return localGifDrawable;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return newDrawable();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifDrawable$GifState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */