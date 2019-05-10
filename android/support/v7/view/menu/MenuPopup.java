package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class MenuPopup
  implements MenuPresenter, ShowableListMenu, AdapterView.OnItemClickListener
{
  private Rect mEpicenterBounds;
  
  protected static int measureIndividualMenuWidth(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = paramListAdapter.getCount();
    int n = 0;
    int i1 = 0;
    View localView = null;
    int i2 = 0;
    Object localObject1 = paramViewGroup;
    Object localObject2;
    if (n < m)
    {
      int i3 = paramListAdapter.getItemViewType(n);
      if (i3 != i1)
      {
        i1 = i3;
        localView = null;
      }
      if (localObject1 != null) {
        break label159;
      }
      localObject1 = new android/widget/FrameLayout;
      ((FrameLayout)localObject1).<init>(paramContext);
      localObject2 = localObject1;
      label91:
      localView = paramListAdapter.getView(n, localView, (ViewGroup)localObject2);
      localView.measure(j, k);
      i = localView.getMeasuredWidth();
      if (i >= paramInt) {
        label127:
        return paramInt;
      }
      if (i <= i2) {
        break label166;
      }
    }
    for (;;)
    {
      n += 1;
      i2 = i;
      localObject1 = localObject2;
      break;
      paramInt = i2;
      break label127;
      label159:
      localObject2 = localObject1;
      break label91;
      label166:
      i = i2;
    }
  }
  
  protected static boolean shouldPreserveIconSpacing(MenuBuilder paramMenuBuilder)
  {
    boolean bool1 = false;
    int i = paramMenuBuilder.size();
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        Object localObject = paramMenuBuilder.getItem(j);
        boolean bool2 = ((MenuItem)localObject).isVisible();
        if (bool2)
        {
          localObject = ((MenuItem)localObject).getIcon();
          if (localObject != null) {
            bool1 = true;
          }
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  protected static MenuAdapter toMenuAdapter(ListAdapter paramListAdapter)
  {
    boolean bool = paramListAdapter instanceof HeaderViewListAdapter;
    if (bool) {
      paramListAdapter = (HeaderViewListAdapter)paramListAdapter;
    }
    for (Object localObject = (MenuAdapter)paramListAdapter.getWrappedAdapter();; localObject = paramListAdapter)
    {
      return (MenuAdapter)localObject;
      paramListAdapter = (MenuAdapter)paramListAdapter;
    }
  }
  
  public abstract void addMenu(MenuBuilder paramMenuBuilder);
  
  protected boolean closeMenuOnSubMenuOpened()
  {
    return true;
  }
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public Rect getEpicenterBounds()
  {
    return this.mEpicenterBounds;
  }
  
  public int getId()
  {
    return 0;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("MenuPopups manage their own views");
    throw localUnsupportedOperationException;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = (ListAdapter)paramAdapterView.getAdapter();
    MenuAdapter localMenuAdapter = toMenuAdapter((ListAdapter)localObject);
    MenuBuilder localMenuBuilder = localMenuAdapter.mAdapterMenu;
    localObject = (MenuItem)((ListAdapter)localObject).getItem(paramInt);
    int i = closeMenuOnSubMenuOpened();
    if (i != 0)
    {
      i = 0;
      localMenuAdapter = null;
    }
    for (;;)
    {
      localMenuBuilder.performItemAction((MenuItem)localObject, this, i);
      return;
      int j = 4;
    }
  }
  
  public abstract void setAnchorView(View paramView);
  
  public void setEpicenterBounds(Rect paramRect)
  {
    this.mEpicenterBounds = paramRect;
  }
  
  public abstract void setForceShowIcon(boolean paramBoolean);
  
  public abstract void setGravity(int paramInt);
  
  public abstract void setHorizontalOffset(int paramInt);
  
  public abstract void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void setShowTitle(boolean paramBoolean);
  
  public abstract void setVerticalOffset(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */