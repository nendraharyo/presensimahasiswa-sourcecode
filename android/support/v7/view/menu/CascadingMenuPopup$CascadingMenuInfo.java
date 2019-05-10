package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.widget.ListView;

class CascadingMenuPopup$CascadingMenuInfo
{
  public final MenuBuilder menu;
  public final int position;
  public final MenuPopupWindow window;
  
  public CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow paramMenuPopupWindow, MenuBuilder paramMenuBuilder, int paramInt)
  {
    this.window = paramMenuPopupWindow;
    this.menu = paramMenuBuilder;
    this.position = paramInt;
  }
  
  public ListView getListView()
  {
    return this.window.getListView();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup$CascadingMenuInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */