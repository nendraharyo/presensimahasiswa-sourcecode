package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

final class zzbq$9
  implements zzq.zzb
{
  zzbq$9(CapabilityInfoParcelable paramCapabilityInfoParcelable) {}
  
  public void zza(CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    CapabilityInfoParcelable localCapabilityInfoParcelable = this.zzbtx;
    paramCapabilityListener.onCapabilityChanged(localCapabilityInfoParcelable);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbq$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */