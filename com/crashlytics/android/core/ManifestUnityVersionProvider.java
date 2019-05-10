package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

class ManifestUnityVersionProvider
  implements UnityVersionProvider
{
  static final String FABRIC_UNITY_CRASHLYTICS_VERSION_KEY = "io.fabric.unity.crashlytics.version";
  private final Context context;
  private final String packageName;
  
  public ManifestUnityVersionProvider(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.packageName = paramString;
  }
  
  public String getUnityVersion()
  {
    String str1 = null;
    Object localObject = this.context.getPackageManager();
    try
    {
      String str2 = this.packageName;
      int i = 128;
      localObject = ((PackageManager)localObject).getApplicationInfo(str2, i);
      localObject = ((ApplicationInfo)localObject).metaData;
      if (localObject != null)
      {
        str2 = "io.fabric.unity.crashlytics.version";
        str1 = ((Bundle)localObject).getString(str2);
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return str1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ManifestUnityVersionProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */