package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.os.Handler;
import android.util.SparseArray;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class AccountActivity$6
  implements Runnable
{
  AccountActivity$6(AccountActivity paramAccountActivity, d paramd) {}
  
  public void run()
  {
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    SparseArray localSparseArray = Common.f();
    localObject2 = ((d)localObject2).a(localSparseArray);
    AccountActivity.a((AccountActivity)localObject1, (SparseArray)localObject2);
    this.a.g();
    localObject1 = AccountActivity.d(this.b);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$6$1;
    ((AccountActivity.6.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */