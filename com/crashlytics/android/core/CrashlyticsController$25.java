package com.crashlytics.android.core;

class CrashlyticsController$25
  implements CrashlyticsController.CodedOutputStreamWriteAction
{
  CrashlyticsController$25(CrashlyticsController paramCrashlyticsController, UserMetaData paramUserMetaData) {}
  
  public void writeTo(CodedOutputStream paramCodedOutputStream)
  {
    String str1 = this.val$userMetaData.id;
    String str2 = this.val$userMetaData.name;
    String str3 = this.val$userMetaData.email;
    SessionProtobufHelper.writeSessionUser(paramCodedOutputStream, str1, str2, str3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$25.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */