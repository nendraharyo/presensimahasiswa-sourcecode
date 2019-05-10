package com.crashlytics.android.core;

class CrashlyticsController$17
  implements CrashlyticsController.CodedOutputStreamWriteAction
{
  CrashlyticsController$17(CrashlyticsController paramCrashlyticsController, String paramString1, String paramString2, long paramLong) {}
  
  public void writeTo(CodedOutputStream paramCodedOutputStream)
  {
    String str1 = this.val$sessionId;
    String str2 = this.val$generator;
    long l = this.val$startedAtSeconds;
    SessionProtobufHelper.writeBeginSession(paramCodedOutputStream, str1, str2, l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */