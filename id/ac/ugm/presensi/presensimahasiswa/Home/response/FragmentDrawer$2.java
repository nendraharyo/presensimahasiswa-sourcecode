package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.Activity;
import android.support.v4.app.i;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

class FragmentDrawer$2
  extends ActionBarDrawerToggle
{
  FragmentDrawer$2(FragmentDrawer paramFragmentDrawer, Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar1, int paramInt1, int paramInt2, Toolbar paramToolbar2)
  {
    super(paramActivity, paramDrawerLayout, paramToolbar1, paramInt1, paramInt2);
  }
  
  public void onDrawerClosed(View paramView)
  {
    super.onDrawerClosed(paramView);
    this.b.getActivity().invalidateOptionsMenu();
  }
  
  public void onDrawerOpened(View paramView)
  {
    super.onDrawerOpened(paramView);
    this.b.getActivity().invalidateOptionsMenu();
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    super.onDrawerSlide(paramView, paramFloat);
    Toolbar localToolbar = this.a;
    float f1 = paramFloat / 2.0F;
    float f2 = 1.0F - f1;
    localToolbar.setAlpha(f2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\FragmentDrawer$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */