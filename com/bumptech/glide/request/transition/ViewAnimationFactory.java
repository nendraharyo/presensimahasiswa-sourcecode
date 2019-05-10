package com.bumptech.glide.request.transition;

import android.view.animation.Animation;
import com.bumptech.glide.load.DataSource;

public class ViewAnimationFactory
  implements TransitionFactory
{
  private Transition transition;
  private final ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;
  
  public ViewAnimationFactory(int paramInt)
  {
    this(localResourceViewTransitionAnimationFactory);
  }
  
  public ViewAnimationFactory(Animation paramAnimation)
  {
    this(localConcreteViewTransitionAnimationFactory);
  }
  
  ViewAnimationFactory(ViewTransition.ViewTransitionAnimationFactory paramViewTransitionAnimationFactory)
  {
    this.viewTransitionAnimationFactory = paramViewTransitionAnimationFactory;
  }
  
  public Transition build(DataSource paramDataSource, boolean paramBoolean)
  {
    Object localObject = DataSource.MEMORY_CACHE;
    if ((paramDataSource == localObject) || (!paramBoolean)) {}
    for (localObject = NoTransition.get();; localObject = this.transition)
    {
      return (Transition)localObject;
      localObject = this.transition;
      if (localObject == null)
      {
        localObject = new com/bumptech/glide/request/transition/ViewTransition;
        ViewTransition.ViewTransitionAnimationFactory localViewTransitionAnimationFactory = this.viewTransitionAnimationFactory;
        ((ViewTransition)localObject).<init>(localViewTransitionAnimationFactory);
        this.transition = ((Transition)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewAnimationFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */