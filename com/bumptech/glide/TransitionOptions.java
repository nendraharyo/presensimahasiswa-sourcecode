package com.bumptech.glide;

import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;
import com.bumptech.glide.util.Preconditions;

public abstract class TransitionOptions
  implements Cloneable
{
  private TransitionFactory transitionFactory;
  
  public TransitionOptions()
  {
    TransitionFactory localTransitionFactory = NoTransition.getFactory();
    this.transitionFactory = localTransitionFactory;
  }
  
  private TransitionOptions self()
  {
    return this;
  }
  
  public final TransitionOptions clone()
  {
    try
    {
      Object localObject = super.clone();
      return (TransitionOptions)localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localCloneNotSupportedException);
      throw localRuntimeException;
    }
  }
  
  public final TransitionOptions dontTransition()
  {
    TransitionFactory localTransitionFactory = NoTransition.getFactory();
    return transition(localTransitionFactory);
  }
  
  final TransitionFactory getTransitionFactory()
  {
    return this.transitionFactory;
  }
  
  public final TransitionOptions transition(int paramInt)
  {
    ViewAnimationFactory localViewAnimationFactory = new com/bumptech/glide/request/transition/ViewAnimationFactory;
    localViewAnimationFactory.<init>(paramInt);
    return transition(localViewAnimationFactory);
  }
  
  public final TransitionOptions transition(TransitionFactory paramTransitionFactory)
  {
    TransitionFactory localTransitionFactory = (TransitionFactory)Preconditions.checkNotNull(paramTransitionFactory);
    this.transitionFactory = localTransitionFactory;
    return self();
  }
  
  public final TransitionOptions transition(ViewPropertyTransition.Animator paramAnimator)
  {
    ViewPropertyAnimationFactory localViewPropertyAnimationFactory = new com/bumptech/glide/request/transition/ViewPropertyAnimationFactory;
    localViewPropertyAnimationFactory.<init>(paramAnimator);
    return transition(localViewPropertyAnimationFactory);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\TransitionOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */