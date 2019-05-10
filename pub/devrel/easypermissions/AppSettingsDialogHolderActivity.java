package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class AppSettingsDialogHolderActivity
  extends AppCompatActivity
  implements DialogInterface.OnClickListener
{
  private AlertDialog a;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    setResult(paramInt2, paramIntent);
    finish();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = (AppSettingsDialog)getIntent().getParcelableExtra("extra_app_settings");
    ((AppSettingsDialog)localObject).a(this);
    ((AppSettingsDialog)localObject).a(this);
    ((AppSettingsDialog)localObject).a(this);
    localObject = ((AppSettingsDialog)localObject).a();
    this.a = ((AlertDialog)localObject);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    AlertDialog localAlertDialog = this.a;
    if (localAlertDialog != null)
    {
      localAlertDialog = this.a;
      boolean bool = localAlertDialog.isShowing();
      if (bool)
      {
        localAlertDialog = this.a;
        localAlertDialog.dismiss();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\pub\devrel\easypermissions\AppSettingsDialogHolderActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */