package com.google.android.gms.analytics;

public class HitBuilders$SocialBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$SocialBuilder()
  {
    set("&t", "social");
  }
  
  public SocialBuilder setAction(String paramString)
  {
    set("&sa", paramString);
    return this;
  }
  
  public SocialBuilder setNetwork(String paramString)
  {
    set("&sn", paramString);
    return this;
  }
  
  public SocialBuilder setTarget(String paramString)
  {
    set("&st", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$SocialBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */