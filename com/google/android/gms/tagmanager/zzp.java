package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzrq.zza;
import com.google.android.gms.internal.zzrr;
import com.google.android.gms.internal.zzrs.zzc;

public class zzp
  extends zzb
{
  private final Context mContext;
  private final Looper zzagr;
  private final String zzbhM;
  private long zzbhR;
  private final TagManager zzbhY;
  private final zzp.zzd zzbib;
  private final zzcd zzbic;
  private final int zzbid;
  private zzp.zzf zzbie;
  private zzrr zzbif;
  private volatile zzo zzbig;
  private volatile boolean zzbih;
  private zzaf.zzj zzbii;
  private String zzbij;
  private zzp.zze zzbik;
  private zzp.zza zzbil;
  private final zzmq zzqW;
  
  zzp(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzp.zzf paramzzf, zzp.zze paramzze, zzrr paramzzrr, zzmq paramzzmq, zzcd paramzzcd) {}
  
  public zzp(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzs paramzzs)
  {
    this(paramContext, paramTagManager, paramLooper, paramString, paramInt, (zzp.zzf)localObject3, localzzcm, localzzrr, localzzmq, (zzcd)localObject2);
    localObject2 = this.zzbif;
    localObject4 = paramzzs.zzGm();
    ((zzrr)localObject2).zzgB((String)localObject4);
  }
  
  private boolean zzGj()
  {
    Object localObject1 = zzcb.zzGU();
    Object localObject2 = ((zzcb)localObject1).zzGV();
    zzcb.zza localzza = zzcb.zza.zzbjV;
    boolean bool;
    if (localObject2 != localzza)
    {
      localObject2 = ((zzcb)localObject1).zzGV();
      localzza = zzcb.zza.zzbjW;
      if (localObject2 != localzza) {}
    }
    else
    {
      localObject2 = this.zzbhM;
      localObject1 = ((zzcb)localObject1).getContainerId();
      bool = ((String)localObject2).equals(localObject1);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  private void zza(zzaf.zzj paramzzj)
  {
    try
    {
      Object localObject1 = this.zzbie;
      if (localObject1 != null)
      {
        localObject1 = new com/google/android/gms/internal/zzrq$zza;
        ((zzrq.zza)localObject1).<init>();
        long l = this.zzbhR;
        ((zzrq.zza)localObject1).zzbmd = l;
        Object localObject3 = new com/google/android/gms/internal/zzaf$zzf;
        ((zzaf.zzf)localObject3).<init>();
        ((zzrq.zza)localObject1).zzju = ((zzaf.zzf)localObject3);
        ((zzrq.zza)localObject1).zzbme = paramzzj;
        localObject3 = this.zzbie;
        ((zzp.zzf)localObject3).zzb((zzrq.zza)localObject1);
      }
      return;
    }
    finally {}
  }
  
  private void zza(zzaf.zzj paramzzj, long paramLong, boolean paramBoolean)
  {
    long l1 = 43200000L;
    if (paramBoolean) {}
    for (;;)
    {
      Object localObject3;
      try
      {
        boolean bool1 = this.zzbih;
        if (bool1) {
          return;
        }
        bool1 = isReady();
        if (bool1)
        {
          localObject1 = this.zzbig;
          if (localObject1 != null) {}
        }
        this.zzbii = paramzzj;
        this.zzbhR = paramLong;
        long l2 = 0L;
        long l3 = 43200000L;
        long l4 = this.zzbhR + l1;
        Object localObject2 = this.zzqW;
        l1 = ((zzmq)localObject2).currentTimeMillis();
        l4 -= l1;
        l3 = Math.min(l3, l4);
        l2 = Math.max(l2, l3);
        zzak(l2);
        Object localObject1 = new com/google/android/gms/tagmanager/Container;
        localObject3 = this.mContext;
        Object localObject4 = this.zzbhY;
        localObject4 = ((TagManager)localObject4).getDataLayer();
        Object localObject5 = this.zzbhM;
        l4 = paramLong;
        localObject2 = paramzzj;
        ((Container)localObject1).<init>((Context)localObject3, (DataLayer)localObject4, (String)localObject5, paramLong, paramzzj);
        localObject3 = this.zzbig;
        if (localObject3 == null)
        {
          localObject3 = new com/google/android/gms/tagmanager/zzo;
          localObject4 = this.zzbhY;
          localObject5 = this.zzagr;
          zzp.zzd localzzd = this.zzbib;
          ((zzo)localObject3).<init>((TagManager)localObject4, (Looper)localObject5, (Container)localObject1, localzzd);
          this.zzbig = ((zzo)localObject3);
          boolean bool2 = isReady();
          if (bool2) {
            continue;
          }
          localObject3 = this.zzbil;
          bool1 = ((zzp.zza)localObject3).zzb((Container)localObject1);
          if (!bool1) {
            continue;
          }
          localObject1 = this.zzbig;
          zza((Result)localObject1);
          continue;
        }
        localObject3 = this.zzbig;
      }
      finally {}
      ((zzo)localObject3).zza(localContainer);
    }
  }
  
  /* Error */
  private void zzak(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	com/google/android/gms/tagmanager/zzp:zzbik	Lcom/google/android/gms/tagmanager/zzp$zze;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +14 -> 22
    //   11: ldc_w 262
    //   14: astore_3
    //   15: aload_3
    //   16: invokestatic 267	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 61	com/google/android/gms/tagmanager/zzp:zzbik	Lcom/google/android/gms/tagmanager/zzp$zze;
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 77	com/google/android/gms/tagmanager/zzp:zzbii	Lcom/google/android/gms/internal/zzaf$zzj;
    //   31: astore 4
    //   33: aload 4
    //   35: getfield 270	com/google/android/gms/internal/zzaf$zzj:zzjv	Ljava/lang/String;
    //   38: astore 4
    //   40: aload_3
    //   41: lload_1
    //   42: aload 4
    //   44: invokeinterface 276 4 0
    //   49: goto -30 -> 19
    //   52: astore_3
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_3
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	zzp
    //   0	57	1	paramLong	long
    //   6	35	3	localObject1	Object
    //   52	4	3	localObject2	Object
    //   31	12	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	52	finally
    //   15	19	52	finally
    //   22	26	52	finally
    //   27	31	52	finally
    //   33	38	52	finally
    //   42	49	52	finally
  }
  
  private void zzaw(boolean paramBoolean)
  {
    long l = 0L;
    DataLayer localDataLayer = null;
    Object localObject1 = this.zzbie;
    Object localObject2 = new com/google/android/gms/tagmanager/zzp$zzb;
    ((zzp.zzb)localObject2).<init>(this, null);
    ((zzp.zzf)localObject1).zza((zzbf)localObject2);
    localObject1 = this.zzbik;
    localObject2 = new com/google/android/gms/tagmanager/zzp$zzc;
    ((zzp.zzc)localObject2).<init>(this, null);
    ((zzp.zze)localObject1).zza((zzbf)localObject2);
    localObject1 = this.zzbie;
    int i = this.zzbid;
    zzrs.zzc localzzc = ((zzp.zzf)localObject1).zzke(i);
    if (localzzc != null)
    {
      zzo localzzo = new com/google/android/gms/tagmanager/zzo;
      TagManager localTagManager = this.zzbhY;
      Looper localLooper = this.zzagr;
      localObject1 = new com/google/android/gms/tagmanager/Container;
      localObject2 = this.mContext;
      localDataLayer = this.zzbhY.getDataLayer();
      String str = this.zzbhM;
      ((Container)localObject1).<init>((Context)localObject2, localDataLayer, str, l, localzzc);
      localObject2 = this.zzbib;
      localzzo.<init>(localTagManager, localLooper, (Container)localObject1, (zzo.zza)localObject2);
      this.zzbig = localzzo;
    }
    localObject1 = new com/google/android/gms/tagmanager/zzp$3;
    ((zzp.3)localObject1).<init>(this, paramBoolean);
    this.zzbil = ((zzp.zza)localObject1);
    boolean bool = zzGj();
    if (bool)
    {
      localObject1 = this.zzbik;
      localObject2 = "";
      ((zzp.zze)localObject1).zzf(l, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzbie;
      ((zzp.zzf)localObject1).zzGl();
    }
  }
  
  String zzGd()
  {
    try
    {
      String str = this.zzbij;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void zzGg()
  {
    Object localObject1 = this.zzbie;
    int i = this.zzbid;
    zzrs.zzc localzzc = ((zzp.zzf)localObject1).zzke(i);
    Object localObject2;
    if (localzzc != null)
    {
      localObject1 = new com/google/android/gms/tagmanager/Container;
      localObject2 = this.mContext;
      Object localObject3 = this.zzbhY.getDataLayer();
      Object localObject4 = this.zzbhM;
      long l = 0L;
      ((Container)localObject1).<init>((Context)localObject2, (DataLayer)localObject3, (String)localObject4, l, localzzc);
      localObject2 = new com/google/android/gms/tagmanager/zzo;
      localObject3 = this.zzbhY;
      localObject4 = this.zzagr;
      zzp.2 local2 = new com/google/android/gms/tagmanager/zzp$2;
      local2.<init>(this);
      ((zzo)localObject2).<init>((TagManager)localObject3, (Looper)localObject4, (Container)localObject1, local2);
      zza((Result)localObject2);
    }
    for (;;)
    {
      this.zzbik = null;
      this.zzbie = null;
      return;
      localObject1 = "Default was requested, but no default container was found";
      zzbg.e((String)localObject1);
      localObject2 = new com/google/android/gms/common/api/Status;
      int j = 10;
      ((Status)localObject2).<init>(j, (String)localObject1, null);
      localObject1 = zzbn((Status)localObject2);
      zza((Result)localObject1);
    }
  }
  
  public void zzGh()
  {
    zzaw(false);
  }
  
  public void zzGi()
  {
    zzaw(true);
  }
  
  protected ContainerHolder zzbn(Status paramStatus)
  {
    Object localObject = this.zzbig;
    if (localObject != null) {
      localObject = this.zzbig;
    }
    for (;;)
    {
      return (ContainerHolder)localObject;
      localObject = Status.zzagF;
      if (paramStatus == localObject)
      {
        localObject = "timer expired: setting result to failure";
        zzbg.e((String)localObject);
      }
      localObject = new com/google/android/gms/tagmanager/zzo;
      ((zzo)localObject).<init>(paramStatus);
    }
  }
  
  void zzfT(String paramString)
  {
    try
    {
      this.zzbij = paramString;
      zzp.zze localzze = this.zzbik;
      if (localzze != null)
      {
        localzze = this.zzbik;
        localzze.zzfW(paramString);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */