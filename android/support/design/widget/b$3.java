package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.r;

class b$3
  implements ValueAnimator.AnimatorUpdateListener
{
  private int b = 0;
  
  b$3(b paramb) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    Integer localInteger = (Integer)paramValueAnimator.getAnimatedValue();
    int i = localInteger.intValue();
    boolean bool = b.f();
    b.f localf;
    if (bool)
    {
      localf = this.a.b;
      int j = this.b;
      j = i - j;
      r.c(localf, j);
    }
    for (;;)
    {
      this.b = i;
      return;
      localf = this.a.b;
      float f = i;
      localf.setTranslationY(f);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */