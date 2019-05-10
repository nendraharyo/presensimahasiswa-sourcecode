package android.support.design.widget;

import android.content.Context;
import android.support.v4.e.a;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class h
  extends p
{
  OverScroller a;
  private Runnable b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private VelocityTracker g;
  
  public h()
  {
    this.d = i;
    this.f = i;
  }
  
  public h(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = i;
    this.f = i;
  }
  
  private void d()
  {
    VelocityTracker localVelocityTracker = this.g;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.g = localVelocityTracker;
    }
  }
  
  int a()
  {
    return b();
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = b();
    int j = 0;
    if ((paramInt2 != 0) && (i >= paramInt2) && (i <= paramInt3))
    {
      int k = a.a(paramInt1, paramInt2, paramInt3);
      if (i != k)
      {
        a(k);
        j = i - k;
      }
    }
    return j;
  }
  
  int a(View paramView)
  {
    return paramView.getHeight();
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, View paramView) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, float paramFloat)
  {
    boolean bool1 = false;
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      paramView.removeCallbacks((Runnable)localObject);
      bool2 = false;
      localObject = null;
      this.b = null;
    }
    localObject = this.a;
    if (localObject == null)
    {
      localObject = new android/widget/OverScroller;
      Context localContext = paramView.getContext();
      ((OverScroller)localObject).<init>(localContext);
      this.a = ((OverScroller)localObject);
    }
    localObject = this.a;
    int i = b();
    int j = Math.round(paramFloat);
    ((OverScroller)localObject).fling(0, i, 0, j, 0, 0, paramInt1, paramInt2);
    localObject = this.a;
    boolean bool2 = ((OverScroller)localObject).computeScrollOffset();
    if (bool2)
    {
      localObject = new android/support/design/widget/h$a;
      ((h.a)localObject).<init>(this, paramCoordinatorLayout, paramView);
      this.b = ((Runnable)localObject);
      localObject = this.b;
      r.a(paramView, (Runnable)localObject);
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      a(paramCoordinatorLayout, paramView);
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int k = -1;
    int m = this.f;
    if (m < 0)
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramCoordinatorLayout.getContext());
      m = localViewConfiguration.getScaledTouchSlop();
      this.f = m;
    }
    m = paramMotionEvent.getAction();
    int i1 = 2;
    if (m == i1)
    {
      boolean bool3 = this.c;
      if (bool3) {
        return bool1;
      }
    }
    int n = paramMotionEvent.getActionMasked();
    switch (n)
    {
    }
    for (;;)
    {
      VelocityTracker localVelocityTracker = this.g;
      if (localVelocityTracker != null)
      {
        localVelocityTracker = this.g;
        localVelocityTracker.addMovement(paramMotionEvent);
      }
      bool1 = this.c;
      break;
      this.c = false;
      f1 = paramMotionEvent.getX();
      int i = (int)f1;
      float f2 = paramMotionEvent.getY();
      n = (int)f2;
      boolean bool4 = c(paramView);
      if (bool4)
      {
        boolean bool2 = paramCoordinatorLayout.a(paramView, i, n);
        if (bool2)
        {
          this.e = n;
          int j = paramMotionEvent.getPointerId(0);
          this.d = j;
          d();
          continue;
          n = this.d;
          if (n != k)
          {
            n = paramMotionEvent.findPointerIndex(n);
            if (n != k)
            {
              f2 = paramMotionEvent.getY(n);
              n = (int)f2;
              int i2 = this.e;
              i2 = Math.abs(n - i2);
              k = this.f;
              if (i2 > k)
              {
                this.c = j;
                this.e = n;
                continue;
                this.c = false;
                this.d = k;
                localVelocityTracker = this.g;
                if (localVelocityTracker != null)
                {
                  this.g.recycle();
                  j = 0;
                  f1 = 0.0F;
                  localVelocityTracker = null;
                  this.g = null;
                }
              }
            }
          }
        }
      }
    }
  }
  
  int a_(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    return a(paramCoordinatorLayout, paramView, paramInt, -1 << -1, -1 >>> 1);
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = a() - paramInt1;
    return a(paramCoordinatorLayout, paramView, i, paramInt2, paramInt3);
  }
  
  int b(View paramView)
  {
    return -paramView.getHeight();
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    int i = -1;
    boolean bool2 = false;
    int j = this.f;
    Object localObject;
    if (j < 0)
    {
      localObject = ViewConfiguration.get(paramCoordinatorLayout.getContext());
      j = ((ViewConfiguration)localObject).getScaledTouchSlop();
      this.f = j;
    }
    j = paramMotionEvent.getActionMasked();
    switch (j)
    {
    }
    for (;;)
    {
      localObject = this.g;
      if (localObject != null)
      {
        localObject = this.g;
        ((VelocityTracker)localObject).addMovement(paramMotionEvent);
      }
      bool2 = bool1;
      float f2;
      do
      {
        int m;
        boolean bool3;
        do
        {
          do
          {
            return bool2;
            f1 = paramMotionEvent.getX();
            j = (int)f1;
            f2 = paramMotionEvent.getY();
            m = (int)f2;
            bool3 = paramCoordinatorLayout.a(paramView, j, m);
          } while (!bool3);
          bool3 = c(paramView);
        } while (!bool3);
        this.e = m;
        k = paramMotionEvent.getPointerId(0);
        this.d = k;
        d();
        break;
        k = this.d;
        k = paramMotionEvent.findPointerIndex(k);
      } while (k == i);
      float f1 = paramMotionEvent.getY(k);
      int k = (int)f1;
      int i2 = this.e - k;
      boolean bool4 = this.c;
      if (!bool4)
      {
        int n = Math.abs(i2);
        int i3 = this.f;
        if (n > i3)
        {
          this.c = bool1;
          if (i2 <= 0) {
            break label326;
          }
          n = this.f;
          i2 -= n;
        }
      }
      int i4;
      label326:
      int i1;
      for (;;)
      {
        boolean bool5 = this.c;
        if (!bool5) {
          break;
        }
        this.e = k;
        i4 = b(paramView);
        localObject = this;
        b(paramCoordinatorLayout, paramView, i2, i4, 0);
        break;
        i1 = this.f;
        i2 += i1;
      }
      localObject = this.g;
      if (localObject != null)
      {
        this.g.addMovement(paramMotionEvent);
        localObject = this.g;
        f2 = 1.401E-42F;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000);
        localObject = this.g;
        i1 = this.d;
        float f3 = ((VelocityTracker)localObject).getYVelocity(i1);
        k = a(paramView);
        i4 = -k;
        a(paramCoordinatorLayout, paramView, i4, 0, f3);
      }
      this.c = false;
      this.d = i;
      localObject = this.g;
      if (localObject != null)
      {
        this.g.recycle();
        k = 0;
        f1 = 0.0F;
        localObject = null;
        this.g = null;
      }
    }
  }
  
  boolean c(View paramView)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */