package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

class RecyclerView$AdapterDataObservable
  extends Observable
{
  public boolean hasObservers()
  {
    ArrayList localArrayList = this.mObservers;
    boolean bool = localArrayList.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localArrayList = null;
    }
  }
  
  public void notifyChanged()
  {
    Object localObject = this.mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (RecyclerView.AdapterDataObserver)this.mObservers.get(j);
      ((RecyclerView.AdapterDataObserver)localObject).onChanged();
      i = j + -1;
    }
  }
  
  public void notifyItemMoved(int paramInt1, int paramInt2)
  {
    Object localObject = this.mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (RecyclerView.AdapterDataObserver)this.mObservers.get(j);
      int k = 1;
      ((RecyclerView.AdapterDataObserver)localObject).onItemRangeMoved(paramInt1, paramInt2, k);
      i = j + -1;
    }
  }
  
  public void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    notifyItemRangeChanged(paramInt1, paramInt2, null);
  }
  
  public void notifyItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    Object localObject = this.mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (RecyclerView.AdapterDataObserver)this.mObservers.get(j);
      ((RecyclerView.AdapterDataObserver)localObject).onItemRangeChanged(paramInt1, paramInt2, paramObject);
      i = j + -1;
    }
  }
  
  public void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    Object localObject = this.mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (RecyclerView.AdapterDataObserver)this.mObservers.get(j);
      ((RecyclerView.AdapterDataObserver)localObject).onItemRangeInserted(paramInt1, paramInt2);
      i = j + -1;
    }
  }
  
  public void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    Object localObject = this.mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (RecyclerView.AdapterDataObserver)this.mObservers.get(j);
      ((RecyclerView.AdapterDataObserver)localObject).onItemRangeRemoved(paramInt1, paramInt2);
      i = j + -1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$AdapterDataObservable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */