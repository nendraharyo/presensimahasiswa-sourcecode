package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

class zzli$zza$1
  implements zzo
{
  zzli$zza$1(zzli.zza paramzza, zzli paramzzli) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.zzacU;
        localObject2 = new com/google/android/gms/internal/zzli$zze;
        localStatus = new com/google/android/gms/common/api/Status;
        i = 0;
        str1 = null;
        str2 = null;
        localStatus.<init>(paramInt, null, null);
        i = 0;
        str1 = null;
        localJSONObject = null;
        l = paramLong;
        ((zzli.zze)localObject2).<init>(localStatus, null, paramLong, null);
        ((zzli.zza)localObject1).zza((Result)localObject2);
        return;
      }
      catch (ClassCastException localClassCastException)
      {
        Object localObject1;
        String str1;
        String str2;
        JSONObject localJSONObject;
        long l;
        zzli.zza localzza = this.zzacU;
        Object localObject2 = this.zzacU;
        Status localStatus = new com/google/android/gms/common/api/Status;
        int i = 13;
        localStatus.<init>(i);
        localObject2 = ((zzli.zza)localObject2).zzr(localStatus);
        localzza.zza((Result)localObject2);
        continue;
      }
      paramObject = (zzlk)paramObject;
      str1 = ((zzlk)paramObject).getPlayerId();
      if ((paramInt == 0) && (str1 != null))
      {
        localObject1 = this.zzacU;
        localObject1 = ((zzli.zza)localObject1).zzacN;
        zzli.zza((zzli)localObject1, str1);
      }
      localObject1 = this.zzacU;
      localObject2 = new com/google/android/gms/internal/zzli$zze;
      localStatus = new com/google/android/gms/common/api/Status;
      str2 = ((zzlk)paramObject).zznZ();
      localStatus.<init>(paramInt, str2, null);
      l = ((zzlk)paramObject).getRequestId();
      localJSONObject = ((zzlk)paramObject).getExtraMessageData();
      ((zzli.zze)localObject2).<init>(localStatus, str1, l, localJSONObject);
      ((zzli.zza)localObject1).zza((Result)localObject2);
    }
  }
  
  public void zzy(long paramLong)
  {
    zzli.zza localzza = this.zzacU;
    Object localObject = this.zzacU;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(2103);
    localObject = ((zzli.zza)localObject).zzr(localStatus);
    localzza.zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */