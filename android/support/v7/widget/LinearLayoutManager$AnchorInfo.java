package android.support.v7.widget;

import android.view.View;

class LinearLayoutManager$AnchorInfo
{
  int mCoordinate;
  boolean mLayoutFromEnd;
  OrientationHelper mOrientationHelper;
  int mPosition;
  boolean mValid;
  
  LinearLayoutManager$AnchorInfo()
  {
    reset();
  }
  
  void assignCoordinateFromPadding()
  {
    boolean bool = this.mLayoutFromEnd;
    OrientationHelper localOrientationHelper;
    if (bool) {
      localOrientationHelper = this.mOrientationHelper;
    }
    for (int i = localOrientationHelper.getEndAfterPadding();; i = localOrientationHelper.getStartAfterPadding())
    {
      this.mCoordinate = i;
      return;
      localOrientationHelper = this.mOrientationHelper;
    }
  }
  
  public void assignFromView(View paramView, int paramInt)
  {
    boolean bool = this.mLayoutFromEnd;
    OrientationHelper localOrientationHelper1;
    int i;
    if (bool)
    {
      localOrientationHelper1 = this.mOrientationHelper;
      i = localOrientationHelper1.getDecoratedEnd(paramView);
      OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
      int j = localOrientationHelper2.getTotalSpaceChange();
      i += j;
    }
    for (this.mCoordinate = i;; this.mCoordinate = i)
    {
      this.mPosition = paramInt;
      return;
      localOrientationHelper1 = this.mOrientationHelper;
      i = localOrientationHelper1.getDecoratedStart(paramView);
    }
  }
  
  public void assignFromViewAndKeepVisibleRect(View paramView, int paramInt)
  {
    OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
    int i = localOrientationHelper1.getTotalSpaceChange();
    if (i >= 0) {
      assignFromView(paramView, paramInt);
    }
    for (;;)
    {
      return;
      this.mPosition = paramInt;
      boolean bool = this.mLayoutFromEnd;
      int j;
      OrientationHelper localOrientationHelper2;
      OrientationHelper localOrientationHelper3;
      int k;
      OrientationHelper localOrientationHelper4;
      int m;
      if (bool)
      {
        i = this.mOrientationHelper.getEndAfterPadding() - i;
        j = this.mOrientationHelper.getDecoratedEnd(paramView);
        i -= j;
        localOrientationHelper2 = this.mOrientationHelper;
        j = localOrientationHelper2.getEndAfterPadding() - i;
        this.mCoordinate = j;
        if (i > 0)
        {
          localOrientationHelper2 = this.mOrientationHelper;
          j = localOrientationHelper2.getDecoratedMeasurement(paramView);
          j = this.mCoordinate - j;
          localOrientationHelper3 = this.mOrientationHelper;
          k = localOrientationHelper3.getStartAfterPadding();
          localOrientationHelper4 = this.mOrientationHelper;
          m = Math.min(localOrientationHelper4.getDecoratedStart(paramView) - k, 0);
          k += m;
          j -= k;
          if (j < 0)
          {
            k = this.mCoordinate;
            j = -j;
            i = Math.min(i, j) + k;
            this.mCoordinate = i;
          }
        }
      }
      else
      {
        localOrientationHelper2 = this.mOrientationHelper;
        j = localOrientationHelper2.getDecoratedStart(paramView);
        localOrientationHelper3 = this.mOrientationHelper;
        k = localOrientationHelper3.getStartAfterPadding();
        k = j - k;
        this.mCoordinate = j;
        if (k > 0)
        {
          m = this.mOrientationHelper.getDecoratedMeasurement(paramView);
          j += m;
          i = this.mOrientationHelper.getEndAfterPadding() - i;
          m = this.mOrientationHelper.getDecoratedEnd(paramView);
          i -= m;
          localOrientationHelper4 = this.mOrientationHelper;
          m = localOrientationHelper4.getEndAfterPadding();
          i = Math.min(0, i);
          i = m - i - j;
          if (i < 0)
          {
            j = this.mCoordinate;
            i = -i;
            i = Math.min(k, i);
            i = j - i;
            this.mCoordinate = i;
          }
        }
      }
    }
  }
  
  boolean isViewValidAsAnchor(View paramView, RecyclerView.State paramState)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    boolean bool = localLayoutParams.isItemRemoved();
    int j;
    if (!bool)
    {
      int i = localLayoutParams.getViewLayoutPosition();
      if (i >= 0)
      {
        j = localLayoutParams.getViewLayoutPosition();
        i = paramState.getItemCount();
        if (j < i) {
          j = 1;
        }
      }
    }
    for (;;)
    {
      return j;
      int k = 0;
      localLayoutParams = null;
    }
  }
  
  void reset()
  {
    this.mPosition = -1;
    this.mCoordinate = (-1 << -1);
    this.mLayoutFromEnd = false;
    this.mValid = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("AnchorInfo{mPosition=");
    int i = this.mPosition;
    localStringBuilder = localStringBuilder.append(i).append(", mCoordinate=");
    i = this.mCoordinate;
    localStringBuilder = localStringBuilder.append(i).append(", mLayoutFromEnd=");
    boolean bool = this.mLayoutFromEnd;
    localStringBuilder = localStringBuilder.append(bool).append(", mValid=");
    bool = this.mValid;
    return bool + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutManager$AnchorInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */