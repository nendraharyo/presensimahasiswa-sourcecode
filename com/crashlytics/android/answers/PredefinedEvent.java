package com.crashlytics.android.answers;

import java.util.Map;

public abstract class PredefinedEvent
  extends AnswersEvent
{
  final AnswersAttributes predefinedAttributes;
  
  public PredefinedEvent()
  {
    AnswersAttributes localAnswersAttributes = new com/crashlytics/android/answers/AnswersAttributes;
    AnswersEventValidator localAnswersEventValidator = this.validator;
    localAnswersAttributes.<init>(localAnswersEventValidator);
    this.predefinedAttributes = localAnswersAttributes;
  }
  
  Map getPredefinedAttributes()
  {
    return this.predefinedAttributes.attributes;
  }
  
  abstract String getPredefinedType();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("{type:\"");
    Object localObject = getPredefinedType();
    localStringBuilder = localStringBuilder.append((String)localObject).append('"').append(", predefinedAttributes:");
    localObject = this.predefinedAttributes;
    localStringBuilder = localStringBuilder.append(localObject).append(", customAttributes:");
    localObject = this.customAttributes;
    return localObject + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\PredefinedEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */