package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class TextInputLayout$5
  implements ValueAnimator.AnimatorUpdateListener
{
  TextInputLayout$5(TextInputLayout paramTextInputLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    d locald = this.a.d;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    locald.b(f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */