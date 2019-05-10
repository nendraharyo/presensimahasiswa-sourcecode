package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.os.Handler;
import android.util.SparseArray;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class HomeActivity$4
  implements Runnable
{
  HomeActivity$4(HomeActivity paramHomeActivity, d paramd) {}
  
  public void run()
  {
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    SparseArray localSparseArray = Common.f();
    localObject2 = ((d)localObject2).a(localSparseArray);
    HomeActivity.a((HomeActivity)localObject1, (SparseArray)localObject2);
    this.a.g();
    localObject1 = HomeActivity.d(this.b);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$4$1;
    ((HomeActivity.4.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\HomeActivity$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */