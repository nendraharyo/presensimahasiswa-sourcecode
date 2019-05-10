package com.crashlytics.android.core;

import java.io.FileOutputStream;
import org.json.JSONObject;

class CrashlyticsController$20
  implements CrashlyticsController.FileOutputStreamWriteAction
{
  CrashlyticsController$20(CrashlyticsController paramCrashlyticsController, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {}
  
  public void writeTo(FileOutputStream paramFileOutputStream)
  {
    Object localObject = new org/json/JSONObject;
    CrashlyticsController.20.1 local1 = new com/crashlytics/android/core/CrashlyticsController$20$1;
    local1.<init>(this);
    ((JSONObject)localObject).<init>(local1);
    localObject = ((JSONObject)localObject).toString().getBytes();
    paramFileOutputStream.write((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$20.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */