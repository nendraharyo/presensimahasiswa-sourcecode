package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.cache.ValueLoader;

class InstallerPackageNameProvider$1
  implements ValueLoader
{
  InstallerPackageNameProvider$1(InstallerPackageNameProvider paramInstallerPackageNameProvider) {}
  
  public String load(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    String str = paramContext.getPackageName();
    localObject = ((PackageManager)localObject).getInstallerPackageName(str);
    if (localObject == null) {
      localObject = "";
    }
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\InstallerPackageNameProvider$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */