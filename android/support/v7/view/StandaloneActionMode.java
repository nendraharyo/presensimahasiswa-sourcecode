package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public class StandaloneActionMode
  extends ActionMode
  implements MenuBuilder.Callback
{
  private ActionMode.Callback mCallback;
  private Context mContext;
  private ActionBarContextView mContextView;
  private WeakReference mCustomView;
  private boolean mFinished;
  private boolean mFocusable;
  private MenuBuilder mMenu;
  
  public StandaloneActionMode(Context paramContext, ActionBarContextView paramActionBarContextView, ActionMode.Callback paramCallback, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mContextView = paramActionBarContextView;
    this.mCallback = paramCallback;
    MenuBuilder localMenuBuilder = new android/support/v7/view/menu/MenuBuilder;
    Context localContext = paramActionBarContextView.getContext();
    localMenuBuilder.<init>(localContext);
    localMenuBuilder = localMenuBuilder.setDefaultShowAsAction(1);
    this.mMenu = localMenuBuilder;
    this.mMenu.setCallback(this);
    this.mFocusable = paramBoolean;
  }
  
  public void finish()
  {
    boolean bool = this.mFinished;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.mFinished = bool;
      Object localObject = this.mContextView;
      int i = 32;
      ((ActionBarContextView)localObject).sendAccessibilityEvent(i);
      localObject = this.mCallback;
      ((ActionMode.Callback)localObject).onDestroyActionMode(this);
    }
  }
  
  public View getCustomView()
  {
    Object localObject = this.mCustomView;
    if (localObject != null) {}
    for (localObject = (View)this.mCustomView.get();; localObject = null) {
      return (View)localObject;
    }
  }
  
  public Menu getMenu()
  {
    return this.mMenu;
  }
  
  public MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new android/support/v7/view/SupportMenuInflater;
    Context localContext = this.mContextView.getContext();
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mContextView.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.mContextView.getTitle();
  }
  
  public void invalidate()
  {
    ActionMode.Callback localCallback = this.mCallback;
    MenuBuilder localMenuBuilder = this.mMenu;
    localCallback.onPrepareActionMode(this, localMenuBuilder);
  }
  
  public boolean isTitleOptional()
  {
    return this.mContextView.isTitleOptional();
  }
  
  public boolean isUiFocusable()
  {
    return this.mFocusable;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onCloseSubMenu(SubMenuBuilder paramSubMenuBuilder) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    return this.mCallback.onActionItemClicked(this, paramMenuItem);
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    invalidate();
    this.mContextView.showOverflowMenu();
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool1 = true;
    boolean bool2 = paramSubMenuBuilder.hasVisibleItems();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      MenuPopupHelper localMenuPopupHelper = new android/support/v7/view/menu/MenuPopupHelper;
      Context localContext = this.mContextView.getContext();
      localMenuPopupHelper.<init>(localContext, paramSubMenuBuilder);
      localMenuPopupHelper.show();
    }
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.mContextView;
    ((ActionBarContextView)localObject).setCustomView(paramView);
    if (paramView != null)
    {
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramView);
    }
    for (;;)
    {
      this.mCustomView = ((WeakReference)localObject);
      return;
      localObject = null;
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.mContext.getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mContextView.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.mContext.getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mContextView.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.mContextView.setTitleOptional(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\StandaloneActionMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */