package com.crashlytics.android.core;

import android.app.Activity;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

final class CrashlyticsController$PrivacyDialogCheck
  implements ReportUploader.SendCheck
{
  private final Kit kit;
  private final PreferenceManager preferenceManager;
  private final PromptSettingsData promptData;
  
  public CrashlyticsController$PrivacyDialogCheck(Kit paramKit, PreferenceManager paramPreferenceManager, PromptSettingsData paramPromptSettingsData)
  {
    this.kit = paramKit;
    this.preferenceManager = paramPreferenceManager;
    this.promptData = paramPromptSettingsData;
  }
  
  public boolean canSendReports()
  {
    Object localObject1 = this.kit.getFabric().getCurrentActivity();
    if (localObject1 != null)
    {
      boolean bool1 = ((Activity)localObject1).isFinishing();
      if (!bool1) {
        break label28;
      }
    }
    label28:
    Object localObject2;
    for (boolean bool2 = true;; bool2 = ((CrashPromptDialog)localObject2).getOptIn())
    {
      return bool2;
      localObject2 = new com/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck$1;
      ((CrashlyticsController.PrivacyDialogCheck.1)localObject2).<init>(this);
      Object localObject3 = this.promptData;
      localObject2 = CrashPromptDialog.create((Activity)localObject1, (PromptSettingsData)localObject3, (CrashPromptDialog.AlwaysSendCallback)localObject2);
      localObject3 = new com/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck$2;
      ((CrashlyticsController.PrivacyDialogCheck.2)localObject3).<init>(this, (CrashPromptDialog)localObject2);
      ((Activity)localObject1).runOnUiThread((Runnable)localObject3);
      localObject1 = Fabric.getLogger();
      localObject3 = "CrashlyticsCore";
      String str = "Waiting for user opt-in.";
      ((Logger)localObject1).d((String)localObject3, str);
      ((CrashPromptDialog)localObject2).await();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$PrivacyDialogCheck.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */