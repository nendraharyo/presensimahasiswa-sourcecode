package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class FastScroller$AnimatorListener
  extends AnimatorListenerAdapter
{
  private boolean mCanceled = false;
  
  private FastScroller$AnimatorListener(FastScroller paramFastScroller) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.mCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.mCanceled;
    if (bool) {
      this.mCanceled = false;
    }
    for (;;)
    {
      return;
      Object localObject = (Float)FastScroller.access$200(this.this$0).getAnimatedValue();
      float f = ((Float)localObject).floatValue();
      int i = 0;
      bool = f < 0.0F;
      if (!bool)
      {
        FastScroller.access$302(this.this$0, 0);
        localObject = this.this$0;
        FastScroller.access$400((FastScroller)localObject, 0);
      }
      else
      {
        localObject = this.this$0;
        i = 2;
        FastScroller.access$302((FastScroller)localObject, i);
        localObject = this.this$0;
        FastScroller.access$500((FastScroller)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\FastScroller$AnimatorListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */