package com.crashlytics.android.core;

import android.text.TextUtils;
import java.util.HashMap;

class CrashlyticsController$20$1
  extends HashMap
{
  CrashlyticsController$20$1(CrashlyticsController.20 param20)
  {
    Object localObject = this.this$1.val$appIdentifier;
    put("app_identifier", localObject);
    localObject = CrashlyticsController.access$1900(this.this$1.this$0).apiKey;
    put("api_key", localObject);
    localObject = this.this$1.val$versionCode;
    put("version_code", localObject);
    localObject = this.this$1.val$versionName;
    put("version_name", localObject);
    localObject = this.this$1.val$installUuid;
    put("install_uuid", localObject);
    int i = this.this$1.val$deliveryMechanism;
    localObject = Integer.valueOf(i);
    put("delivery_mechanism", localObject);
    localObject = "unity_version";
    String str = CrashlyticsController.access$2000(this.this$1.this$0);
    boolean bool = TextUtils.isEmpty(str);
    if (bool) {}
    for (str = "";; str = CrashlyticsController.access$2000(this.this$1.this$0))
    {
      put(localObject, str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$20$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */