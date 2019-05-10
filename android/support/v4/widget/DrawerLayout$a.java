package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.a;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

class DrawerLayout$a
  extends a
{
  private final Rect b;
  
  DrawerLayout$a(DrawerLayout paramDrawerLayout)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.b = localRect;
  }
  
  private void a(b paramb1, b paramb2)
  {
    Object localObject = this.b;
    paramb2.a((Rect)localObject);
    paramb1.b((Rect)localObject);
    paramb2.c((Rect)localObject);
    paramb1.d((Rect)localObject);
    boolean bool = paramb2.g();
    paramb1.e(bool);
    localObject = paramb2.o();
    paramb1.a((CharSequence)localObject);
    localObject = paramb2.p();
    paramb1.b((CharSequence)localObject);
    localObject = paramb2.r();
    paramb1.d((CharSequence)localObject);
    bool = paramb2.l();
    paramb1.j(bool);
    bool = paramb2.j();
    paramb1.h(bool);
    bool = paramb2.e();
    paramb1.c(bool);
    bool = paramb2.f();
    paramb1.d(bool);
    bool = paramb2.h();
    paramb1.f(bool);
    bool = paramb2.i();
    paramb1.g(bool);
    bool = paramb2.k();
    paramb1.i(bool);
    int i = paramb2.b();
    paramb1.a(i);
  }
  
  private void a(b paramb, ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      boolean bool = DrawerLayout.l(localView);
      if (bool) {
        paramb.b(localView);
      }
      j += 1;
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    int i = paramAccessibilityEvent.getEventType();
    int j = 32;
    if (i == j)
    {
      List localList = paramAccessibilityEvent.getText();
      Object localObject = this.a.c();
      if (localObject != null)
      {
        int k = this.a.e((View)localObject);
        DrawerLayout localDrawerLayout = this.a;
        localObject = localDrawerLayout.b(k);
        if (localObject != null) {
          localList.add(localObject);
        }
      }
    }
    boolean bool;
    for (i = 1;; bool = super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent)) {
      return i;
    }
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    String str = DrawerLayout.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    boolean bool1 = DrawerLayout.b;
    if (bool1) {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    }
    for (;;)
    {
      Object localObject = DrawerLayout.class.getName();
      paramb.b((CharSequence)localObject);
      paramb.c(false);
      paramb.d(false);
      localObject = b.a.a;
      paramb.a((b.a)localObject);
      localObject = b.a.b;
      paramb.a((b.a)localObject);
      return;
      b localb = b.a(paramb);
      super.onInitializeAccessibilityNodeInfo(paramView, localb);
      paramb.a(paramView);
      localObject = r.f(paramView);
      boolean bool2 = localObject instanceof View;
      if (bool2)
      {
        localObject = (View)localObject;
        paramb.c((View)localObject);
      }
      a(paramb, localb);
      localb.s();
      paramView = (ViewGroup)paramView;
      a(paramb, paramView);
    }
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = DrawerLayout.b;
    if (!bool)
    {
      bool = DrawerLayout.l(paramView);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (bool = super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */