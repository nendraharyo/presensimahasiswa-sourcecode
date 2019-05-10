package android.support.v4.app;

import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import java.util.List;

class a$e
  extends a.d
{
  a$e(ab paramab)
  {
    super(paramab);
  }
  
  public void onSharedElementsArrived(List paramList1, List paramList2, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
  {
    ab localab = this.a;
    a.e.1 local1 = new android/support/v4/app/a$e$1;
    local1.<init>(this, paramOnSharedElementsReadyListener);
    localab.a(paramList1, paramList2, local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\a$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */