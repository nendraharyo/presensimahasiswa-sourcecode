package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

public class ApiKey
{
  static final String CRASHLYTICS_API_KEY = "com.crashlytics.ApiKey";
  static final String FABRIC_API_KEY = "io.fabric.ApiKey";
  static final String STRING_TWITTER_CONSUMER_SECRET = "@string/twitter_consumer_secret";
  
  public static String getApiKey(Context paramContext)
  {
    Fabric.getLogger().w("Fabric", "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.");
    ApiKey localApiKey = new io/fabric/sdk/android/services/common/ApiKey;
    localApiKey.<init>();
    return localApiKey.getValue(paramContext);
  }
  
  public static String getApiKey(Context paramContext, boolean paramBoolean)
  {
    Fabric.getLogger().w("Fabric", "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.");
    ApiKey localApiKey = new io/fabric/sdk/android/services/common/ApiKey;
    localApiKey.<init>();
    return localApiKey.getValue(paramContext);
  }
  
  protected String buildApiKeyInstructions()
  {
    return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
  }
  
  protected String getApiKeyFromFirebaseAppId(Context paramContext)
  {
    FirebaseInfo localFirebaseInfo = new io/fabric/sdk/android/services/common/FirebaseInfo;
    localFirebaseInfo.<init>();
    return localFirebaseInfo.getApiKeyFromFirebaseAppId(paramContext);
  }
  
  protected String getApiKeyFromManifest(Context paramContext)
  {
    localObject1 = null;
    try
    {
      localObject2 = paramContext.getPackageName();
      localObject4 = paramContext.getPackageManager();
      int i = 128;
      localObject2 = ((PackageManager)localObject4).getApplicationInfo((String)localObject2, i);
      localObject4 = ((ApplicationInfo)localObject2).metaData;
      if (localObject4 != null)
      {
        localObject2 = "io.fabric.ApiKey";
        localObject2 = ((Bundle)localObject4).getString((String)localObject2);
        localObject5 = "@string/twitter_consumer_secret";
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool;
        label89:
        Object localObject4 = Fabric.getLogger();
        Object localObject5 = "Fabric";
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        String str = "Caught non-fatal exception while retrieving apiKey: ";
        localObject6 = ((StringBuilder)localObject6).append(str);
        localObject3 = localException1;
        ((Logger)localObject4).d((String)localObject5, (String)localObject3);
      }
    }
    try
    {
      bool = ((String)localObject5).equals(localObject2);
      if (!bool) {
        break label193;
      }
      localObject5 = Fabric.getLogger();
      localObject6 = "Fabric";
      str = "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth";
      ((Logger)localObject5).d((String)localObject6, str);
    }
    catch (Exception localException2)
    {
      localObject1 = localObject3;
      localObject3 = localException2;
      break label128;
      localObject1 = localObject3;
      break label89;
    }
    if (localObject1 == null)
    {
      localObject2 = Fabric.getLogger();
      localObject5 = "Fabric";
      localObject6 = "Falling back to Crashlytics key lookup from Manifest";
      ((Logger)localObject2).d((String)localObject5, (String)localObject6);
      localObject2 = "com.crashlytics.ApiKey";
      localObject1 = ((Bundle)localObject4).getString((String)localObject2);
    }
    return (String)localObject1;
  }
  
  protected String getApiKeyFromStrings(Context paramContext)
  {
    String str1 = null;
    Object localObject = "io.fabric.ApiKey";
    String str2 = "string";
    int i = CommonUtils.getResourcesIdentifier(paramContext, (String)localObject, str2);
    if (i == 0)
    {
      localObject = Fabric.getLogger();
      String str3 = "Falling back to Crashlytics key lookup from Strings";
      ((Logger)localObject).d("Fabric", str3);
      localObject = "com.crashlytics.ApiKey";
      str2 = "string";
      i = CommonUtils.getResourcesIdentifier(paramContext, (String)localObject, str2);
    }
    if (i != 0) {
      str1 = paramContext.getResources().getString(i);
    }
    return str1;
  }
  
  public String getValue(Context paramContext)
  {
    String str = getApiKeyFromManifest(paramContext);
    boolean bool = TextUtils.isEmpty(str);
    if (bool) {
      str = getApiKeyFromStrings(paramContext);
    }
    bool = TextUtils.isEmpty(str);
    if (bool) {
      str = getApiKeyFromFirebaseAppId(paramContext);
    }
    bool = TextUtils.isEmpty(str);
    if (bool) {
      logErrorOrThrowException(paramContext);
    }
    return str;
  }
  
  protected void logErrorOrThrowException(Context paramContext)
  {
    boolean bool = Fabric.isDebuggable();
    if (!bool)
    {
      bool = CommonUtils.isAppDebuggable(paramContext);
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      String str1 = buildApiKeyInstructions();
      ((IllegalArgumentException)localObject).<init>(str1);
      throw ((Throwable)localObject);
    }
    Object localObject = Fabric.getLogger();
    String str2 = buildApiKeyInstructions();
    ((Logger)localObject).e("Fabric", str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\ApiKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */