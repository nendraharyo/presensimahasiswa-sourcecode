package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

class SnapHelper$2
  extends LinearSmoothScroller
{
  SnapHelper$2(SnapHelper paramSnapHelper, Context paramContext)
  {
    super(paramContext);
  }
  
  protected float calculateSpeedPerPixel(DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.densityDpi;
    return 100.0F / f;
  }
  
  protected void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction)
  {
    Object localObject = this.this$0.mRecyclerView;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.this$0;
      RecyclerView.LayoutManager localLayoutManager = this.this$0.mRecyclerView.getLayoutManager();
      localObject = ((SnapHelper)localObject).calculateDistanceToFinalSnap(localLayoutManager, paramView);
      localLayoutManager = null;
      int i = localObject[0];
      int j = localObject[1];
      int k = Math.abs(i);
      int m = Math.abs(j);
      k = Math.max(k, m);
      k = calculateTimeForDeceleration(k);
      if (k > 0)
      {
        DecelerateInterpolator localDecelerateInterpolator = this.mDecelerateInterpolator;
        paramAction.update(i, j, k, localDecelerateInterpolator);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SnapHelper$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */