package android.support.v7.widget;

import android.support.v4.view.v;
import android.support.v4.view.w;
import android.view.View;

public class AbsActionBarView$VisibilityAnimListener
  implements w
{
  private boolean mCanceled = false;
  int mFinalVisibility;
  
  protected AbsActionBarView$VisibilityAnimListener(AbsActionBarView paramAbsActionBarView) {}
  
  public void onAnimationCancel(View paramView)
  {
    this.mCanceled = true;
  }
  
  public void onAnimationEnd(View paramView)
  {
    boolean bool = this.mCanceled;
    if (bool) {}
    for (;;)
    {
      return;
      this.this$0.mVisibilityAnim = null;
      AbsActionBarView localAbsActionBarView = this.this$0;
      int i = this.mFinalVisibility;
      AbsActionBarView.access$101(localAbsActionBarView, i);
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    AbsActionBarView.access$001(this.this$0, 0);
    this.mCanceled = false;
  }
  
  public VisibilityAnimListener withFinalVisibility(v paramv, int paramInt)
  {
    this.this$0.mVisibilityAnim = paramv;
    this.mFinalVisibility = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AbsActionBarView$VisibilityAnimListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */