package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller
  extends RecyclerView.SmoothScroller
{
  private static final boolean DEBUG = false;
  private static final float MILLISECONDS_PER_INCH = 25.0F;
  public static final int SNAP_TO_ANY = 0;
  public static final int SNAP_TO_END = 1;
  public static final int SNAP_TO_START = 255;
  private static final String TAG = "LinearSmoothScroller";
  private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2F;
  private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
  private final float MILLISECONDS_PER_PX;
  protected final DecelerateInterpolator mDecelerateInterpolator;
  protected int mInterimTargetDx;
  protected int mInterimTargetDy;
  protected final LinearInterpolator mLinearInterpolator;
  protected PointF mTargetVector;
  
  public LinearSmoothScroller(Context paramContext)
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    this.mLinearInterpolator = ((LinearInterpolator)localObject);
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>();
    this.mDecelerateInterpolator = ((DecelerateInterpolator)localObject);
    this.mInterimTargetDx = 0;
    this.mInterimTargetDy = 0;
    localObject = paramContext.getResources().getDisplayMetrics();
    float f = calculateSpeedPerPixel((DisplayMetrics)localObject);
    this.MILLISECONDS_PER_PX = f;
  }
  
  private int clampApplyScroll(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    int j = paramInt1 * i;
    if (j <= 0) {
      i = 0;
    }
    return i;
  }
  
  public int calculateDtToFit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    IllegalArgumentException localIllegalArgumentException;
    int i;
    switch (paramInt5)
    {
    default: 
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      throw localIllegalArgumentException;
    case -1: 
      i = paramInt3 - paramInt1;
    }
    for (;;)
    {
      return i;
      i = paramInt4 - paramInt2;
      continue;
      i = paramInt3 - paramInt1;
      if (i <= 0)
      {
        i = paramInt4 - paramInt2;
        if (i >= 0)
        {
          i = 0;
          localIllegalArgumentException = null;
        }
      }
    }
  }
  
  public int calculateDxToMakeVisible(View paramView, int paramInt)
  {
    RecyclerView.LayoutManager localLayoutManager = getLayoutManager();
    int i;
    Object localObject;
    if (localLayoutManager != null)
    {
      i = localLayoutManager.canScrollHorizontally();
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      int k = localLayoutManager.getDecoratedLeft(paramView);
      int m = ((RecyclerView.LayoutParams)localObject).leftMargin;
      k -= m;
      m = localLayoutManager.getDecoratedRight(paramView);
      int j = ((RecyclerView.LayoutParams)localObject).rightMargin;
      m += j;
      int n = localLayoutManager.getPaddingLeft();
      j = localLayoutManager.getWidth();
      int i1 = localLayoutManager.getPaddingRight();
      i1 = j - i1;
      localObject = this;
      j = calculateDtToFit(k, m, n, i1, paramInt);
    }
  }
  
  public int calculateDyToMakeVisible(View paramView, int paramInt)
  {
    RecyclerView.LayoutManager localLayoutManager = getLayoutManager();
    int i;
    Object localObject;
    if (localLayoutManager != null)
    {
      i = localLayoutManager.canScrollVertically();
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      int k = localLayoutManager.getDecoratedTop(paramView);
      int m = ((RecyclerView.LayoutParams)localObject).topMargin;
      k -= m;
      m = localLayoutManager.getDecoratedBottom(paramView);
      int j = ((RecyclerView.LayoutParams)localObject).bottomMargin;
      m += j;
      int n = localLayoutManager.getPaddingTop();
      j = localLayoutManager.getHeight();
      int i1 = localLayoutManager.getPaddingBottom();
      i1 = j - i1;
      localObject = this;
      j = calculateDtToFit(k, m, n, i1, paramInt);
    }
  }
  
  protected float calculateSpeedPerPixel(DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.densityDpi;
    return 25.0F / f;
  }
  
  protected int calculateTimeForDeceleration(int paramInt)
  {
    return (int)Math.ceil(calculateTimeForScrolling(paramInt) / 0.3356D);
  }
  
  protected int calculateTimeForScrolling(int paramInt)
  {
    float f1 = Math.abs(paramInt);
    float f2 = this.MILLISECONDS_PER_PX;
    return (int)Math.ceil(f1 * f2);
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    Object localObject1 = getLayoutManager();
    boolean bool = localObject1 instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    if (bool) {}
    for (localObject1 = ((RecyclerView.SmoothScroller.ScrollVectorProvider)localObject1).computeScrollVectorForPosition(paramInt);; localObject1 = null)
    {
      return (PointF)localObject1;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
      String str = RecyclerView.SmoothScroller.ScrollVectorProvider.class.getCanonicalName();
      localObject2 = str;
      Log.w("LinearSmoothScroller", (String)localObject2);
    }
  }
  
  protected int getHorizontalSnapPreference()
  {
    PointF localPointF = this.mTargetVector;
    float f;
    int i;
    if (localPointF != null)
    {
      localPointF = this.mTargetVector;
      f = localPointF.x;
      i = f < 0.0F;
      if (i != 0) {}
    }
    else
    {
      i = 0;
      f = 0.0F;
      localPointF = null;
    }
    for (;;)
    {
      return i;
      localPointF = this.mTargetVector;
      f = localPointF.x;
      boolean bool = f < 0.0F;
      if (bool)
      {
        bool = true;
        f = Float.MIN_VALUE;
      }
      else
      {
        int j = -1;
        f = 0.0F / 0.0F;
      }
    }
  }
  
  protected int getVerticalSnapPreference()
  {
    PointF localPointF = this.mTargetVector;
    float f;
    int i;
    if (localPointF != null)
    {
      localPointF = this.mTargetVector;
      f = localPointF.y;
      i = f < 0.0F;
      if (i != 0) {}
    }
    else
    {
      i = 0;
      f = 0.0F;
      localPointF = null;
    }
    for (;;)
    {
      return i;
      localPointF = this.mTargetVector;
      f = localPointF.y;
      boolean bool = f < 0.0F;
      if (bool)
      {
        bool = true;
        f = Float.MIN_VALUE;
      }
      else
      {
        int j = -1;
        f = 0.0F / 0.0F;
      }
    }
  }
  
  protected void onSeekTargetStep(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction)
  {
    int i = getChildCount();
    if (i == 0) {
      stop();
    }
    for (;;)
    {
      return;
      i = this.mInterimTargetDx;
      i = clampApplyScroll(i, paramInt1);
      this.mInterimTargetDx = i;
      i = this.mInterimTargetDy;
      i = clampApplyScroll(i, paramInt2);
      this.mInterimTargetDy = i;
      i = this.mInterimTargetDx;
      if (i == 0)
      {
        i = this.mInterimTargetDy;
        if (i == 0) {
          updateActionForInterimTarget(paramAction);
        }
      }
    }
  }
  
  protected void onStart() {}
  
  protected void onStop()
  {
    this.mInterimTargetDy = 0;
    this.mInterimTargetDx = 0;
    this.mTargetVector = null;
  }
  
  protected void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction)
  {
    int i = getHorizontalSnapPreference();
    i = calculateDxToMakeVisible(paramView, i);
    int j = getVerticalSnapPreference();
    j = calculateDyToMakeVisible(paramView, j);
    int k = i * i;
    int m = j * j;
    double d = Math.sqrt(k + m);
    k = (int)d;
    k = calculateTimeForDeceleration(k);
    if (k > 0)
    {
      i = -i;
      j = -j;
      DecelerateInterpolator localDecelerateInterpolator = this.mDecelerateInterpolator;
      paramAction.update(i, j, k, localDecelerateInterpolator);
    }
  }
  
  protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action paramAction)
  {
    float f1 = 10000.0F;
    int i = 0;
    float f2 = 0.0F;
    float f3 = 1.2F;
    int j = getTargetPosition();
    PointF localPointF = computeScrollVectorForPosition(j);
    float f4;
    if (localPointF != null)
    {
      f4 = localPointF.x;
      boolean bool = f4 < 0.0F;
      if (!bool)
      {
        f4 = localPointF.y;
        bool = f4 < 0.0F;
        if (bool) {}
      }
    }
    else
    {
      j = getTargetPosition();
      paramAction.jumpTo(j);
      stop();
    }
    for (;;)
    {
      return;
      normalize(localPointF);
      this.mTargetVector = localPointF;
      int k = (int)(localPointF.x * f1);
      this.mInterimTargetDx = k;
      j = (int)(localPointF.y * f1);
      this.mInterimTargetDy = j;
      j = calculateTimeForScrolling(10000);
      f4 = this.mInterimTargetDx * f3;
      k = (int)f4;
      f2 = this.mInterimTargetDy * f3;
      i = (int)f2;
      float f5 = j * f3;
      j = (int)f5;
      LinearInterpolator localLinearInterpolator = this.mLinearInterpolator;
      paramAction.update(k, i, j, localLinearInterpolator);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearSmoothScroller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */