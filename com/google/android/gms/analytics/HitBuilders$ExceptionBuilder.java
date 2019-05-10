package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzam;

public class HitBuilders$ExceptionBuilder
  extends HitBuilders.HitBuilder
{
  public HitBuilders$ExceptionBuilder()
  {
    set("&t", "exception");
  }
  
  public ExceptionBuilder setDescription(String paramString)
  {
    set("&exd", paramString);
    return this;
  }
  
  public ExceptionBuilder setFatal(boolean paramBoolean)
  {
    String str = zzam.zzK(paramBoolean);
    set("&exf", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$ExceptionBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */