package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.zza;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

class zzt
  extends zzz
{
  static final Pair zzaXh;
  private SharedPreferences zzTh;
  public final zzt.zzc zzaXi;
  public final zzt.zzb zzaXj;
  public final zzt.zzb zzaXk;
  public final zzt.zzb zzaXl;
  public final zzt.zzb zzaXm;
  public final zzt.zzb zzaXn;
  private String zzaXo;
  private boolean zzaXp;
  private long zzaXq;
  private final SecureRandom zzaXr;
  public final zzt.zzb zzaXs;
  public final zzt.zzb zzaXt;
  public final zzt.zza zzaXu;
  public final zzt.zzb zzaXv;
  public final zzt.zzb zzaXw;
  public boolean zzaXx;
  
  static
  {
    Pair localPair = new android/util/Pair;
    Long localLong = Long.valueOf(0L);
    localPair.<init>("", localLong);
    zzaXh = localPair;
  }
  
  zzt(zzw paramzzw)
  {
    super(paramzzw);
    zzt.zzc localzzc = new com/google/android/gms/measurement/internal/zzt$zzc;
    long l2 = zzCp().zzkX();
    localzzc.<init>(this, "health_monitor", l2, null);
    this.zzaXi = localzzc;
    Object localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "last_upload", l1);
    this.zzaXj = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "last_upload_attempt", l1);
    this.zzaXk = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "backoff", l1);
    this.zzaXl = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "last_delete_stale", l1);
    this.zzaXm = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "time_before_start", 10000L);
    this.zzaXs = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "session_timeout", 1800000L);
    this.zzaXt = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zza;
    ((zzt.zza)localObject).<init>(this, "start_new_session", true);
    this.zzaXu = ((zzt.zza)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "last_pause_time", l1);
    this.zzaXv = ((zzt.zzb)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "time_active", l1);
    this.zzaXw = ((zzt.zzb)localObject);
    localObject = new java/security/SecureRandom;
    ((SecureRandom)localObject).<init>();
    this.zzaXr = ((SecureRandom)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzt$zzb;
    ((zzt.zzb)localObject).<init>(this, "midnight_offset", l1);
    this.zzaXn = ((zzt.zzb)localObject);
  }
  
  private SharedPreferences zzCO()
  {
    zzjk();
    zzjv();
    return this.zzTh;
  }
  
  void setMeasurementEnabled(boolean paramBoolean)
  {
    zzjk();
    Object localObject = zzAo().zzCK();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    ((zzp.zza)localObject).zzj("Setting measurementEnabled", localBoolean);
    localObject = zzCO().edit();
    ((SharedPreferences.Editor)localObject).putBoolean("measurement_enabled", paramBoolean);
    ((SharedPreferences.Editor)localObject).apply();
  }
  
  boolean zzAr()
  {
    zzjk();
    SharedPreferences localSharedPreferences = zzCO();
    String str = "measurement_enabled";
    boolean bool = zza.zzAs();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return localSharedPreferences.getBoolean(str, bool);
    }
  }
  
  String zzCM()
  {
    int i = 1;
    byte[] arrayOfByte = new byte[16];
    this.zzaXr.nextBytes(arrayOfByte);
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[i];
    BigInteger localBigInteger = new java/math/BigInteger;
    localBigInteger.<init>(i, arrayOfByte);
    arrayOfObject[0] = localBigInteger;
    return String.format(localLocale, "%032x", arrayOfObject);
  }
  
  long zzCN()
  {
    zzjv();
    zzjk();
    Object localObject = this.zzaXn;
    long l1 = ((zzt.zzb)localObject).get();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = this.zzaXr;
      int i = 86400000;
      int j = ((SecureRandom)localObject).nextInt(i) + 1;
      l1 = j;
      zzt.zzb localzzb = this.zzaXn;
      localzzb.set(l1);
    }
    return l1;
  }
  
  Boolean zzCP()
  {
    zzjk();
    Object localObject = zzCO();
    String str = "use_service";
    boolean bool = ((SharedPreferences)localObject).contains(str);
    if (!bool) {
      bool = false;
    }
    for (localObject = null;; localObject = Boolean.valueOf(bool))
    {
      return (Boolean)localObject;
      localObject = zzCO();
      str = "use_service";
      bool = ((SharedPreferences)localObject).getBoolean(str, false);
    }
  }
  
  protected String zzCQ()
  {
    zzjk();
    Object localObject = zzCO();
    SharedPreferences.Editor localEditor = null;
    localObject = ((SharedPreferences)localObject).getString("previous_os_version", null);
    String str1 = zzCh().zzCy();
    boolean bool = TextUtils.isEmpty(str1);
    if (!bool)
    {
      bool = str1.equals(localObject);
      if (!bool)
      {
        localEditor = zzCO().edit();
        String str2 = "previous_os_version";
        localEditor.putString(str2, str1);
        localEditor.apply();
      }
    }
    return (String)localObject;
  }
  
  void zzar(boolean paramBoolean)
  {
    zzjk();
    Object localObject = zzAo().zzCK();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    ((zzp.zza)localObject).zzj("Setting useService", localBoolean);
    localObject = zzCO().edit();
    ((SharedPreferences.Editor)localObject).putBoolean("use_service", paramBoolean);
    ((SharedPreferences.Editor)localObject).apply();
  }
  
  Pair zzfh(String paramString)
  {
    zzjk();
    Object localObject1 = zzjl();
    long l1 = ((zzmq)localObject1).elapsedRealtime();
    localObject3 = this.zzaXo;
    long l2;
    boolean bool1;
    if (localObject3 != null)
    {
      l2 = this.zzaXq;
      bool1 = l1 < l2;
      if (bool1)
      {
        localObject1 = new android/util/Pair;
        localObject4 = this.zzaXo;
        bool1 = this.zzaXp;
        localObject3 = Boolean.valueOf(bool1);
        ((Pair)localObject1).<init>(localObject4, localObject3);
      }
    }
    for (;;)
    {
      return (Pair)localObject1;
      localObject3 = zzCp();
      l2 = ((zzd)localObject3).zzeS(paramString);
      l1 += l2;
      this.zzaXq = l1;
      boolean bool2 = true;
      AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(bool2);
      try
      {
        localObject1 = getContext();
        localObject1 = AdvertisingIdClient.getAdvertisingIdInfo((Context)localObject1);
        localObject4 = ((AdvertisingIdClient.Info)localObject1).getId();
        this.zzaXo = ((String)localObject4);
        bool2 = ((AdvertisingIdClient.Info)localObject1).isLimitAdTrackingEnabled();
        this.zzaXp = bool2;
      }
      finally
      {
        for (;;)
        {
          localObject4 = zzAo().zzCJ();
          localObject3 = "Unable to get advertising id";
          ((zzp.zza)localObject4).zzj((String)localObject3, localObject2);
          String str = "";
          this.zzaXo = str;
        }
      }
      bool2 = false;
      AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
      localObject1 = new android/util/Pair;
      localObject4 = this.zzaXo;
      bool1 = this.zzaXp;
      localObject3 = Boolean.valueOf(bool1);
      ((Pair)localObject1).<init>(localObject4, localObject3);
    }
  }
  
  String zzfi(String paramString)
  {
    int i = 1;
    Object localObject = (String)zzfh(paramString).first;
    MessageDigest localMessageDigest = zzaj.zzbv("MD5");
    if (localMessageDigest == null) {}
    Locale localLocale;
    String str;
    Object[] arrayOfObject;
    for (localObject = null;; localObject = String.format(localLocale, str, arrayOfObject))
    {
      return (String)localObject;
      localLocale = Locale.US;
      str = "%032X";
      arrayOfObject = new Object[i];
      BigInteger localBigInteger = new java/math/BigInteger;
      localObject = ((String)localObject).getBytes();
      localObject = localMessageDigest.digest((byte[])localObject);
      localBigInteger.<init>(i, (byte[])localObject);
      arrayOfObject[0] = localBigInteger;
    }
  }
  
  protected void zziJ()
  {
    boolean bool1 = false;
    Object localObject = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    this.zzTh = ((SharedPreferences)localObject);
    localObject = this.zzTh;
    String str = "has_been_opened";
    boolean bool2 = ((SharedPreferences)localObject).getBoolean(str, false);
    this.zzaXx = bool2;
    bool2 = this.zzaXx;
    if (!bool2)
    {
      localObject = this.zzTh.edit();
      str = "has_been_opened";
      bool1 = true;
      ((SharedPreferences.Editor)localObject).putBoolean(str, bool1);
      ((SharedPreferences.Editor)localObject).apply();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */