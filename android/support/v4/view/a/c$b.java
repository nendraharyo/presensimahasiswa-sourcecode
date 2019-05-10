package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

class c$b
  extends c.a
{
  c$b(c paramc)
  {
    super(paramc);
  }
  
  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    Object localObject = this.a.b(paramInt);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((b)localObject).a()) {
      return (AccessibilityNodeInfo)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */