package com.crashlytics.android.core;

import android.content.Context;
import java.io.File;
import java.util.TreeSet;
import java.util.concurrent.Callable;

class CrashlyticsController$16
  implements Callable
{
  CrashlyticsController$16(CrashlyticsController paramCrashlyticsController, CrashlyticsNdkData paramCrashlyticsNdkData) {}
  
  public Boolean call()
  {
    TreeSet localTreeSet = this.val$ndkData.timestampedDirectories;
    Object localObject = this.this$0;
    String str = CrashlyticsController.access$1600((CrashlyticsController)localObject);
    if (str != null)
    {
      boolean bool = localTreeSet.isEmpty();
      if (!bool)
      {
        localObject = (File)localTreeSet.first();
        if (localObject != null)
        {
          CrashlyticsController localCrashlyticsController = this.this$0;
          Context localContext = CrashlyticsController.access$400(this.this$0).getContext();
          CrashlyticsController.access$1700(localCrashlyticsController, localContext, (File)localObject, str);
        }
      }
    }
    CrashlyticsController.access$1800(this.this$0, localTreeSet);
    return Boolean.TRUE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */