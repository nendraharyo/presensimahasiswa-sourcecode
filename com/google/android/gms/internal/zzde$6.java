package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

final class zzde$6
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    localObject1 = (String)paramMap.get("u");
    if (localObject1 == null)
    {
      localObject1 = "URL missing from click GMSG.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = Uri.parse((String)localObject1);
      try
      {
        localObject3 = paramzzjp.zzhW();
        if (localObject3 == null) {
          break;
        }
        boolean bool = ((zzan)localObject3).zzb((Uri)localObject2);
        if (!bool) {
          break;
        }
        localObject4 = paramzzjp.getContext();
        localObject1 = ((zzan)localObject3).zza((Uri)localObject2, (Context)localObject4);
      }
      catch (zzao localzzao)
      {
        for (;;)
        {
          Object localObject3;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          Object localObject4 = "Unable to append parameter to URL: ";
          localStringBuilder = localStringBuilder.append((String)localObject4);
          localObject1 = (String)localObject1;
          zzin.zzaK((String)localObject1);
          localObject1 = localObject2;
        }
      }
      localObject1 = ((Uri)localObject1).toString();
      localObject2 = new com/google/android/gms/internal/zziy;
      localObject3 = paramzzjp.getContext();
      localObject4 = paramzzjp.zzhX().afmaVersion;
      ((zziy)localObject2).<init>((Context)localObject3, (String)localObject4, (String)localObject1);
      ((zziy)localObject2).zzhn();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */