package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzne;

public abstract class zzj
{
  public abstract zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz);
  
  protected boolean zzx(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    boolean bool = zzne.zzsg();
    int j;
    if (bool) {
      if (localApplicationInfo != null)
      {
        j = localApplicationInfo.targetSdkVersion;
        int i = 11;
        if (j < i) {}
      }
      else
      {
        j = 1;
      }
    }
    for (;;)
    {
      return j;
      int k = 0;
      localApplicationInfo = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */