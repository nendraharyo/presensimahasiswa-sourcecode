package android.support.design.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.view.MenuItem;

class BottomNavigationView$1
  implements MenuBuilder.Callback
{
  BottomNavigationView$1(BottomNavigationView paramBottomNavigationView) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    Object localObject = BottomNavigationView.a(this.a);
    if (localObject != null)
    {
      int i = paramMenuItem.getItemId();
      BottomNavigationView localBottomNavigationView = this.a;
      int j = localBottomNavigationView.getSelectedItemId();
      if (i == j)
      {
        localObject = BottomNavigationView.a(this.a);
        ((BottomNavigationView.a)localObject).a(paramMenuItem);
      }
    }
    for (;;)
    {
      return bool1;
      localObject = BottomNavigationView.b(this.a);
      if (localObject != null)
      {
        localObject = BottomNavigationView.b(this.a);
        boolean bool2 = ((BottomNavigationView.b)localObject).a(paramMenuItem);
        if (!bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomNavigationView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */