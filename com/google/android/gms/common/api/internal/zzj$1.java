package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.zza;
import java.util.Set;

class zzj$1
  implements zzj.zzd
{
  zzj$1(zzj paramzzj) {}
  
  public void zzc(zzj.zze paramzze)
  {
    this.zzaid.zzahW.remove(paramzze);
    Object localObject = paramzze.zzpa();
    if (localObject != null)
    {
      localObject = zzj.zza(this.zzaid);
      if (localObject != null)
      {
        localObject = zzj.zza(this.zzaid);
        Integer localInteger = paramzze.zzpa();
        int i = localInteger.intValue();
        ((zza)localObject).remove(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */