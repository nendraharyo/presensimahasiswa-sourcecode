package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.os.Handler;
import android.util.SparseArray;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class ManualActivity$5
  implements Runnable
{
  ManualActivity$5(ManualActivity paramManualActivity, d paramd) {}
  
  public void run()
  {
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    SparseArray localSparseArray = Common.f();
    localObject2 = ((d)localObject2).a(localSparseArray);
    ManualActivity.a((ManualActivity)localObject1, (SparseArray)localObject2);
    this.a.g();
    localObject1 = ManualActivity.c(this.b);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$5$1;
    ((ManualActivity.5.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\ManualActivity$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */