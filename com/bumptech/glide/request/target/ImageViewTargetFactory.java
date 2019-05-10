package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class ImageViewTargetFactory
{
  public ViewTarget buildTarget(ImageView paramImageView, Class paramClass)
  {
    Object localObject1 = Bitmap.class;
    boolean bool = localObject1.equals(paramClass);
    if (bool)
    {
      localObject1 = new com/bumptech/glide/request/target/BitmapImageViewTarget;
      ((BitmapImageViewTarget)localObject1).<init>(paramImageView);
    }
    for (;;)
    {
      return (ViewTarget)localObject1;
      localObject1 = Drawable.class;
      bool = ((Class)localObject1).isAssignableFrom(paramClass);
      if (!bool) {
        break;
      }
      localObject1 = new com/bumptech/glide/request/target/DrawableImageViewTarget;
      ((DrawableImageViewTarget)localObject1).<init>(paramImageView);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unhandled class: " + paramClass + ", try .as*(Class).transcode(ResourceTranscoder)";
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\ImageViewTargetFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */