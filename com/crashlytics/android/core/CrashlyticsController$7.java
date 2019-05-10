package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.util.Date;
import java.util.concurrent.Callable;

class CrashlyticsController$7
  implements Callable
{
  CrashlyticsController$7(CrashlyticsController paramCrashlyticsController, Date paramDate, Thread paramThread, Throwable paramThrowable, CrashlyticsUncaughtExceptionHandler.SettingsDataProvider paramSettingsDataProvider, boolean paramBoolean) {}
  
  public Void call()
  {
    boolean bool1 = true;
    CrashlyticsController.access$400(this.this$0).createCrashMarker();
    Object localObject1 = this.this$0;
    Object localObject2 = this.val$time;
    Object localObject3 = this.val$thread;
    Object localObject4 = this.val$ex;
    CrashlyticsController.access$500((CrashlyticsController)localObject1, (Date)localObject2, (Thread)localObject3, (Throwable)localObject4);
    localObject1 = this.val$settingsDataProvider;
    localObject3 = ((CrashlyticsUncaughtExceptionHandler.SettingsDataProvider)localObject1).getSettingsData();
    if (localObject3 != null)
    {
      localObject2 = ((SettingsData)localObject3).sessionData;
      localObject1 = ((SettingsData)localObject3).featuresData;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        bool2 = ((FeaturesSettingsData)localObject1).firebaseCrashlyticsEnabled;
        if (!bool2) {}
      }
      else
      {
        bool2 = bool1;
        if (!bool2)
        {
          bool2 = this.val$firebaseCrashlyticsClientFlag;
          if (!bool2) {}
        }
        else
        {
          localObject1 = this.this$0;
          localObject4 = this.val$time;
          long l = ((Date)localObject4).getTime();
          CrashlyticsController.access$600((CrashlyticsController)localObject1, l);
        }
        this.this$0.doCloseSessions((SessionSettingsData)localObject2);
        localObject1 = this.this$0;
        CrashlyticsController.access$700((CrashlyticsController)localObject1);
        if (localObject2 != null)
        {
          localObject1 = this.this$0;
          i = ((SessionSettingsData)localObject2).maxCompleteSessionsCount;
          ((CrashlyticsController)localObject1).trimSessionFiles(i);
        }
        localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
        ((FirebaseInfo)localObject1).<init>();
        localObject2 = CrashlyticsController.access$400(this.this$0).getContext();
        bool2 = ((FirebaseInfo)localObject1).isDataCollectionDefaultEnabled((Context)localObject2);
        if (!bool2) {
          break label245;
        }
        localObject1 = this.this$0;
        bool2 = CrashlyticsController.access$800((CrashlyticsController)localObject1, (SettingsData)localObject3);
        if (bool2) {
          break label245;
        }
      }
      for (;;)
      {
        if (bool1)
        {
          localCrashlyticsController = this.this$0;
          CrashlyticsController.access$900(localCrashlyticsController, (SettingsData)localObject3);
        }
        return null;
        bool2 = false;
        localObject1 = null;
        break;
        label245:
        bool1 = false;
        CrashlyticsController localCrashlyticsController = null;
      }
      boolean bool2 = false;
      localObject1 = null;
      int i = 0;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */