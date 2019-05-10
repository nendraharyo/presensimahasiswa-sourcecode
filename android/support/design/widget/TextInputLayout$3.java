package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

class TextInputLayout$3
  extends AnimatorListenerAdapter
{
  TextInputLayout$3(TextInputLayout paramTextInputLayout, CharSequence paramCharSequence) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    TextView localTextView = this.b.b;
    CharSequence localCharSequence = this.a;
    localTextView.setText(localCharSequence);
    this.b.b.setVisibility(4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */