package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.List;

class CascadingMenuPopup$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  CascadingMenuPopup$1(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.this$0;
    boolean bool1 = ((CascadingMenuPopup)localObject).isShowing();
    boolean bool2;
    if (bool1)
    {
      localObject = this.this$0.mShowingMenus;
      int i = ((List)localObject).size();
      if (i > 0)
      {
        localObject = this.this$0.mShowingMenus;
        localIterator = null;
        localObject = ((CascadingMenuPopup.CascadingMenuInfo)((List)localObject).get(0)).window;
        bool2 = ((MenuPopupWindow)localObject).isModal();
        if (!bool2)
        {
          localObject = this.this$0.mShownAnchorView;
          if (localObject != null)
          {
            bool2 = ((View)localObject).isShown();
            if (bool2) {
              break label97;
            }
          }
          localObject = this.this$0;
          ((CascadingMenuPopup)localObject).dismiss();
        }
      }
    }
    return;
    label97:
    localObject = this.this$0.mShowingMenus;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = ((CascadingMenuPopup.CascadingMenuInfo)localIterator.next()).window;
      ((MenuPopupWindow)localObject).show();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */