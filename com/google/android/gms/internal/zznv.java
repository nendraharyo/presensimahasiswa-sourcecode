package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;

public class zznv
{
  private static int zzazC = -1;
  
  public static boolean zzaD(Context paramContext)
  {
    int i = zzaG(paramContext);
    int k = 3;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private static int zzaE(Context paramContext)
  {
    return zzaF(paramContext) % 1000 / 100 + 5;
  }
  
  private static int zzaF(Context paramContext)
  {
    Object localObject1 = "com.google.android.gms";
    try
    {
      localObject2 = paramContext.getPackageManager();
      localObject1 = ((PackageManager)localObject2).getPackageInfo((String)localObject1, 0);
      i = ((PackageInfo)localObject1).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str = "Fitness";
        Object localObject2 = "Could not find package info for Google Play Services";
        Log.w(str, (String)localObject2);
        int i = -1;
      }
    }
    return i;
  }
  
  public static int zzaG(Context paramContext)
  {
    int i = zzazC;
    int m = -1;
    if (i == m)
    {
      i = zzaE(paramContext);
      switch (i)
      {
      default: 
        j = zzaH(paramContext);
        if (j == 0) {
          break;
        }
      }
    }
    int k;
    for (int j = 1;; k = 2)
    {
      zzazC = j;
      for (;;)
      {
        return zzazC;
        k = 3;
        zzazC = k;
        continue;
        k = 0;
        zzazC = 0;
      }
    }
  }
  
  private static boolean zzaH(Context paramContext)
  {
    i = 1;
    for (Object localObject1 = "phone";; localObject1 = null)
    {
      try
      {
        localObject1 = paramContext.getSystemService((String)localObject1);
        localObject1 = (TelephonyManager)localObject1;
        j = ((TelephonyManager)localObject1).getPhoneType();
        if (j == 0) {
          break label29;
        }
        j = i;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        for (;;)
        {
          int j;
          label29:
          String str1 = "Fitness";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str2 = "Unable to determine type of device, assuming phone.  Version: ";
          localObject2 = ((StringBuilder)localObject2).append(str2);
          int m = zzaF(paramContext);
          localObject2 = m;
          Log.wtf(str1, (String)localObject2, localNotFoundException);
          int k = i;
        }
      }
      return j;
      k = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */