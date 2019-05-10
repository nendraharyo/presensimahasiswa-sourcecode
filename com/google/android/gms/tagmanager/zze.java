package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zze
  extends zzak
{
  private static final String ID = zzad.zzbX.toString();
  private static final String zzbhD = zzae.zzex.toString();
  private static final String zzbhE = zzae.zzeA.toString();
  private final Context context;
  
  public zze(Context paramContext)
  {
    super(str1, arrayOfString);
    this.context = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = zzbhE;
    localObject = (zzag.zza)paramMap.get(localObject);
    if (localObject == null) {
      localObject = zzdf.zzHF();
    }
    for (;;)
    {
      return (zzag.zza)localObject;
      String str = zzdf.zzg((zzag.zza)localObject);
      localObject = zzbhD;
      localObject = (zzag.zza)paramMap.get(localObject);
      if (localObject != null) {}
      for (localObject = zzdf.zzg((zzag.zza)localObject);; localObject = null)
      {
        Context localContext = this.context;
        localObject = zzax.zzf(localContext, str, (String)localObject);
        if (localObject == null) {
          break label85;
        }
        localObject = zzdf.zzR(localObject);
        break;
      }
      label85:
      localObject = zzdf.zzHF();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */