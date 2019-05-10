package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzbt
{
  public static final zzbp zzvA;
  public static final zzbp zzvB;
  public static final zzbp zzvC;
  public static final zzbp zzvD;
  public static final zzbp zzvE;
  public static final zzbp zzvF;
  public static final zzbp zzvG;
  public static final zzbp zzvH;
  public static final zzbp zzvI;
  public static final zzbp zzvJ;
  public static final zzbp zzvK;
  public static final zzbp zzvL;
  public static final zzbp zzvM;
  public static final zzbp zzvN;
  public static final zzbp zzvO;
  public static final zzbp zzvP;
  public static final zzbp zzvQ;
  public static final zzbp zzvR;
  public static final zzbp zzvS;
  public static final zzbp zzvT;
  public static final zzbp zzvU;
  public static final zzbp zzvV;
  public static final zzbp zzvW;
  public static final zzbp zzvX;
  public static final zzbp zzvY;
  public static final zzbp zzvZ;
  public static final zzbp zzwA;
  public static final zzbp zzwB;
  public static final zzbp zzwC;
  public static final zzbp zzwD;
  public static final zzbp zzwE;
  public static final zzbp zzwF;
  public static final zzbp zzwG;
  public static final zzbp zzwH;
  public static final zzbp zzwI;
  public static final zzbp zzwJ;
  public static final zzbp zzwK;
  public static final zzbp zzwL;
  public static final zzbp zzwM;
  public static final zzbp zzwN;
  public static final zzbp zzwO;
  public static final zzbp zzwP;
  public static final zzbp zzwQ;
  public static final zzbp zzwR;
  public static final zzbp zzwS;
  public static final zzbp zzwT;
  public static final zzbp zzwU;
  public static final zzbp zzwV;
  public static final zzbp zzwW;
  public static final zzbp zzwX;
  public static final zzbp zzwY;
  public static final zzbp zzwZ;
  public static final zzbp zzwa;
  public static final zzbp zzwb;
  public static final zzbp zzwc;
  public static final zzbp zzwd;
  public static final zzbp zzwe;
  public static final zzbp zzwf;
  public static final zzbp zzwg;
  public static final zzbp zzwh;
  public static final zzbp zzwi;
  public static final zzbp zzwj;
  public static final zzbp zzwk;
  public static final zzbp zzwl;
  public static final zzbp zzwm;
  public static final zzbp zzwn;
  public static final zzbp zzwo;
  public static final zzbp zzwp;
  public static final zzbp zzwq;
  public static final zzbp zzwr;
  public static final zzbp zzws;
  public static final zzbp zzwt;
  public static final zzbp zzwu;
  public static final zzbp zzwv;
  public static final zzbp zzww;
  public static final zzbp zzwx;
  public static final zzbp zzwy;
  public static final zzbp zzwz;
  public static final zzbp zzxa;
  public static final zzbp zzxb;
  public static final zzbp zzxc;
  public static final zzbp zzxd;
  public static final zzbp zzxe;
  public static final zzbp zzxf;
  public static final zzbp zzxg;
  
  static
  {
    long l1 = 300L;
    int i = 8388608;
    int j = 10;
    int k = 1;
    zzvA = zzbp.zza(0, "gads:sdk_core_experiment_id");
    zzvB = zzbp.zza(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    Boolean localBoolean = Boolean.valueOf(false);
    zzvC = zzbp.zza(0, "gads:request_builder:singleton_webview", localBoolean);
    zzvD = zzbp.zza(0, "gads:request_builder:singleton_webview_experiment_id");
    localBoolean = Boolean.valueOf(false);
    zzvE = zzbp.zza(0, "gads:sdk_use_dynamic_module", localBoolean);
    zzvF = zzbp.zza(0, "gads:sdk_use_dynamic_module_experiment_id");
    localBoolean = Boolean.valueOf(false);
    zzvG = zzbp.zza(0, "gads:sdk_crash_report_enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzvH = zzbp.zza(0, "gads:sdk_crash_report_full_stacktrace", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzvI = zzbp.zza(0, "gads:block_autoclicks", localBoolean);
    zzvJ = zzbp.zza(0, "gads:block_autoclicks_experiment_id");
    zzvK = zzbp.zzb(0, "gads:prefetch:experiment_id");
    zzvL = zzbp.zza(0, "gads:spam_app_context:experiment_id");
    localBoolean = Boolean.valueOf(false);
    zzvM = zzbp.zza(0, "gads:spam_app_context:enabled", localBoolean);
    zzvN = zzbp.zza(0, "gads:video_stream_cache:experiment_id");
    zzvO = zzbp.zza(0, "gads:video_stream_cache:limit_count", 5);
    zzvP = zzbp.zza(0, "gads:video_stream_cache:limit_space", i);
    zzvQ = zzbp.zza(0, "gads:video_stream_exo_cache:buffer_size", i);
    zzvR = zzbp.zza(0, "gads:video_stream_cache:limit_time_sec", l1);
    zzvS = zzbp.zza(0, "gads:video_stream_cache:notify_interval_millis", 1000L);
    zzvT = zzbp.zza(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
    localBoolean = Boolean.valueOf(false);
    zzvU = zzbp.zza(0, "gads:video:metric_reporting_enabled", localBoolean);
    zzvV = zzbp.zza(0, "gads:video:metric_frame_hash_times", "");
    zzvW = zzbp.zza(0, "gads:video:metric_frame_hash_time_leniency", 500L);
    zzvX = zzbp.zzb(0, "gads:spam_ad_id_decorator:experiment_id");
    localBoolean = Boolean.valueOf(false);
    zzvY = zzbp.zza(0, "gads:spam_ad_id_decorator:enabled", localBoolean);
    zzvZ = zzbp.zzb(0, "gads:looper_for_gms_client:experiment_id");
    localBoolean = Boolean.valueOf(k);
    zzwa = zzbp.zza(0, "gads:looper_for_gms_client:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwb = zzbp.zza(0, "gads:sw_ad_request_service:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwc = zzbp.zza(0, "gads:sw_dynamite:enabled", localBoolean);
    zzwd = zzbp.zza(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    zzwe = zzbp.zza(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    zzwf = zzbp.zza(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    localBoolean = Boolean.valueOf(false);
    zzwg = zzbp.zza(0, "gads:enabled_sdk_csi", localBoolean);
    zzwh = zzbp.zza(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    localBoolean = Boolean.valueOf(false);
    zzwi = zzbp.zza(0, "gads:sdk_csi_write_to_file", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwj = zzbp.zza(0, "gads:enable_content_fetching", localBoolean);
    zzwk = zzbp.zza(0, "gads:content_length_weight", k);
    zzwl = zzbp.zza(0, "gads:content_age_weight", k);
    zzwm = zzbp.zza(0, "gads:min_content_len", 11);
    zzwn = zzbp.zza(0, "gads:fingerprint_number", j);
    zzwo = zzbp.zza(0, "gads:sleep_sec", j);
    localBoolean = Boolean.valueOf(k);
    zzwp = zzbp.zza(0, "gad:app_index_enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwq = zzbp.zza(0, "gads:app_index:without_content_info_present:enabled", localBoolean);
    zzwr = zzbp.zza(0, "gads:app_index:timeout_ms", 1000L);
    zzws = zzbp.zza(0, "gads:app_index:experiment_id");
    zzwt = zzbp.zza(0, "gads:kitkat_interstitial_workaround:experiment_id");
    localBoolean = Boolean.valueOf(k);
    zzwu = zzbp.zza(0, "gads:kitkat_interstitial_workaround:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwv = zzbp.zza(0, "gads:interstitial_follow_url", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzww = zzbp.zza(0, "gads:interstitial_follow_url:register_click", localBoolean);
    zzwx = zzbp.zza(0, "gads:interstitial_follow_url:experiment_id");
    localBoolean = Boolean.valueOf(k);
    zzwy = zzbp.zza(0, "gads:analytics_enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwz = zzbp.zza(0, "gads:ad_key_enabled", localBoolean);
    zzwA = zzbp.zza(0, "gads:webview_cache_version", 0);
    zzwB = zzbp.zzb(0, "gads:pan:experiment_id");
    zzwC = zzbp.zza(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    localBoolean = Boolean.valueOf(k);
    zzwD = zzbp.zza(0, "gads:ad_manager_creator:enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwE = zzbp.zza(k, "gads:interstitial_ad_pool:enabled", localBoolean);
    zzwF = zzbp.zza(k, "gads:interstitial_ad_pool:schema", "customTargeting");
    zzwG = zzbp.zza(k, "gads:interstitial_ad_pool:max_pools", 3);
    zzwH = zzbp.zza(k, "gads:interstitial_ad_pool:max_pool_depth", 2);
    zzwI = zzbp.zza(k, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    zzwJ = zzbp.zza(k, "gads:interstitial_ad_pool:experiment_id");
    localBoolean = Boolean.valueOf(false);
    zzwK = zzbp.zza(0, "gads:log:verbose_enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwL = zzbp.zza(0, "gads:device_info_caching:enabled", localBoolean);
    zzwM = zzbp.zza(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);
    localBoolean = Boolean.valueOf(false);
    zzwN = zzbp.zza(0, "gads:gen204_signals:enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwO = zzbp.zza(0, "gads:webview:error_reporting_enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwP = zzbp.zza(0, "gads:adid_reporting:enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwQ = zzbp.zza(0, "gads:ad_settings_page_reporting:enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwR = zzbp.zza(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwS = zzbp.zza(0, "gads:request_pkg:enabled", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzwT = zzbp.zza(0, "gads:gmsg:disable_back_button:enabled", localBoolean);
    zzwU = zzbp.zza(0, "gads:network:cache_prediction_duration_s", l1);
    localBoolean = Boolean.valueOf(k);
    zzwV = zzbp.zza(0, "gads:mediation:dynamite_first:admobadapter", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzwW = zzbp.zza(0, "gads:mediation:dynamite_first:adurladapter", localBoolean);
    zzwX = zzbp.zza(0, "gads:ad_loader:timeout_ms", 60000L);
    zzwY = zzbp.zza(0, "gads:rendering:timeout_ms", 60000L);
    localBoolean = Boolean.valueOf(false);
    zzwZ = zzbp.zza(0, "gads:adshield:enable_adshield_instrumentation", localBoolean);
    localBoolean = Boolean.valueOf(false);
    zzxa = zzbp.zza(0, "gass:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzxb = zzbp.zza(0, "gass:enable_int_signal", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzxc = zzbp.zza(0, "gads:adid_notification:first_party_check:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzxd = zzbp.zza(0, "gads:edu_device_helper:enabled", localBoolean);
    localBoolean = Boolean.valueOf(k);
    zzxe = zzbp.zza(0, "gads:support_screen_shot", localBoolean);
    long l2 = TimeUnit.HOURS.toMillis(12);
    zzxf = zzbp.zza(0, "gads:js_flags:update_interval", l2);
    localBoolean = Boolean.valueOf(false);
    zzxg = zzbp.zza(0, "gads:custom_render:ping_on_ad_rendered", localBoolean);
  }
  
  public static void initialize(Context paramContext)
  {
    zzbt.1 local1 = new com/google/android/gms/internal/zzbt$1;
    local1.<init>(paramContext);
    zzjb.zzb(local1);
  }
  
  public static List zzdr()
  {
    return zzr.zzbK().zzdr();
  }
  
  public static List zzds()
  {
    return zzr.zzbK().zzds();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */