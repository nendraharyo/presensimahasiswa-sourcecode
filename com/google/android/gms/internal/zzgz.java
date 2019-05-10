package com.google.android.gms.internal;

import android.support.v4.h.m;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzf;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzgz
  implements zzgw.zza
{
  private final boolean zzHc;
  
  public zzgz(boolean paramBoolean)
  {
    this.zzHc = paramBoolean;
  }
  
  private void zza(zzgw paramzzgw, JSONObject paramJSONObject, m paramm)
  {
    String str = paramJSONObject.getString("name");
    boolean bool = this.zzHc;
    Future localFuture = paramzzgw.zza(paramJSONObject, "image_value", bool);
    paramm.put(str, localFuture);
  }
  
  private void zza(JSONObject paramJSONObject, m paramm)
  {
    String str1 = paramJSONObject.getString("name");
    String str2 = paramJSONObject.getString("string_value");
    paramm.put(str1, str2);
  }
  
  private m zzc(m paramm)
  {
    m localm = new android/support/v4/h/m;
    localm.<init>();
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      i = paramm.size();
      if (j >= i) {
        break;
      }
      Object localObject2 = paramm.keyAt(j);
      localObject1 = ((Future)paramm.valueAt(j)).get();
      localm.put(localObject2, localObject1);
      i = j + 1;
    }
    return localm;
  }
  
  public zzf zzd(zzgw paramzzgw, JSONObject paramJSONObject)
  {
    m localm1 = new android/support/v4/h/m;
    localm1.<init>();
    m localm2 = new android/support/v4/h/m;
    localm2.<init>();
    zzjg localzzjg = paramzzgw.zzf(paramJSONObject);
    Object localObject1 = paramJSONObject.getJSONArray("custom_assets");
    int i = 0;
    zza localzza = null;
    int j = ((JSONArray)localObject1).length();
    if (i < j)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(i);
      String str1 = ((JSONObject)localObject2).getString("type");
      String str2 = "string";
      boolean bool = str2.equals(str1);
      if (bool) {
        zza((JSONObject)localObject2, localm2);
      }
      for (;;)
      {
        i += 1;
        break;
        str2 = "image";
        bool = str2.equals(str1);
        if (bool)
        {
          zza(paramzzgw, (JSONObject)localObject2, localm1);
        }
        else
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "Unknown custom asset type: ";
          localObject2 = str2 + str1;
          zzin.zzaK((String)localObject2);
        }
      }
    }
    localObject1 = new com/google/android/gms/ads/internal/formats/zzf;
    Object localObject2 = paramJSONObject.getString("custom_template_id");
    localm1 = zzc(localm1);
    localzza = (zza)localzzjg.get();
    ((zzf)localObject1).<init>((String)localObject2, localm1, localm2, localzza);
    return (zzf)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */