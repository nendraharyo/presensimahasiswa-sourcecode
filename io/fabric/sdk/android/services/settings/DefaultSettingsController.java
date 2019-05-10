package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import org.json.JSONObject;

class DefaultSettingsController
  implements SettingsController
{
  private static final String LOAD_ERROR_MESSAGE = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";
  private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
  private final CachedSettingsIo cachedSettingsIo;
  private final CurrentTimeProvider currentTimeProvider;
  private final Kit kit;
  private final PreferenceStore preferenceStore;
  private final SettingsJsonTransform settingsJsonTransform;
  private final SettingsRequest settingsRequest;
  private final SettingsSpiCall settingsSpiCall;
  
  public DefaultSettingsController(Kit paramKit, SettingsRequest paramSettingsRequest, CurrentTimeProvider paramCurrentTimeProvider, SettingsJsonTransform paramSettingsJsonTransform, CachedSettingsIo paramCachedSettingsIo, SettingsSpiCall paramSettingsSpiCall)
  {
    this.kit = paramKit;
    this.settingsRequest = paramSettingsRequest;
    this.currentTimeProvider = paramCurrentTimeProvider;
    this.settingsJsonTransform = paramSettingsJsonTransform;
    this.cachedSettingsIo = paramCachedSettingsIo;
    this.settingsSpiCall = paramSettingsSpiCall;
    PreferenceStoreImpl localPreferenceStoreImpl = new io/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
    Kit localKit = this.kit;
    localPreferenceStoreImpl.<init>(localKit);
    this.preferenceStore = localPreferenceStoreImpl;
  }
  
  private SettingsData getCachedSettingsData(SettingsCacheBehavior paramSettingsCacheBehavior)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = SettingsCacheBehavior.SKIP_CACHE_LOOKUP;
        boolean bool1 = ((SettingsCacheBehavior)localObject2).equals(paramSettingsCacheBehavior);
        if (!bool1)
        {
          localObject2 = this.cachedSettingsIo;
          localObject4 = ((CachedSettingsIo)localObject2).readCachedSettings();
          if (localObject4 == null) {
            break label232;
          }
          localObject2 = this.settingsJsonTransform;
          localObject5 = this.currentTimeProvider;
          localObject2 = ((SettingsJsonTransform)localObject2).buildFromJson((CurrentTimeProvider)localObject5, (JSONObject)localObject4);
          if (localObject2 == null) {
            break label200;
          }
          localObject5 = "Loaded cached settings: ";
          logSettings((JSONObject)localObject4, (String)localObject5);
          localObject4 = this.currentTimeProvider;
          long l = ((CurrentTimeProvider)localObject4).getCurrentTimeMillis();
          localObject6 = SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION;
          bool2 = ((SettingsCacheBehavior)localObject6).equals(paramSettingsCacheBehavior);
          if (!bool2)
          {
            boolean bool3 = ((SettingsData)localObject2).isExpired(l);
            if (bool3) {
              continue;
            }
          }
        }
      }
      catch (Exception localException1) {}
      try
      {
        localObject1 = Fabric.getLogger();
        localObject4 = "Fabric";
        localObject5 = "Returning cached settings.";
        ((Logger)localObject1).d((String)localObject4, (String)localObject5);
        localObject1 = localObject2;
        return (SettingsData)localObject1;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localObject1 = localObject3;
          Object localObject3 = localException2;
        }
      }
      Object localObject2 = Fabric.getLogger();
      Object localObject4 = "Fabric";
      Object localObject5 = "Cached settings have expired.";
      ((Logger)localObject2).d((String)localObject4, (String)localObject5);
      continue;
      localObject4 = Fabric.getLogger();
      localObject5 = "Fabric";
      Object localObject6 = "Failed to get cached settings";
      ((Logger)localObject4).e((String)localObject5, (String)localObject6, localException1);
      continue;
      label200:
      localObject3 = Fabric.getLogger();
      localObject4 = "Fabric";
      localObject5 = "Failed to transform cached settings data.";
      boolean bool2 = false;
      localObject6 = null;
      ((Logger)localObject3).e((String)localObject4, (String)localObject5, null);
      continue;
      label232:
      localObject3 = Fabric.getLogger();
      localObject4 = "Fabric";
      localObject5 = "No cached settings data found.";
      ((Logger)localObject3).d((String)localObject4, (String)localObject5);
    }
  }
  
  private void logSettings(JSONObject paramJSONObject, String paramString)
  {
    Logger localLogger = Fabric.getLogger();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString);
    String str = paramJSONObject.toString();
    localObject = str;
    localLogger.d("Fabric", (String)localObject);
  }
  
  boolean buildInstanceIdentifierChanged()
  {
    String str1 = getStoredBuildInstanceIdentifier();
    String str2 = getBuildInstanceIdentifierFromContext();
    boolean bool = str1.equals(str2);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  String getBuildInstanceIdentifierFromContext()
  {
    String[] arrayOfString = new String[1];
    String str = CommonUtils.resolveBuildId(this.kit.getContext());
    arrayOfString[0] = str;
    return CommonUtils.createInstanceIdFrom(arrayOfString);
  }
  
  String getStoredBuildInstanceIdentifier()
  {
    return this.preferenceStore.get().getString("existing_instance_identifier", "");
  }
  
  public SettingsData loadSettingsData()
  {
    SettingsCacheBehavior localSettingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
    return loadSettingsData(localSettingsCacheBehavior);
  }
  
  public SettingsData loadSettingsData(SettingsCacheBehavior paramSettingsCacheBehavior)
  {
    Object localObject1 = null;
    Object localObject2 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject2).<init>();
    Object localObject4 = this.kit.getContext();
    boolean bool = ((FirebaseInfo)localObject2).isDataCollectionDefaultEnabled((Context)localObject4);
    Object localObject5;
    if (!bool)
    {
      localObject2 = Fabric.getLogger();
      localObject4 = "Fabric";
      localObject5 = "Not fetching settings, because data collection is disabled by Firebase.";
      ((Logger)localObject2).d((String)localObject4, (String)localObject5);
      return (SettingsData)localObject1;
    }
    for (;;)
    {
      try
      {
        bool = Fabric.isDebuggable();
        if (bool) {
          break label238;
        }
        bool = buildInstanceIdentifierChanged();
        if (bool) {
          break label238;
        }
        localObject1 = getCachedSettingsData(paramSettingsCacheBehavior);
        localObject2 = localObject1;
        if (localObject2 != null) {}
      }
      catch (Exception localException1)
      {
        try
        {
          localObject1 = this.settingsSpiCall;
          localObject4 = this.settingsRequest;
          localObject1 = ((SettingsSpiCall)localObject1).invoke((SettingsRequest)localObject4);
          if (localObject1 != null)
          {
            localObject4 = this.settingsJsonTransform;
            localObject5 = this.currentTimeProvider;
            localObject2 = ((SettingsJsonTransform)localObject4).buildFromJson((CurrentTimeProvider)localObject5, (JSONObject)localObject1);
            localObject4 = this.cachedSettingsIo;
            long l = ((SettingsData)localObject2).expiresAtMillis;
            ((CachedSettingsIo)localObject4).writeCachedSettings(l, (JSONObject)localObject1);
            localObject4 = "Loaded settings: ";
            logSettings((JSONObject)localObject1, (String)localObject4);
            localObject1 = getBuildInstanceIdentifierFromContext();
            setStoredBuildInstanceIdentifier((String)localObject1);
          }
          localObject1 = localObject2;
          if (localObject2 != null) {
            break;
          }
          localObject2 = SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION;
          localObject1 = getCachedSettingsData((SettingsCacheBehavior)localObject2);
        }
        catch (Exception localException2)
        {
          String str;
          localObject1 = localException1;
          localObject3 = localException2;
          continue;
        }
        localException1 = localException1;
        localObject4 = Fabric.getLogger();
        localObject5 = "Fabric";
        str = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";
        ((Logger)localObject4).e((String)localObject5, str, localException1);
      }
      break;
      label238:
      bool = false;
      Object localObject3 = null;
    }
  }
  
  boolean setStoredBuildInstanceIdentifier(String paramString)
  {
    SharedPreferences.Editor localEditor = this.preferenceStore.edit();
    localEditor.putString("existing_instance_identifier", paramString);
    return this.preferenceStore.save(localEditor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\DefaultSettingsController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */