package android.support.design.internal;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.ViewGroup;

public class BottomNavigationPresenter
  implements MenuPresenter
{
  private MenuBuilder a;
  private c b;
  private boolean c = false;
  private int d;
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(c paramc)
  {
    this.b = paramc;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    return false;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public int getId()
  {
    return this.d;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    return this.b;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    c localc = this.b;
    MenuBuilder localMenuBuilder = this.a;
    localc.initialize(localMenuBuilder);
    this.a = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof BottomNavigationPresenter.SavedState;
    if (bool)
    {
      c localc = this.b;
      paramParcelable = (BottomNavigationPresenter.SavedState)paramParcelable;
      int i = paramParcelable.a;
      localc.a(i);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    BottomNavigationPresenter.SavedState localSavedState = new android/support/design/internal/BottomNavigationPresenter$SavedState;
    localSavedState.<init>();
    int i = this.b.getSelectedItemId();
    localSavedState.a = i;
    return localSavedState;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    return false;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback) {}
  
  public void updateMenuView(boolean paramBoolean)
  {
    boolean bool = this.c;
    if (bool) {}
    for (;;)
    {
      return;
      c localc;
      if (paramBoolean)
      {
        localc = this.b;
        localc.a();
      }
      else
      {
        localc = this.b;
        localc.b();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\BottomNavigationPresenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */