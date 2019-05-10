package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class at$1
  extends AnimatorListenerAdapter
{
  at$1(at paramat, ae paramae, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ae localae = this.a;
    View localView = this.b;
    localae.b(localView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\at$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */