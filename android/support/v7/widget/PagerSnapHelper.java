package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

public class PagerSnapHelper
  extends SnapHelper
{
  private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
  private OrientationHelper mHorizontalHelper;
  private OrientationHelper mVerticalHelper;
  
  private int distanceToCenter(RecyclerView.LayoutManager paramLayoutManager, View paramView, OrientationHelper paramOrientationHelper)
  {
    int i = paramOrientationHelper.getDecoratedStart(paramView);
    int k = paramOrientationHelper.getDecoratedMeasurement(paramView) / 2 + i;
    boolean bool = paramLayoutManager.getClipToPadding();
    int j;
    if (bool)
    {
      j = paramOrientationHelper.getStartAfterPadding();
      int m = paramOrientationHelper.getTotalSpace() / 2;
      j += m;
    }
    for (;;)
    {
      return k - j;
      j = paramOrientationHelper.getEnd() / 2;
    }
  }
  
  private View findCenterView(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper)
  {
    Object localObject1 = null;
    int i = paramLayoutManager.getChildCount();
    if (i == 0) {
      return (View)localObject1;
    }
    boolean bool = paramLayoutManager.getClipToPadding();
    int j;
    int k;
    label47:
    int m;
    int n;
    label58:
    View localView;
    if (bool)
    {
      j = paramOrientationHelper.getStartAfterPadding();
      k = paramOrientationHelper.getTotalSpace() / 2;
      j += k;
      m = -1 >>> 1;
      k = 0;
      n = 0;
      if (n < i)
      {
        localView = paramLayoutManager.getChildAt(n);
        k = paramOrientationHelper.getDecoratedStart(localView);
        int i1 = paramOrientationHelper.getDecoratedMeasurement(localView) / 2;
        k = Math.abs(k + i1 - j);
        if (k >= m) {
          break label146;
        }
      }
    }
    for (Object localObject2 = localView;; localObject2 = localObject1)
    {
      int i2 = n + 1;
      n = i2;
      localObject1 = localObject2;
      m = k;
      break label58;
      break;
      j = paramOrientationHelper.getEnd() / 2;
      break label47;
      label146:
      k = m;
    }
  }
  
  private View findStartView(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper)
  {
    Object localObject1 = null;
    int i = paramLayoutManager.getChildCount();
    if (i == 0) {
      return (View)localObject1;
    }
    int j = -1 >>> 1;
    int k = 0;
    int m = 0;
    label26:
    View localView;
    if (m < i)
    {
      localView = paramLayoutManager.getChildAt(m);
      k = paramOrientationHelper.getDecoratedStart(localView);
      if (k >= j) {
        break label80;
      }
    }
    for (Object localObject2 = localView;; localObject2 = localObject1)
    {
      int n = m + 1;
      m = n;
      localObject1 = localObject2;
      j = k;
      break label26;
      break;
      label80:
      k = j;
    }
  }
  
  private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    Object localObject = this.mHorizontalHelper;
    if (localObject != null)
    {
      localObject = this.mHorizontalHelper.mLayoutManager;
      if (localObject == paramLayoutManager) {}
    }
    else
    {
      localObject = OrientationHelper.createHorizontalHelper(paramLayoutManager);
      this.mHorizontalHelper = ((OrientationHelper)localObject);
    }
    return this.mHorizontalHelper;
  }
  
  private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    Object localObject = this.mVerticalHelper;
    if (localObject != null)
    {
      localObject = this.mVerticalHelper.mLayoutManager;
      if (localObject == paramLayoutManager) {}
    }
    else
    {
      localObject = OrientationHelper.createVerticalHelper(paramLayoutManager);
      this.mVerticalHelper = ((OrientationHelper)localObject);
    }
    return this.mVerticalHelper;
  }
  
  public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager paramLayoutManager, View paramView)
  {
    int i = 1;
    int j = 2;
    int[] arrayOfInt = new int[j];
    boolean bool1 = paramLayoutManager.canScrollHorizontally();
    if (bool1)
    {
      OrientationHelper localOrientationHelper = getHorizontalHelper(paramLayoutManager);
      int k = distanceToCenter(paramLayoutManager, paramView, localOrientationHelper);
      arrayOfInt[0] = k;
      boolean bool2 = paramLayoutManager.canScrollVertically();
      if (!bool2) {
        break label90;
      }
      localOrientationHelper = getVerticalHelper(paramLayoutManager);
      int m = distanceToCenter(paramLayoutManager, paramView, localOrientationHelper);
      arrayOfInt[i] = m;
    }
    for (;;)
    {
      return arrayOfInt;
      arrayOfInt[0] = 0;
      break;
      label90:
      arrayOfInt[i] = 0;
    }
  }
  
  protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager paramLayoutManager)
  {
    boolean bool = paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    Object localObject;
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (LinearSmoothScroller)localObject;
      localObject = new android/support/v7/widget/PagerSnapHelper$1;
      Context localContext = this.mRecyclerView.getContext();
      ((PagerSnapHelper.1)localObject).<init>(this, localContext);
    }
  }
  
  public View findSnapView(RecyclerView.LayoutManager paramLayoutManager)
  {
    boolean bool = paramLayoutManager.canScrollVertically();
    Object localObject;
    if (bool)
    {
      localObject = getVerticalHelper(paramLayoutManager);
      localObject = findCenterView(paramLayoutManager, (OrientationHelper)localObject);
    }
    for (;;)
    {
      return (View)localObject;
      bool = paramLayoutManager.canScrollHorizontally();
      if (bool)
      {
        localObject = getHorizontalHelper(paramLayoutManager);
        localObject = findCenterView(paramLayoutManager, (OrientationHelper)localObject);
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
  }
  
  public int findTargetSnapPosition(RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    int k = -1;
    int n = paramLayoutManager.getItemCount();
    if (n == 0) {}
    for (;;)
    {
      return k;
      int i1 = 0;
      Object localObject = null;
      boolean bool3 = paramLayoutManager.canScrollVertically();
      label56:
      boolean bool1;
      if (bool3)
      {
        localObject = getVerticalHelper(paramLayoutManager);
        localObject = findStartView(paramLayoutManager, (OrientationHelper)localObject);
        if (localObject == null) {
          break label219;
        }
        i1 = paramLayoutManager.getPosition((View)localObject);
        if (i1 == k) {
          continue;
        }
        bool1 = paramLayoutManager.canScrollHorizontally();
        if (!bool1) {
          break label227;
        }
        if (paramInt1 <= 0) {
          break label221;
        }
        bool1 = i;
      }
      for (;;)
      {
        bool3 = paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
        if (bool3)
        {
          paramLayoutManager = (RecyclerView.SmoothScroller.ScrollVectorProvider)paramLayoutManager;
          n += -1;
          PointF localPointF = paramLayoutManager.computeScrollVectorForPosition(n);
          if (localPointF != null)
          {
            float f1 = localPointF.x;
            bool3 = f1 < 0.0F;
            if (!bool3)
            {
              float f2 = localPointF.y;
              boolean bool2 = f2 < 0.0F;
              if (!bool2) {}
            }
            else
            {
              j = i;
            }
          }
        }
        if (j == 0) {
          break label251;
        }
        if (!bool1) {
          break label244;
        }
        m = i1 + -1;
        break;
        bool3 = paramLayoutManager.canScrollHorizontally();
        if (!bool3) {
          break label56;
        }
        localObject = getHorizontalHelper(paramLayoutManager);
        localObject = findStartView(paramLayoutManager, (OrientationHelper)localObject);
        break label56;
        label219:
        break;
        label221:
        m = 0;
        continue;
        label227:
        if (paramInt2 > 0) {
          m = i;
        } else {
          m = 0;
        }
      }
      label244:
      int m = i1;
      continue;
      label251:
      if (m != 0) {
        m = i1 + 1;
      } else {
        m = i1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PagerSnapHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */