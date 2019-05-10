package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

class MediaMetadata$zza
{
  private final Map zzaba;
  private final Map zzabb;
  private final Map zzabc;
  
  public MediaMetadata$zza()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaba = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzabb = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzabc = localHashMap;
  }
  
  public zza zzc(String paramString1, String paramString2, int paramInt)
  {
    this.zzaba.put(paramString1, paramString2);
    this.zzabb.put(paramString2, paramString1);
    Map localMap = this.zzabc;
    Integer localInteger = Integer.valueOf(paramInt);
    localMap.put(paramString1, localInteger);
    return this;
  }
  
  public String zzca(String paramString)
  {
    return (String)this.zzaba.get(paramString);
  }
  
  public String zzcb(String paramString)
  {
    return (String)this.zzabb.get(paramString);
  }
  
  public int zzcc(String paramString)
  {
    Integer localInteger = (Integer)this.zzabc.get(paramString);
    int i;
    if (localInteger != null) {
      i = localInteger.intValue();
    }
    for (;;)
    {
      return i;
      i = 0;
      localInteger = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaMetadata$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */