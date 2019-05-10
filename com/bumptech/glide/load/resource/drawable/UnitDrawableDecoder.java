package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

public class UnitDrawableDecoder
  implements ResourceDecoder
{
  public Resource decode(Drawable paramDrawable, int paramInt1, int paramInt2, Options paramOptions)
  {
    return NonOwnedDrawableResource.newInstance(paramDrawable);
  }
  
  public boolean handles(Drawable paramDrawable, Options paramOptions)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\UnitDrawableDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */