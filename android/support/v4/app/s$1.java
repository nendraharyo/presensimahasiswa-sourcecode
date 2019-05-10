package android.support.v4.app;

import android.support.v4.view.r;
import android.view.View;
import java.util.ArrayList;

class s$1
  implements Runnable
{
  s$1(s params, int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
  
  public void run()
  {
    int i = 0;
    View localView = null;
    for (int j = 0;; j = i)
    {
      i = this.a;
      if (j >= i) {
        break;
      }
      localView = (View)this.b.get(j);
      String str = (String)this.c.get(j);
      r.a(localView, str);
      localView = (View)this.d.get(j);
      str = (String)this.e.get(j);
      r.a(localView, str);
      i = j + 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\s$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */