package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class zzpw
  extends zze
{
  private String zzaUQ;
  private int zzaUR;
  private int zzaUS;
  private String zzaUT;
  private String zzaUU;
  private boolean zzaUV;
  private boolean zzaUW;
  private boolean zzaUX;
  
  public zzpw()
  {
    this(false);
  }
  
  public zzpw(boolean paramBoolean)
  {
    this(paramBoolean, i);
  }
  
  public zzpw(boolean paramBoolean, int paramInt)
  {
    zzx.zzbV(paramInt);
    this.zzaUR = paramInt;
    this.zzaUW = paramBoolean;
  }
  
  static int zzBb()
  {
    long l1 = 2147483647L;
    Object localObject = UUID.randomUUID();
    long l2 = ((UUID)localObject).getLeastSignificantBits() & l1;
    int i = (int)l2;
    if (i != 0) {}
    for (;;)
    {
      return i;
      long l3 = ((UUID)localObject).getMostSignificantBits() & l1;
      i = (int)l3;
      if (i == 0)
      {
        String str = "GAv4";
        localObject = "UUID.randomUUID() returned 0.";
        Log.e(str, (String)localObject);
        i = -1 >>> 1;
      }
    }
  }
  
  private void zzBf()
  {
    boolean bool = this.zzaUX;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScreenViewInfo is immutable");
      throw localIllegalStateException;
    }
  }
  
  public void setScreenName(String paramString)
  {
    zzBf();
    this.zzaUQ = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzaUQ;
    localHashMap.put("screenName", localObject);
    localObject = Boolean.valueOf(this.zzaUV);
    localHashMap.put("interstitial", localObject);
    localObject = Boolean.valueOf(this.zzaUW);
    localHashMap.put("automatic", localObject);
    localObject = Integer.valueOf(this.zzaUR);
    localHashMap.put("screenId", localObject);
    localObject = Integer.valueOf(this.zzaUS);
    localHashMap.put("referrerScreenId", localObject);
    localObject = this.zzaUT;
    localHashMap.put("referrerScreenName", localObject);
    localObject = this.zzaUU;
    localHashMap.put("referrerUri", localObject);
    return zzF(localHashMap);
  }
  
  public String zzBc()
  {
    return this.zzaUQ;
  }
  
  public int zzBd()
  {
    return this.zzaUR;
  }
  
  public String zzBe()
  {
    return this.zzaUU;
  }
  
  public void zza(zzpw paramzzpw)
  {
    String str = this.zzaUQ;
    boolean bool1 = TextUtils.isEmpty(str);
    if (!bool1)
    {
      str = this.zzaUQ;
      paramzzpw.setScreenName(str);
    }
    int i = this.zzaUR;
    if (i != 0)
    {
      i = this.zzaUR;
      paramzzpw.zziF(i);
    }
    i = this.zzaUS;
    if (i != 0)
    {
      i = this.zzaUS;
      paramzzpw.zziG(i);
    }
    str = this.zzaUT;
    boolean bool2 = TextUtils.isEmpty(str);
    if (!bool2)
    {
      str = this.zzaUT;
      paramzzpw.zzeH(str);
    }
    str = this.zzaUU;
    bool2 = TextUtils.isEmpty(str);
    if (!bool2)
    {
      str = this.zzaUU;
      paramzzpw.zzeI(str);
    }
    bool2 = this.zzaUV;
    if (bool2)
    {
      bool2 = this.zzaUV;
      paramzzpw.zzaq(bool2);
    }
    bool2 = this.zzaUW;
    if (bool2)
    {
      bool2 = this.zzaUW;
      paramzzpw.zzap(bool2);
    }
  }
  
  public void zzap(boolean paramBoolean)
  {
    zzBf();
    this.zzaUW = paramBoolean;
  }
  
  public void zzaq(boolean paramBoolean)
  {
    zzBf();
    this.zzaUV = paramBoolean;
  }
  
  public void zzeH(String paramString)
  {
    zzBf();
    this.zzaUT = paramString;
  }
  
  public void zzeI(String paramString)
  {
    zzBf();
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      bool = false;
    }
    for (this.zzaUU = null;; this.zzaUU = paramString) {
      return;
    }
  }
  
  public void zziF(int paramInt)
  {
    zzBf();
    this.zzaUR = paramInt;
  }
  
  public void zziG(int paramInt)
  {
    zzBf();
    this.zzaUS = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */