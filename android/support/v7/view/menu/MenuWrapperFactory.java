package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.d.a.a;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class MenuWrapperFactory
{
  public static Menu wrapSupportMenu(Context paramContext, a parama)
  {
    MenuWrapperICS localMenuWrapperICS = new android/support/v7/view/menu/MenuWrapperICS;
    localMenuWrapperICS.<init>(paramContext, parama);
    return localMenuWrapperICS;
  }
  
  public static MenuItem wrapSupportMenuItem(Context paramContext, b paramb)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v7/view/menu/MenuItemWrapperJB;
      ((MenuItemWrapperJB)localObject).<init>(paramContext, paramb);
    }
    for (;;)
    {
      return (MenuItem)localObject;
      localObject = new android/support/v7/view/menu/MenuItemWrapperICS;
      ((MenuItemWrapperICS)localObject).<init>(paramContext, paramb);
    }
  }
  
  public static SubMenu wrapSupportSubMenu(Context paramContext, c paramc)
  {
    SubMenuWrapperICS localSubMenuWrapperICS = new android/support/v7/view/menu/SubMenuWrapperICS;
    localSubMenuWrapperICS.<init>(paramContext, paramc);
    return localSubMenuWrapperICS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuWrapperFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */