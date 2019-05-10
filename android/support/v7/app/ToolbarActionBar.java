package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

class ToolbarActionBar
  extends ActionBar
{
  DecorToolbar mDecorToolbar;
  private boolean mLastMenuVisibility;
  private boolean mMenuCallbackSet;
  private final Toolbar.OnMenuItemClickListener mMenuClicker;
  private final Runnable mMenuInvalidator;
  private ArrayList mMenuVisibilityListeners;
  boolean mToolbarMenuPrepared;
  Window.Callback mWindowCallback;
  
  ToolbarActionBar(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mMenuVisibilityListeners = ((ArrayList)localObject);
    localObject = new android/support/v7/app/ToolbarActionBar$1;
    ((ToolbarActionBar.1)localObject).<init>(this);
    this.mMenuInvalidator = ((Runnable)localObject);
    localObject = new android/support/v7/app/ToolbarActionBar$2;
    ((ToolbarActionBar.2)localObject).<init>(this);
    this.mMenuClicker = ((Toolbar.OnMenuItemClickListener)localObject);
    localObject = new android/support/v7/widget/ToolbarWidgetWrapper;
    ((ToolbarWidgetWrapper)localObject).<init>(paramToolbar, false);
    this.mDecorToolbar = ((DecorToolbar)localObject);
    localObject = new android/support/v7/app/ToolbarActionBar$ToolbarCallbackWrapper;
    ((ToolbarActionBar.ToolbarCallbackWrapper)localObject).<init>(this, paramCallback);
    this.mWindowCallback = ((Window.Callback)localObject);
    localObject = this.mDecorToolbar;
    Window.Callback localCallback = this.mWindowCallback;
    ((DecorToolbar)localObject).setWindowCallback(localCallback);
    localObject = this.mMenuClicker;
    paramToolbar.setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener)localObject);
    this.mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  private Menu getMenu()
  {
    boolean bool = this.mMenuCallbackSet;
    if (!bool)
    {
      DecorToolbar localDecorToolbar = this.mDecorToolbar;
      ToolbarActionBar.ActionMenuPresenterCallback localActionMenuPresenterCallback = new android/support/v7/app/ToolbarActionBar$ActionMenuPresenterCallback;
      localActionMenuPresenterCallback.<init>(this);
      ToolbarActionBar.MenuBuilderCallback localMenuBuilderCallback = new android/support/v7/app/ToolbarActionBar$MenuBuilderCallback;
      localMenuBuilderCallback.<init>(this);
      localDecorToolbar.setMenuCallbacks(localActionMenuPresenterCallback, localMenuBuilderCallback);
      bool = true;
      this.mMenuCallbackSet = bool;
    }
    return this.mDecorToolbar.getMenu();
  }
  
  public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    this.mMenuVisibilityListeners.add(paramOnMenuVisibilityListener);
  }
  
  public void addTab(ActionBar.Tab paramTab)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public boolean closeOptionsMenu()
  {
    return this.mDecorToolbar.hideOverflowMenu();
  }
  
  public boolean collapseActionView()
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    boolean bool = localDecorToolbar.hasExpandedActionView();
    if (bool)
    {
      localDecorToolbar = this.mDecorToolbar;
      localDecorToolbar.collapseActionView();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDecorToolbar = null;
    }
  }
  
  public void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    boolean bool = this.mLastMenuVisibility;
    if (paramBoolean == bool) {}
    for (;;)
    {
      return;
      this.mLastMenuVisibility = paramBoolean;
      int j = this.mMenuVisibilityListeners.size();
      bool = false;
      ActionBar.OnMenuVisibilityListener localOnMenuVisibilityListener = null;
      int i;
      for (int k = 0; k < j; k = i)
      {
        localOnMenuVisibilityListener = (ActionBar.OnMenuVisibilityListener)this.mMenuVisibilityListeners.get(k);
        localOnMenuVisibilityListener.onMenuVisibilityChanged(paramBoolean);
        i = k + 1;
      }
    }
  }
  
  public View getCustomView()
  {
    return this.mDecorToolbar.getCustomView();
  }
  
  public int getDisplayOptions()
  {
    return this.mDecorToolbar.getDisplayOptions();
  }
  
  public float getElevation()
  {
    return r.l(this.mDecorToolbar.getViewGroup());
  }
  
  public int getHeight()
  {
    return this.mDecorToolbar.getHeight();
  }
  
  public int getNavigationItemCount()
  {
    return 0;
  }
  
  public int getNavigationMode()
  {
    return 0;
  }
  
  public int getSelectedNavigationIndex()
  {
    return -1;
  }
  
  public ActionBar.Tab getSelectedTab()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mDecorToolbar.getSubtitle();
  }
  
  public ActionBar.Tab getTabAt(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public int getTabCount()
  {
    return 0;
  }
  
  public Context getThemedContext()
  {
    return this.mDecorToolbar.getContext();
  }
  
  public CharSequence getTitle()
  {
    return this.mDecorToolbar.getTitle();
  }
  
  public Window.Callback getWrappedWindowCallback()
  {
    return this.mWindowCallback;
  }
  
  public void hide()
  {
    this.mDecorToolbar.setVisibility(8);
  }
  
  public boolean invalidateOptionsMenu()
  {
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    Runnable localRunnable = this.mMenuInvalidator;
    localViewGroup.removeCallbacks(localRunnable);
    localViewGroup = this.mDecorToolbar.getViewGroup();
    localRunnable = this.mMenuInvalidator;
    r.a(localViewGroup, localRunnable);
    return true;
  }
  
  public boolean isShowing()
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    int i = localDecorToolbar.getVisibility();
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localDecorToolbar = null;
    }
  }
  
  public boolean isTitleTruncated()
  {
    return super.isTitleTruncated();
  }
  
  public ActionBar.Tab newTab()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  void onDestroy()
  {
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    Runnable localRunnable = this.mMenuInvalidator;
    localViewGroup.removeCallbacks(localRunnable);
  }
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool = false;
    Menu localMenu = getMenu();
    int j;
    KeyCharacterMap localKeyCharacterMap;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label73;
      }
      j = paramKeyEvent.getDeviceId();
      localKeyCharacterMap = KeyCharacterMap.load(j);
      j = localKeyCharacterMap.getKeyboardType();
      if (j == i) {
        break label79;
      }
      j = i;
    }
    for (;;)
    {
      localMenu.setQwertyMode(j);
      bool = localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return bool;
      label73:
      int k = -1;
      break;
      label79:
      k = 0;
      localKeyCharacterMap = null;
    }
  }
  
  public boolean onMenuKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = paramKeyEvent.getAction();
    if (j == i) {
      openOptionsMenu();
    }
    return i;
  }
  
  public boolean openOptionsMenu()
  {
    return this.mDecorToolbar.showOverflowMenu();
  }
  
  void populateOptionsMenu()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Menu localMenu = getMenu();
    boolean bool2 = localMenu instanceof MenuBuilder;
    if (bool2)
    {
      localObject1 = localMenu;
      localObject1 = (MenuBuilder)localMenu;
    }
    for (localObject3 = localObject1;; localObject3 = null)
    {
      if (localObject3 != null) {
        ((MenuBuilder)localObject3).stopDispatchingItemsChanged();
      }
      try
      {
        ((Menu)localMenu).clear();
        localObject1 = this.mWindowCallback;
        bool1 = ((Window.Callback)localObject1).onCreatePanelMenu(0, (Menu)localMenu);
        if (bool1)
        {
          localObject1 = this.mWindowCallback;
          bool1 = ((Window.Callback)localObject1).onPreparePanel(0, null, (Menu)localMenu);
          if (bool1) {}
        }
        else
        {
          ((Menu)localMenu).clear();
        }
        return;
      }
      finally
      {
        if (localObject3 == null) {
          break;
        }
        ((MenuBuilder)localObject3).startDispatchingItemsChanged();
      }
      bool2 = false;
    }
  }
  
  public void removeAllTabs()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    this.mMenuVisibilityListeners.remove(paramOnMenuVisibilityListener);
  }
  
  public void removeTab(ActionBar.Tab paramTab)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void removeTabAt(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public boolean requestFocus()
  {
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    boolean bool2;
    if (localViewGroup != null)
    {
      boolean bool1 = localViewGroup.hasFocus();
      if (!bool1)
      {
        localViewGroup.requestFocus();
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localViewGroup = null;
    }
  }
  
  public void selectTab(ActionBar.Tab paramTab)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Tabs are not supported in toolbar action bars");
    throw localUnsupportedOperationException;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mDecorToolbar.setBackgroundDrawable(paramDrawable);
  }
  
  public void setCustomView(int paramInt)
  {
    Object localObject = LayoutInflater.from(this.mDecorToolbar.getContext());
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    localObject = ((LayoutInflater)localObject).inflate(paramInt, localViewGroup, false);
    setCustomView((View)localObject);
  }
  
  public void setCustomView(View paramView)
  {
    int i = -2;
    ActionBar.LayoutParams localLayoutParams = new android/support/v7/app/ActionBar$LayoutParams;
    localLayoutParams.<init>(i, i);
    setCustomView(paramView, localLayoutParams);
  }
  
  public void setCustomView(View paramView, ActionBar.LayoutParams paramLayoutParams)
  {
    if (paramView != null) {
      paramView.setLayoutParams(paramLayoutParams);
    }
    this.mDecorToolbar.setCustomView(paramView);
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean) {}
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    int i = 4;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayOptions(int paramInt)
  {
    setDisplayOptions(paramInt, -1);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.mDecorToolbar.getDisplayOptions();
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    int j = paramInt1 & paramInt2;
    int k = paramInt2 ^ 0xFFFFFFFF;
    i = i & k | j;
    localDecorToolbar.setDisplayOptions(i);
  }
  
  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    int i = 16;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    int i = 2;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    int i = 8;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setElevation(float paramFloat)
  {
    r.a(this.mDecorToolbar.getViewGroup(), paramFloat);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    this.mDecorToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setNavigationContentDescription(paramCharSequence);
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    this.mDecorToolbar.setNavigationIcon(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    this.mDecorToolbar.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public void setIcon(int paramInt)
  {
    this.mDecorToolbar.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.mDecorToolbar.setIcon(paramDrawable);
  }
  
  public void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, ActionBar.OnNavigationListener paramOnNavigationListener)
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    NavItemSelectedListener localNavItemSelectedListener = new android/support/v7/app/NavItemSelectedListener;
    localNavItemSelectedListener.<init>(paramOnNavigationListener);
    localDecorToolbar.setDropdownParams(paramSpinnerAdapter, localNavItemSelectedListener);
  }
  
  public void setLogo(int paramInt)
  {
    this.mDecorToolbar.setLogo(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.mDecorToolbar.setLogo(paramDrawable);
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = 2;
    if (paramInt == i)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Tabs not supported in this configuration");
      throw localIllegalArgumentException;
    }
    this.mDecorToolbar.setNavigationMode(paramInt);
  }
  
  public void setSelectedNavigationItem(int paramInt)
  {
    Object localObject = this.mDecorToolbar;
    int i = ((DecorToolbar)localObject).getNavigationMode();
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("setSelectedNavigationIndex not valid for current navigation mode");
      throw ((Throwable)localObject);
    }
    this.mDecorToolbar.setDropdownSelectedPosition(paramInt);
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean) {}
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setSubtitle(int paramInt)
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = this.mDecorToolbar.getContext().getText(paramInt);; localCharSequence = null)
    {
      localDecorToolbar.setSubtitle(localCharSequence);
      return;
    }
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = this.mDecorToolbar.getContext().getText(paramInt);; localCharSequence = null)
    {
      localDecorToolbar.setTitle(localCharSequence);
      return;
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public void show()
  {
    this.mDecorToolbar.setVisibility(0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ToolbarActionBar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */