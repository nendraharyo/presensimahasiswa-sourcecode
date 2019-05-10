package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class zzbp$4
  extends zzbp
{
  zzbp$4(int paramInt, String paramString1, String paramString2)
  {
    super(paramInt, paramString1, paramString2, null);
  }
  
  public String zze(SharedPreferences paramSharedPreferences)
  {
    String str1 = getKey();
    String str2 = (String)zzdq();
    return paramSharedPreferences.getString(str1, str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbp$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */