package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class AlertController$ButtonHandler
  extends Handler
{
  private static final int MSG_DISMISS_DIALOG = 1;
  private WeakReference mDialog;
  
  public AlertController$ButtonHandler(DialogInterface paramDialogInterface)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramDialogInterface);
    this.mDialog = localWeakReference;
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      Object localObject = (DialogInterface.OnClickListener)paramMessage.obj;
      DialogInterface localDialogInterface = (DialogInterface)this.mDialog.get();
      int j = paramMessage.what;
      ((DialogInterface.OnClickListener)localObject).onClick(localDialogInterface, j);
      continue;
      localObject = (DialogInterface)paramMessage.obj;
      ((DialogInterface)localObject).dismiss();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$ButtonHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */