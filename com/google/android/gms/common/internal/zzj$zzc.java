package com.google.android.gms.common.internal;

import java.util.ArrayList;

public abstract class zzj$zzc
{
  private Object mListener;
  private boolean zzalM;
  
  public zzj$zzc(zzj paramzzj, Object paramObject)
  {
    this.mListener = paramObject;
    this.zzalM = false;
  }
  
  public void unregister()
  {
    zzqO();
    Object localObject1 = this.zzalL;
    synchronized (zzj.zzd((zzj)localObject1))
    {
      localObject1 = this.zzalL;
      localObject1 = zzj.zzd((zzj)localObject1);
      ((ArrayList)localObject1).remove(this);
      return;
    }
  }
  
  protected abstract void zzqM();
  
  /* Error */
  public void zzqN()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/google/android/gms/common/internal/zzj$zzc:mListener	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_0
    //   8: getfield 20	com/google/android/gms/common/internal/zzj$zzc:zzalM	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +64 -> 77
    //   16: ldc 37
    //   18: astore_3
    //   19: new 39	java/lang/StringBuilder
    //   22: astore 4
    //   24: aload 4
    //   26: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   29: ldc 42
    //   31: astore 5
    //   33: aload 4
    //   35: aload 5
    //   37: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: astore 4
    //   42: aload 4
    //   44: aload_0
    //   45: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   48: astore 4
    //   50: ldc 51
    //   52: astore 5
    //   54: aload 4
    //   56: aload 5
    //   58: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: astore 4
    //   63: aload 4
    //   65: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: astore 4
    //   70: aload_3
    //   71: aload 4
    //   73: invokestatic 61	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: ifnull +38 -> 118
    //   83: aload_0
    //   84: aload_1
    //   85: invokevirtual 65	com/google/android/gms/common/internal/zzj$zzc:zzw	(Ljava/lang/Object;)V
    //   88: aload_0
    //   89: monitorenter
    //   90: iconst_1
    //   91: istore 6
    //   93: aload_0
    //   94: iload 6
    //   96: putfield 20	com/google/android/gms/common/internal/zzj$zzc:zzalM	Z
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_0
    //   102: invokevirtual 69	com/google/android/gms/common/internal/zzj$zzc:unregister	()V
    //   105: return
    //   106: astore_1
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_1
    //   110: athrow
    //   111: astore_1
    //   112: aload_0
    //   113: invokevirtual 72	com/google/android/gms/common/internal/zzj$zzc:zzqM	()V
    //   116: aload_1
    //   117: athrow
    //   118: aload_0
    //   119: invokevirtual 72	com/google/android/gms/common/internal/zzj$zzc:zzqM	()V
    //   122: goto -34 -> 88
    //   125: astore_1
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	zzc
    //   6	79	1	localObject1	Object
    //   106	4	1	localObject2	Object
    //   111	6	1	localRuntimeException	RuntimeException
    //   125	4	1	localObject3	Object
    //   11	2	2	bool1	boolean
    //   18	53	3	str1	String
    //   22	50	4	localObject4	Object
    //   31	26	5	str2	String
    //   91	4	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	106	finally
    //   7	11	106	finally
    //   19	22	106	finally
    //   24	29	106	finally
    //   35	40	106	finally
    //   44	48	106	finally
    //   56	61	106	finally
    //   63	68	106	finally
    //   71	77	106	finally
    //   77	79	106	finally
    //   107	109	106	finally
    //   84	88	111	java/lang/RuntimeException
    //   94	99	125	finally
    //   99	101	125	finally
    //   126	128	125	finally
  }
  
  public void zzqO()
  {
    Object localObject1 = null;
    try
    {
      this.mListener = null;
      return;
    }
    finally {}
  }
  
  protected abstract void zzw(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */