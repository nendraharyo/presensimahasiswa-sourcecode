package android.support.v7.view.menu;

import android.support.v7.appcompat.R.layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class MenuAdapter
  extends BaseAdapter
{
  static final int ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
  MenuBuilder mAdapterMenu;
  private int mExpandedIndex = -1;
  private boolean mForceShowIcon;
  private final LayoutInflater mInflater;
  private final boolean mOverflowOnly;
  
  public MenuAdapter(MenuBuilder paramMenuBuilder, LayoutInflater paramLayoutInflater, boolean paramBoolean)
  {
    this.mOverflowOnly = paramBoolean;
    this.mInflater = paramLayoutInflater;
    this.mAdapterMenu = paramMenuBuilder;
    findExpandedIndex();
  }
  
  void findExpandedIndex()
  {
    Object localObject = this.mAdapterMenu;
    MenuItemImpl localMenuItemImpl = ((MenuBuilder)localObject).getExpandedItem();
    int j;
    int k;
    if (localMenuItemImpl != null)
    {
      ArrayList localArrayList = this.mAdapterMenu.getNonActionItems();
      int i = localArrayList.size();
      j = 0;
      localObject = null;
      k = 0;
      if (k < i)
      {
        localObject = (MenuItemImpl)localArrayList.get(k);
        if (localObject != localMenuItemImpl) {}
      }
    }
    for (this.mExpandedIndex = k;; this.mExpandedIndex = j)
    {
      return;
      j = k + 1;
      k = j;
      break;
      j = -1;
    }
  }
  
  public MenuBuilder getAdapterMenu()
  {
    return this.mAdapterMenu;
  }
  
  public int getCount()
  {
    boolean bool = this.mOverflowOnly;
    ArrayList localArrayList;
    if (bool)
    {
      localArrayList = this.mAdapterMenu.getNonActionItems();
      int j = this.mExpandedIndex;
      if (j >= 0) {
        break label44;
      }
    }
    label44:
    for (int i = localArrayList.size();; i = localArrayList.size() + -1)
    {
      return i;
      localArrayList = this.mAdapterMenu.getVisibleItems();
      break;
    }
  }
  
  public boolean getForceShowIcon()
  {
    return this.mForceShowIcon;
  }
  
  public MenuItemImpl getItem(int paramInt)
  {
    boolean bool = this.mOverflowOnly;
    if (bool) {}
    for (ArrayList localArrayList = this.mAdapterMenu.getNonActionItems();; localArrayList = this.mAdapterMenu.getVisibleItems())
    {
      int i = this.mExpandedIndex;
      if (i >= 0)
      {
        i = this.mExpandedIndex;
        if (paramInt >= i) {
          paramInt += 1;
        }
      }
      return (MenuItemImpl)localArrayList.get(paramInt);
    }
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1;
    int i;
    if (paramView == null)
    {
      localObject1 = this.mInflater;
      i = ITEM_LAYOUT;
    }
    for (View localView = ((LayoutInflater)localObject1).inflate(i, paramViewGroup, false);; localView = paramView)
    {
      localObject1 = localView;
      localObject1 = (MenuView.ItemView)localView;
      boolean bool1 = this.mForceShowIcon;
      if (bool1)
      {
        localObject2 = localView;
        localObject2 = (ListMenuItemView)localView;
        boolean bool2 = true;
        ((ListMenuItemView)localObject2).setForceShowIcon(bool2);
      }
      Object localObject2 = getItem(paramInt);
      ((MenuView.ItemView)localObject1).initialize((MenuItemImpl)localObject2, 0);
      return localView;
    }
  }
  
  public void notifyDataSetChanged()
  {
    findExpandedIndex();
    super.notifyDataSetChanged();
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mForceShowIcon = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */