package com.google.android.gms.analytics;

public class HitBuilders$TimingBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$TimingBuilder()
  {
    set("&t", "timing");
  }
  
  public HitBuilders$TimingBuilder(String paramString1, String paramString2, long paramLong)
  {
    this();
    setVariable(paramString2);
    setValue(paramLong);
    setCategory(paramString1);
  }
  
  public TimingBuilder setCategory(String paramString)
  {
    set("&utc", paramString);
    return this;
  }
  
  public TimingBuilder setLabel(String paramString)
  {
    set("&utl", paramString);
    return this;
  }
  
  public TimingBuilder setValue(long paramLong)
  {
    String str = Long.toString(paramLong);
    set("&utt", str);
    return this;
  }
  
  public TimingBuilder setVariable(String paramString)
  {
    set("&utv", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$TimingBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */