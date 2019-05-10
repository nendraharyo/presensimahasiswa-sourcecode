package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

public class ViewTransition
  implements Transition
{
  private final ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;
  
  ViewTransition(ViewTransition.ViewTransitionAnimationFactory paramViewTransitionAnimationFactory)
  {
    this.viewTransitionAnimationFactory = paramViewTransitionAnimationFactory;
  }
  
  public boolean transition(Object paramObject, Transition.ViewAdapter paramViewAdapter)
  {
    View localView = paramViewAdapter.getView();
    if (localView != null)
    {
      localView.clearAnimation();
      Object localObject = this.viewTransitionAnimationFactory;
      Context localContext = localView.getContext();
      localObject = ((ViewTransition.ViewTransitionAnimationFactory)localObject).build(localContext);
      localView.startAnimation((Animation)localObject);
    }
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewTransition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */