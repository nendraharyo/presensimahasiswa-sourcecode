package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.cache.ValueLoader;

public class InstallerPackageNameProvider
{
  private static final String NO_INSTALLER_PACKAGE_NAME = "";
  private final MemoryValueCache installerPackageNameCache;
  private final ValueLoader installerPackageNameLoader;
  
  public InstallerPackageNameProvider()
  {
    Object localObject = new io/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;
    ((InstallerPackageNameProvider.1)localObject).<init>(this);
    this.installerPackageNameLoader = ((ValueLoader)localObject);
    localObject = new io/fabric/sdk/android/services/cache/MemoryValueCache;
    ((MemoryValueCache)localObject).<init>();
    this.installerPackageNameCache = ((MemoryValueCache)localObject);
  }
  
  public String getInstallerPackageName(Context paramContext)
  {
    try
    {
      localObject1 = this.installerPackageNameCache;
      localObject3 = this.installerPackageNameLoader;
      localObject1 = ((MemoryValueCache)localObject1).get(paramContext, (ValueLoader)localObject3);
      localObject1 = (String)localObject1;
      localObject3 = "";
      boolean bool = ((String)localObject3).equals(localObject1);
      if (bool) {
        localObject1 = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = Fabric.getLogger();
        String str1 = "Fabric";
        String str2 = "Failed to determine installer package name";
        ((Logger)localObject3).e(str1, str2, localException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\InstallerPackageNameProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */