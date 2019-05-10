package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

class ActionBarDrawerToggle$ToolbarCompatDelegate
  implements ActionBarDrawerToggle.Delegate
{
  final CharSequence mDefaultContentDescription;
  final Drawable mDefaultUpIndicator;
  final Toolbar mToolbar;
  
  ActionBarDrawerToggle$ToolbarCompatDelegate(Toolbar paramToolbar)
  {
    this.mToolbar = paramToolbar;
    Object localObject = paramToolbar.getNavigationIcon();
    this.mDefaultUpIndicator = ((Drawable)localObject);
    localObject = paramToolbar.getNavigationContentDescription();
    this.mDefaultContentDescription = ((CharSequence)localObject);
  }
  
  public Context getActionBarThemedContext()
  {
    return this.mToolbar.getContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    return this.mDefaultUpIndicator;
  }
  
  public boolean isNavigationVisible()
  {
    return true;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    Toolbar localToolbar;
    if (paramInt == 0)
    {
      localToolbar = this.mToolbar;
      CharSequence localCharSequence = this.mDefaultContentDescription;
      localToolbar.setNavigationContentDescription(localCharSequence);
    }
    for (;;)
    {
      return;
      localToolbar = this.mToolbar;
      localToolbar.setNavigationContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    this.mToolbar.setNavigationIcon(paramDrawable);
    setActionBarDescription(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle$ToolbarCompatDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */