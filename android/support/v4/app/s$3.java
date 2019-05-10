package android.support.v4.app;

import android.support.v4.view.r;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

class s$3
  implements Runnable
{
  s$3(s params, ArrayList paramArrayList, Map paramMap) {}
  
  public void run()
  {
    int i = this.a.size();
    int j = 0;
    View localView = null;
    for (int k = 0; k < i; k = j)
    {
      localView = (View)this.a.get(k);
      String str = r.m(localView);
      Map localMap = this.b;
      str = (String)localMap.get(str);
      r.a(localView, str);
      j = k + 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\s$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */