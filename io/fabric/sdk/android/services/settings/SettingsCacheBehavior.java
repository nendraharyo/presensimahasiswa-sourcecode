package io.fabric.sdk.android.services.settings;

public enum SettingsCacheBehavior
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new io/fabric/sdk/android/services/settings/SettingsCacheBehavior;
    ((SettingsCacheBehavior)localObject).<init>("USE_CACHE", 0);
    USE_CACHE = (SettingsCacheBehavior)localObject;
    localObject = new io/fabric/sdk/android/services/settings/SettingsCacheBehavior;
    ((SettingsCacheBehavior)localObject).<init>("SKIP_CACHE_LOOKUP", j);
    SKIP_CACHE_LOOKUP = (SettingsCacheBehavior)localObject;
    localObject = new io/fabric/sdk/android/services/settings/SettingsCacheBehavior;
    ((SettingsCacheBehavior)localObject).<init>("IGNORE_CACHE_EXPIRATION", i);
    IGNORE_CACHE_EXPIRATION = (SettingsCacheBehavior)localObject;
    localObject = new SettingsCacheBehavior[3];
    SettingsCacheBehavior localSettingsCacheBehavior = USE_CACHE;
    localObject[0] = localSettingsCacheBehavior;
    localSettingsCacheBehavior = SKIP_CACHE_LOOKUP;
    localObject[j] = localSettingsCacheBehavior;
    localSettingsCacheBehavior = IGNORE_CACHE_EXPIRATION;
    localObject[i] = localSettingsCacheBehavior;
    $VALUES = (SettingsCacheBehavior[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\SettingsCacheBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */