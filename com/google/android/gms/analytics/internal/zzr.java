package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Set;

public class zzr
{
  private final zzf zzOK;
  private Set zzRA;
  private volatile Boolean zzRy;
  private String zzRz;
  
  protected zzr(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    this.zzOK = paramzzf;
  }
  
  public long zzkA()
  {
    return ((Long)zzy.zzRV.get()).longValue();
  }
  
  public long zzkB()
  {
    return ((Long)zzy.zzRW.get()).longValue();
  }
  
  public int zzkC()
  {
    return ((Integer)zzy.zzRX.get()).intValue();
  }
  
  public int zzkD()
  {
    return ((Integer)zzy.zzRY.get()).intValue();
  }
  
  public long zzkE()
  {
    return ((Integer)zzy.zzSl.get()).intValue();
  }
  
  public String zzkF()
  {
    return (String)zzy.zzSa.get();
  }
  
  public String zzkG()
  {
    return (String)zzy.zzRZ.get();
  }
  
  public String zzkH()
  {
    return (String)zzy.zzSb.get();
  }
  
  public String zzkI()
  {
    return (String)zzy.zzSc.get();
  }
  
  public zzm zzkJ()
  {
    return zzm.zzbm((String)zzy.zzSe.get());
  }
  
  public zzo zzkK()
  {
    return zzo.zzbn((String)zzy.zzSf.get());
  }
  
  public Set zzkL()
  {
    String str = (String)zzy.zzSk.get();
    Object localObject1 = this.zzRA;
    if (localObject1 != null)
    {
      localObject1 = this.zzRz;
      if (localObject1 != null)
      {
        localObject1 = this.zzRz;
        i = ((String)localObject1).equals(str);
        if (i != 0) {
          break label124;
        }
      }
    }
    String[] arrayOfString = TextUtils.split(str, ",");
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int k = arrayOfString.length;
    int i = 0;
    localObject1 = null;
    while (i < k)
    {
      Object localObject2 = arrayOfString[i];
      try
      {
        int m = Integer.parseInt((String)localObject2);
        localObject2 = Integer.valueOf(m);
        localHashSet.add(localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int j;
        for (;;) {}
      }
      i += 1;
    }
    this.zzRz = str;
    this.zzRA = localHashSet;
    label124:
    return this.zzRA;
  }
  
  public long zzkM()
  {
    return ((Long)zzy.zzSt.get()).longValue();
  }
  
  public long zzkN()
  {
    return ((Long)zzy.zzSu.get()).longValue();
  }
  
  public long zzkO()
  {
    return ((Long)zzy.zzSx.get()).longValue();
  }
  
  public int zzkP()
  {
    return ((Integer)zzy.zzRO.get()).intValue();
  }
  
  public int zzkQ()
  {
    return ((Integer)zzy.zzRQ.get()).intValue();
  }
  
  public String zzkR()
  {
    return "google_analytics_v4.db";
  }
  
  public String zzkS()
  {
    return "google_analytics2_v4.db";
  }
  
  public long zzkT()
  {
    return 86400000L;
  }
  
  public int zzkU()
  {
    return ((Integer)zzy.zzSn.get()).intValue();
  }
  
  public int zzkV()
  {
    return ((Integer)zzy.zzSo.get()).intValue();
  }
  
  public long zzkW()
  {
    return ((Long)zzy.zzSp.get()).longValue();
  }
  
  public long zzkX()
  {
    return ((Long)zzy.zzSy.get()).longValue();
  }
  
  public boolean zzkr()
  {
    return zzd.zzakE;
  }
  
  /* Error */
  public boolean zzks()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +175 -> 181
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +162 -> 179
    //   20: aload_0
    //   21: getfield 24	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 178	com/google/android/gms/analytics/internal/zzf:getContext	()Landroid/content/Context;
    //   29: astore_1
    //   30: aload_1
    //   31: invokevirtual 184	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 24	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 178	com/google/android/gms/analytics/internal/zzf:getContext	()Landroid/content/Context;
    //   44: astore_2
    //   45: invokestatic 189	android/os/Process:myPid	()I
    //   48: istore_3
    //   49: aload_2
    //   50: iload_3
    //   51: invokestatic 195	com/google/android/gms/internal/zznf:zzi	(Landroid/content/Context;I)Ljava/lang/String;
    //   54: astore_2
    //   55: aload_1
    //   56: ifnull +38 -> 94
    //   59: aload_1
    //   60: getfield 200	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   63: astore_1
    //   64: aload_1
    //   65: ifnull +124 -> 189
    //   68: aload_1
    //   69: aload_2
    //   70: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   73: istore 4
    //   75: iload 4
    //   77: ifeq +112 -> 189
    //   80: iconst_1
    //   81: istore 4
    //   83: iload 4
    //   85: invokestatic 206	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   88: astore_1
    //   89: aload_0
    //   90: aload_1
    //   91: putfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   94: aload_0
    //   95: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   98: astore_1
    //   99: aload_1
    //   100: ifnull +19 -> 119
    //   103: aload_0
    //   104: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   107: astore_1
    //   108: aload_1
    //   109: invokevirtual 210	java/lang/Boolean:booleanValue	()Z
    //   112: istore 4
    //   114: iload 4
    //   116: ifne +27 -> 143
    //   119: ldc -44
    //   121: astore_1
    //   122: aload_1
    //   123: aload_2
    //   124: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   127: istore 4
    //   129: iload 4
    //   131: ifeq +12 -> 143
    //   134: getstatic 215	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   137: astore_1
    //   138: aload_0
    //   139: aload_1
    //   140: putfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   143: aload_0
    //   144: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   147: astore_1
    //   148: aload_1
    //   149: ifnonnull +30 -> 179
    //   152: getstatic 215	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   155: astore_1
    //   156: aload_0
    //   157: aload_1
    //   158: putfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   161: aload_0
    //   162: getfield 24	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   165: astore_1
    //   166: aload_1
    //   167: invokevirtual 219	com/google/android/gms/analytics/internal/zzf:zzjm	()Lcom/google/android/gms/analytics/internal/zzaf;
    //   170: astore_1
    //   171: ldc -35
    //   173: astore_2
    //   174: aload_1
    //   175: aload_2
    //   176: invokevirtual 227	com/google/android/gms/analytics/internal/zzaf:zzbh	(Ljava/lang/String;)V
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_0
    //   182: getfield 172	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   185: invokevirtual 210	java/lang/Boolean:booleanValue	()Z
    //   188: ireturn
    //   189: iconst_0
    //   190: istore 4
    //   192: aconst_null
    //   193: astore_1
    //   194: goto -111 -> 83
    //   197: astore_1
    //   198: aload_0
    //   199: monitorexit
    //   200: aload_1
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	zzr
    //   4	190	1	localObject1	Object
    //   197	4	1	localObject2	Object
    //   39	137	2	localObject3	Object
    //   48	3	3	i	int
    //   73	118	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	15	197	finally
    //   20	24	197	finally
    //   25	29	197	finally
    //   30	34	197	finally
    //   35	39	197	finally
    //   40	44	197	finally
    //   45	48	197	finally
    //   50	54	197	finally
    //   59	63	197	finally
    //   69	73	197	finally
    //   83	88	197	finally
    //   90	94	197	finally
    //   94	98	197	finally
    //   103	107	197	finally
    //   108	112	197	finally
    //   123	127	197	finally
    //   134	137	197	finally
    //   139	143	197	finally
    //   143	147	197	finally
    //   152	155	197	finally
    //   157	161	197	finally
    //   161	165	197	finally
    //   166	170	197	finally
    //   175	179	197	finally
    //   179	181	197	finally
    //   198	200	197	finally
  }
  
  public boolean zzkt()
  {
    return ((Boolean)zzy.zzRK.get()).booleanValue();
  }
  
  public int zzku()
  {
    return ((Integer)zzy.zzSd.get()).intValue();
  }
  
  public int zzkv()
  {
    return ((Integer)zzy.zzSh.get()).intValue();
  }
  
  public int zzkw()
  {
    return ((Integer)zzy.zzSi.get()).intValue();
  }
  
  public int zzkx()
  {
    return ((Integer)zzy.zzSj.get()).intValue();
  }
  
  public long zzky()
  {
    return ((Long)zzy.zzRS.get()).longValue();
  }
  
  public long zzkz()
  {
    return ((Long)zzy.zzRR.get()).longValue();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */