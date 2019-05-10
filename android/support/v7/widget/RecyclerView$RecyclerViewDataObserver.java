package android.support.v7.widget;

import android.support.v4.view.r;

class RecyclerView$RecyclerViewDataObserver
  extends RecyclerView.AdapterDataObserver
{
  RecyclerView$RecyclerViewDataObserver(RecyclerView paramRecyclerView) {}
  
  public void onChanged()
  {
    boolean bool1 = true;
    this.this$0.assertNotInLayoutOrScroll(null);
    this.this$0.mState.mStructureChanged = bool1;
    this.this$0.processDataSetCompletelyChanged(bool1);
    Object localObject = this.this$0.mAdapterHelper;
    boolean bool2 = ((AdapterHelper)localObject).hasPendingUpdates();
    if (!bool2)
    {
      localObject = this.this$0;
      ((RecyclerView)localObject).requestLayout();
    }
  }
  
  public void onItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this.this$0.assertNotInLayoutOrScroll(null);
    AdapterHelper localAdapterHelper = this.this$0.mAdapterHelper;
    boolean bool = localAdapterHelper.onItemRangeChanged(paramInt1, paramInt2, paramObject);
    if (bool) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeInserted(int paramInt1, int paramInt2)
  {
    this.this$0.assertNotInLayoutOrScroll(null);
    AdapterHelper localAdapterHelper = this.this$0.mAdapterHelper;
    boolean bool = localAdapterHelper.onItemRangeInserted(paramInt1, paramInt2);
    if (bool) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$0.assertNotInLayoutOrScroll(null);
    AdapterHelper localAdapterHelper = this.this$0.mAdapterHelper;
    boolean bool = localAdapterHelper.onItemRangeMoved(paramInt1, paramInt2, paramInt3);
    if (bool) {
      triggerUpdateProcessor();
    }
  }
  
  public void onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    this.this$0.assertNotInLayoutOrScroll(null);
    AdapterHelper localAdapterHelper = this.this$0.mAdapterHelper;
    boolean bool = localAdapterHelper.onItemRangeRemoved(paramInt1, paramInt2);
    if (bool) {
      triggerUpdateProcessor();
    }
  }
  
  void triggerUpdateProcessor()
  {
    boolean bool1 = RecyclerView.POST_UPDATES_ON_ANIMATION;
    RecyclerView localRecyclerView;
    if (bool1)
    {
      localRecyclerView = this.this$0;
      bool1 = localRecyclerView.mHasFixedSize;
      if (bool1)
      {
        localRecyclerView = this.this$0;
        bool1 = localRecyclerView.mIsAttached;
        if (bool1)
        {
          localRecyclerView = this.this$0;
          Runnable localRunnable = this.this$0.mUpdateChildViewsRunnable;
          r.a(localRecyclerView, localRunnable);
        }
      }
    }
    for (;;)
    {
      return;
      localRecyclerView = this.this$0;
      boolean bool2 = true;
      localRecyclerView.mAdapterUpdateDuringMeasure = bool2;
      localRecyclerView = this.this$0;
      localRecyclerView.requestLayout();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$RecyclerViewDataObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */