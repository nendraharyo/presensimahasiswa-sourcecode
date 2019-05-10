package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.b.a.c;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;

public class CoordinatorLayout$e
  extends ViewGroup.MarginLayoutParams
{
  CoordinatorLayout.b a;
  boolean b = false;
  public int c = 0;
  public int d = 0;
  public int e;
  int f;
  public int g;
  public int h;
  int i;
  int j;
  View k;
  View l;
  final Rect m;
  Object n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  
  public CoordinatorLayout$e(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.e = i1;
    this.f = i1;
    this.g = 0;
    this.h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.m = localRect;
  }
  
  CoordinatorLayout$e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = i1;
    this.f = i1;
    this.g = 0;
    this.h = 0;
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.m = ((Rect)localObject1);
    localObject1 = a.c.CoordinatorLayout_Layout;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1);
    int i2 = a.c.CoordinatorLayout_Layout_android_layout_gravity;
    i2 = ((TypedArray)localObject1).getInteger(i2, 0);
    this.c = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_anchor;
    i2 = ((TypedArray)localObject1).getResourceId(i2, i1);
    this.f = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_anchorGravity;
    i2 = ((TypedArray)localObject1).getInteger(i2, 0);
    this.d = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_keyline;
    i2 = ((TypedArray)localObject1).getInteger(i2, i1);
    this.e = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_insetEdge;
    i2 = ((TypedArray)localObject1).getInt(i2, 0);
    this.g = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges;
    i2 = ((TypedArray)localObject1).getInt(i2, 0);
    this.h = i2;
    i2 = a.c.CoordinatorLayout_Layout_layout_behavior;
    boolean bool = ((TypedArray)localObject1).hasValue(i2);
    this.b = bool;
    bool = this.b;
    if (bool)
    {
      int i3 = a.c.CoordinatorLayout_Layout_layout_behavior;
      Object localObject2 = ((TypedArray)localObject1).getString(i3);
      localObject2 = CoordinatorLayout.a(paramContext, paramAttributeSet, (String)localObject2);
      this.a = ((CoordinatorLayout.b)localObject2);
    }
    ((TypedArray)localObject1).recycle();
    localObject1 = this.a;
    if (localObject1 != null)
    {
      localObject1 = this.a;
      ((CoordinatorLayout.b)localObject1).a(this);
    }
  }
  
  public CoordinatorLayout$e(e parame)
  {
    super(parame);
    this.e = i1;
    this.f = i1;
    this.g = 0;
    this.h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.m = localRect;
  }
  
  public CoordinatorLayout$e(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.e = i1;
    this.f = i1;
    this.g = 0;
    this.h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.m = localRect;
  }
  
  public CoordinatorLayout$e(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.e = i1;
    this.f = i1;
    this.g = 0;
    this.h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.m = localRect;
  }
  
  private void a(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    int i1 = 0;
    int i2 = this.f;
    Object localObject1 = paramCoordinatorLayout.findViewById(i2);
    this.k = ((View)localObject1);
    localObject1 = this.k;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = this.k;
      if (localObject1 == paramCoordinatorLayout)
      {
        bool1 = paramCoordinatorLayout.isInEditMode();
        if (bool1)
        {
          this.l = null;
          this.k = null;
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("View can not be anchored to the the parent CoordinatorLayout");
      throw ((Throwable)localObject1);
      localObject1 = this.k;
      for (localObject2 = this.k.getParent();; localObject2 = ((ViewParent)localObject2).getParent())
      {
        if ((localObject2 == paramCoordinatorLayout) || (localObject2 == null)) {
          break label191;
        }
        if (localObject2 == paramView)
        {
          bool1 = paramCoordinatorLayout.isInEditMode();
          if (bool1)
          {
            this.l = null;
            this.k = null;
            break;
          }
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("Anchor must not be a descendant of the anchored view");
          throw ((Throwable)localObject1);
        }
        boolean bool2 = localObject2 instanceof View;
        if (bool2)
        {
          localObject1 = localObject2;
          localObject1 = (View)localObject2;
        }
      }
      label191:
      this.l = ((View)localObject1);
      continue;
      bool1 = paramCoordinatorLayout.isInEditMode();
      if (!bool1) {
        break;
      }
      this.l = null;
      this.k = null;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Could not find CoordinatorLayout descendant view with id ");
    Object localObject3 = paramCoordinatorLayout.getResources();
    i1 = this.f;
    localObject3 = ((Resources)localObject3).getResourceName(i1);
    localObject2 = (String)localObject3 + " to anchor view " + paramView;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private boolean a(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    int i1 = d.a(locale.g, paramInt);
    if (i1 != 0)
    {
      int i3 = d.a(this.h, paramInt) & i1;
      if (i3 == i1) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      locale = null;
    }
  }
  
  private boolean b(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    Object localObject = this.k;
    int i1 = ((View)localObject).getId();
    int i3 = this.f;
    if (i1 != i3)
    {
      i1 = 0;
      localObject = null;
    }
    for (;;)
    {
      return i1;
      localObject = this.k;
      for (ViewParent localViewParent = this.k.getParent();; localViewParent = ((ViewParent)localViewParent).getParent())
      {
        if (localViewParent == paramCoordinatorLayout) {
          break label117;
        }
        if ((localViewParent == null) || (localViewParent == paramView))
        {
          this.l = null;
          this.k = null;
          i2 = 0;
          localObject = null;
          break;
        }
        boolean bool = localViewParent instanceof View;
        if (bool)
        {
          localObject = localViewParent;
          localObject = (View)localViewParent;
        }
      }
      label117:
      this.l = ((View)localObject);
      int i2 = 1;
    }
  }
  
  public int a()
  {
    return this.f;
  }
  
  void a(int paramInt)
  {
    a(paramInt, false);
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      this.p = paramBoolean;
      continue;
      this.q = paramBoolean;
    }
  }
  
  void a(Rect paramRect)
  {
    this.m.set(paramRect);
  }
  
  public void a(CoordinatorLayout.b paramb)
  {
    CoordinatorLayout.b localb = this.a;
    if (localb != paramb)
    {
      localb = this.a;
      if (localb != null)
      {
        localb = this.a;
        localb.c();
      }
      this.a = paramb;
      localb = null;
      this.n = null;
      boolean bool = true;
      this.b = bool;
      if (paramb != null) {
        paramb.a(this);
      }
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    boolean bool1 = this.o;
    if (bool1)
    {
      bool1 = true;
      return bool1;
    }
    boolean bool2 = this.o;
    CoordinatorLayout.b localb = this.a;
    if (localb != null)
    {
      localb = this.a;
      bool1 = localb.e(paramCoordinatorLayout, paramView);
    }
    for (;;)
    {
      bool1 |= bool2;
      this.o = bool1;
      break;
      bool1 = false;
      localb = null;
    }
  }
  
  boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    Object localObject = this.l;
    if (paramView2 != localObject)
    {
      int i1 = r.e(paramCoordinatorLayout);
      bool = a(paramView2, i1);
      if (!bool)
      {
        localObject = this.a;
        if (localObject == null) {
          break label70;
        }
        localObject = this.a;
        bool = ((CoordinatorLayout.b)localObject).a(paramCoordinatorLayout, paramView1, paramView2);
        if (!bool) {
          break label70;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label70:
      bool = false;
      localObject = null;
    }
  }
  
  public CoordinatorLayout.b b()
  {
    return this.a;
  }
  
  View b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    boolean bool = false;
    View localView = null;
    int i1 = this.f;
    int i2 = -1;
    if (i1 == i2)
    {
      this.l = null;
      this.k = null;
    }
    for (;;)
    {
      return localView;
      localView = this.k;
      if (localView != null)
      {
        bool = b(paramView, paramCoordinatorLayout);
        if (bool) {}
      }
      else
      {
        a(paramView, paramCoordinatorLayout);
      }
      localView = this.k;
    }
  }
  
  boolean b(int paramInt)
  {
    boolean bool;
    switch (paramInt)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      return bool;
      bool = this.p;
      continue;
      bool = this.q;
    }
  }
  
  Rect c()
  {
    return this.m;
  }
  
  boolean d()
  {
    View localView = this.k;
    int i1;
    if (localView == null)
    {
      i1 = this.f;
      int i3 = -1;
      if (i1 != i3) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localView = null;
    }
  }
  
  boolean e()
  {
    CoordinatorLayout.b localb = this.a;
    if (localb == null)
    {
      localb = null;
      this.o = false;
    }
    return this.o;
  }
  
  void f()
  {
    this.o = false;
  }
  
  boolean g()
  {
    return this.r;
  }
  
  void h()
  {
    this.r = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */