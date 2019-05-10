package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

class AppCompatDelegateImplV23$AppCompatWindowCallbackV23
  extends AppCompatDelegateImplV14.AppCompatWindowCallbackV14
{
  AppCompatDelegateImplV23$AppCompatWindowCallbackV23(AppCompatDelegateImplV23 paramAppCompatDelegateImplV23, Window.Callback paramCallback)
  {
    super(paramAppCompatDelegateImplV23, paramCallback);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    Object localObject = this.this$0;
    boolean bool = ((AppCompatDelegateImplV23)localObject).isHandleNativeActionModesEnabled();
    if (bool) {
      switch (paramInt)
      {
      }
    }
    for (localObject = super.onWindowStartingActionMode(paramCallback, paramInt);; localObject = startAsSupportActionMode(paramCallback)) {
      return (ActionMode)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV23$AppCompatWindowCallbackV23.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */