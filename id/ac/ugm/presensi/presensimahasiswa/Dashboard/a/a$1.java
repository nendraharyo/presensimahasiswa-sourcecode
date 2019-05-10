package id.ac.ugm.presensi.presensimahasiswa.Dashboard.a;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.f;

class a$1
  implements View.OnClickListener
{
  a$1(a parama, int paramInt, f paramf) {}
  
  public void onClick(View paramView)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    Object localObject1 = a.a(this.c);
    localBuilder.<init>((Context)localObject1);
    localObject1 = a.a(this.c).getResources().getString(2131689789);
    localBuilder.setMessage((CharSequence)localObject1);
    localBuilder.setCancelable(false);
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/a/a$1$1;
    ((a.1.1)localObject2).<init>(this);
    localBuilder.setNegativeButton("Tidak", (DialogInterface.OnClickListener)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/a/a$1$2;
    ((a.1.2)localObject2).<init>(this);
    localBuilder.setPositiveButton("Ya", (DialogInterface.OnClickListener)localObject2);
    localBuilder.create().show();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\a\a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */