package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

class ActionBarDrawerToggle$JellybeanMr2Delegate
  implements ActionBarDrawerToggle.Delegate
{
  final Activity mActivity;
  
  ActionBarDrawerToggle$JellybeanMr2Delegate(Activity paramActivity)
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
    Object localObject = getActionBarThemedContext();
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843531;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, 16843470, 0);
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(0);
    ((TypedArray)localObject).recycle();
    return localDrawable;
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
    ActionBar localActionBar = this.mActivity.getActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.mActivity.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle$JellybeanMr2Delegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */