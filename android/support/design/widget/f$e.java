package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

abstract class f$e
  extends AnimatorListenerAdapter
  implements ValueAnimator.AnimatorUpdateListener
{
  private boolean a;
  private float c;
  private float d;
  
  private f$e(f paramf) {}
  
  protected abstract float a();
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    j localj = this.b.c;
    float f = this.d;
    localj.b(f);
    this.a = false;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    boolean bool = this.a;
    if (!bool)
    {
      localj = this.b.c;
      float f1 = localj.a();
      this.c = f1;
      f1 = a();
      this.d = f1;
      bool = true;
      f1 = Float.MIN_VALUE;
      this.a = bool;
    }
    j localj = this.b.c;
    float f2 = this.c;
    float f3 = this.d;
    float f4 = this.c;
    f3 -= f4;
    f4 = paramValueAnimator.getAnimatedFraction();
    f3 *= f4;
    f2 += f3;
    localj.b(f2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\f$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */