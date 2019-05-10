package com.crashlytics.android.core;

import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;

final class CrashlyticsController$DefaultSettingsDataProvider
  implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
{
  public SettingsData getSettingsData()
  {
    return Settings.getInstance().awaitSettingsData();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$DefaultSettingsDataProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */