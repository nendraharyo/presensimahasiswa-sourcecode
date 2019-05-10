package id.ac.ugm.presensi.presensimahasiswa;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class CheckingActivity$3
  implements DialogInterface.OnClickListener
{
  CheckingActivity$3(CheckingActivity paramCheckingActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    CheckingActivity localCheckingActivity = this.a;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.settings.NFC_SETTINGS");
    localCheckingActivity.startActivity(localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\CheckingActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */