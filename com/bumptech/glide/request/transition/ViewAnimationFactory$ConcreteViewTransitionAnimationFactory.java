package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;

class ViewAnimationFactory$ConcreteViewTransitionAnimationFactory
  implements ViewTransition.ViewTransitionAnimationFactory
{
  private final Animation animation;
  
  ViewAnimationFactory$ConcreteViewTransitionAnimationFactory(Animation paramAnimation)
  {
    this.animation = paramAnimation;
  }
  
  public Animation build(Context paramContext)
  {
    return this.animation;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewAnimationFactory$ConcreteViewTransitionAnimationFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */