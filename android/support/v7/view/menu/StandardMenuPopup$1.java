package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class StandardMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  StandardMenuPopup$1(StandardMenuPopup paramStandardMenuPopup) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.this$0;
    boolean bool = ((StandardMenuPopup)localObject).isShowing();
    if (bool)
    {
      localObject = this.this$0.mPopup;
      bool = ((MenuPopupWindow)localObject).isModal();
      if (!bool)
      {
        localObject = this.this$0.mShownAnchorView;
        if (localObject != null)
        {
          bool = ((View)localObject).isShown();
          if (bool) {
            break label62;
          }
        }
        localObject = this.this$0;
        ((StandardMenuPopup)localObject).dismiss();
      }
    }
    for (;;)
    {
      return;
      label62:
      localObject = this.this$0.mPopup;
      ((MenuPopupWindow)localObject).show();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\StandardMenuPopup$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */