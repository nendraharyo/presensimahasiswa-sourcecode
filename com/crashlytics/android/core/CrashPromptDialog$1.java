package com.crashlytics.android.core;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class CrashPromptDialog$1
  implements DialogInterface.OnClickListener
{
  CrashPromptDialog$1(CrashPromptDialog.OptInLatch paramOptInLatch) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.val$latch.setOptIn(true);
    paramDialogInterface.dismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashPromptDialog$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */