package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import com.google.android.gms.common.internal.zzd;

public class zzmp
{
  public static boolean zzk(Context paramContext, String paramString)
  {
    boolean bool = false;
    Object localObject = paramContext.getPackageManager();
    int i = 0;
    try
    {
      localObject = ((PackageManager)localObject).getApplicationInfo(paramString, 0);
      int j = ((ApplicationInfo)localObject).flags;
      i = 2097152;
      j &= i;
      if (j != 0) {
        bool = true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public static boolean zzkr()
  {
    boolean bool = zzd.zzakE;
    if (bool)
    {
      bool = zzlz.isInitialized();
      if (bool)
      {
        i = zzlz.zzpW();
        int k = Process.myUid();
        if (i != k) {}
      }
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */