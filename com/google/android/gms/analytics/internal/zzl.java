package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzpr;
import com.google.android.gms.measurement.zzc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzl
  extends zzd
{
  private boolean mStarted;
  private final zzj zzQY;
  private final zzah zzQZ;
  private final zzag zzRa;
  private final zzi zzRb;
  private long zzRc;
  private final zzt zzRd;
  private final zzt zzRe;
  private final zzaj zzRf;
  private long zzRg;
  private boolean zzRh;
  
  protected zzl(zzf paramzzf, zzg paramzzg)
  {
    super(paramzzf);
    zzx.zzz(paramzzg);
    this.zzRc = Long.MIN_VALUE;
    Object localObject = paramzzg.zzk(paramzzf);
    this.zzRa = ((zzag)localObject);
    localObject = paramzzg.zzm(paramzzf);
    this.zzQY = ((zzj)localObject);
    localObject = paramzzg.zzn(paramzzf);
    this.zzQZ = ((zzah)localObject);
    localObject = paramzzg.zzo(paramzzf);
    this.zzRb = ((zzi)localObject);
    localObject = new com/google/android/gms/analytics/internal/zzaj;
    zzmq localzzmq = zzjl();
    ((zzaj)localObject).<init>(localzzmq);
    this.zzRf = ((zzaj)localObject);
    localObject = new com/google/android/gms/analytics/internal/zzl$1;
    ((zzl.1)localObject).<init>(this, paramzzf);
    this.zzRd = ((zzt)localObject);
    localObject = new com/google/android/gms/analytics/internal/zzl$2;
    ((zzl.2)localObject).<init>(this, paramzzf);
    this.zzRe = ((zzt)localObject);
  }
  
  private void zza(zzh paramzzh, zzpr paramzzpr)
  {
    zzx.zzz(paramzzh);
    zzx.zzz(paramzzpr);
    Object localObject1 = new com/google/android/gms/analytics/zza;
    Object localObject2 = zzji();
    ((zza)localObject1).<init>((zzf)localObject2);
    localObject2 = paramzzh.zzjE();
    ((zza)localObject1).zzaS((String)localObject2);
    boolean bool1 = paramzzh.zzjF();
    ((zza)localObject1).enableAdvertisingIdCollection(bool1);
    zzc localzzc = ((zza)localObject1).zziy();
    localObject1 = (zzke)localzzc.zzf(zzke.class);
    ((zzke)localObject1).zzaX("data");
    bool1 = true;
    ((zzke)localObject1).zzI(bool1);
    localzzc.zzb(paramzzpr);
    localObject2 = (zzkd)localzzc.zzf(zzkd.class);
    zzpq localzzpq = (zzpq)localzzc.zzf(zzpq.class);
    Object localObject3 = paramzzh.zzn().entrySet();
    Iterator localIterator = ((Set)localObject3).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject3 = (Map.Entry)localIterator.next();
      String str1 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      String str2 = "an";
      boolean bool3 = str2.equals(str1);
      if (bool3)
      {
        localzzpq.setAppName((String)localObject3);
      }
      else
      {
        str2 = "av";
        bool3 = str2.equals(str1);
        if (bool3)
        {
          localzzpq.setAppVersion((String)localObject3);
        }
        else
        {
          str2 = "aid";
          bool3 = str2.equals(str1);
          if (bool3)
          {
            localzzpq.setAppId((String)localObject3);
          }
          else
          {
            str2 = "aiid";
            bool3 = str2.equals(str1);
            if (bool3)
            {
              localzzpq.setAppInstallerId((String)localObject3);
            }
            else
            {
              str2 = "uid";
              bool3 = str2.equals(str1);
              if (bool3) {
                ((zzke)localObject1).setUserId((String)localObject3);
              } else {
                ((zzkd)localObject2).set(str1, (String)localObject3);
              }
            }
          }
        }
      }
    }
    localObject2 = paramzzh.zzjE();
    zzb("Sending installation campaign to", localObject2, paramzzpr);
    long l = zzjq().zzlF();
    localzzc.zzM(l);
    localzzc.zzAy();
  }
  
  private boolean zzbk(String paramString)
  {
    Context localContext = getContext();
    int i = localContext.checkCallingOrSelfPermission(paramString);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localContext = null;
    }
  }
  
  private void zzjT()
  {
    Object localObject = zzji().getContext();
    boolean bool1 = AnalyticsReceiver.zzY((Context)localObject);
    String str;
    if (!bool1)
    {
      str = "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.";
      zzbg(str);
      bool1 = CampaignTrackingReceiver.zzY((Context)localObject);
      if (bool1) {
        break label66;
      }
      localObject = "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.";
      zzbg((String)localObject);
    }
    for (;;)
    {
      return;
      bool1 = AnalyticsService.zzZ((Context)localObject);
      if (bool1) {
        break;
      }
      str = "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.";
      zzbh(str);
      break;
      label66:
      boolean bool2 = CampaignTrackingService.zzZ((Context)localObject);
      if (!bool2)
      {
        localObject = "CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.";
        zzbg((String)localObject);
      }
    }
  }
  
  private void zzjV()
  {
    zzl.4 local4 = new com/google/android/gms/analytics/internal/zzl$4;
    local4.<init>(this);
    zzb(local4);
  }
  
  private void zzjW()
  {
    try
    {
      localObject = this.zzQY;
      ((zzj)localObject).zzjN();
      zzkb();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject;
        long l;
        String str = "Failed to delete stale hits";
        zzd(str, localSQLiteException);
      }
    }
    localObject = this.zzRe;
    l = zzjn().zzkT();
    ((zzt)localObject).zzt(l);
  }
  
  private boolean zzkc()
  {
    boolean bool1 = false;
    boolean bool2 = this.zzRh;
    if (bool2) {}
    for (;;)
    {
      return bool1;
      zzr localzzr = zzjn();
      bool2 = localzzr.zzkr();
      if (bool2)
      {
        localzzr = zzjn();
        bool2 = localzzr.zzks();
        if (!bool2) {}
      }
      else
      {
        long l1 = zzki();
        long l2 = 0L;
        bool2 = l1 < l2;
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  private void zzkd()
  {
    zzv localzzv = zzjp();
    boolean bool = localzzv.zzlb();
    if (!bool) {}
    for (;;)
    {
      return;
      bool = localzzv.zzbw();
      if (!bool)
      {
        long l1 = zzjO();
        long l2 = 0L;
        bool = l1 < l2;
        if (bool)
        {
          l1 = Math.abs(zzjl().currentTimeMillis() - l1);
          Object localObject = zzjn();
          l2 = ((zzr)localObject).zzkB();
          bool = l1 < l2;
          if (!bool)
          {
            l1 = zzjn().zzkA();
            localObject = "Dispatch alarm scheduled (ms)";
            Long localLong = Long.valueOf(l1);
            zza((String)localObject, localLong);
            localzzv.zzlc();
          }
        }
      }
    }
  }
  
  private void zzke()
  {
    long l1 = 0L;
    zzkd();
    long l2 = zzki();
    Object localObject1 = zzjq();
    long l3 = ((zzai)localObject1).zzlH();
    boolean bool1 = l3 < l1;
    zzt localzzt;
    if (bool1)
    {
      Object localObject2 = zzjl();
      long l4 = ((zzmq)localObject2).currentTimeMillis();
      l3 = Math.abs(l4 - l3);
      l3 = l2 - l3;
      bool1 = l3 < l1;
      if (bool1)
      {
        Long localLong = Long.valueOf(l3);
        zza("Dispatch scheduled (ms)", localLong);
        localzzt = this.zzRd;
        boolean bool2 = localzzt.zzbw();
        if (!bool2) {
          break label195;
        }
        l2 = 1L;
        localObject2 = this.zzRd;
        l4 = ((zzt)localObject2).zzkY();
        l3 += l4;
        l3 = Math.max(l2, l3);
        localzzt = this.zzRd;
        localzzt.zzu(l3);
      }
    }
    for (;;)
    {
      return;
      localObject1 = zzjn();
      l3 = Math.min(((zzr)localObject1).zzky(), l2);
      break;
      localObject1 = zzjn();
      l3 = Math.min(((zzr)localObject1).zzky(), l2);
      break;
      label195:
      localzzt = this.zzRd;
      localzzt.zzt(l3);
    }
  }
  
  private void zzkf()
  {
    zzkg();
    zzkh();
  }
  
  private void zzkg()
  {
    Object localObject = this.zzRd;
    boolean bool = ((zzt)localObject).zzbw();
    if (bool)
    {
      localObject = "All hits dispatched or no network/service. Going to power save mode";
      zzbd((String)localObject);
    }
    this.zzRd.cancel();
  }
  
  private void zzkh()
  {
    zzv localzzv = zzjp();
    boolean bool = localzzv.zzbw();
    if (bool) {
      localzzv.cancel();
    }
  }
  
  protected void onServiceConnected()
  {
    zzjk();
    zzr localzzr = zzjn();
    boolean bool = localzzr.zzkr();
    if (!bool) {
      zzjY();
    }
  }
  
  void start()
  {
    boolean bool1 = true;
    zzjv();
    boolean bool2 = this.mStarted;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      String str = "Analytics backend already started";
      zzx.zza(bool2, str);
      this.mStarted = bool1;
      Object localObject = zzjn();
      bool2 = ((zzr)localObject).zzkr();
      if (!bool2) {
        zzjT();
      }
      localObject = zzjo();
      zzl.3 local3 = new com/google/android/gms/analytics/internal/zzl$3;
      local3.<init>(this);
      ((com.google.android.gms.measurement.zzg)localObject).zzf(local3);
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public void zzJ(boolean paramBoolean)
  {
    zzkb();
  }
  
  /* Error */
  public long zza(zzh paramzzh, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 33	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 427	com/google/android/gms/analytics/internal/zzl:zzjv	()V
    //   9: aload_0
    //   10: invokevirtual 421	com/google/android/gms/analytics/internal/zzl:zzjk	()V
    //   13: aload_0
    //   14: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   17: astore_3
    //   18: aload_3
    //   19: invokevirtual 452	com/google/android/gms/analytics/internal/zzj:beginTransaction	()V
    //   22: aload_0
    //   23: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 455	com/google/android/gms/analytics/internal/zzh:zzjD	()J
    //   31: lstore 4
    //   33: aload_1
    //   34: invokevirtual 458	com/google/android/gms/analytics/internal/zzh:getClientId	()Ljava/lang/String;
    //   37: astore 6
    //   39: aload_3
    //   40: lload 4
    //   42: aload 6
    //   44: invokevirtual 461	com/google/android/gms/analytics/internal/zzj:zza	(JLjava/lang/String;)V
    //   47: aload_0
    //   48: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   51: astore_3
    //   52: aload_1
    //   53: invokevirtual 455	com/google/android/gms/analytics/internal/zzh:zzjD	()J
    //   56: lstore 4
    //   58: aload_1
    //   59: invokevirtual 458	com/google/android/gms/analytics/internal/zzh:getClientId	()Ljava/lang/String;
    //   62: astore 6
    //   64: aload_1
    //   65: invokevirtual 99	com/google/android/gms/analytics/internal/zzh:zzjE	()Ljava/lang/String;
    //   68: astore 7
    //   70: aload_3
    //   71: lload 4
    //   73: aload 6
    //   75: aload 7
    //   77: invokevirtual 464	com/google/android/gms/analytics/internal/zzj:zza	(JLjava/lang/String;Ljava/lang/String;)J
    //   80: lstore 8
    //   82: iload_2
    //   83: ifne +46 -> 129
    //   86: aload_1
    //   87: lload 8
    //   89: invokevirtual 466	com/google/android/gms/analytics/internal/zzh:zzn	(J)V
    //   92: aload_0
    //   93: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   96: astore 10
    //   98: aload 10
    //   100: aload_1
    //   101: invokevirtual 469	com/google/android/gms/analytics/internal/zzj:zzb	(Lcom/google/android/gms/analytics/internal/zzh;)V
    //   104: aload_0
    //   105: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   108: astore 10
    //   110: aload 10
    //   112: invokevirtual 472	com/google/android/gms/analytics/internal/zzj:setTransactionSuccessful	()V
    //   115: aload_0
    //   116: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   119: astore 10
    //   121: aload 10
    //   123: invokevirtual 475	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   126: lload 8
    //   128: lreturn
    //   129: lconst_1
    //   130: lload 8
    //   132: ladd
    //   133: lstore 4
    //   135: aload_1
    //   136: lload 4
    //   138: invokevirtual 466	com/google/android/gms/analytics/internal/zzh:zzn	(J)V
    //   141: goto -49 -> 92
    //   144: astore_3
    //   145: ldc_w 477
    //   148: astore 6
    //   150: aload_0
    //   151: aload 6
    //   153: aload_3
    //   154: invokevirtual 480	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   157: iconst_m1
    //   158: i2l
    //   159: lstore 8
    //   161: aload_0
    //   162: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   165: astore 10
    //   167: aload 10
    //   169: invokevirtual 475	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   172: goto -46 -> 126
    //   175: astore 10
    //   177: ldc_w 482
    //   180: astore 11
    //   182: aload_0
    //   183: aload 11
    //   185: aload 10
    //   187: invokevirtual 480	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   190: goto -64 -> 126
    //   193: astore 10
    //   195: ldc_w 482
    //   198: astore 11
    //   200: aload_0
    //   201: aload 11
    //   203: aload 10
    //   205: invokevirtual 480	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   208: goto -82 -> 126
    //   211: astore_3
    //   212: aload_0
    //   213: getfield 51	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   216: astore 6
    //   218: aload 6
    //   220: invokevirtual 475	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   223: aload_3
    //   224: athrow
    //   225: astore 6
    //   227: ldc_w 482
    //   230: astore 10
    //   232: aload_0
    //   233: aload 10
    //   235: aload 6
    //   237: invokevirtual 480	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   240: goto -17 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	zzl
    //   0	243	1	paramzzh	zzh
    //   0	243	2	paramBoolean	boolean
    //   17	54	3	localzzj1	zzj
    //   144	10	3	localSQLiteException1	SQLiteException
    //   211	13	3	localObject1	Object
    //   31	106	4	l1	long
    //   37	182	6	localObject2	Object
    //   225	11	6	localSQLiteException2	SQLiteException
    //   68	8	7	str1	String
    //   80	80	8	l2	long
    //   96	72	10	localzzj2	zzj
    //   175	11	10	localSQLiteException3	SQLiteException
    //   193	11	10	localSQLiteException4	SQLiteException
    //   230	4	10	str2	String
    //   180	22	11	str3	String
    // Exception table:
    //   from	to	target	type
    //   13	17	144	android/database/sqlite/SQLiteException
    //   18	22	144	android/database/sqlite/SQLiteException
    //   22	26	144	android/database/sqlite/SQLiteException
    //   27	31	144	android/database/sqlite/SQLiteException
    //   33	37	144	android/database/sqlite/SQLiteException
    //   42	47	144	android/database/sqlite/SQLiteException
    //   47	51	144	android/database/sqlite/SQLiteException
    //   52	56	144	android/database/sqlite/SQLiteException
    //   58	62	144	android/database/sqlite/SQLiteException
    //   64	68	144	android/database/sqlite/SQLiteException
    //   75	80	144	android/database/sqlite/SQLiteException
    //   87	92	144	android/database/sqlite/SQLiteException
    //   92	96	144	android/database/sqlite/SQLiteException
    //   100	104	144	android/database/sqlite/SQLiteException
    //   104	108	144	android/database/sqlite/SQLiteException
    //   110	115	144	android/database/sqlite/SQLiteException
    //   136	141	144	android/database/sqlite/SQLiteException
    //   161	165	175	android/database/sqlite/SQLiteException
    //   167	172	175	android/database/sqlite/SQLiteException
    //   115	119	193	android/database/sqlite/SQLiteException
    //   121	126	193	android/database/sqlite/SQLiteException
    //   13	17	211	finally
    //   18	22	211	finally
    //   22	26	211	finally
    //   27	31	211	finally
    //   33	37	211	finally
    //   42	47	211	finally
    //   47	51	211	finally
    //   52	56	211	finally
    //   58	62	211	finally
    //   64	68	211	finally
    //   75	80	211	finally
    //   87	92	211	finally
    //   92	96	211	finally
    //   100	104	211	finally
    //   104	108	211	finally
    //   110	115	211	finally
    //   136	141	211	finally
    //   153	157	211	finally
    //   212	216	225	android/database/sqlite/SQLiteException
    //   218	223	225	android/database/sqlite/SQLiteException
  }
  
  public void zza(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    boolean bool = this.zzRh;
    Object localObject;
    zzab localzzab;
    if (bool)
    {
      localObject = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions";
      zzbe((String)localObject);
      localzzab = zzf(paramzzab);
      zzjX();
      localObject = this.zzRb;
      bool = ((zzi)localObject).zzb(localzzab);
      if (!bool) {
        break label80;
      }
      localObject = "Hit sent to the device AnalyticsService for delivery";
      zzbe((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = "Delivering hit";
      zza((String)localObject, paramzzab);
      break;
      label80:
      localObject = zzjn();
      bool = ((zzr)localObject).zzkr();
      String str;
      if (bool)
      {
        localObject = zzjm();
        str = "Service unavailable on package side";
        ((zzaf)localObject).zza(localzzab, str);
      }
      else
      {
        try
        {
          localObject = this.zzQY;
          ((zzj)localObject).zzc(localzzab);
          zzkb();
        }
        catch (SQLiteException localSQLiteException)
        {
          zze("Delivery failed to save hit to a database", localSQLiteException);
          zzaf localzzaf = zzjm();
          str = "deliver: failed to insert hit to database";
          localzzaf.zza(localzzab, str);
        }
      }
    }
  }
  
  public void zza(zzw paramzzw, long paramLong)
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    long l1 = -1;
    Object localObject1 = zzjq();
    long l2 = ((zzai)localObject1).zzlH();
    long l3 = 0L;
    boolean bool1 = l2 < l3;
    if (bool1)
    {
      localObject2 = zzjl();
      l1 = Math.abs(((zzmq)localObject2).currentTimeMillis() - l2);
    }
    localObject1 = "Dispatching local hits. Elapsed time since last dispatch (ms)";
    Object localObject2 = Long.valueOf(l1);
    zzb((String)localObject1, localObject2);
    localObject2 = zzjn();
    boolean bool2 = ((zzr)localObject2).zzkr();
    if (!bool2) {
      zzjX();
    }
    for (;;)
    {
      try
      {
        bool2 = zzjZ();
        if (bool2)
        {
          localObject2 = zzjo();
          localObject4 = new com/google/android/gms/analytics/internal/zzl$5;
          ((zzl.5)localObject4).<init>(this, paramzzw, paramLong);
          ((com.google.android.gms.measurement.zzg)localObject2).zzf((Runnable)localObject4);
          return;
        }
      }
      finally
      {
        zze("Local dispatch failed", localObject3);
        Object localObject4 = zzjq();
        ((zzai)localObject4).zzlI();
        zzkb();
        if (paramzzw == null) {
          continue;
        }
        paramzzw.zzc((Throwable)localObject3);
        continue;
      }
      localObject2 = zzjq();
      ((zzai)localObject2).zzlI();
      zzkb();
      if (paramzzw != null)
      {
        bool2 = false;
        localObject2 = null;
        paramzzw.zzc(null);
      }
      l1 = this.zzRg;
      bool2 = l1 < paramLong;
      if (bool2)
      {
        localObject2 = this.zzRa;
        ((zzag)localObject2).zzlA();
      }
    }
  }
  
  public void zzb(zzw paramzzw)
  {
    long l = this.zzRg;
    zza(paramzzw, l);
  }
  
  public void zzbl(String paramString)
  {
    zzx.zzcM(paramString);
    zzjk();
    zzjj();
    Object localObject1 = zzjm();
    Object localObject2 = zzam.zza((zzaf)localObject1, paramString);
    if (localObject2 == null)
    {
      localObject1 = "Parsing failed. Ignoring invalid campaign data";
      zzd((String)localObject1, paramString);
    }
    boolean bool2;
    for (;;)
    {
      return;
      localObject1 = zzjq().zzlJ();
      boolean bool1 = paramString.equals(localObject1);
      if (bool1)
      {
        localObject1 = "Ignoring duplicate install campaign";
        zzbg((String)localObject1);
      }
      else
      {
        bool1 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool1)
        {
          localObject2 = "Ignoring multiple install campaigns. original, new";
          zzd((String)localObject2, localObject1, paramString);
        }
        else
        {
          zzjq().zzbp(paramString);
          localObject1 = zzjq().zzlG();
          localObject3 = zzjn();
          l = ((zzr)localObject3).zzkW();
          bool2 = ((zzaj)localObject1).zzv(l);
          if (!bool2) {
            break;
          }
          localObject1 = "Campaign received too late, ignoring";
          zzd((String)localObject1, localObject2);
        }
      }
    }
    zzb("Received installation campaign", localObject2);
    localObject1 = this.zzQY;
    long l = 0L;
    localObject1 = ((zzj)localObject1).zzr(l);
    Object localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject3).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (zzh)((Iterator)localObject3).next();
      zza((zzh)localObject1, (zzpr)localObject2);
    }
  }
  
  protected void zzc(zzh paramzzh)
  {
    zzjk();
    Object localObject1 = paramzzh.zzjE();
    zzb("Sending first hit to property", localObject1);
    Object localObject2 = zzjq().zzlG();
    localObject1 = zzjn();
    long l = ((zzr)localObject1).zzkW();
    boolean bool1 = ((zzaj)localObject2).zzv(l);
    if (bool1) {}
    for (;;)
    {
      return;
      localObject2 = zzjq().zzlJ();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool2)
      {
        localObject2 = zzam.zza(zzjm(), (String)localObject2);
        localObject1 = "Found relevant installation campaign";
        zzb((String)localObject1, localObject2);
        zza(paramzzh, (zzpr)localObject2);
      }
    }
  }
  
  zzab zzf(zzab paramzzab)
  {
    Object localObject1 = paramzzab.zzlv();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool) {}
    for (;;)
    {
      return paramzzab;
      localObject1 = zzjq().zzlK();
      Object localObject2 = ((zzai.zza)localObject1).zzlN();
      if (localObject2 != null)
      {
        localObject1 = (Long)((Pair)localObject2).second;
        localObject2 = (String)((Pair)localObject2).first;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = localObject1 + ":" + (String)localObject2;
        localObject2 = new java/util/HashMap;
        localObject3 = paramzzab.zzn();
        ((HashMap)localObject2).<init>((Map)localObject3);
        localObject3 = "_m";
        ((Map)localObject2).put(localObject3, localObject1);
        paramzzab = zzab.zza(this, paramzzab, (Map)localObject2);
      }
    }
  }
  
  protected void zziJ()
  {
    this.zzQY.zza();
    this.zzQZ.zza();
    this.zzRb.zza();
  }
  
  public long zzjO()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    try
    {
      zzj localzzj = this.zzQY;
      l = localzzj.zzjO();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str = "Failed to get min/max hit times from local store";
        zze(str, localSQLiteException);
        long l = 0L;
      }
    }
    return l;
  }
  
  protected void zzjU()
  {
    zzjv();
    zzjq().zzlF();
    Object localObject = "android.permission.ACCESS_NETWORK_STATE";
    boolean bool = zzbk((String)localObject);
    if (!bool)
    {
      localObject = "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions";
      zzbh((String)localObject);
      zzkj();
    }
    localObject = "android.permission.INTERNET";
    bool = zzbk((String)localObject);
    if (!bool)
    {
      localObject = "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions";
      zzbh((String)localObject);
      zzkj();
    }
    localObject = getContext();
    bool = AnalyticsService.zzZ((Context)localObject);
    if (bool)
    {
      localObject = "AnalyticsService registered in the app manifest and enabled";
      zzbd((String)localObject);
    }
    for (;;)
    {
      bool = this.zzRh;
      if (!bool)
      {
        localObject = zzjn();
        bool = ((zzr)localObject).zzkr();
        if (!bool)
        {
          localObject = this.zzQY;
          bool = ((zzj)localObject).isEmpty();
          if (!bool) {
            zzjX();
          }
        }
      }
      zzkb();
      return;
      localObject = zzjn();
      bool = ((zzr)localObject).zzkr();
      if (bool)
      {
        localObject = "Device AnalyticsService not registered! Hits will not be delivered reliably.";
        zzbh((String)localObject);
      }
      else
      {
        localObject = "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.";
        zzbg((String)localObject);
      }
    }
  }
  
  protected void zzjX()
  {
    boolean bool = this.zzRh;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = zzjn();
      bool = ((zzr)localObject).zzkt();
      if (bool)
      {
        localObject = this.zzRb;
        bool = ((zzi)localObject).isConnected();
        if (!bool)
        {
          localObject = zzjn();
          long l = ((zzr)localObject).zzkO();
          zzaj localzzaj = this.zzRf;
          bool = localzzaj.zzv(l);
          if (bool)
          {
            this.zzRf.start();
            zzbd("Connecting to service");
            localObject = this.zzRb;
            bool = ((zzi)localObject).connect();
            if (bool)
            {
              zzbd("Connected to service");
              localObject = this.zzRf;
              ((zzaj)localObject).clear();
              onServiceConnected();
            }
          }
        }
      }
    }
  }
  
  public void zzjY()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzjj();
    Object localObject1 = zzjn();
    boolean bool1 = ((zzr)localObject1).zzkt();
    if (!bool1)
    {
      localObject1 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
      zzbg((String)localObject1);
    }
    localObject1 = this.zzRb;
    bool1 = ((zzi)localObject1).isConnected();
    if (!bool1)
    {
      localObject1 = "Service not connected";
      zzbd((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzQY;
      bool1 = ((zzj)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = "Dispatching local hits to device AnalyticsService";
        zzbd((String)localObject1);
        label81:
        Object localObject2;
        try
        {
          localObject1 = this.zzQY;
          localObject2 = zzjn();
          int i = ((zzr)localObject2).zzkC();
          long l1 = i;
          localObject2 = ((zzj)localObject1).zzp(l1);
          bool1 = ((List)localObject2).isEmpty();
          if (!bool1) {
            break label172;
          }
          zzkb();
        }
        catch (SQLiteException localSQLiteException1)
        {
          localObject2 = "Failed to read hits from store";
          zze((String)localObject2, localSQLiteException1);
          zzkf();
        }
        continue;
        label145:
        ((List)localObject2).remove(localSQLiteException1);
        try
        {
          Object localObject3 = this.zzQY;
          long l2 = localSQLiteException1.zzlq();
          ((zzj)localObject3).zzq(l2);
          label172:
          bool1 = ((List)localObject2).isEmpty();
          if (bool1) {
            break label81;
          }
          bool1 = false;
          zzab localzzab = (zzab)((List)localObject2).get(0);
          localObject3 = this.zzRb;
          boolean bool2 = ((zzi)localObject3).zzb(localzzab);
          if (bool2) {
            break label145;
          }
          zzkb();
        }
        catch (SQLiteException localSQLiteException2)
        {
          localObject2 = "Failed to remove hit that was send for delivery";
          zze((String)localObject2, localSQLiteException2);
          zzkf();
        }
      }
    }
  }
  
  protected boolean zzjZ()
  {
    int i = 1;
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzbd("Dispatching a batch of local hits");
    Object localObject1 = this.zzRb;
    boolean bool2 = ((zzi)localObject1).isConnected();
    Object localObject5;
    if (!bool2)
    {
      localObject1 = zzjn();
      bool2 = ((zzr)localObject1).zzkr();
      if (!bool2)
      {
        bool2 = i;
        localObject5 = this.zzQZ;
        boolean bool4 = ((zzah)localObject5).zzlB();
        if (bool4) {
          break label90;
        }
        label64:
        if ((!bool2) || (i == 0)) {
          break label98;
        }
        localObject1 = "No network or service available. Will retry later";
        zzbd((String)localObject1);
      }
    }
    label90:
    label98:
    long l2;
    for (;;)
    {
      return false;
      bool2 = false;
      localObject1 = null;
      break;
      i = 0;
      Object localObject6 = null;
      break label64;
      localObject1 = zzjn();
      int j = ((zzr)localObject1).zzkC();
      localObject6 = zzjn();
      i = ((zzr)localObject6).zzkD();
      j = Math.max(j, i);
      long l1 = j;
      localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>();
      l2 = 0L;
      try
      {
        localObject1 = this.zzQY;
        ((zzj)localObject1).beginTransaction();
        ((List)localObject5).clear();
        try
        {
          localObject1 = this.zzQY;
          localList1 = ((zzj)localObject1).zzp(l1);
          bool3 = localList1.isEmpty();
          if (bool3)
          {
            localObject1 = "Store is empty, nothing to dispatch";
            zzbd((String)localObject1);
            zzkf();
            try
            {
              localObject1 = this.zzQY;
              ((zzj)localObject1).setTransactionSuccessful();
              localObject1 = this.zzQY;
              ((zzj)localObject1).endTransaction();
            }
            catch (SQLiteException localSQLiteException1)
            {
              localObject6 = "Failed to commit local dispatch transaction";
              zze((String)localObject6, localSQLiteException1);
              zzkf();
            }
            continue;
          }
          Object localObject2 = "Hits loaded from store. count";
          i = localList1.size();
          localObject6 = Integer.valueOf(i);
          zza((String)localObject2, localObject6);
          localObject6 = localList1.iterator();
          do
          {
            bool3 = ((Iterator)localObject6).hasNext();
            if (!bool3) {
              break;
            }
            localObject2 = ((Iterator)localObject6).next();
            localObject2 = (zzab)localObject2;
            l3 = ((zzab)localObject2).zzlq();
            bool3 = l3 < l2;
          } while (bool3);
          localObject2 = "Database contains successfully uploaded hit";
          localObject6 = Long.valueOf(l2);
          int k = localList1.size();
          localObject5 = Integer.valueOf(k);
          zzd((String)localObject2, localObject6, localObject5);
          zzkf();
          try
          {
            localObject2 = this.zzQY;
            ((zzj)localObject2).setTransactionSuccessful();
            localObject2 = this.zzQY;
            ((zzj)localObject2).endTransaction();
          }
          catch (SQLiteException localSQLiteException2)
          {
            localObject6 = "Failed to commit local dispatch transaction";
            zze((String)localObject6, localSQLiteException2);
            zzkf();
          }
        }
        catch (SQLiteException localSQLiteException3)
        {
          localObject6 = "Failed to read hits from persisted store";
          zzd((String)localObject6, localSQLiteException3);
          zzkf();
          try
          {
            zzj localzzj1 = this.zzQY;
            localzzj1.setTransactionSuccessful();
            localzzj1 = this.zzQY;
            localzzj1.endTransaction();
          }
          catch (SQLiteException localSQLiteException4)
          {
            localObject6 = "Failed to commit local dispatch transaction";
            zze((String)localObject6, localSQLiteException4);
            zzkf();
          }
        }
      }
      finally
      {
        try
        {
          List localList1;
          boolean bool3;
          long l3;
          Object localObject3;
          boolean bool1;
          localObject6 = this.zzQY;
          ((zzj)localObject6).setTransactionSuccessful();
          localObject6 = this.zzQY;
          ((zzj)localObject6).endTransaction();
          throw ((Throwable)localObject4);
        }
        catch (SQLiteException localSQLiteException11)
        {
          localObject6 = "Failed to commit local dispatch transaction";
          zze((String)localObject6, localSQLiteException11);
          zzkf();
        }
      }
    }
    localObject3 = this.zzRb;
    bool3 = ((zzi)localObject3).isConnected();
    if (bool3)
    {
      localObject3 = zzjn();
      bool3 = ((zzr)localObject3).zzkr();
      if (!bool3)
      {
        localObject3 = "Service connected, sending hits to the service";
        zzbd((String)localObject3);
        bool3 = localList1.isEmpty();
        if (!bool3)
        {
          bool3 = false;
          localObject3 = null;
          localObject3 = localList1.get(0);
          localObject3 = (zzab)localObject3;
          localObject6 = this.zzRb;
          bool1 = ((zzi)localObject6).zzb((zzab)localObject3);
          if (bool1) {}
        }
      }
    }
    for (long l4 = l2;; l4 = l2)
    {
      Object localObject7 = this.zzQZ;
      boolean bool5 = ((zzah)localObject7).zzlB();
      List localList2;
      if (bool5)
      {
        localObject7 = this.zzQZ;
        localList2 = ((zzah)localObject7).zzq(localList1);
        Iterator localIterator = localList2.iterator();
        for (l2 = l4;; l2 = Math.max(l2, l4))
        {
          bool3 = localIterator.hasNext();
          if (!bool3) {
            break;
          }
          localObject3 = localIterator.next();
          localObject3 = (Long)localObject3;
          l4 = ((Long)localObject3).longValue();
        }
        l3 = ((zzab)localObject3).zzlq();
        l2 = Math.max(l2, l3);
        localList1.remove(localObject3);
        localObject6 = "Hit sent do device AnalyticsService for delivery";
        zzb((String)localObject6, localObject3);
        try
        {
          localObject6 = this.zzQY;
          l3 = ((zzab)localObject3).zzlq();
          ((zzj)localObject6).zzq(l3);
          l4 = ((zzab)localObject3).zzlq();
          localObject3 = Long.valueOf(l4);
          ((List)localObject5).add(localObject3);
        }
        catch (SQLiteException localSQLiteException5)
        {
          localObject6 = "Failed to remove hit that was send for delivery";
          zze((String)localObject6, localSQLiteException5);
          zzkf();
          try
          {
            zzj localzzj2 = this.zzQY;
            localzzj2.setTransactionSuccessful();
            localzzj2 = this.zzQY;
            localzzj2.endTransaction();
          }
          catch (SQLiteException localSQLiteException6)
          {
            localObject6 = "Failed to commit local dispatch transaction";
            zze((String)localObject6, localSQLiteException6);
            zzkf();
          }
        }
        break;
        localList1.removeAll(localList2);
      }
      try
      {
        zzj localzzj3 = this.zzQY;
        localzzj3.zzo(localList2);
        ((List)localObject5).addAll(localList2);
        l4 = l2;
        bool5 = ((List)localObject5).isEmpty();
        if (!bool5) {
          break label914;
        }
        try
        {
          localzzj3 = this.zzQY;
          localzzj3.setTransactionSuccessful();
          localzzj3 = this.zzQY;
          localzzj3.endTransaction();
        }
        catch (SQLiteException localSQLiteException7)
        {
          localObject6 = "Failed to commit local dispatch transaction";
          zze((String)localObject6, localSQLiteException7);
          zzkf();
        }
      }
      catch (SQLiteException localSQLiteException8)
      {
        localObject6 = "Failed to remove successfully uploaded hits";
        zze((String)localObject6, localSQLiteException8);
        zzkf();
        try
        {
          zzj localzzj4 = this.zzQY;
          localzzj4.setTransactionSuccessful();
          localzzj4 = this.zzQY;
          localzzj4.endTransaction();
        }
        catch (SQLiteException localSQLiteException9)
        {
          localObject6 = "Failed to commit local dispatch transaction";
          zze((String)localObject6, localSQLiteException9);
          zzkf();
        }
      }
      break;
      try
      {
        label914:
        localObject7 = this.zzQY;
        ((zzj)localObject7).setTransactionSuccessful();
        localObject7 = this.zzQY;
        ((zzj)localObject7).endTransaction();
        l2 = l4;
      }
      catch (SQLiteException localSQLiteException10)
      {
        localObject6 = "Failed to commit local dispatch transaction";
        zze((String)localObject6, localSQLiteException10);
        zzkf();
      }
      break;
      break;
    }
  }
  
  public void zzjc()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    Object localObject = zzjn();
    boolean bool = ((zzr)localObject).zzkr();
    if (!bool)
    {
      localObject = "Delete all hits from local store";
      zzbd((String)localObject);
    }
    try
    {
      localObject = this.zzQY;
      ((zzj)localObject).zzjL();
      localObject = this.zzQY;
      ((zzj)localObject).zzjM();
      zzkb();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str = "Failed to delete hits from store";
        zzd(str, localSQLiteException);
      }
    }
    zzjX();
    localObject = this.zzRb;
    bool = ((zzi)localObject).zzjH();
    if (bool)
    {
      localObject = "Device service unavailable. Can't clear hits stored on the device service.";
      zzbd((String)localObject);
    }
  }
  
  public void zzjf()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzbd("Service disconnected");
  }
  
  void zzjh()
  {
    zzjk();
    long l = zzjl().currentTimeMillis();
    this.zzRg = l;
  }
  
  public void zzka()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    Object localObject1 = "Sync dispatching local hits";
    zzbe((String)localObject1);
    long l1 = this.zzRg;
    Object localObject3 = zzjn();
    boolean bool1 = ((zzr)localObject3).zzkr();
    if (!bool1) {
      zzjX();
    }
    try
    {
      do
      {
        bool1 = zzjZ();
      } while (bool1);
      localObject3 = zzjq();
      ((zzai)localObject3).zzlI();
      zzkb();
      long l2 = this.zzRg;
      boolean bool2 = l2 < l1;
      if (bool2)
      {
        localObject1 = this.zzRa;
        ((zzag)localObject1).zzlA();
      }
      return;
    }
    finally
    {
      for (;;)
      {
        String str = "Sync local dispatch failed";
        zze(str, localObject2);
        zzkb();
      }
    }
  }
  
  public void zzkb()
  {
    Object localObject = zzji();
    ((zzf)localObject).zzjk();
    zzjv();
    boolean bool = zzkc();
    if (!bool)
    {
      localObject = this.zzRa;
      ((zzag)localObject).unregister();
      zzkf();
    }
    for (;;)
    {
      return;
      localObject = this.zzQY;
      bool = ((zzj)localObject).isEmpty();
      if (bool)
      {
        localObject = this.zzRa;
        ((zzag)localObject).unregister();
        zzkf();
      }
      else
      {
        localObject = (Boolean)zzy.zzSs.get();
        bool = ((Boolean)localObject).booleanValue();
        if (!bool)
        {
          this.zzRa.zzly();
          localObject = this.zzRa;
        }
        for (bool = ((zzag)localObject).isConnected();; bool = true)
        {
          if (!bool) {
            break label118;
          }
          zzke();
          break;
        }
        label118:
        zzkf();
        zzkd();
      }
    }
  }
  
  public long zzki()
  {
    long l1 = this.zzRc;
    long l2 = Long.MIN_VALUE;
    boolean bool1 = l1 < l2;
    if (bool1) {
      l1 = this.zzRc;
    }
    for (;;)
    {
      return l1;
      Object localObject = zzjn();
      l1 = ((zzr)localObject).zzkz();
      zzan localzzan = zziI();
      boolean bool2 = localzzan.zzll();
      if (bool2)
      {
        localObject = zziI();
        int i = ((zzan)localObject).zzmc();
        l1 = i;
        l2 = 1000L;
        l1 *= l2;
      }
    }
  }
  
  public void zzkj()
  {
    zzjv();
    zzjk();
    this.zzRh = true;
    this.zzRb.disconnect();
    zzkb();
  }
  
  public void zzs(long paramLong)
  {
    long l = 0L;
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    boolean bool = paramLong < l;
    if (bool) {
      paramLong = l;
    }
    this.zzRc = paramLong;
    zzkb();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */