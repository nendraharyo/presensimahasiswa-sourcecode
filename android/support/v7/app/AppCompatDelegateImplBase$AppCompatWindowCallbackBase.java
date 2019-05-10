package android.support.v7.app;

import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.MenuBuilder;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class AppCompatDelegateImplBase$AppCompatWindowCallbackBase
  extends WindowCallbackWrapper
{
  AppCompatDelegateImplBase$AppCompatWindowCallbackBase(AppCompatDelegateImplBase paramAppCompatDelegateImplBase, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppCompatDelegateImplBase localAppCompatDelegateImplBase = this.this$0;
    boolean bool = localAppCompatDelegateImplBase.dispatchKeyEvent(paramKeyEvent);
    if (!bool)
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAppCompatDelegateImplBase = null;
    }
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyShortcutEvent(paramKeyEvent);
    AppCompatDelegateImplBase localAppCompatDelegateImplBase;
    if (!bool)
    {
      localAppCompatDelegateImplBase = this.this$0;
      int i = paramKeyEvent.getKeyCode();
      bool = localAppCompatDelegateImplBase.onKeyShortcut(i, paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAppCompatDelegateImplBase = null;
    }
  }
  
  public void onContentChanged() {}
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      bool = paramMenu instanceof MenuBuilder;
      if (bool) {}
    }
    for (boolean bool = false;; bool = super.onCreatePanelMenu(paramInt, (Menu)paramMenu)) {
      return bool;
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    super.onMenuOpened(paramInt, paramMenu);
    this.this$0.onMenuOpened(paramInt, paramMenu);
    return true;
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
    this.this$0.onPanelClosed(paramInt, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = paramMenu instanceof MenuBuilder;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = paramMenu;
      localObject1 = (MenuBuilder)paramMenu;
      localObject2 = localObject1;
      if ((paramInt != 0) || (localObject2 != null)) {
        break label54;
      }
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
      localObject2 = null;
      break;
      label54:
      if (localObject2 != null)
      {
        bool = true;
        ((MenuBuilder)localObject2).setOverrideVisibleItems(bool);
      }
      bool = super.onPreparePanel(paramInt, paramView, (Menu)paramMenu);
      if (localObject2 != null) {
        ((MenuBuilder)localObject2).setOverrideVisibleItems(false);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplBase$AppCompatWindowCallbackBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */