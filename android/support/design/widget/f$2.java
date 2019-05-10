package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class f$2
  extends AnimatorListenerAdapter
{
  f$2(f paramf, boolean paramBoolean, f.c paramc) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.c.b = 0;
    f.c localc = this.b;
    if (localc != null)
    {
      localc = this.b;
      localc.a();
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    t localt = this.c.n;
    boolean bool = this.a;
    localt.a(0, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\f$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */