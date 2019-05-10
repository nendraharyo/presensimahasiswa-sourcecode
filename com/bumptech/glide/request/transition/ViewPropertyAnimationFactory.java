package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class ViewPropertyAnimationFactory
  implements TransitionFactory
{
  private ViewPropertyTransition animation;
  private final ViewPropertyTransition.Animator animator;
  
  public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator paramAnimator)
  {
    this.animator = paramAnimator;
  }
  
  public Transition build(DataSource paramDataSource, boolean paramBoolean)
  {
    Object localObject = DataSource.MEMORY_CACHE;
    if ((paramDataSource == localObject) || (!paramBoolean)) {}
    for (localObject = NoTransition.get();; localObject = this.animation)
    {
      return (Transition)localObject;
      localObject = this.animation;
      if (localObject == null)
      {
        localObject = new com/bumptech/glide/request/transition/ViewPropertyTransition;
        ViewPropertyTransition.Animator localAnimator = this.animator;
        ((ViewPropertyTransition)localObject).<init>(localAnimator);
        this.animation = ((ViewPropertyTransition)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewPropertyAnimationFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */