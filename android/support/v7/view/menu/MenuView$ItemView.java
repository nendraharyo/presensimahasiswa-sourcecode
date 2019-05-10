package android.support.v7.view.menu;

import android.graphics.drawable.Drawable;

public abstract interface MenuView$ItemView
{
  public abstract MenuItemImpl getItemData();
  
  public abstract void initialize(MenuItemImpl paramMenuItemImpl, int paramInt);
  
  public abstract boolean prefersCondensedTitle();
  
  public abstract void setCheckable(boolean paramBoolean);
  
  public abstract void setChecked(boolean paramBoolean);
  
  public abstract void setEnabled(boolean paramBoolean);
  
  public abstract void setIcon(Drawable paramDrawable);
  
  public abstract void setShortcut(boolean paramBoolean, char paramChar);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public abstract boolean showsIcon();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuView$ItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */