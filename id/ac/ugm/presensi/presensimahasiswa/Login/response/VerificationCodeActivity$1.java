package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

class VerificationCodeActivity$1
  implements View.OnClickListener
{
  VerificationCodeActivity$1(VerificationCodeActivity paramVerificationCodeActivity) {}
  
  public void onClick(View paramView)
  {
    Object localObject1 = VerificationCodeActivity.a(this.a);
    int i = 0;
    Object localObject2 = null;
    ((Button)localObject1).setEnabled(false);
    localObject1 = this.a;
    boolean bool1 = ((VerificationCodeActivity)localObject1).a();
    if (!bool1)
    {
      localObject1 = this.a;
      VerificationCodeActivity.b((VerificationCodeActivity)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = new android/content/Intent;
      localObject2 = this.a.getApplicationContext();
      ((Intent)localObject1).<init>((Context)localObject2, DashboardActivity.class);
      i = 268468224;
      ((Intent)localObject1).setFlags(i);
      localObject2 = this.a.getApplicationContext();
      String str1 = "";
      f.a((Context)localObject2, "data_local", str1);
      localObject2 = this.a.getApplicationContext();
      String str2 = "user_login";
      boolean bool2 = true;
      f.a((Context)localObject2, str2, bool2);
      localObject2 = this.a;
      ((VerificationCodeActivity)localObject2).startActivity((Intent)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\VerificationCodeActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */