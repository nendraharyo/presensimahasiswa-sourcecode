package com.crashlytics.android.core;

import java.io.FileOutputStream;
import org.json.JSONObject;

class CrashlyticsController$22
  implements CrashlyticsController.FileOutputStreamWriteAction
{
  CrashlyticsController$22(CrashlyticsController paramCrashlyticsController, boolean paramBoolean) {}
  
  public void writeTo(FileOutputStream paramFileOutputStream)
  {
    Object localObject = new org/json/JSONObject;
    CrashlyticsController.22.1 local1 = new com/crashlytics/android/core/CrashlyticsController$22$1;
    local1.<init>(this);
    ((JSONObject)localObject).<init>(local1);
    localObject = ((JSONObject)localObject).toString().getBytes();
    paramFileOutputStream.write((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$22.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */