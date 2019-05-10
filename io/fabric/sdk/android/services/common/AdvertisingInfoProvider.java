package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

class AdvertisingInfoProvider
{
  private static final String ADVERTISING_INFO_PREFERENCES = "TwitterAdvertisingInfoPreferences";
  private static final String PREFKEY_ADVERTISING_ID = "advertising_id";
  private static final String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
  private final Context context;
  private final PreferenceStore preferenceStore;
  
  public AdvertisingInfoProvider(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    this.context = ((Context)localObject);
    localObject = new io/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
    ((PreferenceStoreImpl)localObject).<init>(paramContext, "TwitterAdvertisingInfoPreferences");
    this.preferenceStore = ((PreferenceStore)localObject);
  }
  
  private AdvertisingInfo getAdvertisingInfoFromStrategies()
  {
    AdvertisingInfo localAdvertisingInfo = getReflectionStrategy().getAdvertisingInfo();
    boolean bool = isInfoValid(localAdvertisingInfo);
    Logger localLogger;
    String str1;
    String str2;
    if (!bool)
    {
      localAdvertisingInfo = getServiceStrategy().getAdvertisingInfo();
      bool = isInfoValid(localAdvertisingInfo);
      if (!bool)
      {
        localLogger = Fabric.getLogger();
        str1 = "Fabric";
        str2 = "AdvertisingInfo not present";
        localLogger.d(str1, str2);
      }
    }
    for (;;)
    {
      return localAdvertisingInfo;
      localLogger = Fabric.getLogger();
      str1 = "Fabric";
      str2 = "Using AdvertisingInfo from Service Provider";
      localLogger.d(str1, str2);
      continue;
      localLogger = Fabric.getLogger();
      str1 = "Fabric";
      str2 = "Using AdvertisingInfo from Reflection Provider";
      localLogger.d(str1, str2);
    }
  }
  
  private boolean isInfoValid(AdvertisingInfo paramAdvertisingInfo)
  {
    String str;
    boolean bool;
    if (paramAdvertisingInfo != null)
    {
      str = paramAdvertisingInfo.advertisingId;
      bool = TextUtils.isEmpty(str);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  private void refreshInfoIfNeededAsync(AdvertisingInfo paramAdvertisingInfo)
  {
    Thread localThread = new java/lang/Thread;
    AdvertisingInfoProvider.1 local1 = new io/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;
    local1.<init>(this, paramAdvertisingInfo);
    localThread.<init>(local1);
    localThread.start();
  }
  
  private void storeInfoToPreferences(AdvertisingInfo paramAdvertisingInfo)
  {
    boolean bool1 = isInfoValid(paramAdvertisingInfo);
    PreferenceStore localPreferenceStore;
    SharedPreferences.Editor localEditor;
    String str2;
    if (bool1)
    {
      localPreferenceStore = this.preferenceStore;
      localEditor = this.preferenceStore.edit();
      String str1 = paramAdvertisingInfo.advertisingId;
      localEditor = localEditor.putString("advertising_id", str1);
      str2 = "limit_ad_tracking_enabled";
      boolean bool2 = paramAdvertisingInfo.limitAdTrackingEnabled;
      localEditor = localEditor.putBoolean(str2, bool2);
      localPreferenceStore.save(localEditor);
    }
    for (;;)
    {
      return;
      localPreferenceStore = this.preferenceStore;
      localEditor = this.preferenceStore.edit().remove("advertising_id");
      str2 = "limit_ad_tracking_enabled";
      localEditor = localEditor.remove(str2);
      localPreferenceStore.save(localEditor);
    }
  }
  
  public AdvertisingInfo getAdvertisingInfo()
  {
    AdvertisingInfo localAdvertisingInfo = getInfoFromPreferences();
    boolean bool = isInfoValid(localAdvertisingInfo);
    if (bool)
    {
      Logger localLogger = Fabric.getLogger();
      String str1 = "Fabric";
      String str2 = "Using AdvertisingInfo from Preference Store";
      localLogger.d(str1, str2);
      refreshInfoIfNeededAsync(localAdvertisingInfo);
    }
    for (;;)
    {
      return localAdvertisingInfo;
      localAdvertisingInfo = getAdvertisingInfoFromStrategies();
      storeInfoToPreferences(localAdvertisingInfo);
    }
  }
  
  protected AdvertisingInfo getInfoFromPreferences()
  {
    String str = this.preferenceStore.get().getString("advertising_id", "");
    boolean bool = this.preferenceStore.get().getBoolean("limit_ad_tracking_enabled", false);
    AdvertisingInfo localAdvertisingInfo = new io/fabric/sdk/android/services/common/AdvertisingInfo;
    localAdvertisingInfo.<init>(str, bool);
    return localAdvertisingInfo;
  }
  
  public AdvertisingInfoStrategy getReflectionStrategy()
  {
    AdvertisingInfoReflectionStrategy localAdvertisingInfoReflectionStrategy = new io/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;
    Context localContext = this.context;
    localAdvertisingInfoReflectionStrategy.<init>(localContext);
    return localAdvertisingInfoReflectionStrategy;
  }
  
  public AdvertisingInfoStrategy getServiceStrategy()
  {
    AdvertisingInfoServiceStrategy localAdvertisingInfoServiceStrategy = new io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;
    Context localContext = this.context;
    localAdvertisingInfoServiceStrategy.<init>(localContext);
    return localAdvertisingInfoServiceStrategy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */