package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class AppCompatDelegateImplV23
  extends AppCompatDelegateImplV14
{
  private final UiModeManager mUiModeManager;
  
  AppCompatDelegateImplV23(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    super(paramContext, paramWindow, paramAppCompatCallback);
    UiModeManager localUiModeManager = (UiModeManager)paramContext.getSystemService("uimode");
    this.mUiModeManager = localUiModeManager;
  }
  
  int mapNightMode(int paramInt)
  {
    if (paramInt == 0)
    {
      UiModeManager localUiModeManager = this.mUiModeManager;
      i = localUiModeManager.getNightMode();
      if (i != 0) {}
    }
    for (int i = -1;; i = super.mapNightMode(paramInt)) {
      return i;
    }
  }
  
  Window.Callback wrapWindowCallback(Window.Callback paramCallback)
  {
    AppCompatDelegateImplV23.AppCompatWindowCallbackV23 localAppCompatWindowCallbackV23 = new android/support/v7/app/AppCompatDelegateImplV23$AppCompatWindowCallbackV23;
    localAppCompatWindowCallbackV23.<init>(this, paramCallback);
    return localAppCompatWindowCallbackV23;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV23.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */