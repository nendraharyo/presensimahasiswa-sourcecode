package android.support.v4.widget;

import android.view.View;

class DrawerLayout$e
  extends q.a
{
  private final int b;
  private q c;
  private final Runnable d;
  
  DrawerLayout$e(DrawerLayout paramDrawerLayout, int paramInt)
  {
    DrawerLayout.e.1 local1 = new android/support/v4/widget/DrawerLayout$e$1;
    local1.<init>(this);
    this.d = local1;
    this.b = paramInt;
  }
  
  private void c()
  {
    int i = 3;
    int j = this.b;
    if (j == i) {
      i = 5;
    }
    DrawerLayout localDrawerLayout = this.a;
    View localView = localDrawerLayout.c(i);
    if (localView != null)
    {
      localDrawerLayout = this.a;
      localDrawerLayout.i(localView);
    }
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void a()
  {
    DrawerLayout localDrawerLayout = this.a;
    Runnable localRunnable = this.d;
    localDrawerLayout.removeCallbacks(localRunnable);
  }
  
  public void a(int paramInt)
  {
    DrawerLayout localDrawerLayout = this.a;
    int i = this.b;
    View localView = this.c.c();
    localDrawerLayout.a(i, paramInt, localView);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    DrawerLayout localDrawerLayout = this.a;
    Runnable localRunnable = this.d;
    localDrawerLayout.postDelayed(localRunnable, 160L);
  }
  
  public void a(q paramq)
  {
    this.c = paramq;
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    float f1 = 0.5F;
    float f2 = this.a.d(paramView);
    int i = paramView.getWidth();
    DrawerLayout localDrawerLayout = this.a;
    int j = 3;
    int k = localDrawerLayout.a(paramView, j);
    if (k != 0)
    {
      k = paramFloat1 < 0.0F;
      if (k <= 0)
      {
        k = paramFloat1 < 0.0F;
        if (k == 0)
        {
          k = f2 < f1;
          if (k <= 0) {}
        }
      }
      else
      {
        k = 0;
        localDrawerLayout = null;
      }
    }
    for (;;)
    {
      q localq = this.c;
      i = paramView.getTop();
      localq.a(k, i);
      this.a.invalidate();
      return;
      int m = -i;
      continue;
      localDrawerLayout = this.a;
      m = localDrawerLayout.getWidth();
      boolean bool1 = paramFloat1 < 0.0F;
      if (!bool1)
      {
        bool1 = paramFloat1 < 0.0F;
        if (!bool1)
        {
          boolean bool2 = f2 < f1;
          if (!bool2) {}
        }
      }
      else
      {
        m -= i;
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramView.getWidth();
    DrawerLayout localDrawerLayout = this.a;
    int k = 3;
    boolean bool2 = localDrawerLayout.a(paramView, k);
    int m;
    float f1;
    int j;
    if (bool2)
    {
      m = i + paramInt1;
      f1 = m;
      f2 = i;
      f2 = f1 / f2;
      this.a.b(paramView, f2);
      m = 0;
      f1 = 0.0F;
      localDrawerLayout = null;
      boolean bool1 = f2 < 0.0F;
      if (bool1) {
        break label139;
      }
      j = 4;
    }
    for (float f2 = 5.6E-45F;; f2 = 0.0F)
    {
      paramView.setVisibility(j);
      this.a.invalidate();
      return;
      localDrawerLayout = this.a;
      m = localDrawerLayout.getWidth() - paramInt1;
      f1 = m;
      f2 = j;
      f2 = f1 / f2;
      break;
      label139:
      j = 0;
    }
  }
  
  public boolean a(View paramView, int paramInt)
  {
    DrawerLayout localDrawerLayout = this.a;
    boolean bool = localDrawerLayout.g(paramView);
    int i;
    if (bool)
    {
      localDrawerLayout = this.a;
      int k = this.b;
      bool = localDrawerLayout.a(paramView, k);
      if (bool)
      {
        localDrawerLayout = this.a;
        i = localDrawerLayout.a(paramView);
        if (i == 0) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localDrawerLayout = null;
    }
  }
  
  public int b(View paramView)
  {
    DrawerLayout localDrawerLayout = this.a;
    boolean bool = localDrawerLayout.g(paramView);
    int i;
    if (bool) {
      i = paramView.getWidth();
    }
    for (;;)
    {
      return i;
      i = 0;
      localDrawerLayout = null;
    }
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    DrawerLayout localDrawerLayout = this.a;
    int i = 3;
    boolean bool = localDrawerLayout.a(paramView, i);
    if (bool)
    {
      j = -paramView.getWidth();
      i = Math.min(paramInt1, 0);
    }
    for (int j = Math.max(j, i);; j = Math.max(i, j))
    {
      return j;
      localDrawerLayout = this.a;
      j = localDrawerLayout.getWidth();
      i = paramView.getWidth();
      i = j - i;
      j = Math.min(paramInt1, j);
    }
  }
  
  void b()
  {
    int i = 3;
    boolean bool = true;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = this.c;
    int k = ((q)localObject2).b();
    int m = this.b;
    int n;
    Object localObject3;
    if (m == i)
    {
      n = bool;
      if (n == 0) {
        break label204;
      }
      localObject2 = this.a.c(i);
      if (localObject2 != null) {
        j = -((View)localObject2).getWidth();
      }
      j += k;
      localObject3 = localObject2;
    }
    for (m = j;; m = j)
    {
      if (localObject3 != null)
      {
        if (n != 0)
        {
          j = ((View)localObject3).getLeft();
          if (j < m) {}
        }
        else
        {
          if (n != 0) {
            break label194;
          }
          j = ((View)localObject3).getLeft();
          if (j <= m) {
            break label194;
          }
        }
        localObject1 = this.a;
        j = ((DrawerLayout)localObject1).a((View)localObject3);
        if (j == 0)
        {
          localObject1 = (DrawerLayout.d)((View)localObject3).getLayoutParams();
          localq = this.c;
          i = ((View)localObject3).getTop();
          localq.a((View)localObject3, m, i);
          ((DrawerLayout.d)localObject1).c = bool;
          this.a.invalidate();
          c();
          localObject1 = this.a;
          ((DrawerLayout)localObject1).d();
        }
      }
      label194:
      return;
      n = 0;
      q localq = null;
      break;
      label204:
      localObject2 = this.a.c(5);
      localObject1 = this.a;
      j = ((DrawerLayout)localObject1).getWidth() - k;
      localObject3 = localObject2;
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & 0x1;
    int j = 1;
    if (i == j)
    {
      localObject1 = this.a;
      j = 3;
    }
    for (Object localObject1 = ((DrawerLayout)localObject1).c(j);; localObject1 = ((DrawerLayout)localObject1).c(j))
    {
      if (localObject1 != null)
      {
        Object localObject2 = this.a;
        j = ((DrawerLayout)localObject2).a((View)localObject1);
        if (j == 0)
        {
          localObject2 = this.c;
          ((q)localObject2).a((View)localObject1, paramInt2);
        }
      }
      return;
      localObject1 = this.a;
      j = 5;
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    ((DrawerLayout.d)paramView.getLayoutParams()).c = false;
    c();
  }
  
  public boolean b(int paramInt)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */