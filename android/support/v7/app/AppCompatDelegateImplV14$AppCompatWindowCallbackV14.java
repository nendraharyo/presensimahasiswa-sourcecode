package android.support.v7.app;

import android.content.Context;
import android.support.v7.view.SupportActionModeWrapper.CallbackWrapper;
import android.view.Window.Callback;

class AppCompatDelegateImplV14$AppCompatWindowCallbackV14
  extends AppCompatDelegateImplBase.AppCompatWindowCallbackBase
{
  AppCompatDelegateImplV14$AppCompatWindowCallbackV14(AppCompatDelegateImplV14 paramAppCompatDelegateImplV14, Window.Callback paramCallback)
  {
    super(paramAppCompatDelegateImplV14, paramCallback);
  }
  
  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback paramCallback)
  {
    Object localObject = this.this$0;
    boolean bool = ((AppCompatDelegateImplV14)localObject).isHandleNativeActionModesEnabled();
    if (bool) {}
    for (localObject = startAsSupportActionMode(paramCallback);; localObject = super.onWindowStartingActionMode(paramCallback)) {
      return (android.view.ActionMode)localObject;
    }
  }
  
  final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback paramCallback)
  {
    Object localObject1 = new android/support/v7/view/SupportActionModeWrapper$CallbackWrapper;
    Object localObject2 = this.this$0.mContext;
    ((SupportActionModeWrapper.CallbackWrapper)localObject1).<init>((Context)localObject2, paramCallback);
    localObject2 = this.this$0.startSupportActionMode((android.support.v7.view.ActionMode.Callback)localObject1);
    if (localObject2 != null) {}
    for (localObject1 = ((SupportActionModeWrapper.CallbackWrapper)localObject1).getActionModeWrapper((android.support.v7.view.ActionMode)localObject2);; localObject1 = null) {
      return (android.view.ActionMode)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV14$AppCompatWindowCallbackV14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */