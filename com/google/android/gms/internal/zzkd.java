package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzkd
  extends zze
{
  private final Map zzxA;
  
  public zzkd()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzxA = localHashMap;
  }
  
  private String zzaW(String paramString)
  {
    zzx.zzcM(paramString);
    if (paramString != null)
    {
      String str = "&";
      int i = paramString.startsWith(str);
      if (i != 0)
      {
        i = 1;
        paramString = paramString.substring(i);
      }
    }
    zzx.zzh(paramString, "Name can not be empty or \"&\"");
    return paramString;
  }
  
  public void set(String paramString1, String paramString2)
  {
    String str = zzaW(paramString1);
    this.zzxA.put(str, paramString2);
  }
  
  public String toString()
  {
    return zzF(this.zzxA);
  }
  
  public void zza(zzkd paramzzkd)
  {
    zzx.zzz(paramzzkd);
    Map localMap1 = paramzzkd.zzxA;
    Map localMap2 = this.zzxA;
    localMap1.putAll(localMap2);
  }
  
  public Map zziR()
  {
    return Collections.unmodifiableMap(this.zzxA);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */