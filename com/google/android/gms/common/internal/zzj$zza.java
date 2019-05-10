package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class zzj$zza
  extends zzj.zzc
{
  public final int statusCode;
  public final Bundle zzalK;
  
  protected zzj$zza(zzj paramzzj, int paramInt, Bundle paramBundle)
  {
    super(paramzzj, localBoolean);
    this.statusCode = paramInt;
    this.zzalK = paramBundle;
  }
  
  protected void zzc(Boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2;
    if (paramBoolean == null)
    {
      localObject2 = this.zzalL;
      zzj.zza((zzj)localObject2, i, null);
    }
    for (;;)
    {
      return;
      int j = this.statusCode;
      switch (j)
      {
      default: 
        zzj.zza(this.zzalL, i, null);
        localObject2 = this.zzalK;
        if (localObject2 != null)
        {
          localObject1 = this.zzalK;
          localObject2 = "pendingIntent";
          localObject1 = (PendingIntent)((Bundle)localObject1).getParcelable((String)localObject2);
        }
        localObject2 = new com/google/android/gms/common/ConnectionResult;
        i = this.statusCode;
        ((ConnectionResult)localObject2).<init>(i, (PendingIntent)localObject1);
        zzj((ConnectionResult)localObject2);
        break;
      case 0: 
        boolean bool = zzqL();
        if (!bool)
        {
          zzj.zza(this.zzalL, i, null);
          localObject2 = new com/google/android/gms/common/ConnectionResult;
          i = 8;
          ((ConnectionResult)localObject2).<init>(i, null);
          zzj((ConnectionResult)localObject2);
        }
        break;
      }
    }
    zzj.zza(this.zzalL, i, null);
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("A fatal developer error has occurred. Check the logs for further information.");
    throw ((Throwable)localObject1);
  }
  
  protected abstract void zzj(ConnectionResult paramConnectionResult);
  
  protected abstract boolean zzqL();
  
  protected void zzqM() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */