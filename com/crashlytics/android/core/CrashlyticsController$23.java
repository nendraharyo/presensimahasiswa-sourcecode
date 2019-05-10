package com.crashlytics.android.core;

import android.os.Build;
import java.util.Map;

class CrashlyticsController$23
  implements CrashlyticsController.CodedOutputStreamWriteAction
{
  CrashlyticsController$23(CrashlyticsController paramCrashlyticsController, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map paramMap, int paramInt3) {}
  
  public void writeTo(CodedOutputStream paramCodedOutputStream)
  {
    int i = this.val$arch;
    String str1 = Build.MODEL;
    int j = this.val$availableProcessors;
    long l1 = this.val$totalRam;
    long l2 = this.val$diskSpace;
    boolean bool = this.val$isEmulator;
    Map localMap = this.val$ids;
    int k = this.val$state;
    String str2 = Build.MANUFACTURER;
    String str3 = Build.PRODUCT;
    SessionProtobufHelper.writeSessionDevice(paramCodedOutputStream, i, str1, j, l1, l2, bool, localMap, k, str2, str3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$23.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */