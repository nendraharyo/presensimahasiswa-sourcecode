package com.bumptech.glide;

import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;

public final class GenericTransitionOptions
  extends TransitionOptions
{
  public static GenericTransitionOptions with(int paramInt)
  {
    GenericTransitionOptions localGenericTransitionOptions = new com/bumptech/glide/GenericTransitionOptions;
    localGenericTransitionOptions.<init>();
    return (GenericTransitionOptions)localGenericTransitionOptions.transition(paramInt);
  }
  
  public static GenericTransitionOptions with(TransitionFactory paramTransitionFactory)
  {
    GenericTransitionOptions localGenericTransitionOptions = new com/bumptech/glide/GenericTransitionOptions;
    localGenericTransitionOptions.<init>();
    return (GenericTransitionOptions)localGenericTransitionOptions.transition(paramTransitionFactory);
  }
  
  public static GenericTransitionOptions with(ViewPropertyTransition.Animator paramAnimator)
  {
    GenericTransitionOptions localGenericTransitionOptions = new com/bumptech/glide/GenericTransitionOptions;
    localGenericTransitionOptions.<init>();
    return (GenericTransitionOptions)localGenericTransitionOptions.transition(paramAnimator);
  }
  
  public static GenericTransitionOptions withNoTransition()
  {
    GenericTransitionOptions localGenericTransitionOptions = new com/bumptech/glide/GenericTransitionOptions;
    localGenericTransitionOptions.<init>();
    return (GenericTransitionOptions)localGenericTransitionOptions.dontTransition();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\GenericTransitionOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */