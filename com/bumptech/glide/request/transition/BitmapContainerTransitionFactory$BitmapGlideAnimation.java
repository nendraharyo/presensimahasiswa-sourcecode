package com.bumptech.glide.request.transition;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

final class BitmapContainerTransitionFactory$BitmapGlideAnimation
  implements Transition
{
  private final Transition transition;
  
  BitmapContainerTransitionFactory$BitmapGlideAnimation(BitmapContainerTransitionFactory paramBitmapContainerTransitionFactory, Transition paramTransition)
  {
    this.transition = paramTransition;
  }
  
  public boolean transition(Object paramObject, Transition.ViewAdapter paramViewAdapter)
  {
    Resources localResources = paramViewAdapter.getView().getResources();
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Bitmap localBitmap = this.this$0.getBitmap(paramObject);
    localBitmapDrawable.<init>(localResources, localBitmap);
    return this.transition.transition(localBitmapDrawable, paramViewAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\BitmapContainerTransitionFactory$BitmapGlideAnimation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */