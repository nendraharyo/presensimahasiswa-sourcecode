package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.os.Handler;
import android.util.SparseArray;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class LoginActivity$6
  implements Runnable
{
  LoginActivity$6(LoginActivity paramLoginActivity, d paramd) {}
  
  public void run()
  {
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    SparseArray localSparseArray = Common.f();
    localObject2 = ((d)localObject2).a(localSparseArray);
    LoginActivity.a((LoginActivity)localObject1, (SparseArray)localObject2);
    this.a.g();
    localObject1 = LoginActivity.c(this.b);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$6$1;
    ((LoginActivity.6.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */