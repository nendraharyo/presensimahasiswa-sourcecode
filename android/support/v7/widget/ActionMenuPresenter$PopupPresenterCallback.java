package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.MenuItem;

class ActionMenuPresenter$PopupPresenterCallback
  implements MenuPresenter.Callback
{
  ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter paramActionMenuPresenter) {}
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    boolean bool = paramMenuBuilder instanceof SubMenuBuilder;
    if (bool)
    {
      localObject = ((MenuBuilder)paramMenuBuilder).getRootMenu();
      ((MenuBuilder)localObject).close(false);
    }
    Object localObject = this.this$0.getCallback();
    if (localObject != null) {
      ((MenuPresenter.Callback)localObject).onCloseMenu((MenuBuilder)paramMenuBuilder, paramBoolean);
    }
  }
  
  public boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    boolean bool1 = false;
    if (paramMenuBuilder == null) {
      return bool1;
    }
    ActionMenuPresenter localActionMenuPresenter = this.this$0;
    Object localObject = paramMenuBuilder;
    int i = ((SubMenuBuilder)paramMenuBuilder).getItem().getItemId();
    localActionMenuPresenter.mOpenSubMenuId = i;
    localObject = this.this$0.getCallback();
    boolean bool2;
    if (localObject != null) {
      bool2 = ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramMenuBuilder);
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$PopupPresenterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */