package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

class ManualActivity$2
  implements View.OnClickListener
{
  ManualActivity$2(ManualActivity paramManualActivity) {}
  
  public void onClick(View paramView)
  {
    Object localObject = new android/app/AlertDialog$Builder;
    ManualActivity localManualActivity = this.a;
    ((AlertDialog.Builder)localObject).<init>(localManualActivity);
    localObject = ((AlertDialog.Builder)localObject).create();
    ((AlertDialog)localObject).setTitle("Info DSSDI");
    ((AlertDialog)localObject).setMessage("How to reset password? contact DSSDI..., free text\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ...free text...");
    ManualActivity.2.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$2$1;
    local1.<init>(this);
    ((AlertDialog)localObject).setButton("OK", local1);
    ((AlertDialog)localObject).show();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\ManualActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */