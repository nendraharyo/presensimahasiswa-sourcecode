package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.content.Intent;
import android.view.Window;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.c;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class DashboardActivity$2$1
  implements Runnable
{
  DashboardActivity$2$1(DashboardActivity.2 param2, boolean[] paramArrayOfBoolean) {}
  
  public void run()
  {
    int i = -1;
    Object localObject = this.b.c.getWindow();
    int j = 128;
    ((Window)localObject).clearFlags(j);
    this.b.a.g();
    localObject = this.b.c;
    boolean bool = DashboardActivity.e((DashboardActivity)localObject);
    int k;
    if (bool)
    {
      localObject = this.b.c;
      k = DashboardActivity.c((DashboardActivity)localObject);
      if (k != i)
      {
        localObject = this.b.c;
        d locald = this.b.a;
        Intent localIntent = this.b.b;
        DashboardActivity.a((DashboardActivity)localObject, locald, localIntent);
      }
    }
    for (;;)
    {
      DashboardActivity.a(this.b.c, false);
      return;
      localObject = this.a;
      k = localObject[0];
      if (k != 0)
      {
        localObject = (c)DashboardActivity.f(this.b.c);
        ((c)localObject).a();
      }
      else
      {
        this.a[0] = false;
        k = 0;
        Common.a(null);
        Common.a(i, i);
        localObject = (c)DashboardActivity.f(this.b.c);
        ((c)localObject).a();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */