package android.support.design.widget;

import android.support.v4.widget.q;
import android.support.v4.widget.q.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior
  extends CoordinatorLayout.b
{
  private boolean a;
  q b;
  SwipeDismissBehavior.a c;
  int d = 2;
  float e;
  float f;
  float g;
  private float h = 0.0F;
  private boolean i;
  private final q.a j;
  
  public SwipeDismissBehavior()
  {
    this.e = f1;
    this.f = 0.0F;
    this.g = f1;
    SwipeDismissBehavior.1 local1 = new android/support/design/widget/SwipeDismissBehavior$1;
    local1.<init>(this);
    this.j = local1;
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    Object localObject = this.b;
    float f1;
    q.a locala;
    if (localObject == null)
    {
      boolean bool = this.i;
      if (!bool) {
        break label45;
      }
      f1 = this.h;
      locala = this.j;
    }
    for (localObject = q.a(paramViewGroup, f1, locala);; localObject = q.a(paramViewGroup, (q.a)localObject))
    {
      this.b = ((q)localObject);
      return;
      label45:
      localObject = this.j;
    }
  }
  
  static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat2 - paramFloat1;
    return f1 / f2;
  }
  
  public void a(float paramFloat)
  {
    float f1 = a(0.0F, paramFloat, 1.0F);
    this.f = f1;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(SwipeDismissBehavior.a parama)
  {
    this.c = parama;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    q localq = null;
    boolean bool2 = this.a;
    int m = paramMotionEvent.getActionMasked();
    switch (m)
    {
    }
    for (;;)
    {
      if (bool2)
      {
        a(paramCoordinatorLayout);
        localq = this.b;
        bool1 = localq.a(paramMotionEvent);
      }
      return bool1;
      float f1 = paramMotionEvent.getX();
      int k = (int)f1;
      float f2 = paramMotionEvent.getY();
      m = (int)f2;
      boolean bool3 = paramCoordinatorLayout.a(paramView, k, m);
      this.a = bool3;
      bool3 = this.a;
      continue;
      this.a = false;
    }
  }
  
  public boolean a(View paramView)
  {
    return true;
  }
  
  public void b(float paramFloat)
  {
    float f1 = a(0.0F, paramFloat, 1.0F);
    this.g = f1;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    q localq = this.b;
    boolean bool;
    if (localq != null)
    {
      localq = this.b;
      localq.b(paramMotionEvent);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localq = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\SwipeDismissBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */