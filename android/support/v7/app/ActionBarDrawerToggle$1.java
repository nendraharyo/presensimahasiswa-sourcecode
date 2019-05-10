package android.support.v7.app;

import android.view.View;
import android.view.View.OnClickListener;

class ActionBarDrawerToggle$1
  implements View.OnClickListener
{
  ActionBarDrawerToggle$1(ActionBarDrawerToggle paramActionBarDrawerToggle) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.this$0;
    boolean bool = ((ActionBarDrawerToggle)localObject).mDrawerIndicatorEnabled;
    if (bool)
    {
      localObject = this.this$0;
      ((ActionBarDrawerToggle)localObject).toggle();
    }
    for (;;)
    {
      return;
      localObject = this.this$0.mToolbarNavigationClickListener;
      if (localObject != null)
      {
        localObject = this.this$0.mToolbarNavigationClickListener;
        ((View.OnClickListener)localObject).onClick(paramView);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */