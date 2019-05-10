package com.crashlytics.android.core;

import android.os.Build.VERSION;
import java.util.HashMap;

class CrashlyticsController$22$1
  extends HashMap
{
  CrashlyticsController$22$1(CrashlyticsController.22 param22)
  {
    Object localObject = Build.VERSION.RELEASE;
    put("version", localObject);
    localObject = Build.VERSION.CODENAME;
    put("build_version", localObject);
    localObject = Boolean.valueOf(this.this$1.val$isRooted);
    put("is_rooted", localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$22$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */