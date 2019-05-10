package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

class TextInputLayout$a
  extends a
{
  TextInputLayout$a(TextInputLayout paramTextInputLayout) {}
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    String str = TextInputLayout.class.getSimpleName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    Object localObject = TextInputLayout.class.getSimpleName();
    paramb.b((CharSequence)localObject);
    localObject = this.a.d.g();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool) {
      paramb.c((CharSequence)localObject);
    }
    localObject = this.a.a;
    if (localObject != null)
    {
      localObject = this.a.a;
      paramb.d((View)localObject);
    }
    localObject = this.a.b;
    if (localObject != null) {}
    for (localObject = this.a.b.getText();; localObject = null)
    {
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        bool = true;
        paramb.l(bool);
        paramb.e((CharSequence)localObject);
      }
      return;
    }
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    CharSequence localCharSequence = this.a.d.g();
    boolean bool = TextUtils.isEmpty(localCharSequence);
    if (!bool)
    {
      List localList = paramAccessibilityEvent.getText();
      localList.add(localCharSequence);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */