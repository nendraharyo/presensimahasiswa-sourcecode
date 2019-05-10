package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpq
  extends zze
{
  private String zzSE;
  private String zzSF;
  private String zzaUE;
  private String zzaUa;
  
  public void setAppId(String paramString)
  {
    this.zzaUa = paramString;
  }
  
  public void setAppInstallerId(String paramString)
  {
    this.zzaUE = paramString;
  }
  
  public void setAppName(String paramString)
  {
    this.zzSE = paramString;
  }
  
  public void setAppVersion(String paramString)
  {
    this.zzSF = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str = this.zzSE;
    localHashMap.put("appName", str);
    str = this.zzSF;
    localHashMap.put("appVersion", str);
    str = this.zzaUa;
    localHashMap.put("appId", str);
    str = this.zzaUE;
    localHashMap.put("appInstallerId", str);
    return zzF(localHashMap);
  }
  
  public String zzAJ()
  {
    return this.zzaUE;
  }
  
  public void zza(zzpq paramzzpq)
  {
    String str = this.zzSE;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzSE;
      paramzzpq.setAppName(str);
    }
    str = this.zzSF;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzSF;
      paramzzpq.setAppVersion(str);
    }
    str = this.zzaUa;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUa;
      paramzzpq.setAppId(str);
    }
    str = this.zzaUE;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaUE;
      paramzzpq.setAppInstallerId(str);
    }
  }
  
  public String zzlg()
  {
    return this.zzSE;
  }
  
  public String zzli()
  {
    return this.zzSF;
  }
  
  public String zzwK()
  {
    return this.zzaUa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */