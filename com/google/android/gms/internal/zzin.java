package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzb;

public final class zzin
  extends zzb
{
  public static void v(String paramString)
  {
    boolean bool = zzhp();
    if (bool)
    {
      String str = "Ads";
      Log.v(str, paramString);
    }
  }
  
  public static boolean zzho()
  {
    return ((Boolean)zzbt.zzwK.get()).booleanValue();
  }
  
  private static boolean zzhp()
  {
    boolean bool = zzQ(2);
    if (bool)
    {
      bool = zzho();
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzin.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */