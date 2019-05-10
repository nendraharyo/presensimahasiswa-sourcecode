package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AppRequestData;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.CreateAppSpiCall;
import io.fabric.sdk.android.services.settings.IconRequest;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import io.fabric.sdk.android.services.settings.UpdateAppSpiCall;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

class Onboarding
  extends Kit
{
  private static final String BINARY_BUILD_TYPE = "binary";
  static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
  private String applicationLabel;
  private String installerPackageName;
  private final Future kitsFinder;
  private PackageInfo packageInfo;
  private PackageManager packageManager;
  private String packageName;
  private final Collection providedKits;
  private final HttpRequestFactory requestFactory;
  private String targetAndroidSdkVersion;
  private String versionCode;
  private String versionName;
  
  public Onboarding(Future paramFuture, Collection paramCollection)
  {
    DefaultHttpRequestFactory localDefaultHttpRequestFactory = new io/fabric/sdk/android/services/network/DefaultHttpRequestFactory;
    localDefaultHttpRequestFactory.<init>();
    this.requestFactory = localDefaultHttpRequestFactory;
    this.kitsFinder = paramFuture;
    this.providedKits = paramCollection;
  }
  
  private AppRequestData buildAppRequest(IconRequest paramIconRequest, Collection paramCollection)
  {
    Object localObject1 = getContext();
    Object localObject2 = new io/fabric/sdk/android/services/common/ApiKey;
    ((ApiKey)localObject2).<init>();
    localObject2 = ((ApiKey)localObject2).getValue((Context)localObject1);
    localObject1 = CommonUtils.resolveBuildId((Context)localObject1);
    Object localObject3 = new String[1];
    localObject3[0] = localObject1;
    String str1 = CommonUtils.createInstanceIdFrom((String[])localObject3);
    int i = DeliveryMechanism.determineFrom(this.installerPackageName).getId();
    localObject3 = getIdManager().getAppIdentifier();
    localObject1 = new io/fabric/sdk/android/services/settings/AppRequestData;
    String str2 = this.versionName;
    String str3 = this.versionCode;
    String str4 = this.applicationLabel;
    String str5 = this.targetAndroidSdkVersion;
    ((AppRequestData)localObject1).<init>((String)localObject2, (String)localObject3, str2, str3, str1, str4, i, str5, "0", paramIconRequest, paramCollection);
    return (AppRequestData)localObject1;
  }
  
  private boolean performAutoConfigure(String paramString, AppSettingsData paramAppSettingsData, Collection paramCollection)
  {
    boolean bool1 = true;
    Object localObject1 = "new";
    String str1 = paramAppSettingsData.status;
    boolean bool2 = ((String)localObject1).equals(str1);
    Object localObject2;
    if (bool2)
    {
      bool1 = performCreateApp(paramString, paramAppSettingsData, paramCollection);
      if (bool1)
      {
        localObject2 = Settings.getInstance();
        bool1 = ((Settings)localObject2).loadSettingsSkippingCache();
      }
    }
    for (;;)
    {
      return bool1;
      localObject2 = Fabric.getLogger();
      localObject1 = "Fabric";
      str1 = "Failed to create app with Crashlytics service.";
      String str2 = null;
      ((Logger)localObject2).e((String)localObject1, str1, null);
      bool1 = false;
      localObject2 = null;
      continue;
      localObject1 = "configured";
      str1 = paramAppSettingsData.status;
      bool2 = ((String)localObject1).equals(str1);
      if (bool2)
      {
        localObject2 = Settings.getInstance();
        bool1 = ((Settings)localObject2).loadSettingsSkippingCache();
      }
      else
      {
        bool2 = paramAppSettingsData.updateRequired;
        if (bool2)
        {
          localObject1 = Fabric.getLogger();
          str1 = "Fabric";
          str2 = "Server says an update is required - forcing a full App update.";
          ((Logger)localObject1).d(str1, str2);
          performUpdateApp(paramString, paramAppSettingsData, paramCollection);
        }
      }
    }
  }
  
  private boolean performCreateApp(String paramString, AppSettingsData paramAppSettingsData, Collection paramCollection)
  {
    Object localObject = IconRequest.build(getContext(), paramString);
    localObject = buildAppRequest((IconRequest)localObject, paramCollection);
    CreateAppSpiCall localCreateAppSpiCall = new io/fabric/sdk/android/services/settings/CreateAppSpiCall;
    String str1 = getOverridenSpiEndpoint();
    String str2 = paramAppSettingsData.url;
    HttpRequestFactory localHttpRequestFactory = this.requestFactory;
    localCreateAppSpiCall.<init>(this, str1, str2, localHttpRequestFactory);
    return localCreateAppSpiCall.invoke((AppRequestData)localObject);
  }
  
  private boolean performUpdateApp(AppSettingsData paramAppSettingsData, IconRequest paramIconRequest, Collection paramCollection)
  {
    AppRequestData localAppRequestData = buildAppRequest(paramIconRequest, paramCollection);
    UpdateAppSpiCall localUpdateAppSpiCall = new io/fabric/sdk/android/services/settings/UpdateAppSpiCall;
    String str1 = getOverridenSpiEndpoint();
    String str2 = paramAppSettingsData.url;
    HttpRequestFactory localHttpRequestFactory = this.requestFactory;
    localUpdateAppSpiCall.<init>(this, str1, str2, localHttpRequestFactory);
    return localUpdateAppSpiCall.invoke(localAppRequestData);
  }
  
  private boolean performUpdateApp(String paramString, AppSettingsData paramAppSettingsData, Collection paramCollection)
  {
    IconRequest localIconRequest = IconRequest.build(getContext(), paramString);
    return performUpdateApp(paramAppSettingsData, localIconRequest, paramCollection);
  }
  
  private SettingsData retrieveSettingsData()
  {
    try
    {
      localObject1 = Settings.getInstance();
      localObject3 = this.idManager;
      localObject4 = this.requestFactory;
      String str1 = this.versionCode;
      String str2 = this.versionName;
      String str3 = getOverridenSpiEndpoint();
      localObject5 = this;
      localObject1 = ((Settings)localObject1).initialize(this, (IdManager)localObject3, (HttpRequestFactory)localObject4, str1, str2, str3);
      ((Settings)localObject1).loadSettingsData();
      localObject1 = Settings.getInstance();
      localObject1 = ((Settings)localObject1).awaitSettingsData();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject5 = Fabric.getLogger();
        Object localObject3 = "Fabric";
        Object localObject4 = "Error dealing with settings";
        ((Logger)localObject5).e((String)localObject3, (String)localObject4, localException);
        Object localObject2 = null;
      }
    }
    return (SettingsData)localObject1;
  }
  
  protected Boolean doInBackground()
  {
    Object localObject1 = getContext();
    Object localObject3 = CommonUtils.getAppIconHashOrNull((Context)localObject1);
    Object localObject4 = retrieveSettingsData();
    if (localObject4 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.kitsFinder;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject1 = this.kitsFinder;
          localObject1 = ((Future)localObject1).get();
          localObject1 = (Map)localObject1;
          localObject5 = this.providedKits;
          localObject1 = mergeKits((Map)localObject1, (Collection)localObject5);
          localObject4 = ((SettingsData)localObject4).appData;
          localObject1 = ((Map)localObject1).values();
          bool = performAutoConfigure((String)localObject3, (AppSettingsData)localObject4, (Collection)localObject1);
          return Boolean.valueOf(bool);
        }
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        continue;
        boolean bool = false;
      }
      catch (Exception localException)
      {
        localObject3 = Fabric.getLogger();
        localObject4 = "Fabric";
        localObject5 = "Error performing auto configuration.";
        ((Logger)localObject3).e((String)localObject4, (String)localObject5, localException);
      }
      Object localObject2 = null;
    }
  }
  
  public String getIdentifier()
  {
    return "io.fabric.sdk.android:fabric";
  }
  
  String getOverridenSpiEndpoint()
  {
    return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
  }
  
  public String getVersion()
  {
    return "1.4.4.27";
  }
  
  Map mergeKits(Map paramMap, Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (Kit)localIterator.next();
      String str1 = ((Kit)localObject).getIdentifier();
      boolean bool2 = paramMap.containsKey(str1);
      if (!bool2)
      {
        str1 = ((Kit)localObject).getIdentifier();
        KitInfo localKitInfo = new io/fabric/sdk/android/KitInfo;
        String str2 = ((Kit)localObject).getIdentifier();
        localObject = ((Kit)localObject).getVersion();
        String str3 = "binary";
        localKitInfo.<init>(str2, (String)localObject, str3);
        paramMap.put(str1, localKitInfo);
      }
    }
    return paramMap;
  }
  
  protected boolean onPreExecute()
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        localObject1 = getIdManager();
        localObject1 = ((IdManager)localObject1).getInstallerPackageName();
        this.installerPackageName = ((String)localObject1);
        localObject1 = getContext();
        localObject1 = ((Context)localObject1).getPackageManager();
        this.packageManager = ((PackageManager)localObject1);
        localObject1 = getContext();
        localObject1 = ((Context)localObject1).getPackageName();
        this.packageName = ((String)localObject1);
        localObject1 = this.packageManager;
        localObject2 = this.packageName;
        str1 = null;
        localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject2, 0);
        this.packageInfo = ((PackageInfo)localObject1);
        localObject1 = this.packageInfo;
        int i = ((PackageInfo)localObject1).versionCode;
        localObject1 = Integer.toString(i);
        this.versionCode = ((String)localObject1);
        localObject1 = this.packageInfo;
        localObject1 = ((PackageInfo)localObject1).versionName;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "0.0";
        this.versionName = ((String)localObject1);
        localObject1 = this.packageManager;
        localObject2 = getContext();
        localObject2 = ((Context)localObject2).getApplicationInfo();
        localObject1 = ((PackageManager)localObject1).getApplicationLabel((ApplicationInfo)localObject2);
        localObject1 = ((CharSequence)localObject1).toString();
        this.applicationLabel = ((String)localObject1);
        localObject1 = getContext();
        localObject1 = ((Context)localObject1).getApplicationInfo();
        i = ((ApplicationInfo)localObject1).targetSdkVersion;
        localObject1 = Integer.toString(i);
        this.targetAndroidSdkVersion = ((String)localObject1);
        bool = true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject1;
        Object localObject2 = Fabric.getLogger();
        String str1 = "Fabric";
        String str2 = "Failed init";
        ((Logger)localObject2).e(str1, str2, localNameNotFoundException);
        continue;
      }
      return bool;
      localObject1 = this.packageInfo;
      localObject1 = ((PackageInfo)localObject1).versionName;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Onboarding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */