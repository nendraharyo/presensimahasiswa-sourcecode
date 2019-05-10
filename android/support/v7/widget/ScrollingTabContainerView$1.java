package android.support.v7.widget;

import android.view.View;

class ScrollingTabContainerView$1
  implements Runnable
{
  ScrollingTabContainerView$1(ScrollingTabContainerView paramScrollingTabContainerView, View paramView) {}
  
  public void run()
  {
    int i = this.val$tabView.getLeft();
    int j = this.this$0.getWidth();
    int k = this.val$tabView.getWidth();
    j = (j - k) / 2;
    i -= j;
    this.this$0.smoothScrollTo(i, 0);
    this.this$0.mTabSelector = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */