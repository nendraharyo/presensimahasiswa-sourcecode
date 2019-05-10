package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.util.List;

class LinearLayoutManager$LayoutState
{
  static final int INVALID_LAYOUT = Integer.MIN_VALUE;
  static final int ITEM_DIRECTION_HEAD = 255;
  static final int ITEM_DIRECTION_TAIL = 1;
  static final int LAYOUT_END = 1;
  static final int LAYOUT_START = 255;
  static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
  static final String TAG = "LLM#LayoutState";
  int mAvailable;
  int mCurrentPosition;
  int mExtra = 0;
  boolean mInfinite;
  boolean mIsPreLayout = false;
  int mItemDirection;
  int mLastScrollDelta;
  int mLayoutDirection;
  int mOffset;
  boolean mRecycle = true;
  List mScrapList = null;
  int mScrollingOffset;
  
  private View nextViewFromScrapList()
  {
    int i = this.mScrapList.size();
    int j = 0;
    Object localObject = null;
    int k = 0;
    View localView;
    if (k < i)
    {
      localView = ((RecyclerView.ViewHolder)this.mScrapList.get(k)).itemView;
      localObject = (RecyclerView.LayoutParams)localView.getLayoutParams();
      boolean bool = ((RecyclerView.LayoutParams)localObject).isItemRemoved();
      if (bool) {}
      int m;
      do
      {
        j = k + 1;
        k = j;
        break;
        m = this.mCurrentPosition;
        j = ((RecyclerView.LayoutParams)localObject).getViewLayoutPosition();
      } while (m != j);
      assignPositionFromScrapList(localView);
    }
    for (localObject = localView;; localObject = null)
    {
      return (View)localObject;
      j = 0;
    }
  }
  
  public void assignPositionFromScrapList()
  {
    assignPositionFromScrapList(null);
  }
  
  public void assignPositionFromScrapList(View paramView)
  {
    Object localObject = nextViewInLimitedList(paramView);
    int i;
    if (localObject == null) {
      i = -1;
    }
    for (this.mCurrentPosition = i;; this.mCurrentPosition = i)
    {
      return;
      localObject = (RecyclerView.LayoutParams)((View)localObject).getLayoutParams();
      i = ((RecyclerView.LayoutParams)localObject).getViewLayoutPosition();
    }
  }
  
  boolean hasMore(RecyclerView.State paramState)
  {
    int i = this.mCurrentPosition;
    if (i >= 0)
    {
      i = this.mCurrentPosition;
      int k = paramState.getItemCount();
      if (i >= k) {}
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void log()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("avail:");
    int i = this.mAvailable;
    localObject = ((StringBuilder)localObject).append(i).append(", ind:");
    i = this.mCurrentPosition;
    localObject = ((StringBuilder)localObject).append(i).append(", dir:");
    i = this.mItemDirection;
    localObject = ((StringBuilder)localObject).append(i).append(", offset:");
    i = this.mOffset;
    localObject = ((StringBuilder)localObject).append(i).append(", layoutDir:");
    i = this.mLayoutDirection;
    localObject = i;
    Log.d("LLM#LayoutState", (String)localObject);
  }
  
  View next(RecyclerView.Recycler paramRecycler)
  {
    Object localObject = this.mScrapList;
    if (localObject != null) {
      localObject = nextViewFromScrapList();
    }
    for (;;)
    {
      return (View)localObject;
      int i = this.mCurrentPosition;
      localObject = paramRecycler.getViewForPosition(i);
      int j = this.mCurrentPosition;
      int k = this.mItemDirection;
      j += k;
      this.mCurrentPosition = j;
    }
  }
  
  public View nextViewInLimitedList(View paramView)
  {
    int i = this.mScrapList.size();
    int j = 0;
    Object localObject1 = null;
    int k = -1 >>> 1;
    int m = 0;
    RecyclerView.LayoutParams localLayoutParams = null;
    int n = 0;
    Object localObject2;
    Object localObject3;
    if (n < i)
    {
      localObject2 = ((RecyclerView.ViewHolder)this.mScrapList.get(n)).itemView;
      localLayoutParams = (RecyclerView.LayoutParams)((View)localObject2).getLayoutParams();
      if (localObject2 != paramView)
      {
        boolean bool = localLayoutParams.isItemRemoved();
        if (bool) {
          m = k;
        }
        for (localObject3 = localObject1;; localObject3 = localObject1)
        {
          j = n + 1;
          n = j;
          localObject1 = localObject3;
          k = m;
          break;
          m = localLayoutParams.getViewLayoutPosition();
          int i1 = this.mCurrentPosition;
          m -= i1;
          i1 = this.mItemDirection;
          m *= i1;
          if (m >= 0) {
            break label158;
          }
          m = k;
        }
        label158:
        if (m < k) {
          if (m != 0) {}
        }
      }
    }
    for (;;)
    {
      return (View)localObject2;
      localObject3 = localObject2;
      break;
      m = k;
      localObject3 = localObject1;
      break;
      localObject2 = localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutManager$LayoutState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */