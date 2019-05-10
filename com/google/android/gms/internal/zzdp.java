package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzr;

public class zzdp
  extends zzim
{
  final zzjp zzpD;
  final zzdr zzzJ;
  private final String zzzK;
  
  zzdp(zzjp paramzzjp, zzdr paramzzdr, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzzJ = paramzzdr;
    this.zzzK = paramString;
    zzr.zzbR().zza(this);
  }
  
  public void onStop()
  {
    this.zzzJ.abort();
  }
  
  public void zzbr()
  {
    try
    {
      Object localObject1 = this.zzzJ;
      localObject3 = this.zzzK;
      ((zzdr)localObject1).zzU((String)localObject3);
      localObject1 = zzir.zzMc;
      localObject3 = new com/google/android/gms/internal/zzdp$1;
      ((zzdp.1)localObject3).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject3);
      return;
    }
    finally
    {
      Object localObject3 = zzir.zzMc;
      zzdp.1 local1 = new com/google/android/gms/internal/zzdp$1;
      local1.<init>(this);
      ((Handler)localObject3).post(local1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */