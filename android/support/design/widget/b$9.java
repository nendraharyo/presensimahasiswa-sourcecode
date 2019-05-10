package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.r;

class b$9
  implements ValueAnimator.AnimatorUpdateListener
{
  private int c;
  
  b$9(b paramb, int paramInt)
  {
    int i = this.a;
    this.c = i;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    Integer localInteger = (Integer)paramValueAnimator.getAnimatedValue();
    int i = localInteger.intValue();
    boolean bool = b.f();
    b.f localf;
    if (bool)
    {
      localf = this.b.b;
      int j = this.c;
      j = i - j;
      r.c(localf, j);
    }
    for (;;)
    {
      this.c = i;
      return;
      localf = this.b.b;
      float f = i;
      localf.setTranslationY(f);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */