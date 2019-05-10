package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzqa.zzb;
import com.google.android.gms.internal.zzqb.zza;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zzd;
import com.google.android.gms.internal.zzqb.zze;
import com.google.android.gms.internal.zzqb.zzg;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class zzw
{
  private static zzaa zzaXV;
  private static volatile zzw zzaXW;
  private final Context mContext;
  private final boolean zzQk;
  private final zzd zzaXX;
  private final zzt zzaXY;
  private final zzp zzaXZ;
  private final zzv zzaYa;
  private final zzad zzaYb;
  private final zzu zzaYc;
  private final AppMeasurement zzaYd;
  private final zzaj zzaYe;
  private final zze zzaYf;
  private final zzq zzaYg;
  private final zzac zzaYh;
  private final zzg zzaYi;
  private final zzab zzaYj;
  private final zzn zzaYk;
  private final zzr zzaYl;
  private final zzag zzaYm;
  private final zzc zzaYn;
  private Boolean zzaYo;
  private List zzaYp;
  private int zzaYq;
  private int zzaYr;
  private final zzmq zzqW;
  
  zzw(zzaa paramzzaa)
  {
    zzx.zzz(paramzzaa);
    Object localObject1 = paramzzaa.mContext;
    this.mContext = ((Context)localObject1);
    localObject1 = paramzzaa.zzl(this);
    this.zzqW = ((zzmq)localObject1);
    localObject1 = paramzzaa.zza(this);
    this.zzaXX = ((zzd)localObject1);
    localObject1 = paramzzaa.zzb(this);
    ((zzt)localObject1).zza();
    this.zzaXY = ((zzt)localObject1);
    localObject1 = paramzzaa.zzc(this);
    ((zzp)localObject1).zza();
    this.zzaXZ = ((zzp)localObject1);
    localObject1 = zzAo().zzCI();
    long l = zzCp().zzBp();
    Object localObject2 = Long.valueOf(l);
    ((zzp.zza)localObject1).zzj("App measurement is starting up, version", localObject2);
    zzAo().zzCI().zzfg("To enable debug logging run: adb shell setprop log.tag.GMPM VERBOSE");
    localObject1 = zzAo().zzCJ();
    Object localObject3 = "Debug logging enabled";
    ((zzp.zza)localObject1).zzfg((String)localObject3);
    localObject1 = paramzzaa.zzi(this);
    this.zzaYe = ((zzaj)localObject1);
    localObject1 = paramzzaa.zzn(this);
    ((zzg)localObject1).zza();
    this.zzaYi = ((zzg)localObject1);
    localObject1 = paramzzaa.zzo(this);
    ((zzn)localObject1).zza();
    this.zzaYk = ((zzn)localObject1);
    localObject1 = paramzzaa.zzj(this);
    ((zze)localObject1).zza();
    this.zzaYf = ((zze)localObject1);
    localObject1 = paramzzaa.zzr(this);
    ((zzc)localObject1).zza();
    this.zzaYn = ((zzc)localObject1);
    localObject1 = paramzzaa.zzk(this);
    ((zzq)localObject1).zza();
    this.zzaYg = ((zzq)localObject1);
    localObject1 = paramzzaa.zzm(this);
    ((zzac)localObject1).zza();
    this.zzaYh = ((zzac)localObject1);
    localObject1 = paramzzaa.zzh(this);
    ((zzab)localObject1).zza();
    this.zzaYj = ((zzab)localObject1);
    localObject1 = paramzzaa.zzq(this);
    ((zzag)localObject1).zza();
    this.zzaYm = ((zzag)localObject1);
    localObject1 = paramzzaa.zzp(this);
    this.zzaYl = ((zzr)localObject1);
    localObject1 = paramzzaa.zzg(this);
    this.zzaYd = ((AppMeasurement)localObject1);
    localObject1 = paramzzaa.zze(this);
    ((zzad)localObject1).zza();
    this.zzaYb = ((zzad)localObject1);
    localObject1 = paramzzaa.zzf(this);
    ((zzu)localObject1).zza();
    this.zzaYc = ((zzu)localObject1);
    localObject1 = paramzzaa.zzd(this);
    ((zzv)localObject1).zza();
    this.zzaYa = ((zzv)localObject1);
    int i = this.zzaYq;
    int k = this.zzaYr;
    if (i != k)
    {
      localObject1 = zzAo().zzCE();
      localObject3 = "Not all components initialized";
      int m = this.zzaYq;
      localObject2 = Integer.valueOf(m);
      int n = this.zzaYr;
      Integer localInteger = Integer.valueOf(n);
      ((zzp.zza)localObject1).zze((String)localObject3, localObject2, localInteger);
    }
    this.zzQk = true;
    localObject1 = this.zzaXX;
    boolean bool = ((zzd)localObject1).zzkr();
    if (!bool)
    {
      bool = zzCZ();
      if (!bool)
      {
        localObject1 = this.mContext.getApplicationContext();
        bool = localObject1 instanceof Application;
        if (!bool) {
          break label518;
        }
        int j = Build.VERSION.SDK_INT;
        k = 14;
        if (j < k) {
          break label496;
        }
        localObject1 = zzCf();
        ((zzab)localObject1).zzDk();
      }
    }
    for (;;)
    {
      localObject1 = this.zzaYa;
      localObject3 = new com/google/android/gms/measurement/internal/zzw$1;
      ((zzw.1)localObject3).<init>(this);
      ((zzv)localObject1).zzg((Runnable)localObject3);
      return;
      label496:
      localObject1 = zzAo().zzCJ();
      localObject3 = "Not tracking deep linking pre-ICS";
      ((zzp.zza)localObject1).zzfg((String)localObject3);
      continue;
      label518:
      localObject1 = zzAo().zzCF();
      localObject3 = "Application context is not an Application";
      ((zzp.zza)localObject1).zzfg((String)localObject3);
    }
  }
  
  private void zzA(List paramList)
  {
    boolean bool = paramList.isEmpty();
    Object localObject;
    if (!bool)
    {
      bool = true;
      zzx.zzac(bool);
      localObject = this.zzaYp;
      if (localObject == null) {
        break label53;
      }
      localObject = zzAo().zzCE();
      String str = "Set uploading progress before finishing the previous upload";
      ((zzp.zza)localObject).zzfg(str);
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label53:
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList);
      this.zzaYp = ((List)localObject);
    }
  }
  
  private boolean zzDb()
  {
    zzjk();
    List localList = this.zzaYp;
    boolean bool;
    if (localList != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  private boolean zzDd()
  {
    zzjk();
    zzjv();
    Object localObject = zzCj();
    boolean bool = ((zze)localObject).zzCv();
    if (!bool)
    {
      localObject = zzCj().zzCq();
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void zzDe()
  {
    long l1 = 0L;
    zzjk();
    zzjv();
    boolean bool1 = zzCS();
    zzag localzzag;
    if (bool1)
    {
      bool1 = zzDd();
      if (bool1) {}
    }
    else
    {
      zzCX().unregister();
      localzzag = zzCY();
      localzzag.cancel();
    }
    for (;;)
    {
      return;
      long l2 = zzDf();
      boolean bool2 = l2 < l1;
      if (!bool2)
      {
        zzCX().unregister();
        localzzag = zzCY();
        localzzag.cancel();
      }
      else
      {
        Object localObject1 = zzCW();
        bool2 = ((zzq)localObject1).zzlB();
        if (!bool2)
        {
          zzCX().zzly();
          localzzag = zzCY();
          localzzag.cancel();
        }
        else
        {
          localObject1 = zzCo().zzaXl;
          long l3 = ((zzt.zzb)localObject1).get();
          Object localObject2 = zzCp();
          long l4 = ((zzd)localObject2).zzBX();
          zzaj localzzaj = zzCk();
          boolean bool3 = localzzaj.zzc(l3, l4);
          if (!bool3)
          {
            l3 += l4;
            l2 = Math.max(l2, l3);
          }
          zzCX().unregister();
          localObject1 = zzjl();
          l3 = ((zzmq)localObject1).currentTimeMillis();
          l2 -= l3;
          bool2 = l2 < l1;
          if (!bool2)
          {
            localzzag = zzCY();
            l3 = 1L;
            localzzag.zzt(l3);
          }
          else
          {
            localObject1 = zzAo().zzCK();
            String str = "Upload scheduled in approximately ms";
            localObject2 = Long.valueOf(l2);
            ((zzp.zza)localObject1).zzj(str, localObject2);
            localObject1 = zzCY();
            ((zzag)localObject1).zzt(l2);
          }
        }
      }
    }
  }
  
  private long zzDf()
  {
    zzmq localzzmq = zzjl();
    long l1 = localzzmq.currentTimeMillis();
    zzd localzzd1 = zzCp();
    long l2 = localzzd1.zzCa();
    zzd localzzd2 = zzCp();
    long l3 = localzzd2.zzBY();
    Object localObject = zzCo().zzaXj;
    long l4 = ((zzt.zzb)localObject).get();
    zzt.zzb localzzb = zzCo().zzaXk;
    long l5 = localzzb.get();
    zze localzze1 = zzCj();
    long l6 = localzze1.zzCt();
    zze localzze2 = zzCj();
    long l7 = localzze2.zzCu();
    l6 = Math.max(l6, l7);
    l7 = 0L;
    boolean bool1 = l6 < l7;
    if (!bool1) {
      l2 = 0L;
    }
    for (;;)
    {
      return l2;
      l6 = Math.abs(l6 - l1);
      l6 = l1 - l6;
      l4 = Math.abs(l4 - l1);
      l4 = l1 - l4;
      l5 = Math.abs(l5 - l1);
      l5 = l1 - l5;
      l1 = Math.max(l4, l5);
      l2 += l6;
      localObject = zzCk();
      boolean bool2 = ((zzaj)localObject).zzc(l1, l3);
      if (!bool2) {
        l2 = l1 + l3;
      }
      l1 = 0L;
      int i = l5 < l1;
      if (i != 0)
      {
        i = l5 < l6;
        if (i >= 0)
        {
          i = 0;
          localzzmq = null;
          for (;;)
          {
            zzd localzzd3 = zzCp();
            int k = localzzd3.zzCc();
            if (i >= k) {
              break label318;
            }
            l3 = 1 << i;
            localzzd3 = zzCp();
            l4 = localzzd3.zzCb();
            l3 *= l4;
            l2 += l3;
            boolean bool3 = l2 < l5;
            if (bool3) {
              break;
            }
            int j;
            i += 1;
          }
          label318:
          l2 = 0L;
        }
      }
    }
  }
  
  private void zza(int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    Object localObject1 = null;
    zzjk();
    zzjv();
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    Object localObject4 = this.zzaYp;
    Object localObject5 = null;
    this.zzaYp = null;
    int i = 200;
    long l1;
    Integer localInteger1;
    Object localObject3;
    if (paramInt != i)
    {
      i = 204;
      if (paramInt != i) {}
    }
    else if (paramThrowable == null)
    {
      localObject1 = zzCo().zzaXj;
      l1 = zzjl().currentTimeMillis();
      ((zzt.zzb)localObject1).set(l1);
      localObject1 = zzCo().zzaXk;
      l1 = 0L;
      ((zzt.zzb)localObject1).set(l1);
      zzDe();
      localObject1 = zzAo().zzCK();
      localObject5 = "Successful upload. Got network response. code, size";
      localInteger1 = Integer.valueOf(paramInt);
      int j = paramArrayOfByte.length;
      Integer localInteger2 = Integer.valueOf(j);
      ((zzp.zza)localObject1).zze((String)localObject5, localInteger1, localInteger2);
      localObject1 = zzCj();
      ((zze)localObject1).beginTransaction();
      try
      {
        localObject4 = ((List)localObject4).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject4).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (Long)localObject1;
          localObject5 = zzCj();
          long l2 = ((Long)localObject1).longValue();
          ((zze)localObject5).zzZ(l2);
        }
        localObject3 = zzCj();
      }
      finally
      {
        zzCj().endTransaction();
      }
      ((zze)localObject3).setTransactionSuccessful();
      zzCj().endTransaction();
      localObject3 = zzCW();
      bool = ((zzq)localObject3).zzlB();
      if (bool)
      {
        bool = zzDd();
        if (bool) {
          zzDc();
        }
      }
    }
    for (;;)
    {
      return;
      zzDe();
      continue;
      localObject4 = zzAo().zzCK();
      localInteger1 = Integer.valueOf(paramInt);
      ((zzp.zza)localObject4).zze("Network upload failed. Will retry later. code, error", localInteger1, paramThrowable);
      localObject4 = zzCo().zzaXk;
      localObject5 = zzjl();
      l1 = ((zzmq)localObject5).currentTimeMillis();
      ((zzt.zzb)localObject4).set(l1);
      int k = 503;
      if (paramInt != k)
      {
        k = 429;
        if (paramInt != k) {}
      }
      else
      {
        bool = true;
      }
      if (bool)
      {
        localObject3 = zzCo().zzaXl;
        localObject4 = zzjl();
        l1 = ((zzmq)localObject4).currentTimeMillis();
        ((zzt.zzb)localObject3).set(l1);
      }
      zzDe();
    }
  }
  
  private void zza(zzy paramzzy)
  {
    if (paramzzy == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not created");
      throw localIllegalStateException;
    }
  }
  
  private void zza(zzz paramzzz)
  {
    IllegalStateException localIllegalStateException;
    if (paramzzz == null)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not created");
      throw localIllegalStateException;
    }
    boolean bool = paramzzz.isInitialized();
    if (!bool)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not initialized");
      throw localIllegalStateException;
    }
  }
  
  private zzqb.zza[] zza(String paramString, zzqb.zzg[] paramArrayOfzzg, zzqb.zzb[] paramArrayOfzzb)
  {
    zzx.zzcM(paramString);
    return zzCe().zza(paramString, paramArrayOfzzb, paramArrayOfzzg);
  }
  
  public static zzw zzaT(Context paramContext)
  {
    zzx.zzz(paramContext);
    zzx.zzz(paramContext.getApplicationContext());
    Object localObject1 = zzaXW;
    if (localObject1 == null) {}
    synchronized (zzw.class)
    {
      localObject1 = zzaXW;
      if (localObject1 == null)
      {
        localObject1 = zzaXV;
        if (localObject1 != null)
        {
          localObject1 = zzaXV;
          localObject1 = ((zzaa)localObject1).zzDj();
          zzaXW = (zzw)localObject1;
        }
      }
      else
      {
        return zzaXW;
      }
      localObject1 = new com/google/android/gms/measurement/internal/zzaa;
      ((zzaa)localObject1).<init>(paramContext);
    }
  }
  
  private void zzb(Bundle paramBundle, int paramInt)
  {
    String str = "_err";
    long l1 = paramBundle.getLong(str);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      str = "_err";
      l2 = paramInt;
      paramBundle.putLong(str, l2);
    }
  }
  
  private void zzb(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    int i = 304;
    int j = 1;
    int k = 404;
    boolean bool = false;
    Object localObject1 = null;
    zzjk();
    zzjv();
    zzx.zzcM(paramString);
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    Object localObject4 = zzCj();
    ((zze)localObject4).beginTransaction();
    for (;;)
    {
      Object localObject6;
      try
      {
        localObject4 = zzCj();
        localObject5 = ((zze)localObject4).zzeY(paramString);
        m = 200;
        if (paramInt != m)
        {
          m = 204;
          if ((paramInt != m) && (paramInt != i)) {}
        }
        else if (paramThrowable == null)
        {
          m = j;
          if ((m == 0) && (paramInt != k)) {
            break label420;
          }
          if ((paramInt != k) && (paramInt != i)) {
            continue;
          }
          localObject1 = zzCl();
          localObject1 = ((zzu)localObject1).zzfk(paramString);
          if (localObject1 != null) {
            continue;
          }
          localObject1 = zzCl();
          j = 0;
          localObject6 = null;
          bool = ((zzu)localObject1).zze(paramString, null);
          if (bool) {
            continue;
          }
          localObject1 = zzCj();
          ((zze)localObject1).endTransaction();
          return;
        }
        m = 0;
        localObject4 = null;
        continue;
        localObject1 = zzCl();
        bool = ((zzu)localObject1).zze(paramString, paramArrayOfByte);
        if (!bool)
        {
          localObject1 = zzCj();
          ((zze)localObject1).endTransaction();
          continue;
        }
        localObject1 = zzjl();
        long l1 = ((zzmq)localObject1).currentTimeMillis();
        ((zza)localObject5).zzT(l1);
        localObject1 = zzCj();
        ((zze)localObject1).zza((zza)localObject5);
        if (paramInt == k)
        {
          localObject1 = zzAo();
          localObject1 = ((zzp)localObject1).zzCF();
          localObject6 = "Config not found. Using empty config";
          ((zzp.zza)localObject1).zzfg((String)localObject6);
          localObject1 = zzCW();
          bool = ((zzq)localObject1).zzlB();
          if (bool)
          {
            bool = zzDd();
            if (bool)
            {
              zzDc();
              localObject1 = zzCj();
              ((zze)localObject1).setTransactionSuccessful();
              localObject1 = zzCj();
              ((zze)localObject1).endTransaction();
            }
          }
        }
        else
        {
          localObject1 = zzAo();
          localObject1 = ((zzp)localObject1).zzCK();
          localObject6 = "Successfully fetched config. Got network response. code, size";
          localObject4 = Integer.valueOf(paramInt);
          int n = paramArrayOfByte.length;
          localObject5 = Integer.valueOf(n);
          ((zzp.zza)localObject1).zze((String)localObject6, localObject4, localObject5);
          continue;
        }
        zzDe();
      }
      finally
      {
        zzCj().endTransaction();
      }
      continue;
      label420:
      localObject4 = zzjl();
      long l2 = ((zzmq)localObject4).currentTimeMillis();
      ((zza)localObject5).zzU(l2);
      localObject4 = zzCj();
      ((zze)localObject4).zza((zza)localObject5);
      localObject4 = zzAo();
      localObject4 = ((zzp)localObject4).zzCK();
      Object localObject5 = "Fetching config failed. code, error";
      Integer localInteger = Integer.valueOf(paramInt);
      ((zzp.zza)localObject4).zze((String)localObject5, localInteger, paramThrowable);
      localObject4 = zzCo();
      localObject4 = ((zzt)localObject4).zzaXk;
      localObject5 = zzjl();
      l2 = ((zzmq)localObject5).currentTimeMillis();
      ((zzt.zzb)localObject4).set(l2);
      int m = 503;
      if (paramInt != m)
      {
        m = 429;
        if (paramInt != m) {}
      }
      else
      {
        bool = j;
      }
      if (bool)
      {
        Object localObject3 = zzCo();
        localObject3 = ((zzt)localObject3).zzaXl;
        localObject6 = zzjl();
        long l3 = ((zzmq)localObject6).currentTimeMillis();
        ((zzt.zzb)localObject3).set(l3);
      }
      zzDe();
    }
  }
  
  private void zze(AppMetadata paramAppMetadata)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    zzjk();
    zzjv();
    zzx.zzz(paramAppMetadata);
    zzx.zzcM(paramAppMetadata.packageName);
    Object localObject1 = zzCj();
    Object localObject2 = paramAppMetadata.packageName;
    localObject2 = ((zze)localObject1).zzeY((String)localObject2);
    localObject1 = zzCo();
    String str1 = paramAppMetadata.packageName;
    str1 = ((zzt)localObject1).zzfi(str1);
    boolean bool2 = false;
    float f2 = 0.0F;
    localObject1 = null;
    String str2;
    boolean bool4;
    if (localObject2 == null)
    {
      localObject1 = new com/google/android/gms/measurement/internal/zza;
      localObject2 = paramAppMetadata.packageName;
      ((zza)localObject1).<init>(this, (String)localObject2);
      localObject2 = zzCo().zzCM();
      ((zza)localObject1).zzeM((String)localObject2);
      ((zza)localObject1).zzeO(str1);
      localObject2 = localObject1;
      bool2 = bool1;
      f2 = f1;
      str1 = paramAppMetadata.zzaVt;
      boolean bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = paramAppMetadata.zzaVt;
        str2 = ((zza)localObject2).zzBk();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = paramAppMetadata.zzaVt;
          ((zza)localObject2).zzeN((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      long l1 = paramAppMetadata.zzaVv;
      long l2 = 0L;
      bool3 = l1 < l2;
      if (bool3)
      {
        l1 = paramAppMetadata.zzaVv;
        l2 = ((zza)localObject2).zzBp();
        bool3 = l1 < l2;
        if (bool3)
        {
          l1 = paramAppMetadata.zzaVv;
          ((zza)localObject2).zzQ(l1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      str1 = paramAppMetadata.zzaMV;
      bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = paramAppMetadata.zzaMV;
        str2 = ((zza)localObject2).zzli();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = paramAppMetadata.zzaMV;
          ((zza)localObject2).setAppVersion((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      str1 = paramAppMetadata.zzaVu;
      bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = paramAppMetadata.zzaVu;
        str2 = ((zza)localObject2).zzBo();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = paramAppMetadata.zzaVu;
          ((zza)localObject2).zzeP((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      l1 = paramAppMetadata.zzaVw;
      l2 = ((zza)localObject2).zzBq();
      bool3 = l1 < l2;
      if (bool3)
      {
        l1 = paramAppMetadata.zzaVw;
        ((zza)localObject2).zzR(l1);
        bool2 = bool1;
        f2 = f1;
      }
      bool3 = paramAppMetadata.zzaVy;
      bool4 = ((zza)localObject2).zzAr();
      if (bool3 == bool4) {
        break label540;
      }
      bool2 = paramAppMetadata.zzaVy;
      ((zza)localObject2).setMeasurementEnabled(bool2);
    }
    for (;;)
    {
      if (bool1)
      {
        localObject1 = zzCj();
        ((zze)localObject1).zza((zza)localObject2);
      }
      return;
      str2 = ((zza)localObject2).zzBl();
      bool4 = str1.equals(str2);
      if (bool4) {
        break;
      }
      ((zza)localObject2).zzeO(str1);
      localObject1 = zzCo().zzCM();
      ((zza)localObject2).zzeM((String)localObject1);
      bool2 = bool1;
      f2 = f1;
      break;
      label540:
      bool1 = bool2;
      f1 = f2;
    }
  }
  
  private boolean zzg(String paramString, long paramLong)
  {
    Object localObject1 = zzCj();
    ((zze)localObject1).beginTransaction();
    for (;;)
    {
      long l1;
      try
      {
        zzw.zza localzza = new com/google/android/gms/measurement/internal/zzw$zza;
        boolean bool1 = false;
        localObject1 = null;
        localzza.<init>(this, null);
        localObject1 = zzCj();
        ((zze)localObject1).zza(paramString, paramLong, localzza);
        bool1 = localzza.isEmpty();
        if (bool1) {
          break label1012;
        }
        zzqb.zze localzze1 = localzza.zzaYt;
        localObject1 = localzza.zzpH;
        int i = ((List)localObject1).size();
        localObject1 = new zzqb.zzb[i];
        localzze1.zzbam = ((zzqb.zzb[])localObject1);
        int n = 0;
        localObject3 = null;
        i = 0;
        localObject1 = null;
        int i2 = 0;
        localObject1 = localzza.zzpH;
        i = ((List)localObject1).size();
        if (i2 < i)
        {
          localObject4 = zzCl();
          localObject1 = localzza.zzaYt;
          localObject5 = ((zzqb.zze)localObject1).appId;
          localObject1 = localzza.zzpH;
          localObject1 = ((List)localObject1).get(i2);
          localObject1 = (zzqb.zzb)localObject1;
          localObject1 = ((zzqb.zzb)localObject1).name;
          int j = ((zzu)localObject4).zzP((String)localObject5, (String)localObject1);
          if (j != 0)
          {
            localObject1 = zzAo();
            localObject4 = ((zzp)localObject1).zzCK();
            localObject5 = "Dropping blacklisted raw event";
            localObject1 = localzza.zzpH;
            localObject1 = ((List)localObject1).get(i2);
            localObject1 = (zzqb.zzb)localObject1;
            localObject1 = ((zzqb.zzb)localObject1).name;
            ((zzp.zza)localObject4).zzj((String)localObject5, localObject1);
            j = n;
            i2 += 1;
            n = j;
            continue;
          }
          localObject5 = localzze1.zzbam;
          int i3 = n + 1;
          localObject1 = localzza.zzpH;
          localObject1 = ((List)localObject1).get(i2);
          localObject1 = (zzqb.zzb)localObject1;
          localObject5[n] = localObject1;
          j = i3;
          continue;
        }
        localObject1 = localzza.zzpH;
        int k = ((List)localObject1).size();
        if (n < k)
        {
          localObject1 = localzze1.zzbam;
          localObject1 = Arrays.copyOf((Object[])localObject1, n);
          localObject1 = (zzqb.zzb[])localObject1;
          localzze1.zzbam = ((zzqb.zzb[])localObject1);
        }
        localObject1 = localzza.zzaYt;
        localObject1 = ((zzqb.zze)localObject1).appId;
        localObject3 = localzza.zzaYt;
        localObject3 = ((zzqb.zze)localObject3).zzban;
        localObject4 = localzze1.zzbam;
        localObject1 = zza((String)localObject1, (zzqb.zzg[])localObject3, (zzqb.zzb[])localObject4);
        localzze1.zzbaF = ((zzqb.zza[])localObject1);
        localObject1 = localzze1.zzbam;
        int i1 = 0;
        localObject3 = null;
        localObject1 = localObject1[0];
        localObject1 = ((zzqb.zzb)localObject1).zzbaf;
        localzze1.zzbap = ((Long)localObject1);
        localObject1 = localzze1.zzbam;
        i1 = 0;
        localObject3 = null;
        localObject1 = localObject1[0];
        localObject1 = ((zzqb.zzb)localObject1).zzbaf;
        localzze1.zzbaq = ((Long)localObject1);
        k = 1;
        localObject3 = localzze1.zzbam;
        i1 = localObject3.length;
        if (k < i1)
        {
          localObject3 = localzze1.zzbam;
          localObject3 = localObject3[k];
          localObject4 = ((zzqb.zzb)localObject3).zzbaf;
          l1 = ((Long)localObject4).longValue();
          localObject5 = localzze1.zzbap;
          long l2 = ((Long)localObject5).longValue();
          bool2 = l1 < l2;
          if (bool2)
          {
            localObject4 = ((zzqb.zzb)localObject3).zzbaf;
            localzze1.zzbap = ((Long)localObject4);
          }
          localObject4 = ((zzqb.zzb)localObject3).zzbaf;
          l1 = ((Long)localObject4).longValue();
          localObject5 = localzze1.zzbaq;
          l2 = ((Long)localObject5).longValue();
          bool2 = l1 < l2;
          if (bool2)
          {
            localObject3 = ((zzqb.zzb)localObject3).zzbaf;
            localzze1.zzbaq = ((Long)localObject3);
          }
          k += 1;
          continue;
        }
        localObject1 = localzza.zzaYt;
        Object localObject5 = ((zzqb.zze)localObject1).appId;
        localObject1 = zzCj();
        zza localzza1 = ((zze)localObject1).zzeY((String)localObject5);
        if (localzza1 == null)
        {
          localObject1 = zzAo();
          localObject1 = ((zzp)localObject1).zzCE();
          localObject3 = "Bundling raw events w/o app info";
          ((zzp.zza)localObject1).zzfg((String)localObject3);
          localObject1 = zzAo();
          localObject1 = ((zzp)localObject1).zzCL();
          localzze1.zzaVx = ((String)localObject1);
          localObject1 = zzCj();
          ((zze)localObject1).zza(localzze1);
          localObject1 = zzCj();
          localObject3 = localzza.zzaYu;
          ((zze)localObject1).zzz((List)localObject3);
          localObject1 = zzCj();
          ((zze)localObject1).zzfc((String)localObject5);
          localObject1 = zzCj();
          ((zze)localObject1).setTransactionSuccessful();
          k = 1;
          localObject3 = zzCj();
          ((zze)localObject3).endTransaction();
          return k;
        }
        l3 = localzza1.zzBn();
        l1 = 0L;
        boolean bool2 = l3 < l1;
        if (bool2)
        {
          localObject4 = Long.valueOf(l3);
          localzze1.zzbas = ((Long)localObject4);
          l1 = localzza1.zzBm();
          long l4 = 0L;
          boolean bool3 = l1 < l4;
          if (bool3) {
            break label1043;
          }
          l1 = 0L;
          bool2 = l3 < l1;
          if (!bool2) {
            break label1003;
          }
          localObject1 = Long.valueOf(l3);
          localzze1.zzbar = ((Long)localObject1);
          localzza1.zzBu();
          l3 = localzza1.zzBr();
          m = (int)l3;
          localObject1 = Integer.valueOf(m);
          localzze1.zzbaD = ((Integer)localObject1);
          localObject1 = localzze1.zzbap;
          l3 = ((Long)localObject1).longValue();
          localzza1.zzO(l3);
          localObject1 = localzze1.zzbaq;
          l3 = ((Long)localObject1).longValue();
          localzza1.zzP(l3);
          localObject1 = zzCj();
          ((zze)localObject1).zza(localzza1);
          continue;
        }
        bool2 = false;
      }
      finally
      {
        zzCj().endTransaction();
      }
      Object localObject4 = null;
      continue;
      label1003:
      int m = 0;
      zze localzze = null;
      continue;
      label1012:
      localzze = zzCj();
      localzze.setTransactionSuccessful();
      m = 0;
      localzze = null;
      Object localObject3 = zzCj();
      ((zze)localObject3).endTransaction();
      continue;
      label1043:
      long l3 = l1;
    }
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  protected void start()
  {
    zzjk();
    boolean bool = zzCZ();
    String str;
    if (bool)
    {
      localObject = this.zzaYa;
      bool = ((zzv)localObject).isInitialized();
      if (bool)
      {
        localObject = this.zzaYa;
        bool = ((zzv)localObject).zzDi();
        if (!bool) {}
      }
      else
      {
        localObject = zzAo().zzCE();
        str = "Scheduler shutting down before Scion.start() called";
        ((zzp.zza)localObject).zzfg(str);
        return;
      }
    }
    Object localObject = zzCj();
    ((zze)localObject).zzCr();
    bool = zzCS();
    if (!bool)
    {
      localObject = zzCo();
      bool = ((zzt)localObject).zzAr();
      if (bool)
      {
        localObject = zzCk();
        str = "android.permission.INTERNET";
        bool = ((zzaj)localObject).zzbk(str);
        if (!bool)
        {
          localObject = zzAo().zzCE();
          str = "App is missing INTERNET permission";
          ((zzp.zza)localObject).zzfg(str);
        }
        localObject = zzCk();
        str = "android.permission.ACCESS_NETWORK_STATE";
        bool = ((zzaj)localObject).zzbk(str);
        if (!bool)
        {
          localObject = zzAo().zzCE();
          str = "App is missing ACCESS_NETWORK_STATE permission";
          ((zzp.zza)localObject).zzfg(str);
        }
        localObject = getContext();
        bool = AppMeasurementReceiver.zzY((Context)localObject);
        if (!bool)
        {
          localObject = zzAo().zzCE();
          str = "AppMeasurementReceiver not registered/enabled";
          ((zzp.zza)localObject).zzfg(str);
        }
        localObject = getContext();
        bool = AppMeasurementService.zzZ((Context)localObject);
        if (!bool)
        {
          localObject = zzAo().zzCE();
          str = "AppMeasurementService not registered/enabled";
          ((zzp.zza)localObject).zzfg(str);
        }
        localObject = zzAo().zzCE();
        str = "Uploading is not possible. App measurement disabled";
        ((zzp.zza)localObject).zzfg(str);
      }
    }
    for (;;)
    {
      zzDe();
      break;
      localObject = zzCp();
      bool = ((zzd)localObject).zzkr();
      if (!bool)
      {
        bool = zzCZ();
        if (!bool)
        {
          localObject = zzCg().zzBk();
          bool = TextUtils.isEmpty((CharSequence)localObject);
          if (!bool)
          {
            localObject = zzCf();
            ((zzab)localObject).zzDl();
          }
        }
      }
    }
  }
  
  public zzp zzAo()
  {
    zzp localzzp = this.zzaXZ;
    zza(localzzp);
    return this.zzaXZ;
  }
  
  protected boolean zzCS()
  {
    boolean bool1 = true;
    zzjv();
    zzjk();
    Object localObject = this.zzaYo;
    boolean bool2;
    if (localObject == null)
    {
      localObject = zzCk();
      String str = "android.permission.INTERNET";
      bool2 = ((zzaj)localObject).zzbk(str);
      if (!bool2) {
        break label176;
      }
      localObject = zzCk();
      str = "android.permission.ACCESS_NETWORK_STATE";
      bool2 = ((zzaj)localObject).zzbk(str);
      if (!bool2) {
        break label176;
      }
      localObject = getContext();
      bool2 = AppMeasurementReceiver.zzY((Context)localObject);
      if (!bool2) {
        break label176;
      }
      localObject = getContext();
      bool2 = AppMeasurementService.zzZ((Context)localObject);
      if (!bool2) {
        break label176;
      }
      bool2 = bool1;
      localObject = Boolean.valueOf(bool2);
      this.zzaYo = ((Boolean)localObject);
      localObject = this.zzaYo;
      bool2 = ((Boolean)localObject).booleanValue();
      if (bool2)
      {
        localObject = zzCp();
        bool2 = ((zzd)localObject).zzkr();
        if (!bool2)
        {
          localObject = zzCg().zzBk();
          bool2 = TextUtils.isEmpty((CharSequence)localObject);
          if (bool2) {
            break label184;
          }
        }
      }
    }
    for (;;)
    {
      localObject = Boolean.valueOf(bool1);
      this.zzaYo = ((Boolean)localObject);
      return this.zzaYo.booleanValue();
      label176:
      bool2 = false;
      localObject = null;
      break;
      label184:
      bool1 = false;
    }
  }
  
  public zzp zzCT()
  {
    zzp localzzp = this.zzaXZ;
    boolean bool;
    if (localzzp != null)
    {
      localzzp = this.zzaXZ;
      bool = localzzp.isInitialized();
      if (!bool) {}
    }
    for (localzzp = this.zzaXZ;; localzzp = null)
    {
      return localzzp;
      bool = false;
    }
  }
  
  zzv zzCU()
  {
    return this.zzaYa;
  }
  
  public AppMeasurement zzCV()
  {
    return this.zzaYd;
  }
  
  public zzq zzCW()
  {
    zzq localzzq = this.zzaYg;
    zza(localzzq);
    return this.zzaYg;
  }
  
  public zzr zzCX()
  {
    Object localObject = this.zzaYl;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Network broadcast receiver not created");
      throw ((Throwable)localObject);
    }
    return this.zzaYl;
  }
  
  public zzag zzCY()
  {
    zzag localzzag = this.zzaYm;
    zza(localzzag);
    return this.zzaYm;
  }
  
  protected boolean zzCZ()
  {
    return false;
  }
  
  public zzc zzCe()
  {
    zzc localzzc = this.zzaYn;
    zza(localzzc);
    return this.zzaYn;
  }
  
  public zzab zzCf()
  {
    zzab localzzab = this.zzaYj;
    zza(localzzab);
    return this.zzaYj;
  }
  
  public zzn zzCg()
  {
    zzn localzzn = this.zzaYk;
    zza(localzzn);
    return this.zzaYk;
  }
  
  public zzg zzCh()
  {
    zzg localzzg = this.zzaYi;
    zza(localzzg);
    return this.zzaYi;
  }
  
  public zzac zzCi()
  {
    zzac localzzac = this.zzaYh;
    zza(localzzac);
    return this.zzaYh;
  }
  
  public zze zzCj()
  {
    zze localzze = this.zzaYf;
    zza(localzze);
    return this.zzaYf;
  }
  
  public zzaj zzCk()
  {
    zzaj localzzaj = this.zzaYe;
    zza(localzzaj);
    return this.zzaYe;
  }
  
  public zzu zzCl()
  {
    zzu localzzu = this.zzaYc;
    zza(localzzu);
    return this.zzaYc;
  }
  
  public zzad zzCm()
  {
    zzad localzzad = this.zzaYb;
    zza(localzzad);
    return this.zzaYb;
  }
  
  public zzv zzCn()
  {
    zzv localzzv = this.zzaYa;
    zza(localzzv);
    return this.zzaYa;
  }
  
  public zzt zzCo()
  {
    zzt localzzt = this.zzaXY;
    zza(localzzt);
    return this.zzaXY;
  }
  
  public zzd zzCp()
  {
    return this.zzaXX;
  }
  
  long zzDa()
  {
    long l1 = 60;
    long l2 = zzjl().currentTimeMillis();
    long l3 = zzCo().zzCN();
    return (l2 + l3) / 1000L / l1 / l1 / 24;
  }
  
  public void zzDc()
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    zzjk();
    zzjv();
    Object localObject3 = zzCp();
    boolean bool1 = ((zzd)localObject3).zzkr();
    Object localObject5;
    if (!bool1)
    {
      localObject3 = zzCo().zzCP();
      if (localObject3 == null)
      {
        localObject3 = zzAo().zzCF();
        localObject5 = "Upload data called on the client side before use of service was decided";
        ((zzp.zza)localObject3).zzfg((String)localObject5);
      }
    }
    long l1;
    Object localObject7;
    int i1;
    boolean bool2;
    do
    {
      for (;;)
      {
        return;
        bool1 = ((Boolean)localObject3).booleanValue();
        if (bool1)
        {
          localObject3 = zzAo().zzCE();
          localObject5 = "Upload called in the client side when service should be used";
          ((zzp.zza)localObject3).zzfg((String)localObject5);
        }
        else
        {
          bool1 = zzDb();
          if (bool1)
          {
            localObject3 = zzAo().zzCF();
            localObject5 = "Uploading requested multiple times";
            ((zzp.zza)localObject3).zzfg((String)localObject5);
          }
          else
          {
            localObject3 = zzCW();
            bool1 = ((zzq)localObject3).zzlB();
            if (bool1) {
              break;
            }
            localObject3 = zzAo().zzCF();
            localObject5 = "Network not connected, ignoring upload request";
            ((zzp.zza)localObject3).zzfg((String)localObject5);
            zzDe();
          }
        }
      }
      l1 = zzjl().currentTimeMillis();
      long l2 = zzCp().zzBW();
      l2 = l1 - l2;
      zzad(l2);
      localObject3 = zzCo().zzaXj;
      l2 = ((zzt.zzb)localObject3).get();
      long l3 = 0L;
      boolean bool5 = l2 < l3;
      if (bool5)
      {
        localObject6 = zzAo().zzCJ();
        localObject7 = "Uploading events. Elapsed time since last upload attempt (ms)";
        l2 = Math.abs(l1 - l2);
        localObject3 = Long.valueOf(l2);
        ((zzp.zza)localObject6).zzj((String)localObject7, localObject3);
      }
      localObject3 = zzCj();
      localObject5 = ((zze)localObject3).zzCq();
      bool1 = TextUtils.isEmpty((CharSequence)localObject5);
      if (bool1) {
        break;
      }
      localObject3 = zzCp();
      int k = ((zzd)localObject3).zzeU((String)localObject5);
      localObject6 = zzCp();
      i1 = ((zzd)localObject6).zzeV((String)localObject5);
      localObject7 = zzCj().zzn((String)localObject5, k, i1);
      bool2 = ((List)localObject7).isEmpty();
    } while (bool2);
    Object localObject6 = ((List)localObject7).iterator();
    boolean bool6;
    do
    {
      bool2 = ((Iterator)localObject6).hasNext();
      if (!bool2) {
        break;
      }
      localObject3 = (zzqb.zze)((Pair)((Iterator)localObject6).next()).first;
      localObject8 = ((zzqb.zze)localObject3).zzbaz;
      bool6 = TextUtils.isEmpty((CharSequence)localObject8);
    } while (bool6);
    localObject3 = ((zzqb.zze)localObject3).zzbaz;
    for (Object localObject8 = localObject3;; localObject8 = null)
    {
      Object localObject9;
      boolean bool7;
      if (localObject8 != null)
      {
        i1 = 0;
        localObject6 = null;
        int m = ((List)localObject7).size();
        if (i1 < m)
        {
          localObject3 = (zzqb.zze)((Pair)((List)localObject7).get(i1)).first;
          localObject9 = ((zzqb.zze)localObject3).zzbaz;
          bool7 = TextUtils.isEmpty((CharSequence)localObject9);
          if (bool7) {}
          boolean bool3;
          do
          {
            m = i1 + 1;
            i1 = m;
            break;
            localObject3 = ((zzqb.zze)localObject3).zzbaz;
            bool3 = ((String)localObject3).equals(localObject8);
          } while (bool3);
          localObject3 = ((List)localObject7).subList(0, i1);
        }
      }
      for (localObject6 = localObject3;; localObject6 = localObject7)
      {
        localObject8 = new com/google/android/gms/internal/zzqb$zzd;
        ((zzqb.zzd)localObject8).<init>();
        localObject3 = new zzqb.zze[((List)localObject6).size()];
        ((zzqb.zzd)localObject8).zzbaj = ((zzqb.zze[])localObject3);
        localObject7 = new java/util/ArrayList;
        int n = ((List)localObject6).size();
        ((ArrayList)localObject7).<init>(n);
        for (;;)
        {
          localObject3 = ((zzqb.zzd)localObject8).zzbaj;
          n = localObject3.length;
          if (j >= n) {
            break;
          }
          localObject9 = ((zzqb.zzd)localObject8).zzbaj;
          localObject3 = (zzqb.zze)((Pair)((List)localObject6).get(j)).first;
          localObject9[j] = localObject3;
          localObject3 = ((Pair)((List)localObject6).get(j)).second;
          ((List)localObject7).add(localObject3);
          localObject3 = localObject8.zzbaj[j];
          long l4 = zzCp().zzBp();
          localObject9 = Long.valueOf(l4);
          ((zzqb.zze)localObject3).zzbay = ((Long)localObject9);
          localObject3 = localObject8.zzbaj[j];
          localObject9 = Long.valueOf(l1);
          ((zzqb.zze)localObject3).zzbao = ((Long)localObject9);
          localObject3 = localObject8.zzbaj[j];
          bool7 = zzCp().zzkr();
          localObject9 = Boolean.valueOf(bool7);
          ((zzqb.zze)localObject3).zzbaE = ((Boolean)localObject9);
          j += 1;
        }
        localObject3 = zzAo();
        i1 = 2;
        boolean bool4 = ((zzp)localObject3).zzQ(i1);
        if (bool4) {}
        zzp.zza localzza;
        for (localObject3 = zzaj.zzb((zzqb.zzd)localObject8);; localzza = null)
        {
          localObject2 = zzCk().zza((zzqb.zzd)localObject8);
          localObject6 = zzCp();
          localObject9 = ((zzd)localObject6).zzBV();
          try
          {
            localObject6 = new java/net/URL;
            ((URL)localObject6).<init>((String)localObject9);
            zzA((List)localObject7);
            localObject7 = zzCo();
            localObject7 = ((zzt)localObject7).zzaXk;
            ((zzt.zzb)localObject7).set(l1);
            localObject7 = "?";
            localObject1 = ((zzqb.zzd)localObject8).zzbaj;
            i = localObject1.length;
            if (i > 0)
            {
              localObject7 = ((zzqb.zzd)localObject8).zzbaj;
              i = 0;
              localObject1 = null;
              localObject7 = localObject7[0];
              localObject7 = ((zzqb.zze)localObject7).appId;
            }
            localObject1 = zzAo();
            localObject1 = ((zzp)localObject1).zzCK();
            localObject8 = "Uploading data. app, uncompressed size, data";
            int i2 = localObject2.length;
            Integer localInteger = Integer.valueOf(i2);
            ((zzp.zza)localObject1).zzd((String)localObject8, localObject7, localInteger, localObject3);
            localObject3 = zzCW();
            localObject7 = null;
            localObject1 = new com/google/android/gms/measurement/internal/zzw$2;
            ((zzw.2)localObject1).<init>(this);
            ((zzq)localObject3).zza((String)localObject5, (URL)localObject6, (byte[])localObject2, null, (zzq.zza)localObject1);
          }
          catch (MalformedURLException localMalformedURLException1)
          {
            localObject4 = zzAo().zzCE();
            localObject5 = "Failed to parse upload URL. Not uploading";
            ((zzp.zza)localObject4).zzj((String)localObject5, localObject9);
          }
          break;
          Object localObject4 = zzCj();
          localObject5 = zzCp();
          long l5 = ((zzd)localObject5).zzBW();
          l5 = l1 - l5;
          localObject4 = ((zze)localObject4).zzaa(l5);
          boolean bool8 = TextUtils.isEmpty((CharSequence)localObject4);
          if (bool8) {
            break;
          }
          localObject5 = zzCj().zzeY((String)localObject4);
          if (localObject5 == null) {
            break;
          }
          localObject6 = zzCp();
          localObject2 = ((zza)localObject5).zzBk();
          localObject7 = ((zza)localObject5).zzBj();
          localObject6 = ((zzd)localObject6).zzH((String)localObject2, (String)localObject7);
          try
          {
            localObject2 = new java/net/URL;
            ((URL)localObject2).<init>((String)localObject6);
            localObject7 = zzAo();
            localObject7 = ((zzp)localObject7).zzCK();
            localObject8 = "Fetching remote configuration";
            localObject9 = ((zza)localObject5).zzwK();
            ((zzp.zza)localObject7).zzj((String)localObject8, localObject9);
            localObject7 = zzCl();
            localObject5 = ((zza)localObject5).zzwK();
            localObject5 = ((zzu)localObject7).zzfk((String)localObject5);
            if (localObject5 != null)
            {
              localObject7 = ((zzqa.zzb)localObject5).zzaZT;
              if (localObject7 != null)
              {
                localObject1 = new android/support/v4/h/a;
                ((a)localObject1).<init>();
                localObject7 = "Config-Version";
                localObject5 = ((zzqa.zzb)localObject5).zzaZT;
                localObject5 = String.valueOf(localObject5);
                ((Map)localObject1).put(localObject7, localObject5);
              }
            }
            localObject5 = zzCW();
            localObject7 = new com/google/android/gms/measurement/internal/zzw$3;
            ((zzw.3)localObject7).<init>(this);
            ((zzq)localObject5).zza((String)localObject4, (URL)localObject2, (Map)localObject1, (zzq.zza)localObject7);
          }
          catch (MalformedURLException localMalformedURLException2)
          {
            localzza = zzAo().zzCE();
            localObject5 = "Failed to parse config URL. Not fetching";
            localzza.zzj((String)localObject5, localObject6);
          }
          break;
          bool4 = false;
        }
      }
      bool6 = false;
    }
  }
  
  void zzDg()
  {
    int i = this.zzaYr + 1;
    this.zzaYr = i;
  }
  
  void zzE(String paramString, int paramInt) {}
  
  public void zzJ(boolean paramBoolean)
  {
    zzDe();
  }
  
  void zza(EventParcel paramEventParcel, String paramString)
  {
    Object localObject1 = zzCj().zzeY(paramString);
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject2 = ((zza)localObject1).zzli();
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1) {}
    }
    else
    {
      localObject1 = zzAo().zzCJ();
      localObject2 = "No app data available; dropping event";
      ((zzp.zza)localObject1).zzj((String)localObject2, paramString);
    }
    for (;;)
    {
      return;
      try
      {
        localObject2 = getContext();
        localObject2 = ((Context)localObject2).getPackageManager();
        str1 = null;
        localObject2 = ((PackageManager)localObject2).getPackageInfo(paramString, 0);
        localObject2 = ((PackageInfo)localObject2).versionName;
        str1 = ((zza)localObject1).zzli();
        if (str1 != null)
        {
          str1 = ((zza)localObject1).zzli();
          bool1 = str1.equals(localObject2);
          if (!bool1)
          {
            localObject2 = zzAo();
            localObject2 = ((zzp)localObject2).zzCF();
            str1 = "App version does not match; dropping event";
            ((zzp.zza)localObject2).zzj(str1, paramString);
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject3 = zzAo().zzCF();
        String str1 = "Could not find package";
        ((zzp.zza)localObject3).zzj(str1, paramString);
        localObject3 = new com/google/android/gms/measurement/internal/AppMetadata;
        String str2 = ((zza)localObject1).zzBk();
        String str3 = ((zza)localObject1).zzli();
        String str4 = ((zza)localObject1).zzBo();
        long l1 = ((zza)localObject1).zzBp();
        long l2 = ((zza)localObject1).zzBq();
        boolean bool2 = ((zza)localObject1).zzAr();
        str1 = paramString;
        ((AppMetadata)localObject3).<init>(paramString, str2, str3, str4, l1, l2, null, bool2, false);
        zzb(paramEventParcel, (AppMetadata)localObject3);
      }
    }
  }
  
  void zza(zzh paramzzh, AppMetadata paramAppMetadata)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject1 = null;
    zzjk();
    zzjv();
    zzx.zzz(paramzzh);
    zzx.zzz(paramAppMetadata);
    zzx.zzcM(paramzzh.zzaUa);
    Object localObject2 = paramzzh.zzaUa;
    Object localObject3 = paramAppMetadata.packageName;
    zzx.zzac(((String)localObject2).equals(localObject3));
    localObject3 = new com/google/android/gms/internal/zzqb$zze;
    ((zzqb.zze)localObject3).<init>();
    localObject2 = Integer.valueOf(1);
    ((zzqb.zze)localObject3).zzbal = ((Integer)localObject2);
    ((zzqb.zze)localObject3).zzbat = "android";
    localObject2 = paramAppMetadata.packageName;
    ((zzqb.zze)localObject3).appId = ((String)localObject2);
    localObject2 = paramAppMetadata.zzaVu;
    ((zzqb.zze)localObject3).zzaVu = ((String)localObject2);
    localObject2 = paramAppMetadata.zzaMV;
    ((zzqb.zze)localObject3).zzaMV = ((String)localObject2);
    localObject2 = Long.valueOf(paramAppMetadata.zzaVv);
    ((zzqb.zze)localObject3).zzbax = ((Long)localObject2);
    localObject2 = paramAppMetadata.zzaVt;
    ((zzqb.zze)localObject3).zzaVt = ((String)localObject2);
    long l2 = paramAppMetadata.zzaVw;
    boolean bool = l2 < l1;
    if (!bool) {
      bool = false;
    }
    for (localObject2 = null;; localObject2 = Long.valueOf(l2))
    {
      ((zzqb.zze)localObject3).zzbaC = ((Long)localObject2);
      localObject2 = zzCo();
      Object localObject4 = paramAppMetadata.packageName;
      localObject4 = ((zzt)localObject2).zzfh((String)localObject4);
      if (localObject4 != null)
      {
        localObject2 = ((Pair)localObject4).first;
        if (localObject2 != null)
        {
          localObject2 = ((Pair)localObject4).second;
          if (localObject2 != null)
          {
            localObject2 = (String)((Pair)localObject4).first;
            ((zzqb.zze)localObject3).zzbaz = ((String)localObject2);
            localObject2 = (Boolean)((Pair)localObject4).second;
            ((zzqb.zze)localObject3).zzbaA = ((Boolean)localObject2);
          }
        }
      }
      localObject2 = zzCh().zzht();
      ((zzqb.zze)localObject3).zzbau = ((String)localObject2);
      localObject2 = zzCh().zzCy();
      ((zzqb.zze)localObject3).osVersion = ((String)localObject2);
      l2 = zzCh().zzCz();
      int j = (int)l2;
      localObject2 = Integer.valueOf(j);
      ((zzqb.zze)localObject3).zzbaw = ((Integer)localObject2);
      localObject2 = zzCh().zzCA();
      ((zzqb.zze)localObject3).zzbav = ((String)localObject2);
      ((zzqb.zze)localObject3).zzbay = null;
      ((zzqb.zze)localObject3).zzbao = null;
      ((zzqb.zze)localObject3).zzbap = null;
      ((zzqb.zze)localObject3).zzbaq = null;
      localObject2 = zzCj();
      localObject1 = paramAppMetadata.packageName;
      localObject2 = ((zze)localObject2).zzeY((String)localObject1);
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/measurement/internal/zza;
        localObject1 = paramAppMetadata.packageName;
        ((zza)localObject2).<init>(this, (String)localObject1);
        localObject1 = zzCo().zzCM();
        ((zza)localObject2).zzeM((String)localObject1);
        localObject1 = paramAppMetadata.zzaVt;
        ((zza)localObject2).zzeN((String)localObject1);
        localObject1 = zzCo();
        localObject4 = paramAppMetadata.packageName;
        localObject1 = ((zzt)localObject1).zzfi((String)localObject4);
        ((zza)localObject2).zzeO((String)localObject1);
        ((zza)localObject2).zzS(l1);
        ((zza)localObject2).zzO(l1);
        ((zza)localObject2).zzP(l1);
        localObject1 = paramAppMetadata.zzaMV;
        ((zza)localObject2).setAppVersion((String)localObject1);
        localObject1 = paramAppMetadata.zzaVu;
        ((zza)localObject2).zzeP((String)localObject1);
        l2 = paramAppMetadata.zzaVv;
        ((zza)localObject2).zzQ(l2);
        l2 = paramAppMetadata.zzaVw;
        ((zza)localObject2).zzR(l2);
        i = paramAppMetadata.zzaVy;
        ((zza)localObject2).setMeasurementEnabled(i);
        localObject1 = zzCj();
        ((zze)localObject1).zza((zza)localObject2);
      }
      localObject2 = ((zza)localObject2).zzBj();
      ((zzqb.zze)localObject3).zzbaB = ((String)localObject2);
      localObject2 = zzCj();
      localObject1 = paramAppMetadata.packageName;
      localObject4 = ((zze)localObject2).zzeX((String)localObject1);
      localObject2 = new zzqb.zzg[((List)localObject4).size()];
      ((zzqb.zze)localObject3).zzban = ((zzqb.zzg[])localObject2);
      j = 0;
      localObject2 = null;
      i = 0;
      localObject1 = null;
      for (;;)
      {
        j = ((List)localObject4).size();
        if (i >= j) {
          break;
        }
        zzqb.zzg localzzg = new com/google/android/gms/internal/zzqb$zzg;
        localzzg.<init>();
        ((zzqb.zze)localObject3).zzban[i] = localzzg;
        localObject2 = ((zzai)((List)localObject4).get(i)).mName;
        localzzg.name = ((String)localObject2);
        l1 = ((zzai)((List)localObject4).get(i)).zzaZp;
        localObject2 = Long.valueOf(l1);
        localzzg.zzbaJ = ((Long)localObject2);
        zzaj localzzaj = zzCk();
        localObject2 = ((zzai)((List)localObject4).get(i)).zzNc;
        localzzaj.zza(localzzg, localObject2);
        int k = i + 1;
        i = k;
      }
      l2 = paramAppMetadata.zzaVw;
    }
    try
    {
      localObject2 = zzCj();
      long l3 = ((zze)localObject2).zzb((zzqb.zze)localObject3);
      localObject3 = zzCj();
      ((zze)localObject3).zza(paramzzh, l3);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject1 = zzAo().zzCE();
        localObject3 = "Data loss. Failed to insert raw event metadata";
        ((zzp.zza)localObject1).zzj((String)localObject3, localIOException);
      }
    }
  }
  
  boolean zzad(long paramLong)
  {
    return zzg(null, paramLong);
  }
  
  void zzb(EventParcel paramEventParcel, AppMetadata paramAppMetadata)
  {
    long l1 = System.nanoTime();
    zzjk();
    zzjv();
    Object localObject1 = paramAppMetadata.packageName;
    zzx.zzcM((String)localObject1);
    Object localObject2 = paramAppMetadata.zzaVt;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool1) {}
    Object localObject5;
    long l3;
    Object localObject6;
    int n;
    long l5;
    label789:
    Object localObject4;
    for (;;)
    {
      return;
      bool1 = paramAppMetadata.zzaVy;
      if (!bool1)
      {
        zze(paramAppMetadata);
      }
      else
      {
        localObject2 = zzCl();
        localObject5 = paramEventParcel.name;
        bool1 = ((zzu)localObject2).zzP((String)localObject1, (String)localObject5);
        if (bool1)
        {
          localObject2 = zzAo().zzCK();
          localObject5 = "Dropping blacklisted event";
          localObject1 = paramEventParcel.name;
          ((zzp.zza)localObject2).zzj((String)localObject5, localObject1);
        }
        else
        {
          localObject2 = zzAo();
          int m = 2;
          bool1 = ((zzp)localObject2).zzQ(m);
          if (bool1)
          {
            localObject2 = zzAo().zzCK();
            localObject5 = "Logging event";
            ((zzp.zza)localObject2).zzj((String)localObject5, paramEventParcel);
          }
          localObject2 = zzCj();
          ((zze)localObject2).beginTransaction();
          Bundle localBundle;
          boolean bool5;
          for (;;)
          {
            try
            {
              localObject2 = paramEventParcel.zzaVV;
              localBundle = ((EventParams)localObject2).zzCC();
              zze(paramAppMetadata);
              localObject2 = "_iap";
              localObject5 = paramEventParcel.name;
              bool1 = ((String)localObject2).equals(localObject5);
              long l2;
              if (!bool1)
              {
                localObject2 = "ecommerce_purchase";
                localObject5 = paramEventParcel.name;
                bool1 = ((String)localObject2).equals(localObject5);
                if (!bool1) {}
              }
              else
              {
                localObject2 = "currency";
                localObject2 = localBundle.getString((String)localObject2);
                localObject5 = "value";
                l2 = localBundle.getLong((String)localObject5);
                boolean bool4 = TextUtils.isEmpty((CharSequence)localObject2);
                if (!bool4)
                {
                  l3 = 0L;
                  bool4 = l2 < l3;
                  if (bool4)
                  {
                    localObject5 = Locale.US;
                    localObject2 = ((String)localObject2).toUpperCase((Locale)localObject5);
                    localObject5 = "[A-Z]{3}";
                    bool4 = ((String)localObject2).matches((String)localObject5);
                    if (bool4)
                    {
                      localObject5 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject5).<init>();
                      localObject6 = "_ltv_";
                      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
                      localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
                      localObject6 = ((StringBuilder)localObject2).toString();
                      localObject2 = zzCj();
                      localObject2 = ((zze)localObject2).zzK((String)localObject1, (String)localObject6);
                      if (localObject2 != null)
                      {
                        localObject5 = ((zzai)localObject2).zzNc;
                        bool4 = localObject5 instanceof Long;
                        if (bool4) {
                          continue;
                        }
                      }
                      localObject2 = zzCj();
                      localObject5 = zzCp();
                      n = ((zzd)localObject5).zzeT((String)localObject1) + -1;
                      ((zze)localObject2).zzA((String)localObject1, n);
                      localObject5 = new com/google/android/gms/measurement/internal/zzai;
                      localObject2 = zzjl();
                      l3 = ((zzmq)localObject2).currentTimeMillis();
                      localObject7 = Long.valueOf(l2);
                      ((zzai)localObject5).<init>((String)localObject1, (String)localObject6, l3, localObject7);
                      localObject2 = zzCj();
                      ((zze)localObject2).zza((zzai)localObject5);
                    }
                  }
                }
              }
              localObject2 = paramEventParcel.name;
              bool5 = zzaj.zzfq((String)localObject2);
              bool1 = zzaj.zzI(localBundle);
              localObject6 = zzCj();
              l3 = zzDa();
              if ((bool5) && (bool1))
              {
                bool6 = true;
                localObject7 = localObject1;
                localObject5 = ((zze)localObject6).zza(l3, (String)localObject1, bool5, bool6);
                l3 = ((zze.zza)localObject5).zzaVF;
                localObject6 = zzCp();
                l4 = ((zzd)localObject6).zzBI();
                l3 -= l4;
                l4 = 0L;
                bool7 = l3 < l4;
                if (!bool7) {
                  break label789;
                }
                l5 = 1000L;
                l5 = l3 % l5;
                l3 = 1L;
                bool1 = l5 < l3;
                if (!bool1)
                {
                  localObject2 = zzAo();
                  localObject2 = ((zzp)localObject2).zzCF();
                  localObject1 = "Data loss. Too many events logged. count";
                  l3 = ((zze.zza)localObject5).zzaVF;
                  localObject5 = Long.valueOf(l3);
                  ((zzp.zza)localObject2).zzj((String)localObject1, localObject5);
                }
                localObject2 = zzCj();
                ((zze)localObject2).setTransactionSuccessful();
                localObject2 = zzCj();
                ((zze)localObject2).endTransaction();
                break;
                localObject2 = ((zzai)localObject2).zzNc;
                localObject2 = (Long)localObject2;
                l4 = ((Long)localObject2).longValue();
                localObject5 = new com/google/android/gms/measurement/internal/zzai;
                localObject2 = zzjl();
                l3 = ((zzmq)localObject2).currentTimeMillis();
                l2 += l4;
                localObject7 = Long.valueOf(l2);
                ((zzai)localObject5).<init>((String)localObject1, (String)localObject6, l3, localObject7);
                continue;
              }
              boolean bool6 = false;
            }
            finally
            {
              zzCj().endTransaction();
            }
          }
          boolean bool2;
          if (bool5)
          {
            l3 = ((zze.zza)localObject5).zzaVE;
            localObject6 = zzCp();
            l4 = ((zzd)localObject6).zzBJ();
            l3 -= l4;
            l4 = 0L;
            bool7 = l3 < l4;
            if (bool7)
            {
              int i = 2;
              zzE((String)localObject1, i);
              l5 = 1000L;
              l5 = l3 % l5;
              l3 = 1L;
              bool2 = l5 < l3;
              if (!bool2)
              {
                localObject4 = zzAo();
                localObject4 = ((zzp)localObject4).zzCF();
                localObject1 = "Data loss. Too many public events logged. count";
                l3 = ((zze.zza)localObject5).zzaVE;
                localObject5 = Long.valueOf(l3);
                ((zzp.zza)localObject4).zzj((String)localObject1, localObject5);
              }
              localObject4 = zzCj();
              ((zze)localObject4).setTransactionSuccessful();
              localObject4 = zzCj();
              ((zze)localObject4).endTransaction();
              continue;
            }
          }
          if ((bool5) && (bool2))
          {
            l6 = ((zze.zza)localObject5).zzaVG;
            localObject6 = zzCp();
            l3 = ((zzd)localObject6).zzBK();
            l6 -= l3;
            l3 = 0L;
            bool2 = l6 < l3;
            if (bool2)
            {
              localObject4 = "_c";
              localBundle.remove((String)localObject4);
              int j = 4;
              zzb(localBundle, j);
            }
          }
          localObject4 = zzCj();
          long l6 = ((zze)localObject4).zzeZ((String)localObject1);
          l3 = 0L;
          boolean bool7 = l6 < l3;
          if (bool7)
          {
            localObject6 = zzAo();
            localObject6 = ((zzp)localObject6).zzCF();
            localObject8 = "Data lost. Too many events stored on disk, deleted";
            localObject4 = Long.valueOf(l6);
            ((zzp.zza)localObject6).zzj((String)localObject8, localObject4);
          }
          localObject6 = new com/google/android/gms/measurement/internal/zzh;
          localObject9 = paramEventParcel.zzaVW;
          str = paramEventParcel.name;
          l4 = paramEventParcel.zzaVX;
          l7 = 0L;
          Object localObject8 = this;
          Object localObject7 = localObject1;
          ((zzh)localObject6).<init>(this, (String)localObject9, (String)localObject1, str, l4, l7, localBundle);
          localObject4 = zzCj();
          localObject5 = ((zzh)localObject6).mName;
          localObject4 = ((zze)localObject4).zzI((String)localObject1, (String)localObject5);
          if (localObject4 != null) {
            break label1473;
          }
          localObject4 = zzCj();
          l6 = ((zze)localObject4).zzfd((String)localObject1);
          localObject8 = zzCp();
          int i1 = ((zzd)localObject8).zzBH();
          l3 = i1;
          int k = l6 < l3;
          if (k < 0) {
            break;
          }
          localObject4 = zzAo();
          localObject4 = ((zzp)localObject4).zzCF();
          localObject5 = "Too many event names used, ignoring event. name, supported count";
          localObject6 = ((zzh)localObject6).mName;
          localObject8 = zzCp();
          i1 = ((zzd)localObject8).zzBH();
          localObject8 = Integer.valueOf(i1);
          ((zzp.zza)localObject4).zze((String)localObject5, localObject6, localObject8);
          k = 1;
          zzE((String)localObject1, k);
          localObject4 = zzCj();
          ((zze)localObject4).endTransaction();
        }
      }
    }
    Object localObject9 = new com/google/android/gms/measurement/internal/zzi;
    String str = ((zzh)localObject6).mName;
    long l4 = 0L;
    long l7 = 0L;
    long l8 = ((zzh)localObject6).zzaez;
    ((zzi)localObject9).<init>((String)localObject1, str, l4, l7, l8);
    for (;;)
    {
      localObject4 = zzCj();
      ((zze)localObject4).zza((zzi)localObject9);
      zza((zzh)localObject6, paramAppMetadata);
      localObject4 = zzCj();
      ((zze)localObject4).setTransactionSuccessful();
      localObject4 = zzAo();
      n = 2;
      boolean bool3 = ((zzp)localObject4).zzQ(n);
      if (bool3)
      {
        localObject4 = zzAo();
        localObject4 = ((zzp)localObject4).zzCK();
        localObject5 = "Event recorded";
        ((zzp.zza)localObject4).zzj((String)localObject5, localObject6);
      }
      zzCj().endTransaction();
      zzDe();
      localObject4 = zzAo().zzCK();
      localObject5 = "Background event processing time, ms";
      l5 = System.nanoTime() - l1 + 500000L;
      l3 = 1000000L;
      l5 /= l3;
      localObject1 = Long.valueOf(l5);
      ((zzp.zza)localObject4).zzj((String)localObject5, localObject1);
      break;
      label1473:
      l3 = ((zzi)localObject4).zzaVR;
      localObject6 = ((zzh)localObject6).zza(this, l3);
      l3 = ((zzh)localObject6).zzaez;
      localObject9 = ((zzi)localObject4).zzab(l3);
    }
  }
  
  /* Error */
  void zzb(UserAttributeParcel paramUserAttributeParcel, AppMetadata paramAppMetadata)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 344	com/google/android/gms/measurement/internal/zzw:zzjk	()V
    //   4: aload_0
    //   5: invokevirtual 347	com/google/android/gms/measurement/internal/zzw:zzjv	()V
    //   8: aload_2
    //   9: getfield 634	com/google/android/gms/measurement/internal/AppMetadata:zzaVt	Ljava/lang/String;
    //   12: astore_3
    //   13: aload_3
    //   14: invokestatic 363	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   17: istore 4
    //   19: iload 4
    //   21: ifeq +4 -> 25
    //   24: return
    //   25: aload_2
    //   26: getfield 684	com/google/android/gms/measurement/internal/AppMetadata:zzaVy	Z
    //   29: istore 4
    //   31: iload 4
    //   33: ifne +11 -> 44
    //   36: aload_0
    //   37: aload_2
    //   38: invokespecial 1179	com/google/android/gms/measurement/internal/zzw:zze	(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   41: goto -17 -> 24
    //   44: aload_0
    //   45: invokevirtual 418	com/google/android/gms/measurement/internal/zzw:zzCk	()Lcom/google/android/gms/measurement/internal/zzaj;
    //   48: astore_3
    //   49: aload_1
    //   50: getfield 1364	com/google/android/gms/measurement/internal/UserAttributeParcel:name	Ljava/lang/String;
    //   53: astore 5
    //   55: aload_3
    //   56: aload 5
    //   58: invokevirtual 1367	com/google/android/gms/measurement/internal/zzaj:zzfs	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: invokevirtual 418	com/google/android/gms/measurement/internal/zzw:zzCk	()Lcom/google/android/gms/measurement/internal/zzaj;
    //   65: astore_3
    //   66: aload_1
    //   67: getfield 1364	com/google/android/gms/measurement/internal/UserAttributeParcel:name	Ljava/lang/String;
    //   70: astore 5
    //   72: aload_1
    //   73: invokevirtual 1370	com/google/android/gms/measurement/internal/UserAttributeParcel:getValue	()Ljava/lang/Object;
    //   76: astore 6
    //   78: aload_3
    //   79: aload 5
    //   81: aload 6
    //   83: invokevirtual 1373	com/google/android/gms/measurement/internal/zzaj:zzm	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore 7
    //   88: aload 7
    //   90: ifnull -66 -> 24
    //   93: new 1142	com/google/android/gms/measurement/internal/zzai
    //   96: astore 5
    //   98: aload_2
    //   99: getfield 616	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   102: astore 6
    //   104: aload_1
    //   105: getfield 1364	com/google/android/gms/measurement/internal/UserAttributeParcel:name	Ljava/lang/String;
    //   108: astore 8
    //   110: aload_1
    //   111: getfield 1376	com/google/android/gms/measurement/internal/UserAttributeParcel:zzaZm	J
    //   114: lstore 9
    //   116: aload 5
    //   118: aload 6
    //   120: aload 8
    //   122: lload 9
    //   124: aload 7
    //   126: invokespecial 1247	com/google/android/gms/measurement/internal/zzai:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   129: aload_0
    //   130: invokevirtual 105	com/google/android/gms/measurement/internal/zzw:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   133: invokevirtual 142	com/google/android/gms/measurement/internal/zzp:zzCJ	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   136: astore_3
    //   137: ldc_w 1378
    //   140: astore 6
    //   142: aload 5
    //   144: getfield 1145	com/google/android/gms/measurement/internal/zzai:mName	Ljava/lang/String;
    //   147: astore 8
    //   149: aload_3
    //   150: aload 6
    //   152: aload 8
    //   154: aload 7
    //   156: invokevirtual 277	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   159: aload_0
    //   160: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   163: astore_3
    //   164: aload_3
    //   165: invokevirtual 491	com/google/android/gms/measurement/internal/zze:beginTransaction	()V
    //   168: aload_0
    //   169: aload_2
    //   170: invokespecial 1179	com/google/android/gms/measurement/internal/zzw:zze	(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   173: aload_0
    //   174: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   177: astore_3
    //   178: aload_3
    //   179: aload 5
    //   181: invokevirtual 1250	com/google/android/gms/measurement/internal/zze:zza	(Lcom/google/android/gms/measurement/internal/zzai;)Z
    //   184: istore 4
    //   186: aload_0
    //   187: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   190: astore 6
    //   192: aload 6
    //   194: invokevirtual 516	com/google/android/gms/measurement/internal/zze:setTransactionSuccessful	()V
    //   197: iload 4
    //   199: ifeq +54 -> 253
    //   202: aload_0
    //   203: invokevirtual 105	com/google/android/gms/measurement/internal/zzw:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   206: astore_3
    //   207: aload_3
    //   208: invokevirtual 142	com/google/android/gms/measurement/internal/zzp:zzCJ	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   211: astore_3
    //   212: ldc_w 1380
    //   215: astore 6
    //   217: aload 5
    //   219: getfield 1145	com/google/android/gms/measurement/internal/zzai:mName	Ljava/lang/String;
    //   222: astore 8
    //   224: aload 5
    //   226: getfield 1155	com/google/android/gms/measurement/internal/zzai:zzNc	Ljava/lang/Object;
    //   229: astore 5
    //   231: aload_3
    //   232: aload 6
    //   234: aload 8
    //   236: aload 5
    //   238: invokevirtual 277	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   241: aload_0
    //   242: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   245: astore_3
    //   246: aload_3
    //   247: invokevirtual 513	com/google/android/gms/measurement/internal/zze:endTransaction	()V
    //   250: goto -226 -> 24
    //   253: aload_0
    //   254: invokevirtual 105	com/google/android/gms/measurement/internal/zzw:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   257: astore_3
    //   258: aload_3
    //   259: invokevirtual 1383	com/google/android/gms/measurement/internal/zzp:zzCH	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   262: astore_3
    //   263: ldc_w 1385
    //   266: astore 6
    //   268: aload 5
    //   270: getfield 1145	com/google/android/gms/measurement/internal/zzai:mName	Ljava/lang/String;
    //   273: astore 8
    //   275: aload 5
    //   277: getfield 1155	com/google/android/gms/measurement/internal/zzai:zzNc	Ljava/lang/Object;
    //   280: astore 5
    //   282: aload_3
    //   283: aload 6
    //   285: aload 8
    //   287: aload 5
    //   289: invokevirtual 277	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   292: goto -51 -> 241
    //   295: astore_3
    //   296: aload_0
    //   297: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   300: invokevirtual 513	com/google/android/gms/measurement/internal/zze:endTransaction	()V
    //   303: aload_3
    //   304: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	305	0	this	zzw
    //   0	305	1	paramUserAttributeParcel	UserAttributeParcel
    //   0	305	2	paramAppMetadata	AppMetadata
    //   12	271	3	localObject1	Object
    //   295	9	3	localObject2	Object
    //   17	181	4	bool	boolean
    //   53	235	5	localObject3	Object
    //   76	208	6	localObject4	Object
    //   86	69	7	localObject5	Object
    //   108	178	8	str	String
    //   114	9	9	l	long
    // Exception table:
    //   from	to	target	type
    //   169	173	295	finally
    //   173	177	295	finally
    //   179	184	295	finally
    //   186	190	295	finally
    //   192	197	295	finally
    //   202	206	295	finally
    //   207	211	295	finally
    //   217	222	295	finally
    //   224	229	295	finally
    //   236	241	295	finally
    //   253	257	295	finally
    //   258	262	295	finally
    //   268	273	295	finally
    //   275	280	295	finally
    //   287	292	295	finally
  }
  
  void zzb(zzz paramzzz)
  {
    int i = this.zzaYq + 1;
    this.zzaYq = i;
  }
  
  void zzc(AppMetadata paramAppMetadata)
  {
    zzjk();
    zzjv();
    zzx.zzcM(paramAppMetadata.packageName);
    zze(paramAppMetadata);
  }
  
  void zzc(UserAttributeParcel paramUserAttributeParcel, AppMetadata paramAppMetadata)
  {
    zzjk();
    zzjv();
    Object localObject1 = paramAppMetadata.zzaVt;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {}
    for (;;)
    {
      return;
      bool = paramAppMetadata.zzaVy;
      if (!bool)
      {
        zze(paramAppMetadata);
        continue;
      }
      localObject1 = zzAo().zzCJ();
      String str1 = "Removing user property";
      String str2 = paramUserAttributeParcel.name;
      ((zzp.zza)localObject1).zzj(str1, str2);
      localObject1 = zzCj();
      ((zze)localObject1).beginTransaction();
      try
      {
        zze(paramAppMetadata);
        localObject1 = zzCj();
        str1 = paramAppMetadata.packageName;
        str2 = paramUserAttributeParcel.name;
        ((zze)localObject1).zzJ(str1, str2);
        localObject1 = zzCj();
        ((zze)localObject1).setTransactionSuccessful();
        localObject1 = zzAo();
        localObject1 = ((zzp)localObject1).zzCJ();
        str1 = "User property removed";
        str2 = paramUserAttributeParcel.name;
        ((zzp.zza)localObject1).zzj(str1, str2);
        localObject1 = zzCj();
        ((zze)localObject1).endTransaction();
      }
      finally
      {
        zzCj().endTransaction();
      }
    }
  }
  
  /* Error */
  public void zzd(AppMetadata paramAppMetadata)
  {
    // Byte code:
    //   0: ldc2_w 1394
    //   3: lstore_2
    //   4: lconst_1
    //   5: lstore 4
    //   7: aload_0
    //   8: invokevirtual 344	com/google/android/gms/measurement/internal/zzw:zzjk	()V
    //   11: aload_0
    //   12: invokevirtual 347	com/google/android/gms/measurement/internal/zzw:zzjv	()V
    //   15: aload_1
    //   16: invokestatic 65	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   19: pop
    //   20: aload_1
    //   21: getfield 616	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   24: invokestatic 546	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   27: pop
    //   28: aload_1
    //   29: getfield 634	com/google/android/gms/measurement/internal/AppMetadata:zzaVt	Ljava/lang/String;
    //   32: astore 6
    //   34: aload 6
    //   36: invokestatic 363	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   39: istore 7
    //   41: iload 7
    //   43: ifeq +4 -> 47
    //   46: return
    //   47: aload_1
    //   48: getfield 684	com/google/android/gms/measurement/internal/AppMetadata:zzaVy	Z
    //   51: istore 7
    //   53: iload 7
    //   55: ifne +11 -> 66
    //   58: aload_0
    //   59: aload_1
    //   60: invokespecial 1179	com/google/android/gms/measurement/internal/zzw:zze	(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   63: goto -17 -> 46
    //   66: aload_0
    //   67: invokevirtual 433	com/google/android/gms/measurement/internal/zzw:zzjl	()Lcom/google/android/gms/internal/zzmq;
    //   70: invokeinterface 438 1 0
    //   75: lstore 8
    //   77: aload_0
    //   78: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   81: astore 6
    //   83: aload 6
    //   85: invokevirtual 491	com/google/android/gms/measurement/internal/zze:beginTransaction	()V
    //   88: aload_0
    //   89: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   92: astore 6
    //   94: aload_1
    //   95: getfield 616	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   98: astore 10
    //   100: aload 6
    //   102: aload 10
    //   104: invokevirtual 582	com/google/android/gms/measurement/internal/zze:zzeY	(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zza;
    //   107: astore 6
    //   109: aload 6
    //   111: ifnull +120 -> 231
    //   114: aload 6
    //   116: invokevirtual 660	com/google/android/gms/measurement/internal/zza:zzli	()Ljava/lang/String;
    //   119: astore 10
    //   121: aload 10
    //   123: ifnull +108 -> 231
    //   126: aload 6
    //   128: invokevirtual 660	com/google/android/gms/measurement/internal/zza:zzli	()Ljava/lang/String;
    //   131: astore 10
    //   133: aload_1
    //   134: getfield 657	com/google/android/gms/measurement/internal/AppMetadata:zzaMV	Ljava/lang/String;
    //   137: astore 11
    //   139: aload 10
    //   141: aload 11
    //   143: invokevirtual 643	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: istore 12
    //   148: iload 12
    //   150: ifne +81 -> 231
    //   153: new 568	android/os/Bundle
    //   156: astore 13
    //   158: aload 13
    //   160: invokespecial 1398	android/os/Bundle:<init>	()V
    //   163: ldc_w 1400
    //   166: astore 10
    //   168: aload 6
    //   170: invokevirtual 660	com/google/android/gms/measurement/internal/zza:zzli	()Ljava/lang/String;
    //   173: astore 6
    //   175: aload 13
    //   177: aload 10
    //   179: aload 6
    //   181: invokevirtual 1403	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: new 1181	com/google/android/gms/measurement/internal/EventParcel
    //   187: astore 6
    //   189: ldc_w 1405
    //   192: astore 10
    //   194: new 1192	com/google/android/gms/measurement/internal/EventParams
    //   197: astore 11
    //   199: aload 11
    //   201: aload 13
    //   203: invokespecial 1408	com/google/android/gms/measurement/internal/EventParams:<init>	(Landroid/os/Bundle;)V
    //   206: ldc_w 1410
    //   209: astore 13
    //   211: aload 6
    //   213: aload 10
    //   215: aload 11
    //   217: aload 13
    //   219: lload 8
    //   221: invokespecial 1413	com/google/android/gms/measurement/internal/EventParcel:<init>	(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V
    //   224: aload_0
    //   225: aload 6
    //   227: aload_1
    //   228: invokevirtual 1067	com/google/android/gms/measurement/internal/zzw:zzb	(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   231: aload_0
    //   232: aload_1
    //   233: invokespecial 1179	com/google/android/gms/measurement/internal/zzw:zze	(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   236: aload_0
    //   237: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   240: astore 6
    //   242: aload_1
    //   243: getfield 616	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   246: astore 10
    //   248: ldc_w 1415
    //   251: astore 11
    //   253: aload 6
    //   255: aload 10
    //   257: aload 11
    //   259: invokevirtual 1317	com/google/android/gms/measurement/internal/zze:zzI	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzi;
    //   262: astore 6
    //   264: aload 6
    //   266: ifnonnull +161 -> 427
    //   269: ldc2_w 1394
    //   272: lstore 14
    //   274: lload 8
    //   276: lload 14
    //   278: ldiv
    //   279: lload 4
    //   281: ladd
    //   282: lload_2
    //   283: lmul
    //   284: lstore 14
    //   286: new 1363	com/google/android/gms/measurement/internal/UserAttributeParcel
    //   289: astore 11
    //   291: ldc_w 1417
    //   294: astore 13
    //   296: lload 14
    //   298: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   301: astore 16
    //   303: ldc_w 1410
    //   306: astore 17
    //   308: aload 11
    //   310: aload 13
    //   312: lload 8
    //   314: aload 16
    //   316: aload 17
    //   318: invokespecial 1420	com/google/android/gms/measurement/internal/UserAttributeParcel:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   321: aload_0
    //   322: aload 11
    //   324: aload_1
    //   325: invokevirtual 1423	com/google/android/gms/measurement/internal/zzw:zzb	(Lcom/google/android/gms/measurement/internal/UserAttributeParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   328: new 568	android/os/Bundle
    //   331: astore 13
    //   333: aload 13
    //   335: invokespecial 1398	android/os/Bundle:<init>	()V
    //   338: ldc_w 1292
    //   341: astore 6
    //   343: lconst_1
    //   344: lstore 4
    //   346: aload 13
    //   348: aload 6
    //   350: lload 4
    //   352: invokevirtual 576	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   355: new 1181	com/google/android/gms/measurement/internal/EventParcel
    //   358: astore 6
    //   360: ldc_w 1415
    //   363: astore 10
    //   365: new 1192	com/google/android/gms/measurement/internal/EventParams
    //   368: astore 11
    //   370: aload 11
    //   372: aload 13
    //   374: invokespecial 1408	com/google/android/gms/measurement/internal/EventParams:<init>	(Landroid/os/Bundle;)V
    //   377: ldc_w 1410
    //   380: astore 13
    //   382: aload 6
    //   384: aload 10
    //   386: aload 11
    //   388: aload 13
    //   390: lload 8
    //   392: invokespecial 1413	com/google/android/gms/measurement/internal/EventParcel:<init>	(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V
    //   395: aload_0
    //   396: aload 6
    //   398: aload_1
    //   399: invokevirtual 1067	com/google/android/gms/measurement/internal/zzw:zzb	(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   402: aload_0
    //   403: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   406: astore 6
    //   408: aload 6
    //   410: invokevirtual 516	com/google/android/gms/measurement/internal/zze:setTransactionSuccessful	()V
    //   413: aload_0
    //   414: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   417: astore 6
    //   419: aload 6
    //   421: invokevirtual 513	com/google/android/gms/measurement/internal/zze:endTransaction	()V
    //   424: goto -378 -> 46
    //   427: aload_1
    //   428: getfield 1426	com/google/android/gms/measurement/internal/AppMetadata:zzaVz	Z
    //   431: istore 7
    //   433: iload 7
    //   435: ifeq -33 -> 402
    //   438: new 1181	com/google/android/gms/measurement/internal/EventParcel
    //   441: astore 6
    //   443: ldc_w 1428
    //   446: astore 10
    //   448: new 1192	com/google/android/gms/measurement/internal/EventParams
    //   451: astore 11
    //   453: new 568	android/os/Bundle
    //   456: astore 13
    //   458: aload 13
    //   460: invokespecial 1398	android/os/Bundle:<init>	()V
    //   463: aload 11
    //   465: aload 13
    //   467: invokespecial 1408	com/google/android/gms/measurement/internal/EventParams:<init>	(Landroid/os/Bundle;)V
    //   470: ldc_w 1410
    //   473: astore 13
    //   475: aload 6
    //   477: aload 10
    //   479: aload 11
    //   481: aload 13
    //   483: lload 8
    //   485: invokespecial 1413	com/google/android/gms/measurement/internal/EventParcel:<init>	(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V
    //   488: aload_0
    //   489: aload 6
    //   491: aload_1
    //   492: invokevirtual 1067	com/google/android/gms/measurement/internal/zzw:zzb	(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   495: goto -93 -> 402
    //   498: astore 6
    //   500: aload_0
    //   501: invokevirtual 351	com/google/android/gms/measurement/internal/zzw:zzCj	()Lcom/google/android/gms/measurement/internal/zze;
    //   504: invokevirtual 513	com/google/android/gms/measurement/internal/zze:endTransaction	()V
    //   507: aload 6
    //   509: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	510	0	this	zzw
    //   0	510	1	paramAppMetadata	AppMetadata
    //   3	280	2	l1	long
    //   5	346	4	l2	long
    //   32	458	6	localObject1	Object
    //   498	10	6	localObject2	Object
    //   39	395	7	bool1	boolean
    //   75	409	8	l3	long
    //   98	380	10	str1	String
    //   137	343	11	localObject3	Object
    //   146	3	12	bool2	boolean
    //   156	326	13	localObject4	Object
    //   272	25	14	l4	long
    //   301	14	16	localLong	Long
    //   306	11	17	str2	String
    // Exception table:
    //   from	to	target	type
    //   88	92	498	finally
    //   94	98	498	finally
    //   102	107	498	finally
    //   114	119	498	finally
    //   126	131	498	finally
    //   133	137	498	finally
    //   141	146	498	finally
    //   153	156	498	finally
    //   158	163	498	finally
    //   168	173	498	finally
    //   179	184	498	finally
    //   184	187	498	finally
    //   194	197	498	finally
    //   201	206	498	finally
    //   219	224	498	finally
    //   227	231	498	finally
    //   232	236	498	finally
    //   236	240	498	finally
    //   242	246	498	finally
    //   257	262	498	finally
    //   276	279	498	finally
    //   286	289	498	finally
    //   296	301	498	finally
    //   316	321	498	finally
    //   324	328	498	finally
    //   328	331	498	finally
    //   333	338	498	finally
    //   350	355	498	finally
    //   355	358	498	finally
    //   365	368	498	finally
    //   372	377	498	finally
    //   390	395	498	finally
    //   398	402	498	finally
    //   402	406	498	finally
    //   408	413	498	finally
    //   427	431	498	finally
    //   438	441	498	finally
    //   448	451	498	finally
    //   453	456	498	finally
    //   458	463	498	finally
    //   465	470	498	finally
    //   483	488	498	finally
    //   491	495	498	finally
  }
  
  void zzjj()
  {
    Object localObject = zzCp();
    boolean bool = ((zzd)localObject).zzkr();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Unexpected call on package side");
      throw ((Throwable)localObject);
    }
  }
  
  public void zzjk()
  {
    zzCn().zzjk();
  }
  
  public zzmq zzjl()
  {
    return this.zzqW;
  }
  
  void zzjv()
  {
    boolean bool = this.zzQk;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("AppMeasurement is not initialized");
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */