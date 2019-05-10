package com.google.android.gms.analytics.internal;

public final class zzy
{
  public static zzy.zza zzRJ;
  public static zzy.zza zzRK;
  public static zzy.zza zzRL;
  public static zzy.zza zzRM;
  public static zzy.zza zzRN;
  public static zzy.zza zzRO;
  public static zzy.zza zzRP;
  public static zzy.zza zzRQ;
  public static zzy.zza zzRR;
  public static zzy.zza zzRS;
  public static zzy.zza zzRT;
  public static zzy.zza zzRU;
  public static zzy.zza zzRV;
  public static zzy.zza zzRW;
  public static zzy.zza zzRX;
  public static zzy.zza zzRY;
  public static zzy.zza zzRZ;
  public static zzy.zza zzSa;
  public static zzy.zza zzSb;
  public static zzy.zza zzSc;
  public static zzy.zza zzSd;
  public static zzy.zza zzSe;
  public static zzy.zza zzSf;
  public static zzy.zza zzSg;
  public static zzy.zza zzSh;
  public static zzy.zza zzSi;
  public static zzy.zza zzSj;
  public static zzy.zza zzSk;
  public static zzy.zza zzSl;
  public static zzy.zza zzSm;
  public static zzy.zza zzSn;
  public static zzy.zza zzSo;
  public static zzy.zza zzSp;
  public static zzy.zza zzSq;
  public static zzy.zza zzSr;
  public static zzy.zza zzSs;
  public static zzy.zza zzSt;
  public static zzy.zza zzSu;
  public static zzy.zza zzSv;
  public static zzy.zza zzSw;
  public static zzy.zza zzSx;
  public static zzy.zza zzSy;
  public static zzy.zza zzSz;
  
  static
  {
    long l1 = 86400000L;
    int i = 8192;
    int j = 20;
    long l2 = 5000L;
    zzRJ = zzy.zza.zzg("analytics.service_enabled", false);
    zzRK = zzy.zza.zzg("analytics.service_client_enabled", true);
    zzRL = zzy.zza.zze("analytics.log_tag", "GAv4", "GAv4-SVC");
    zzRM = zzy.zza.zzb("analytics.max_tokens", 60);
    zzRN = zzy.zza.zza("analytics.tokens_per_sec", 0.5F);
    zzRO = zzy.zza.zza("analytics.max_stored_hits", 2000, 20000);
    zzRP = zzy.zza.zzd("analytics.max_stored_hits_per_app", 2000);
    zzRQ = zzy.zza.zzd("analytics.max_stored_properties_per_app", 100);
    zzRR = zzy.zza.zza("analytics.local_dispatch_millis", 1800000L, 120000L);
    zzRS = zzy.zza.zza("analytics.initial_local_dispatch_millis", l2, l2);
    zzRT = zzy.zza.zzb("analytics.min_local_dispatch_millis", 120000L);
    zzRU = zzy.zza.zzb("analytics.max_local_dispatch_millis", 7200000L);
    zzRV = zzy.zza.zzb("analytics.dispatch_alarm_millis", 7200000L);
    zzRW = zzy.zza.zzb("analytics.max_dispatch_alarm_millis", 32400000L);
    zzRX = zzy.zza.zzd("analytics.max_hits_per_dispatch", j);
    zzRY = zzy.zza.zzd("analytics.max_hits_per_batch", j);
    zzRZ = zzy.zza.zzl("analytics.insecure_host", "http://www.google-analytics.com");
    zzSa = zzy.zza.zzl("analytics.secure_host", "https://ssl.google-analytics.com");
    zzSb = zzy.zza.zzl("analytics.simple_endpoint", "/collect");
    zzSc = zzy.zza.zzl("analytics.batching_endpoint", "/batch");
    zzSd = zzy.zza.zzd("analytics.max_get_length", 2036);
    String str1 = zzm.zzRo.name();
    String str2 = zzm.zzRo.name();
    zzSe = zzy.zza.zze("analytics.batching_strategy.k", str1, str2);
    str1 = zzo.zzRv.name();
    zzSf = zzy.zza.zzl("analytics.compression_strategy.k", str1);
    zzSg = zzy.zza.zzd("analytics.max_hits_per_request.k", j);
    zzSh = zzy.zza.zzd("analytics.max_hit_length.k", i);
    zzSi = zzy.zza.zzd("analytics.max_post_length.k", i);
    zzSj = zzy.zza.zzd("analytics.max_batch_post_length", i);
    zzSk = zzy.zza.zzl("analytics.fallback_responses.k", "404,502");
    zzSl = zzy.zza.zzd("analytics.batch_retry_interval.seconds.k", 3600);
    zzSm = zzy.zza.zzb("analytics.service_monitor_interval", l1);
    zzSn = zzy.zza.zzd("analytics.http_connection.connect_timeout_millis", 60000);
    zzSo = zzy.zza.zzd("analytics.http_connection.read_timeout_millis", 61000);
    zzSp = zzy.zza.zzb("analytics.campaigns.time_limit", l1);
    zzSq = zzy.zza.zzl("analytics.first_party_experiment_id", "");
    zzSr = zzy.zza.zzd("analytics.first_party_experiment_variant", 0);
    zzSs = zzy.zza.zzg("analytics.test.disable_receiver", false);
    zzSt = zzy.zza.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    zzSu = zzy.zza.zzb("analytics.service_client.connect_timeout_millis", l2);
    zzSv = zzy.zza.zzb("analytics.service_client.second_connect_delay_millis", l2);
    zzSw = zzy.zza.zzb("analytics.service_client.unexpected_reconnect_millis", 60000L);
    zzSx = zzy.zza.zzb("analytics.service_client.reconnect_throttle_millis", 1800000L);
    zzSy = zzy.zza.zzb("analytics.monitoring.sample_period_millis", l1);
    zzSz = zzy.zza.zzb("analytics.initialization_warning_threshold", l2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */