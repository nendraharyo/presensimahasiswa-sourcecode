package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

public class ScrollingTabContainerView$VisibilityAnimListener
  extends AnimatorListenerAdapter
{
  private boolean mCanceled = false;
  private int mFinalVisibility;
  
  protected ScrollingTabContainerView$VisibilityAnimListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.mCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.mCanceled;
    if (bool) {}
    for (;;)
    {
      return;
      this.this$0.mVisibilityAnim = null;
      ScrollingTabContainerView localScrollingTabContainerView = this.this$0;
      int i = this.mFinalVisibility;
      localScrollingTabContainerView.setVisibility(i);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.this$0.setVisibility(0);
    this.mCanceled = false;
  }
  
  public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator paramViewPropertyAnimator, int paramInt)
  {
    this.mFinalVisibility = paramInt;
    this.this$0.mVisibilityAnim = paramViewPropertyAnimator;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView$VisibilityAnimListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */