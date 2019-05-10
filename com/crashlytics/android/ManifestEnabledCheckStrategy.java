package com.crashlytics.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

class ManifestEnabledCheckStrategy
  implements CrashlyticsInitProvider.EnabledCheckStrategy
{
  public boolean isCrashlyticsEnabled(Context paramContext)
  {
    for (boolean bool1 = true;; bool1 = false)
    {
      try
      {
        Object localObject1 = paramContext.getPackageName();
        Object localObject2 = paramContext.getPackageManager();
        int i = 128;
        localObject1 = ((PackageManager)localObject2).getApplicationInfo((String)localObject1, i);
        localObject1 = ((ApplicationInfo)localObject1).metaData;
        if (localObject1 != null)
        {
          localObject2 = "firebase_crashlytics_collection_enabled";
          i = 1;
          boolean bool2 = ((Bundle)localObject1).getBoolean((String)localObject2, i);
          if (!bool2) {
            continue;
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
      return bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\ManifestEnabledCheckStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */