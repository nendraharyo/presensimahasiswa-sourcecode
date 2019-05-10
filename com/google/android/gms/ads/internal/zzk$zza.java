package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzir;

class zzk$zza
  extends zzim
{
  private final String zzqg;
  
  public zzk$zza(zzk paramzzk, String paramString)
  {
    this.zzqg = paramString;
  }
  
  public void onStop() {}
  
  public void zzbr()
  {
    zzir localzzir = zzr.zzbC();
    Context localContext = this.zzqh.zzpj.context;
    String str = this.zzqg;
    localzzir.zzg(localContext, str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */