package com.google.android.gms.internal;

import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

class zzlr$1
  extends zzlu.zza
{
  zzlr$1(zzlr paramzzlr, zzlu paramzzlu) {}
  
  public void zzbp(int paramInt)
  {
    Object localObject1 = zzlr.zzoC();
    Object localObject2 = "onRemoteDisplayEnded";
    Object[] arrayOfObject = new Object[0];
    ((zzl)localObject1).zzb((String)localObject2, arrayOfObject);
    localObject1 = this.zzaeM;
    if (localObject1 != null)
    {
      localObject1 = this.zzaeM;
      ((zzlu)localObject1).zzbp(paramInt);
    }
    localObject1 = zzlr.zzb(this.zzaeN);
    if (localObject1 != null)
    {
      localObject1 = zzlr.zzb(this.zzaeN);
      localObject2 = new com/google/android/gms/common/api/Status;
      ((Status)localObject2).<init>(paramInt);
      ((CastRemoteDisplay.CastRemoteDisplaySessionCallbacks)localObject1).onRemoteDisplayEnded((Status)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlr$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */