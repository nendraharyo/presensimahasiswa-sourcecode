package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpx
  extends zze
{
  public String zzSU;
  public String zzaUY;
  public String zzaUZ;
  
  public String getAction()
  {
    return this.zzSU;
  }
  
  public String getTarget()
  {
    return this.zzaUZ;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str = this.zzaUY;
    localHashMap.put("network", str);
    str = this.zzSU;
    localHashMap.put("action", str);
    str = this.zzaUZ;
    localHashMap.put("target", str);
    return zzF(localHashMap);
  }
  
  public String zzBg()
  {
    return this.zzaUY;
  }
  
  public void zza(zzpx paramzzpx)
  {
    String str = this.zzaUY;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUY;
      paramzzpx.zzeJ(str);
    }
    str = this.zzSU;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzSU;
      paramzzpx.zzeF(str);
    }
    str = this.zzaUZ;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUZ;
      paramzzpx.zzeK(str);
    }
  }
  
  public void zzeF(String paramString)
  {
    this.zzSU = paramString;
  }
  
  public void zzeJ(String paramString)
  {
    this.zzaUY = paramString;
  }
  
  public void zzeK(String paramString)
  {
    this.zzaUZ = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */