package com.crashlytics.android.core;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class CrashPromptDialog$3
  implements DialogInterface.OnClickListener
{
  CrashPromptDialog$3(CrashPromptDialog.AlwaysSendCallback paramAlwaysSendCallback, CrashPromptDialog.OptInLatch paramOptInLatch) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = true;
    this.val$alwaysSendCallback.sendUserReportsWithoutPrompting(bool);
    this.val$latch.setOptIn(bool);
    paramDialogInterface.dismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashPromptDialog$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */