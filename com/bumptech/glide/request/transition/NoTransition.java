package com.bumptech.glide.request.transition;

public class NoTransition
  implements Transition
{
  static final NoTransition NO_ANIMATION;
  private static final TransitionFactory NO_ANIMATION_FACTORY;
  
  static
  {
    Object localObject = new com/bumptech/glide/request/transition/NoTransition;
    ((NoTransition)localObject).<init>();
    NO_ANIMATION = (NoTransition)localObject;
    localObject = new com/bumptech/glide/request/transition/NoTransition$NoAnimationFactory;
    ((NoTransition.NoAnimationFactory)localObject).<init>();
    NO_ANIMATION_FACTORY = (TransitionFactory)localObject;
  }
  
  public static Transition get()
  {
    return NO_ANIMATION;
  }
  
  public static TransitionFactory getFactory()
  {
    return NO_ANIMATION_FACTORY;
  }
  
  public boolean transition(Object paramObject, Transition.ViewAdapter paramViewAdapter)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\NoTransition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */