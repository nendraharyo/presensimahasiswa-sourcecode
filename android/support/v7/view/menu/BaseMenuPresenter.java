package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class BaseMenuPresenter
  implements MenuPresenter
{
  private MenuPresenter.Callback mCallback;
  protected Context mContext;
  private int mId;
  protected LayoutInflater mInflater;
  private int mItemLayoutRes;
  protected MenuBuilder mMenu;
  private int mMenuLayoutRes;
  protected MenuView mMenuView;
  protected Context mSystemContext;
  protected LayoutInflater mSystemInflater;
  
  public BaseMenuPresenter(Context paramContext, int paramInt1, int paramInt2)
  {
    this.mSystemContext = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    this.mSystemInflater = localLayoutInflater;
    this.mMenuLayoutRes = paramInt1;
    this.mItemLayoutRes = paramInt2;
  }
  
  protected void addItemView(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
    ((ViewGroup)this.mMenuView).addView(paramView, paramInt);
  }
  
  public abstract void bindItemView(MenuItemImpl paramMenuItemImpl, MenuView.ItemView paramItemView);
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public MenuView.ItemView createItemView(ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = this.mSystemInflater;
    int i = this.mItemLayoutRes;
    return (MenuView.ItemView)localLayoutInflater.inflate(i, paramViewGroup, false);
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  protected boolean filterLeftoverView(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public MenuPresenter.Callback getCallback()
  {
    return this.mCallback;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public View getItemView(MenuItemImpl paramMenuItemImpl, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = paramView instanceof MenuView.ItemView;
    if (bool) {
      paramView = (MenuView.ItemView)paramView;
    }
    for (Object localObject = paramView;; localObject = createItemView(paramViewGroup))
    {
      bindItemView(paramMenuItemImpl, (MenuView.ItemView)localObject);
      return (View)localObject;
    }
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    Object localObject = this.mMenuView;
    if (localObject == null)
    {
      localObject = this.mSystemInflater;
      int i = this.mMenuLayoutRes;
      localObject = (MenuView)((LayoutInflater)localObject).inflate(i, paramViewGroup, false);
      this.mMenuView = ((MenuView)localObject);
      localObject = this.mMenuView;
      MenuBuilder localMenuBuilder = this.mMenu;
      ((MenuView)localObject).initialize(localMenuBuilder);
      boolean bool = true;
      updateMenuView(bool);
    }
    return this.mMenuView;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    this.mContext = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    this.mInflater = localLayoutInflater;
    this.mMenu = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    MenuPresenter.Callback localCallback = this.mCallback;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    MenuPresenter.Callback localCallback = this.mCallback;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      bool = localCallback.onOpenSubMenu(paramSubMenuBuilder);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  public void setId(int paramInt)
  {
    this.mId = paramInt;
  }
  
  public boolean shouldIncludeItem(int paramInt, MenuItemImpl paramMenuItemImpl)
  {
    return true;
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.mMenuView;
    if (localViewGroup == null) {
      return;
    }
    Object localObject1 = this.mMenu;
    int k;
    int n;
    if (localObject1 != null)
    {
      this.mMenu.flagActionItems();
      localObject1 = this.mMenu;
      ArrayList localArrayList = ((MenuBuilder)localObject1).getVisibleItems();
      int i = localArrayList.size();
      int j = 0;
      k = 0;
      if (j < i)
      {
        localObject1 = (MenuItemImpl)localArrayList.get(j);
        boolean bool1 = shouldIncludeItem(k, (MenuItemImpl)localObject1);
        if (!bool1) {
          break label234;
        }
        View localView1 = localViewGroup.getChildAt(k);
        bool1 = localView1 instanceof MenuView.ItemView;
        if (bool1) {
          localObject2 = localView1;
        }
        for (Object localObject2 = ((MenuView.ItemView)localView1).getItemData();; localObject2 = null)
        {
          View localView2 = getItemView((MenuItemImpl)localObject1, (View)localView1, localViewGroup);
          if (localObject1 != localObject2)
          {
            localView2.setPressed(false);
            localView2.jumpDrawablesToCurrentState();
          }
          if (localView2 != localView1) {
            addItemView(localView2, k);
          }
          n = k + 1;
          label172:
          int m = j + 1;
          j = m;
          k = n;
          break;
          m = 0;
        }
      }
    }
    for (;;)
    {
      n = localViewGroup.getChildCount();
      if (k >= n) {
        break;
      }
      boolean bool2 = filterLeftoverView(localViewGroup, k);
      if (!bool2)
      {
        k += 1;
        continue;
        label234:
        bool2 = k;
        break label172;
        k = 0;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\BaseMenuPresenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */