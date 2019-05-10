package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

public class zzqt
  implements zzqu.zza
{
  private final zzqu zzbdw;
  private boolean zzbdx;
  
  public zzqt(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null);
  }
  
  public zzqt(Context paramContext, int paramInt, String paramString)
  {
    this(paramContext, paramInt, paramString, null, true);
  }
  
  public zzqt(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = paramContext.getApplicationContext();
    if (paramContext != localObject) {
      localObject = paramContext.getClass();
    }
    for (String str = ((Class)localObject).getName();; str = "OneTimePlayLogger")
    {
      localObject = new com/google/android/gms/internal/zzqu;
      ((zzqu)localObject).<init>(paramContext, paramInt, paramString1, paramString2, this, paramBoolean, str);
      this.zzbdw = ((zzqu)localObject);
      this.zzbdx = true;
      return;
    }
  }
  
  private void zzER()
  {
    boolean bool = this.zzbdx;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot reuse one-time logger after sending.");
      throw localIllegalStateException;
    }
  }
  
  public void send()
  {
    zzER();
    this.zzbdw.start();
    this.zzbdx = false;
  }
  
  public void zzES()
  {
    this.zzbdw.stop();
  }
  
  public void zzET()
  {
    Log.w("OneTimePlayLogger", "logger connection failed");
  }
  
  public void zza(String paramString, byte[] paramArrayOfByte, String... paramVarArgs)
  {
    zzER();
    this.zzbdw.zzb(paramString, paramArrayOfByte, paramVarArgs);
  }
  
  public void zzc(PendingIntent paramPendingIntent)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "logger connection failed: " + paramPendingIntent;
    Log.w("OneTimePlayLogger", (String)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */