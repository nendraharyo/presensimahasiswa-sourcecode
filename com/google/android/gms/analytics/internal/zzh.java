package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzh
{
  private final String zzPO;
  private final long zzQD;
  private final String zzQE;
  private final boolean zzQF;
  private long zzQG;
  private final Map zzxA;
  
  public zzh(long paramLong1, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, Map paramMap)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    this.zzQD = paramLong1;
    this.zzPO = paramString1;
    this.zzQE = paramString2;
    this.zzQF = paramBoolean;
    this.zzQG = paramLong2;
    Object localObject;
    if (paramMap != null)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>(paramMap);
    }
    for (this.zzxA = ((Map)localObject);; this.zzxA = ((Map)localObject))
    {
      return;
      localObject = Collections.emptyMap();
    }
  }
  
  public String getClientId()
  {
    return this.zzPO;
  }
  
  public long zzjD()
  {
    return this.zzQD;
  }
  
  public String zzjE()
  {
    return this.zzQE;
  }
  
  public boolean zzjF()
  {
    return this.zzQF;
  }
  
  public long zzjG()
  {
    return this.zzQG;
  }
  
  public Map zzn()
  {
    return this.zzxA;
  }
  
  public void zzn(long paramLong)
  {
    this.zzQG = paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */