package com.crashlytics.android.answers;

public class SearchEvent
  extends PredefinedEvent
{
  static final String QUERY_ATTRIBUTE = "query";
  static final String TYPE = "search";
  
  String getPredefinedType()
  {
    return "search";
  }
  
  public SearchEvent putQuery(String paramString)
  {
    this.predefinedAttributes.put("query", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SearchEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */