package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class OrientationHelper$1
  extends OrientationHelper
{
  OrientationHelper$1(RecyclerView.LayoutManager paramLayoutManager)
  {
    super(paramLayoutManager, null);
  }
  
  public int getDecoratedEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedRight(paramView);
    return localLayoutParams.rightMargin + i;
  }
  
  public int getDecoratedMeasurement(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedMeasuredWidth(paramView);
    int j = localLayoutParams.leftMargin;
    i += j;
    return localLayoutParams.rightMargin + i;
  }
  
  public int getDecoratedMeasurementInOther(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedMeasuredHeight(paramView);
    int j = localLayoutParams.topMargin;
    i += j;
    return localLayoutParams.bottomMargin + i;
  }
  
  public int getDecoratedStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedLeft(paramView);
    int j = localLayoutParams.leftMargin;
    return i - j;
  }
  
  public int getEnd()
  {
    return this.mLayoutManager.getWidth();
  }
  
  public int getEndAfterPadding()
  {
    int i = this.mLayoutManager.getWidth();
    int j = this.mLayoutManager.getPaddingRight();
    return i - j;
  }
  
  public int getEndPadding()
  {
    return this.mLayoutManager.getPaddingRight();
  }
  
  public int getMode()
  {
    return this.mLayoutManager.getWidthMode();
  }
  
  public int getModeInOther()
  {
    return this.mLayoutManager.getHeightMode();
  }
  
  public int getStartAfterPadding()
  {
    return this.mLayoutManager.getPaddingLeft();
  }
  
  public int getTotalSpace()
  {
    int i = this.mLayoutManager.getWidth();
    int j = this.mLayoutManager.getPaddingLeft();
    i -= j;
    j = this.mLayoutManager.getPaddingRight();
    return i - j;
  }
  
  public int getTransformedEndWithDecoration(View paramView)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayoutManager;
    Rect localRect = this.mTmpRect;
    localLayoutManager.getTransformedBoundingBox(paramView, true, localRect);
    return this.mTmpRect.right;
  }
  
  public int getTransformedStartWithDecoration(View paramView)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayoutManager;
    Rect localRect = this.mTmpRect;
    localLayoutManager.getTransformedBoundingBox(paramView, true, localRect);
    return this.mTmpRect.left;
  }
  
  public void offsetChild(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
  }
  
  public void offsetChildren(int paramInt)
  {
    this.mLayoutManager.offsetChildrenHorizontal(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\OrientationHelper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */