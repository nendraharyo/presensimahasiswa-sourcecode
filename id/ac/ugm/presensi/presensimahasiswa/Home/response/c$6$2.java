package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.i;
import id.ac.ugm.presensi.presensimahasiswa.utils.LogoutService;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

class c$6$2
  implements DialogInterface.OnClickListener
{
  c$6$2(c.6 param6) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject1 = this.a.a.getActivity();
    Object localObject2 = new android/content/Intent;
    i locali = this.a.a.getActivity();
    ((Intent)localObject2).<init>(locali, LogoutService.class);
    ((i)localObject1).stopService((Intent)localObject2);
    f.a(this.a.a.getActivity(), "mk_finished", true);
    localObject1 = new android/content/Intent;
    localObject2 = this.a.a.getActivity();
    ((Intent)localObject1).<init>((Context)localObject2, AccountActivity.class);
    ((Intent)localObject1).setFlags(268468224);
    this.a.a.startActivity((Intent)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$6$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */