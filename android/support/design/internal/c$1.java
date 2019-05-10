package android.support.design.internal;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

class c$1
  implements View.OnClickListener
{
  c$1(c paramc) {}
  
  public void onClick(View paramView)
  {
    paramView = (a)paramView;
    MenuItemImpl localMenuItemImpl = paramView.getItemData();
    MenuBuilder localMenuBuilder = c.b(this.a);
    BottomNavigationPresenter localBottomNavigationPresenter = c.a(this.a);
    boolean bool = localMenuBuilder.performItemAction(localMenuItemImpl, localBottomNavigationPresenter, 0);
    if (!bool)
    {
      bool = true;
      localMenuItemImpl.setChecked(bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */