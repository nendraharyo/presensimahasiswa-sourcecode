package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzrs.zze;
import java.util.Collection;
import java.util.List;
import java.util.Set;

class zzcp$4
  implements zzcp.zza
{
  zzcp$4(zzcp paramzzcp) {}
  
  public void zza(zzrs.zze paramzze, Set paramSet1, Set paramSet2, zzck paramzzck)
  {
    Object localObject = paramzze.zzHR();
    paramSet1.addAll((Collection)localObject);
    localObject = paramzze.zzHS();
    paramSet2.addAll((Collection)localObject);
    localObject = paramzzck.zzGL();
    List localList1 = paramzze.zzHR();
    List localList2 = paramzze.zzHW();
    ((zzci)localObject).zzc(localList1, localList2);
    localObject = paramzzck.zzGM();
    localList1 = paramzze.zzHS();
    localList2 = paramzze.zzHX();
    ((zzci)localObject).zzc(localList1, localList2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcp$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */