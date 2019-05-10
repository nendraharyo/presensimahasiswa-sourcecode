package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class zzmu
{
  public static boolean zzaw(Context paramContext)
  {
    boolean bool = zzne.zzsl();
    PackageManager localPackageManager;
    if (bool)
    {
      localPackageManager = paramContext.getPackageManager();
      String str = "android.hardware.type.watch";
      bool = localPackageManager.hasSystemFeature(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPackageManager = null;
    }
  }
  
  public static boolean zzb(Resources paramResources)
  {
    int i = 1;
    boolean bool1 = false;
    if (paramResources == null) {
      return bool1;
    }
    Configuration localConfiguration = paramResources.getConfiguration();
    int j = localConfiguration.screenLayout & 0xF;
    int k = 3;
    if (j > k) {
      j = i;
    }
    for (;;)
    {
      boolean bool3 = zzne.zzsd();
      if ((!bool3) || (j == 0))
      {
        bool2 = zzc(paramResources);
        if (!bool2) {
          break;
        }
      }
      bool1 = i;
      break;
      boolean bool2 = false;
      localConfiguration = null;
    }
  }
  
  private static boolean zzc(Resources paramResources)
  {
    boolean bool1 = false;
    Configuration localConfiguration = paramResources.getConfiguration();
    boolean bool2 = zzne.zzsf();
    if (bool2)
    {
      int i = localConfiguration.screenLayout & 0xF;
      int j = 3;
      if (i <= j)
      {
        int k = localConfiguration.smallestScreenWidthDp;
        i = 600;
        if (k >= i) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */