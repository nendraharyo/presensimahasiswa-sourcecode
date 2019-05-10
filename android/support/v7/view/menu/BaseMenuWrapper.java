package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.support.v4.h.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class BaseMenuWrapper
  extends BaseWrapper
{
  final Context mContext;
  private Map mMenuItems;
  private Map mSubMenus;
  
  BaseMenuWrapper(Context paramContext, Object paramObject)
  {
    super(paramObject);
    this.mContext = paramContext;
  }
  
  final MenuItem getMenuItemWrapper(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof b;
    Object localObject2;
    if (bool)
    {
      Object localObject1 = paramMenuItem;
      localObject1 = (b)paramMenuItem;
      localObject2 = this.mMenuItems;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v4/h/a;
        ((a)localObject2).<init>();
        this.mMenuItems = ((Map)localObject2);
      }
      localObject2 = (MenuItem)this.mMenuItems.get(paramMenuItem);
      if (localObject2 == null)
      {
        localObject2 = MenuWrapperFactory.wrapSupportMenuItem(this.mContext, (b)localObject1);
        Map localMap = this.mMenuItems;
        localMap.put(localObject1, localObject2);
      }
    }
    for (;;)
    {
      return (MenuItem)localObject2;
      localObject2 = paramMenuItem;
    }
  }
  
  final SubMenu getSubMenuWrapper(SubMenu paramSubMenu)
  {
    boolean bool = paramSubMenu instanceof c;
    Object localObject;
    if (bool)
    {
      paramSubMenu = (c)paramSubMenu;
      localObject = this.mSubMenus;
      if (localObject == null)
      {
        localObject = new android/support/v4/h/a;
        ((a)localObject).<init>();
        this.mSubMenus = ((Map)localObject);
      }
      localObject = (SubMenu)this.mSubMenus.get(paramSubMenu);
      if (localObject == null)
      {
        localObject = MenuWrapperFactory.wrapSupportSubMenu(this.mContext, paramSubMenu);
        Map localMap = this.mSubMenus;
        localMap.put(paramSubMenu, localObject);
      }
    }
    for (;;)
    {
      return (SubMenu)localObject;
      localObject = paramSubMenu;
    }
  }
  
  final void internalClear()
  {
    Map localMap = this.mMenuItems;
    if (localMap != null)
    {
      localMap = this.mMenuItems;
      localMap.clear();
    }
    localMap = this.mSubMenus;
    if (localMap != null)
    {
      localMap = this.mSubMenus;
      localMap.clear();
    }
  }
  
  final void internalRemoveGroup(int paramInt)
  {
    Object localObject = this.mMenuItems;
    if (localObject == null) {
      return;
    }
    localObject = this.mMenuItems.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (MenuItem)localIterator.next();
      int i = ((MenuItem)localObject).getGroupId();
      if (paramInt == i) {
        localIterator.remove();
      }
    }
  }
  
  final void internalRemoveItem(int paramInt)
  {
    Object localObject = this.mMenuItems;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.mMenuItems.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      int i;
      do
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (MenuItem)localIterator.next();
        i = ((MenuItem)localObject).getItemId();
      } while (paramInt != i);
      localIterator.remove();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\BaseMenuWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */