package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.fitness.result.DataReadResult;

class zzpc$zza
  extends zzoh.zza
{
  private int zzaAc = 0;
  private DataReadResult zzaAd = null;
  private final zza.zzb zzamC;
  
  private zzpc$zza(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  /* Error */
  public void zza(DataReadResult paramDataReadResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 25
    //   4: astore_2
    //   5: iconst_2
    //   6: istore_3
    //   7: aload_2
    //   8: iload_3
    //   9: invokestatic 32	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   12: istore 4
    //   14: iload 4
    //   16: ifeq +58 -> 74
    //   19: ldc 25
    //   21: astore_2
    //   22: new 34	java/lang/StringBuilder
    //   25: astore 5
    //   27: aload 5
    //   29: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   32: ldc 37
    //   34: astore 6
    //   36: aload 5
    //   38: aload 6
    //   40: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: astore 5
    //   45: aload_0
    //   46: getfield 16	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   49: istore 7
    //   51: aload 5
    //   53: iload 7
    //   55: invokevirtual 44	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   58: astore 5
    //   60: aload 5
    //   62: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: astore 5
    //   67: aload_2
    //   68: aload 5
    //   70: invokestatic 52	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: aload_0
    //   75: getfield 18	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnonnull +68 -> 148
    //   83: aload_0
    //   84: aload_1
    //   85: putfield 18	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   88: aload_0
    //   89: getfield 16	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   92: iconst_1
    //   93: iadd
    //   94: istore 4
    //   96: aload_0
    //   97: iload 4
    //   99: putfield 16	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   102: aload_0
    //   103: getfield 16	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   106: istore 4
    //   108: aload_0
    //   109: getfield 18	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   112: astore 5
    //   114: aload 5
    //   116: invokevirtual 58	com/google/android/gms/fitness/result/DataReadResult:zzvj	()I
    //   119: istore_3
    //   120: iload 4
    //   122: iload_3
    //   123: if_icmpne +22 -> 145
    //   126: aload_0
    //   127: getfield 20	com/google/android/gms/internal/zzpc$zza:zzamC	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   130: astore_2
    //   131: aload_0
    //   132: getfield 18	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   135: astore 5
    //   137: aload_2
    //   138: aload 5
    //   140: invokeinterface 64 2 0
    //   145: aload_0
    //   146: monitorexit
    //   147: return
    //   148: aload_0
    //   149: getfield 18	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   152: astore_2
    //   153: aload_2
    //   154: aload_1
    //   155: invokevirtual 68	com/google/android/gms/fitness/result/DataReadResult:zzb	(Lcom/google/android/gms/fitness/result/DataReadResult;)V
    //   158: goto -70 -> 88
    //   161: astore_2
    //   162: aload_0
    //   163: monitorexit
    //   164: aload_2
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	zza
    //   0	166	1	paramDataReadResult	DataReadResult
    //   4	150	2	localObject1	Object
    //   161	4	2	localObject2	Object
    //   6	118	3	i	int
    //   12	3	4	bool	boolean
    //   94	30	4	j	int
    //   25	114	5	localObject3	Object
    //   34	5	6	str	String
    //   49	5	7	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	161	finally
    //   22	25	161	finally
    //   27	32	161	finally
    //   38	43	161	finally
    //   45	49	161	finally
    //   53	58	161	finally
    //   60	65	161	finally
    //   68	74	161	finally
    //   74	78	161	finally
    //   84	88	161	finally
    //   88	92	161	finally
    //   97	102	161	finally
    //   102	106	161	finally
    //   108	112	161	finally
    //   114	119	161	finally
    //   126	130	161	finally
    //   131	135	161	finally
    //   138	145	161	finally
    //   145	147	161	finally
    //   148	152	161	finally
    //   154	158	161	finally
    //   162	164	161	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */