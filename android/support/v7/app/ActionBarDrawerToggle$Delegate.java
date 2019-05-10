package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;

public abstract interface ActionBarDrawerToggle$Delegate
{
  public abstract Context getActionBarThemedContext();
  
  public abstract Drawable getThemeUpIndicator();
  
  public abstract boolean isNavigationVisible();
  
  public abstract void setActionBarDescription(int paramInt);
  
  public abstract void setActionBarUpIndicator(Drawable paramDrawable, int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle$Delegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */