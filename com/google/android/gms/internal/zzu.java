package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu
{
  protected static final Comparator zzaw;
  private List zzas;
  private List zzat;
  private int zzau;
  private final int zzav;
  
  static
  {
    zzu.1 local1 = new com/google/android/gms/internal/zzu$1;
    local1.<init>();
    zzaw = local1;
  }
  
  public zzu(int paramInt)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzas = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(64);
    this.zzat = ((List)localObject);
    this.zzau = 0;
    this.zzav = paramInt;
  }
  
  private void zzy()
  {
    try
    {
      for (;;)
      {
        int i = this.zzau;
        int j = this.zzav;
        if (i <= j) {
          break;
        }
        Object localObject1 = this.zzas;
        j = 0;
        List localList = null;
        localObject1 = ((List)localObject1).remove(0);
        localObject1 = (byte[])localObject1;
        localList = this.zzat;
        localList.remove(localObject1);
        j = this.zzau;
        i = localObject1.length;
        i = j - i;
        this.zzau = i;
      }
    }
    finally {}
  }
  
  /* Error */
  public void zza(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +16 -> 19
    //   6: aload_1
    //   7: arraylength
    //   8: istore_2
    //   9: aload_0
    //   10: getfield 38	com/google/android/gms/internal/zzu:zzav	I
    //   13: istore_3
    //   14: iload_2
    //   15: iload_3
    //   16: if_icmple +6 -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 26	com/google/android/gms/internal/zzu:zzas	Ljava/util/List;
    //   26: astore 4
    //   28: aload 4
    //   30: aload_1
    //   31: invokeinterface 52 2 0
    //   36: pop
    //   37: aload_0
    //   38: getfield 34	com/google/android/gms/internal/zzu:zzat	Ljava/util/List;
    //   41: astore 4
    //   43: getstatic 20	com/google/android/gms/internal/zzu:zzaw	Ljava/util/Comparator;
    //   46: astore 5
    //   48: aload 4
    //   50: aload_1
    //   51: aload 5
    //   53: invokestatic 58	java/util/Collections:binarySearch	(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I
    //   56: istore_2
    //   57: iload_2
    //   58: ifge +8 -> 66
    //   61: iload_2
    //   62: ineg
    //   63: iconst_m1
    //   64: iadd
    //   65: istore_2
    //   66: aload_0
    //   67: getfield 34	com/google/android/gms/internal/zzu:zzat	Ljava/util/List;
    //   70: astore 5
    //   72: aload 5
    //   74: iload_2
    //   75: aload_1
    //   76: invokeinterface 61 3 0
    //   81: aload_0
    //   82: getfield 36	com/google/android/gms/internal/zzu:zzau	I
    //   85: istore_2
    //   86: aload_1
    //   87: arraylength
    //   88: istore_3
    //   89: iload_2
    //   90: iload_3
    //   91: iadd
    //   92: istore_2
    //   93: aload_0
    //   94: iload_2
    //   95: putfield 36	com/google/android/gms/internal/zzu:zzau	I
    //   98: aload_0
    //   99: invokespecial 64	com/google/android/gms/internal/zzu:zzy	()V
    //   102: goto -83 -> 19
    //   105: astore 4
    //   107: aload_0
    //   108: monitorexit
    //   109: aload 4
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	zzu
    //   0	112	1	paramArrayOfByte	byte[]
    //   8	87	2	i	int
    //   13	79	3	j	int
    //   26	23	4	localList	List
    //   105	5	4	localObject1	Object
    //   46	27	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	8	105	finally
    //   9	13	105	finally
    //   22	26	105	finally
    //   30	37	105	finally
    //   37	41	105	finally
    //   43	46	105	finally
    //   51	56	105	finally
    //   66	70	105	finally
    //   75	81	105	finally
    //   81	85	105	finally
    //   86	88	105	finally
    //   94	98	105	finally
    //   98	102	105	finally
  }
  
  /* Error */
  public byte[] zzb(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: aload_0
    //   13: getfield 34	com/google/android/gms/internal/zzu:zzat	Ljava/util/List;
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface 68 1 0
    //   23: istore_2
    //   24: iload 4
    //   26: iload_2
    //   27: if_icmpge +101 -> 128
    //   30: aload_0
    //   31: getfield 34	com/google/android/gms/internal/zzu:zzat	Ljava/util/List;
    //   34: astore_3
    //   35: aload_3
    //   36: iload 4
    //   38: invokeinterface 71 2 0
    //   43: astore_3
    //   44: aload_3
    //   45: checkcast 46	[B
    //   48: astore_3
    //   49: aload_3
    //   50: arraylength
    //   51: istore 6
    //   53: iload 6
    //   55: iload_1
    //   56: if_icmplt +61 -> 117
    //   59: aload_0
    //   60: getfield 36	com/google/android/gms/internal/zzu:zzau	I
    //   63: istore 6
    //   65: aload_3
    //   66: arraylength
    //   67: istore 7
    //   69: iload 6
    //   71: iload 7
    //   73: isub
    //   74: istore 6
    //   76: aload_0
    //   77: iload 6
    //   79: putfield 36	com/google/android/gms/internal/zzu:zzau	I
    //   82: aload_0
    //   83: getfield 34	com/google/android/gms/internal/zzu:zzat	Ljava/util/List;
    //   86: astore 8
    //   88: aload 8
    //   90: iload 4
    //   92: invokeinterface 44 2 0
    //   97: pop
    //   98: aload_0
    //   99: getfield 26	com/google/android/gms/internal/zzu:zzas	Ljava/util/List;
    //   102: astore 5
    //   104: aload 5
    //   106: aload_3
    //   107: invokeinterface 49 2 0
    //   112: pop
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_3
    //   116: areturn
    //   117: iload 4
    //   119: iconst_1
    //   120: iadd
    //   121: istore_2
    //   122: iload_2
    //   123: istore 4
    //   125: goto -113 -> 12
    //   128: iload_1
    //   129: newarray <illegal type>
    //   131: astore_3
    //   132: goto -19 -> 113
    //   135: astore_3
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_3
    //   139: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	zzu
    //   0	140	1	paramInt	int
    //   3	120	2	i	int
    //   5	127	3	localObject1	Object
    //   135	4	3	localObject2	Object
    //   7	117	4	j	int
    //   10	95	5	localList1	List
    //   51	27	6	k	int
    //   67	7	7	m	int
    //   86	3	8	localList2	List
    // Exception table:
    //   from	to	target	type
    //   12	16	135	finally
    //   17	23	135	finally
    //   30	34	135	finally
    //   36	43	135	finally
    //   44	48	135	finally
    //   49	51	135	finally
    //   59	63	135	finally
    //   65	67	135	finally
    //   77	82	135	finally
    //   82	86	135	finally
    //   90	98	135	finally
    //   98	102	135	finally
    //   106	113	135	finally
    //   128	131	135	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */