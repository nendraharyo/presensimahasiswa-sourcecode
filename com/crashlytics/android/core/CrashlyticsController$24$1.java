package com.crashlytics.android.core;

import android.os.Build;
import java.util.HashMap;

class CrashlyticsController$24$1
  extends HashMap
{
  CrashlyticsController$24$1(CrashlyticsController.24 param24)
  {
    Object localObject = Integer.valueOf(this.this$1.val$arch);
    put("arch", localObject);
    localObject = Build.MODEL;
    put("build_model", localObject);
    localObject = Integer.valueOf(this.this$1.val$availableProcessors);
    put("available_processors", localObject);
    localObject = Long.valueOf(this.this$1.val$totalRam);
    put("total_ram", localObject);
    localObject = Long.valueOf(this.this$1.val$diskSpace);
    put("disk_space", localObject);
    localObject = Boolean.valueOf(this.this$1.val$isEmulator);
    put("is_emulator", localObject);
    localObject = this.this$1.val$ids;
    put("ids", localObject);
    localObject = Integer.valueOf(this.this$1.val$state);
    put("state", localObject);
    localObject = Build.MANUFACTURER;
    put("build_manufacturer", localObject);
    localObject = Build.PRODUCT;
    put("build_product", localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$24$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */