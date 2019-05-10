package android.support.v7.widget;

import android.support.v7.app.ActionBar.Tab;
import android.view.View;
import android.view.View.OnClickListener;

class ScrollingTabContainerView$TabClickListener
  implements View.OnClickListener
{
  ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onClick(View paramView)
  {
    Object localObject = paramView;
    ((ScrollingTabContainerView.TabView)paramView).getTab().select();
    localObject = this.this$0.mTabLayout;
    int i = ((LinearLayoutCompat)localObject).getChildCount();
    int j = 0;
    if (j < i)
    {
      localObject = this.this$0.mTabLayout;
      View localView = ((LinearLayoutCompat)localObject).getChildAt(j);
      boolean bool;
      if (localView == paramView) {
        bool = true;
      }
      for (;;)
      {
        localView.setSelected(bool);
        int k = j + 1;
        j = k;
        break;
        k = 0;
        localObject = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView$TabClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */