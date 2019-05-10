package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class OrientationHelper
{
  public static final int HORIZONTAL = 0;
  private static final int INVALID_SIZE = Integer.MIN_VALUE;
  public static final int VERTICAL = 1;
  private int mLastTotalSpace = -1 << -1;
  protected final RecyclerView.LayoutManager mLayoutManager;
  final Rect mTmpRect;
  
  private OrientationHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mTmpRect = localRect;
    this.mLayoutManager = paramLayoutManager;
  }
  
  public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper.1 local1 = new android/support/v7/widget/OrientationHelper$1;
    local1.<init>(paramLayoutManager);
    return local1;
  }
  
  public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager paramLayoutManager, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("invalid orientation");
      throw ((Throwable)localObject);
    }
    for (Object localObject = createHorizontalHelper(paramLayoutManager);; localObject = createVerticalHelper(paramLayoutManager)) {
      return (OrientationHelper)localObject;
    }
  }
  
  public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper.2 local2 = new android/support/v7/widget/OrientationHelper$2;
    local2.<init>(paramLayoutManager);
    return local2;
  }
  
  public abstract int getDecoratedEnd(View paramView);
  
  public abstract int getDecoratedMeasurement(View paramView);
  
  public abstract int getDecoratedMeasurementInOther(View paramView);
  
  public abstract int getDecoratedStart(View paramView);
  
  public abstract int getEnd();
  
  public abstract int getEndAfterPadding();
  
  public abstract int getEndPadding();
  
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return this.mLayoutManager;
  }
  
  public abstract int getMode();
  
  public abstract int getModeInOther();
  
  public abstract int getStartAfterPadding();
  
  public abstract int getTotalSpace();
  
  public int getTotalSpaceChange()
  {
    int i = -1 << -1;
    int j = this.mLastTotalSpace;
    if (i == j) {
      i = 0;
    }
    for (;;)
    {
      return i;
      i = getTotalSpace();
      j = this.mLastTotalSpace;
      i -= j;
    }
  }
  
  public abstract int getTransformedEndWithDecoration(View paramView);
  
  public abstract int getTransformedStartWithDecoration(View paramView);
  
  public abstract void offsetChild(View paramView, int paramInt);
  
  public abstract void offsetChildren(int paramInt);
  
  public void onLayoutComplete()
  {
    int i = getTotalSpace();
    this.mLastTotalSpace = i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\OrientationHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */