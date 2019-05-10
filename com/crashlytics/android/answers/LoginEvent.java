package com.crashlytics.android.answers;

public class LoginEvent
  extends PredefinedEvent
{
  static final String METHOD_ATTRIBUTE = "method";
  static final String SUCCESS_ATTRIBUTE = "success";
  static final String TYPE = "login";
  
  String getPredefinedType()
  {
    return "login";
  }
  
  public LoginEvent putMethod(String paramString)
  {
    this.predefinedAttributes.put("method", paramString);
    return this;
  }
  
  public LoginEvent putSuccess(boolean paramBoolean)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    String str = Boolean.toString(paramBoolean);
    localAnswersAttributes.put("success", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\LoginEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */