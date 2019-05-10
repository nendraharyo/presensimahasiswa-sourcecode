package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzps
  extends zze
{
  public int zzDC;
  public int zzDD;
  public int zzaUL;
  public int zzaUM;
  public int zzaUN;
  private String zzaaL;
  
  public String getLanguage()
  {
    return this.zzaaL;
  }
  
  public void setLanguage(String paramString)
  {
    this.zzaaL = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzaaL;
    localHashMap.put("language", localObject);
    localObject = Integer.valueOf(this.zzaUL);
    localHashMap.put("screenColors", localObject);
    localObject = Integer.valueOf(this.zzDC);
    localHashMap.put("screenWidth", localObject);
    localObject = Integer.valueOf(this.zzDD);
    localHashMap.put("screenHeight", localObject);
    localObject = Integer.valueOf(this.zzaUM);
    localHashMap.put("viewportWidth", localObject);
    localObject = Integer.valueOf(this.zzaUN);
    localHashMap.put("viewportHeight", localObject);
    return zzF(localHashMap);
  }
  
  public int zzAQ()
  {
    return this.zzaUL;
  }
  
  public int zzAR()
  {
    return this.zzDC;
  }
  
  public int zzAS()
  {
    return this.zzDD;
  }
  
  public int zzAT()
  {
    return this.zzaUM;
  }
  
  public int zzAU()
  {
    return this.zzaUN;
  }
  
  public void zza(zzps paramzzps)
  {
    int i = this.zzaUL;
    if (i != 0)
    {
      i = this.zzaUL;
      paramzzps.zziA(i);
    }
    i = this.zzDC;
    if (i != 0)
    {
      i = this.zzDC;
      paramzzps.zziB(i);
    }
    i = this.zzDD;
    if (i != 0)
    {
      i = this.zzDD;
      paramzzps.zziC(i);
    }
    i = this.zzaUM;
    if (i != 0)
    {
      i = this.zzaUM;
      paramzzps.zziD(i);
    }
    i = this.zzaUN;
    if (i != 0)
    {
      i = this.zzaUN;
      paramzzps.zziE(i);
    }
    String str = this.zzaaL;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaaL;
      paramzzps.setLanguage(str);
    }
  }
  
  public void zziA(int paramInt)
  {
    this.zzaUL = paramInt;
  }
  
  public void zziB(int paramInt)
  {
    this.zzDC = paramInt;
  }
  
  public void zziC(int paramInt)
  {
    this.zzDD = paramInt;
  }
  
  public void zziD(int paramInt)
  {
    this.zzaUM = paramInt;
  }
  
  public void zziE(int paramInt)
  {
    this.zzaUN = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzps.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */