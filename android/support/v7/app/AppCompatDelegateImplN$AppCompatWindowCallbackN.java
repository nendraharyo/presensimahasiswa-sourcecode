package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

class AppCompatDelegateImplN$AppCompatWindowCallbackN
  extends AppCompatDelegateImplV23.AppCompatWindowCallbackV23
{
  AppCompatDelegateImplN$AppCompatWindowCallbackN(AppCompatDelegateImplN paramAppCompatDelegateImplN, Window.Callback paramCallback)
  {
    super(paramAppCompatDelegateImplN, paramCallback);
  }
  
  public void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt)
  {
    Object localObject = this.this$0;
    MenuBuilder localMenuBuilder = null;
    boolean bool = true;
    localObject = ((AppCompatDelegateImplN)localObject).getPanelState(0, bool);
    if (localObject != null)
    {
      localMenuBuilder = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).menu;
      if (localMenuBuilder != null)
      {
        localObject = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).menu;
        super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
      }
    }
    for (;;)
    {
      return;
      super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplN$AppCompatWindowCallbackN.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */