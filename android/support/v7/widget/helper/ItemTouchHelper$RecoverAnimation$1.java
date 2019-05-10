package android.support.v7.widget.helper;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class ItemTouchHelper$RecoverAnimation$1
  implements ValueAnimator.AnimatorUpdateListener
{
  ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper.RecoverAnimation paramRecoverAnimation) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    ItemTouchHelper.RecoverAnimation localRecoverAnimation = this.this$0;
    float f = paramValueAnimator.getAnimatedFraction();
    localRecoverAnimation.setFraction(f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$RecoverAnimation$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */