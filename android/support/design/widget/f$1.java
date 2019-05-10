package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class f$1
  extends AnimatorListenerAdapter
{
  private boolean d;
  
  f$1(f paramf, boolean paramBoolean, f.c paramc) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.d = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object localObject = this.c;
    t localt = null;
    ((f)localObject).b = 0;
    boolean bool1 = this.d;
    if (!bool1)
    {
      localObject = this.c;
      localt = ((f)localObject).n;
      bool1 = this.a;
      if (!bool1) {
        break label83;
      }
    }
    label83:
    for (int i = 8;; i = 4)
    {
      boolean bool2 = this.a;
      localt.a(i, bool2);
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.b;
        ((f.c)localObject).b();
      }
      return;
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    t localt = this.c.n;
    boolean bool = this.a;
    localt.a(0, bool);
    this.d = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\f$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */