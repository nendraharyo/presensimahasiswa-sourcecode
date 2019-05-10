package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpr
  extends zze
{
  private String mName;
  private String zzaPI;
  private String zzaUF;
  private String zzaUG;
  private String zzaUH;
  private String zzaUI;
  private String zzaUJ;
  private String zzaUK;
  private String zzxG;
  private String zzyv;
  
  public String getContent()
  {
    return this.zzxG;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getSource()
  {
    return this.zzaPI;
  }
  
  public void setName(String paramString)
  {
    this.mName = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str = this.mName;
    localHashMap.put("name", str);
    str = this.zzaPI;
    localHashMap.put("source", str);
    str = this.zzaUF;
    localHashMap.put("medium", str);
    str = this.zzaUG;
    localHashMap.put("keyword", str);
    str = this.zzxG;
    localHashMap.put("content", str);
    str = this.zzyv;
    localHashMap.put("id", str);
    str = this.zzaUH;
    localHashMap.put("adNetworkId", str);
    str = this.zzaUI;
    localHashMap.put("gclid", str);
    str = this.zzaUJ;
    localHashMap.put("dclid", str);
    str = this.zzaUK;
    localHashMap.put("aclid", str);
    return zzF(localHashMap);
  }
  
  public String zzAK()
  {
    return this.zzaUF;
  }
  
  public String zzAL()
  {
    return this.zzaUG;
  }
  
  public String zzAM()
  {
    return this.zzaUH;
  }
  
  public String zzAN()
  {
    return this.zzaUI;
  }
  
  public String zzAO()
  {
    return this.zzaUJ;
  }
  
  public String zzAP()
  {
    return this.zzaUK;
  }
  
  public void zza(zzpr paramzzpr)
  {
    String str = this.mName;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.mName;
      paramzzpr.setName(str);
    }
    str = this.zzaPI;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaPI;
      paramzzpr.zzev(str);
    }
    str = this.zzaUF;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUF;
      paramzzpr.zzew(str);
    }
    str = this.zzaUG;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUG;
      paramzzpr.zzex(str);
    }
    str = this.zzxG;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzxG;
      paramzzpr.zzey(str);
    }
    str = this.zzyv;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzyv;
      paramzzpr.zzez(str);
    }
    str = this.zzaUH;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUH;
      paramzzpr.zzeA(str);
    }
    str = this.zzaUI;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUI;
      paramzzpr.zzeB(str);
    }
    str = this.zzaUJ;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUJ;
      paramzzpr.zzeC(str);
    }
    str = this.zzaUK;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUK;
      paramzzpr.zzeD(str);
    }
  }
  
  public void zzeA(String paramString)
  {
    this.zzaUH = paramString;
  }
  
  public void zzeB(String paramString)
  {
    this.zzaUI = paramString;
  }
  
  public void zzeC(String paramString)
  {
    this.zzaUJ = paramString;
  }
  
  public void zzeD(String paramString)
  {
    this.zzaUK = paramString;
  }
  
  public void zzev(String paramString)
  {
    this.zzaPI = paramString;
  }
  
  public void zzew(String paramString)
  {
    this.zzaUF = paramString;
  }
  
  public void zzex(String paramString)
  {
    this.zzaUG = paramString;
  }
  
  public void zzey(String paramString)
  {
    this.zzxG = paramString;
  }
  
  public void zzez(String paramString)
  {
    this.zzyv = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */