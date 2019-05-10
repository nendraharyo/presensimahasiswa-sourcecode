package android.support.v4.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

final class DrawerLayout$b
  extends a
{
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    boolean bool = DrawerLayout.l(paramView);
    if (!bool)
    {
      bool = false;
      paramb.c(null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */