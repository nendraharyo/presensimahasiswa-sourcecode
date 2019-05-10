package com.google.android.gms.auth;

import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;
import java.util.List;

final class zzd$3
  implements zzd.zza
{
  zzd$3(String paramString, int paramInt) {}
  
  public List zzap(IBinder paramIBinder)
  {
    zzas localzzas = zzas.zza.zza(paramIBinder);
    AccountChangeEventsRequest localAccountChangeEventsRequest = new com/google/android/gms/auth/AccountChangeEventsRequest;
    localAccountChangeEventsRequest.<init>();
    String str = this.zzVl;
    localAccountChangeEventsRequest = localAccountChangeEventsRequest.setAccountName(str);
    int i = this.zzVm;
    localAccountChangeEventsRequest = localAccountChangeEventsRequest.setEventIndex(i);
    return ((AccountChangeEventsResponse)zzd.zzn(localzzas.zza(localAccountChangeEventsRequest))).getEvents();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zzd$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */