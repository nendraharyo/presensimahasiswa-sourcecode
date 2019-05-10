package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.view.Window;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class HomeActivity$3$1
  implements Runnable
{
  HomeActivity$3$1(HomeActivity.3 param3) {}
  
  public void run()
  {
    int i = -1;
    Object localObject = this.a.b.getWindow();
    int j = 128;
    ((Window)localObject).clearFlags(j);
    this.a.a.g();
    localObject = this.a.b;
    boolean bool = HomeActivity.c((HomeActivity)localObject);
    int k;
    if (bool)
    {
      localObject = this.a.b;
      k = HomeActivity.a((HomeActivity)localObject);
      if (k != i)
      {
        localObject = this.a.b;
        d locald = this.a.a;
        HomeActivity.a((HomeActivity)localObject, locald);
      }
    }
    for (;;)
    {
      HomeActivity.a(this.a.b, false);
      return;
      k = 0;
      localObject = null;
      Common.a(null);
      Common.a(i, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\HomeActivity$3$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */