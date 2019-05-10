package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

class CrashlyticsCore$2
  implements Callable
{
  CrashlyticsCore$2(CrashlyticsCore paramCrashlyticsCore) {}
  
  public Void call()
  {
    CrashlyticsCore.access$100(this.this$0).create();
    Fabric.getLogger().d("CrashlyticsCore", "Initialization marker file created.");
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */