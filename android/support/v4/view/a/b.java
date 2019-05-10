package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class b
{
  public int a = -1;
  private final AccessibilityNodeInfo b;
  
  private b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.b = paramAccessibilityNodeInfo;
  }
  
  public static b a(b paramb)
  {
    return a(AccessibilityNodeInfo.obtain(paramb.b));
  }
  
  public static b a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    b localb = new android/support/v4/view/a/b;
    localb.<init>(paramAccessibilityNodeInfo);
    return localb;
  }
  
  private static String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "ACTION_UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "ACTION_FOCUS";
      continue;
      str = "ACTION_CLEAR_FOCUS";
      continue;
      str = "ACTION_SELECT";
      continue;
      str = "ACTION_CLEAR_SELECTION";
      continue;
      str = "ACTION_CLICK";
      continue;
      str = "ACTION_LONG_CLICK";
      continue;
      str = "ACTION_ACCESSIBILITY_FOCUS";
      continue;
      str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
      continue;
      str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
      continue;
      str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
      continue;
      str = "ACTION_NEXT_HTML_ELEMENT";
      continue;
      str = "ACTION_PREVIOUS_HTML_ELEMENT";
      continue;
      str = "ACTION_SCROLL_FORWARD";
      continue;
      str = "ACTION_SCROLL_BACKWARD";
      continue;
      str = "ACTION_CUT";
      continue;
      str = "ACTION_COPY";
      continue;
      str = "ACTION_PASTE";
      continue;
      str = "ACTION_SET_SELECTION";
    }
  }
  
  public AccessibilityNodeInfo a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b.addAction(paramInt);
  }
  
  public void a(Rect paramRect)
  {
    this.b.getBoundsInParent(paramRect);
  }
  
  public void a(View paramView)
  {
    this.b.setSource(paramView);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.b.setPackageName(paramCharSequence);
  }
  
  public void a(Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      paramObject = (b.b)paramObject;
      AccessibilityNodeInfo.CollectionInfo localCollectionInfo = (AccessibilityNodeInfo.CollectionInfo)((b.b)paramObject).a;
      localAccessibilityNodeInfo.setCollectionInfo(localCollectionInfo);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b.setCheckable(paramBoolean);
  }
  
  public boolean a(b.a parama)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction;
    boolean bool;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityAction = (AccessibilityNodeInfo.AccessibilityAction)parama.E;
      bool = localAccessibilityNodeInfo.removeAction(localAccessibilityAction);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityAction = null;
    }
  }
  
  public int b()
  {
    return this.b.getActions();
  }
  
  public void b(Rect paramRect)
  {
    this.b.setBoundsInParent(paramRect);
  }
  
  public void b(View paramView)
  {
    this.b.addChild(paramView);
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.b.setClassName(paramCharSequence);
  }
  
  public void b(Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      paramObject = (b.c)paramObject;
      AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo)((b.c)paramObject).a;
      localAccessibilityNodeInfo.setCollectionItemInfo(localCollectionItemInfo);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.b.setChecked(paramBoolean);
  }
  
  public void c(Rect paramRect)
  {
    this.b.getBoundsInScreen(paramRect);
  }
  
  public void c(View paramView)
  {
    this.b.setParent(paramView);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
  }
  
  public void c(boolean paramBoolean)
  {
    this.b.setFocusable(paramBoolean);
  }
  
  public boolean c()
  {
    return this.b.isCheckable();
  }
  
  public void d(Rect paramRect)
  {
    this.b.setBoundsInScreen(paramRect);
  }
  
  public void d(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setLabelFor(paramView);
    }
  }
  
  public void d(CharSequence paramCharSequence)
  {
    this.b.setContentDescription(paramCharSequence);
  }
  
  public void d(boolean paramBoolean)
  {
    this.b.setFocused(paramBoolean);
  }
  
  public boolean d()
  {
    return this.b.isChecked();
  }
  
  public void e(CharSequence paramCharSequence)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setError(paramCharSequence);
    }
  }
  
  public void e(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setVisibleToUser(paramBoolean);
    }
  }
  
  public boolean e()
  {
    return this.b.isFocusable();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (b)paramObject;
          localObject1 = this.b;
          if (localObject1 == null)
          {
            localObject1 = ((b)paramObject).b;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.b;
            localObject2 = ((b)paramObject).b;
            boolean bool2 = ((AccessibilityNodeInfo)localObject1).equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public void f(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setAccessibilityFocused(paramBoolean);
    }
  }
  
  public boolean f()
  {
    return this.b.isFocused();
  }
  
  public void g(boolean paramBoolean)
  {
    this.b.setSelected(paramBoolean);
  }
  
  public boolean g()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    AccessibilityNodeInfo localAccessibilityNodeInfo;
    boolean bool;
    if (i >= j)
    {
      localAccessibilityNodeInfo = this.b;
      bool = localAccessibilityNodeInfo.isVisibleToUser();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityNodeInfo = null;
    }
  }
  
  public void h(boolean paramBoolean)
  {
    this.b.setClickable(paramBoolean);
  }
  
  public boolean h()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    AccessibilityNodeInfo localAccessibilityNodeInfo;
    boolean bool;
    if (i >= j)
    {
      localAccessibilityNodeInfo = this.b;
      bool = localAccessibilityNodeInfo.isAccessibilityFocused();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityNodeInfo = null;
    }
  }
  
  public int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
    int i;
    if (localAccessibilityNodeInfo == null)
    {
      i = 0;
      localAccessibilityNodeInfo = null;
    }
    for (;;)
    {
      return i;
      localAccessibilityNodeInfo = this.b;
      i = localAccessibilityNodeInfo.hashCode();
    }
  }
  
  public void i(boolean paramBoolean)
  {
    this.b.setLongClickable(paramBoolean);
  }
  
  public boolean i()
  {
    return this.b.isSelected();
  }
  
  public void j(boolean paramBoolean)
  {
    this.b.setEnabled(paramBoolean);
  }
  
  public boolean j()
  {
    return this.b.isClickable();
  }
  
  public void k(boolean paramBoolean)
  {
    this.b.setScrollable(paramBoolean);
  }
  
  public boolean k()
  {
    return this.b.isLongClickable();
  }
  
  public void l(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setContentInvalid(paramBoolean);
    }
  }
  
  public boolean l()
  {
    return this.b.isEnabled();
  }
  
  public void m(boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.b;
      localAccessibilityNodeInfo.setCanOpenPopup(paramBoolean);
    }
  }
  
  public boolean m()
  {
    return this.b.isPassword();
  }
  
  public boolean n()
  {
    return this.b.isScrollable();
  }
  
  public CharSequence o()
  {
    return this.b.getPackageName();
  }
  
  public CharSequence p()
  {
    return this.b.getClassName();
  }
  
  public CharSequence q()
  {
    return this.b.getText();
  }
  
  public CharSequence r()
  {
    return this.b.getContentDescription();
  }
  
  public void s()
  {
    this.b.recycle();
  }
  
  public String t()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {}
    for (String str = this.b.getViewIdResourceName();; str = null)
    {
      return str;
      i = 0;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = super.toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    a((Rect)localObject1);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "; boundsInParent: " + localObject1;
    localStringBuilder.append((String)localObject2);
    c((Rect)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = "; boundsInScreen: ";
    localObject1 = str + localObject1;
    localStringBuilder.append((String)localObject1);
    localObject1 = localStringBuilder.append("; packageName: ");
    localObject2 = o();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; className: ");
    localObject2 = p();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; text: ");
    localObject2 = q();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; contentDescription: ");
    localObject2 = r();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; viewId: ");
    localObject2 = t();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append("; checkable: ");
    boolean bool = c();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; checked: ");
    bool = d();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; focusable: ");
    bool = e();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; focused: ");
    bool = f();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; selected: ");
    bool = i();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; clickable: ");
    bool = j();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; longClickable: ");
    bool = k();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; enabled: ");
    bool = l();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; password: ");
    bool = m();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = "; scrollable: ";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    bool = n();
    localObject1 = bool;
    localStringBuilder.append((String)localObject1);
    localObject1 = "; [";
    localStringBuilder.append((String)localObject1);
    int j = b();
    while (j != 0)
    {
      int k = Integer.numberOfTrailingZeros(j);
      int i = 1 << k;
      k = i ^ 0xFFFFFFFF;
      j &= k;
      localObject2 = b(i);
      localStringBuilder.append((String)localObject2);
      if (j != 0)
      {
        localObject2 = ", ";
        localStringBuilder.append((String)localObject2);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */