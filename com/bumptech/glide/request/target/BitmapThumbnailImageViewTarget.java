package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class BitmapThumbnailImageViewTarget
  extends ThumbnailImageViewTarget
{
  public BitmapThumbnailImageViewTarget(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  public BitmapThumbnailImageViewTarget(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  protected Drawable getDrawable(Bitmap paramBitmap)
  {
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Resources localResources = ((ImageView)this.view).getResources();
    localBitmapDrawable.<init>(localResources, paramBitmap);
    return localBitmapDrawable;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\BitmapThumbnailImageViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */