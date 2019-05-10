package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;

public class MenuPopupWindow$MenuDropDownListView
  extends DropDownListView
{
  final int mAdvanceKey;
  private MenuItemHoverListener mHoverListener;
  private MenuItem mHoveredMenuItem;
  final int mRetreatKey;
  
  public MenuPopupWindow$MenuDropDownListView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    int k = Build.VERSION.SDK_INT;
    int m = 17;
    if (k >= m)
    {
      k = 1;
      int n = localConfiguration.getLayoutDirection();
      if (k == n) {
        this.mAdvanceKey = j;
      }
    }
    for (this.mRetreatKey = i;; this.mRetreatKey = j)
    {
      return;
      this.mAdvanceKey = i;
    }
  }
  
  public void clearSelection()
  {
    setSelection(-1);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    Object localObject1 = this.mHoverListener;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = getAdapter();
      boolean bool = localObject1 instanceof HeaderViewListAdapter;
      if (!bool) {
        break label199;
      }
      localObject1 = (HeaderViewListAdapter)localObject1;
      i = ((HeaderViewListAdapter)localObject1).getHeadersCount();
      localObject1 = (MenuAdapter)((HeaderViewListAdapter)localObject1).getWrappedAdapter();
      localObject2 = null;
      int j = paramMotionEvent.getAction();
      int k = 10;
      if (j == k) {
        break label212;
      }
      float f = paramMotionEvent.getX();
      j = (int)f;
      k = (int)paramMotionEvent.getY();
      j = pointToPosition(j, k);
      k = -1;
      if (j == k) {
        break label212;
      }
      i = j - i;
      if (i < 0) {
        break label212;
      }
      j = ((MenuAdapter)localObject1).getCount();
      if (i >= j) {
        break label212;
      }
    }
    for (MenuItemImpl localMenuItemImpl = ((MenuAdapter)localObject1).getItem(i);; localMenuItemImpl = null)
    {
      localObject2 = this.mHoveredMenuItem;
      if (localObject2 != localMenuItemImpl)
      {
        localObject1 = ((MenuAdapter)localObject1).getAdapterMenu();
        if (localObject2 != null)
        {
          MenuItemHoverListener localMenuItemHoverListener = this.mHoverListener;
          localMenuItemHoverListener.onItemHoverExit((MenuBuilder)localObject1, (MenuItem)localObject2);
        }
        this.mHoveredMenuItem = localMenuItemImpl;
        if (localMenuItemImpl != null)
        {
          localObject2 = this.mHoverListener;
          ((MenuItemHoverListener)localObject2).onItemHoverEnter((MenuBuilder)localObject1, localMenuItemImpl);
        }
      }
      return super.onHoverEvent(paramMotionEvent);
      label199:
      i = 0;
      localMenuItemImpl = null;
      localObject1 = (MenuAdapter)localObject1;
      break;
      label212:
      i = 0;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    Object localObject = (ListMenuItemView)getSelectedView();
    MenuItemImpl localMenuItemImpl;
    int k;
    boolean bool2;
    if (localObject != null)
    {
      int j = this.mAdvanceKey;
      if (paramInt == j)
      {
        boolean bool1 = ((ListMenuItemView)localObject).isEnabled();
        if (bool1)
        {
          localMenuItemImpl = ((ListMenuItemView)localObject).getItemData();
          bool1 = localMenuItemImpl.hasSubMenu();
          if (bool1)
          {
            k = getSelectedItemPosition();
            long l = getSelectedItemId();
            performItemClick((View)localObject, k, l);
          }
        }
        bool2 = i;
      }
    }
    for (;;)
    {
      return bool2;
      if (localObject != null)
      {
        int m = this.mRetreatKey;
        if (paramInt == m)
        {
          setSelection(-1);
          localObject = ((MenuAdapter)getAdapter()).getAdapterMenu();
          k = 0;
          localMenuItemImpl = null;
          ((MenuBuilder)localObject).close(false);
          m = i;
          continue;
        }
      }
      boolean bool3 = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public void setHoverListener(MenuItemHoverListener paramMenuItemHoverListener)
  {
    this.mHoverListener = paramMenuItemHoverListener;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\MenuPopupWindow$MenuDropDownListView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */