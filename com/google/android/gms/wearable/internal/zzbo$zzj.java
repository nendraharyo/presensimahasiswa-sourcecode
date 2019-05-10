package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class zzbo$zzj
  extends zzbo.zzb
{
  public zzbo$zzj(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetConnectedNodesResponse paramGetConnectedNodesResponse)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = paramGetConnectedNodesResponse.zzbsI;
    localArrayList.addAll((Collection)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzbb$zza;
    Status localStatus = zzbk.zzgc(paramGetConnectedNodesResponse.statusCode);
    ((zzbb.zza)localObject).<init>(localStatus, localArrayList);
    zzX(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */