package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

class VerificationCodeActivity$2
  implements View.OnClickListener
{
  VerificationCodeActivity$2(VerificationCodeActivity paramVerificationCodeActivity) {}
  
  public void onClick(View paramView)
  {
    VerificationCodeActivity.a(this.a, 120000);
    VerificationCodeActivity.c(this.a).setEnabled(false);
    VerificationCodeActivity.d(this.a).setVisibility(0);
    TextView localTextView = VerificationCodeActivity.c(this.a);
    int i = this.a.getResources().getColor(2131099777);
    localTextView.setTextColor(i);
    Toast.makeText(this.a.getApplicationContext(), "Kode verifikasi berhasil dikirim ke email.", 1).show();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\VerificationCodeActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */