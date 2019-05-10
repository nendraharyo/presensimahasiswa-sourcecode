package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.view.View;

class ActionMenuPresenter$OverflowPopup
  extends MenuPopupHelper
{
  public ActionMenuPresenter$OverflowPopup(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramMenuBuilder, paramView, paramBoolean, i);
    setGravity(8388613);
    localObject = paramActionMenuPresenter.mPopupPresenterCallback;
    setPresenterCallback((MenuPresenter.Callback)localObject);
  }
  
  protected void onDismiss()
  {
    MenuBuilder localMenuBuilder = ActionMenuPresenter.access$000(this.this$0);
    if (localMenuBuilder != null)
    {
      localMenuBuilder = ActionMenuPresenter.access$100(this.this$0);
      localMenuBuilder.close();
    }
    this.this$0.mOverflowPopup = null;
    super.onDismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$OverflowPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */