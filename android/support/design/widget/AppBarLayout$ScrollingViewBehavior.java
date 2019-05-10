package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.k;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class AppBarLayout$ScrollingViewBehavior
  extends i
{
  public AppBarLayout$ScrollingViewBehavior() {}
  
  public AppBarLayout$ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.k.ScrollingViewBehavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.k.ScrollingViewBehavior_Layout_behavior_overlapTop;
    i = ((TypedArray)localObject).getDimensionPixelSize(i, 0);
    b(i);
    ((TypedArray)localObject).recycle();
  }
  
  private static int a(AppBarLayout paramAppBarLayout)
  {
    Object localObject = ((CoordinatorLayout.e)paramAppBarLayout.getLayoutParams()).b();
    boolean bool = localObject instanceof AppBarLayout.Behavior;
    int i;
    if (bool)
    {
      localObject = (AppBarLayout.Behavior)localObject;
      i = ((AppBarLayout.Behavior)localObject).a();
    }
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  private void e(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    Object localObject = ((CoordinatorLayout.e)paramView2.getLayoutParams()).b();
    boolean bool = localObject instanceof AppBarLayout.Behavior;
    if (bool)
    {
      localObject = (AppBarLayout.Behavior)localObject;
      int i = paramView2.getBottom();
      int j = paramView1.getTop();
      i -= j;
      int k = AppBarLayout.Behavior.a((AppBarLayout.Behavior)localObject) + i;
      i = a();
      k += i;
      i = c(paramView2);
      k -= i;
      r.c(paramView1, k);
    }
  }
  
  float a(View paramView)
  {
    float f1 = 0.0F;
    boolean bool = paramView instanceof AppBarLayout;
    int i;
    int j;
    int k;
    if (bool)
    {
      paramView = (AppBarLayout)paramView;
      i = paramView.getTotalScrollRange();
      j = paramView.getDownNestedPreScrollRange();
      k = a(paramView);
      if (j == 0) {
        break label53;
      }
      int m = i + k;
      if (m > j) {
        break label53;
      }
    }
    for (;;)
    {
      return f1;
      label53:
      i -= j;
      if (i != 0)
      {
        float f2 = k;
        float f3 = i;
        f3 = f2 / f3;
        f1 = 1.0F + f3;
      }
    }
  }
  
  AppBarLayout a(List paramList)
  {
    int i = 0;
    Object localObject = null;
    int j = paramList.size();
    int k = 0;
    if (k < j)
    {
      localObject = (View)paramList.get(k);
      boolean bool = localObject instanceof AppBarLayout;
      if (!bool) {}
    }
    for (localObject = (AppBarLayout)localObject;; localObject = null)
    {
      return (AppBarLayout)localObject;
      i = k + 1;
      k = i;
      break;
      i = 0;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject = paramCoordinatorLayout.c(paramView);
    AppBarLayout localAppBarLayout = a((List)localObject);
    boolean bool2;
    if (localAppBarLayout != null)
    {
      int i = paramView.getLeft();
      int j = paramView.getTop();
      paramRect.offset(i, j);
      localObject = this.a;
      j = paramCoordinatorLayout.getWidth();
      int k = paramCoordinatorLayout.getHeight();
      ((Rect)localObject).set(0, 0, j, k);
      bool2 = ((Rect)localObject).contains(paramRect);
      if (!bool2) {
        if (!paramBoolean)
        {
          bool2 = bool1;
          localAppBarLayout.a(false, bool2);
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      bool1 = false;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return paramView2 instanceof AppBarLayout;
  }
  
  int b(View paramView)
  {
    boolean bool = paramView instanceof AppBarLayout;
    if (bool) {
      paramView = (AppBarLayout)paramView;
    }
    for (int i = paramView.getTotalScrollRange();; i = super.b(paramView)) {
      return i;
    }
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    e(paramCoordinatorLayout, paramView1, paramView2);
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout$ScrollingViewBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */