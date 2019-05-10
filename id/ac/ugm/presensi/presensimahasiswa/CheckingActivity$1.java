package id.ac.ugm.presensi.presensimahasiswa;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class CheckingActivity$1
  implements DialogInterface.OnClickListener
{
  CheckingActivity$1(CheckingActivity paramCheckingActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.settings.APPLICATION_DETAILS_SETTINGS");
    String str = this.a.getPackageName();
    Uri localUri = Uri.fromParts("package", str, null);
    localIntent.setData(localUri);
    this.a.startActivityForResult(localIntent, 101);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\CheckingActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */