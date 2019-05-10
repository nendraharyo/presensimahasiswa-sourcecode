package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.os.Handler;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class HomeActivity$3
  implements Runnable
{
  HomeActivity$3(HomeActivity paramHomeActivity, d paramd) {}
  
  public void run()
  {
    boolean bool;
    do
    {
      localObject1 = this.b;
      int i = HomeActivity.a((HomeActivity)localObject1);
      localObject2 = this.b;
      int j = HomeActivity.b((HomeActivity)localObject2);
      if (i >= j) {
        break;
      }
      localObject1 = this.b;
      localObject2 = this.a;
      j = ((d)localObject2).a();
      HomeActivity.a((HomeActivity)localObject1, j);
      localObject1 = this.b;
      i = HomeActivity.a((HomeActivity)localObject1);
      j = -1;
      if (i == j) {
        break;
      }
      localObject1 = this.b;
      bool = HomeActivity.c((HomeActivity)localObject1);
    } while (bool);
    Object localObject1 = HomeActivity.d(this.b);
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$3$1;
    ((HomeActivity.3.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\HomeActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */