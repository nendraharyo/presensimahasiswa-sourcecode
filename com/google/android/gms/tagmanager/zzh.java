package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzh
  extends zzak
{
  private static final String ID = zzad.zzbv.toString();
  private final Context mContext;
  
  public zzh(Context paramContext)
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
      localObject3 = this.mContext;
      localObject3 = ((Context)localObject3).getPackageName();
      str = null;
      localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject3, 0);
      int i = ((PackageInfo)localObject1).versionCode;
      localObject1 = Integer.valueOf(i);
      localObject1 = zzdf.zzR(localObject1);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Package name ");
        String str = this.mContext.getPackageName();
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = " not found. ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        Object localObject2 = localNameNotFoundException.getMessage();
        zzbg.e((String)localObject2);
        localObject2 = zzdf.zzHF();
      }
    }
    return (zzag.zza)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */