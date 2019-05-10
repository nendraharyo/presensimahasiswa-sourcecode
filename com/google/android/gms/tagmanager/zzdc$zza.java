package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

class zzdc$zza
  implements Logger
{
  private static int zzkn(int paramInt)
  {
    int i = 3;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i;
      i = 2;
      continue;
      i = 1;
      continue;
      i = 0;
    }
  }
  
  public void error(Exception paramException)
  {
    zzbg.zzb("", paramException);
  }
  
  public void error(String paramString)
  {
    zzbg.e(paramString);
  }
  
  public int getLogLevel()
  {
    return zzkn(zzbg.getLogLevel());
  }
  
  public void info(String paramString)
  {
    zzbg.zzaJ(paramString);
  }
  
  public void setLogLevel(int paramInt)
  {
    zzbg.zzaK("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
  }
  
  public void verbose(String paramString)
  {
    zzbg.v(paramString);
  }
  
  public void warn(String paramString)
  {
    zzbg.zzaK(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */