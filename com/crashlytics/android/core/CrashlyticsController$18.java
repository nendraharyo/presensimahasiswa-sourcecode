package com.crashlytics.android.core;

import java.io.FileOutputStream;
import org.json.JSONObject;

class CrashlyticsController$18
  implements CrashlyticsController.FileOutputStreamWriteAction
{
  CrashlyticsController$18(CrashlyticsController paramCrashlyticsController, String paramString1, String paramString2, long paramLong) {}
  
  public void writeTo(FileOutputStream paramFileOutputStream)
  {
    Object localObject = new org/json/JSONObject;
    CrashlyticsController.18.1 local1 = new com/crashlytics/android/core/CrashlyticsController$18$1;
    local1.<init>(this);
    ((JSONObject)localObject).<init>(local1);
    localObject = ((JSONObject)localObject).toString().getBytes();
    paramFileOutputStream.write((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$18.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */