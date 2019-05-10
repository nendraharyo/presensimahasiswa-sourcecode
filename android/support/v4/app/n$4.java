package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class n$4
  extends AnimatorListenerAdapter
{
  n$4(n paramn, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object localObject = this.a;
    View localView = this.b;
    ((ViewGroup)localObject).endViewTransition(localView);
    paramAnimator.removeListener(this);
    localObject = this.c.mView;
    if (localObject != null)
    {
      localObject = this.c.mView;
      int i = 8;
      ((View)localObject).setVisibility(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */