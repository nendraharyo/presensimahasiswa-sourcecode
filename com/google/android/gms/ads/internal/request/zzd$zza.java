package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhd;
import com.google.android.gms.internal.zzji;

public final class zzd$zza
  extends zzd
{
  private final Context mContext;
  
  public zzd$zza(Context paramContext, zzji paramzzji, zzc.zza paramzza)
  {
    super(paramzzji, paramzza);
    this.mContext = paramContext;
  }
  
  public void zzgr() {}
  
  public zzj zzgs()
  {
    zzbm localzzbm = new com/google/android/gms/internal/zzbm;
    Object localObject = (String)zzbt.zzvB.get();
    localzzbm.<init>((String)localObject);
    localObject = this.mContext;
    zzhc localzzhc = zzhc.zzgA();
    return zzhd.zza((Context)localObject, localzzbm, localzzhc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */