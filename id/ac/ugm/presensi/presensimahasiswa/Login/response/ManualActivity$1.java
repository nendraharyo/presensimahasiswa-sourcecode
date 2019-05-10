package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class ManualActivity$1
  implements View.OnClickListener
{
  ManualActivity$1(ManualActivity paramManualActivity) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.a.d;
    boolean bool1 = false;
    ((Button)localObject).setEnabled(false);
    localObject = this.a;
    boolean bool2 = ((ManualActivity)localObject).c();
    if (!bool2)
    {
      localObject = this.a;
      ((ManualActivity)localObject).b();
    }
    for (;;)
    {
      return;
      ManualActivity.a(this.a);
      localObject = this.a.d;
      bool1 = true;
      ((Button)localObject).setEnabled(bool1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\ManualActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */