package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;

final class GamesClientImpl$GameMuteStatusLoadResultImpl
  implements Notifications.GameMuteStatusLoadResult
{
  private final Status zzUX;
  private final String zzaEq;
  private final boolean zzaEr;
  
  /* Error */
  public GamesClientImpl$GameMuteStatusLoadResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 16	java/lang/Object:<init>	()V
    //   4: aload_1
    //   5: invokevirtual 22	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   8: istore_2
    //   9: iload_2
    //   10: invokestatic 28	com/google/android/gms/games/GamesStatusCodes:zzgc	(I)Lcom/google/android/gms/common/api/Status;
    //   13: astore_3
    //   14: aload_0
    //   15: aload_3
    //   16: putfield 30	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzUX	Lcom/google/android/gms/common/api/Status;
    //   19: aload_1
    //   20: invokevirtual 33	com/google/android/gms/common/data/DataHolder:getCount	()I
    //   23: istore_2
    //   24: iload_2
    //   25: ifle +40 -> 65
    //   28: ldc 35
    //   30: astore_3
    //   31: aload_1
    //   32: aload_3
    //   33: iconst_0
    //   34: iconst_0
    //   35: invokevirtual 39	com/google/android/gms/common/data/DataHolder:zzd	(Ljava/lang/String;II)Ljava/lang/String;
    //   38: astore_3
    //   39: aload_0
    //   40: aload_3
    //   41: putfield 41	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEq	Ljava/lang/String;
    //   44: ldc 43
    //   46: astore_3
    //   47: aload_1
    //   48: aload_3
    //   49: iconst_0
    //   50: iconst_0
    //   51: invokevirtual 47	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   54: istore_2
    //   55: aload_0
    //   56: iload_2
    //   57: putfield 49	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEr	Z
    //   60: aload_1
    //   61: invokevirtual 52	com/google/android/gms/common/data/DataHolder:close	()V
    //   64: return
    //   65: iconst_0
    //   66: istore_2
    //   67: aconst_null
    //   68: astore_3
    //   69: aload_0
    //   70: aconst_null
    //   71: putfield 41	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEq	Ljava/lang/String;
    //   74: iconst_0
    //   75: istore_2
    //   76: aconst_null
    //   77: astore_3
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 49	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEr	Z
    //   83: goto -23 -> 60
    //   86: astore_3
    //   87: aload_1
    //   88: invokevirtual 52	com/google/android/gms/common/data/DataHolder:close	()V
    //   91: aload_3
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	GameMuteStatusLoadResultImpl
    //   0	93	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	17	2	i	int
    //   54	22	2	bool	boolean
    //   13	65	3	localObject1	Object
    //   86	6	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   4	8	86	finally
    //   9	13	86	finally
    //   15	19	86	finally
    //   19	23	86	finally
    //   34	38	86	finally
    //   40	44	86	finally
    //   50	54	86	finally
    //   56	60	86	finally
    //   70	74	86	finally
    //   79	83	86	finally
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GameMuteStatusLoadResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */