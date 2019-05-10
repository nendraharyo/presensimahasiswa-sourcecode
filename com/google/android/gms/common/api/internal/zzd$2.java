package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

class zzd$2
  implements zzp.zza
{
  zzd$2(zzd paramzzd) {}
  
  /* Error */
  public void zzc(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   4: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   7: astore_3
    //   8: aload_3
    //   9: invokeinterface 25 1 0
    //   14: aload_0
    //   15: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   18: astore_3
    //   19: aload_3
    //   20: invokestatic 29	com/google/android/gms/common/api/internal/zzd:zzc	(Lcom/google/android/gms/common/api/internal/zzd;)Z
    //   23: istore 4
    //   25: iload 4
    //   27: ifeq +43 -> 70
    //   30: aload_0
    //   31: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   34: astore_3
    //   35: iconst_0
    //   36: istore 5
    //   38: aload_3
    //   39: iconst_0
    //   40: invokestatic 32	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;Z)Z
    //   43: pop
    //   44: aload_0
    //   45: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   48: astore_3
    //   49: aload_3
    //   50: iload_1
    //   51: iload_2
    //   52: invokestatic 35	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;IZ)V
    //   55: aload_0
    //   56: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   59: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   62: astore_3
    //   63: aload_3
    //   64: invokeinterface 38 1 0
    //   69: return
    //   70: aload_0
    //   71: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   74: astore_3
    //   75: iconst_1
    //   76: istore 5
    //   78: aload_3
    //   79: iload 5
    //   81: invokestatic 32	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;Z)Z
    //   84: pop
    //   85: aload_0
    //   86: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   89: astore_3
    //   90: aload_3
    //   91: invokestatic 43	com/google/android/gms/common/api/internal/zzd:zzf	(Lcom/google/android/gms/common/api/internal/zzd;)Lcom/google/android/gms/common/api/internal/zzl;
    //   94: astore_3
    //   95: aload_3
    //   96: iload_1
    //   97: invokevirtual 49	com/google/android/gms/common/api/internal/zzl:onConnectionSuspended	(I)V
    //   100: aload_0
    //   101: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   104: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   107: astore_3
    //   108: aload_3
    //   109: invokeinterface 38 1 0
    //   114: goto -45 -> 69
    //   117: astore_3
    //   118: aload_0
    //   119: getfield 10	com/google/android/gms/common/api/internal/zzd$2:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   122: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   125: invokeinterface 38 1 0
    //   130: aload_3
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	2
    //   0	132	1	paramInt	int
    //   0	132	2	paramBoolean	boolean
    //   7	102	3	localObject1	Object
    //   117	14	3	localObject2	Object
    //   23	3	4	bool1	boolean
    //   36	44	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	117	finally
    //   19	23	117	finally
    //   30	34	117	finally
    //   39	44	117	finally
    //   44	48	117	finally
    //   51	55	117	finally
    //   70	74	117	finally
    //   79	85	117	finally
    //   85	89	117	finally
    //   90	94	117	finally
    //   96	100	117	finally
  }
  
  public void zzd(ConnectionResult paramConnectionResult)
  {
    Object localObject1 = zzd.zza(this.zzahh);
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzahh;
      zzd.zzb((zzd)localObject1, paramConnectionResult);
      localObject1 = this.zzahh;
      zzd.zzb((zzd)localObject1);
      return;
    }
    finally
    {
      zzd.zza(this.zzahh).unlock();
    }
  }
  
  public void zzi(Bundle paramBundle)
  {
    Object localObject1 = zzd.zza(this.zzahh);
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzahh;
      ConnectionResult localConnectionResult = ConnectionResult.zzafB;
      zzd.zzb((zzd)localObject1, localConnectionResult);
      localObject1 = this.zzahh;
      zzd.zzb((zzd)localObject1);
      return;
    }
    finally
    {
      zzd.zza(this.zzahh).unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */