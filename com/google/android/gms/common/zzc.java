package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzn;

public class zzc
{
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  private static final zzc zzafF;
  
  static
  {
    zzc localzzc = new com/google/android/gms/common/zzc;
    localzzc.<init>();
    zzafF = localzzc;
  }
  
  private String zzj(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("gcore_");
    int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
    localStringBuilder.append(i);
    Object localObject = "-";
    localStringBuilder.append((String)localObject);
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool) {
      localStringBuilder.append(paramString);
    }
    localObject = "-";
    localStringBuilder.append((String)localObject);
    if (paramContext != null)
    {
      localObject = paramContext.getPackageName();
      localStringBuilder.append((String)localObject);
    }
    localObject = "-";
    localStringBuilder.append((String)localObject);
    if (paramContext != null) {}
    try
    {
      localObject = paramContext.getPackageManager();
      String str = paramContext.getPackageName();
      localObject = ((PackageManager)localObject).getPackageInfo(str, 0);
      int j = ((PackageInfo)localObject).versionCode;
      localStringBuilder.append(j);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return localStringBuilder.toString();
  }
  
  public static zzc zzoK()
  {
    return zzafF;
  }
  
  public PendingIntent getErrorResolutionPendingIntent(Context paramContext, int paramInt1, int paramInt2)
  {
    return zza(paramContext, paramInt1, paramInt2, null);
  }
  
  public String getErrorString(int paramInt)
  {
    return zze.getErrorString(paramInt);
  }
  
  public String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    return zze.getOpenSourceSoftwareLicenseInfo(paramContext);
  }
  
  public int isGooglePlayServicesAvailable(Context paramContext)
  {
    int i = zze.isGooglePlayServicesAvailable(paramContext);
    boolean bool = zze.zzd(paramContext, i);
    if (bool) {
      i = 18;
    }
    return i;
  }
  
  public boolean isUserResolvableError(int paramInt)
  {
    return zze.isUserRecoverableError(paramInt);
  }
  
  public PendingIntent zza(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = zza(paramContext, paramInt1, paramString);
    if (localObject == null) {}
    int i;
    for (localObject = null;; localObject = PendingIntent.getActivity(paramContext, paramInt2, (Intent)localObject, i))
    {
      return (PendingIntent)localObject;
      i = 268435456;
    }
  }
  
  public Intent zza(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent;
    switch (paramInt)
    {
    default: 
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      String str = zzj(paramContext, paramString);
      localIntent = zzn.zzx("com.google.android.gms", str);
      continue;
      localIntent = zzn.zzqU();
      continue;
      localIntent = zzn.zzcJ("com.google.android.gms");
    }
  }
  
  public int zzaj(Context paramContext)
  {
    return zze.zzaj(paramContext);
  }
  
  public void zzak(Context paramContext)
  {
    zze.zzad(paramContext);
  }
  
  public void zzal(Context paramContext)
  {
    zze.zzal(paramContext);
  }
  
  public Intent zzbu(int paramInt)
  {
    return zza(null, paramInt, null);
  }
  
  public boolean zzd(Context paramContext, int paramInt)
  {
    return zze.zzd(paramContext, paramInt);
  }
  
  public boolean zzi(Context paramContext, String paramString)
  {
    return zze.zzi(paramContext, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */