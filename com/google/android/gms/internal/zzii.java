package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

public class zzii
{
  long zzLE;
  long zzLF;
  int zzLG;
  int zzLH;
  int zzLI;
  final String zzLq;
  private final Object zzpV;
  
  public zzii(String paramString)
  {
    this.zzLE = l;
    this.zzLF = l;
    this.zzLG = -1;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzLH = 0;
    this.zzLI = 0;
    this.zzLq = paramString;
  }
  
  public static boolean zzH(Context paramContext)
  {
    boolean bool = false;
    Object localObject1 = paramContext.getResources();
    Object localObject2 = "Theme.Translucent";
    Object localObject3 = "style";
    String str2 = "android";
    int i = ((Resources)localObject1).getIdentifier((String)localObject2, (String)localObject3, str2);
    if (i == 0)
    {
      localObject1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
      zzin.zzaJ((String)localObject1);
    }
    for (;;)
    {
      return bool;
      localObject2 = new android/content/ComponentName;
      localObject3 = paramContext.getPackageName();
      str2 = "com.google.android.gms.ads.AdActivity";
      ((ComponentName)localObject2).<init>((String)localObject3, str2);
      try
      {
        localObject3 = paramContext.getPackageManager();
        str2 = null;
        localObject2 = ((PackageManager)localObject3).getActivityInfo((ComponentName)localObject2, 0);
        int j = ((ActivityInfo)localObject2).theme;
        if (i == j)
        {
          bool = true;
        }
        else
        {
          localObject1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
          zzin.zzaJ((String)localObject1);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        zzin.zzaK("Fail to fetch AdActivity theme");
        String str1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        zzin.zzaJ(str1);
      }
    }
  }
  
  public void zzb(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        long l1 = this.zzLF;
        long l2 = -1;
        boolean bool = l1 < l2;
        if (!bool)
        {
          this.zzLF = paramLong;
          l1 = this.zzLF;
          this.zzLE = l1;
          Bundle localBundle = paramAdRequestParcel.extras;
          if (localBundle != null)
          {
            localBundle = paramAdRequestParcel.extras;
            String str = "gw";
            int j = 2;
            i = localBundle.getInt(str, j);
            int k = 1;
            if (i != k) {}
          }
        }
        else
        {
          this.zzLE = paramLong;
        }
      }
      int i = this.zzLG + 1;
      this.zzLG = i;
    }
  }
  
  public Bundle zzc(Context paramContext, String paramString)
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      String str1 = "session_id";
      String str2 = this.zzLq;
      localBundle.putString(str1, str2);
      str1 = "basets";
      long l = this.zzLF;
      localBundle.putLong(str1, l);
      str1 = "currts";
      l = this.zzLE;
      localBundle.putLong(str1, l);
      str1 = "seq_num";
      localBundle.putString(str1, paramString);
      str1 = "preqs";
      int i = this.zzLG;
      localBundle.putInt(str1, i);
      str1 = "pclick";
      i = this.zzLH;
      localBundle.putInt(str1, i);
      str1 = "pimp";
      i = this.zzLI;
      localBundle.putInt(str1, i);
      str1 = "support_transparent_background";
      boolean bool = zzH(paramContext);
      localBundle.putBoolean(str1, bool);
      return localBundle;
    }
  }
  
  public void zzgS()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzLI + 1;
      this.zzLI = i;
      return;
    }
  }
  
  public void zzgT()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzLH + 1;
      this.zzLH = i;
      return;
    }
  }
  
  public long zzhl()
  {
    return this.zzLF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzii.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */