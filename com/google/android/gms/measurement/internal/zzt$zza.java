package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.zzx;

public final class zzt$zza
{
  private final boolean zzaXy;
  private boolean zzaXz;
  private boolean zzagf;
  private final String zzvs;
  
  public zzt$zza(zzt paramzzt, String paramString, boolean paramBoolean)
  {
    zzx.zzcM(paramString);
    this.zzvs = paramString;
    this.zzaXy = paramBoolean;
  }
  
  private void zzCR()
  {
    boolean bool1 = this.zzaXz;
    if (bool1) {}
    for (;;)
    {
      return;
      this.zzaXz = true;
      SharedPreferences localSharedPreferences = zzt.zza(this.zzaXA);
      String str = this.zzvs;
      boolean bool2 = this.zzaXy;
      bool1 = localSharedPreferences.getBoolean(str, bool2);
      this.zzagf = bool1;
    }
  }
  
  public boolean get()
  {
    zzCR();
    return this.zzagf;
  }
  
  public void set(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = zzt.zza(this.zzaXA).edit();
    String str = this.zzvs;
    localEditor.putBoolean(str, paramBoolean);
    localEditor.apply();
    this.zzagf = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzt$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */