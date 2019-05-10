package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.d.a.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

class MenuWrapperICS
  extends BaseMenuWrapper
  implements Menu
{
  MenuWrapperICS(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }
  
  public MenuItem add(int paramInt)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).add(paramInt);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).add(paramInt1, paramInt2, paramInt3, paramInt4);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).add(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).add(paramCharSequence);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuItem[] arrayOfMenuItem = null;
    int i;
    if (paramArrayOfMenuItem != null)
    {
      i = paramArrayOfMenuItem.length;
      arrayOfMenuItem = new MenuItem[i];
    }
    a locala = (a)this.mWrappedObject;
    int j = paramInt1;
    int k = paramInt2;
    j = locala.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      i = 0;
      locala = null;
      k = arrayOfMenuItem.length;
      while (i < k)
      {
        MenuItem localMenuItem = arrayOfMenuItem[i];
        localMenuItem = getMenuItemWrapper(localMenuItem);
        paramArrayOfMenuItem[i] = localMenuItem;
        i += 1;
      }
    }
    return j;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    SubMenu localSubMenu = ((a)this.mWrappedObject).addSubMenu(paramInt);
    return getSubMenuWrapper(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SubMenu localSubMenu = ((a)this.mWrappedObject).addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4);
    return getSubMenuWrapper(localSubMenu);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    SubMenu localSubMenu = ((a)this.mWrappedObject).addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence);
    return getSubMenuWrapper(localSubMenu);
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    SubMenu localSubMenu = ((a)this.mWrappedObject).addSubMenu(paramCharSequence);
    return getSubMenuWrapper(localSubMenu);
  }
  
  public void clear()
  {
    internalClear();
    ((a)this.mWrappedObject).clear();
  }
  
  public void close()
  {
    ((a)this.mWrappedObject).close();
  }
  
  public MenuItem findItem(int paramInt)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).findItem(paramInt);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public MenuItem getItem(int paramInt)
  {
    MenuItem localMenuItem = ((a)this.mWrappedObject).getItem(paramInt);
    return getMenuItemWrapper(localMenuItem);
  }
  
  public boolean hasVisibleItems()
  {
    return ((a)this.mWrappedObject).hasVisibleItems();
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return ((a)this.mWrappedObject).isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return ((a)this.mWrappedObject).performIdentifierAction(paramInt1, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return ((a)this.mWrappedObject).performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public void removeGroup(int paramInt)
  {
    internalRemoveGroup(paramInt);
    ((a)this.mWrappedObject).removeGroup(paramInt);
  }
  
  public void removeItem(int paramInt)
  {
    internalRemoveItem(paramInt);
    ((a)this.mWrappedObject).removeItem(paramInt);
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((a)this.mWrappedObject).setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ((a)this.mWrappedObject).setGroupEnabled(paramInt, paramBoolean);
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ((a)this.mWrappedObject).setGroupVisible(paramInt, paramBoolean);
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    ((a)this.mWrappedObject).setQwertyMode(paramBoolean);
  }
  
  public int size()
  {
    return ((a)this.mWrappedObject).size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuWrapperICS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */