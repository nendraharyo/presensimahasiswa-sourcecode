package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class zzan
  extends zzd
{
  protected boolean zzPi;
  protected int zzRB;
  protected String zzSE;
  protected String zzSF;
  protected int zzSH;
  protected boolean zzTv;
  protected boolean zzTw;
  protected boolean zzTx;
  
  public zzan(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private static int zzby(String paramString)
  {
    String str1 = paramString.toLowerCase();
    String str2 = "verbose";
    boolean bool1 = str2.equals(str1);
    int i;
    if (bool1)
    {
      i = 0;
      str1 = null;
    }
    for (;;)
    {
      return i;
      str2 = "info";
      bool1 = str2.equals(str1);
      if (bool1)
      {
        i = 1;
      }
      else
      {
        str2 = "warning";
        bool1 = str2.equals(str1);
        if (bool1)
        {
          i = 2;
        }
        else
        {
          str2 = "error";
          boolean bool2 = str2.equals(str1);
          int j;
          if (bool2) {
            j = 3;
          } else {
            j = -1;
          }
        }
      }
    }
  }
  
  public int getLogLevel()
  {
    zzjv();
    return this.zzRB;
  }
  
  void zza(zzaa paramzzaa)
  {
    boolean bool1 = true;
    Object localObject = "Loading global XML config values";
    zzbd((String)localObject);
    boolean bool2 = paramzzaa.zzlf();
    String str;
    if (bool2)
    {
      localObject = paramzzaa.zzlg();
      this.zzSE = ((String)localObject);
      str = "XML config - app name";
      zzb(str, localObject);
    }
    bool2 = paramzzaa.zzlh();
    if (bool2)
    {
      localObject = paramzzaa.zzli();
      this.zzSF = ((String)localObject);
      str = "XML config - app version";
      zzb(str, localObject);
    }
    bool2 = paramzzaa.zzlj();
    if (bool2)
    {
      localObject = paramzzaa.zzlk();
      int i = zzby((String)localObject);
      if (i >= 0)
      {
        this.zzRB = i;
        str = "XML config - log level";
        localObject = Integer.valueOf(i);
        zza(str, localObject);
      }
    }
    boolean bool3 = paramzzaa.zzll();
    if (bool3)
    {
      int j = paramzzaa.zzlm();
      this.zzSH = j;
      this.zzTw = bool1;
      str = "XML config - dispatch period (sec)";
      localObject = Integer.valueOf(j);
      zzb(str, localObject);
    }
    boolean bool4 = paramzzaa.zzln();
    if (bool4)
    {
      bool4 = paramzzaa.zzlo();
      this.zzPi = bool4;
      this.zzTx = bool1;
      str = "XML config - dry run";
      localObject = Boolean.valueOf(bool4);
      zzb(str, localObject);
    }
  }
  
  protected void zziJ()
  {
    zzmd();
  }
  
  public String zzlg()
  {
    zzjv();
    return this.zzSE;
  }
  
  public String zzli()
  {
    zzjv();
    return this.zzSF;
  }
  
  public boolean zzlj()
  {
    zzjv();
    return this.zzTv;
  }
  
  public boolean zzll()
  {
    zzjv();
    return this.zzTw;
  }
  
  public boolean zzln()
  {
    zzjv();
    return this.zzTx;
  }
  
  public boolean zzlo()
  {
    zzjv();
    return this.zzPi;
  }
  
  public int zzmc()
  {
    zzjv();
    return this.zzSH;
  }
  
  protected void zzmd()
  {
    localObject1 = null;
    Object localObject2 = getContext();
    try
    {
      localObject4 = ((Context)localObject2).getPackageManager();
      localObject2 = ((Context)localObject2).getPackageName();
      int i = 129;
      localObject2 = ((PackageManager)localObject4).getApplicationInfo((String)localObject2, i);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject4 = "PackageManager doesn't know about the app package";
        zzd((String)localObject4, localNameNotFoundException);
        int j = 0;
        Object localObject3 = null;
        continue;
        localObject3 = ((ApplicationInfo)localObject3).metaData;
        if (localObject3 != null)
        {
          localObject1 = "com.google.android.gms.analytics.globalConfigResource";
          j = ((Bundle)localObject3).getInt((String)localObject1);
          if (j > 0)
          {
            localObject1 = new com/google/android/gms/analytics/internal/zzz;
            localObject4 = zzji();
            ((zzz)localObject1).<init>((zzf)localObject4);
            localObject3 = (zzaa)((zzz)localObject1).zzah(j);
            if (localObject3 != null) {
              zza((zzaa)localObject3);
            }
          }
        }
      }
    }
    if (localObject2 == null)
    {
      localObject2 = "Couldn't get ApplicationInfo to load global config";
      zzbg((String)localObject2);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzan.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */