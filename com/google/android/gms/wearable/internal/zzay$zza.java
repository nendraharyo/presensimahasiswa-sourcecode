package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;

class zzay$zza
  extends zzbo.zzb
{
  private WeakReference zzbsM;
  private WeakReference zzbsN;
  
  zzay$zza(Map paramMap, Object paramObject, zza.zzb paramzzb)
  {
    super(paramzzb);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMap);
    this.zzbsM = localWeakReference;
    localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramObject);
    this.zzbsN = localWeakReference;
  }
  
  public void zza(Status paramStatus)
  {
    Map localMap = (Map)this.zzbsM.get();
    Object localObject1 = this.zzbsN.get();
    Status localStatus = paramStatus.getStatus();
    boolean bool = localStatus.isSuccess();
    if ((!bool) && (localMap != null) && (localObject1 != null)) {}
    try
    {
      localObject1 = localMap.remove(localObject1);
      localObject1 = (zzbq)localObject1;
      if (localObject1 != null) {
        ((zzbq)localObject1).clear();
      }
      zzX(paramStatus);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzay$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */