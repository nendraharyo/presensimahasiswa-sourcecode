package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.h.a;
import java.util.ArrayList;

class u$2
  extends AnimatorListenerAdapter
{
  u$2(u paramu, a parama) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.remove(paramAnimator);
    u.a(this.b).remove(paramAnimator);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    u.a(this.b).add(paramAnimator);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transitio\\u$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */