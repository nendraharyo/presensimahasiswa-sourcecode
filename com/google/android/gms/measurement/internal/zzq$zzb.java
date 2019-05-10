package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;

class zzq$zzb
  implements Runnable
{
  private final int zzBc;
  private final String zzTJ;
  private final zzq.zza zzaWP;
  private final Throwable zzaWQ;
  private final byte[] zzaWR;
  
  private zzq$zzb(String paramString, zzq.zza paramzza, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    zzx.zzz(paramzza);
    this.zzaWP = paramzza;
    this.zzBc = paramInt;
    this.zzaWQ = paramThrowable;
    this.zzaWR = paramArrayOfByte;
    this.zzTJ = paramString;
  }
  
  public void run()
  {
    zzq.zza localzza = this.zzaWP;
    String str = this.zzTJ;
    int i = this.zzBc;
    Throwable localThrowable = this.zzaWQ;
    byte[] arrayOfByte = this.zzaWR;
    localzza.zza(str, i, localThrowable, arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzq$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */