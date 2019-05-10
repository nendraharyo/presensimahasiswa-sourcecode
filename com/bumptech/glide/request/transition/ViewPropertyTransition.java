package com.bumptech.glide.request.transition;

import android.view.View;

public class ViewPropertyTransition
  implements Transition
{
  private final ViewPropertyTransition.Animator animator;
  
  public ViewPropertyTransition(ViewPropertyTransition.Animator paramAnimator)
  {
    this.animator = paramAnimator;
  }
  
  public boolean transition(Object paramObject, Transition.ViewAdapter paramViewAdapter)
  {
    Object localObject = paramViewAdapter.getView();
    if (localObject != null)
    {
      localObject = this.animator;
      View localView = paramViewAdapter.getView();
      ((ViewPropertyTransition.Animator)localObject).animate(localView);
    }
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\ViewPropertyTransition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */