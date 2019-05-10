package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

class zzs
  implements Logger
{
  private boolean zzPk;
  private int zzRB = 2;
  
  public void error(Exception paramException) {}
  
  public void error(String paramString) {}
  
  public int getLogLevel()
  {
    return this.zzRB;
  }
  
  public void info(String paramString) {}
  
  public void setLogLevel(int paramInt)
  {
    this.zzRB = paramInt;
    boolean bool = this.zzPk;
    if (!bool)
    {
      String str = (String)zzy.zzRL.get();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = ((StringBuilder)localObject1).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
      localObject1 = (String)zzy.zzRL.get();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = " DEBUG";
      localObject1 = (String)localObject2;
      Log.i(str, (String)localObject1);
      bool = true;
      this.zzPk = bool;
    }
  }
  
  public void verbose(String paramString) {}
  
  public void warn(String paramString) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */