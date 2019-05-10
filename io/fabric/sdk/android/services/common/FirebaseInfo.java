package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

public class FirebaseInfo
{
  static final String FIREBASE_FEATURE_SWITCH = "com.crashlytics.useFirebaseAppId";
  static final String GOOGLE_APP_ID = "google_app_id";
  
  protected String createApiKeyFromFirebaseAppId(String paramString)
  {
    return CommonUtils.sha256(paramString).substring(0, 40);
  }
  
  protected String getApiKeyFromFirebaseAppId(Context paramContext)
  {
    String str1 = "google_app_id";
    Object localObject = "string";
    int i = CommonUtils.getResourcesIdentifier(paramContext, str1, (String)localObject);
    if (i != 0)
    {
      localObject = Fabric.getLogger();
      String str2 = "Fabric";
      String str3 = "Generating Crashlytics ApiKey from google_app_id in Strings";
      ((Logger)localObject).d(str2, str3);
      localObject = paramContext.getResources();
      str1 = ((Resources)localObject).getString(i);
    }
    for (str1 = createApiKeyFromFirebaseAppId(str1);; str1 = null)
    {
      return str1;
      i = 0;
    }
  }
  
  public boolean isDataCollectionDefaultEnabled(Context paramContext)
  {
    FirebaseApp localFirebaseApp = FirebaseAppImpl.getInstance(paramContext);
    if (localFirebaseApp == null) {}
    for (boolean bool = true;; bool = localFirebaseApp.isDataCollectionDefaultEnabled()) {
      return bool;
    }
  }
  
  public boolean isFirebaseCrashlyticsEnabled(Context paramContext)
  {
    int i = 1;
    String str = "com.crashlytics.useFirebaseAppId";
    boolean bool1 = CommonUtils.getBooleanResourceValue(paramContext, str, false);
    if (bool1) {}
    label44:
    label130:
    label137:
    for (;;)
    {
      return i;
      str = "google_app_id";
      Object localObject = "string";
      int j = CommonUtils.getResourcesIdentifier(paramContext, str, (String)localObject);
      boolean bool2;
      if (j != 0)
      {
        j = i;
        localObject = new io/fabric/sdk/android/services/common/ApiKey;
        ((ApiKey)localObject).<init>();
        localObject = ((ApiKey)localObject).getApiKeyFromManifest(paramContext);
        bool2 = TextUtils.isEmpty((CharSequence)localObject);
        if (bool2)
        {
          localObject = new io/fabric/sdk/android/services/common/ApiKey;
          ((ApiKey)localObject).<init>();
          localObject = ((ApiKey)localObject).getApiKeyFromStrings(paramContext);
          bool2 = TextUtils.isEmpty((CharSequence)localObject);
          if (bool2) {
            break label130;
          }
        }
        bool2 = i;
      }
      for (;;)
      {
        if ((j != 0) && (!bool2)) {
          break label137;
        }
        i = 0;
        break;
        j = 0;
        str = null;
        break label44;
        bool2 = false;
        localObject = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\FirebaseInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */