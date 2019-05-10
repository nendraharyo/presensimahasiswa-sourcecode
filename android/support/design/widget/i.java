package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.e.a;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class i
  extends p
{
  final Rect a;
  final Rect b;
  private int c;
  private int d;
  
  public i()
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.a = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.b = localRect;
    this.c = 0;
  }
  
  public i(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.a = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.b = localRect;
    this.c = 0;
  }
  
  private static int c(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 8388659;
    }
    return paramInt;
  }
  
  float a(View paramView)
  {
    return 1.0F;
  }
  
  final int a()
  {
    return this.c;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = -1;
    int j = 1;
    Object localObject = paramView.getLayoutParams();
    int k = ((ViewGroup.LayoutParams)localObject).height;
    View localView;
    boolean bool;
    if (k != i)
    {
      int m = -2;
      if (k != m) {}
    }
    else
    {
      localObject = paramCoordinatorLayout.c(paramView);
      localView = b((List)localObject);
      if (localView != null)
      {
        bool = r.p(localView);
        if (bool)
        {
          bool = r.p(paramView);
          if (!bool)
          {
            r.b(paramView, j);
            bool = r.p(paramView);
            if (bool)
            {
              paramView.requestLayout();
              bool = j;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      int n = View.MeasureSpec.getSize(paramInt3);
      if (n == 0) {
        n = paramCoordinatorLayout.getHeight();
      }
      int i1 = localView.getMeasuredHeight();
      n -= i1;
      int i2 = b(localView) + n;
      if (k == i) {}
      for (n = 1073741824;; n = -1 << -1)
      {
        i = View.MeasureSpec.makeMeasureSpec(i2, n);
        localObject = paramCoordinatorLayout;
        i2 = paramInt1;
        i1 = paramInt2;
        paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, i, paramInt4);
        n = j;
        break;
      }
      n = 0;
      localObject = null;
    }
  }
  
  int b(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  abstract View b(List paramList);
  
  public final void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    Object localObject = paramCoordinatorLayout.c(paramView);
    View localView = b((List)localObject);
    int i2;
    if (localView != null)
    {
      localObject = (CoordinatorLayout.e)paramView.getLayoutParams();
      Rect localRect1 = this.a;
      int i = paramCoordinatorLayout.getPaddingLeft();
      int j = ((CoordinatorLayout.e)localObject).leftMargin;
      i += j;
      j = localView.getBottom();
      int m = ((CoordinatorLayout.e)localObject).topMargin;
      j += m;
      m = paramCoordinatorLayout.getWidth();
      int n = paramCoordinatorLayout.getPaddingRight();
      m -= n;
      n = ((CoordinatorLayout.e)localObject).rightMargin;
      m -= n;
      n = paramCoordinatorLayout.getHeight();
      int i1 = localView.getBottom();
      n += i1;
      i1 = paramCoordinatorLayout.getPaddingBottom();
      n -= i1;
      i1 = ((CoordinatorLayout.e)localObject).bottomMargin;
      n -= i1;
      localRect1.set(i, j, m, n);
      z localz = paramCoordinatorLayout.getLastWindowInsets();
      if (localz != null)
      {
        boolean bool = r.p(paramCoordinatorLayout);
        if (bool)
        {
          bool = r.p(paramView);
          if (!bool)
          {
            k = localRect1.left;
            m = localz.a();
            k += m;
            localRect1.left = k;
            k = localRect1.right;
            i = localz.c();
            i = k - i;
            localRect1.right = i;
          }
        }
      }
      Rect localRect2 = this.b;
      i2 = c(((CoordinatorLayout.e)localObject).c);
      i = paramView.getMeasuredWidth();
      int k = paramView.getMeasuredHeight();
      n = paramInt;
      d.a(i2, i, k, localRect1, localRect2, paramInt);
      i2 = c(localView);
      i = localRect2.left;
      k = localRect2.top - i2;
      int i3 = localRect2.right;
      n = localRect2.bottom;
      i2 = n - i2;
      paramView.layout(i, k, i3, i2);
      i2 = localRect2.top;
      i = localView.getBottom();
      i2 -= i;
    }
    for (this.c = i2;; this.c = 0)
    {
      return;
      super.b(paramCoordinatorLayout, paramView, paramInt);
      i2 = 0;
      localObject = null;
    }
  }
  
  final int c(View paramView)
  {
    int i = 0;
    int j = this.d;
    if (j == 0) {}
    for (;;)
    {
      return i;
      float f1 = a(paramView);
      float f2 = this.d;
      f1 *= f2;
      j = (int)f1;
      int k = this.d;
      i = a.a(j, 0, k);
    }
  }
  
  public final int d()
  {
    return this.d;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */