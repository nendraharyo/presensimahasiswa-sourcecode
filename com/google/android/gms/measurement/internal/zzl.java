package com.google.android.gms.measurement.internal;

public final class zzl
{
  public static zzl.zza zzaVY;
  public static zzl.zza zzaVZ;
  public static zzl.zza zzaWa;
  public static zzl.zza zzaWb;
  public static zzl.zza zzaWc;
  public static zzl.zza zzaWd;
  public static zzl.zza zzaWe;
  public static zzl.zza zzaWf;
  public static zzl.zza zzaWg;
  public static zzl.zza zzaWh;
  public static zzl.zza zzaWi;
  public static zzl.zza zzaWj;
  public static zzl.zza zzaWk;
  public static zzl.zza zzaWl;
  public static zzl.zza zzaWm;
  public static zzl.zza zzaWn;
  public static zzl.zza zzaWo;
  public static zzl.zza zzaWp;
  public static zzl.zza zzaWq;
  public static zzl.zza zzaWr;
  public static zzl.zza zzaWs;
  public static zzl.zza zzaWt = zzl.zza.zze("measurement.upload.initial_upload_delay_time", 15000L);
  public static zzl.zza zzaWu = zzl.zza.zze("measurement.upload.retry_time", 1800000L);
  public static zzl.zza zzaWv = zzl.zza.zzD("measurement.upload.retry_count", 6);
  public static zzl.zza zzaWw = zzl.zza.zze("measurement.upload.max_queue_time", 2419200000L);
  public static zzl.zza zzaWx = zzl.zza.zzD("measurement.lifetimevalue.max_currency_tracked", 4);
  public static zzl.zza zzaWy = zzl.zza.zze("measurement.service_client.idle_disconnect_millis", 5000L);
  
  static
  {
    long l1 = 3600000L;
    int i = 100000;
    int j = 65536;
    boolean bool = true;
    long l2 = 86400000L;
    zzaVY = zzl.zza.zzm("measurement.service_enabled", bool);
    zzaVZ = zzl.zza.zzm("measurement.service_client_enabled", bool);
    zzaWa = zzl.zza.zzl("measurement.log_tag", "GMPM", "GMPM-SVC");
    zzaWb = zzl.zza.zze("measurement.ad_id_cache_time", 10000L);
    zzaWc = zzl.zza.zze("measurement.monitoring.sample_period_millis", l2);
    zzaWd = zzl.zza.zze("measurement.config.cache_time", l2);
    zzaWe = zzl.zza.zzN("measurement.config.url_scheme", "https");
    zzaWf = zzl.zza.zzN("measurement.config.url_authority", "app-measurement.com");
    zzaWg = zzl.zza.zzD("measurement.upload.max_bundles", 100);
    zzaWh = zzl.zza.zzD("measurement.upload.max_batch_size", j);
    zzaWi = zzl.zza.zzD("measurement.upload.max_bundle_size", j);
    zzaWj = zzl.zza.zzD("measurement.upload.max_events_per_bundle", 1000);
    zzaWk = zzl.zza.zzD("measurement.upload.max_events_per_day", i);
    zzaWl = zzl.zza.zzD("measurement.upload.max_public_events_per_day", 50000);
    zzaWm = zzl.zza.zzD("measurement.upload.max_conversions_per_day", 500);
    zzaWn = zzl.zza.zzD("measurement.store.max_stored_events_per_app", i);
    zzaWo = zzl.zza.zzN("measurement.upload.url", "https://app-measurement.com/a");
    zzaWp = zzl.zza.zze("measurement.upload.backoff_period", 43200000L);
    zzaWq = zzl.zza.zze("measurement.upload.window_interval", l1);
    zzaWr = zzl.zza.zze("measurement.upload.interval", l1);
    zzaWs = zzl.zza.zze("measurement.upload.stale_data_deletion_interval", l2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */