package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.h.m;
import android.util.Log;

public class zze
{
  private final long zzanN;
  private final int zzanO;
  private final m zzanP;
  
  public zze()
  {
    this.zzanN = 60000L;
    this.zzanO = i;
    m localm = new android/support/v4/h/m;
    localm.<init>(i);
    this.zzanP = localm;
  }
  
  public zze(int paramInt, long paramLong)
  {
    this.zzanN = paramLong;
    this.zzanO = paramInt;
    m localm = new android/support/v4/h/m;
    localm.<init>();
    this.zzanP = localm;
  }
  
  private void zzb(long paramLong1, long paramLong2)
  {
    Object localObject = this.zzanP;
    int i = ((m)localObject).size() + -1;
    int j;
    for (int k = i; k >= 0; k = j)
    {
      localObject = (Long)this.zzanP.valueAt(k);
      long l = ((Long)localObject).longValue();
      l = paramLong2 - l;
      boolean bool = l < paramLong1;
      if (bool)
      {
        localObject = this.zzanP;
        ((m)localObject).removeAt(k);
      }
      j = k + -1;
    }
  }
  
  public Long zzcS(String paramString)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.zzanN;
    try
    {
      for (;;)
      {
        Object localObject1 = this.zzanP;
        int i = ((m)localObject1).size();
        int j = this.zzanO;
        if (i < j) {
          break;
        }
        zzb(l2, l1);
        long l3 = 2;
        l2 /= l3;
        localObject1 = "ConnectionTracker";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "The max capacity ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        int k = this.zzanO;
        localObject2 = ((StringBuilder)localObject2).append(k);
        str = " is not enough. Current durationThreshold is: ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).append(l2);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.w((String)localObject1, (String)localObject2);
      }
      localObject4 = this.zzanP;
    }
    finally {}
    Long localLong = Long.valueOf(l1);
    Object localObject4 = ((m)localObject4).put(paramString, localLong);
    localObject4 = (Long)localObject4;
    return (Long)localObject4;
  }
  
  /* Error */
  public boolean zzcT(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	com/google/android/gms/common/stats/zze:zzanP	Landroid/support/v4/h/m;
    //   6: astore_2
    //   7: aload_2
    //   8: aload_1
    //   9: invokevirtual 100	android/support/v4/h/m:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnull +9 -> 23
    //   17: iconst_1
    //   18: istore_3
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_3
    //   22: ireturn
    //   23: iconst_0
    //   24: istore_3
    //   25: aconst_null
    //   26: astore_2
    //   27: goto -8 -> 19
    //   30: astore_2
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_2
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	zze
    //   0	35	1	paramString	String
    //   6	21	2	localObject1	Object
    //   30	4	2	localObject2	Object
    //   18	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	30	finally
    //   8	12	30	finally
    //   19	21	30	finally
    //   31	33	30	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */