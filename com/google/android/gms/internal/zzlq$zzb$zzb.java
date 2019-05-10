package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

public final class zzlq$zzb$zzb
  extends zzlq.zza
{
  protected zzlq$zzb$zzb(zzlq.zzb paramzzb)
  {
    super(localzzlq, null);
  }
  
  public void onDisconnected()
  {
    Object localObject1 = zzlq.zzoC();
    Object localObject2 = new Object[0];
    ((zzl)localObject1).zzb("onDisconnected", (Object[])localObject2);
    zzlq.zza(this.zzaeK.zzaeH);
    localObject1 = this.zzaeK;
    zzlq.zzc localzzc = new com/google/android/gms/internal/zzlq$zzc;
    localObject2 = Status.zzagC;
    localzzc.<init>((Status)localObject2);
    ((zzlq.zzb)localObject1).zza(localzzc);
  }
  
  public void onError(int paramInt)
  {
    Object localObject1 = zzlq.zzoC();
    Object localObject2 = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    localObject2[0] = localInteger;
    ((zzl)localObject1).zzb("onError: %d", (Object[])localObject2);
    zzlq.zza(this.zzaeK.zzaeH);
    localObject1 = this.zzaeK;
    zzlq.zzc localzzc = new com/google/android/gms/internal/zzlq$zzc;
    localObject2 = Status.zzagE;
    localzzc.<init>((Status)localObject2);
    ((zzlq.zzb)localObject1).zza(localzzc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlq$zzb$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */