package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.View;

class ActionMenuPresenter$ActionButtonSubmenu
  extends MenuPopupHelper
{
  public ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, SubMenuBuilder paramSubMenuBuilder, View paramView)
  {
    super(paramContext, paramSubMenuBuilder, paramView, false, i);
    localObject = (MenuItemImpl)paramSubMenuBuilder.getItem();
    boolean bool = ((MenuItemImpl)localObject).isActionButton();
    if (!bool)
    {
      localObject = paramActionMenuPresenter.mOverflowButton;
      if (localObject != null) {
        break label84;
      }
    }
    label84:
    for (localObject = (View)ActionMenuPresenter.access$200(paramActionMenuPresenter);; localObject = paramActionMenuPresenter.mOverflowButton)
    {
      setAnchorView((View)localObject);
      localObject = paramActionMenuPresenter.mPopupPresenterCallback;
      setPresenterCallback((MenuPresenter.Callback)localObject);
      return;
    }
  }
  
  protected void onDismiss()
  {
    this.this$0.mActionButtonPopup = null;
    this.this$0.mOpenSubMenuId = 0;
    super.onDismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$ActionButtonSubmenu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */