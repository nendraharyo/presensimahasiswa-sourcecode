package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.widget.TintTypedArray;

class AppCompatDelegateImplBase$ActionBarDrawableToggleImpl
  implements ActionBarDrawerToggle.Delegate
{
  AppCompatDelegateImplBase$ActionBarDrawableToggleImpl(AppCompatDelegateImplBase paramAppCompatDelegateImplBase) {}
  
  public Context getActionBarThemedContext()
  {
    return this.this$0.getActionBarThemedContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    Object localObject = getActionBarThemedContext();
    int[] arrayOfInt = new int[1];
    int i = R.attr.homeAsUpIndicator;
    arrayOfInt[0] = i;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, null, arrayOfInt);
    Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(0);
    ((TintTypedArray)localObject).recycle();
    return localDrawable;
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = this.this$0.getSupportActionBar();
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
    ActionBar localActionBar = this.this$0.getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.this$0.getSupportActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplBase$ActionBarDrawableToggleImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */