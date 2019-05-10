package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzv
  extends zzak
{
  private static final String ID = zzad.zzbz.toString();
  private static final String NAME = zzae.zzgo.toString();
  private static final String zzbiA = zzae.zzeY.toString();
  private final DataLayer zzbhN;
  
  public zzv(DataLayer paramDataLayer)
  {
    super(str1, arrayOfString);
    this.zzbhN = paramDataLayer;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    DataLayer localDataLayer = this.zzbhN;
    Object localObject = NAME;
    localObject = zzdf.zzg((zzag.zza)paramMap.get(localObject));
    localObject = localDataLayer.get((String)localObject);
    if (localObject == null)
    {
      localObject = zzbiA;
      localObject = (zzag.zza)paramMap.get(localObject);
      if (localObject == null) {}
    }
    for (;;)
    {
      return (zzag.zza)localObject;
      localObject = zzdf.zzHF();
      continue;
      localObject = zzdf.zzR(localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */