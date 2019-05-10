package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

final class CrashlyticsCore$CrashMarkerCheck
  implements Callable
{
  private final CrashlyticsFileMarker crashMarker;
  
  public CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker paramCrashlyticsFileMarker)
  {
    this.crashMarker = paramCrashlyticsFileMarker;
  }
  
  public Boolean call()
  {
    Object localObject = this.crashMarker;
    boolean bool = ((CrashlyticsFileMarker)localObject).isPresent();
    if (!bool) {}
    for (localObject = Boolean.FALSE;; localObject = Boolean.TRUE)
    {
      return (Boolean)localObject;
      localObject = Fabric.getLogger();
      String str1 = "CrashlyticsCore";
      String str2 = "Found previous crash marker.";
      ((Logger)localObject).d(str1, str2);
      this.crashMarker.remove();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore$CrashMarkerCheck.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */