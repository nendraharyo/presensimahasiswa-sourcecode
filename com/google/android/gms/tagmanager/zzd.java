package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

class zzd
  implements DataLayer.zzb
{
  private final Context context;
  
  public zzd(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public void zzQ(Map paramMap)
  {
    Object localObject1 = "gtm.url";
    Object localObject2 = paramMap.get(localObject1);
    if (localObject2 == null)
    {
      localObject1 = paramMap.get("gtm");
      if (localObject1 != null)
      {
        boolean bool1 = localObject1 instanceof Map;
        if (bool1)
        {
          localObject1 = (Map)localObject1;
          localObject2 = "url";
        }
      }
    }
    for (localObject1 = ((Map)localObject1).get(localObject2);; localObject1 = localObject2)
    {
      if (localObject1 != null)
      {
        boolean bool2 = localObject1 instanceof String;
        if (bool2) {
          break label71;
        }
      }
      for (;;)
      {
        return;
        label71:
        localObject1 = Uri.parse((String)localObject1);
        localObject2 = "referrer";
        localObject1 = ((Uri)localObject1).getQueryParameter((String)localObject2);
        if (localObject1 != null)
        {
          localObject2 = this.context;
          zzax.zzn((Context)localObject2, (String)localObject1);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */