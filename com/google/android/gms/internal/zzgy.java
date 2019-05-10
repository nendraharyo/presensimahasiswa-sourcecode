package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class zzgy
  implements zzgw.zza
{
  private final boolean zzHc;
  private final boolean zzHd;
  
  public zzgy(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzHc = paramBoolean1;
    this.zzHd = paramBoolean2;
  }
  
  public zze zzc(zzgw paramzzgw, JSONObject paramJSONObject)
  {
    boolean bool1 = this.zzHc;
    boolean bool2 = this.zzHd;
    Object localObject1 = paramzzgw;
    Object localObject2 = paramJSONObject;
    localObject1 = paramzzgw.zza(paramJSONObject, "images", true, bool1, bool2);
    boolean bool3 = this.zzHc;
    Object localObject3 = paramzzgw.zza(paramJSONObject, "secondary_image", false, bool3);
    Object localObject4 = paramzzgw.zzf(paramJSONObject);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool4 = ((Iterator)localObject2).hasNext();
      if (!bool4) {
        break;
      }
      localObject1 = ((zzjg)((Iterator)localObject2).next()).get();
      localArrayList.add(localObject1);
    }
    localObject1 = new com/google/android/gms/ads/internal/formats/zze;
    localObject2 = paramJSONObject.getString("headline");
    String str1 = paramJSONObject.getString("body");
    localObject3 = (zzch)((Future)localObject3).get();
    String str2 = paramJSONObject.getString("call_to_action");
    String str3 = paramJSONObject.getString("advertiser");
    localObject4 = (zza)((Future)localObject4).get();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    ((zze)localObject1).<init>((String)localObject2, localArrayList, str1, (zzch)localObject3, str2, str3, (zza)localObject4, localBundle);
    return (zze)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */