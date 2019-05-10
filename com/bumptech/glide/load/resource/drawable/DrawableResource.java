package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.Preconditions;

public abstract class DrawableResource
  implements Initializable, Resource
{
  protected final Drawable drawable;
  
  public DrawableResource(Drawable paramDrawable)
  {
    Drawable localDrawable = (Drawable)Preconditions.checkNotNull(paramDrawable);
    this.drawable = localDrawable;
  }
  
  public final Drawable get()
  {
    Object localObject = this.drawable.getConstantState();
    if (localObject == null) {}
    for (localObject = this.drawable;; localObject = ((Drawable.ConstantState)localObject).newDrawable()) {
      return (Drawable)localObject;
    }
  }
  
  public void initialize()
  {
    Object localObject = this.drawable;
    boolean bool = localObject instanceof BitmapDrawable;
    if (bool)
    {
      localObject = ((BitmapDrawable)this.drawable).getBitmap();
      ((Bitmap)localObject).prepareToDraw();
    }
    for (;;)
    {
      return;
      localObject = this.drawable;
      bool = localObject instanceof GifDrawable;
      if (bool)
      {
        localObject = ((GifDrawable)this.drawable).getFirstFrame();
        ((Bitmap)localObject).prepareToDraw();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\DrawableResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */