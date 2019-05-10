package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

class zzli$zzc$1
  implements zzo
{
  zzli$zzc$1(zzli.zzc paramzzc, zzli paramzzli) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.zzacW;
        localObject2 = new com/google/android/gms/internal/zzli$zzd;
        localObject3 = new com/google/android/gms/common/api/Status;
        i = 0;
        localObject4 = null;
        j = 0;
        ((Status)localObject3).<init>(paramInt, null, null);
        localObject4 = this.zzacW;
        localObject4 = zzli.zzc.zza((zzli.zzc)localObject4);
        ((zzli.zzd)localObject2).<init>((Status)localObject3, (GameManagerClient)localObject4);
        ((zzli.zzc)localObject1).zza((Result)localObject2);
        return;
      }
      catch (ClassCastException localClassCastException)
      {
        Object localObject1;
        boolean bool;
        Locale localLocale;
        String str1;
        int k;
        Object[] arrayOfObject;
        String str2;
        int m;
        zzli.zzc localzzc = this.zzacW;
        Object localObject2 = this.zzacW;
        Object localObject3 = new com/google/android/gms/common/api/Status;
        int i = 13;
        ((Status)localObject3).<init>(i);
        localObject2 = ((zzli.zzc)localObject2).zzs((Status)localObject3);
        localzzc.zza((Result)localObject2);
        continue;
        localzzc = this.zzacW;
        localObject2 = new com/google/android/gms/internal/zzli$zzd;
        localObject3 = new com/google/android/gms/common/api/Status;
        Object localObject4 = ((zzlk)paramObject).zznZ();
        int j = 0;
        ((Status)localObject3).<init>(paramInt, (String)localObject4, null);
        localObject4 = this.zzacW;
        localObject4 = zzli.zzc.zza((zzli.zzc)localObject4);
        ((zzli.zzd)localObject2).<init>((Status)localObject3, (GameManagerClient)localObject4);
        localzzc.zza((Result)localObject2);
        continue;
      }
      paramObject = (zzlk)paramObject;
      localObject1 = ((zzlk)paramObject).zzod();
      if (localObject1 == null) {
        continue;
      }
      localObject2 = "1.0.0";
      localObject3 = ((zzlj)localObject1).getVersion();
      bool = zzf.zza(localObject2, localObject3);
      if (bool) {
        continue;
      }
      localObject2 = this.zzacW;
      localObject3 = this.zzacW;
      localObject4 = new com/google/android/gms/common/api/Status;
      j = 2150;
      localLocale = Locale.ROOT;
      str1 = "Incorrect Game Manager SDK version. Receiver: %s Sender: %s";
      k = 2;
      arrayOfObject = new Object[k];
      str2 = null;
      localObject1 = ((zzlj)localObject1).getVersion();
      arrayOfObject[0] = localObject1;
      m = 1;
      str2 = "1.0.0";
      arrayOfObject[m] = str2;
      localObject1 = String.format(localLocale, str1, arrayOfObject);
      ((Status)localObject4).<init>(j, (String)localObject1);
      localObject1 = ((zzli.zzc)localObject3).zzs((Status)localObject4);
      ((zzli.zzc)localObject2).zza((Result)localObject1);
      localObject1 = this.zzacW;
      localObject1 = ((zzli.zzc)localObject1).zzacN;
      bool = false;
      localObject2 = null;
      zzli.zza((zzli)localObject1, null);
    }
  }
  
  public void zzy(long paramLong)
  {
    zzli.zzc localzzc = this.zzacW;
    Object localObject = this.zzacW;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(2103);
    localObject = ((zzli.zzc)localObject).zzs(localStatus);
    localzzc.zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */