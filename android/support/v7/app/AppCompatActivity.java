package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.a;
import android.support.v4.app.ae;
import android.support.v4.app.ae.a;
import android.support.v4.app.i;
import android.support.v4.app.u;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public class AppCompatActivity
  extends i
  implements ae.a, ActionBarDrawerToggle.DelegateProvider, AppCompatCallback
{
  private AppCompatDelegate mDelegate;
  private Resources mResources;
  private int mThemeId = 0;
  
  private boolean performMenuItemShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 26;
    boolean bool2;
    Object localObject;
    if (i < k)
    {
      boolean bool1 = paramKeyEvent.isCtrlPressed();
      if (!bool1)
      {
        bool1 = KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState());
        if (!bool1)
        {
          int j = paramKeyEvent.getRepeatCount();
          if (j == 0)
          {
            bool2 = KeyEvent.isModifierKey(paramKeyEvent.getKeyCode());
            if (!bool2)
            {
              localObject = getWindow();
              if (localObject != null)
              {
                View localView = ((Window)localObject).getDecorView();
                if (localView != null)
                {
                  localObject = ((Window)localObject).getDecorView();
                  bool2 = ((View)localObject).dispatchKeyShortcutEvent(paramKeyEvent);
                  if (bool2) {
                    bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().addContentView(paramView, paramLayoutParams);
  }
  
  public void closeOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    Window localWindow = getWindow();
    boolean bool1 = localWindow.hasFeature(0);
    if (bool1) {
      if (localActionBar != null)
      {
        boolean bool2 = localActionBar.closeOptionsMenu();
        if (bool2) {}
      }
      else
      {
        super.closeOptionsMenu();
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    ActionBar localActionBar = getSupportActionBar();
    int j = 82;
    if ((i == j) && (localActionBar != null))
    {
      bool = localActionBar.onMenuKeyEvent(paramKeyEvent);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = super.dispatchKeyEvent(paramKeyEvent)) {
      return bool;
    }
  }
  
  public View findViewById(int paramInt)
  {
    return getDelegate().findViewById(paramInt);
  }
  
  public AppCompatDelegate getDelegate()
  {
    AppCompatDelegate localAppCompatDelegate = this.mDelegate;
    if (localAppCompatDelegate == null)
    {
      localAppCompatDelegate = AppCompatDelegate.create(this, this);
      this.mDelegate = localAppCompatDelegate;
    }
    return this.mDelegate;
  }
  
  public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    return getDelegate().getDrawerToggleDelegate();
  }
  
  public MenuInflater getMenuInflater()
  {
    return getDelegate().getMenuInflater();
  }
  
  public Resources getResources()
  {
    Object localObject = this.mResources;
    if (localObject == null)
    {
      boolean bool = VectorEnabledTintResources.shouldBeUsed();
      if (bool)
      {
        localObject = new android/support/v7/widget/VectorEnabledTintResources;
        Resources localResources = super.getResources();
        ((VectorEnabledTintResources)localObject).<init>(this, localResources);
        this.mResources = ((Resources)localObject);
      }
    }
    localObject = this.mResources;
    if (localObject == null) {}
    for (localObject = super.getResources();; localObject = this.mResources) {
      return (Resources)localObject;
    }
  }
  
  public ActionBar getSupportActionBar()
  {
    return getDelegate().getSupportActionBar();
  }
  
  public Intent getSupportParentActivityIntent()
  {
    return u.a(this);
  }
  
  public void invalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    getDelegate().onConfigurationChanged(paramConfiguration);
    Object localObject = this.mResources;
    if (localObject != null)
    {
      localObject = super.getResources().getDisplayMetrics();
      Resources localResources = this.mResources;
      localResources.updateConfiguration(paramConfiguration, (DisplayMetrics)localObject);
    }
  }
  
  public void onContentChanged()
  {
    onSupportContentChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject = getDelegate();
    ((AppCompatDelegate)localObject).installViewFactory();
    ((AppCompatDelegate)localObject).onCreate(paramBundle);
    boolean bool = ((AppCompatDelegate)localObject).applyDayNight();
    int i;
    if (bool)
    {
      i = this.mThemeId;
      if (i != 0)
      {
        i = Build.VERSION.SDK_INT;
        int j = 23;
        if (i < j) {
          break label71;
        }
        localObject = getTheme();
        j = this.mThemeId;
        onApplyThemeResource((Resources.Theme)localObject, j, false);
      }
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label71:
      i = this.mThemeId;
      setTheme(i);
    }
  }
  
  public void onCreateSupportNavigateUpTaskStack(ae paramae)
  {
    paramae.a(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    getDelegate().onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = performMenuItemShortcut(paramInt, paramKeyEvent);
    if (bool) {}
    for (bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool1 = super.onMenuItemSelected(paramInt, paramMenuItem);
    if (bool1) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      ActionBar localActionBar = getSupportActionBar();
      int j = paramMenuItem.getItemId();
      int k = 16908332;
      if ((j == k) && (localActionBar != null))
      {
        int i = localActionBar.getDisplayOptions() & 0x4;
        if (i != 0)
        {
          bool2 = onSupportNavigateUp();
          continue;
        }
      }
      boolean bool2 = false;
      localActionBar = null;
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    getDelegate().onPostCreate(paramBundle);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    getDelegate().onPostResume();
  }
  
  public void onPrepareSupportNavigateUpTaskStack(ae paramae) {}
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    getDelegate().onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    getDelegate().onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
    getDelegate().onStop();
  }
  
  public void onSupportActionModeFinished(ActionMode paramActionMode) {}
  
  public void onSupportActionModeStarted(ActionMode paramActionMode) {}
  
  public void onSupportContentChanged() {}
  
  public boolean onSupportNavigateUp()
  {
    Object localObject1 = getSupportParentActivityIntent();
    if (localObject1 != null)
    {
      boolean bool1 = supportShouldUpRecreateTask((Intent)localObject1);
      if (bool1)
      {
        localObject1 = ae.a(this);
        onCreateSupportNavigateUpTaskStack((ae)localObject1);
        onPrepareSupportNavigateUpTaskStack((ae)localObject1);
        ((ae)localObject1).a();
      }
    }
    for (;;)
    {
      try
      {
        a.a(this);
        bool2 = true;
        return bool2;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        finish();
        continue;
      }
      supportNavigateUpTo(localIllegalStateException);
      continue;
      boolean bool2 = false;
      Object localObject2 = null;
    }
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    getDelegate().setTitle(paramCharSequence);
  }
  
  public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public void openOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    Window localWindow = getWindow();
    boolean bool1 = localWindow.hasFeature(0);
    if (bool1) {
      if (localActionBar != null)
      {
        boolean bool2 = localActionBar.openOptionsMenu();
        if (bool2) {}
      }
      else
      {
        super.openOptionsMenu();
      }
    }
  }
  
  public void setContentView(int paramInt)
  {
    getDelegate().setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    getDelegate().setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().setContentView(paramView, paramLayoutParams);
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    getDelegate().setSupportActionBar(paramToolbar);
  }
  
  public void setSupportProgress(int paramInt) {}
  
  public void setSupportProgressBarIndeterminate(boolean paramBoolean) {}
  
  public void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean) {}
  
  public void setSupportProgressBarVisibility(boolean paramBoolean) {}
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.mThemeId = paramInt;
  }
  
  public ActionMode startSupportActionMode(ActionMode.Callback paramCallback)
  {
    return getDelegate().startSupportActionMode(paramCallback);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void supportNavigateUpTo(Intent paramIntent)
  {
    u.b(this, paramIntent);
  }
  
  public boolean supportRequestWindowFeature(int paramInt)
  {
    return getDelegate().requestWindowFeature(paramInt);
  }
  
  public boolean supportShouldUpRecreateTask(Intent paramIntent)
  {
    return u.a(this, paramIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */