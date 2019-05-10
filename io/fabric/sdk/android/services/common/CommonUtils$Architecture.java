package io.fabric.sdk.android.services.common;

import android.os.Build;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

 enum CommonUtils$Architecture
{
  private static final Map matcher;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 4;
    Object localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("X86_32", 0);
    X86_32 = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("X86_64", k);
    X86_64 = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("ARM_UNKNOWN", j);
    ARM_UNKNOWN = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("PPC", i);
    PPC = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("PPC64", m);
    PPC64 = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("ARMV6", 5);
    ARMV6 = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("ARMV7", 6);
    ARMV7 = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("UNKNOWN", 7);
    UNKNOWN = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("ARMV7S", 8);
    ARMV7S = (Architecture)localObject;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$Architecture;
    ((Architecture)localObject).<init>("ARM64", 9);
    ARM64 = (Architecture)localObject;
    localObject = new Architecture[10];
    Architecture localArchitecture1 = X86_32;
    localObject[0] = localArchitecture1;
    localArchitecture1 = X86_64;
    localObject[k] = localArchitecture1;
    localArchitecture1 = ARM_UNKNOWN;
    localObject[j] = localArchitecture1;
    localArchitecture1 = PPC;
    localObject[i] = localArchitecture1;
    localArchitecture1 = PPC64;
    localObject[m] = localArchitecture1;
    Architecture localArchitecture2 = ARMV6;
    localObject[5] = localArchitecture2;
    localArchitecture2 = ARMV7;
    localObject[6] = localArchitecture2;
    localArchitecture2 = UNKNOWN;
    localObject[7] = localArchitecture2;
    localArchitecture2 = ARMV7S;
    localObject[8] = localArchitecture2;
    localArchitecture2 = ARM64;
    localObject[9] = localArchitecture2;
    $VALUES = (Architecture[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>(m);
    matcher = (Map)localObject;
    localObject = matcher;
    localArchitecture2 = ARMV7;
    ((Map)localObject).put("armeabi-v7a", localArchitecture2);
    localObject = matcher;
    localArchitecture2 = ARMV6;
    ((Map)localObject).put("armeabi", localArchitecture2);
    localObject = matcher;
    localArchitecture2 = ARM64;
    ((Map)localObject).put("arm64-v8a", localArchitecture2);
    localObject = matcher;
    localArchitecture2 = X86_32;
    ((Map)localObject).put("x86", localArchitecture2);
  }
  
  static Architecture getValue()
  {
    Object localObject1 = Build.CPU_ABI;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    if (bool)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "Fabric";
      String str = "Architecture#getValue()::Build.CPU_ABI returned null or empty";
      ((Logger)localObject1).d((String)localObject2, str);
      localObject1 = UNKNOWN;
    }
    for (;;)
    {
      return (Architecture)localObject1;
      localObject2 = Locale.US;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localObject2 = matcher;
      localObject1 = (Architecture)((Map)localObject2).get(localObject1);
      if (localObject1 == null) {
        localObject1 = UNKNOWN;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\CommonUtils$Architecture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */