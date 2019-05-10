package android.support.v7.widget;

import android.support.v4.view.x;
import android.view.View;

class ToolbarWidgetWrapper$2
  extends x
{
  private boolean mCanceled = false;
  
  ToolbarWidgetWrapper$2(ToolbarWidgetWrapper paramToolbarWidgetWrapper, int paramInt) {}
  
  public void onAnimationCancel(View paramView)
  {
    this.mCanceled = true;
  }
  
  public void onAnimationEnd(View paramView)
  {
    boolean bool = this.mCanceled;
    if (!bool)
    {
      Toolbar localToolbar = this.this$0.mToolbar;
      int i = this.val$visibility;
      localToolbar.setVisibility(i);
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    this.this$0.mToolbar.setVisibility(0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ToolbarWidgetWrapper$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */