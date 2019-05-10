package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.zze;

public class zzx
  extends zzm.zza
{
  private final zzw zzaTV;
  private final boolean zzaYw;
  
  public zzx(zzw paramzzw)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramzzw);
    this.zzaTV = paramzzw;
    this.zzaYw = false;
  }
  
  public zzx(zzw paramzzw, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramzzw);
    this.zzaTV = paramzzw;
    this.zzaYw = paramBoolean;
  }
  
  private void zzfm(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      this.zzaTV.zzAo().zzCE().zzfg("Measurement Service called without app package");
      SecurityException localSecurityException1 = new java/lang/SecurityException;
      localSecurityException1.<init>("Measurement Service called without app package");
      throw localSecurityException1;
    }
    try
    {
      zzfn(paramString);
      return;
    }
    catch (SecurityException localSecurityException2)
    {
      this.zzaTV.zzAo().zzCE().zzj("Measurement Service called with invalid calling package", paramString);
      throw localSecurityException2;
    }
  }
  
  private void zzfn(String paramString)
  {
    boolean bool1 = this.zzaYw;
    int i;
    if (bool1)
    {
      i = Process.myUid();
      localObject1 = this.zzaTV.getContext();
      boolean bool3 = zze.zzb((Context)localObject1, i, paramString);
      if (!bool3) {
        break label42;
      }
    }
    label42:
    boolean bool2;
    do
    {
      return;
      i = Binder.getCallingUid();
      break;
      localObject1 = this.zzaTV.getContext();
      bool2 = zze.zzf((Context)localObject1, i);
      if (!bool2) {
        break label76;
      }
      localObject2 = this.zzaTV;
      bool2 = ((zzw)localObject2).zzCZ();
    } while (!bool2);
    label76:
    Object localObject2 = new java/lang/SecurityException;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    Object localObject1 = String.format("Unknown calling package name '%s'.", arrayOfObject);
    ((SecurityException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  /* Error */
  public java.util.List zza(AppMetadata paramAppMetadata, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 18	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: getfield 107	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   9: astore_3
    //   10: aload_0
    //   11: aload_3
    //   12: invokespecial 110	com/google/android/gms/measurement/internal/zzx:zzfm	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 20	com/google/android/gms/measurement/internal/zzx:zzaTV	Lcom/google/android/gms/measurement/internal/zzw;
    //   19: invokevirtual 114	com/google/android/gms/measurement/internal/zzw:zzCn	()Lcom/google/android/gms/measurement/internal/zzv;
    //   22: astore_3
    //   23: new 116	com/google/android/gms/measurement/internal/zzx$6
    //   26: astore 4
    //   28: aload 4
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial 119	com/google/android/gms/measurement/internal/zzx$6:<init>	(Lcom/google/android/gms/measurement/internal/zzx;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   35: aload_3
    //   36: aload 4
    //   38: invokevirtual 125	com/google/android/gms/measurement/internal/zzv:zzd	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   41: astore_3
    //   42: aload_3
    //   43: invokeinterface 131 1 0
    //   48: astore_3
    //   49: aload_3
    //   50: checkcast 133	java/util/List
    //   53: astore_3
    //   54: new 135	java/util/ArrayList
    //   57: astore 4
    //   59: aload_3
    //   60: invokeinterface 138 1 0
    //   65: istore 5
    //   67: aload 4
    //   69: iload 5
    //   71: invokespecial 141	java/util/ArrayList:<init>	(I)V
    //   74: aload_3
    //   75: invokeinterface 145 1 0
    //   80: astore 6
    //   82: aload 6
    //   84: invokeinterface 150 1 0
    //   89: istore 7
    //   91: iload 7
    //   93: ifeq +94 -> 187
    //   96: aload 6
    //   98: invokeinterface 153 1 0
    //   103: astore_3
    //   104: aload_3
    //   105: checkcast 155	com/google/android/gms/measurement/internal/zzai
    //   108: astore_3
    //   109: iload_2
    //   110: ifne +21 -> 131
    //   113: aload_3
    //   114: getfield 158	com/google/android/gms/measurement/internal/zzai:mName	Ljava/lang/String;
    //   117: astore 8
    //   119: aload 8
    //   121: invokestatic 164	com/google/android/gms/measurement/internal/zzaj:zzfv	(Ljava/lang/String;)Z
    //   124: istore 9
    //   126: iload 9
    //   128: ifne -46 -> 82
    //   131: new 166	com/google/android/gms/measurement/internal/UserAttributeParcel
    //   134: astore 8
    //   136: aload 8
    //   138: aload_3
    //   139: invokespecial 169	com/google/android/gms/measurement/internal/UserAttributeParcel:<init>	(Lcom/google/android/gms/measurement/internal/zzai;)V
    //   142: aload 4
    //   144: aload 8
    //   146: invokeinterface 173 2 0
    //   151: pop
    //   152: goto -70 -> 82
    //   155: astore_3
    //   156: aload_0
    //   157: getfield 20	com/google/android/gms/measurement/internal/zzx:zzaTV	Lcom/google/android/gms/measurement/internal/zzw;
    //   160: invokevirtual 34	com/google/android/gms/measurement/internal/zzw:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   163: invokevirtual 40	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   166: astore 4
    //   168: ldc -81
    //   170: astore 6
    //   172: aload 4
    //   174: aload 6
    //   176: aload_3
    //   177: invokevirtual 61	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   180: iconst_0
    //   181: istore 7
    //   183: aconst_null
    //   184: astore_3
    //   185: aload_3
    //   186: areturn
    //   187: aload 4
    //   189: astore_3
    //   190: goto -5 -> 185
    //   193: astore_3
    //   194: goto -38 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	zzx
    //   0	197	1	paramAppMetadata	AppMetadata
    //   0	197	2	paramBoolean	boolean
    //   9	130	3	localObject1	Object
    //   155	22	3	localInterruptedException	InterruptedException
    //   184	6	3	localObject2	Object
    //   193	1	3	localExecutionException	java.util.concurrent.ExecutionException
    //   26	162	4	localObject3	Object
    //   65	5	5	i	int
    //   80	95	6	localObject4	Object
    //   89	93	7	bool1	boolean
    //   117	28	8	localObject5	Object
    //   124	3	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   42	48	155	java/lang/InterruptedException
    //   49	53	155	java/lang/InterruptedException
    //   54	57	155	java/lang/InterruptedException
    //   59	65	155	java/lang/InterruptedException
    //   69	74	155	java/lang/InterruptedException
    //   74	80	155	java/lang/InterruptedException
    //   82	89	155	java/lang/InterruptedException
    //   96	103	155	java/lang/InterruptedException
    //   104	108	155	java/lang/InterruptedException
    //   113	117	155	java/lang/InterruptedException
    //   119	124	155	java/lang/InterruptedException
    //   131	134	155	java/lang/InterruptedException
    //   138	142	155	java/lang/InterruptedException
    //   144	152	155	java/lang/InterruptedException
    //   42	48	193	java/util/concurrent/ExecutionException
    //   49	53	193	java/util/concurrent/ExecutionException
    //   54	57	193	java/util/concurrent/ExecutionException
    //   59	65	193	java/util/concurrent/ExecutionException
    //   69	74	193	java/util/concurrent/ExecutionException
    //   74	80	193	java/util/concurrent/ExecutionException
    //   82	89	193	java/util/concurrent/ExecutionException
    //   96	103	193	java/util/concurrent/ExecutionException
    //   104	108	193	java/util/concurrent/ExecutionException
    //   113	117	193	java/util/concurrent/ExecutionException
    //   119	124	193	java/util/concurrent/ExecutionException
    //   131	134	193	java/util/concurrent/ExecutionException
    //   138	142	193	java/util/concurrent/ExecutionException
    //   144	152	193	java/util/concurrent/ExecutionException
  }
  
  public void zza(AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    Object localObject = paramAppMetadata.packageName;
    zzfm((String)localObject);
    localObject = this.zzaTV.zzCn();
    zzx.7 local7 = new com/google/android/gms/measurement/internal/zzx$7;
    local7.<init>(this, paramAppMetadata);
    ((zzv)localObject).zzg(local7);
  }
  
  public void zza(EventParcel paramEventParcel, AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    Object localObject = paramAppMetadata.packageName;
    zzfm((String)localObject);
    localObject = this.zzaTV.zzCn();
    zzx.2 local2 = new com/google/android/gms/measurement/internal/zzx$2;
    local2.<init>(this, paramAppMetadata, paramEventParcel);
    ((zzv)localObject).zzg(local2);
  }
  
  public void zza(EventParcel paramEventParcel, String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    com.google.android.gms.common.internal.zzx.zzcM(paramString1);
    zzfm(paramString1);
    zzv localzzv = this.zzaTV.zzCn();
    zzx.3 local3 = new com/google/android/gms/measurement/internal/zzx$3;
    local3.<init>(this, paramString2, paramEventParcel, paramString1);
    localzzv.zzg(local3);
  }
  
  public void zza(UserAttributeParcel paramUserAttributeParcel, AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramUserAttributeParcel);
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    Object localObject1 = paramAppMetadata.packageName;
    zzfm((String)localObject1);
    localObject1 = paramUserAttributeParcel.getValue();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.zzaTV.zzCn();
      localObject2 = new com/google/android/gms/measurement/internal/zzx$4;
      ((zzx.4)localObject2).<init>(this, paramAppMetadata, paramUserAttributeParcel);
      ((zzv)localObject1).zzg((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaTV.zzCn();
      localObject2 = new com/google/android/gms/measurement/internal/zzx$5;
      ((zzx.5)localObject2).<init>(this, paramAppMetadata, paramUserAttributeParcel);
      ((zzv)localObject1).zzg((Runnable)localObject2);
    }
  }
  
  public void zzb(AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    Object localObject = paramAppMetadata.packageName;
    zzfm((String)localObject);
    localObject = this.zzaTV.zzCn();
    zzx.1 local1 = new com/google/android/gms/measurement/internal/zzx$1;
    local1.<init>(this, paramAppMetadata);
    ((zzv)localObject).zzg(local1);
  }
  
  void zzfl(String paramString)
  {
    int i = 2;
    boolean bool1 = TextUtils.isEmpty(paramString);
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = paramString.split(":", i);
      int j = localObject1.length;
      if (j == i)
      {
        j = 0;
        localObject2 = null;
      }
    }
    try
    {
      localObject2 = localObject1[0];
      localObject2 = Long.valueOf((String)localObject2);
      l1 = ((Long)localObject2).longValue();
      long l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        localObject2 = this.zzaTV.zzCo().zzaXi;
        int k = 1;
        localObject1 = localObject1[k];
        ((zzt.zzc)localObject2).zzf((String)localObject1, l1);
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        long l1;
        Object localObject3 = this.zzaTV.zzAo().zzCF();
        Object localObject4 = "Combining sample with a non-number weight";
        localObject1 = localObject1[0];
        ((zzp.zza)localObject3).zzj((String)localObject4, localObject1);
        continue;
        localObject1 = this.zzaTV.zzAo().zzCF();
        localObject3 = "Combining sample with a non-positive weight";
        localObject4 = Long.valueOf(l1);
        ((zzp.zza)localObject1).zzj((String)localObject3, localObject4);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */