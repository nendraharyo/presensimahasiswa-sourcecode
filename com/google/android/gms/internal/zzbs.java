package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.util.concurrent.Callable;

public class zzbs
{
  private final Object zzpV;
  private boolean zzqA;
  private SharedPreferences zzvx;
  
  public zzbs()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzqA = false;
    this.zzvx = null;
  }
  
  public void initialize(Context paramContext)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        bool = this.zzqA;
        if (bool) {
          return;
        }
        Context localContext1 = zze.getRemoteContext(paramContext);
        if (localContext1 != null) {}
      }
      zzbr localzzbr = zzr.zzbJ();
      SharedPreferences localSharedPreferences = localzzbr.zzw(localContext2);
      this.zzvx = localSharedPreferences;
      boolean bool = true;
      this.zzqA = bool;
    }
  }
  
  public Object zzd(zzbp paramzzbp)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzqA;
      if (!bool)
      {
        localObject2 = paramzzbp.zzdq();
        return localObject2;
      }
      Object localObject2 = new com/google/android/gms/internal/zzbs$1;
      ((zzbs.1)localObject2).<init>(this, paramzzbp);
      localObject2 = zzjb.zzb((Callable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */