package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;

public final class LaunchOptions$Builder
{
  private LaunchOptions zzaaM;
  
  public LaunchOptions$Builder()
  {
    LaunchOptions localLaunchOptions = new com/google/android/gms/cast/LaunchOptions;
    localLaunchOptions.<init>();
    this.zzaaM = localLaunchOptions;
  }
  
  public LaunchOptions build()
  {
    return this.zzaaM;
  }
  
  public Builder setLocale(Locale paramLocale)
  {
    LaunchOptions localLaunchOptions = this.zzaaM;
    String str = zzf.zzb(paramLocale);
    localLaunchOptions.setLanguage(str);
    return this;
  }
  
  public Builder setRelaunchIfRunning(boolean paramBoolean)
  {
    this.zzaaM.setRelaunchIfRunning(paramBoolean);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\LaunchOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */