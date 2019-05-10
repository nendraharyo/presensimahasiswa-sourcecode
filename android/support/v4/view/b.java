package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b
{
  private static final String TAG = "ActionProvider(support)";
  private final Context mContext;
  private b.a mSubUiVisibilityListener;
  private b.b mVisibilityListener;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isVisible()
  {
    return true;
  }
  
  public abstract View onCreateActionView();
  
  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return false;
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu) {}
  
  public boolean overridesItemVisibility()
  {
    return false;
  }
  
  public void refreshVisibility()
  {
    b.b localb = this.mVisibilityListener;
    if (localb != null)
    {
      boolean bool1 = overridesItemVisibility();
      if (bool1)
      {
        localb = this.mVisibilityListener;
        boolean bool2 = isVisible();
        localb.onActionProviderVisibilityChanged(bool2);
      }
    }
  }
  
  public void reset()
  {
    this.mVisibilityListener = null;
    this.mSubUiVisibilityListener = null;
  }
  
  public void setSubUiVisibilityListener(b.a parama)
  {
    this.mSubUiVisibilityListener = parama;
  }
  
  public void setVisibilityListener(b.b paramb)
  {
    Object localObject1 = this.mVisibilityListener;
    if ((localObject1 != null) && (paramb != null))
    {
      localObject1 = "ActionProvider(support)";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      String str = getClass().getSimpleName();
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = " instance while it is still in use somewhere else?";
      localObject2 = str;
      Log.w((String)localObject1, (String)localObject2);
    }
    this.mVisibilityListener = paramb;
  }
  
  public void subUiVisibilityChanged(boolean paramBoolean)
  {
    b.a locala = this.mSubUiVisibilityListener;
    if (locala != null)
    {
      locala = this.mSubUiVisibilityListener;
      locala.onSubUiVisibilityChanged(paramBoolean);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */