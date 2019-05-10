package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.view.Window;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class LoginActivity$7$1
  implements Runnable
{
  LoginActivity$7$1(LoginActivity.7 param7) {}
  
  public void run()
  {
    int i = -1;
    Object localObject = this.a.b.getWindow();
    int j = 128;
    ((Window)localObject).clearFlags(j);
    this.a.a.g();
    localObject = this.a.b;
    boolean bool = LoginActivity.f((LoginActivity)localObject);
    int k;
    if (bool)
    {
      localObject = this.a.b;
      k = LoginActivity.d((LoginActivity)localObject);
      if (k != i)
      {
        localObject = this.a.b;
        d locald = this.a.a;
        LoginActivity.a((LoginActivity)localObject, locald);
      }
    }
    for (;;)
    {
      LoginActivity.a(this.a.b, false);
      return;
      k = 0;
      localObject = null;
      Common.a(null);
      Common.a(i, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$7$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */