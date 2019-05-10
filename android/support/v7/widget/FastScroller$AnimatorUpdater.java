package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

class FastScroller$AnimatorUpdater
  implements ValueAnimator.AnimatorUpdateListener
{
  private FastScroller$AnimatorUpdater(FastScroller paramFastScroller) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
    FastScroller.access$600(this.this$0).setAlpha(i);
    FastScroller.access$700(this.this$0).setAlpha(i);
    FastScroller.access$500(this.this$0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\FastScroller$AnimatorUpdater.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */