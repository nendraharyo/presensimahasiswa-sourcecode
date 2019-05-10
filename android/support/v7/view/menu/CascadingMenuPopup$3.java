package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.MenuItemHoverListener;
import android.view.MenuItem;
import java.util.List;

class CascadingMenuPopup$3
  implements MenuItemHoverListener
{
  CascadingMenuPopup$3(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onItemHoverEnter(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    Object localObject1 = null;
    int i = -1;
    this.this$0.mSubMenuHoverHandler.removeCallbacksAndMessages(null);
    int j = 0;
    List localList = null;
    Object localObject2 = this.this$0.mShowingMenus;
    int k = ((List)localObject2).size();
    if (j < k)
    {
      localObject2 = ((CascadingMenuPopup.CascadingMenuInfo)this.this$0.mShowingMenus.get(j)).menu;
      if (paramMenuBuilder != localObject2) {}
    }
    for (int m = j;; m = i)
    {
      if (m == i)
      {
        return;
        j += 1;
        break;
      }
      m += 1;
      localList = this.this$0.mShowingMenus;
      j = localList.size();
      if (m < j) {
        localObject1 = this.this$0.mShowingMenus;
      }
      for (localObject2 = (CascadingMenuPopup.CascadingMenuInfo)((List)localObject1).get(m);; localObject2 = null)
      {
        localObject1 = new android/support/v7/view/menu/CascadingMenuPopup$3$1;
        ((CascadingMenuPopup.3.1)localObject1).<init>(this, (CascadingMenuPopup.CascadingMenuInfo)localObject2, paramMenuItem, paramMenuBuilder);
        long l1 = SystemClock.uptimeMillis();
        long l2 = 200L;
        l1 += l2;
        localObject2 = this.this$0.mSubMenuHoverHandler;
        ((Handler)localObject2).postAtTime((Runnable)localObject1, paramMenuBuilder, l1);
        break;
        m = 0;
      }
    }
  }
  
  public void onItemHoverExit(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    this.this$0.mSubMenuHoverHandler.removeCallbacksAndMessages(paramMenuBuilder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */