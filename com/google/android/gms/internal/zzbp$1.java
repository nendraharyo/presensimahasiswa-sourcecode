package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$1
  extends zzbp
{
  zzbp$1(int paramInt, String paramString, Boolean paramBoolean)
  {
    super(paramInt, paramString, paramBoolean, null);
  }
  
  public Boolean zzb(SharedPreferences paramSharedPreferences)
  {
    String str = getKey();
    boolean bool = ((Boolean)zzdq()).booleanValue();
    return Boolean.valueOf(paramSharedPreferences.getBoolean(str, bool));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbp$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */