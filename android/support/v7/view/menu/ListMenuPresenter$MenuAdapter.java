package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class ListMenuPresenter$MenuAdapter
  extends BaseAdapter
{
  private int mExpandedIndex = -1;
  
  public ListMenuPresenter$MenuAdapter(ListMenuPresenter paramListMenuPresenter)
  {
    findExpandedIndex();
  }
  
  void findExpandedIndex()
  {
    Object localObject = this.this$0.mMenu;
    MenuItemImpl localMenuItemImpl = ((MenuBuilder)localObject).getExpandedItem();
    int j;
    int k;
    if (localMenuItemImpl != null)
    {
      ArrayList localArrayList = this.this$0.mMenu.getNonActionItems();
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
  
  public int getCount()
  {
    ArrayList localArrayList = this.this$0.mMenu.getNonActionItems();
    int i = localArrayList.size();
    ListMenuPresenter localListMenuPresenter = this.this$0;
    int j = localListMenuPresenter.mItemIndexOffset;
    i -= j;
    j = this.mExpandedIndex;
    if (j < 0) {}
    for (;;)
    {
      return i;
      i += -1;
    }
  }
  
  public MenuItemImpl getItem(int paramInt)
  {
    ArrayList localArrayList = this.this$0.mMenu.getNonActionItems();
    ListMenuPresenter localListMenuPresenter = this.this$0;
    int i = localListMenuPresenter.mItemIndexOffset + paramInt;
    int j = this.mExpandedIndex;
    if (j >= 0)
    {
      j = this.mExpandedIndex;
      if (i >= j) {
        i += 1;
      }
    }
    return (MenuItemImpl)localArrayList.get(i);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    int i;
    if (paramView == null)
    {
      localObject = this.this$0.mInflater;
      i = this.this$0.mItemLayoutRes;
    }
    for (View localView = ((LayoutInflater)localObject).inflate(i, paramViewGroup, false);; localView = paramView)
    {
      localObject = localView;
      localObject = (MenuView.ItemView)localView;
      MenuItemImpl localMenuItemImpl = getItem(paramInt);
      ((MenuView.ItemView)localObject).initialize(localMenuItemImpl, 0);
      return localView;
    }
  }
  
  public void notifyDataSetChanged()
  {
    findExpandedIndex();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ListMenuPresenter$MenuAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */