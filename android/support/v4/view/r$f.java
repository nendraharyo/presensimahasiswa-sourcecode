package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;

class r$f
  extends r.e
{
  private static ThreadLocal d;
  
  private static Rect b()
  {
    Object localObject = d;
    if (localObject == null)
    {
      localObject = new java/lang/ThreadLocal;
      ((ThreadLocal)localObject).<init>();
      d = (ThreadLocal)localObject;
    }
    localObject = (Rect)d.get();
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      ThreadLocal localThreadLocal = d;
      localThreadLocal.set(localObject);
    }
    ((Rect)localObject).setEmpty();
    return (Rect)localObject;
  }
  
  public float A(View paramView)
  {
    return paramView.getZ();
  }
  
  public z a(View paramView, z paramz)
  {
    WindowInsets localWindowInsets1 = (WindowInsets)z.a(paramz);
    WindowInsets localWindowInsets2 = paramView.onApplyWindowInsets(localWindowInsets1);
    if (localWindowInsets2 != localWindowInsets1)
    {
      localWindowInsets1 = new android/view/WindowInsets;
      localWindowInsets1.<init>(localWindowInsets2);
    }
    return z.a(localWindowInsets1);
  }
  
  public void a(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramView.getBackground();
      localObject = paramView.getBackgroundTintList();
      if (localObject == null)
      {
        localObject = paramView.getBackgroundTintMode();
        if (localObject == null) {
          break label89;
        }
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramView.setBackground(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramView.getBackground();
      localObject = paramView.getBackgroundTintList();
      if (localObject == null)
      {
        localObject = paramView.getBackgroundTintMode();
        if (localObject == null) {
          break label89;
        }
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramView.setBackground(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public void a(View paramView, o paramo)
  {
    r.f.1 local1;
    if (paramo == null)
    {
      local1 = null;
      paramView.setOnApplyWindowInsetsListener(null);
    }
    for (;;)
    {
      return;
      local1 = new android/support/v4/view/r$f$1;
      local1.<init>(this, paramo);
      paramView.setOnApplyWindowInsetsListener(local1);
    }
  }
  
  public void a(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }
  
  public void c(View paramView, int paramInt)
  {
    int i = 0;
    Rect localRect = b();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof View;
    Object localObject2;
    int m;
    int n;
    boolean bool2;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (View)localObject1;
      m = ((View)localObject2).getLeft();
      n = ((View)localObject2).getTop();
      int i1 = ((View)localObject2).getRight();
      int j = ((View)localObject2).getBottom();
      localRect.set(m, n, i1, j);
      j = paramView.getLeft();
      m = paramView.getTop();
      n = paramView.getRight();
      i1 = paramView.getBottom();
      bool2 = localRect.intersects(j, m, n, i1);
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      super.c(paramView, paramInt);
      if (bool2)
      {
        int k = paramView.getLeft();
        i = paramView.getTop();
        m = paramView.getRight();
        n = paramView.getBottom();
        bool3 = localRect.intersect(k, i, m, n);
        if (bool3)
        {
          localObject1 = (View)localObject1;
          ((View)localObject1).invalidate(localRect);
        }
      }
      return;
      boolean bool3 = false;
      localObject2 = null;
      continue;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public void d(View paramView, int paramInt)
  {
    int i = 0;
    Rect localRect = b();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof View;
    Object localObject2;
    int m;
    int n;
    boolean bool2;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (View)localObject1;
      m = ((View)localObject2).getLeft();
      n = ((View)localObject2).getTop();
      int i1 = ((View)localObject2).getRight();
      int j = ((View)localObject2).getBottom();
      localRect.set(m, n, i1, j);
      j = paramView.getLeft();
      m = paramView.getTop();
      n = paramView.getRight();
      i1 = paramView.getBottom();
      bool2 = localRect.intersects(j, m, n, i1);
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      super.d(paramView, paramInt);
      if (bool2)
      {
        int k = paramView.getLeft();
        i = paramView.getTop();
        m = paramView.getRight();
        n = paramView.getBottom();
        bool3 = localRect.intersect(k, i, m, n);
        if (bool3)
        {
          localObject1 = (View)localObject1;
          ((View)localObject1).invalidate(localRect);
        }
      }
      return;
      boolean bool3 = false;
      localObject2 = null;
      continue;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public void h(View paramView)
  {
    paramView.requestApplyInsets();
  }
  
  public String t(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  public float u(View paramView)
  {
    return paramView.getElevation();
  }
  
  public float v(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  public boolean w(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  public void x(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public ColorStateList y(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  public PorterDuff.Mode z(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\r$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */