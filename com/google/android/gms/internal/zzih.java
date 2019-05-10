package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

public class zzih
  implements zzip.zzb
{
  private Context mContext;
  private boolean zzJA;
  private boolean zzJz;
  private final LinkedList zzLA;
  private Boolean zzLB;
  private boolean zzLC;
  private boolean zzLD;
  private final String zzLq;
  private final zzii zzLr;
  private BigInteger zzLs;
  private final HashSet zzLt;
  private final HashMap zzLu;
  private boolean zzLv;
  private int zzLw;
  private zzbv zzLx;
  private zzbf zzLy;
  private String zzLz;
  private VersionInfoParcel zzpT;
  private final Object zzpV;
  private zzax zzpl;
  private boolean zzqA;
  private zzbe zzsZ;
  private zzbd zzta;
  private final zzha zztb;
  private String zzzN;
  
  public zzih(zzir paramzzir)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = BigInteger.ONE;
    this.zzLs = ((BigInteger)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzLt = ((HashSet)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzLu = ((HashMap)localObject);
    this.zzLv = false;
    this.zzJz = bool;
    this.zzLw = 0;
    this.zzqA = false;
    this.zzLx = null;
    this.zzJA = bool;
    this.zzsZ = null;
    this.zzLy = null;
    this.zzta = null;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzLA = ((LinkedList)localObject);
    this.zztb = null;
    this.zzLB = null;
    this.zzLC = false;
    this.zzLD = false;
    localObject = paramzzir.zzhs();
    this.zzLq = ((String)localObject);
    localObject = new com/google/android/gms/internal/zzii;
    String str = this.zzLq;
    ((zzii)localObject).<init>(str);
    this.zzLr = ((zzii)localObject);
  }
  
  public String getSessionId()
  {
    return this.zzLq;
  }
  
  public void zzB(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      boolean bool1 = this.zzJA;
      if (bool1 != paramBoolean)
      {
        localObject2 = this.mContext;
        zzip.zzb((Context)localObject2, paramBoolean);
      }
      this.zzJA = paramBoolean;
      Object localObject2 = this.mContext;
      localObject2 = zzG((Context)localObject2);
      if (localObject2 != null)
      {
        boolean bool2 = ((zzbf)localObject2).isAlive();
        if (!bool2)
        {
          String str = "start fetching content...";
          zzin.zzaJ(str);
          ((zzbf)localObject2).zzcG();
        }
      }
      return;
    }
  }
  
  public void zzC(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzLC = paramBoolean;
      return;
    }
  }
  
  public zzbf zzG(Context paramContext)
  {
    zzbe localzzbe = null;
    Object localObject1 = (Boolean)zzbt.zzwj.get();
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      bool = zzne.zzsg();
      if (bool)
      {
        bool = zzgY();
        if (!bool) {
          break label51;
        }
      }
    }
    bool = false;
    localObject1 = null;
    for (;;)
    {
      return (zzbf)localObject1;
      label51:
      synchronized (this.zzpV)
      {
        localObject1 = this.zzsZ;
        if (localObject1 == null)
        {
          bool = paramContext instanceof Activity;
          if (!bool)
          {
            bool = false;
            localObject1 = null;
            continue;
          }
          localzzbe = new com/google/android/gms/internal/zzbe;
          localObject1 = ((Context)paramContext).getApplicationContext();
          localObject1 = (Application)localObject1;
          paramContext = (Activity)paramContext;
          localzzbe.<init>((Application)localObject1, paramContext);
          this.zzsZ = localzzbe;
        }
        localObject1 = this.zzta;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzbd;
          ((zzbd)localObject1).<init>();
          this.zzta = ((zzbd)localObject1);
        }
        localObject1 = this.zzLy;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzbf;
          localzzbe = this.zzsZ;
          zzbd localzzbd = this.zzta;
          zzha localzzha = new com/google/android/gms/internal/zzha;
          Context localContext = this.mContext;
          VersionInfoParcel localVersionInfoParcel = this.zzpT;
          localzzha.<init>(localContext, localVersionInfoParcel, null, null);
          ((zzbf)localObject1).<init>(localzzbe, localzzbd, localzzha);
          this.zzLy = ((zzbf)localObject1);
        }
        localObject1 = this.zzLy;
        ((zzbf)localObject1).zzcG();
        localObject1 = this.zzLy;
      }
    }
  }
  
  public Bundle zza(Context paramContext, zzij paramzzij, String paramString)
  {
    Bundle localBundle;
    boolean bool;
    synchronized (this.zzpV)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      Object localObject2 = "app";
      localObject5 = this.zzLr;
      localObject5 = ((zzii)localObject5).zzc(paramContext, paramString);
      localBundle.putBundle((String)localObject2, (Bundle)localObject5);
      localObject6 = new android/os/Bundle;
      ((Bundle)localObject6).<init>();
      localObject2 = this.zzLu;
      localObject2 = ((HashMap)localObject2).keySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (String)localObject2;
        localObject5 = this.zzLu;
        localObject5 = ((HashMap)localObject5).get(localObject2);
        localObject5 = (zzik)localObject5;
        localObject5 = ((zzik)localObject5).toBundle();
        ((Bundle)localObject6).putBundle((String)localObject2, (Bundle)localObject5);
      }
    }
    Object localObject4 = "slots";
    localBundle.putBundle((String)localObject4, (Bundle)localObject6);
    Object localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    localObject4 = this.zzLt;
    Object localObject6 = ((HashSet)localObject4).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject6).hasNext();
      if (!bool) {
        break;
      }
      localObject4 = ((Iterator)localObject6).next();
      localObject4 = (zzig)localObject4;
      localObject4 = ((zzig)localObject4).toBundle();
      ((ArrayList)localObject5).add(localObject4);
    }
    localObject4 = "ads";
    localBundle.putParcelableArrayList((String)localObject4, (ArrayList)localObject5);
    localObject4 = this.zzLt;
    paramzzij.zza((HashSet)localObject4);
    localObject4 = this.zzLt;
    ((HashSet)localObject4).clear();
    return localBundle;
  }
  
  public Future zza(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzJz;
      if (paramBoolean != bool)
      {
        this.zzJz = paramBoolean;
        localFuture = zzip.zza(paramContext, paramBoolean);
        return localFuture;
      }
      bool = false;
      Future localFuture = null;
    }
  }
  
  public void zza(zzig paramzzig)
  {
    synchronized (this.zzpV)
    {
      HashSet localHashSet = this.zzLt;
      localHashSet.add(paramzzig);
      return;
    }
  }
  
  public void zza(String paramString, zzik paramzzik)
  {
    synchronized (this.zzpV)
    {
      HashMap localHashMap = this.zzLu;
      localHashMap.put(paramString, paramzzik);
      return;
    }
  }
  
  public void zza(Thread paramThread)
  {
    Context localContext = this.mContext;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    zzha.zza(localContext, paramThread, localVersionInfoParcel);
  }
  
  /* Error */
  public Future zzaA(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/google/android/gms/internal/zzih:zzpV	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnull +40 -> 48
    //   11: aload_0
    //   12: getfield 282	com/google/android/gms/internal/zzih:zzLz	Ljava/lang/String;
    //   15: astore_3
    //   16: aload_1
    //   17: aload_3
    //   18: invokevirtual 285	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +23 -> 48
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 282	com/google/android/gms/internal/zzih:zzLz	Ljava/lang/String;
    //   33: aload_0
    //   34: getfield 121	com/google/android/gms/internal/zzih:mContext	Landroid/content/Context;
    //   37: astore_3
    //   38: aload_3
    //   39: aload_1
    //   40: invokestatic 289	com/google/android/gms/internal/zzip:zzd	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //   43: astore_3
    //   44: aload_2
    //   45: monitorexit
    //   46: aload_3
    //   47: areturn
    //   48: iconst_0
    //   49: istore 4
    //   51: aconst_null
    //   52: astore_3
    //   53: aload_2
    //   54: monitorexit
    //   55: goto -9 -> 46
    //   58: astore_3
    //   59: aload_2
    //   60: monitorexit
    //   61: aload_3
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	zzih
    //   0	63	1	paramString	String
    //   4	56	2	localObject1	Object
    //   15	38	3	localObject2	Object
    //   58	4	3	localObject3	Object
    //   21	29	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	15	58	finally
    //   17	21	58	finally
    //   29	33	58	finally
    //   33	37	58	finally
    //   39	43	58	finally
    //   44	46	58	finally
    //   53	55	58	finally
    //   59	61	58	finally
  }
  
  public void zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzqA;
      if (!bool)
      {
        Object localObject2 = paramContext.getApplicationContext();
        this.mContext = ((Context)localObject2);
        this.zzpT = paramVersionInfoParcel;
        zzip.zza(paramContext, this);
        zzip.zzb(paramContext, this);
        zzip.zzc(paramContext, this);
        zzip.zzd(paramContext, this);
        localObject2 = Thread.currentThread();
        zza((Thread)localObject2);
        localObject2 = zzr.zzbC();
        Object localObject4 = paramVersionInfoParcel.afmaVersion;
        localObject2 = ((zzir)localObject2).zze(paramContext, (String)localObject4);
        this.zzzN = ((String)localObject2);
        bool = zzne.zzsn();
        if (bool)
        {
          localObject2 = NetworkSecurityPolicy.getInstance();
          bool = ((NetworkSecurityPolicy)localObject2).isCleartextTrafficPermitted();
          if (!bool)
          {
            bool = true;
            this.zzLD = bool;
          }
        }
        localObject4 = new com/google/android/gms/internal/zzax;
        Context localContext1 = paramContext.getApplicationContext();
        VersionInfoParcel localVersionInfoParcel1 = this.zzpT;
        zzeg localzzeg = new com/google/android/gms/internal/zzeg;
        Context localContext2 = paramContext.getApplicationContext();
        VersionInfoParcel localVersionInfoParcel2 = this.zzpT;
        localObject2 = zzbt.zzvB;
        localObject2 = ((zzbp)localObject2).get();
        localObject2 = (String)localObject2;
        localzzeg.<init>(localContext2, localVersionInfoParcel2, (String)localObject2);
        ((zzax)localObject4).<init>(localContext1, localVersionInfoParcel1, localzzeg);
        this.zzpl = ((zzax)localObject4);
        zzhk();
        localObject2 = zzr.zzbM();
        localObject4 = this.mContext;
        ((zzi)localObject2).zzz((Context)localObject4);
        bool = true;
        this.zzqA = bool;
      }
      return;
    }
  }
  
  public void zzb(Boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzLB = paramBoolean;
      return;
    }
  }
  
  public void zzb(Throwable paramThrowable, boolean paramBoolean)
  {
    zzha localzzha = new com/google/android/gms/internal/zzha;
    Context localContext = this.mContext;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    localzzha.<init>(localContext, localVersionInfoParcel, null, null);
    localzzha.zza(paramThrowable, paramBoolean);
  }
  
  public void zzb(HashSet paramHashSet)
  {
    synchronized (this.zzpV)
    {
      HashSet localHashSet = this.zzLt;
      localHashSet.addAll(paramHashSet);
      return;
    }
  }
  
  public String zzd(int paramInt, String paramString)
  {
    Object localObject = this.zzpT;
    boolean bool = ((VersionInfoParcel)localObject).zzNb;
    if (bool)
    {
      localObject = this.mContext.getResources();
      if (localObject != null) {
        break label41;
      }
    }
    for (;;)
    {
      return paramString;
      localObject = zze.getRemoteResource(this.mContext);
      break;
      label41:
      paramString = ((Resources)localObject).getString(paramInt);
    }
  }
  
  /* Error */
  public void zze(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/google/android/gms/internal/zzih:zzpV	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: ldc_w 392
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 396	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifeq +120 -> 140
    //   23: ldc_w 392
    //   26: astore_3
    //   27: aload_1
    //   28: aload_3
    //   29: invokevirtual 399	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   32: istore 4
    //   34: aload_0
    //   35: iload 4
    //   37: putfield 77	com/google/android/gms/internal/zzih:zzJz	Z
    //   40: ldc_w 401
    //   43: astore_3
    //   44: aload_1
    //   45: aload_3
    //   46: invokevirtual 396	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   49: istore 4
    //   51: iload 4
    //   53: ifeq +96 -> 149
    //   56: ldc_w 401
    //   59: astore_3
    //   60: aload_1
    //   61: aload_3
    //   62: invokevirtual 405	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   65: istore 4
    //   67: aload_0
    //   68: iload 4
    //   70: putfield 79	com/google/android/gms/internal/zzih:zzLw	I
    //   73: ldc_w 407
    //   76: astore_3
    //   77: aload_1
    //   78: aload_3
    //   79: invokevirtual 396	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   82: istore 4
    //   84: iload 4
    //   86: ifeq +20 -> 106
    //   89: ldc_w 407
    //   92: astore_3
    //   93: aload_1
    //   94: aload_3
    //   95: invokevirtual 399	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   98: istore 4
    //   100: aload_0
    //   101: iload 4
    //   103: invokevirtual 411	com/google/android/gms/internal/zzih:zzB	(Z)V
    //   106: ldc_w 413
    //   109: astore_3
    //   110: aload_1
    //   111: aload_3
    //   112: invokevirtual 396	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   115: istore 4
    //   117: iload 4
    //   119: ifeq +18 -> 137
    //   122: ldc_w 413
    //   125: astore_3
    //   126: aload_1
    //   127: aload_3
    //   128: invokevirtual 416	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   131: astore_3
    //   132: aload_0
    //   133: aload_3
    //   134: putfield 282	com/google/android/gms/internal/zzih:zzLz	Ljava/lang/String;
    //   137: aload_2
    //   138: monitorexit
    //   139: return
    //   140: aload_0
    //   141: getfield 77	com/google/android/gms/internal/zzih:zzJz	Z
    //   144: istore 4
    //   146: goto -112 -> 34
    //   149: aload_0
    //   150: getfield 79	com/google/android/gms/internal/zzih:zzLw	I
    //   153: istore 4
    //   155: goto -88 -> 67
    //   158: astore_3
    //   159: aload_2
    //   160: monitorexit
    //   161: aload_3
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	zzih
    //   0	163	1	paramBundle	Bundle
    //   4	156	2	localObject1	Object
    //   10	124	3	str	String
    //   158	4	3	localObject2	Object
    //   16	36	4	bool1	boolean
    //   65	4	4	i	int
    //   82	63	4	bool2	boolean
    //   153	1	4	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	158	finally
    //   28	32	158	finally
    //   35	40	158	finally
    //   45	49	158	finally
    //   61	65	158	finally
    //   68	73	158	finally
    //   78	82	158	finally
    //   94	98	158	finally
    //   101	106	158	finally
    //   111	115	158	finally
    //   127	131	158	finally
    //   133	137	158	finally
    //   137	139	158	finally
    //   140	144	158	finally
    //   149	153	158	finally
    //   159	161	158	finally
  }
  
  public boolean zzgY()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzJA;
      return bool;
    }
  }
  
  public String zzgZ()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzLs;
      localObject2 = ((BigInteger)localObject2).toString();
      BigInteger localBigInteger1 = this.zzLs;
      BigInteger localBigInteger2 = BigInteger.ONE;
      localBigInteger1 = localBigInteger1.add(localBigInteger2);
      this.zzLs = localBigInteger1;
      return (String)localObject2;
    }
  }
  
  public zzii zzha()
  {
    synchronized (this.zzpV)
    {
      zzii localzzii = this.zzLr;
      return localzzii;
    }
  }
  
  public zzbv zzhb()
  {
    synchronized (this.zzpV)
    {
      zzbv localzzbv = this.zzLx;
      return localzzbv;
    }
  }
  
  public boolean zzhc()
  {
    synchronized (this.zzpV)
    {
      boolean bool1 = this.zzLv;
      boolean bool2 = true;
      this.zzLv = bool2;
      return bool1;
    }
  }
  
  public boolean zzhd()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzJz;
      if (!bool)
      {
        bool = this.zzLD;
        if (!bool) {}
      }
      else
      {
        bool = true;
        return bool;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public String zzhe()
  {
    synchronized (this.zzpV)
    {
      String str = this.zzzN;
      return str;
    }
  }
  
  public String zzhf()
  {
    synchronized (this.zzpV)
    {
      String str = this.zzLz;
      return str;
    }
  }
  
  public Boolean zzhg()
  {
    synchronized (this.zzpV)
    {
      Boolean localBoolean = this.zzLB;
      return localBoolean;
    }
  }
  
  public zzax zzhh()
  {
    return this.zzpl;
  }
  
  public boolean zzhi()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzLw;
      Object localObject2 = zzbt.zzwA;
      localObject2 = ((zzbp)localObject2).get();
      localObject2 = (Integer)localObject2;
      int j = ((Integer)localObject2).intValue();
      if (i < j)
      {
        localObject2 = zzbt.zzwA;
        localObject2 = ((zzbp)localObject2).get();
        localObject2 = (Integer)localObject2;
        j = ((Integer)localObject2).intValue();
        this.zzLw = j;
        localObject2 = this.mContext;
        i = this.zzLw;
        zzip.zza((Context)localObject2, i);
        j = 1;
        return j;
      }
      int k = 0;
      localObject2 = null;
    }
  }
  
  public boolean zzhj()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzLC;
      return bool;
    }
  }
  
  void zzhk()
  {
    Object localObject1 = new com/google/android/gms/internal/zzbu;
    Object localObject2 = this.mContext;
    String str = this.zzpT.afmaVersion;
    ((zzbu)localObject1).<init>((Context)localObject2, str);
    try
    {
      localObject2 = zzr.zzbH();
      localObject1 = ((zzbw)localObject2).zza((zzbu)localObject1);
      this.zzLx = ((zzbv)localObject1);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localObject2 = "Cannot initialize CSI reporter.";
        zzin.zzd((String)localObject2, localIllegalArgumentException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzih.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */