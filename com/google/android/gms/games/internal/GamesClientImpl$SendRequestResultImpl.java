package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.Requests.SendRequestResult;

final class GamesClientImpl$SendRequestResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Requests.SendRequestResult
{
  private final GameRequest zzaFi;
  
  /* Error */
  GamesClientImpl$SendRequestResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/request/GameRequestBuffer
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: invokespecial 15	com/google/android/gms/games/request/GameRequestBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_2
    //   15: invokevirtual 19	com/google/android/gms/games/request/GameRequestBuffer:getCount	()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifle +49 -> 69
    //   23: iconst_0
    //   24: istore_3
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_2
    //   29: iconst_0
    //   30: invokevirtual 23	com/google/android/gms/games/request/GameRequestBuffer:get	(I)Ljava/lang/Object;
    //   33: astore 4
    //   35: aload 4
    //   37: checkcast 25	com/google/android/gms/games/request/GameRequest
    //   40: astore 4
    //   42: aload 4
    //   44: invokeinterface 29 1 0
    //   49: astore 4
    //   51: aload 4
    //   53: checkcast 25	com/google/android/gms/games/request/GameRequest
    //   56: astore 4
    //   58: aload_0
    //   59: aload 4
    //   61: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$SendRequestResultImpl:zzaFi	Lcom/google/android/gms/games/request/GameRequest;
    //   64: aload_2
    //   65: invokevirtual 35	com/google/android/gms/games/request/GameRequestBuffer:release	()V
    //   68: return
    //   69: iconst_0
    //   70: istore_3
    //   71: aconst_null
    //   72: astore 4
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$SendRequestResultImpl:zzaFi	Lcom/google/android/gms/games/request/GameRequest;
    //   79: goto -15 -> 64
    //   82: astore 4
    //   84: aload_2
    //   85: invokevirtual 35	com/google/android/gms/games/request/GameRequestBuffer:release	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	SendRequestResultImpl
    //   0	91	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	77	2	localGameRequestBuffer	com.google.android.gms.games.request.GameRequestBuffer
    //   18	53	3	i	int
    //   26	47	4	localObject1	Object
    //   82	7	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	82	finally
    //   29	33	82	finally
    //   35	40	82	finally
    //   42	49	82	finally
    //   51	56	82	finally
    //   59	64	82	finally
    //   75	79	82	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SendRequestResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */