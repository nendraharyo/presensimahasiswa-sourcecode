package android.support.v7.view;

import android.content.Context;
import android.support.v4.d.a.a;
import android.support.v4.d.a.b;
import android.support.v4.h.m;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class SupportActionModeWrapper$CallbackWrapper
  implements ActionMode.Callback
{
  final ArrayList mActionModes;
  final Context mContext;
  final m mMenus;
  final android.view.ActionMode.Callback mWrappedCallback;
  
  public SupportActionModeWrapper$CallbackWrapper(Context paramContext, android.view.ActionMode.Callback paramCallback)
  {
    this.mContext = paramContext;
    this.mWrappedCallback = paramCallback;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mActionModes = ((ArrayList)localObject);
    localObject = new android/support/v4/h/m;
    ((m)localObject).<init>();
    this.mMenus = ((m)localObject);
  }
  
  private Menu getMenuWrapper(Menu paramMenu)
  {
    Object localObject1 = (Menu)this.mMenus.get(paramMenu);
    if (localObject1 == null)
    {
      Object localObject2 = this.mContext;
      localObject1 = paramMenu;
      localObject1 = (a)paramMenu;
      localObject1 = MenuWrapperFactory.wrapSupportMenu((Context)localObject2, (a)localObject1);
      localObject2 = this.mMenus;
      ((m)localObject2).put(paramMenu, localObject1);
    }
    return (Menu)localObject1;
  }
  
  public android.view.ActionMode getActionModeWrapper(ActionMode paramActionMode)
  {
    int i = 0;
    SupportActionModeWrapper localSupportActionModeWrapper = null;
    int j = this.mActionModes.size();
    int k = 0;
    Object localObject = null;
    if (k < j)
    {
      localSupportActionModeWrapper = (SupportActionModeWrapper)this.mActionModes.get(k);
      if (localSupportActionModeWrapper != null)
      {
        ActionMode localActionMode = localSupportActionModeWrapper.mWrappedObject;
        if (localActionMode != paramActionMode) {}
      }
    }
    for (;;)
    {
      return localSupportActionModeWrapper;
      i = k + 1;
      k = i;
      break;
      localSupportActionModeWrapper = new android/support/v7/view/SupportActionModeWrapper;
      localObject = this.mContext;
      localSupportActionModeWrapper.<init>((Context)localObject, paramActionMode);
      localObject = this.mActionModes;
      ((ArrayList)localObject).add(localSupportActionModeWrapper);
    }
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    android.view.ActionMode.Callback localCallback = this.mWrappedCallback;
    android.view.ActionMode localActionMode = getActionModeWrapper(paramActionMode);
    Object localObject = this.mContext;
    paramMenuItem = (b)paramMenuItem;
    localObject = MenuWrapperFactory.wrapSupportMenuItem((Context)localObject, paramMenuItem);
    return localCallback.onActionItemClicked(localActionMode, (MenuItem)localObject);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    android.view.ActionMode.Callback localCallback = this.mWrappedCallback;
    android.view.ActionMode localActionMode = getActionModeWrapper(paramActionMode);
    Menu localMenu = getMenuWrapper(paramMenu);
    return localCallback.onCreateActionMode(localActionMode, localMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    android.view.ActionMode.Callback localCallback = this.mWrappedCallback;
    android.view.ActionMode localActionMode = getActionModeWrapper(paramActionMode);
    localCallback.onDestroyActionMode(localActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    android.view.ActionMode.Callback localCallback = this.mWrappedCallback;
    android.view.ActionMode localActionMode = getActionModeWrapper(paramActionMode);
    Menu localMenu = getMenuWrapper(paramMenu);
    return localCallback.onPrepareActionMode(localActionMode, localMenu);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\SupportActionModeWrapper$CallbackWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */