package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzc
  extends zzak
{
  private static final String ID = zzad.zzbs.toString();
  private final zza zzbhC;
  
  public zzc(Context paramContext)
  {
    this(localzza);
  }
  
  zzc(zza paramzza)
  {
    super(str, arrayOfString);
    this.zzbhC = paramzza;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    zza localzza = this.zzbhC;
    boolean bool = localzza.isLimitAdTrackingEnabled();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return zzdf.zzR(Boolean.valueOf(bool));
      bool = false;
      localzza = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */