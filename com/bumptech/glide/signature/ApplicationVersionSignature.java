package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ApplicationVersionSignature
{
  private static final ConcurrentMap PACKAGE_NAME_TO_KEY;
  private static final String TAG = "AppVersionSignature";
  
  static
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    PACKAGE_NAME_TO_KEY = localConcurrentHashMap;
  }
  
  private static PackageInfo getPackageInfo(Context paramContext)
  {
    try
    {
      localObject1 = paramContext.getPackageManager();
      str1 = paramContext.getPackageName();
      localObject3 = null;
      localObject1 = ((PackageManager)localObject1).getPackageInfo(str1, 0);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "AppVersionSignature";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Cannot resolve info for");
        String str2 = paramContext.getPackageName();
        localObject3 = str2;
        Log.e(str1, (String)localObject3, localNameNotFoundException);
        Object localObject2 = null;
      }
    }
    return (PackageInfo)localObject1;
  }
  
  private static String getVersionCode(PackageInfo paramPackageInfo)
  {
    int i;
    if (paramPackageInfo != null) {
      i = paramPackageInfo.versionCode;
    }
    for (String str = String.valueOf(i);; str = UUID.randomUUID().toString()) {
      return str;
    }
  }
  
  public static Key obtain(Context paramContext)
  {
    String str = paramContext.getPackageName();
    Object localObject = (Key)PACKAGE_NAME_TO_KEY.get(str);
    if (localObject == null)
    {
      Key localKey = obtainVersionSignature(paramContext);
      localObject = (Key)PACKAGE_NAME_TO_KEY.putIfAbsent(str, localKey);
      if (localObject == null) {
        localObject = localKey;
      }
    }
    return (Key)localObject;
  }
  
  private static Key obtainVersionSignature(Context paramContext)
  {
    String str = getVersionCode(getPackageInfo(paramContext));
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(str);
    return localObjectKey;
  }
  
  static void reset()
  {
    PACKAGE_NAME_TO_KEY.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\signature\ApplicationVersionSignature.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */