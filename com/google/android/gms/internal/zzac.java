package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;
import org.apache.http.client.HttpClient;

public class zzac
{
  public static zzl zza(Context paramContext)
  {
    return zza(paramContext, null);
  }
  
  public static zzl zza(Context paramContext, zzy paramzzy)
  {
    File localFile = new java/io/File;
    Object localObject1 = paramContext.getCacheDir();
    Object localObject2 = "volley";
    localFile.<init>((File)localObject1, (String)localObject2);
    localObject1 = "volley/0";
    try
    {
      localObject2 = paramContext.getPackageName();
      localObject3 = paramContext.getPackageManager();
      Object localObject4 = null;
      localObject3 = ((PackageManager)localObject3).getPackageInfo((String)localObject2, 0);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
      localObject4 = "/";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      i = ((PackageInfo)localObject3).versionCode;
      localObject2 = ((StringBuilder)localObject2).append(i);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject3;
      int i;
      int j;
      label171:
      for (;;) {}
    }
    if (paramzzy == null)
    {
      j = Build.VERSION.SDK_INT;
      i = 9;
      if (j < i) {
        break label171;
      }
      paramzzy = new com/google/android/gms/internal/zzz;
      paramzzy.<init>();
    }
    for (;;)
    {
      localObject1 = new com/google/android/gms/internal/zzt;
      ((zzt)localObject1).<init>(paramzzy);
      localObject2 = new com/google/android/gms/internal/zzl;
      localObject3 = new com/google/android/gms/internal/zzv;
      ((zzv)localObject3).<init>(localFile);
      ((zzl)localObject2).<init>((zzb)localObject3, (zzf)localObject1);
      ((zzl)localObject2).start();
      return (zzl)localObject2;
      paramzzy = new com/google/android/gms/internal/zzw;
      localObject1 = AndroidHttpClient.newInstance((String)localObject1);
      paramzzy.<init>((HttpClient)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */