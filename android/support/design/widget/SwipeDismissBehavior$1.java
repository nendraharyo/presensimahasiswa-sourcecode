package android.support.design.widget;

import android.support.v4.view.r;
import android.support.v4.widget.q;
import android.support.v4.widget.q.a;
import android.view.View;
import android.view.ViewParent;

class SwipeDismissBehavior$1
  extends q.a
{
  private int b;
  private int c = -1;
  
  SwipeDismissBehavior$1(SwipeDismissBehavior paramSwipeDismissBehavior) {}
  
  private boolean a(View paramView, float paramFloat)
  {
    int i = 1;
    boolean bool1 = paramFloat < 0.0F;
    SwipeDismissBehavior localSwipeDismissBehavior1;
    int m;
    float f1;
    if (bool1)
    {
      int j = r.e(paramView);
      if (j == i)
      {
        j = i;
        localSwipeDismissBehavior1 = this.a;
        m = localSwipeDismissBehavior1.d;
        int i1 = 2;
        f1 = 2.8E-45F;
        if (m != i1) {
          break label62;
        }
      }
    }
    for (;;)
    {
      return i;
      boolean bool2 = false;
      break;
      label62:
      localSwipeDismissBehavior1 = this.a;
      m = localSwipeDismissBehavior1.d;
      if (m == 0)
      {
        if (bool2)
        {
          bool2 = paramFloat < 0.0F;
          if (!bool2) {
            i = 0;
          }
        }
        else
        {
          bool2 = paramFloat < 0.0F;
          if (!bool2) {
            i = 0;
          }
        }
      }
      else
      {
        localSwipeDismissBehavior1 = this.a;
        m = localSwipeDismissBehavior1.d;
        if (m == i)
        {
          if (bool2)
          {
            bool2 = paramFloat < 0.0F;
            if (!bool2) {
              i = 0;
            }
          }
          else
          {
            bool2 = paramFloat < 0.0F;
            if (!bool2)
            {
              i = 0;
              continue;
              int k = paramView.getLeft();
              int n = this.b;
              k -= n;
              float f2 = paramView.getWidth();
              SwipeDismissBehavior localSwipeDismissBehavior2 = this.a;
              f1 = localSwipeDismissBehavior2.e;
              f2 *= f1;
              n = Math.round(f2);
              k = Math.abs(k);
              if (k < n) {
                i = 0;
              }
            }
          }
        }
        else {
          i = 0;
        }
      }
    }
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void a(int paramInt)
  {
    SwipeDismissBehavior.a locala = this.a.c;
    if (locala != null)
    {
      locala = this.a.c;
      locala.a(paramInt);
    }
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    this.c = -1;
    int i = paramView.getWidth();
    int m = 0;
    SwipeDismissBehavior.a locala = null;
    boolean bool = a(paramView, paramFloat1);
    label69:
    int j;
    if (bool)
    {
      m = paramView.getLeft();
      int i1 = this.b;
      if (m < i1)
      {
        m = this.b - i;
        int i2 = 1;
        i = m;
        m = i2;
        Object localObject = this.a.b;
        int i3 = paramView.getTop();
        j = ((q)localObject).a(i, i3);
        if (j == 0) {
          break label149;
        }
        SwipeDismissBehavior.b localb = new android/support/design/widget/SwipeDismissBehavior$b;
        localObject = this.a;
        localb.<init>((SwipeDismissBehavior)localObject, paramView, m);
        r.a(paramView, localb);
      }
    }
    for (;;)
    {
      return;
      int n = this.b + j;
      break;
      int k = this.b;
      break label69;
      label149:
      if (n != 0)
      {
        locala = this.a.c;
        if (locala != null)
        {
          locala = this.a.c;
          locala.a(paramView);
        }
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = 1.0F;
    int i = this.b;
    float f2 = i;
    float f3 = paramView.getWidth();
    SwipeDismissBehavior localSwipeDismissBehavior1 = this.a;
    float f4 = localSwipeDismissBehavior1.f;
    f3 *= f4;
    f2 += f3;
    int j = this.b;
    f3 = j;
    f4 = paramView.getWidth();
    SwipeDismissBehavior localSwipeDismissBehavior2 = this.a;
    float f5 = localSwipeDismissBehavior2.g;
    f4 *= f5;
    f3 += f4;
    f4 = paramInt1;
    boolean bool = f4 < f2;
    if (!bool) {
      paramView.setAlpha(f1);
    }
    for (;;)
    {
      return;
      f4 = paramInt1;
      bool = f4 < f3;
      if (!bool)
      {
        paramView.setAlpha(0.0F);
      }
      else
      {
        f4 = paramInt1;
        f2 = SwipeDismissBehavior.b(f2, f3, f4);
        f2 = f1 - f2;
        f2 = SwipeDismissBehavior.a(0.0F, f2, f1);
        paramView.setAlpha(f2);
      }
    }
  }
  
  public boolean a(View paramView, int paramInt)
  {
    int i = this.c;
    int j = -1;
    SwipeDismissBehavior localSwipeDismissBehavior;
    boolean bool;
    if (i == j)
    {
      localSwipeDismissBehavior = this.a;
      bool = localSwipeDismissBehavior.a(paramView);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSwipeDismissBehavior = null;
    }
  }
  
  public int b(View paramView)
  {
    return paramView.getWidth();
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = r.e(paramView);
    SwipeDismissBehavior localSwipeDismissBehavior;
    int k;
    if (j == i)
    {
      j = i;
      localSwipeDismissBehavior = this.a;
      k = localSwipeDismissBehavior.d;
      if (k != 0) {
        break label111;
      }
      if (j == 0) {
        break label83;
      }
      j = this.b;
      i = paramView.getWidth();
      i = j - i;
      j = this.b;
    }
    for (;;)
    {
      return SwipeDismissBehavior.a(i, paramInt1, j);
      j = 0;
      break;
      label83:
      i = this.b;
      j = this.b;
      k = paramView.getWidth();
      j += k;
      continue;
      label111:
      localSwipeDismissBehavior = this.a;
      k = localSwipeDismissBehavior.d;
      if (k == i)
      {
        if (j != 0)
        {
          i = this.b;
          j = this.b;
          k = paramView.getWidth();
          j += k;
        }
        else
        {
          j = this.b;
          i = paramView.getWidth();
          i = j - i;
          j = this.b;
        }
      }
      else
      {
        j = this.b;
        i = paramView.getWidth();
        i = j - i;
        j = this.b;
        k = paramView.getWidth();
        j += k;
      }
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    this.c = paramInt;
    int i = paramView.getLeft();
    this.b = i;
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != null)
    {
      boolean bool = true;
      localViewParent.requestDisallowInterceptTouchEvent(bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\SwipeDismissBehavior$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */