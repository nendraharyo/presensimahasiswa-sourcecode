package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.a.b;
import android.support.v4.view.r;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.List;

public class AppBarLayout
  extends LinearLayout
{
  private int a;
  private int b;
  private int c;
  private boolean d;
  private int e;
  private z f;
  private List g;
  private boolean h;
  private boolean i;
  private int[] j;
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int k = 0;
    int n;
    if (paramBoolean1)
    {
      m = 1;
      n = m;
      if (!paramBoolean2) {
        break label64;
      }
    }
    label64:
    for (int m = 4;; m = 0)
    {
      m |= n;
      if (paramBoolean3) {
        k = 8;
      }
      k |= m;
      this.e = k;
      requestLayout();
      return;
      m = 2;
      n = m;
      break;
    }
  }
  
  private boolean b(boolean paramBoolean)
  {
    boolean bool = this.h;
    if (bool != paramBoolean)
    {
      this.h = paramBoolean;
      refreshDrawableState();
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void e()
  {
    int k = getChildCount();
    int m = 0;
    AppBarLayout.a locala;
    boolean bool;
    if (m < k)
    {
      locala = (AppBarLayout.a)getChildAt(m).getLayoutParams();
      bool = locala.c();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      b(bool);
      return;
      int n = m + 1;
      m = n;
      break;
      n = 0;
      locala = null;
    }
  }
  
  private void f()
  {
    int k = -1;
    this.a = k;
    this.b = k;
    this.c = k;
  }
  
  protected AppBarLayout.a a()
  {
    AppBarLayout.a locala = new android/support/design/widget/AppBarLayout$a;
    locala.<init>(-1, -2);
    return locala;
  }
  
  public AppBarLayout.a a(AttributeSet paramAttributeSet)
  {
    AppBarLayout.a locala = new android/support/design/widget/AppBarLayout$a;
    Context localContext = getContext();
    locala.<init>(localContext, paramAttributeSet);
    return locala;
  }
  
  protected AppBarLayout.a a(ViewGroup.LayoutParams paramLayoutParams)
  {
    int k = Build.VERSION.SDK_INT;
    int m = 19;
    boolean bool;
    AppBarLayout.a locala;
    if (k >= m)
    {
      bool = paramLayoutParams instanceof LinearLayout.LayoutParams;
      if (bool)
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        paramLayoutParams = (LinearLayout.LayoutParams)paramLayoutParams;
        locala.<init>(paramLayoutParams);
      }
    }
    for (;;)
    {
      return locala;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        locala.<init>(paramLayoutParams);
      }
      else
      {
        locala = new android/support/design/widget/AppBarLayout$a;
        locala.<init>(paramLayoutParams);
      }
    }
  }
  
  void a(int paramInt)
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      int k = 0;
      localObject = null;
      int m = this.g.size();
      for (int n = 0; n < m; n = k)
      {
        localObject = (AppBarLayout.b)this.g.get(n);
        if (localObject != null) {
          ((AppBarLayout.b)localObject).a(this, paramInt);
        }
        k = n + 1;
      }
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, true);
  }
  
  boolean a(boolean paramBoolean)
  {
    boolean bool = this.i;
    if (bool != paramBoolean)
    {
      this.i = paramBoolean;
      refreshDrawableState();
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  boolean b()
  {
    return this.d;
  }
  
  boolean c()
  {
    int k = getTotalScrollRange();
    if (k != 0) {}
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof AppBarLayout.a;
  }
  
  void d()
  {
    this.e = 0;
  }
  
  int getDownNestedPreScrollRange()
  {
    int k = this.b;
    int m = -1;
    if (k != m)
    {
      k = this.b;
      return k;
    }
    k = getChildCount() + -1;
    int n = k;
    m = 0;
    label30:
    View localView;
    int i1;
    int i2;
    if (n >= 0)
    {
      localView = getChildAt(n);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      i1 = localView.getMeasuredHeight();
      i2 = locala.a;
      int i3 = i2 & 0x5;
      int i4 = 5;
      if (i3 == i4)
      {
        i3 = locala.topMargin;
        k = locala.bottomMargin + i3 + m;
        m = i2 & 0x8;
        if (m != 0)
        {
          m = r.j(localView);
          k += m;
        }
      }
    }
    for (;;)
    {
      n += -1;
      m = k;
      break label30;
      m = i2 & 0x2;
      if (m != 0)
      {
        m = r.j(localView);
        m = i1 - m;
        k += m;
      }
      else
      {
        m = getTopInset();
        m = i1 - m;
        k += m;
        continue;
        if (m > 0)
        {
          k = Math.max(0, m);
          this.b = k;
          break;
        }
        k = m;
      }
    }
  }
  
  int getDownNestedScrollRange()
  {
    int k = this.c;
    int m = -1;
    if (k != m)
    {
      k = this.c;
      return k;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    label29:
    if (i1 < n)
    {
      View localView = getChildAt(i1);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i3 = locala.topMargin;
      int i4 = locala.bottomMargin;
      i3 += i4;
      i2 += i3;
      k = locala.a;
      i3 = k & 0x1;
      if (i3 != 0)
      {
        m += i2;
        k &= 0x2;
        if (k != 0)
        {
          k = r.j(localView);
          i1 = getTopInset();
          k += i1;
        }
      }
    }
    for (k = m - k;; k = m)
    {
      k = Math.max(0, k);
      this.c = k;
      break;
      k = i1 + 1;
      i1 = k;
      break label29;
    }
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int k = getTopInset();
    int m = r.j(this);
    if (m != 0) {
      m = m * 2 + k;
    }
    for (;;)
    {
      return m;
      m = getChildCount();
      int n = 1;
      View localView;
      if (m >= n)
      {
        m += -1;
        localView = getChildAt(m);
        m = r.j(localView);
      }
      for (;;)
      {
        if (m == 0) {
          break label72;
        }
        m = m * 2 + k;
        break;
        m = 0;
        localView = null;
      }
      label72:
      m = getHeight() / 3;
    }
  }
  
  int getPendingAction()
  {
    return this.e;
  }
  
  public float getTargetElevation()
  {
    return 0.0F;
  }
  
  final int getTopInset()
  {
    z localz = this.f;
    int k;
    if (localz != null)
    {
      localz = this.f;
      k = localz.b();
    }
    for (;;)
    {
      return k;
      k = 0;
      localz = null;
    }
  }
  
  public final int getTotalScrollRange()
  {
    int k = this.a;
    int m = -1;
    if (k != m)
    {
      k = this.a;
      return k;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    label29:
    if (i1 < n)
    {
      View localView = getChildAt(i1);
      AppBarLayout.a locala = (AppBarLayout.a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i3 = locala.a;
      int i4 = i3 & 0x1;
      if (i4 != 0)
      {
        i4 = locala.topMargin;
        i2 += i4;
        k = locala.bottomMargin + i2;
        m += k;
        k = i3 & 0x2;
        if (k != 0) {
          k = r.j(localView);
        }
      }
    }
    for (k = m - k;; k = m)
    {
      m = getTopInset();
      k -= m;
      k = Math.max(0, k);
      this.a = k;
      break;
      k = i1 + 1;
      i1 = k;
      break label29;
    }
  }
  
  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt1 = this.j;
    if (arrayOfInt1 == null)
    {
      k = 2;
      arrayOfInt1 = new int[k];
      this.j = arrayOfInt1;
    }
    int[] arrayOfInt2 = this.j;
    int k = arrayOfInt2.length + paramInt;
    int[] arrayOfInt3 = super.onCreateDrawableState(k);
    int i1 = 0;
    boolean bool1 = this.h;
    if (bool1)
    {
      int m = a.b.state_collapsible;
      arrayOfInt2[0] = m;
      i1 = 1;
      boolean bool2 = this.h;
      if (!bool2) {
        break label107;
      }
      bool2 = this.i;
      if (!bool2) {
        break label107;
      }
    }
    label107:
    for (int n = a.b.state_collapsed;; n = -a.b.state_collapsed)
    {
      arrayOfInt2[i1] = n;
      return mergeDrawableStates(arrayOfInt3, arrayOfInt2);
      n = -a.b.state_collapsible;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 0;
    Interpolator localInterpolator = null;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    f();
    this.d = false;
    int m = getChildCount();
    for (int n = 0;; n = k)
    {
      if (n < m)
      {
        localInterpolator = ((AppBarLayout.a)getChildAt(n).getLayoutParams()).b();
        if (localInterpolator != null)
        {
          k = 1;
          this.d = k;
        }
      }
      else
      {
        e();
        return;
      }
      k = n + 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    f();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    boolean bool = r.w(this);
    a(paramBoolean, bool);
  }
  
  public void setOrientation(int paramInt)
  {
    int k = 1;
    if (paramInt != k)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("AppBarLayout is always vertical and does not support horizontal orientation");
      throw localIllegalArgumentException;
    }
    super.setOrientation(paramInt);
  }
  
  public void setTargetElevation(float paramFloat)
  {
    int k = Build.VERSION.SDK_INT;
    int m = 21;
    if (k >= m) {
      s.a(this, paramFloat);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */