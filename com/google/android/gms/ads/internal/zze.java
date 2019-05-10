package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;

public class zze
{
  private boolean zzpA;
  private boolean zzpB;
  private zze.zza zzpz;
  
  public zze()
  {
    boolean bool = ((Boolean)zzbt.zzvI.get()).booleanValue();
    this.zzpB = bool;
  }
  
  public zze(boolean paramBoolean)
  {
    this.zzpB = paramBoolean;
  }
  
  public void recordClick()
  {
    this.zzpA = true;
  }
  
  public void zza(zze.zza paramzza)
  {
    this.zzpz = paramzza;
  }
  
  public boolean zzbh()
  {
    boolean bool = this.zzpB;
    if (bool)
    {
      bool = this.zzpA;
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void zzq(String paramString)
  {
    zzin.zzaI("Action was blocked because no click was detected.");
    zze.zza localzza = this.zzpz;
    if (localzza != null)
    {
      localzza = this.zzpz;
      localzza.zzr(paramString);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */