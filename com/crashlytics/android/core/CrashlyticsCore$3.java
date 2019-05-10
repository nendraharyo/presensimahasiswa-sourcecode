package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

class CrashlyticsCore$3
  implements Callable
{
  CrashlyticsCore$3(CrashlyticsCore paramCrashlyticsCore) {}
  
  public Boolean call()
  {
    try
    {
      localObject1 = this.this$0;
      localObject1 = CrashlyticsCore.access$100((CrashlyticsCore)localObject1);
      bool = ((CrashlyticsFileMarker)localObject1).remove();
      localLogger = Fabric.getLogger();
      str1 = "CrashlyticsCore";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "Initialization marker file removed: ";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject2 = ((StringBuilder)localObject2).append(bool);
      localObject2 = ((StringBuilder)localObject2).toString();
      localLogger.d(str1, (String)localObject2);
      localObject1 = Boolean.valueOf(bool);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        Object localObject2 = "Problem encountered deleting Crashlytics initialization marker.";
        localLogger.e(str1, (String)localObject2, localException);
        boolean bool = false;
        Boolean localBoolean = Boolean.valueOf(false);
      }
    }
    return (Boolean)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */