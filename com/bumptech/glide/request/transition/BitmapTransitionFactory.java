package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;

public class BitmapTransitionFactory
  extends BitmapContainerTransitionFactory
{
  public BitmapTransitionFactory(TransitionFactory paramTransitionFactory)
  {
    super(paramTransitionFactory);
  }
  
  protected Bitmap getBitmap(Bitmap paramBitmap)
  {
    return paramBitmap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\BitmapTransitionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */