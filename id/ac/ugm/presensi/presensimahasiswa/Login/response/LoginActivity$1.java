package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class LoginActivity$1
  implements View.OnClickListener
{
  LoginActivity$1(LoginActivity paramLoginActivity) {}
  
  public void onClick(View paramView)
  {
    this.a.e.setEnabled(false);
    Intent localIntent = new android/content/Intent;
    Context localContext = this.a.getApplicationContext();
    localIntent.<init>(localContext, ManualActivity.class);
    this.a.startActivity(localIntent);
    this.a.e.setEnabled(true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */