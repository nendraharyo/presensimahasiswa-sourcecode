package com.crashlytics.android.answers;

public class LevelStartEvent
  extends PredefinedEvent
{
  static final String LEVEL_NAME_ATTRIBUTE = "levelName";
  static final String TYPE = "levelStart";
  
  String getPredefinedType()
  {
    return "levelStart";
  }
  
  public LevelStartEvent putLevelName(String paramString)
  {
    this.predefinedAttributes.put("levelName", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\LevelStartEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */