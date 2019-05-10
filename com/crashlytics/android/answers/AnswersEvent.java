package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import java.util.Map;

public abstract class AnswersEvent
{
  public static final int MAX_NUM_ATTRIBUTES = 20;
  public static final int MAX_STRING_LENGTH = 100;
  final AnswersAttributes customAttributes;
  final AnswersEventValidator validator;
  
  public AnswersEvent()
  {
    Object localObject = new com/crashlytics/android/answers/AnswersEventValidator;
    boolean bool = Fabric.isDebuggable();
    ((AnswersEventValidator)localObject).<init>(20, 100, bool);
    this.validator = ((AnswersEventValidator)localObject);
    localObject = new com/crashlytics/android/answers/AnswersAttributes;
    AnswersEventValidator localAnswersEventValidator = this.validator;
    ((AnswersAttributes)localObject).<init>(localAnswersEventValidator);
    this.customAttributes = ((AnswersAttributes)localObject);
  }
  
  Map getCustomAttributes()
  {
    return this.customAttributes.attributes;
  }
  
  public AnswersEvent putCustomAttribute(String paramString, Number paramNumber)
  {
    this.customAttributes.put(paramString, paramNumber);
    return this;
  }
  
  public AnswersEvent putCustomAttribute(String paramString1, String paramString2)
  {
    this.customAttributes.put(paramString1, paramString2);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */