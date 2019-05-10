package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

class zzeg$1
  implements Runnable
{
  zzeg$1(zzeg paramzzeg, zzeg.zze paramzze) {}
  
  public void run()
  {
    Object localObject1 = this.zzBe;
    Object localObject2 = zzeg.zza(this.zzBe);
    Object localObject3 = zzeg.zzb(this.zzBe);
    localObject1 = ((zzeg)localObject1).zza((Context)localObject2, (VersionInfoParcel)localObject3);
    localObject2 = new com/google/android/gms/internal/zzeg$1$1;
    ((zzeg.1.1)localObject2).<init>(this, (zzed)localObject1);
    ((zzed)localObject1).zza((zzed.zza)localObject2);
    localObject3 = new com/google/android/gms/internal/zzeg$1$2;
    ((zzeg.1.2)localObject3).<init>(this, (zzed)localObject1);
    ((zzed)localObject1).zza("/jsLoaded", (zzdf)localObject3);
    localObject2 = new com/google/android/gms/internal/zzja;
    ((zzja)localObject2).<init>();
    localObject3 = new com/google/android/gms/internal/zzeg$1$3;
    ((zzeg.1.3)localObject3).<init>(this, (zzed)localObject1, (zzja)localObject2);
    ((zzja)localObject2).set(localObject3);
    ((zzed)localObject1).zza("/requestReload", (zzdf)localObject3);
    localObject2 = zzeg.zzf(this.zzBe);
    localObject3 = ".js";
    boolean bool = ((String)localObject2).endsWith((String)localObject3);
    if (bool)
    {
      localObject2 = zzeg.zzf(this.zzBe);
      ((zzed)localObject1).zzZ((String)localObject2);
    }
    for (;;)
    {
      localObject2 = zzir.zzMc;
      localObject3 = new com/google/android/gms/internal/zzeg$1$4;
      ((zzeg.1.4)localObject3).<init>(this, (zzed)localObject1);
      long l = zzeg.zza.zzBm;
      ((Handler)localObject2).postDelayed((Runnable)localObject3, l);
      return;
      localObject2 = zzeg.zzf(this.zzBe);
      localObject3 = "<html>";
      bool = ((String)localObject2).startsWith((String)localObject3);
      if (bool)
      {
        localObject2 = zzeg.zzf(this.zzBe);
        ((zzed)localObject1).zzab((String)localObject2);
      }
      else
      {
        localObject2 = zzeg.zzf(this.zzBe);
        ((zzed)localObject1).zzaa((String)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */