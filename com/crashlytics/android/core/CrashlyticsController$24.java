package com.crashlytics.android.core;

import java.io.FileOutputStream;
import java.util.Map;
import org.json.JSONObject;

class CrashlyticsController$24
  implements CrashlyticsController.FileOutputStreamWriteAction
{
  CrashlyticsController$24(CrashlyticsController paramCrashlyticsController, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map paramMap, int paramInt3) {}
  
  public void writeTo(FileOutputStream paramFileOutputStream)
  {
    Object localObject = new org/json/JSONObject;
    CrashlyticsController.24.1 local1 = new com/crashlytics/android/core/CrashlyticsController$24$1;
    local1.<init>(this);
    ((JSONObject)localObject).<init>(local1);
    localObject = ((JSONObject)localObject).toString().getBytes();
    paramFileOutputStream.write((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$24.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */