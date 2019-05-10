package com.crashlytics.android.core;

import java.io.File;

class CrashlyticsController$14
  implements Runnable
{
  CrashlyticsController$14(CrashlyticsController paramCrashlyticsController) {}
  
  public void run()
  {
    CrashlyticsController localCrashlyticsController = this.this$0;
    Object localObject = this.this$0;
    CrashlyticsController.InvalidPartFileFilter localInvalidPartFileFilter = new com/crashlytics/android/core/CrashlyticsController$InvalidPartFileFilter;
    localInvalidPartFileFilter.<init>();
    localObject = CrashlyticsController.access$1500((CrashlyticsController)localObject, localInvalidPartFileFilter);
    localCrashlyticsController.doCleanInvalidTempFiles((File[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */