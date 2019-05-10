package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.signin.internal.zzb;
import java.lang.ref.WeakReference;

class zzh$zzd
  extends zzb
{
  private final WeakReference zzahD;
  
  zzh$zzd(zzh paramzzh)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzzh);
    this.zzahD = localWeakReference;
  }
  
  public void zzb(SignInResponse paramSignInResponse)
  {
    zzh localzzh = (zzh)this.zzahD.get();
    if (localzzh == null) {}
    for (;;)
    {
      return;
      zzl localzzl = zzh.zzd(localzzh);
      zzh.zzd.1 local1 = new com/google/android/gms/common/api/internal/zzh$zzd$1;
      local1.<init>(this, localzzh, localzzh, paramSignInResponse);
      localzzl.zza(local1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */