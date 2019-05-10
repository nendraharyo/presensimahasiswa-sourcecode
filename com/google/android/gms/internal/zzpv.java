package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpv
  extends zze
{
  public boolean zzaUP;
  public String zzaxl;
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void setDescription(String paramString)
  {
    this.zzaxl = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzaxl;
    localHashMap.put("description", localObject);
    localObject = Boolean.valueOf(this.zzaUP);
    localHashMap.put("fatal", localObject);
    return zzF(localHashMap);
  }
  
  public boolean zzBa()
  {
    return this.zzaUP;
  }
  
  public void zza(zzpv paramzzpv)
  {
    String str = this.zzaxl;
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      str = this.zzaxl;
      paramzzpv.setDescription(str);
    }
    bool = this.zzaUP;
    if (bool)
    {
      bool = this.zzaUP;
      paramzzpv.zzao(bool);
    }
  }
  
  public void zzao(boolean paramBoolean)
  {
    this.zzaUP = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */