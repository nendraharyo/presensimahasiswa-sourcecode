package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$3
  extends zzbp
{
  zzbp$3(int paramInt, String paramString, Long paramLong)
  {
    super(paramInt, paramString, paramLong, null);
  }
  
  public Long zzd(SharedPreferences paramSharedPreferences)
  {
    String str = getKey();
    long l = ((Long)zzdq()).longValue();
    return Long.valueOf(paramSharedPreferences.getLong(str, l));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbp$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */