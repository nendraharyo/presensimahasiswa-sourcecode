package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class u$3
  extends AnimatorListenerAdapter
{
  u$3(u paramu) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.k();
    paramAnimator.removeListener(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transitio\\u$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */