package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.os.Handler;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class AccountActivity$7
  implements Runnable
{
  AccountActivity$7(AccountActivity paramAccountActivity, d paramd) {}
  
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
      AccountActivity localAccountActivity = this.b;
      int m = AccountActivity.e(localAccountActivity);
      Object localObject = this.b;
      int n = AccountActivity.f((AccountActivity)localObject);
      if (m >= n) {
        break label179;
      }
      AccountActivity.a(this.b, k);
      localAccountActivity = this.b;
      m = AccountActivity.e(localAccountActivity);
      if (m != i)
      {
        localAccountActivity = this.b;
        m = AccountActivity.e(localAccountActivity);
        n = 6;
        if (m != n) {}
      }
      else
      {
        localAccountActivity = this.b;
        localObject = this.a;
        n = ((d)localObject).a();
        AccountActivity.a(localAccountActivity, n);
      }
      k += 1;
      localAccountActivity = this.b;
      m = AccountActivity.e(localAccountActivity);
      n = -1;
      if (m == n) {
        break;
      }
      localAccountActivity = this.b;
      bool = AccountActivity.g(localAccountActivity);
    } while (bool);
    arrayOfBoolean[0] = j;
    label179:
    Handler localHandler = AccountActivity.d(this.b);
    AccountActivity.7.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$7$1;
    local1.<init>(this, arrayOfBoolean);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */