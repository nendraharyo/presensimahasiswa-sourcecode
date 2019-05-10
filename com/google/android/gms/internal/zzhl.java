package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public abstract class zzhl
{
  public abstract void zza(Context paramContext, zzhf paramzzhf, VersionInfoParcel paramVersionInfoParcel);
  
  protected void zze(zzhf paramzzhf)
  {
    paramzzhf.zzgD();
    zzeg.zzd localzzd = paramzzhf.zzgB();
    if (localzzd != null)
    {
      localzzd = paramzzhf.zzgB();
      localzzd.release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */