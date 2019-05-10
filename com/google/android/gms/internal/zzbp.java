package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;

public abstract class zzbp
{
  private final int zzvr;
  private final String zzvs;
  private final Object zzvt;
  
  private zzbp(int paramInt, String paramString, Object paramObject)
  {
    this.zzvr = paramInt;
    this.zzvs = paramString;
    this.zzvt = paramObject;
    zzr.zzbK().zza(this);
  }
  
  public static zzbp zza(int paramInt, String paramString)
  {
    Object localObject = (String)null;
    localObject = zza(paramInt, paramString, null);
    zzr.zzbK().zzb((zzbp)localObject);
    return (zzbp)localObject;
  }
  
  public static zzbp zza(int paramInt1, String paramString, int paramInt2)
  {
    zzbp.2 local2 = new com/google/android/gms/internal/zzbp$2;
    Integer localInteger = Integer.valueOf(paramInt2);
    local2.<init>(paramInt1, paramString, localInteger);
    return local2;
  }
  
  public static zzbp zza(int paramInt, String paramString, long paramLong)
  {
    zzbp.3 local3 = new com/google/android/gms/internal/zzbp$3;
    Long localLong = Long.valueOf(paramLong);
    local3.<init>(paramInt, paramString, localLong);
    return local3;
  }
  
  public static zzbp zza(int paramInt, String paramString, Boolean paramBoolean)
  {
    zzbp.1 local1 = new com/google/android/gms/internal/zzbp$1;
    local1.<init>(paramInt, paramString, paramBoolean);
    return local1;
  }
  
  public static zzbp zza(int paramInt, String paramString1, String paramString2)
  {
    zzbp.4 local4 = new com/google/android/gms/internal/zzbp$4;
    local4.<init>(paramInt, paramString1, paramString2);
    return local4;
  }
  
  public static zzbp zzb(int paramInt, String paramString)
  {
    Object localObject = (String)null;
    localObject = zza(paramInt, paramString, null);
    zzr.zzbK().zzc((zzbp)localObject);
    return (zzbp)localObject;
  }
  
  public Object get()
  {
    return zzr.zzbL().zzd(this);
  }
  
  public String getKey()
  {
    return this.zzvs;
  }
  
  protected abstract Object zza(SharedPreferences paramSharedPreferences);
  
  public Object zzdq()
  {
    return this.zzvt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */