package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.DecorToolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class WindowDecorActionBar$ActionModeImpl
  extends ActionMode
  implements MenuBuilder.Callback
{
  private final Context mActionModeContext;
  private ActionMode.Callback mCallback;
  private WeakReference mCustomView;
  private final MenuBuilder mMenu;
  
  public WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar paramWindowDecorActionBar, Context paramContext, ActionMode.Callback paramCallback)
  {
    this.mActionModeContext = paramContext;
    this.mCallback = paramCallback;
    MenuBuilder localMenuBuilder = new android/support/v7/view/menu/MenuBuilder;
    localMenuBuilder.<init>(paramContext);
    localMenuBuilder = localMenuBuilder.setDefaultShowAsAction(1);
    this.mMenu = localMenuBuilder;
    this.mMenu.setCallback(this);
  }
  
  public boolean dispatchOnCreate()
  {
    Object localObject1 = this.mMenu;
    ((MenuBuilder)localObject1).stopDispatchingItemsChanged();
    try
    {
      localObject1 = this.mCallback;
      MenuBuilder localMenuBuilder = this.mMenu;
      boolean bool = ((ActionMode.Callback)localObject1).onCreateActionMode(this, localMenuBuilder);
      return bool;
    }
    finally
    {
      this.mMenu.startDispatchingItemsChanged();
    }
  }
  
  public void finish()
  {
    Object localObject1 = this.this$0.mActionMode;
    if (localObject1 != this) {
      return;
    }
    localObject1 = this.this$0;
    boolean bool1 = ((WindowDecorActionBar)localObject1).mHiddenByApp;
    Object localObject2 = this.this$0;
    boolean bool2 = ((WindowDecorActionBar)localObject2).mHiddenBySystem;
    bool1 = WindowDecorActionBar.checkShowingFlags(bool1, bool2, false);
    if (!bool1)
    {
      this.this$0.mDeferredDestroyActionMode = this;
      localObject1 = this.this$0;
      localObject2 = this.mCallback;
      ((WindowDecorActionBar)localObject1).mDeferredModeDestroyCallback = ((ActionMode.Callback)localObject2);
    }
    for (;;)
    {
      this.mCallback = null;
      this.this$0.animateToMode(false);
      this.this$0.mContextView.closeMode();
      this.this$0.mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
      localObject1 = this.this$0.mOverlayLayout;
      localObject2 = this.this$0;
      bool2 = ((WindowDecorActionBar)localObject2).mHideOnContentScroll;
      ((ActionBarOverlayLayout)localObject1).setHideOnContentScrollEnabled(bool2);
      localObject1 = this.this$0;
      ((WindowDecorActionBar)localObject1).mActionMode = null;
      break;
      localObject1 = this.mCallback;
      ((ActionMode.Callback)localObject1).onDestroyActionMode(this);
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
    Context localContext = this.mActionModeContext;
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  public CharSequence getSubtitle()
  {
    return this.this$0.mContextView.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.this$0.mContextView.getTitle();
  }
  
  public void invalidate()
  {
    Object localObject1 = this.this$0.mActionMode;
    if (localObject1 != this) {}
    for (;;)
    {
      return;
      localObject1 = this.mMenu;
      ((MenuBuilder)localObject1).stopDispatchingItemsChanged();
      try
      {
        localObject1 = this.mCallback;
        MenuBuilder localMenuBuilder = this.mMenu;
        ((ActionMode.Callback)localObject1).onPrepareActionMode(this, localMenuBuilder);
        localObject1 = this.mMenu;
        ((MenuBuilder)localObject1).startDispatchingItemsChanged();
      }
      finally
      {
        this.mMenu.startDispatchingItemsChanged();
      }
    }
  }
  
  public boolean isTitleOptional()
  {
    return this.this$0.mContextView.isTitleOptional();
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onCloseSubMenu(SubMenuBuilder paramSubMenuBuilder) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    ActionMode.Callback localCallback = this.mCallback;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      bool = localCallback.onActionItemClicked(this, paramMenuItem);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.mCallback;
    if (localObject == null) {}
    for (;;)
    {
      return;
      invalidate();
      localObject = this.this$0.mContextView;
      ((ActionBarContextView)localObject).showOverflowMenu();
    }
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool1 = true;
    Object localObject = this.mCallback;
    if (localObject == null) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = paramSubMenuBuilder.hasVisibleItems();
      if (bool2)
      {
        localObject = new android/support/v7/view/menu/MenuPopupHelper;
        Context localContext = this.this$0.getThemedContext();
        ((MenuPopupHelper)localObject).<init>(localContext, paramSubMenuBuilder);
        ((MenuPopupHelper)localObject).show();
      }
    }
  }
  
  public void setCustomView(View paramView)
  {
    this.this$0.mContextView.setCustomView(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.mCustomView = localWeakReference;
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.this$0.mContext.getResources().getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.this$0.mContextView.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.this$0.mContext.getResources().getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.this$0.mContextView.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.this$0.mContextView.setTitleOptional(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\WindowDecorActionBar$ActionModeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */