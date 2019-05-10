package com.crashlytics.android.answers;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

class AnswersPreferenceManager
{
  static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
  static final String PREF_STORE_NAME = "settings";
  private final PreferenceStore prefStore;
  
  AnswersPreferenceManager(PreferenceStore paramPreferenceStore)
  {
    this.prefStore = paramPreferenceStore;
  }
  
  public static AnswersPreferenceManager build(Context paramContext)
  {
    PreferenceStoreImpl localPreferenceStoreImpl = new io/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
    localPreferenceStoreImpl.<init>(paramContext, "settings");
    AnswersPreferenceManager localAnswersPreferenceManager = new com/crashlytics/android/answers/AnswersPreferenceManager;
    localAnswersPreferenceManager.<init>(localPreferenceStoreImpl);
    return localAnswersPreferenceManager;
  }
  
  public boolean hasAnalyticsLaunched()
  {
    return this.prefStore.get().getBoolean("analytics_launched", false);
  }
  
  public void setAnalyticsLaunched()
  {
    PreferenceStore localPreferenceStore = this.prefStore;
    SharedPreferences.Editor localEditor = this.prefStore.edit().putBoolean("analytics_launched", true);
    localPreferenceStore.save(localEditor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersPreferenceManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */