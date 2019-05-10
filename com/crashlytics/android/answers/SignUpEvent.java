package com.crashlytics.android.answers;

public class SignUpEvent
  extends PredefinedEvent
{
  static final String METHOD_ATTRIBUTE = "method";
  static final String SUCCESS_ATTRIBUTE = "success";
  static final String TYPE = "signUp";
  
  String getPredefinedType()
  {
    return "signUp";
  }
  
  public SignUpEvent putMethod(String paramString)
  {
    this.predefinedAttributes.put("method", paramString);
    return this;
  }
  
  public SignUpEvent putSuccess(boolean paramBoolean)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    String str = Boolean.toString(paramBoolean);
    localAnswersAttributes.put("success", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SignUpEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */