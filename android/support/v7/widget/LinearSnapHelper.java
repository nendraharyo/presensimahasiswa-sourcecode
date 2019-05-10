package android.support.v7.widget;

import android.graphics.PointF;
import android.view.View;

public class LinearSnapHelper
  extends SnapHelper
{
  private static final float INVALID_DISTANCE = 1.0F;
  private OrientationHelper mHorizontalHelper;
  private OrientationHelper mVerticalHelper;
  
  private float computeDistancePerChild(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1065353216;
    float f1 = 1.0F;
    int k = -1 >>> 1;
    int m = -1 << -1;
    float f2 = -0.0F;
    int n = paramLayoutManager.getChildCount();
    if (n == 0)
    {
      i1 = j;
      f3 = f1;
      return f3;
    }
    int i2 = 0;
    Object localObject2 = null;
    int i1 = m;
    float f3 = f2;
    label63:
    View localView;
    Object localObject3;
    if (i2 < n)
    {
      localView = paramLayoutManager.getChildAt(i2);
      m = paramLayoutManager.getPosition(localView);
      int i3 = -1;
      if (m == i3)
      {
        m = k;
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      int i4 = i2 + 1;
      i2 = i4;
      localObject2 = localObject1;
      localObject1 = localObject3;
      k = m;
      break label63;
      if (m < k)
      {
        k = m;
        localObject2 = localView;
      }
      if (m > i1)
      {
        i1 = m;
        localObject1 = localObject2;
        m = k;
        localObject3 = localView;
        continue;
        if ((localObject2 == null) || (localObject1 == null))
        {
          i1 = j;
          f3 = f1;
          break;
        }
        m = paramOrientationHelper.getDecoratedStart((View)localObject2);
        i4 = paramOrientationHelper.getDecoratedStart((View)localObject1);
        m = Math.min(m, i4);
        i4 = paramOrientationHelper.getDecoratedEnd((View)localObject2);
        i = paramOrientationHelper.getDecoratedEnd((View)localObject1);
        i = Math.max(i4, i);
        m = i - m;
        if (m == 0)
        {
          i1 = j;
          f3 = f1;
          break;
        }
        f2 = m * f1;
        i1 = i1 - k + 1;
        f3 = i1;
        f3 = f2 / f3;
        break;
      }
      m = k;
      localObject3 = localObject1;
      localObject1 = localObject2;
    }
  }
  
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
  
  private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    float f1 = 0.0F;
    int[] arrayOfInt = calculateScrollDistance(paramInt1, paramInt2);
    float f2 = computeDistancePerChild(paramLayoutManager, paramOrientationHelper);
    boolean bool = f2 < 0.0F;
    if (!bool) {
      return j;
    }
    int k = Math.abs(arrayOfInt[0]);
    int m = Math.abs(arrayOfInt[i]);
    if (k > m) {}
    for (j = arrayOfInt[0];; j = arrayOfInt[i])
    {
      f1 = j / f2;
      j = Math.round(f1);
      break;
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
    int i = -1;
    int j = paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    if (j == 0) {
      j = i;
    }
    for (;;)
    {
      return j;
      int m = ((RecyclerView.LayoutManager)paramLayoutManager).getItemCount();
      if (m == 0)
      {
        j = i;
      }
      else
      {
        Object localObject = findSnapView((RecyclerView.LayoutManager)paramLayoutManager);
        if (localObject == null)
        {
          j = i;
        }
        else
        {
          int n = ((RecyclerView.LayoutManager)paramLayoutManager).getPosition((View)localObject);
          if (n == i)
          {
            j = i;
          }
          else
          {
            localObject = paramLayoutManager;
            localObject = (RecyclerView.SmoothScroller.ScrollVectorProvider)paramLayoutManager;
            int i1 = m + -1;
            PointF localPointF = ((RecyclerView.SmoothScroller.ScrollVectorProvider)localObject).computeScrollVectorForPosition(i1);
            if (localPointF == null)
            {
              j = i;
            }
            else
            {
              boolean bool1 = ((RecyclerView.LayoutManager)paramLayoutManager).canScrollHorizontally();
              float f1;
              label188:
              OrientationHelper localOrientationHelper;
              int i2;
              if (bool1)
              {
                localObject = getHorizontalHelper((RecyclerView.LayoutManager)paramLayoutManager);
                k = estimateNextPositionDiffForFling((RecyclerView.LayoutManager)paramLayoutManager, (OrientationHelper)localObject, paramInt1, 0);
                f1 = localPointF.x;
                boolean bool2 = f1 < 0.0F;
                if (bool2) {
                  k = -k;
                }
                bool2 = ((RecyclerView.LayoutManager)paramLayoutManager).canScrollVertically();
                if (!bool2) {
                  break label284;
                }
                localOrientationHelper = getVerticalHelper((RecyclerView.LayoutManager)paramLayoutManager);
                i2 = estimateNextPositionDiffForFling((RecyclerView.LayoutManager)paramLayoutManager, localOrientationHelper, 0, paramInt2);
                float f2 = localPointF.y;
                boolean bool3 = f2 < 0.0F;
                if (bool3) {
                  i2 = -i2;
                }
                label249:
                bool3 = ((RecyclerView.LayoutManager)paramLayoutManager).canScrollVertically();
                if (!bool3) {
                  break label296;
                }
              }
              for (;;)
              {
                if (i2 != 0) {
                  break label303;
                }
                k = i;
                break;
                k = 0;
                localObject = null;
                break label188;
                label284:
                i2 = 0;
                localOrientationHelper = null;
                f1 = 0.0F;
                break label249;
                label296:
                i2 = k;
              }
              label303:
              int k = n + i2;
              if (k < 0)
              {
                k = 0;
                localObject = null;
              }
              if (k >= m) {
                k = m + -1;
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearSnapHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */