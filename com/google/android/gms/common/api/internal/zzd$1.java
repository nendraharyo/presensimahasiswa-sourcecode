package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

class zzd$1
  implements zzp.zza
{
  zzd$1(zzd paramzzd) {}
  
  /* Error */
  public void zzc(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   4: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   7: astore_3
    //   8: aload_3
    //   9: invokeinterface 25 1 0
    //   14: aload_0
    //   15: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   18: astore_3
    //   19: aload_3
    //   20: invokestatic 29	com/google/android/gms/common/api/internal/zzd:zzc	(Lcom/google/android/gms/common/api/internal/zzd;)Z
    //   23: istore 4
    //   25: iload 4
    //   27: ifne +38 -> 65
    //   30: aload_0
    //   31: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   34: astore_3
    //   35: aload_3
    //   36: invokestatic 33	com/google/android/gms/common/api/internal/zzd:zzd	(Lcom/google/android/gms/common/api/internal/zzd;)Lcom/google/android/gms/common/ConnectionResult;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull +24 -> 65
    //   44: aload_0
    //   45: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   48: astore_3
    //   49: aload_3
    //   50: invokestatic 33	com/google/android/gms/common/api/internal/zzd:zzd	(Lcom/google/android/gms/common/api/internal/zzd;)Lcom/google/android/gms/common/ConnectionResult;
    //   53: astore_3
    //   54: aload_3
    //   55: invokevirtual 39	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   58: istore 4
    //   60: iload 4
    //   62: ifne +43 -> 105
    //   65: aload_0
    //   66: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   69: astore_3
    //   70: iconst_0
    //   71: istore 5
    //   73: aload_3
    //   74: iconst_0
    //   75: invokestatic 42	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;Z)Z
    //   78: pop
    //   79: aload_0
    //   80: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   83: astore_3
    //   84: aload_3
    //   85: iload_1
    //   86: iload_2
    //   87: invokestatic 45	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;IZ)V
    //   90: aload_0
    //   91: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   94: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   97: astore_3
    //   98: aload_3
    //   99: invokeinterface 48 1 0
    //   104: return
    //   105: aload_0
    //   106: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   109: astore_3
    //   110: iconst_1
    //   111: istore 5
    //   113: aload_3
    //   114: iload 5
    //   116: invokestatic 42	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;Z)Z
    //   119: pop
    //   120: aload_0
    //   121: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   124: astore_3
    //   125: aload_3
    //   126: invokestatic 53	com/google/android/gms/common/api/internal/zzd:zze	(Lcom/google/android/gms/common/api/internal/zzd;)Lcom/google/android/gms/common/api/internal/zzl;
    //   129: astore_3
    //   130: aload_3
    //   131: iload_1
    //   132: invokevirtual 59	com/google/android/gms/common/api/internal/zzl:onConnectionSuspended	(I)V
    //   135: aload_0
    //   136: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   139: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   142: astore_3
    //   143: aload_3
    //   144: invokeinterface 48 1 0
    //   149: goto -45 -> 104
    //   152: astore_3
    //   153: aload_0
    //   154: getfield 10	com/google/android/gms/common/api/internal/zzd$1:zzahh	Lcom/google/android/gms/common/api/internal/zzd;
    //   157: invokestatic 20	com/google/android/gms/common/api/internal/zzd:zza	(Lcom/google/android/gms/common/api/internal/zzd;)Ljava/util/concurrent/locks/Lock;
    //   160: invokeinterface 48 1 0
    //   165: aload_3
    //   166: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	this	1
    //   0	167	1	paramInt	int
    //   0	167	2	paramBoolean	boolean
    //   7	137	3	localObject1	Object
    //   152	14	3	localObject2	Object
    //   23	38	4	bool1	boolean
    //   71	44	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	152	finally
    //   19	23	152	finally
    //   30	34	152	finally
    //   35	39	152	finally
    //   44	48	152	finally
    //   49	53	152	finally
    //   54	58	152	finally
    //   65	69	152	finally
    //   74	79	152	finally
    //   79	83	152	finally
    //   86	90	152	finally
    //   105	109	152	finally
    //   114	120	152	finally
    //   120	124	152	finally
    //   125	129	152	finally
    //   131	135	152	finally
  }
  
  public void zzd(ConnectionResult paramConnectionResult)
  {
    Object localObject1 = zzd.zza(this.zzahh);
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzahh;
      zzd.zza((zzd)localObject1, paramConnectionResult);
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
      zzd.zza((zzd)localObject1, paramBundle);
      localObject1 = this.zzahh;
      ConnectionResult localConnectionResult = ConnectionResult.zzafB;
      zzd.zza((zzd)localObject1, localConnectionResult);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */