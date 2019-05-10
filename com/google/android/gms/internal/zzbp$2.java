package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$2
  extends zzbp
{
  zzbp$2(int paramInt, String paramString, Integer paramInteger)
  {
    super(paramInt, paramString, paramInteger, null);
  }
  
  public Integer zzc(SharedPreferences paramSharedPreferences)
  {
    String str = getKey();
    int i = ((Integer)zzdq()).intValue();
    return Integer.valueOf(paramSharedPreferences.getInt(str, i));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbp$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */