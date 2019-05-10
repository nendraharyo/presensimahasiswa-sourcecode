package com.crashlytics.android.core;

import android.os.Build.VERSION;

class CrashlyticsController$21
  implements CrashlyticsController.CodedOutputStreamWriteAction
{
  CrashlyticsController$21(CrashlyticsController paramCrashlyticsController, boolean paramBoolean) {}
  
  public void writeTo(CodedOutputStream paramCodedOutputStream)
  {
    String str1 = Build.VERSION.RELEASE;
    String str2 = Build.VERSION.CODENAME;
    boolean bool = this.val$isRooted;
    SessionProtobufHelper.writeSessionOS(paramCodedOutputStream, str1, str2, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */