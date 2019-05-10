package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.os.Handler;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class LoginActivity$7
  implements Runnable
{
  LoginActivity$7(LoginActivity paramLoginActivity, d paramd) {}
  
  public void run()
  {
    boolean bool;
    do
    {
      localObject1 = this.b;
      int i = LoginActivity.d((LoginActivity)localObject1);
      localObject2 = this.b;
      int j = LoginActivity.e((LoginActivity)localObject2);
      if (i >= j) {
        break;
      }
      localObject1 = this.b;
      localObject2 = this.a;
      j = ((d)localObject2).a();
      LoginActivity.a((LoginActivity)localObject1, j);
      localObject1 = this.b;
      i = LoginActivity.d((LoginActivity)localObject1);
      j = -1;
      if (i == j) {
        break;
      }
      localObject1 = this.b;
      bool = LoginActivity.f((LoginActivity)localObject1);
    } while (bool);
    Object localObject1 = LoginActivity.c(this.b);
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$7$1;
    ((LoginActivity.7.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */