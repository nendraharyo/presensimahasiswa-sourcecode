package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpy
  extends zze
{
  public String mCategory;
  public String zzaUO;
  public String zzaVa;
  public long zzaVb;
  
  public String getLabel()
  {
    return this.zzaUO;
  }
  
  public long getTimeInMillis()
  {
    return this.zzaVb;
  }
  
  public void setTimeInMillis(long paramLong)
  {
    this.zzaVb = paramLong;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzaVa;
    localHashMap.put("variableName", localObject);
    localObject = Long.valueOf(this.zzaVb);
    localHashMap.put("timeInMillis", localObject);
    localObject = this.mCategory;
    localHashMap.put("category", localObject);
    localObject = this.zzaUO;
    localHashMap.put("label", localObject);
    return zzF(localHashMap);
  }
  
  public String zzAZ()
  {
    return this.mCategory;
  }
  
  public String zzBh()
  {
    return this.zzaVa;
  }
  
  public void zza(zzpy paramzzpy)
  {
    String str = this.zzaVa;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaVa;
      paramzzpy.zzeL(str);
    }
    long l1 = this.zzaVb;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = this.zzaVb;
      paramzzpy.setTimeInMillis(l1);
    }
    str = this.mCategory;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.mCategory;
      paramzzpy.zzeE(str);
    }
    str = this.zzaUO;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUO;
      paramzzpy.zzeG(str);
    }
  }
  
  public void zzeE(String paramString)
  {
    this.mCategory = paramString;
  }
  
  public void zzeG(String paramString)
  {
    this.zzaUO = paramString;
  }
  
  public void zzeL(String paramString)
  {
    this.zzaVa = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */