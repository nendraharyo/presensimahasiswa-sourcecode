package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

class ActionBarDrawerToggle$IcsDelegate
  implements ActionBarDrawerToggle.Delegate
{
  final Activity mActivity;
  ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;
  
  ActionBarDrawerToggle$IcsDelegate(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  public Context getActionBarThemedContext()
  {
    Object localObject = this.mActivity.getActionBar();
    if (localObject != null) {}
    for (localObject = ((ActionBar)localObject).getThemedContext();; localObject = this.mActivity) {
      return (Context)localObject;
    }
  }
  
  public Drawable getThemeUpIndicator()
  {
    return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(this.mActivity);
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = this.mActivity.getActionBar();
    int i;
    if (localActionBar != null)
    {
      i = localActionBar.getDisplayOptions() & 0x4;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localActionBar = null;
    }
  }
  
  public void setActionBarDescription(int paramInt)
  {
    ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = this.mSetIndicatorInfo;
    Activity localActivity = this.mActivity;
    localSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(localSetIndicatorInfo, localActivity, paramInt);
    this.mSetIndicatorInfo = localSetIndicatorInfo;
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.mActivity.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setDisplayShowHomeEnabled(true);
      ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = this.mSetIndicatorInfo;
      Activity localActivity = this.mActivity;
      localSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(localSetIndicatorInfo, localActivity, paramDrawable, paramInt);
      this.mSetIndicatorInfo = localSetIndicatorInfo;
      localSetIndicatorInfo = null;
      localActionBar.setDisplayShowHomeEnabled(false);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle$IcsDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */