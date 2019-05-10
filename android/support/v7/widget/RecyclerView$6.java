package android.support.v7.widget;

import android.view.View;

class RecyclerView$6
  implements AdapterHelper.Callback
{
  RecyclerView$6(RecyclerView paramRecyclerView) {}
  
  void dispatchUpdate(AdapterHelper.UpdateOp paramUpdateOp)
  {
    int i = paramUpdateOp.cmd;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      RecyclerView.LayoutManager localLayoutManager = this.this$0.mLayout;
      RecyclerView localRecyclerView = this.this$0;
      int j = paramUpdateOp.positionStart;
      int k = paramUpdateOp.itemCount;
      localLayoutManager.onItemsAdded(localRecyclerView, j, k);
      continue;
      localLayoutManager = this.this$0.mLayout;
      localRecyclerView = this.this$0;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      localLayoutManager.onItemsRemoved(localRecyclerView, j, k);
      continue;
      localLayoutManager = this.this$0.mLayout;
      localRecyclerView = this.this$0;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      Object localObject = paramUpdateOp.payload;
      localLayoutManager.onItemsUpdated(localRecyclerView, j, k, localObject);
      continue;
      localLayoutManager = this.this$0.mLayout;
      localRecyclerView = this.this$0;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      int m = 1;
      localLayoutManager.onItemsMoved(localRecyclerView, j, k, m);
    }
  }
  
  public RecyclerView.ViewHolder findViewHolder(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = this.this$0;
    boolean bool = true;
    localObject2 = ((RecyclerView)localObject2).findViewHolderForPosition(paramInt, bool);
    if (localObject2 == null) {}
    for (;;)
    {
      return (RecyclerView.ViewHolder)localObject1;
      ChildHelper localChildHelper = this.this$0.mChildHelper;
      View localView = ((RecyclerView.ViewHolder)localObject2).itemView;
      bool = localChildHelper.isHidden(localView);
      if (!bool) {
        localObject1 = localObject2;
      }
    }
  }
  
  public void markViewHoldersUpdated(int paramInt1, int paramInt2, Object paramObject)
  {
    this.this$0.viewRangeUpdate(paramInt1, paramInt2, paramObject);
    this.this$0.mItemsChanged = true;
  }
  
  public void offsetPositionsForAdd(int paramInt1, int paramInt2)
  {
    this.this$0.offsetPositionRecordsForInsert(paramInt1, paramInt2);
    this.this$0.mItemsAddedOrRemoved = true;
  }
  
  public void offsetPositionsForMove(int paramInt1, int paramInt2)
  {
    this.this$0.offsetPositionRecordsForMove(paramInt1, paramInt2);
    this.this$0.mItemsAddedOrRemoved = true;
  }
  
  public void offsetPositionsForRemovingInvisible(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    this.this$0.offsetPositionRecordsForRemove(paramInt1, paramInt2, bool);
    this.this$0.mItemsAddedOrRemoved = bool;
    RecyclerView.State localState = this.this$0.mState;
    int i = localState.mDeletedInvisibleItemCountSincePreviousLayout + paramInt2;
    localState.mDeletedInvisibleItemCountSincePreviousLayout = i;
  }
  
  public void offsetPositionsForRemovingLaidOutOrNewView(int paramInt1, int paramInt2)
  {
    this.this$0.offsetPositionRecordsForRemove(paramInt1, paramInt2, false);
    this.this$0.mItemsAddedOrRemoved = true;
  }
  
  public void onDispatchFirstPass(AdapterHelper.UpdateOp paramUpdateOp)
  {
    dispatchUpdate(paramUpdateOp);
  }
  
  public void onDispatchSecondPass(AdapterHelper.UpdateOp paramUpdateOp)
  {
    dispatchUpdate(paramUpdateOp);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */