package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType
{
  public static String zzgw(int paramInt)
  {
    String str2;
    switch (paramInt)
    {
    default: 
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str1 = "Unknown request type: ";
      localObject = str1 + paramInt;
      GamesLog.zzA("RequestType", (String)localObject);
      str2 = "UNKNOWN_TYPE";
    }
    for (;;)
    {
      return str2;
      str2 = "GIFT";
      continue;
      str2 = "WISH";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\constants\RequestType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */