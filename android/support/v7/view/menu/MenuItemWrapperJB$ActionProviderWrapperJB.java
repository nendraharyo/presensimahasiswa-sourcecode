package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.b.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

class MenuItemWrapperJB$ActionProviderWrapperJB
  extends MenuItemWrapperICS.ActionProviderWrapper
  implements ActionProvider.VisibilityListener
{
  b.b mListener;
  
  public MenuItemWrapperJB$ActionProviderWrapperJB(MenuItemWrapperJB paramMenuItemWrapperJB, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramMenuItemWrapperJB, paramContext, paramActionProvider);
  }
  
  public boolean isVisible()
  {
    return this.mInner.isVisible();
  }
  
  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    b.b localb = this.mListener;
    if (localb != null)
    {
      localb = this.mListener;
      localb.onActionProviderVisibilityChanged(paramBoolean);
    }
  }
  
  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return this.mInner.onCreateActionView(paramMenuItem);
  }
  
  public boolean overridesItemVisibility()
  {
    return this.mInner.overridesItemVisibility();
  }
  
  public void refreshVisibility()
  {
    this.mInner.refreshVisibility();
  }
  
  public void setVisibilityListener(b.b paramb)
  {
    this.mListener = paramb;
    ActionProvider localActionProvider = this.mInner;
    if (paramb != null) {}
    for (;;)
    {
      localActionProvider.setVisibilityListener(this);
      return;
      this = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperJB$ActionProviderWrapperJB.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */