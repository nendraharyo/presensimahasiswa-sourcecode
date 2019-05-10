package android.support.v4.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class v$2
  implements ValueAnimator.AnimatorUpdateListener
{
  v$2(v paramv, y paramy, View paramView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    y localy = this.a;
    View localView = this.b;
    localy.onAnimationUpdate(localView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\v$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */