package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpu
  extends zze
{
  private String mCategory;
  private String zzSU;
  private long zzaDV;
  private String zzaUO;
  
  public String getAction()
  {
    return this.zzSU;
  }
  
  public String getLabel()
  {
    return this.zzaUO;
  }
  
  public long getValue()
  {
    return this.zzaDV;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.mCategory;
    localHashMap.put("category", localObject);
    localObject = this.zzSU;
    localHashMap.put("action", localObject);
    localObject = this.zzaUO;
    localHashMap.put("label", localObject);
    localObject = Long.valueOf(this.zzaDV);
    localHashMap.put("value", localObject);
    return zzF(localHashMap);
  }
  
  public String zzAZ()
  {
    return this.mCategory;
  }
  
  public void zzN(long paramLong)
  {
    this.zzaDV = paramLong;
  }
  
  public void zza(zzpu paramzzpu)
  {
    String str = this.mCategory;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.mCategory;
      paramzzpu.zzeE(str);
    }
    str = this.zzSU;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzSU;
      paramzzpu.zzeF(str);
    }
    str = this.zzaUO;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUO;
      paramzzpu.zzeG(str);
    }
    long l1 = this.zzaDV;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = this.zzaDV;
      paramzzpu.zzN(l1);
    }
  }
  
  public void zzeE(String paramString)
  {
    this.mCategory = paramString;
  }
  
  public void zzeF(String paramString)
  {
    this.zzSU = paramString;
  }
  
  public void zzeG(String paramString)
  {
    this.zzaUO = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */