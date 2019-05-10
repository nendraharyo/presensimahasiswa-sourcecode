package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

public class AppBarLayout$Behavior
  extends h
{
  private int b;
  private ValueAnimator c;
  private int d = -1;
  private boolean e;
  private float f;
  private WeakReference g;
  private AppBarLayout.Behavior.a h;
  
  public AppBarLayout$Behavior() {}
  
  public AppBarLayout$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int a(AppBarLayout paramAppBarLayout, int paramInt)
  {
    int i = 0;
    int j = paramAppBarLayout.getChildCount();
    if (i < j)
    {
      View localView = paramAppBarLayout.getChildAt(i);
      int k = localView.getTop();
      int m = -paramInt;
      if (k <= m)
      {
        int n = localView.getBottom();
        k = -paramInt;
        if (n < k) {}
      }
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      i = -1;
    }
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt, float paramFloat)
  {
    int i = Math.abs(a() - paramInt);
    float f1 = Math.abs(paramFloat);
    float f2 = 0.0F;
    boolean bool = f1 < 0.0F;
    float f3;
    if (bool)
    {
      int j = 1148846080;
      f2 = 1000.0F;
      f3 = i / f1 * f2;
    }
    for (i = Math.round(f3) * 3;; i = (int)f3)
    {
      a(paramCoordinatorLayout, paramAppBarLayout, paramInt, i);
      return;
      f3 = i;
      f1 = paramAppBarLayout.getHeight();
      f3 = f3 / f1 + 1.0F;
      f1 = 150.0F;
      f3 *= f1;
    }
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2)
  {
    int i = a();
    ValueAnimator localValueAnimator1;
    boolean bool;
    if (i == paramInt1)
    {
      localValueAnimator1 = this.c;
      if (localValueAnimator1 != null)
      {
        localValueAnimator1 = this.c;
        bool = localValueAnimator1.isRunning();
        if (bool)
        {
          localValueAnimator1 = this.c;
          localValueAnimator1.cancel();
        }
      }
      return;
    }
    ValueAnimator localValueAnimator2 = this.c;
    Object localObject;
    if (localValueAnimator2 == null)
    {
      localValueAnimator2 = new android/animation/ValueAnimator;
      localValueAnimator2.<init>();
      this.c = localValueAnimator2;
      localValueAnimator2 = this.c;
      localObject = a.e;
      localValueAnimator2.setInterpolator((TimeInterpolator)localObject);
      localValueAnimator2 = this.c;
      localObject = new android/support/design/widget/AppBarLayout$Behavior$1;
      ((AppBarLayout.Behavior.1)localObject).<init>(this, paramCoordinatorLayout, paramAppBarLayout);
      localValueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    }
    for (;;)
    {
      localValueAnimator2 = this.c;
      long l = Math.min(paramInt2, 600);
      localValueAnimator2.setDuration(l);
      localValueAnimator2 = this.c;
      int j = 2;
      localObject = new int[j];
      localObject[0] = bool;
      bool = true;
      localObject[bool] = paramInt1;
      localValueAnimator2.setIntValues((int[])localObject);
      localValueAnimator1 = this.c;
      localValueAnimator1.start();
      break;
      localValueAnimator2 = this.c;
      localValueAnimator2.cancel();
    }
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    View localView = c(paramAppBarLayout, paramInt1);
    AppBarLayout.a locala;
    if (localView != null)
    {
      locala = (AppBarLayout.a)localView.getLayoutParams();
      int k = locala.a();
      n = k & 0x1;
      if (n != 0)
      {
        n = r.j(localView);
        if (paramInt2 <= 0) {
          break label177;
        }
        int i1 = k & 0xC;
        if (i1 == 0) {
          break label177;
        }
        k = -paramInt1;
        i2 = localView.getBottom() - n;
        n = paramAppBarLayout.getTopInset();
        i2 -= n;
        if (k < i2) {
          break label168;
        }
        k = i;
        bool1 = k;
      }
    }
    int j;
    label168:
    label177:
    do
    {
      boolean bool2 = paramAppBarLayout.a(bool1);
      i = Build.VERSION.SDK_INT;
      j = 11;
      if (i >= j) {
        if (!paramBoolean)
        {
          if (bool2)
          {
            bool2 = d(paramCoordinatorLayout, paramAppBarLayout);
            if (!bool2) {}
          }
        }
        else {
          paramAppBarLayout.jumpDrawablesToCurrentState();
        }
      }
      return;
      bool2 = false;
      locala = null;
      break;
      bool2 &= true;
    } while (m == 0);
    int m = -paramInt1;
    int i2 = localView.getBottom() - n;
    int n = paramAppBarLayout.getTopInset();
    i2 -= n;
    if (m >= i2) {}
    for (;;)
    {
      j = i;
      break;
      i = 0;
      f1 = 0.0F;
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & paramInt2;
    if (i == paramInt2) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private int b(AppBarLayout paramAppBarLayout, int paramInt)
  {
    int i = 0;
    float f1 = 0.0F;
    int k = Math.abs(paramInt);
    int m = paramAppBarLayout.getChildCount();
    int n = 0;
    float f2 = 0.0F;
    View localView;
    AppBarLayout.a locala;
    Interpolator localInterpolator;
    int i2;
    if (n < m)
    {
      localView = paramAppBarLayout.getChildAt(n);
      locala = (AppBarLayout.a)localView.getLayoutParams();
      localInterpolator = locala.b();
      int i1 = localView.getTop();
      if (k < i1) {
        break label265;
      }
      i1 = localView.getBottom();
      if (k > i1) {
        break label265;
      }
      if (localInterpolator != null)
      {
        n = locala.a();
        m = n & 0x1;
        if (m == 0) {
          break label278;
        }
        m = localView.getHeight();
        i1 = locala.topMargin;
        m += i1;
        i2 = locala.bottomMargin + m + 0;
        i = n & 0x2;
        if (i != 0)
        {
          i = r.j(localView);
          i2 -= i;
        }
      }
    }
    for (;;)
    {
      boolean bool = r.p(localView);
      int j;
      if (bool)
      {
        j = paramAppBarLayout.getTopInset();
        i2 -= j;
      }
      if (i2 > 0)
      {
        j = localView.getTop();
        j = k - j;
        f2 = i2;
        f1 = j;
        f3 = i2;
        f3 = f1 / f3;
        f3 = localInterpolator.getInterpolation(f3) * f2;
        i2 = Math.round(f3);
        j = Integer.signum(paramInt);
        n = localView.getTop();
        i2 += n;
        paramInt = j * i2;
      }
      return paramInt;
      label265:
      i2 = n + 1;
      n = i2;
      break;
      label278:
      i2 = 0;
      locala = null;
      float f3 = 0.0F;
    }
  }
  
  private static View c(AppBarLayout paramAppBarLayout, int paramInt)
  {
    int i = Math.abs(paramInt);
    int j = 0;
    View localView = null;
    int k = paramAppBarLayout.getChildCount();
    int m = 0;
    if (m < k)
    {
      localView = paramAppBarLayout.getChildAt(m);
      int n = localView.getTop();
      if (i >= n)
      {
        n = localView.getBottom();
        if (i > n) {}
      }
    }
    for (;;)
    {
      return localView;
      j = m + 1;
      m = j;
      break;
      j = 0;
      localView = null;
    }
  }
  
  private void c(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    int i = a();
    int j = a(paramAppBarLayout, i);
    View localView;
    int n;
    int i1;
    int i2;
    int k;
    if (j >= 0)
    {
      localView = paramAppBarLayout.getChildAt(j);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      n = locala.a();
      i1 = n & 0x11;
      i2 = 17;
      if (i1 == i2)
      {
        i2 = -localView.getTop();
        i1 = -localView.getBottom();
        int i3 = paramAppBarLayout.getChildCount() + -1;
        if (j == i3)
        {
          j = paramAppBarLayout.getTopInset();
          i1 += j;
        }
        boolean bool1 = a(n, 2);
        if (!bool1) {
          break label184;
        }
        k = r.j(localView);
        i1 += k;
        k = i2;
      }
    }
    for (;;)
    {
      i2 = (i1 + k) / 2;
      if (i < i2) {}
      for (;;)
      {
        k = -paramAppBarLayout.getTotalScrollRange();
        i2 = 0;
        i1 = android.support.v4.e.a.a(i1, k, 0);
        k = 0;
        a(paramCoordinatorLayout, paramAppBarLayout, i1, 0.0F);
        return;
        label184:
        boolean bool2 = a(n, 5);
        if (!bool2) {
          break label231;
        }
        m = r.j(localView) + i1;
        if (i < m) {
          break;
        }
        i1 = m;
        m = i2;
        break;
        i1 = m;
      }
      label231:
      int m = i2;
    }
  }
  
  private boolean d(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    List localList = paramCoordinatorLayout.d(paramAppBarLayout);
    int i = localList.size();
    int j = 0;
    Object localObject;
    int k;
    if (j < i)
    {
      localObject = ((CoordinatorLayout.e)((View)localList.get(j)).getLayoutParams()).b();
      boolean bool = localObject instanceof AppBarLayout.ScrollingViewBehavior;
      if (bool)
      {
        localObject = (AppBarLayout.ScrollingViewBehavior)localObject;
        k = ((AppBarLayout.ScrollingViewBehavior)localObject).d();
        if (k != 0) {
          k = 1;
        }
      }
    }
    for (;;)
    {
      return k;
      int m = 0;
      localObject = null;
      continue;
      m = j + 1;
      j = m;
      break;
      m = 0;
      localObject = null;
    }
  }
  
  int a()
  {
    int i = b();
    int j = this.b;
    return i + j;
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = a();
    int k;
    int n;
    int i2;
    if ((paramInt2 != 0) && (j >= paramInt2) && (j <= paramInt3))
    {
      k = android.support.v4.e.a.a(paramInt1, paramInt2, paramInt3);
      if (j != k)
      {
        boolean bool1 = paramAppBarLayout.b();
        if (!bool1) {
          break label154;
        }
        int m = b(paramAppBarLayout, k);
        boolean bool3 = a(m);
        int i1 = j - k;
        m = k - m;
        this.b = m;
        if (!bool3)
        {
          boolean bool2 = paramAppBarLayout.b();
          if (bool2) {
            paramCoordinatorLayout.b(paramAppBarLayout);
          }
        }
        n = b();
        paramAppBarLayout.a(n);
        if (k >= j) {
          break label161;
        }
        i2 = -1;
        label136:
        a(paramCoordinatorLayout, paramAppBarLayout, k, i2, false);
        i = i1;
      }
    }
    for (;;)
    {
      return i;
      label154:
      n = k;
      break;
      label161:
      i2 = 1;
      break label136;
      this.b = 0;
    }
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    c(paramCoordinatorLayout, paramAppBarLayout);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof AppBarLayout.Behavior.SavedState;
    float f1;
    if (bool1)
    {
      paramParcelable = (AppBarLayout.Behavior.SavedState)paramParcelable;
      Parcelable localParcelable = paramParcelable.getSuperState();
      super.a(paramCoordinatorLayout, paramAppBarLayout, localParcelable);
      int i = paramParcelable.a;
      this.d = i;
      f1 = paramParcelable.b;
      this.f = f1;
      boolean bool2 = paramParcelable.c;
      this.e = bool2;
    }
    for (;;)
    {
      return;
      super.a(paramCoordinatorLayout, paramAppBarLayout, paramParcelable);
      int j = -1;
      f1 = 0.0F / 0.0F;
      this.d = j;
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt)
  {
    if (paramInt == 0) {
      c(paramCoordinatorLayout, paramAppBarLayout);
    }
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.g = localWeakReference;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt4 < 0)
    {
      int i = paramAppBarLayout.getDownNestedScrollRange();
      int j = -i;
      b(paramCoordinatorLayout, paramAppBarLayout, paramInt4, j, 0);
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i;
    int j;
    if (paramInt2 != 0)
    {
      if (paramInt2 >= 0) {
        break label62;
      }
      i = -paramAppBarLayout.getTotalScrollRange();
      j = paramAppBarLayout.getDownNestedPreScrollRange();
    }
    for (int k = i + j;; k = 0)
    {
      if (i != k)
      {
        int m = 1;
        j = b(paramCoordinatorLayout, paramAppBarLayout, paramInt2, i, k);
        paramArrayOfInt[m] = j;
      }
      return;
      label62:
      j = paramAppBarLayout.getUpNestedPreScrollRange();
      i = -j;
    }
  }
  
  boolean a(AppBarLayout paramAppBarLayout)
  {
    boolean bool1 = true;
    Object localObject = this.h;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.h;
      bool2 = ((AppBarLayout.Behavior.a)localObject).a(paramAppBarLayout);
    }
    for (;;)
    {
      return bool2;
      localObject = this.g;
      if (localObject != null)
      {
        localObject = (View)this.g.get();
        if (localObject != null)
        {
          boolean bool3 = ((View)localObject).isShown();
          if (bool3)
          {
            int i = -1;
            bool2 = ((View)localObject).canScrollVertically(i);
            if (!bool2)
            {
              bool2 = bool1;
              continue;
            }
          }
        }
        bool2 = false;
        localObject = null;
      }
      else
      {
        bool2 = bool1;
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = 0;
    boolean bool1 = super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt);
    int k = paramAppBarLayout.getPendingAction();
    int m = this.d;
    Object localObject;
    int n;
    if (m >= 0)
    {
      m = k & 0x8;
      if (m == 0)
      {
        m = this.d;
        localObject = paramAppBarLayout.getChildAt(m);
        k = -((View)localObject).getBottom();
        boolean bool2 = this.e;
        if (bool2)
        {
          m = r.j((View)localObject);
          n = paramAppBarLayout.getTopInset();
          m = m + n + k;
          a_(paramCoordinatorLayout, paramAppBarLayout, m);
        }
      }
    }
    for (;;)
    {
      paramAppBarLayout.d();
      this.d = -1;
      m = b();
      k = -paramAppBarLayout.getTotalScrollRange();
      m = android.support.v4.e.a.a(m, k, 0);
      a(m);
      j = b();
      localObject = this;
      a(paramCoordinatorLayout, paramAppBarLayout, j, 0, i);
      m = b();
      paramAppBarLayout.a(m);
      return bool1;
      float f2 = ((View)localObject).getHeight();
      float f3 = this.f;
      f2 *= f3;
      m = Math.round(f2) + k;
      break;
      if (k != 0)
      {
        m = k & 0x4;
        if (m != 0) {
          m = i;
        }
        for (f2 = f1;; f2 = 0.0F)
        {
          n = k & 0x2;
          if (n == 0) {
            break label304;
          }
          k = -paramAppBarLayout.getUpNestedPreScrollRange();
          if (m == 0) {
            break label292;
          }
          a(paramCoordinatorLayout, paramAppBarLayout, k, 0.0F);
          break;
          m = 0;
          localObject = null;
        }
        label292:
        a_(paramCoordinatorLayout, paramAppBarLayout, k);
        continue;
        label304:
        k &= 0x1;
        if (k != 0) {
          if (m != 0) {
            a(paramCoordinatorLayout, paramAppBarLayout, 0, 0.0F);
          } else {
            a_(paramCoordinatorLayout, paramAppBarLayout, 0);
          }
        }
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = (CoordinatorLayout.e)paramAppBarLayout.getLayoutParams();
    int i = ((CoordinatorLayout.e)localObject).height;
    int j = -2;
    if (i == j)
    {
      int k = View.MeasureSpec.makeMeasureSpec(0, 0);
      localObject = paramCoordinatorLayout;
      paramCoordinatorLayout.a(paramAppBarLayout, paramInt1, paramInt2, k, paramInt4);
    }
    boolean bool;
    for (i = 1;; bool = super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt1, paramInt2, paramInt3, paramInt4)) {
      return i;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i = paramInt1 & 0x2;
    if (i != 0)
    {
      boolean bool = paramAppBarLayout.c();
      if (bool)
      {
        j = paramCoordinatorLayout.getHeight();
        int m = paramView1.getHeight();
        j -= m;
        int n = paramAppBarLayout.getHeight();
        if (j > n) {}
      }
    }
    int k;
    for (int j = 1;; k = 0)
    {
      if (j != 0)
      {
        ValueAnimator localValueAnimator = this.c;
        if (localValueAnimator != null)
        {
          localValueAnimator = this.c;
          localValueAnimator.cancel();
        }
      }
      this.g = null;
      return j;
    }
  }
  
  int b(AppBarLayout paramAppBarLayout)
  {
    return -paramAppBarLayout.getDownNestedScrollRange();
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    boolean bool = false;
    float f1 = 0.0F;
    Object localObject = null;
    Parcelable localParcelable = super.b(paramCoordinatorLayout, paramAppBarLayout);
    int i = b();
    int j = paramAppBarLayout.getChildCount();
    int k = 0;
    int n;
    AppBarLayout.Behavior.SavedState localSavedState;
    if (k < j)
    {
      View localView = paramAppBarLayout.getChildAt(k);
      int m = localView.getBottom() + i;
      n = localView.getTop() + i;
      if ((n <= 0) && (m >= 0))
      {
        localSavedState = new android/support/design/widget/AppBarLayout$Behavior$SavedState;
        localSavedState.<init>(localParcelable);
        localSavedState.a = k;
        int i1 = r.j(localView);
        k = paramAppBarLayout.getTopInset();
        i1 += k;
        if (m == i1)
        {
          bool = true;
          f1 = Float.MIN_VALUE;
        }
        localSavedState.c = bool;
        f1 = m;
        i1 = localView.getHeight();
        float f2 = i1;
        f1 /= f2;
        localSavedState.b = f1;
      }
    }
    for (localObject = localSavedState;; localObject = localParcelable)
    {
      return (Parcelable)localObject;
      n = k + 1;
      k = n;
      break;
    }
  }
  
  int c(AppBarLayout paramAppBarLayout)
  {
    return paramAppBarLayout.getTotalScrollRange();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout$Behavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */