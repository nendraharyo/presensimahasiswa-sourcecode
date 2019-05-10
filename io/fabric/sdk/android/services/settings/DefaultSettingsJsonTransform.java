package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONObject;

class DefaultSettingsJsonTransform
  implements SettingsJsonTransform
{
  private AnalyticsSettingsData buildAnalyticsSessionDataFrom(JSONObject paramJSONObject)
  {
    int i = 1;
    String str = paramJSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events");
    int j = paramJSONObject.optInt("flush_interval_secs", 600);
    int k = paramJSONObject.optInt("max_byte_size_per_file", 8000);
    int m = paramJSONObject.optInt("max_file_count_per_send", i);
    int n = paramJSONObject.optInt("max_pending_send_file_count", 100);
    boolean bool2 = paramJSONObject.optBoolean("forward_to_google_analytics", false);
    boolean bool3 = paramJSONObject.optBoolean("include_purchase_events_in_forwarded_events", false);
    boolean bool4 = paramJSONObject.optBoolean("track_custom_events", i);
    boolean bool5 = paramJSONObject.optBoolean("track_predefined_events", i);
    int i1 = paramJSONObject.optInt("sampling_rate", i);
    boolean bool1 = paramJSONObject.optBoolean("flush_on_background", i);
    AnalyticsSettingsData localAnalyticsSettingsData = new io/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    localAnalyticsSettingsData.<init>(str, j, k, m, n, bool2, bool3, bool4, bool5, i1, bool1);
    return localAnalyticsSettingsData;
  }
  
  private AppSettingsData buildAppDataFrom(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.getString("identifier");
    String str2 = paramJSONObject.getString("status");
    String str3 = paramJSONObject.getString("url");
    String str4 = paramJSONObject.getString("reports_url");
    String str5 = paramJSONObject.getString("ndk_reports_url");
    boolean bool1 = paramJSONObject.optBoolean("update_required", false);
    AppIconSettingsData localAppIconSettingsData = null;
    Object localObject = "icon";
    boolean bool2 = paramJSONObject.has((String)localObject);
    if (bool2)
    {
      localObject = paramJSONObject.getJSONObject("icon");
      String str6 = "hash";
      bool2 = ((JSONObject)localObject).has(str6);
      if (bool2)
      {
        localObject = paramJSONObject.getJSONObject("icon");
        localAppIconSettingsData = buildIconDataFrom((JSONObject)localObject);
      }
    }
    localObject = new io/fabric/sdk/android/services/settings/AppSettingsData;
    ((AppSettingsData)localObject).<init>(str1, str2, str3, str4, str5, bool1, localAppIconSettingsData);
    return (AppSettingsData)localObject;
  }
  
  private BetaSettingsData buildBetaSettingsDataFrom(JSONObject paramJSONObject)
  {
    String str1 = SettingsJsonConstants.BETA_UPDATE_ENDPOINT_DEFAULT;
    String str2 = paramJSONObject.optString("update_endpoint", str1);
    int i = paramJSONObject.optInt("update_suspend_duration", 3600);
    BetaSettingsData localBetaSettingsData = new io/fabric/sdk/android/services/settings/BetaSettingsData;
    localBetaSettingsData.<init>(str2, i);
    return localBetaSettingsData;
  }
  
  private FeaturesSettingsData buildFeaturesSessionDataFrom(JSONObject paramJSONObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramJSONObject.optBoolean("prompt_enabled", false);
    boolean bool3 = paramJSONObject.optBoolean("collect_logged_exceptions", bool1);
    bool1 = paramJSONObject.optBoolean("collect_reports", bool1);
    boolean bool4 = paramJSONObject.optBoolean("collect_analytics", false);
    boolean bool5 = paramJSONObject.optBoolean("firebase_crashlytics_enabled", false);
    FeaturesSettingsData localFeaturesSettingsData = new io/fabric/sdk/android/services/settings/FeaturesSettingsData;
    localFeaturesSettingsData.<init>(bool2, bool3, bool1, bool4, bool5);
    return localFeaturesSettingsData;
  }
  
  private AppIconSettingsData buildIconDataFrom(JSONObject paramJSONObject)
  {
    String str = paramJSONObject.getString("hash");
    int i = paramJSONObject.getInt("width");
    int j = paramJSONObject.getInt("height");
    AppIconSettingsData localAppIconSettingsData = new io/fabric/sdk/android/services/settings/AppIconSettingsData;
    localAppIconSettingsData.<init>(str, i, j);
    return localAppIconSettingsData;
  }
  
  private PromptSettingsData buildPromptDataFrom(JSONObject paramJSONObject)
  {
    boolean bool1 = true;
    String str1 = paramJSONObject.optString("title", "Send Crash Report?");
    String str2 = paramJSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report.");
    String str3 = paramJSONObject.optString("send_button_title", "Send");
    boolean bool2 = paramJSONObject.optBoolean("show_cancel_button", bool1);
    String str4 = paramJSONObject.optString("cancel_button_title", "Don't Send");
    bool1 = paramJSONObject.optBoolean("show_always_send_button", bool1);
    String str5 = paramJSONObject.optString("always_send_button_title", "Always Send");
    PromptSettingsData localPromptSettingsData = new io/fabric/sdk/android/services/settings/PromptSettingsData;
    localPromptSettingsData.<init>(str1, str2, str3, bool2, str4, bool1, str5);
    return localPromptSettingsData;
  }
  
  private SessionSettingsData buildSessionDataFrom(JSONObject paramJSONObject)
  {
    int i = 64;
    int j = paramJSONObject.optInt("log_buffer_size", 64000);
    int k = paramJSONObject.optInt("max_chained_exception_depth", 8);
    int m = paramJSONObject.optInt("max_custom_exception_events", i);
    i = paramJSONObject.optInt("max_custom_key_value_pairs", i);
    int n = paramJSONObject.optInt("identifier_mask", 255);
    boolean bool = paramJSONObject.optBoolean("send_session_without_crash", false);
    int i1 = paramJSONObject.optInt("max_complete_sessions_count", 4);
    SessionSettingsData localSessionSettingsData = new io/fabric/sdk/android/services/settings/SessionSettingsData;
    localSessionSettingsData.<init>(j, k, m, i, n, bool, i1);
    return localSessionSettingsData;
  }
  
  private long getExpiresAtFrom(CurrentTimeProvider paramCurrentTimeProvider, long paramLong, JSONObject paramJSONObject)
  {
    String str = "expires_at";
    boolean bool = paramJSONObject.has(str);
    if (bool) {
      str = "expires_at";
    }
    long l2;
    for (long l1 = paramJSONObject.getLong(str);; l1 += l2)
    {
      return l1;
      l1 = paramCurrentTimeProvider.getCurrentTimeMillis();
      l2 = 1000L * paramLong;
    }
  }
  
  private JSONObject toAnalyticsJson(AnalyticsSettingsData paramAnalyticsSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = paramAnalyticsSettingsData.analyticsURL;
    localJSONObject = localJSONObject.put("url", str);
    int i = paramAnalyticsSettingsData.flushIntervalSeconds;
    localJSONObject = localJSONObject.put("flush_interval_secs", i);
    i = paramAnalyticsSettingsData.maxByteSizePerFile;
    localJSONObject = localJSONObject.put("max_byte_size_per_file", i);
    i = paramAnalyticsSettingsData.maxFileCountPerSend;
    localJSONObject = localJSONObject.put("max_file_count_per_send", i);
    i = paramAnalyticsSettingsData.maxPendingSendFileCount;
    return localJSONObject.put("max_pending_send_file_count", i);
  }
  
  private JSONObject toAppJson(AppSettingsData paramAppSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = paramAppSettingsData.identifier;
    localJSONObject = localJSONObject.put("identifier", localObject1);
    localObject1 = paramAppSettingsData.status;
    localJSONObject = localJSONObject.put("status", localObject1);
    localObject1 = paramAppSettingsData.url;
    localJSONObject = localJSONObject.put("url", localObject1);
    localObject1 = paramAppSettingsData.reportsUrl;
    localJSONObject = localJSONObject.put("reports_url", localObject1);
    localObject1 = paramAppSettingsData.ndkReportsUrl;
    localJSONObject = localJSONObject.put("ndk_reports_url", localObject1);
    boolean bool = paramAppSettingsData.updateRequired;
    localJSONObject = localJSONObject.put("update_required", bool);
    Object localObject2 = paramAppSettingsData.icon;
    if (localObject2 != null)
    {
      localObject2 = "icon";
      localObject1 = paramAppSettingsData.icon;
      localObject1 = toIconJson((AppIconSettingsData)localObject1);
      localJSONObject.put((String)localObject2, localObject1);
    }
    return localJSONObject;
  }
  
  private JSONObject toBetaJson(BetaSettingsData paramBetaSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = paramBetaSettingsData.updateUrl;
    localJSONObject = localJSONObject.put("update_endpoint", str);
    int i = paramBetaSettingsData.updateSuspendDurationSeconds;
    return localJSONObject.put("update_suspend_duration", i);
  }
  
  private JSONObject toFeaturesJson(FeaturesSettingsData paramFeaturesSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    boolean bool = paramFeaturesSettingsData.collectLoggedException;
    localJSONObject = localJSONObject.put("collect_logged_exceptions", bool);
    bool = paramFeaturesSettingsData.collectReports;
    localJSONObject = localJSONObject.put("collect_reports", bool);
    bool = paramFeaturesSettingsData.collectAnalytics;
    return localJSONObject.put("collect_analytics", bool);
  }
  
  private JSONObject toIconJson(AppIconSettingsData paramAppIconSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = paramAppIconSettingsData.hash;
    localJSONObject = localJSONObject.put("hash", str);
    int i = paramAppIconSettingsData.width;
    localJSONObject = localJSONObject.put("width", i);
    i = paramAppIconSettingsData.height;
    return localJSONObject.put("height", i);
  }
  
  private JSONObject toPromptJson(PromptSettingsData paramPromptSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = paramPromptSettingsData.title;
    localJSONObject = localJSONObject.put("title", str);
    str = paramPromptSettingsData.message;
    localJSONObject = localJSONObject.put("message", str);
    str = paramPromptSettingsData.sendButtonTitle;
    localJSONObject = localJSONObject.put("send_button_title", str);
    boolean bool = paramPromptSettingsData.showCancelButton;
    localJSONObject = localJSONObject.put("show_cancel_button", bool);
    str = paramPromptSettingsData.cancelButtonTitle;
    localJSONObject = localJSONObject.put("cancel_button_title", str);
    bool = paramPromptSettingsData.showAlwaysSendButton;
    localJSONObject = localJSONObject.put("show_always_send_button", bool);
    str = paramPromptSettingsData.alwaysSendButtonTitle;
    return localJSONObject.put("always_send_button_title", str);
  }
  
  private JSONObject toSessionJson(SessionSettingsData paramSessionSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    int i = paramSessionSettingsData.logBufferSize;
    localJSONObject = localJSONObject.put("log_buffer_size", i);
    i = paramSessionSettingsData.maxChainedExceptionDepth;
    localJSONObject = localJSONObject.put("max_chained_exception_depth", i);
    i = paramSessionSettingsData.maxCustomExceptionEvents;
    localJSONObject = localJSONObject.put("max_custom_exception_events", i);
    i = paramSessionSettingsData.maxCustomKeyValuePairs;
    localJSONObject = localJSONObject.put("max_custom_key_value_pairs", i);
    i = paramSessionSettingsData.identifierMask;
    localJSONObject = localJSONObject.put("identifier_mask", i);
    boolean bool = paramSessionSettingsData.sendSessionWithoutCrash;
    return localJSONObject.put("send_session_without_crash", bool);
  }
  
  public SettingsData buildFromJson(CurrentTimeProvider paramCurrentTimeProvider, JSONObject paramJSONObject)
  {
    int i = paramJSONObject.optInt("settings_version", 0);
    int j = paramJSONObject.optInt("cache_duration", 3600);
    JSONObject localJSONObject = paramJSONObject.getJSONObject("app");
    AppSettingsData localAppSettingsData = buildAppDataFrom(localJSONObject);
    localJSONObject = paramJSONObject.getJSONObject("session");
    SessionSettingsData localSessionSettingsData = buildSessionDataFrom(localJSONObject);
    localJSONObject = paramJSONObject.getJSONObject("prompt");
    PromptSettingsData localPromptSettingsData = buildPromptDataFrom(localJSONObject);
    localJSONObject = paramJSONObject.getJSONObject("features");
    FeaturesSettingsData localFeaturesSettingsData = buildFeaturesSessionDataFrom(localJSONObject);
    localJSONObject = paramJSONObject.getJSONObject("analytics");
    AnalyticsSettingsData localAnalyticsSettingsData = buildAnalyticsSessionDataFrom(localJSONObject);
    localJSONObject = paramJSONObject.getJSONObject("beta");
    BetaSettingsData localBetaSettingsData = buildBetaSettingsDataFrom(localJSONObject);
    long l1 = j;
    long l2 = getExpiresAtFrom(paramCurrentTimeProvider, l1, paramJSONObject);
    SettingsData localSettingsData = new io/fabric/sdk/android/services/settings/SettingsData;
    localSettingsData.<init>(l2, localAppSettingsData, localSessionSettingsData, localPromptSettingsData, localFeaturesSettingsData, localAnalyticsSettingsData, localBetaSettingsData, i, j);
    return localSettingsData;
  }
  
  public JSONObject toJson(SettingsData paramSettingsData)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l = paramSettingsData.expiresAtMillis;
    localJSONObject = localJSONObject.put("expires_at", l);
    int i = paramSettingsData.cacheDuration;
    localJSONObject = localJSONObject.put("cache_duration", i);
    i = paramSettingsData.settingsVersion;
    localJSONObject = localJSONObject.put("settings_version", i);
    Object localObject = paramSettingsData.featuresData;
    localObject = toFeaturesJson((FeaturesSettingsData)localObject);
    localJSONObject = localJSONObject.put("features", localObject);
    localObject = paramSettingsData.analyticsSettingsData;
    localObject = toAnalyticsJson((AnalyticsSettingsData)localObject);
    localJSONObject = localJSONObject.put("analytics", localObject);
    localObject = paramSettingsData.betaSettingsData;
    localObject = toBetaJson((BetaSettingsData)localObject);
    localJSONObject = localJSONObject.put("beta", localObject);
    localObject = paramSettingsData.appData;
    localObject = toAppJson((AppSettingsData)localObject);
    localJSONObject = localJSONObject.put("app", localObject);
    localObject = paramSettingsData.sessionData;
    localObject = toSessionJson((SessionSettingsData)localObject);
    localJSONObject = localJSONObject.put("session", localObject);
    localObject = paramSettingsData.promptData;
    localObject = toPromptJson((PromptSettingsData)localObject);
    return localJSONObject.put("prompt", localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\DefaultSettingsJsonTransform.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */