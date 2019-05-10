package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.AccountActivity;

class DashboardActivity$5
  implements View.OnClickListener
{
  DashboardActivity$5(DashboardActivity paramDashboardActivity, EditText paramEditText, AlertDialog paramAlertDialog) {}
  
  public void onClick(View paramView)
  {
    Object localObject1 = this.a.getText().toString();
    Object localObject2 = "testing";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      this.b.dismiss();
      localObject1 = new android/content/Intent;
      localObject2 = this.c.getApplicationContext();
      Class localClass = AccountActivity.class;
      ((Intent)localObject1).<init>((Context)localObject2, localClass);
      localObject2 = this.c;
      ((DashboardActivity)localObject2).startActivity((Intent)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.a;
      localObject2 = "Password tidak sesuai.";
      ((EditText)localObject1).setError((CharSequence)localObject2);
      localObject1 = this.a;
      ((EditText)localObject1).requestFocus();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */