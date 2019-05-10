package com.crashlytics.android.answers;

public class LevelEndEvent
  extends PredefinedEvent
{
  static final String LEVEL_NAME_ATTRIBUTE = "levelName";
  static final String SCORE_ATTRIBUTE = "score";
  static final String SUCCESS_ATTRIBUTE = "success";
  static final String TYPE = "levelEnd";
  
  String getPredefinedType()
  {
    return "levelEnd";
  }
  
  public LevelEndEvent putLevelName(String paramString)
  {
    this.predefinedAttributes.put("levelName", paramString);
    return this;
  }
  
  public LevelEndEvent putScore(Number paramNumber)
  {
    this.predefinedAttributes.put("score", paramNumber);
    return this;
  }
  
  public LevelEndEvent putSuccess(boolean paramBoolean)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    String str1 = "success";
    if (paramBoolean) {}
    for (String str2 = "true";; str2 = "false")
    {
      localAnswersAttributes.put(str1, str2);
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\LevelEndEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */