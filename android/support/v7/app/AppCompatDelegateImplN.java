package android.support.v7.app;

import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class AppCompatDelegateImplN
  extends AppCompatDelegateImplV23
{
  AppCompatDelegateImplN(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    super(paramContext, paramWindow, paramAppCompatCallback);
  }
  
  Window.Callback wrapWindowCallback(Window.Callback paramCallback)
  {
    AppCompatDelegateImplN.AppCompatWindowCallbackN localAppCompatWindowCallbackN = new android/support/v7/app/AppCompatDelegateImplN$AppCompatWindowCallbackN;
    localAppCompatWindowCallbackN.<init>(this, paramCallback);
    return localAppCompatWindowCallbackN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplN.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */