package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

final class zzbo$zzq
  extends zzbo.zzb
{
  private final List zzzM;
  
  zzbo$zzq(zza.zzb paramzzb, List paramList)
  {
    super(paramzzb);
    this.zzzM = paramList;
  }
  
  public void zza(PutDataResponse paramPutDataResponse)
  {
    Object localObject1 = new com/google/android/gms/wearable/internal/zzx$zza;
    int i = paramPutDataResponse.statusCode;
    Object localObject2 = zzbk.zzgc(i);
    DataItemParcelable localDataItemParcelable = paramPutDataResponse.zzbsJ;
    ((zzx.zza)localObject1).<init>((Status)localObject2, localDataItemParcelable);
    zzX(localObject1);
    int j = paramPutDataResponse.statusCode;
    if (j != 0)
    {
      localObject1 = this.zzzM;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (FutureTask)((Iterator)localObject2).next();
        boolean bool2 = true;
        ((FutureTask)localObject1).cancel(bool2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */