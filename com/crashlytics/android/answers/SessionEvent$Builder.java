package com.crashlytics.android.answers;

import java.util.Map;

class SessionEvent$Builder
{
  Map customAttributes;
  String customType;
  Map details;
  Map predefinedAttributes;
  String predefinedType;
  final long timestamp;
  final SessionEvent.Type type;
  
  public SessionEvent$Builder(SessionEvent.Type paramType)
  {
    this.type = paramType;
    long l = System.currentTimeMillis();
    this.timestamp = l;
    this.details = null;
    this.customType = null;
    this.customAttributes = null;
    this.predefinedType = null;
    this.predefinedAttributes = null;
  }
  
  public SessionEvent build(SessionEventMetadata paramSessionEventMetadata)
  {
    SessionEvent localSessionEvent = new com/crashlytics/android/answers/SessionEvent;
    long l = this.timestamp;
    SessionEvent.Type localType = this.type;
    Map localMap1 = this.details;
    String str1 = this.customType;
    Map localMap2 = this.customAttributes;
    String str2 = this.predefinedType;
    Map localMap3 = this.predefinedAttributes;
    localSessionEvent.<init>(paramSessionEventMetadata, l, localType, localMap1, str1, localMap2, str2, localMap3, null);
    return localSessionEvent;
  }
  
  public Builder customAttributes(Map paramMap)
  {
    this.customAttributes = paramMap;
    return this;
  }
  
  public Builder customType(String paramString)
  {
    this.customType = paramString;
    return this;
  }
  
  public Builder details(Map paramMap)
  {
    this.details = paramMap;
    return this;
  }
  
  public Builder predefinedAttributes(Map paramMap)
  {
    this.predefinedAttributes = paramMap;
    return this;
  }
  
  public Builder predefinedType(String paramString)
  {
    this.predefinedType = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionEvent$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */