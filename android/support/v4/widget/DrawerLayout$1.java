package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class DrawerLayout$1
  implements View.OnApplyWindowInsetsListener
{
  DrawerLayout$1(DrawerLayout paramDrawerLayout) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (DrawerLayout)paramView;
    int i = paramWindowInsets.getSystemWindowInsetTop();
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0)
    {
      paramView.a(paramWindowInsets, i);
      return paramWindowInsets.consumeSystemWindowInsets();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */