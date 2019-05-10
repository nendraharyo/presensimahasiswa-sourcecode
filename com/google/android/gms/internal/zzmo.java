package com.google.android.gms.internal;

import android.util.Base64;

public final class zzmo
{
  public static String zzj(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (String str = null;; str = Base64.encodeToString(paramArrayOfByte, 0)) {
      return str;
    }
  }
  
  public static String zzk(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null) {
      i = 0;
    }
    for (String str = null;; str = Base64.encodeToString(paramArrayOfByte, i))
    {
      return str;
      i = 10;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */