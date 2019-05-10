package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

public class zzf
{
  private static final zzf zzafS;
  
  static
  {
    zzf localzzf = new com/google/android/gms/common/zzf;
    localzzf.<init>();
    zzafS = localzzf;
  }
  
  public static zzf zzoO()
  {
    return zzafS;
  }
  
  zzd.zza zza(PackageInfo paramPackageInfo, zzd.zza... paramVarArgs)
  {
    String str1 = null;
    Object localObject1 = paramPackageInfo.signatures;
    int i = localObject1.length;
    int j = 1;
    if (i != j)
    {
      str1 = "Package has more than one signature.";
      Log.w("GoogleSignatureVerifier", str1);
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (zzd.zza)localObject1;
      Object localObject2 = new com/google/android/gms/common/zzd$zzb;
      localObject1 = paramPackageInfo.signatures[0].toByteArray();
      ((zzd.zzb)localObject2).<init>((byte[])localObject1);
      i = 0;
      localObject1 = null;
      Object localObject3;
      for (;;)
      {
        int k = paramVarArgs.length;
        if (i >= k) {
          break label120;
        }
        localObject3 = paramVarArgs[i];
        boolean bool2 = ((zzd.zza)localObject3).equals(localObject2);
        if (bool2)
        {
          localObject1 = paramVarArgs[i];
          break;
        }
        i += 1;
      }
      label120:
      localObject1 = "GoogleSignatureVerifier";
      int m = 2;
      boolean bool1 = Log.isLoggable((String)localObject1, m);
      if (bool1)
      {
        localObject1 = "GoogleSignatureVerifier";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "Signature not valid.  Found: \n";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        localObject2 = ((zzd.zza)localObject2).getBytes();
        str1 = Base64.encodeToString((byte[])localObject2, 0);
        str1 = str1;
        Log.v((String)localObject1, str1);
      }
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public boolean zza(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = true;
    Object localObject;
    if (paramPackageInfo != null)
    {
      localObject = paramPackageInfo.signatures;
      if (localObject != null) {
        if (paramBoolean)
        {
          localObject = zzd.zzd.zzafK;
          localObject = zza(paramPackageInfo, (zzd.zza[])localObject);
          if (localObject == null) {
            break label73;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      localObject = new zzd.zza[bool];
      zzd.zza localzza = zzd.zzd.zzafK[0];
      localObject[0] = localzza;
      localObject = zza(paramPackageInfo, (zzd.zza[])localObject);
      break;
      label73:
      bool = false;
    }
  }
  
  public boolean zza(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramPackageInfo == null) {}
    for (;;)
    {
      return bool2;
      boolean bool3 = zze.zzc(paramPackageManager);
      if (bool3)
      {
        bool2 = zza(paramPackageInfo, bool1);
      }
      else
      {
        bool2 = zza(paramPackageInfo, false);
        if (!bool2)
        {
          bool3 = zza(paramPackageInfo, bool1);
          if (bool3)
          {
            String str1 = "GoogleSignatureVerifier";
            String str2 = "Test-keys aren't accepted on this build.";
            Log.w(str1, str2);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */