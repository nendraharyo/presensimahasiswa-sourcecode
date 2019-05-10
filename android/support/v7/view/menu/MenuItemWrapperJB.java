package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.view.ActionProvider;

class MenuItemWrapperJB
  extends MenuItemWrapperICS
{
  MenuItemWrapperJB(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider paramActionProvider)
  {
    MenuItemWrapperJB.ActionProviderWrapperJB localActionProviderWrapperJB = new android/support/v7/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
    Context localContext = this.mContext;
    localActionProviderWrapperJB.<init>(this, localContext, paramActionProvider);
    return localActionProviderWrapperJB;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperJB.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */