package com.crashlytics.android.core;

class CrashlyticsController$19
  implements CrashlyticsController.CodedOutputStreamWriteAction
{
  CrashlyticsController$19(CrashlyticsController paramCrashlyticsController, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {}
  
  public void writeTo(CodedOutputStream paramCodedOutputStream)
  {
    String str1 = this.val$appIdentifier;
    String str2 = CrashlyticsController.access$1900(this.this$0).apiKey;
    String str3 = this.val$versionCode;
    String str4 = this.val$versionName;
    String str5 = this.val$installUuid;
    int i = this.val$deliveryMechanism;
    String str6 = CrashlyticsController.access$2000(this.this$0);
    SessionProtobufHelper.writeSessionApp(paramCodedOutputStream, str1, str2, str3, str4, str5, i, str6);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$19.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */