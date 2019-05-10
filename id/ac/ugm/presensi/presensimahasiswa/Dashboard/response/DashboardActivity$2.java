package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.content.Intent;
import android.os.Handler;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class DashboardActivity$2
  implements Runnable
{
  DashboardActivity$2(DashboardActivity paramDashboardActivity, d paramd, Intent paramIntent) {}
  
  public void run()
  {
    int i = 2;
    int j = 1;
    boolean[] arrayOfBoolean = new boolean[j];
    arrayOfBoolean[0] = false;
    int k = i;
    boolean bool;
    do
    {
      DashboardActivity localDashboardActivity = this.c;
      int m = DashboardActivity.c(localDashboardActivity);
      Object localObject = this.c;
      int n = DashboardActivity.d((DashboardActivity)localObject);
      if (m >= n) {
        break label179;
      }
      DashboardActivity.a(this.c, k);
      localDashboardActivity = this.c;
      m = DashboardActivity.c(localDashboardActivity);
      if (m != i)
      {
        localDashboardActivity = this.c;
        m = DashboardActivity.c(localDashboardActivity);
        n = 6;
        if (m != n) {}
      }
      else
      {
        localDashboardActivity = this.c;
        localObject = this.a;
        n = ((d)localObject).a();
        DashboardActivity.a(localDashboardActivity, n);
      }
      k += 1;
      localDashboardActivity = this.c;
      m = DashboardActivity.c(localDashboardActivity);
      n = -1;
      if (m == n) {
        break;
      }
      localDashboardActivity = this.c;
      bool = DashboardActivity.e(localDashboardActivity);
    } while (bool);
    arrayOfBoolean[0] = j;
    label179:
    Handler localHandler = DashboardActivity.b(this.c);
    DashboardActivity.2.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$2$1;
    local1.<init>(this, arrayOfBoolean);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */