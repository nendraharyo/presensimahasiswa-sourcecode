package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.appcompat.R.layout;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public class ListMenuPresenter
  implements MenuPresenter, AdapterView.OnItemClickListener
{
  private static final String TAG = "ListMenuPresenter";
  public static final String VIEWS_TAG = "android:menu:list";
  ListMenuPresenter.MenuAdapter mAdapter;
  private MenuPresenter.Callback mCallback;
  Context mContext;
  private int mId;
  LayoutInflater mInflater;
  int mItemIndexOffset;
  int mItemLayoutRes;
  MenuBuilder mMenu;
  ExpandedMenuView mMenuView;
  int mThemeRes;
  
  public ListMenuPresenter(int paramInt1, int paramInt2)
  {
    this.mItemLayoutRes = paramInt1;
    this.mThemeRes = paramInt2;
  }
  
  public ListMenuPresenter(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.mContext = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    this.mInflater = localLayoutInflater;
  }
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListAdapter getAdapter()
  {
    ListMenuPresenter.MenuAdapter localMenuAdapter = this.mAdapter;
    if (localMenuAdapter == null)
    {
      localMenuAdapter = new android/support/v7/view/menu/ListMenuPresenter$MenuAdapter;
      localMenuAdapter.<init>(this);
      this.mAdapter = localMenuAdapter;
    }
    return this.mAdapter;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  int getItemIndexOffset()
  {
    return this.mItemIndexOffset;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    Object localObject = this.mMenuView;
    if (localObject == null)
    {
      localObject = this.mInflater;
      int i = R.layout.abc_expanded_menu_layout;
      localObject = (ExpandedMenuView)((LayoutInflater)localObject).inflate(i, paramViewGroup, false);
      this.mMenuView = ((ExpandedMenuView)localObject);
      localObject = this.mAdapter;
      if (localObject == null)
      {
        localObject = new android/support/v7/view/menu/ListMenuPresenter$MenuAdapter;
        ((ListMenuPresenter.MenuAdapter)localObject).<init>(this);
        this.mAdapter = ((ListMenuPresenter.MenuAdapter)localObject);
      }
      localObject = this.mMenuView;
      ListMenuPresenter.MenuAdapter localMenuAdapter = this.mAdapter;
      ((ExpandedMenuView)localObject).setAdapter(localMenuAdapter);
      localObject = this.mMenuView;
      ((ExpandedMenuView)localObject).setOnItemClickListener(this);
    }
    return this.mMenuView;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    int i = this.mThemeRes;
    Object localObject;
    if (i != 0)
    {
      localObject = new android/view/ContextThemeWrapper;
      int j = this.mThemeRes;
      ((ContextThemeWrapper)localObject).<init>(paramContext, j);
      this.mContext = ((Context)localObject);
      localObject = LayoutInflater.from(this.mContext);
      this.mInflater = ((LayoutInflater)localObject);
    }
    for (;;)
    {
      this.mMenu = paramMenuBuilder;
      localObject = this.mAdapter;
      if (localObject != null)
      {
        localObject = this.mAdapter;
        ((ListMenuPresenter.MenuAdapter)localObject).notifyDataSetChanged();
      }
      return;
      localObject = this.mContext;
      if (localObject != null)
      {
        this.mContext = paramContext;
        localObject = this.mInflater;
        if (localObject == null)
        {
          localObject = LayoutInflater.from(this.mContext);
          this.mInflater = ((LayoutInflater)localObject);
        }
      }
    }
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
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MenuBuilder localMenuBuilder = this.mMenu;
    MenuItemImpl localMenuItemImpl = this.mAdapter.getItem(paramInt);
    localMenuBuilder.performItemAction(localMenuItemImpl, this, 0);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (Bundle)paramParcelable;
    restoreHierarchyState(paramParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = this.mMenuView;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Parcelable)localObject;
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      saveHierarchyState((Bundle)localObject);
    }
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool = paramSubMenuBuilder.hasVisibleItems();
    Object localObject;
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = new android/support/v7/view/menu/MenuDialogHelper;
      ((MenuDialogHelper)localObject).<init>(paramSubMenuBuilder);
      ((MenuDialogHelper)localObject).show(null);
      localObject = this.mCallback;
      if (localObject != null)
      {
        localObject = this.mCallback;
        ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramSubMenuBuilder);
      }
      bool = true;
    }
  }
  
  public void restoreHierarchyState(Bundle paramBundle)
  {
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray("android:menu:list");
    if (localSparseArray != null)
    {
      ExpandedMenuView localExpandedMenuView = this.mMenuView;
      localExpandedMenuView.restoreHierarchyState(localSparseArray);
    }
  }
  
  public void saveHierarchyState(Bundle paramBundle)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    ExpandedMenuView localExpandedMenuView = this.mMenuView;
    if (localExpandedMenuView != null)
    {
      localExpandedMenuView = this.mMenuView;
      localExpandedMenuView.saveHierarchyState(localSparseArray);
    }
    paramBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  public void setId(int paramInt)
  {
    this.mId = paramInt;
  }
  
  public void setItemIndexOffset(int paramInt)
  {
    this.mItemIndexOffset = paramInt;
    ExpandedMenuView localExpandedMenuView = this.mMenuView;
    if (localExpandedMenuView != null)
    {
      localExpandedMenuView = null;
      updateMenuView(false);
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    ListMenuPresenter.MenuAdapter localMenuAdapter = this.mAdapter;
    if (localMenuAdapter != null)
    {
      localMenuAdapter = this.mAdapter;
      localMenuAdapter.notifyDataSetChanged();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ListMenuPresenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */