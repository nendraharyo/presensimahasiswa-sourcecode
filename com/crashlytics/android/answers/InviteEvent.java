package com.crashlytics.android.answers;

public class InviteEvent
  extends PredefinedEvent
{
  static final String METHOD_ATTRIBUTE = "method";
  static final String TYPE = "invite";
  
  String getPredefinedType()
  {
    return "invite";
  }
  
  public InviteEvent putMethod(String paramString)
  {
    this.predefinedAttributes.put("method", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\InviteEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */