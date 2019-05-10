package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzcc
  extends zzce.zza
{
  private final zzg zzxE;
  private final String zzxF;
  private final String zzxG;
  
  public zzcc(zzg paramzzg, String paramString1, String paramString2)
  {
    this.zzxE = paramzzg;
    this.zzxF = paramString1;
    this.zzxG = paramString2;
  }
  
  public String getContent()
  {
    return this.zzxG;
  }
  
  public void recordClick()
  {
    this.zzxE.zzbd();
  }
  
  public void recordImpression()
  {
    this.zzxE.zzbe();
  }
  
  public void zzb(zzd paramzzd)
  {
    if (paramzzd == null) {}
    for (;;)
    {
      return;
      zzg localzzg = this.zzxE;
      View localView = (View)zze.zzp(paramzzd);
      localzzg.zzc(localView);
    }
  }
  
  public String zzdF()
  {
    return this.zzxF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */