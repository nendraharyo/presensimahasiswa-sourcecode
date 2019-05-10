package android.support.design.widget;

import android.support.v4.e.a;
import android.support.v4.view.r;
import android.support.v4.widget.q;
import android.support.v4.widget.q.a;
import android.view.View;
import java.lang.ref.WeakReference;

class BottomSheetBehavior$1
  extends q.a
{
  BottomSheetBehavior$1(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public int a(View paramView)
  {
    BottomSheetBehavior localBottomSheetBehavior1 = this.a;
    boolean bool = localBottomSheetBehavior1.c;
    int i;
    BottomSheetBehavior localBottomSheetBehavior2;
    int j;
    if (bool)
    {
      localBottomSheetBehavior1 = this.a;
      i = localBottomSheetBehavior1.f;
      localBottomSheetBehavior2 = this.a;
      j = localBottomSheetBehavior2.a;
      i -= j;
    }
    for (;;)
    {
      return i;
      localBottomSheetBehavior1 = this.a;
      i = localBottomSheetBehavior1.b;
      localBottomSheetBehavior2 = this.a;
      j = localBottomSheetBehavior2.a;
      i -= j;
    }
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    int i = this.a.a;
    BottomSheetBehavior localBottomSheetBehavior = this.a;
    boolean bool = localBottomSheetBehavior.c;
    if (bool) {
      localBottomSheetBehavior = this.a;
    }
    for (int j = localBottomSheetBehavior.f;; j = localBottomSheetBehavior.b)
    {
      return a.a(paramInt1, i, j);
      localBottomSheetBehavior = this.a;
    }
  }
  
  public void a(int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      BottomSheetBehavior localBottomSheetBehavior = this.a;
      localBottomSheetBehavior.b(i);
    }
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = 4;
    int k = 3;
    int m = 0;
    BottomSheetBehavior localBottomSheetBehavior1 = null;
    boolean bool2 = paramFloat2 < 0.0F;
    Object localObject1;
    Object localObject2;
    if (bool2)
    {
      localObject1 = this.a;
      i = ((BottomSheetBehavior)localObject1).a;
      localObject2 = this.a.e;
      m = paramView.getLeft();
      boolean bool1 = ((q)localObject2).a(m, i);
      if (!bool1) {
        break label308;
      }
      localObject1 = this.a;
      int n = 2;
      ((BottomSheetBehavior)localObject1).b(n);
      localObject1 = new android/support/design/widget/BottomSheetBehavior$b;
      localObject2 = this.a;
      ((BottomSheetBehavior.b)localObject1).<init>((BottomSheetBehavior)localObject2, paramView, k);
      r.a(paramView, (Runnable)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = this.a;
      boolean bool3 = ((BottomSheetBehavior)localObject2).c;
      if (bool3)
      {
        localObject2 = this.a;
        bool3 = ((BottomSheetBehavior)localObject2).a(paramView, paramFloat2);
        if (bool3)
        {
          localBottomSheetBehavior2 = this.a;
          j = localBottomSheetBehavior2.f;
          k = 5;
          break;
        }
      }
      bool3 = paramFloat2 < 0.0F;
      if (!bool3)
      {
        int i1 = paramView.getTop();
        localBottomSheetBehavior1 = this.a;
        m = localBottomSheetBehavior1.a;
        m = Math.abs(i1 - m);
        BottomSheetBehavior localBottomSheetBehavior3 = this.a;
        int i2 = localBottomSheetBehavior3.b;
        i1 = Math.abs(i1 - i2);
        if (m < i1)
        {
          localObject1 = this.a;
          j = ((BottomSheetBehavior)localObject1).a;
          break;
        }
        localBottomSheetBehavior2 = this.a;
        k = localBottomSheetBehavior2.b;
        i3 = j;
        j = k;
        k = i3;
        break;
      }
      BottomSheetBehavior localBottomSheetBehavior2 = this.a;
      k = localBottomSheetBehavior2.b;
      int i3 = j;
      int j = k;
      k = i3;
      break;
      label308:
      localObject1 = this.a;
      ((BottomSheetBehavior)localObject1).b(k);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.c(paramInt2);
  }
  
  public boolean a(View paramView, int paramInt)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    Object localObject = this.a;
    int j = ((BottomSheetBehavior)localObject).d;
    if (j == i) {}
    boolean bool3;
    do
    {
      boolean bool2;
      do
      {
        return bool1;
        localObject = this.a;
        bool2 = ((BottomSheetBehavior)localObject).j;
      } while (bool2);
      localObject = this.a;
      int k = ((BottomSheetBehavior)localObject).d;
      int m = 3;
      if (k != m) {
        break;
      }
      localObject = this.a;
      k = ((BottomSheetBehavior)localObject).i;
      if (k != paramInt) {
        break;
      }
      localObject = (View)this.a.h.get();
      if (localObject == null) {
        break;
      }
      m = -1;
      bool3 = ((View)localObject).canScrollVertically(m);
    } while (bool3);
    localObject = this.a.g;
    if (localObject != null)
    {
      localObject = this.a.g.get();
      if (localObject == paramView) {
        bool3 = i;
      }
    }
    for (;;)
    {
      bool1 = bool3;
      break;
      bool3 = false;
      localObject = null;
    }
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getLeft();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomSheetBehavior$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */