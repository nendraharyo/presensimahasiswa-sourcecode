package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.widget.TintTypedArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class AppCompatDelegateImplBase
  extends AppCompatDelegate
{
  static final boolean DEBUG = false;
  static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
  private static final boolean SHOULD_INSTALL_EXCEPTION_HANDLER;
  private static boolean sInstalledExceptionHandler;
  private static final int[] sWindowBackgroundStyleable;
  ActionBar mActionBar;
  final AppCompatCallback mAppCompatCallback;
  final Window.Callback mAppCompatWindowCallback;
  final Context mContext;
  private boolean mEatKeyUpEvent;
  boolean mHasActionBar;
  private boolean mIsDestroyed;
  boolean mIsFloating;
  private boolean mIsStarted;
  MenuInflater mMenuInflater;
  final Window.Callback mOriginalWindowCallback;
  boolean mOverlayActionBar;
  boolean mOverlayActionMode;
  private CharSequence mTitle;
  final Window mWindow;
  boolean mWindowNoTitle;
  
  static
  {
    int i = 1;
    int j = Build.VERSION.SDK_INT;
    int k = 21;
    if (j < k) {
      j = i;
    }
    for (;;)
    {
      SHOULD_INSTALL_EXCEPTION_HANDLER = j;
      boolean bool = SHOULD_INSTALL_EXCEPTION_HANDLER;
      if (bool)
      {
        bool = sInstalledExceptionHandler;
        if (!bool)
        {
          localObject = Thread.getDefaultUncaughtExceptionHandler();
          AppCompatDelegateImplBase.1 local1 = new android/support/v7/app/AppCompatDelegateImplBase$1;
          local1.<init>((Thread.UncaughtExceptionHandler)localObject);
          Thread.setDefaultUncaughtExceptionHandler(local1);
          sInstalledExceptionHandler = i;
        }
      }
      Object localObject = new int[i];
      localObject[0] = 16842836;
      sWindowBackgroundStyleable = (int[])localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  AppCompatDelegateImplBase(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    this.mContext = paramContext;
    this.mWindow = paramWindow;
    this.mAppCompatCallback = paramAppCompatCallback;
    Object localObject1 = this.mWindow.getCallback();
    this.mOriginalWindowCallback = ((Window.Callback)localObject1);
    localObject1 = this.mOriginalWindowCallback;
    boolean bool = localObject1 instanceof AppCompatDelegateImplBase.AppCompatWindowCallbackBase;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("AppCompat has already installed itself into the Window");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mOriginalWindowCallback;
    localObject1 = wrapWindowCallback((Window.Callback)localObject1);
    this.mAppCompatWindowCallback = ((Window.Callback)localObject1);
    localObject1 = this.mWindow;
    Object localObject2 = this.mAppCompatWindowCallback;
    ((Window)localObject1).setCallback((Window.Callback)localObject2);
    bool = false;
    localObject2 = sWindowBackgroundStyleable;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, null, (int[])localObject2);
    localObject2 = ((TintTypedArray)localObject1).getDrawableIfKnown(0);
    if (localObject2 != null)
    {
      Window localWindow = this.mWindow;
      localWindow.setBackgroundDrawable((Drawable)localObject2);
    }
    ((TintTypedArray)localObject1).recycle();
  }
  
  public boolean applyDayNight()
  {
    return false;
  }
  
  abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
  
  final Context getActionBarThemedContext()
  {
    Context localContext = null;
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localContext = localActionBar.getThemedContext();
    }
    if (localContext == null) {
      localContext = this.mContext;
    }
    return localContext;
  }
  
  public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    AppCompatDelegateImplBase.ActionBarDrawableToggleImpl localActionBarDrawableToggleImpl = new android/support/v7/app/AppCompatDelegateImplBase$ActionBarDrawableToggleImpl;
    localActionBarDrawableToggleImpl.<init>(this);
    return localActionBarDrawableToggleImpl;
  }
  
  public MenuInflater getMenuInflater()
  {
    Object localObject = this.mMenuInflater;
    SupportMenuInflater localSupportMenuInflater;
    if (localObject == null)
    {
      initWindowDecorActionBar();
      localSupportMenuInflater = new android/support/v7/view/SupportMenuInflater;
      localObject = this.mActionBar;
      if (localObject == null) {
        break label49;
      }
    }
    label49:
    for (localObject = this.mActionBar.getThemedContext();; localObject = this.mContext)
    {
      localSupportMenuInflater.<init>((Context)localObject);
      this.mMenuInflater = localSupportMenuInflater;
      return this.mMenuInflater;
    }
  }
  
  public ActionBar getSupportActionBar()
  {
    initWindowDecorActionBar();
    return this.mActionBar;
  }
  
  final CharSequence getTitle()
  {
    Object localObject = this.mOriginalWindowCallback;
    boolean bool = localObject instanceof Activity;
    if (bool) {}
    for (localObject = ((Activity)this.mOriginalWindowCallback).getTitle();; localObject = this.mTitle) {
      return (CharSequence)localObject;
    }
  }
  
  final Window.Callback getWindowCallback()
  {
    return this.mWindow.getCallback();
  }
  
  abstract void initWindowDecorActionBar();
  
  final boolean isDestroyed()
  {
    return this.mIsDestroyed;
  }
  
  public boolean isHandleNativeActionModesEnabled()
  {
    return false;
  }
  
  final boolean isStarted()
  {
    return this.mIsStarted;
  }
  
  public void onDestroy()
  {
    this.mIsDestroyed = true;
  }
  
  abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean onMenuOpened(int paramInt, Menu paramMenu);
  
  abstract void onPanelClosed(int paramInt, Menu paramMenu);
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    this.mIsStarted = true;
  }
  
  public void onStop()
  {
    this.mIsStarted = false;
  }
  
  abstract void onTitleChanged(CharSequence paramCharSequence);
  
  final ActionBar peekSupportActionBar()
  {
    return this.mActionBar;
  }
  
  public void setHandleNativeActionModesEnabled(boolean paramBoolean) {}
  
  public void setLocalNightMode(int paramInt) {}
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    onTitleChanged(paramCharSequence);
  }
  
  abstract ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback);
  
  Window.Callback wrapWindowCallback(Window.Callback paramCallback)
  {
    AppCompatDelegateImplBase.AppCompatWindowCallbackBase localAppCompatWindowCallbackBase = new android/support/v7/app/AppCompatDelegateImplBase$AppCompatWindowCallbackBase;
    localAppCompatWindowCallbackBase.<init>(this, paramCallback);
    return localAppCompatWindowCallbackBase;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */