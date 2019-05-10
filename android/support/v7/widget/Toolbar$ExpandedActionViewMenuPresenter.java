package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;

class Toolbar$ExpandedActionViewMenuPresenter
  implements MenuPresenter
{
  MenuItemImpl mCurrentExpandedItem;
  MenuBuilder mMenu;
  
  Toolbar$ExpandedActionViewMenuPresenter(Toolbar paramToolbar) {}
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    Object localObject1 = this.this$0.mExpandedActionView;
    boolean bool = localObject1 instanceof CollapsibleActionView;
    if (bool)
    {
      localObject1 = (CollapsibleActionView)this.this$0.mExpandedActionView;
      ((CollapsibleActionView)localObject1).onActionViewCollapsed();
    }
    localObject1 = this.this$0;
    Object localObject2 = this.this$0.mExpandedActionView;
    ((Toolbar)localObject1).removeView((View)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.this$0.mCollapseButtonView;
    ((Toolbar)localObject1).removeView((View)localObject2);
    this.this$0.mExpandedActionView = null;
    this.this$0.addChildrenForExpandedActionView();
    this.mCurrentExpandedItem = null;
    this.this$0.requestLayout();
    paramMenuItemImpl.setActionViewExpanded(false);
    return true;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    boolean bool1 = true;
    this.this$0.ensureCollapseButtonView();
    Object localObject1 = this.this$0.mCollapseButtonView.getParent();
    Object localObject2 = this.this$0;
    boolean bool2;
    if (localObject1 != localObject2)
    {
      bool2 = localObject1 instanceof ViewGroup;
      if (bool2)
      {
        localObject1 = (ViewGroup)localObject1;
        localObject2 = this.this$0.mCollapseButtonView;
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
      localObject1 = this.this$0;
      localObject2 = this.this$0.mCollapseButtonView;
      ((Toolbar)localObject1).addView((View)localObject2);
    }
    localObject1 = this.this$0;
    localObject2 = paramMenuItemImpl.getActionView();
    ((Toolbar)localObject1).mExpandedActionView = ((View)localObject2);
    this.mCurrentExpandedItem = paramMenuItemImpl;
    localObject1 = this.this$0.mExpandedActionView.getParent();
    localObject2 = this.this$0;
    if (localObject1 != localObject2)
    {
      bool2 = localObject1 instanceof ViewGroup;
      if (bool2)
      {
        localObject1 = (ViewGroup)localObject1;
        localObject2 = this.this$0.mExpandedActionView;
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
      localObject1 = this.this$0.generateDefaultLayoutParams();
      Toolbar localToolbar = this.this$0;
      int j = localToolbar.mButtonGravity & 0x70;
      int i = 0x800003 | j;
      ((Toolbar.LayoutParams)localObject1).gravity = i;
      i = 2;
      ((Toolbar.LayoutParams)localObject1).mViewType = i;
      this.this$0.mExpandedActionView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.this$0;
      localObject2 = this.this$0.mExpandedActionView;
      ((Toolbar)localObject1).addView((View)localObject2);
    }
    this.this$0.removeChildrenForExpandedActionView();
    this.this$0.requestLayout();
    paramMenuItemImpl.setActionViewExpanded(bool1);
    localObject1 = this.this$0.mExpandedActionView;
    boolean bool3 = localObject1 instanceof CollapsibleActionView;
    if (bool3)
    {
      localObject1 = (CollapsibleActionView)this.this$0.mExpandedActionView;
      ((CollapsibleActionView)localObject1).onActionViewExpanded();
    }
    return bool1;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public int getId()
  {
    return 0;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.mMenu;
    if (localObject != null)
    {
      localObject = this.mCurrentExpandedItem;
      if (localObject != null)
      {
        localObject = this.mMenu;
        MenuItemImpl localMenuItemImpl = this.mCurrentExpandedItem;
        ((MenuBuilder)localObject).collapseItemActionView(localMenuItemImpl);
      }
    }
    this.mMenu = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    return false;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback) {}
  
  public void updateMenuView(boolean paramBoolean)
  {
    int i = 0;
    MenuBuilder localMenuBuilder = null;
    Object localObject = this.mCurrentExpandedItem;
    int j;
    int k;
    if (localObject != null)
    {
      localObject = this.mMenu;
      if (localObject != null)
      {
        j = this.mMenu.size();
        k = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      if (k < j)
      {
        MenuItem localMenuItem = this.mMenu.getItem(k);
        MenuItemImpl localMenuItemImpl = this.mCurrentExpandedItem;
        if (localMenuItem == localMenuItemImpl) {
          i = 1;
        }
      }
      else
      {
        if (i == 0)
        {
          localMenuBuilder = this.mMenu;
          localObject = this.mCurrentExpandedItem;
          collapseItemActionView(localMenuBuilder, (MenuItemImpl)localObject);
        }
        return;
      }
      k += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\Toolbar$ExpandedActionViewMenuPresenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */