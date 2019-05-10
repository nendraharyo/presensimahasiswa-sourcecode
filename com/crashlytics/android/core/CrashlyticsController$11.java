package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

class CrashlyticsController$11
  implements Callable
{
  CrashlyticsController$11(CrashlyticsController paramCrashlyticsController, Map paramMap) {}
  
  public Void call()
  {
    String str = CrashlyticsController.access$1200(this.this$0);
    MetaDataStore localMetaDataStore = new com/crashlytics/android/core/MetaDataStore;
    Object localObject = this.this$0.getFilesDir();
    localMetaDataStore.<init>((File)localObject);
    localObject = this.val$keyData;
    localMetaDataStore.writeKeyData(str, (Map)localObject);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */