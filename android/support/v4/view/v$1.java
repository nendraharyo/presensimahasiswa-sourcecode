package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class v$1
  extends AnimatorListenerAdapter
{
  v$1(v paramv, w paramw, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    w localw = this.a;
    View localView = this.b;
    localw.onAnimationCancel(localView);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    w localw = this.a;
    View localView = this.b;
    localw.onAnimationEnd(localView);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    w localw = this.a;
    View localView = this.b;
    localw.onAnimationStart(localView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\v$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */