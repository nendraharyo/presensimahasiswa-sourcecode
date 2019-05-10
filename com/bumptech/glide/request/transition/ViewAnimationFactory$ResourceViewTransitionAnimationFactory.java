package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

class ViewAnimationFactory$ResourceViewTransitionAnimationFactory
  implements ViewTransition.ViewTransitionAnimationFactory
{
  private final int animationId;
  
  ViewAnimationFactory$ResourceViewTransitionAnimationFactory(int paramInt)
  {
    this.animationId = paramInt;
  }
  
  public Animation build(Context paramContext)
  {
    int i = this.animationId;
    return AnimationUtils.loadAnimation(paramContext, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewAnimationFactory$ResourceViewTransitionAnimationFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */