package android.support.v7.view.menu;

import android.view.MenuItem;

class CascadingMenuPopup$3$1
  implements Runnable
{
  CascadingMenuPopup$3$1(CascadingMenuPopup.3 param3, CascadingMenuPopup.CascadingMenuInfo paramCascadingMenuInfo, MenuItem paramMenuItem, MenuBuilder paramMenuBuilder) {}
  
  public void run()
  {
    int i = 0;
    Object localObject = this.val$nextInfo;
    if (localObject != null)
    {
      localObject = this.this$1.this$0;
      boolean bool1 = true;
      ((CascadingMenuPopup)localObject).mShouldCloseImmediately = bool1;
      this.val$nextInfo.menu.close(false);
      localObject = this.this$1.this$0;
      ((CascadingMenuPopup)localObject).mShouldCloseImmediately = false;
    }
    localObject = this.val$item;
    boolean bool2 = ((MenuItem)localObject).isEnabled();
    if (bool2)
    {
      localObject = this.val$item;
      bool2 = ((MenuItem)localObject).hasSubMenu();
      if (bool2)
      {
        localObject = this.val$menu;
        MenuItem localMenuItem = this.val$item;
        i = 4;
        ((MenuBuilder)localObject).performItemAction(localMenuItem, i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup$3$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */