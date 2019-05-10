package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import java.util.concurrent.Callable;

class CrashlyticsController$13
  implements Callable
{
  CrashlyticsController$13(CrashlyticsController paramCrashlyticsController, SessionSettingsData paramSessionSettingsData) {}
  
  public Boolean call()
  {
    Object localObject1 = this.this$0;
    boolean bool1 = ((CrashlyticsController)localObject1).isHandlingException();
    Object localObject2;
    String str;
    if (bool1)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      str = "Skipping session finalization because a crash has already occurred.";
      ((Logger)localObject1).d((String)localObject2, str);
    }
    for (localObject1 = Boolean.FALSE;; localObject1 = Boolean.TRUE)
    {
      return (Boolean)localObject1;
      Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
      localObject1 = this.this$0;
      localObject2 = this.val$sessionSettingsData;
      boolean bool2 = true;
      CrashlyticsController.access$1300((CrashlyticsController)localObject1, (SessionSettingsData)localObject2, bool2);
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      str = "Closed all previously open sessions";
      ((Logger)localObject1).d((String)localObject2, str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$13.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */