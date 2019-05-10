package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

class AlertController$1
  implements View.OnClickListener
{
  AlertController$1(AlertController paramAlertController) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.this$0.mButtonPositive;
    if (paramView == localObject)
    {
      localObject = this.this$0.mButtonPositiveMessage;
      if (localObject != null) {
        localObject = Message.obtain(this.this$0.mButtonPositiveMessage);
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((Message)localObject).sendToTarget();
      }
      localObject = this.this$0.mHandler;
      AppCompatDialog localAppCompatDialog = this.this$0.mDialog;
      ((Handler)localObject).obtainMessage(1, localAppCompatDialog).sendToTarget();
      return;
      localObject = this.this$0.mButtonNegative;
      if (paramView == localObject)
      {
        localObject = this.this$0.mButtonNegativeMessage;
        if (localObject != null)
        {
          localObject = Message.obtain(this.this$0.mButtonNegativeMessage);
          continue;
        }
      }
      localObject = this.this$0.mButtonNeutral;
      if (paramView == localObject)
      {
        localObject = this.this$0.mButtonNeutralMessage;
        if (localObject != null)
        {
          localObject = Message.obtain(this.this$0.mButtonNeutralMessage);
          continue;
        }
      }
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */