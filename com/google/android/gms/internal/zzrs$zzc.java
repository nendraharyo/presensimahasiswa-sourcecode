package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class zzrs$zzc
{
  private final String zzadc;
  private final List zzbmj;
  private final Map zzbmk;
  private final int zzbml;
  
  private zzrs$zzc(List paramList, Map paramMap, String paramString, int paramInt)
  {
    Object localObject = Collections.unmodifiableList(paramList);
    this.zzbmj = ((List)localObject);
    localObject = Collections.unmodifiableMap(paramMap);
    this.zzbmk = ((Map)localObject);
    this.zzadc = paramString;
    this.zzbml = paramInt;
  }
  
  public static zzrs.zzd zzHK()
  {
    zzrs.zzd localzzd = new com/google/android/gms/internal/zzrs$zzd;
    localzzd.<init>(null);
    return localzzd;
  }
  
  public String getVersion()
  {
    return this.zzadc;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Rules: ");
    Object localObject = zzHL();
    localStringBuilder = localStringBuilder.append(localObject).append("  Macros: ");
    localObject = this.zzbmk;
    return (String)localObject;
  }
  
  public List zzHL()
  {
    return this.zzbmj;
  }
  
  public Map zzHM()
  {
    return this.zzbmk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrs$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */