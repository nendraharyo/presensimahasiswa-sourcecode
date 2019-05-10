package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public abstract class ThumbnailImageViewTarget
  extends ImageViewTarget
{
  public ThumbnailImageViewTarget(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  public ThumbnailImageViewTarget(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  protected abstract Drawable getDrawable(Object paramObject);
  
  protected void setResource(Object paramObject)
  {
    Object localObject1 = (ImageView)this.view;
    ViewGroup.LayoutParams localLayoutParams = ((ImageView)localObject1).getLayoutParams();
    Object localObject2 = getDrawable(paramObject);
    if (localLayoutParams != null)
    {
      int i = localLayoutParams.width;
      if (i > 0)
      {
        i = localLayoutParams.height;
        if (i > 0)
        {
          localObject1 = new com/bumptech/glide/request/target/FixedSizeDrawable;
          int j = localLayoutParams.width;
          int k = localLayoutParams.height;
          ((FixedSizeDrawable)localObject1).<init>((Drawable)localObject2, j, k);
          localObject2 = localObject1;
        }
      }
    }
    ((ImageView)this.view).setImageDrawable((Drawable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\ThumbnailImageViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */