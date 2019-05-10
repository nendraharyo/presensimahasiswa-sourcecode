package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaw
  extends zzak
{
  private static final String ID = zzad.zzcc.toString();
  private static final String zzbhD = zzae.zzex.toString();
  private final Context context;
  
  public zzaw(Context paramContext)
  {
    super(str, arrayOfString);
    this.context = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = zzbhD;
    localObject = (zzag.zza)paramMap.get(localObject);
    if (localObject != null)
    {
      localObject = zzbhD;
      localObject = zzdf.zzg((zzag.zza)paramMap.get(localObject));
      Context localContext = this.context;
      localObject = zzax.zzm(localContext, (String)localObject);
      if (localObject == null) {
        break label64;
      }
    }
    label64:
    for (localObject = zzdf.zzR(localObject);; localObject = zzdf.zzHF())
    {
      return (zzag.zza)localObject;
      localObject = null;
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzaw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */