package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

public class zzm$zza
{
  private final String zzXI;
  private final long zzXJ;
  private final zzmq zzqW;
  
  public zzm$zza(String paramString, long paramLong)
  {
    this(paramString, paramLong, localzzmq);
  }
  
  private zzm$zza(String paramString, long paramLong, zzmq paramzzmq)
  {
    Object localObject = zzx.zzcM(paramString);
    this.zzXI = ((String)localObject);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzac(bool);
      this.zzXJ = paramLong;
      localObject = (zzmq)zzx.zzz(paramzzmq);
      this.zzqW = ((zzmq)localObject);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean zzb()
  {
    zzmq localzzmq = this.zzqW;
    long l1 = localzzmq.currentTimeMillis() / 1000L;
    long l2 = this.zzXJ;
    long l3 = 300L;
    l2 -= l3;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzmq = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */