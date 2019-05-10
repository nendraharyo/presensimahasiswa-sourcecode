package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class b$2
  extends AnimatorListenerAdapter
{
  b$2(b paramb, int paramInt) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    b localb = this.b;
    int i = this.a;
    localb.c(i);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    b.a(this.b).b(0, 180);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */