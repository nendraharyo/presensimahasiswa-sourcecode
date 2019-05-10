package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.internal.zzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

class zzh$zzc
  extends zzh.zzf
{
  private final ArrayList zzahH;
  
  public zzh$zzc(zzh paramzzh, ArrayList paramArrayList)
  {
    super(paramzzh, null);
    this.zzahH = paramArrayList;
  }
  
  public void zzpt()
  {
    Object localObject1 = zzh.zzd(this.zzahC).zzagW;
    Object localObject2 = zzh.zzg(this.zzahC);
    ((zzj)localObject1).zzahU = ((Set)localObject2);
    localObject1 = this.zzahH;
    localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Api.zzb)((Iterator)localObject2).next();
      zzp localzzp = zzh.zzh(this.zzahC);
      Set localSet = zzh.zzd(this.zzahC).zzagW.zzahU;
      ((Api.zzb)localObject1).zza(localzzp, localSet);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */