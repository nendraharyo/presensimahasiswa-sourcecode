package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.EditText;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.AccountActivity;

class DashboardActivity$3
  implements DialogInterface.OnClickListener
{
  DashboardActivity$3(DashboardActivity paramDashboardActivity, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.b = paramDialogInterface;
    Object localObject1 = this.a;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Password tidak sesuai.");
    String str = this.a.getText().toString();
    localObject2 = str;
    ((EditText)localObject1).setError((CharSequence)localObject2);
    this.a.requestFocus();
    localObject1 = new android/content/Intent;
    localObject2 = this.b.getApplicationContext();
    ((Intent)localObject1).<init>((Context)localObject2, AccountActivity.class);
    this.b.startActivity((Intent)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */