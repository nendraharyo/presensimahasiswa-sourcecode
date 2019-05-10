package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public class zzgp
  extends zzgn
{
  private zzgo zzGs;
  
  zzgp(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }
  
  protected void zzgb()
  {
    Object localObject = this.zzpD.zzaN();
    boolean bool = ((AdSizeParcel)localObject).zzui;
    int i;
    if (bool)
    {
      localObject = this.mContext.getResources().getDisplayMetrics();
      i = ((DisplayMetrics)localObject).widthPixels;
    }
    for (int j = ((DisplayMetrics)localObject).heightPixels;; j = ((AdSizeParcel)localObject).heightPixels)
    {
      zzgo localzzgo = new com/google/android/gms/internal/zzgo;
      zzjp localzzjp = this.zzpD;
      localzzgo.<init>(this, localzzjp, i, j);
      this.zzGs = localzzgo;
      this.zzpD.zzhU().zza(this);
      localObject = this.zzGs;
      AdResponseParcel localAdResponseParcel = this.zzGe;
      ((zzgo)localObject).zza(localAdResponseParcel);
      return;
      i = ((AdSizeParcel)localObject).widthPixels;
    }
  }
  
  protected int zzgc()
  {
    Object localObject = this.zzGs;
    boolean bool1 = ((zzgo)localObject).zzgg();
    int i;
    if (bool1)
    {
      localObject = "Ad-Network indicated no fill with passback URL.";
      zzin.zzaI((String)localObject);
      i = 3;
    }
    for (;;)
    {
      return i;
      localObject = this.zzGs;
      boolean bool2 = ((zzgo)localObject).zzgh();
      int j;
      if (!bool2) {
        j = 2;
      } else {
        j = -2;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */