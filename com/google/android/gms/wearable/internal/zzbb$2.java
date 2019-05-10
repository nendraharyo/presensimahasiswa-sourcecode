package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.ArrayList;

class zzbb$2
  extends zzi
{
  zzbb$2(zzbb paramzzbb, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzt(this);
  }
  
  protected NodeApi.GetConnectedNodesResult zzbB(Status paramStatus)
  {
    zzbb.zza localzza = new com/google/android/gms/wearable/internal/zzbb$zza;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localzza.<init>(paramStatus, localArrayList);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */