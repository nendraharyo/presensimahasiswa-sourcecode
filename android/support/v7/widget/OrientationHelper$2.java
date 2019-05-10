package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class OrientationHelper$2
  extends OrientationHelper
{
  OrientationHelper$2(RecyclerView.LayoutManager paramLayoutManager)
  {
    super(paramLayoutManager, null);
  }
  
  public int getDecoratedEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedBottom(paramView);
    return localLayoutParams.bottomMargin + i;
  }
  
  public int getDecoratedMeasurement(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedMeasuredHeight(paramView);
    int j = localLayoutParams.topMargin;
    i += j;
    return localLayoutParams.bottomMargin + i;
  }
  
  public int getDecoratedMeasurementInOther(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedMeasuredWidth(paramView);
    int j = localLayoutParams.leftMargin;
    i += j;
    return localLayoutParams.rightMargin + i;
  }
  
  public int getDecoratedStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.mLayoutManager.getDecoratedTop(paramView);
    int j = localLayoutParams.topMargin;
    return i - j;
  }
  
  public int getEnd()
  {
    return this.mLayoutManager.getHeight();
  }
  
  public int getEndAfterPadding()
  {
    int i = this.mLayoutManager.getHeight();
    int j = this.mLayoutManager.getPaddingBottom();
    return i - j;
  }
  
  public int getEndPadding()
  {
    return this.mLayoutManager.getPaddingBottom();
  }
  
  public int getMode()
  {
    return this.mLayoutManager.getHeightMode();
  }
  
  public int getModeInOther()
  {
    return this.mLayoutManager.getWidthMode();
  }
  
  public int getStartAfterPadding()
  {
    return this.mLayoutManager.getPaddingTop();
  }
  
  public int getTotalSpace()
  {
    int i = this.mLayoutManager.getHeight();
    int j = this.mLayoutManager.getPaddingTop();
    i -= j;
    j = this.mLayoutManager.getPaddingBottom();
    return i - j;
  }
  
  public int getTransformedEndWithDecoration(View paramView)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayoutManager;
    Rect localRect = this.mTmpRect;
    localLayoutManager.getTransformedBoundingBox(paramView, true, localRect);
    return this.mTmpRect.bottom;
  }
  
  public int getTransformedStartWithDecoration(View paramView)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayoutManager;
    Rect localRect = this.mTmpRect;
    localLayoutManager.getTransformedBoundingBox(paramView, true, localRect);
    return this.mTmpRect.top;
  }
  
  public void offsetChild(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
  }
  
  public void offsetChildren(int paramInt)
  {
    this.mLayoutManager.offsetChildrenVertical(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\OrientationHelper$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */