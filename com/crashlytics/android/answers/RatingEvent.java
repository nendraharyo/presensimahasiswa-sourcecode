package com.crashlytics.android.answers;

public class RatingEvent
  extends PredefinedEvent
{
  static final String CONTENT_ID_ATTRIBUTE = "contentId";
  static final String CONTENT_NAME_ATTRIBUTE = "contentName";
  static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
  static final String RATING_ATTRIBUTE = "rating";
  static final String TYPE = "rating";
  
  String getPredefinedType()
  {
    return "rating";
  }
  
  public RatingEvent putContentId(String paramString)
  {
    this.predefinedAttributes.put("contentId", paramString);
    return this;
  }
  
  public RatingEvent putContentName(String paramString)
  {
    this.predefinedAttributes.put("contentName", paramString);
    return this;
  }
  
  public RatingEvent putContentType(String paramString)
  {
    this.predefinedAttributes.put("contentType", paramString);
    return this;
  }
  
  public RatingEvent putRating(int paramInt)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    Integer localInteger = Integer.valueOf(paramInt);
    localAnswersAttributes.put("rating", localInteger);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\RatingEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */