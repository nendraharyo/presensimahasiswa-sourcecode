package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzpk.zza;

public class FlagProviderImpl
  extends zzpk.zza
{
  private boolean zzqA = false;
  private SharedPreferences zzvx;
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
  {
    SharedPreferences localSharedPreferences = this.zzvx;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    return zza.zza.zza(localSharedPreferences, paramString, localBoolean).booleanValue();
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
  {
    SharedPreferences localSharedPreferences = this.zzvx;
    Integer localInteger = Integer.valueOf(paramInt1);
    return zza.zzb.zza(localSharedPreferences, paramString, localInteger).intValue();
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt)
  {
    SharedPreferences localSharedPreferences = this.zzvx;
    Long localLong = Long.valueOf(paramLong);
    return zza.zzc.zza(localSharedPreferences, paramString, localLong).longValue();
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt)
  {
    return zza.zzd.zza(this.zzvx, paramString1, paramString2);
  }
  
  public void init(zzd paramzzd)
  {
    Object localObject = (Context)zze.zzp(paramzzd);
    boolean bool1 = this.zzqA;
    if (bool1) {}
    for (;;)
    {
      return;
      String str = "com.google.android.gms";
      try
      {
        localObject = ((Context)localObject).createPackageContext(str, 0);
        localObject = zzb.zzw((Context)localObject);
        this.zzvx = ((SharedPreferences)localObject);
        boolean bool2 = true;
        this.zzqA = bool2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\FlagProviderImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */