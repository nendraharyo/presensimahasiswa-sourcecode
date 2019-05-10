package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class AppBarLayout$Behavior$1
  implements ValueAnimator.AnimatorUpdateListener
{
  AppBarLayout$Behavior$1(AppBarLayout.Behavior paramBehavior, CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppBarLayout.Behavior localBehavior = this.c;
    CoordinatorLayout localCoordinatorLayout = this.a;
    AppBarLayout localAppBarLayout = this.b;
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    localBehavior.a_(localCoordinatorLayout, localAppBarLayout, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout$Behavior$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */