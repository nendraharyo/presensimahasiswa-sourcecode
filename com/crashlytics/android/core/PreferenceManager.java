package com.crashlytics.android.core;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

class PreferenceManager
{
  static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
  private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
  private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT;
  private final CrashlyticsCore kit;
  private final PreferenceStore preferenceStore;
  
  public PreferenceManager(PreferenceStore paramPreferenceStore, CrashlyticsCore paramCrashlyticsCore)
  {
    this.preferenceStore = paramPreferenceStore;
    this.kit = paramCrashlyticsCore;
  }
  
  public static PreferenceManager create(PreferenceStore paramPreferenceStore, CrashlyticsCore paramCrashlyticsCore)
  {
    PreferenceManager localPreferenceManager = new com/crashlytics/android/core/PreferenceManager;
    localPreferenceManager.<init>(paramPreferenceStore, paramCrashlyticsCore);
    return localPreferenceManager;
  }
  
  void setShouldAlwaysSendReports(boolean paramBoolean)
  {
    PreferenceStore localPreferenceStore = this.preferenceStore;
    SharedPreferences.Editor localEditor = this.preferenceStore.edit().putBoolean("always_send_reports_opt_in", paramBoolean);
    localPreferenceStore.save(localEditor);
  }
  
  boolean shouldAlwaysSendReports()
  {
    boolean bool1 = true;
    Object localObject1 = this.preferenceStore.get();
    Object localObject2 = "preferences_migration_complete";
    boolean bool2 = ((SharedPreferences)localObject1).contains((String)localObject2);
    Object localObject3;
    if (!bool2)
    {
      localObject2 = new io/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
      localObject1 = this.kit;
      ((PreferenceStoreImpl)localObject2).<init>((Kit)localObject1);
      localObject1 = this.preferenceStore.get();
      localObject3 = "always_send_reports_opt_in";
      bool2 = ((SharedPreferences)localObject1).contains((String)localObject3);
      if (bool2) {
        break label219;
      }
      localObject1 = ((PreferenceStore)localObject2).get();
      localObject3 = "always_send_reports_opt_in";
      bool2 = ((SharedPreferences)localObject1).contains((String)localObject3);
      if (!bool2) {
        break label219;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      if (bool2)
      {
        bool2 = ((PreferenceStore)localObject2).get().getBoolean("always_send_reports_opt_in", false);
        localObject2 = this.preferenceStore;
        localObject3 = this.preferenceStore.edit();
        String str = "always_send_reports_opt_in";
        localObject1 = ((SharedPreferences.Editor)localObject3).putBoolean(str, bool2);
        ((PreferenceStore)localObject2).save((SharedPreferences.Editor)localObject1);
      }
      localObject1 = this.preferenceStore;
      localObject2 = this.preferenceStore.edit();
      localObject3 = "preferences_migration_complete";
      SharedPreferences.Editor localEditor = ((SharedPreferences.Editor)localObject2).putBoolean((String)localObject3, bool1);
      ((PreferenceStore)localObject1).save(localEditor);
      return this.preferenceStore.get().getBoolean("always_send_reports_opt_in", false);
      label219:
      bool2 = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\PreferenceManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */