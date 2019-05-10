package android.support.v7.app;

import android.graphics.Rect;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;

class AppCompatDelegateImplV9$3
  implements FitWindowsViewGroup.OnFitSystemWindowsListener
{
  AppCompatDelegateImplV9$3(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void onFitSystemWindows(Rect paramRect)
  {
    AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
    int i = paramRect.top;
    int j = localAppCompatDelegateImplV9.updateStatusGuard(i);
    paramRect.top = j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */