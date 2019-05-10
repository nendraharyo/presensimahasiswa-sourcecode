package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.i;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

class a$1$2
  implements DialogInterface.OnClickListener
{
  a$1$2(a.1 param1) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    i locali = this.a.a.getActivity();
    localIntent.<init>(locali, LoginActivity.class);
    localIntent.putExtra("finish", true);
    localIntent.setFlags(67108864);
    f.a(this.a.a.getActivity(), "user_login", false);
    this.a.a.startActivity(localIntent);
    this.a.a.getActivity().finish();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\a$1$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */