package android.support.v7.widget;

import android.support.v7.app.ActionBar.Tab;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class ScrollingTabContainerView$TabAdapter
  extends BaseAdapter
{
  ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public int getCount()
  {
    return this.this$0.mTabLayout.getChildCount();
  }
  
  public Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)this.this$0.mTabLayout.getChildAt(paramInt)).getTab();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = this.this$0;
      localObject2 = (ActionBar.Tab)getItem(paramInt);
      boolean bool = true;
      paramView = ((ScrollingTabContainerView)localObject1).createTabView((ActionBar.Tab)localObject2, bool);
    }
    for (;;)
    {
      return paramView;
      localObject2 = paramView;
      localObject2 = (ScrollingTabContainerView.TabView)paramView;
      localObject1 = (ActionBar.Tab)getItem(paramInt);
      ((ScrollingTabContainerView.TabView)localObject2).bindTab((ActionBar.Tab)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView$TabAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */