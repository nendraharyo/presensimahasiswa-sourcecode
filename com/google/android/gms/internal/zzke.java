package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzke
  extends zze
{
  private String zzPN;
  private String zzPO;
  private String zzPP;
  private boolean zzPQ;
  private String zzPR;
  private boolean zzPS;
  private double zzPT;
  private String zzrG;
  
  public String getClientId()
  {
    return this.zzPO;
  }
  
  public String getUserId()
  {
    return this.zzrG;
  }
  
  public void setClientId(String paramString)
  {
    this.zzPO = paramString;
  }
  
  public void setSampleRate(double paramDouble)
  {
    double d = 0.0D;
    boolean bool = paramDouble < d;
    if (!bool)
    {
      d = 100.0D;
      bool = paramDouble < d;
      if (bool) {}
    }
    for (bool = true;; bool = false)
    {
      zzx.zzb(bool, "Sample rate must be between 0% and 100%");
      this.zzPT = paramDouble;
      return;
    }
  }
  
  public void setUserId(String paramString)
  {
    this.zzrG = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzPN;
    localHashMap.put("hitType", localObject);
    localObject = this.zzPO;
    localHashMap.put("clientId", localObject);
    localObject = this.zzrG;
    localHashMap.put("userId", localObject);
    localObject = this.zzPP;
    localHashMap.put("androidAdId", localObject);
    localObject = Boolean.valueOf(this.zzPQ);
    localHashMap.put("AdTargetingEnabled", localObject);
    localObject = this.zzPR;
    localHashMap.put("sessionControl", localObject);
    localObject = Boolean.valueOf(this.zzPS);
    localHashMap.put("nonInteraction", localObject);
    localObject = Double.valueOf(this.zzPT);
    localHashMap.put("sampleRate", localObject);
    return zzF(localHashMap);
  }
  
  public void zzH(boolean paramBoolean)
  {
    this.zzPQ = paramBoolean;
  }
  
  public void zzI(boolean paramBoolean)
  {
    this.zzPS = paramBoolean;
  }
  
  public void zza(zzke paramzzke)
  {
    String str = this.zzPN;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzPN;
      paramzzke.zzaX(str);
    }
    str = this.zzPO;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzPO;
      paramzzke.setClientId(str);
    }
    str = this.zzrG;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzrG;
      paramzzke.setUserId(str);
    }
    str = this.zzPP;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzPP;
      paramzzke.zzaY(str);
    }
    bool = this.zzPQ;
    if (bool)
    {
      bool = true;
      paramzzke.zzH(bool);
    }
    str = this.zzPR;
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzPR;
      paramzzke.zzaZ(str);
    }
    bool = this.zzPS;
    if (bool)
    {
      bool = this.zzPS;
      paramzzke.zzI(bool);
    }
    double d1 = this.zzPT;
    double d2 = 0.0D;
    bool = d1 < d2;
    if (bool)
    {
      d1 = this.zzPT;
      paramzzke.setSampleRate(d1);
    }
  }
  
  public void zzaX(String paramString)
  {
    this.zzPN = paramString;
  }
  
  public void zzaY(String paramString)
  {
    this.zzPP = paramString;
  }
  
  public void zzaZ(String paramString)
  {
    this.zzPR = paramString;
  }
  
  public String zziS()
  {
    return this.zzPN;
  }
  
  public String zziT()
  {
    return this.zzPP;
  }
  
  public boolean zziU()
  {
    return this.zzPQ;
  }
  
  public String zziV()
  {
    return this.zzPR;
  }
  
  public boolean zziW()
  {
    return this.zzPS;
  }
  
  public double zziX()
  {
    return this.zzPT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzke.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */