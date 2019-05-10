package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AppVisibleCustomProperties$zza
{
  private final Map zzasM;
  
  public AppVisibleCustomProperties$zza()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzasM = localHashMap;
  }
  
  public zza zza(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    Map localMap = this.zzasM;
    CustomProperty localCustomProperty = new com/google/android/gms/drive/metadata/internal/CustomProperty;
    localCustomProperty.<init>(paramCustomPropertyKey, paramString);
    localMap.put(paramCustomPropertyKey, localCustomProperty);
    return this;
  }
  
  public zza zza(CustomProperty paramCustomProperty)
  {
    zzx.zzb(paramCustomProperty, "property");
    Map localMap = this.zzasM;
    CustomPropertyKey localCustomPropertyKey = paramCustomProperty.zztB();
    localMap.put(localCustomPropertyKey, paramCustomProperty);
    return this;
  }
  
  public AppVisibleCustomProperties zztA()
  {
    AppVisibleCustomProperties localAppVisibleCustomProperties = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;
    Collection localCollection = this.zzasM.values();
    localAppVisibleCustomProperties.<init>(localCollection, null);
    return localAppVisibleCustomProperties;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\AppVisibleCustomProperties$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */