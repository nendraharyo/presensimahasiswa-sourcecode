package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

class AppCompatDelegateImplV14
  extends AppCompatDelegateImplV9
{
  private static final String KEY_LOCAL_NIGHT_MODE = "appcompat:local_night_mode";
  private boolean mApplyDayNightCalled;
  private AppCompatDelegateImplV14.AutoNightModeManager mAutoNightModeManager;
  private boolean mHandleNativeActionModes = true;
  private int mLocalNightMode = -100;
  
  AppCompatDelegateImplV14(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    super(paramContext, paramWindow, paramAppCompatCallback);
  }
  
  private void ensureAutoNightModeManager()
  {
    AppCompatDelegateImplV14.AutoNightModeManager localAutoNightModeManager = this.mAutoNightModeManager;
    if (localAutoNightModeManager == null)
    {
      localAutoNightModeManager = new android/support/v7/app/AppCompatDelegateImplV14$AutoNightModeManager;
      TwilightManager localTwilightManager = TwilightManager.getInstance(this.mContext);
      localAutoNightModeManager.<init>(this, localTwilightManager);
      this.mAutoNightModeManager = localAutoNightModeManager;
    }
  }
  
  private int getNightMode()
  {
    int i = this.mLocalNightMode;
    int j = -100;
    if (i != j) {}
    for (i = this.mLocalNightMode;; i = getDefaultNightMode()) {
      return i;
    }
  }
  
  private boolean shouldRecreateOnNightModeChange()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = this.mApplyDayNightCalled;
    Object localObject2;
    if (bool2)
    {
      localObject2 = this.mContext;
      bool2 = localObject2 instanceof Activity;
      if (bool2) {
        localObject2 = this.mContext.getPackageManager();
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = new android/content/ComponentName;
        Context localContext = this.mContext;
        Object localObject4 = this.mContext;
        localObject4 = localObject4.getClass();
        ((ComponentName)localObject3).<init>(localContext, (Class)localObject4);
        localContext = null;
        localObject2 = ((PackageManager)localObject2).getActivityInfo((ComponentName)localObject3, 0);
        int i = ((ActivityInfo)localObject2).configChanges & 0x200;
        if (i != 0) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject2 = "AppCompatDelegate";
        Object localObject3 = "Exception while getting ActivityInfo";
        Log.d((String)localObject2, (String)localObject3, localNameNotFoundException);
        continue;
      }
      return bool1;
      bool1 = false;
      continue;
      bool1 = false;
    }
  }
  
  private boolean updateForNightMode(int paramInt)
  {
    Object localObject1 = this.mContext;
    Resources localResources = ((Context)localObject1).getResources();
    Object localObject2 = localResources.getConfiguration();
    int i = ((Configuration)localObject2).uiMode & 0x30;
    int j = 2;
    if (paramInt == j)
    {
      j = 32;
      if (i == j) {
        break label156;
      }
      boolean bool = shouldRecreateOnNightModeChange();
      if (!bool) {
        break label82;
      }
      localObject1 = (Activity)this.mContext;
      ((Activity)localObject1).recreate();
      label69:
      j = 1;
    }
    for (;;)
    {
      return j;
      j = 16;
      break;
      label82:
      Configuration localConfiguration = new android/content/res/Configuration;
      localConfiguration.<init>((Configuration)localObject2);
      localObject2 = localResources.getDisplayMetrics();
      int k = localConfiguration.uiMode & 0xFFFFFFCF;
      j |= k;
      localConfiguration.uiMode = j;
      localResources.updateConfiguration(localConfiguration, (DisplayMetrics)localObject2);
      j = Build.VERSION.SDK_INT;
      int m = 26;
      if (j >= m) {
        break label69;
      }
      ResourcesFlusher.flush(localResources);
      break label69;
      label156:
      j = 0;
      localObject1 = null;
    }
  }
  
  public boolean applyDayNight()
  {
    boolean bool = false;
    int i = getNightMode();
    int j = mapNightMode(i);
    int k = -1;
    if (j != k) {
      bool = updateForNightMode(j);
    }
    if (i == 0)
    {
      ensureAutoNightModeManager();
      AppCompatDelegateImplV14.AutoNightModeManager localAutoNightModeManager = this.mAutoNightModeManager;
      localAutoNightModeManager.setup();
    }
    this.mApplyDayNightCalled = true;
    return bool;
  }
  
  View callActivityOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  final AppCompatDelegateImplV14.AutoNightModeManager getAutoNightModeManager()
  {
    ensureAutoNightModeManager();
    return this.mAutoNightModeManager;
  }
  
  public boolean hasWindowFeature(int paramInt)
  {
    boolean bool = super.hasWindowFeature(paramInt);
    Window localWindow;
    if (!bool)
    {
      localWindow = this.mWindow;
      bool = localWindow.hasFeature(paramInt);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindow = null;
    }
  }
  
  public boolean isHandleNativeActionModesEnabled()
  {
    return this.mHandleNativeActionModes;
  }
  
  int mapNightMode(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramInt;
      ensureAutoNightModeManager();
      AppCompatDelegateImplV14.AutoNightModeManager localAutoNightModeManager = this.mAutoNightModeManager;
      paramInt = localAutoNightModeManager.getApplyableNightMode();
      continue;
      paramInt = -1;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = -100;
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      int j = this.mLocalNightMode;
      if (j == i)
      {
        String str = "appcompat:local_night_mode";
        j = paramBundle.getInt(str, i);
        this.mLocalNightMode = j;
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    AppCompatDelegateImplV14.AutoNightModeManager localAutoNightModeManager = this.mAutoNightModeManager;
    if (localAutoNightModeManager != null)
    {
      localAutoNightModeManager = this.mAutoNightModeManager;
      localAutoNightModeManager.cleanup();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    int i = this.mLocalNightMode;
    int j = -100;
    if (i != j)
    {
      String str = "appcompat:local_night_mode";
      j = this.mLocalNightMode;
      paramBundle.putInt(str, j);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    applyDayNight();
  }
  
  public void onStop()
  {
    super.onStop();
    AppCompatDelegateImplV14.AutoNightModeManager localAutoNightModeManager = this.mAutoNightModeManager;
    if (localAutoNightModeManager != null)
    {
      localAutoNightModeManager = this.mAutoNightModeManager;
      localAutoNightModeManager.cleanup();
    }
  }
  
  public void setHandleNativeActionModesEnabled(boolean paramBoolean)
  {
    this.mHandleNativeActionModes = paramBoolean;
  }
  
  public void setLocalNightMode(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      String str1 = "AppCompatDelegate";
      String str2 = "setLocalNightMode() called with an unknown mode";
      Log.i(str1, str2);
    }
    for (;;)
    {
      return;
      int i = this.mLocalNightMode;
      if (i != paramInt)
      {
        this.mLocalNightMode = paramInt;
        boolean bool = this.mApplyDayNightCalled;
        if (bool) {
          applyDayNight();
        }
      }
    }
  }
  
  Window.Callback wrapWindowCallback(Window.Callback paramCallback)
  {
    AppCompatDelegateImplV14.AppCompatWindowCallbackV14 localAppCompatWindowCallbackV14 = new android/support/v7/app/AppCompatDelegateImplV14$AppCompatWindowCallbackV14;
    localAppCompatWindowCallbackV14.<init>(this, paramCallback);
    return localAppCompatWindowCallbackV14;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */