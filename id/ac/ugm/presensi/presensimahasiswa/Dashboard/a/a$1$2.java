package id.ac.ugm.presensi.presensimahasiswa.Dashboard.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.LogoutService;

class a$1$2
  implements DialogInterface.OnClickListener
{
  a$1$2(a.1 param1) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject1 = a.a(this.a.c);
    Object localObject2 = new android/content/Intent;
    Object localObject3 = a.a(this.a.c);
    ((Intent)localObject2).<init>((Context)localObject3, LogoutService.class);
    ((Context)localObject1).stopService((Intent)localObject2);
    localObject1 = a.a(this.a.c);
    localObject2 = new android/content/Intent;
    localObject3 = a.a(this.a.c);
    Class localClass = LogoutService.class;
    ((Intent)localObject2).<init>((Context)localObject3, localClass);
    ((Context)localObject1).startService((Intent)localObject2);
    id.ac.ugm.presensi.presensimahasiswa.utils.f.a(a.a(this.a.c), "data_history", "");
    localObject1 = a.a(this.a.c);
    int i = this.a.a;
    id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject1, "kode_mk", i);
    localObject1 = a.a(this.a.c);
    i = 1001;
    id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject1, "presence", i);
    id.ac.ugm.presensi.presensimahasiswa.utils.f.a(a.a(this.a.c), "at_current_mk", "");
    localObject1 = a.a(this.a.c);
    localObject2 = "username";
    localObject3 = this.a.b.d();
    id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject1, (String)localObject2, (String)localObject3);
    localObject1 = a.a(this.a.c);
    boolean bool = localObject1 instanceof DashboardActivity;
    if (bool)
    {
      localObject1 = (DashboardActivity)a.a(this.a.c);
      ((DashboardActivity)localObject1).b();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\a\a$1$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */