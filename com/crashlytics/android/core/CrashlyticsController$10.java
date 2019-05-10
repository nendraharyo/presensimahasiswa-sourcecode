package com.crashlytics.android.core;

import java.io.File;
import java.util.concurrent.Callable;

class CrashlyticsController$10
  implements Callable
{
  CrashlyticsController$10(CrashlyticsController paramCrashlyticsController, String paramString1, String paramString2, String paramString3) {}
  
  public Void call()
  {
    String str1 = CrashlyticsController.access$1200(this.this$0);
    MetaDataStore localMetaDataStore = new com/crashlytics/android/core/MetaDataStore;
    Object localObject = this.this$0.getFilesDir();
    localMetaDataStore.<init>((File)localObject);
    localObject = new com/crashlytics/android/core/UserMetaData;
    String str2 = this.val$userId;
    String str3 = this.val$userName;
    String str4 = this.val$userEmail;
    ((UserMetaData)localObject).<init>(str2, str3, str4);
    localMetaDataStore.writeUserData(str1, (UserMetaData)localObject);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */