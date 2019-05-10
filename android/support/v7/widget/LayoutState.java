package android.support.v7.widget;

import android.view.View;

class LayoutState
{
  static final int INVALID_LAYOUT = Integer.MIN_VALUE;
  static final int ITEM_DIRECTION_HEAD = 255;
  static final int ITEM_DIRECTION_TAIL = 1;
  static final int LAYOUT_END = 1;
  static final int LAYOUT_START = 255;
  static final String TAG = "LayoutState";
  int mAvailable;
  int mCurrentPosition;
  int mEndLine = 0;
  boolean mInfinite;
  int mItemDirection;
  int mLayoutDirection;
  boolean mRecycle = true;
  int mStartLine = 0;
  boolean mStopInFocusable;
  
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
  
  View next(RecyclerView.Recycler paramRecycler)
  {
    int i = this.mCurrentPosition;
    View localView = paramRecycler.getViewForPosition(i);
    int j = this.mCurrentPosition;
    int k = this.mItemDirection;
    j += k;
    this.mCurrentPosition = j;
    return localView;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("LayoutState{mAvailable=");
    int i = this.mAvailable;
    localStringBuilder = localStringBuilder.append(i).append(", mCurrentPosition=");
    i = this.mCurrentPosition;
    localStringBuilder = localStringBuilder.append(i).append(", mItemDirection=");
    i = this.mItemDirection;
    localStringBuilder = localStringBuilder.append(i).append(", mLayoutDirection=");
    i = this.mLayoutDirection;
    localStringBuilder = localStringBuilder.append(i).append(", mStartLine=");
    i = this.mStartLine;
    localStringBuilder = localStringBuilder.append(i).append(", mEndLine=");
    i = this.mEndLine;
    return i + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LayoutState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */