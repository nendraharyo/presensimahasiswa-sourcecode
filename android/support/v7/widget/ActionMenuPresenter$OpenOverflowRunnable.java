package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.View;

class ActionMenuPresenter$OpenOverflowRunnable
  implements Runnable
{
  private ActionMenuPresenter.OverflowPopup mPopup;
  
  public ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter paramActionMenuPresenter, ActionMenuPresenter.OverflowPopup paramOverflowPopup)
  {
    this.mPopup = paramOverflowPopup;
  }
  
  public void run()
  {
    Object localObject = ActionMenuPresenter.access$300(this.this$0);
    if (localObject != null)
    {
      localObject = ActionMenuPresenter.access$400(this.this$0);
      ((MenuBuilder)localObject).changeMenuMode();
    }
    localObject = (View)ActionMenuPresenter.access$500(this.this$0);
    if (localObject != null)
    {
      localObject = ((View)localObject).getWindowToken();
      if (localObject != null)
      {
        localObject = this.mPopup;
        boolean bool = ((ActionMenuPresenter.OverflowPopup)localObject).tryShow();
        if (bool)
        {
          localObject = this.this$0;
          ActionMenuPresenter.OverflowPopup localOverflowPopup = this.mPopup;
          ((ActionMenuPresenter)localObject).mOverflowPopup = localOverflowPopup;
        }
      }
    }
    this.this$0.mPostedOpenRunnable = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$OpenOverflowRunnable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */