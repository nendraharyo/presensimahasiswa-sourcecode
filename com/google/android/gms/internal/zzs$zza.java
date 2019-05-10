package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

class zzs$zza
{
  public static final boolean zzak = zzs.DEBUG;
  private final List zzal;
  private boolean zzam;
  
  zzs$zza()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzal = localArrayList;
    this.zzam = false;
  }
  
  private long zzx()
  {
    Object localObject = this.zzal;
    int i = ((List)localObject).size();
    if (i == 0) {}
    long l2;
    for (long l1 = 0L;; l1 = ((zzs.zza.zza)localObject).time - l2)
    {
      return l1;
      l2 = ((zzs.zza.zza)this.zzal.get(0)).time;
      localObject = this.zzal;
      List localList = this.zzal;
      int j = localList.size() + -1;
      localObject = (zzs.zza.zza)((List)localObject).get(j);
    }
  }
  
  protected void finalize()
  {
    boolean bool = this.zzam;
    if (!bool)
    {
      zzd("Request on the loose");
      String str = "Marker log finalized without finish() - uncaught exit point for request";
      Object[] arrayOfObject = new Object[0];
      zzs.zzc(str, arrayOfObject);
    }
  }
  
  public void zza(String paramString, long paramLong)
  {
    try
    {
      boolean bool = this.zzam;
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        str = "Marker added to finished log";
        localIllegalStateException.<init>(str);
        throw localIllegalStateException;
      }
    }
    finally {}
    List localList = this.zzal;
    zzs.zza.zza localzza = new com/google/android/gms/internal/zzs$zza$zza;
    long l = SystemClock.elapsedRealtime();
    String str = paramString;
    localzza.<init>(paramString, paramLong, l);
    localList.add(localzza);
  }
  
  /* Error */
  public void zzd(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_1
    //   3: istore_2
    //   4: aload_0
    //   5: iload_2
    //   6: putfield 27	com/google/android/gms/internal/zzs$zza:zzam	Z
    //   9: aload_0
    //   10: invokespecial 78	com/google/android/gms/internal/zzs$zza:zzx	()J
    //   13: lstore_3
    //   14: lconst_0
    //   15: lstore 5
    //   17: lload_3
    //   18: lload 5
    //   20: lcmp
    //   21: istore_2
    //   22: iload_2
    //   23: ifgt +6 -> 29
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 25	com/google/android/gms/internal/zzs$zza:zzal	Ljava/util/List;
    //   33: astore 7
    //   35: aconst_null
    //   36: astore 8
    //   38: aload 7
    //   40: iconst_0
    //   41: invokeinterface 37 2 0
    //   46: astore 7
    //   48: aload 7
    //   50: checkcast 39	com/google/android/gms/internal/zzs$zza$zza
    //   53: astore 7
    //   55: aload 7
    //   57: getfield 43	com/google/android/gms/internal/zzs$zza$zza:time	J
    //   60: lstore 5
    //   62: ldc 80
    //   64: astore 9
    //   66: iconst_2
    //   67: istore 10
    //   69: iload 10
    //   71: anewarray 4	java/lang/Object
    //   74: astore 11
    //   76: aconst_null
    //   77: astore 12
    //   79: lload_3
    //   80: invokestatic 87	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   83: astore 13
    //   85: aload 11
    //   87: iconst_0
    //   88: aload 13
    //   90: aastore
    //   91: iconst_1
    //   92: istore 14
    //   94: aload 11
    //   96: iload 14
    //   98: aload_1
    //   99: aastore
    //   100: aload 9
    //   102: aload 11
    //   104: invokestatic 90	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: aload_0
    //   108: getfield 25	com/google/android/gms/internal/zzs$zza:zzal	Ljava/util/List;
    //   111: astore 13
    //   113: aload 13
    //   115: invokeinterface 94 1 0
    //   120: astore 12
    //   122: lload 5
    //   124: lstore_3
    //   125: aload 12
    //   127: invokeinterface 100 1 0
    //   132: istore_2
    //   133: iload_2
    //   134: ifeq -108 -> 26
    //   137: aload 12
    //   139: invokeinterface 104 1 0
    //   144: astore 7
    //   146: aload 7
    //   148: checkcast 39	com/google/android/gms/internal/zzs$zza$zza
    //   151: astore 7
    //   153: aload 7
    //   155: getfield 43	com/google/android/gms/internal/zzs$zza$zza:time	J
    //   158: lstore 15
    //   160: ldc 106
    //   162: astore 8
    //   164: iconst_3
    //   165: istore 17
    //   167: iload 17
    //   169: anewarray 4	java/lang/Object
    //   172: astore 18
    //   174: lload 15
    //   176: lload_3
    //   177: lsub
    //   178: lstore_3
    //   179: lload_3
    //   180: invokestatic 87	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   183: astore 13
    //   185: aload 18
    //   187: iconst_0
    //   188: aload 13
    //   190: aastore
    //   191: iconst_1
    //   192: istore 14
    //   194: aload 7
    //   196: getfield 110	com/google/android/gms/internal/zzs$zza$zza:zzan	J
    //   199: lstore 19
    //   201: lload 19
    //   203: invokestatic 87	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   206: astore 21
    //   208: aload 18
    //   210: iload 14
    //   212: aload 21
    //   214: aastore
    //   215: iconst_2
    //   216: istore 14
    //   218: aload 7
    //   220: getfield 114	com/google/android/gms/internal/zzs$zza$zza:name	Ljava/lang/String;
    //   223: astore 7
    //   225: aload 18
    //   227: iload 14
    //   229: aload 7
    //   231: aastore
    //   232: aload 8
    //   234: aload 18
    //   236: invokestatic 90	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: lload 15
    //   241: lstore_3
    //   242: goto -117 -> 125
    //   245: astore 7
    //   247: aload_0
    //   248: monitorexit
    //   249: aload 7
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	zza
    //   0	252	1	paramString	String
    //   3	131	2	bool	boolean
    //   13	229	3	l1	long
    //   15	108	5	l2	long
    //   33	197	7	localObject1	Object
    //   245	5	7	localObject2	Object
    //   36	197	8	str1	String
    //   64	37	9	str2	String
    //   67	3	10	i	int
    //   74	29	11	arrayOfObject1	Object[]
    //   77	61	12	localIterator	java.util.Iterator
    //   83	106	13	localObject3	Object
    //   92	136	14	j	int
    //   158	82	15	l3	long
    //   165	3	17	k	int
    //   172	63	18	arrayOfObject2	Object[]
    //   199	3	19	l4	long
    //   206	7	21	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   5	9	245	finally
    //   9	13	245	finally
    //   29	33	245	finally
    //   40	46	245	finally
    //   48	53	245	finally
    //   55	60	245	finally
    //   69	74	245	finally
    //   79	83	245	finally
    //   88	91	245	finally
    //   98	100	245	finally
    //   102	107	245	finally
    //   107	111	245	finally
    //   113	120	245	finally
    //   125	132	245	finally
    //   137	144	245	finally
    //   146	151	245	finally
    //   153	158	245	finally
    //   167	172	245	finally
    //   179	183	245	finally
    //   188	191	245	finally
    //   194	199	245	finally
    //   201	206	245	finally
    //   212	215	245	finally
    //   218	223	245	finally
    //   229	232	245	finally
    //   234	239	245	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */