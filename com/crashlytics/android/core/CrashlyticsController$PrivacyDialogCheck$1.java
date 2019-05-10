package com.crashlytics.android.core;

class CrashlyticsController$PrivacyDialogCheck$1
  implements CrashPromptDialog.AlwaysSendCallback
{
  CrashlyticsController$PrivacyDialogCheck$1(CrashlyticsController.PrivacyDialogCheck paramPrivacyDialogCheck) {}
  
  public void sendUserReportsWithoutPrompting(boolean paramBoolean)
  {
    CrashlyticsController.PrivacyDialogCheck.access$2100(this.this$0).setShouldAlwaysSendReports(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$PrivacyDialogCheck$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */