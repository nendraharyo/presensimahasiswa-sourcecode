package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.SubMenu;

public final class b
  extends MenuBuilder
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  protected MenuItem addInternal(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = size() + 1;
    int j = 5;
    Object localObject;
    if (i > j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
      throw ((Throwable)localObject);
    }
    stopDispatchingItemsChanged();
    MenuItem localMenuItem = super.addInternal(paramInt1, paramInt2, paramInt3, paramCharSequence);
    boolean bool1 = localMenuItem instanceof MenuItemImpl;
    if (bool1)
    {
      localObject = localMenuItem;
      localObject = (MenuItemImpl)localMenuItem;
      boolean bool2 = true;
      ((MenuItemImpl)localObject).setExclusiveCheckable(bool2);
    }
    startDispatchingItemsChanged();
    return (MenuItem)localMenuItem;
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("BottomNavigationView does not support submenus");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */