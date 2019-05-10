package com.crashlytics.android.answers;

public class CustomEvent
  extends AnswersEvent
{
  private final String eventName;
  
  public CustomEvent(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("eventName must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.validator.limitStringLength(paramString);
    this.eventName = ((String)localObject);
  }
  
  String getCustomType()
  {
    return this.eventName;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("{eventName:\"");
    Object localObject = this.eventName;
    localStringBuilder = localStringBuilder.append((String)localObject).append('"').append(", customAttributes:");
    localObject = this.customAttributes;
    return localObject + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\CustomEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */