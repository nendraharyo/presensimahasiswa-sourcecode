package android.support.design.widget;

import android.support.v4.view.r;
import android.view.View;
import java.util.Comparator;

class CoordinatorLayout$g
  implements Comparator
{
  public int a(View paramView1, View paramView2)
  {
    float f1 = r.x(paramView1);
    float f2 = r.x(paramView2);
    boolean bool1 = f1 < f2;
    int i;
    if (bool1)
    {
      i = -1;
      f1 = 0.0F / 0.0F;
    }
    for (;;)
    {
      return i;
      boolean bool2 = f1 < f2;
      if (bool2)
      {
        bool2 = true;
        f1 = Float.MIN_VALUE;
      }
      else
      {
        bool2 = false;
        f1 = 0.0F;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */