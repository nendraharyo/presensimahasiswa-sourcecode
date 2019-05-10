package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzg
  extends zzak
{
  private static final String ID = zzad.zzbu.toString();
  private final Context mContext;
  
  public zzg(Context paramContext)
  {
    super(str, arrayOfString);
    this.mContext = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    try
    {
      localObject1 = this.mContext;
      localObject1 = ((Context)localObject1).getPackageManager();
      localObject2 = this.mContext;
      localObject2 = ((Context)localObject2).getPackageName();
      localObject2 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, 0);
      localObject1 = ((PackageManager)localObject1).getApplicationLabel((ApplicationInfo)localObject2);
      localObject1 = ((CharSequence)localObject1).toString();
      localObject1 = zzdf.zzR(localObject1);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = "App name is not found.";
        zzbg.zzb((String)localObject2, localNameNotFoundException);
        zzag.zza localzza = zzdf.zzHF();
      }
    }
    return (zzag.zza)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */