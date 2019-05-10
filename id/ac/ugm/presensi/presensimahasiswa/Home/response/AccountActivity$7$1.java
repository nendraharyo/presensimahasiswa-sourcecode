package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.view.Window;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;

class AccountActivity$7$1
  implements Runnable
{
  AccountActivity$7$1(AccountActivity.7 param7, boolean[] paramArrayOfBoolean) {}
  
  public void run()
  {
    int i = -1;
    Object localObject = this.b.b.getWindow();
    int j = 128;
    ((Window)localObject).clearFlags(j);
    this.b.a.g();
    localObject = this.b.b;
    boolean bool = AccountActivity.g((AccountActivity)localObject);
    int k;
    if (bool)
    {
      localObject = this.b.b;
      k = AccountActivity.e((AccountActivity)localObject);
      if (k != i)
      {
        localObject = this.b.b;
        d locald = this.b.a;
        AccountActivity.a((AccountActivity)localObject, locald);
      }
    }
    for (;;)
    {
      AccountActivity.a(this.b.b, false);
      return;
      localObject = this.a;
      k = localObject[0];
      if (k == 0)
      {
        this.a[0] = false;
        k = 0;
        localObject = null;
        Common.a(null);
        Common.a(i, i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity$7$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */