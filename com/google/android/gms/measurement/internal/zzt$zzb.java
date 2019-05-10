package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.zzx;

public final class zzt$zzb
{
  private long zzaDV;
  private final long zzaXB;
  private boolean zzaXz;
  private final String zzvs;
  
  public zzt$zzb(zzt paramzzt, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    this.zzvs = paramString;
    this.zzaXB = paramLong;
  }
  
  private void zzCR()
  {
    boolean bool = this.zzaXz;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.zzaXz = bool;
      SharedPreferences localSharedPreferences = zzt.zza(this.zzaXA);
      String str = this.zzvs;
      long l1 = this.zzaXB;
      long l2 = localSharedPreferences.getLong(str, l1);
      this.zzaDV = l2;
    }
  }
  
  public long get()
  {
    zzCR();
    return this.zzaDV;
  }
  
  public void set(long paramLong)
  {
    SharedPreferences.Editor localEditor = zzt.zza(this.zzaXA).edit();
    String str = this.zzvs;
    localEditor.putLong(str, paramLong);
    localEditor.apply();
    this.zzaDV = paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzt$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */