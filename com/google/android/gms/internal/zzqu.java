package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import com.google.android.gms.playlog.internal.zzd;

public class zzqu
{
  private final com.google.android.gms.playlog.internal.zzf zzbdy;
  private PlayLoggerContext zzbdz;
  
  public zzqu(Context paramContext, int paramInt, String paramString1, String paramString2, zzqu.zza paramzza, boolean paramBoolean, String paramString3)
  {
    String str1 = paramContext.getPackageName();
    int i = 0;
    com.google.android.gms.common.internal.zzf localzzf = null;
    try
    {
      localObject = paramContext.getPackageManager();
      str2 = null;
      localObject = ((PackageManager)localObject).getPackageInfo(str1, 0);
      i = ((PackageInfo)localObject).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject;
        Looper localLooper;
        zzd localzzd;
        String str2 = "PlayLogger";
        String str3 = "This can't happen.";
        Log.wtf(str2, str3, localNameNotFoundException);
      }
    }
    localObject = new com/google/android/gms/playlog/internal/PlayLoggerContext;
    str3 = paramString1;
    ((PlayLoggerContext)localObject).<init>(str1, i, paramInt, paramString1, paramString2, paramBoolean);
    this.zzbdz = ((PlayLoggerContext)localObject);
    localObject = new com/google/android/gms/playlog/internal/zzf;
    localLooper = paramContext.getMainLooper();
    localzzd = new com/google/android/gms/playlog/internal/zzd;
    localzzd.<init>(paramzza);
    localzzf = new com/google/android/gms/common/internal/zzf;
    localzzf.<init>(null, null, null, 49, null, str1, paramString3, null);
    ((com.google.android.gms.playlog.internal.zzf)localObject).<init>(paramContext, localLooper, localzzd, localzzf);
    this.zzbdy = ((com.google.android.gms.playlog.internal.zzf)localObject);
  }
  
  public void start()
  {
    this.zzbdy.start();
  }
  
  public void stop()
  {
    this.zzbdy.stop();
  }
  
  public void zza(long paramLong, String paramString, byte[] paramArrayOfByte, String... paramVarArgs)
  {
    com.google.android.gms.playlog.internal.zzf localzzf = this.zzbdy;
    PlayLoggerContext localPlayLoggerContext = this.zzbdz;
    LogEvent localLogEvent = new com/google/android/gms/playlog/internal/LogEvent;
    localLogEvent.<init>(paramLong, 0L, paramString, paramArrayOfByte, paramVarArgs);
    localzzf.zzb(localPlayLoggerContext, localLogEvent);
  }
  
  public void zzb(String paramString, byte[] paramArrayOfByte, String... paramVarArgs)
  {
    long l = System.currentTimeMillis();
    zza(l, paramString, paramArrayOfByte, paramVarArgs);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */