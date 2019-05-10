package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

class HomeActivity$2
  implements DialogInterface.OnClickListener
{
  HomeActivity$2(HomeActivity paramHomeActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    Context localContext = this.a.getApplicationContext();
    localIntent.<init>(localContext, LoginActivity.class);
    localIntent.putExtra("finish", true);
    localIntent.setFlags(67108864);
    f.a(this.a.getApplicationContext(), "user_login", false);
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\HomeActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */