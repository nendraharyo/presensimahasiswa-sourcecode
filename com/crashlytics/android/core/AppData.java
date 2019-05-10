package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.IdManager;

class AppData
{
  public final String apiKey;
  public final String buildId;
  public final String installerPackageName;
  public final String packageName;
  public final String versionCode;
  public final String versionName;
  
  AppData(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.apiKey = paramString1;
    this.buildId = paramString2;
    this.installerPackageName = paramString3;
    this.packageName = paramString4;
    this.versionCode = paramString5;
    this.versionName = paramString6;
  }
  
  public static AppData create(Context paramContext, IdManager paramIdManager, String paramString1, String paramString2)
  {
    String str1 = paramContext.getPackageName();
    String str2 = paramIdManager.getInstallerPackageName();
    Object localObject = paramContext.getPackageManager().getPackageInfo(str1, 0);
    int i = ((PackageInfo)localObject).versionCode;
    String str3 = Integer.toString(i);
    String str4 = ((PackageInfo)localObject).versionName;
    if (str4 == null) {}
    for (String str5 = "0.0";; str5 = ((PackageInfo)localObject).versionName)
    {
      localObject = new com/crashlytics/android/core/AppData;
      str4 = paramString1;
      ((AppData)localObject).<init>(paramString1, paramString2, str2, str1, str3, str5);
      return (AppData)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\AppData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */