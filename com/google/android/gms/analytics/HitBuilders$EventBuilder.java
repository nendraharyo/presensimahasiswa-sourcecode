package com.google.android.gms.analytics;

public class HitBuilders$EventBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$EventBuilder()
  {
    set("&t", "event");
  }
  
  public HitBuilders$EventBuilder(String paramString1, String paramString2)
  {
    this();
    setCategory(paramString1);
    setAction(paramString2);
  }
  
  public EventBuilder setAction(String paramString)
  {
    set("&ea", paramString);
    return this;
  }
  
  public EventBuilder setCategory(String paramString)
  {
    set("&ec", paramString);
    return this;
  }
  
  public EventBuilder setLabel(String paramString)
  {
    set("&el", paramString);
    return this;
  }
  
  public EventBuilder setValue(long paramLong)
  {
    String str = Long.toString(paramLong);
    set("&ev", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$EventBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */