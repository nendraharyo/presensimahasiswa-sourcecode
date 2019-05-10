package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class AppCompatSpinner$DropDownAdapter
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter mAdapter;
  private ListAdapter mListAdapter;
  
  public AppCompatSpinner$DropDownAdapter(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
  {
    this.mAdapter = paramSpinnerAdapter;
    boolean bool1 = paramSpinnerAdapter instanceof ListAdapter;
    Object localObject;
    if (bool1)
    {
      localObject = paramSpinnerAdapter;
      localObject = (ListAdapter)paramSpinnerAdapter;
      this.mListAdapter = ((ListAdapter)localObject);
    }
    boolean bool2;
    if (paramTheme != null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      if (i < j) {
        break label87;
      }
      bool2 = paramSpinnerAdapter instanceof android.widget.ThemedSpinnerAdapter;
      if (!bool2) {
        break label87;
      }
      paramSpinnerAdapter = (android.widget.ThemedSpinnerAdapter)paramSpinnerAdapter;
      localObject = paramSpinnerAdapter.getDropDownViewTheme();
      if (localObject != paramTheme) {
        paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
      }
    }
    for (;;)
    {
      return;
      label87:
      bool2 = paramSpinnerAdapter instanceof ThemedSpinnerAdapter;
      if (bool2)
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        localObject = paramSpinnerAdapter.getDropDownViewTheme();
        if (localObject == null) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
    }
  }
  
  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.mListAdapter;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.areAllItemsEnabled();; bool = true) {
      return bool;
    }
  }
  
  public int getCount()
  {
    SpinnerAdapter localSpinnerAdapter = this.mAdapter;
    int i;
    if (localSpinnerAdapter == null)
    {
      i = 0;
      localSpinnerAdapter = null;
    }
    for (;;)
    {
      return i;
      localSpinnerAdapter = this.mAdapter;
      i = localSpinnerAdapter.getCount();
    }
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = this.mAdapter;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAdapter.getDropDownView(paramInt, paramView, paramViewGroup)) {
      return (View)localObject;
    }
  }
  
  public Object getItem(int paramInt)
  {
    Object localObject = this.mAdapter;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAdapter.getItem(paramInt)) {
      return localObject;
    }
  }
  
  public long getItemId(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = this.mAdapter;
    if (localSpinnerAdapter == null) {}
    for (long l = -1;; l = localSpinnerAdapter.getItemId(paramInt))
    {
      return l;
      localSpinnerAdapter = this.mAdapter;
    }
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    return 1;
  }
  
  public boolean hasStableIds()
  {
    SpinnerAdapter localSpinnerAdapter = this.mAdapter;
    boolean bool;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = this.mAdapter;
      bool = localSpinnerAdapter.hasStableIds();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSpinnerAdapter = null;
    }
  }
  
  public boolean isEmpty()
  {
    int i = getCount();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.mListAdapter;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.isEnabled(paramInt);; bool = true) {
      return bool;
    }
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = this.mAdapter;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = this.mAdapter;
      localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = this.mAdapter;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = this.mAdapter;
      localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$DropDownAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */