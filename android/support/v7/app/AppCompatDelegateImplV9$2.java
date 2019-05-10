package android.support.v7.app;

import android.support.v4.view.o;
import android.support.v4.view.r;
import android.support.v4.view.z;
import android.view.View;

class AppCompatDelegateImplV9$2
  implements o
{
  AppCompatDelegateImplV9$2(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public z onApplyWindowInsets(View paramView, z paramz)
  {
    int i = paramz.b();
    AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
    int j = localAppCompatDelegateImplV9.updateStatusGuard(i);
    if (i != j)
    {
      i = paramz.a();
      int k = paramz.c();
      int m = paramz.d();
      paramz = paramz.a(i, j, k, m);
    }
    return r.a(paramView, paramz);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */