package android.support.v7.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$3
  implements AdapterView.OnItemClickListener
{
  AlertController$AlertParams$3(AlertController.AlertParams paramAlertParams, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = this.this$0.mOnClickListener;
    AppCompatDialog localAppCompatDialog = this.val$dialog.mDialog;
    ((DialogInterface.OnClickListener)localObject).onClick(localAppCompatDialog, paramInt);
    localObject = this.this$0;
    boolean bool = ((AlertController.AlertParams)localObject).mIsSingleChoice;
    if (!bool)
    {
      localObject = this.val$dialog.mDialog;
      ((AppCompatDialog)localObject).dismiss();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$AlertParams$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */