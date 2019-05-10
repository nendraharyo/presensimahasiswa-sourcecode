package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;

final class GamesClientImpl$LoadProfileSettingsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Players.LoadProfileSettingsResult
{
  private final boolean zzaEK;
  private final boolean zzsj;
  
  /* Error */
  GamesClientImpl$LoadProfileSettingsResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 13	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: aload_1
    //   6: invokevirtual 19	com/google/android/gms/common/data/DataHolder:getCount	()I
    //   9: istore_2
    //   10: iload_2
    //   11: ifle +56 -> 67
    //   14: iconst_0
    //   15: istore_2
    //   16: aconst_null
    //   17: astore_3
    //   18: aload_1
    //   19: iconst_0
    //   20: invokevirtual 23	com/google/android/gms/common/data/DataHolder:zzbH	(I)I
    //   23: istore_2
    //   24: ldc 25
    //   26: astore 4
    //   28: aload_1
    //   29: aload 4
    //   31: iconst_0
    //   32: iload_2
    //   33: invokevirtual 29	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   36: istore 5
    //   38: aload_0
    //   39: iload 5
    //   41: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzsj	Z
    //   44: ldc 33
    //   46: astore 4
    //   48: aload_1
    //   49: aload 4
    //   51: iconst_0
    //   52: iload_2
    //   53: invokevirtual 29	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   56: istore_2
    //   57: aload_0
    //   58: iload_2
    //   59: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzaEK	Z
    //   62: aload_1
    //   63: invokevirtual 39	com/google/android/gms/common/data/DataHolder:close	()V
    //   66: return
    //   67: iconst_1
    //   68: istore_2
    //   69: aload_0
    //   70: iload_2
    //   71: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzsj	Z
    //   74: iconst_0
    //   75: istore_2
    //   76: aconst_null
    //   77: astore_3
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzaEK	Z
    //   83: goto -21 -> 62
    //   86: astore_3
    //   87: aload_1
    //   88: invokevirtual 39	com/google/android/gms/common/data/DataHolder:close	()V
    //   91: aload_3
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	LoadProfileSettingsResultImpl
    //   0	93	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   9	44	2	i	int
    //   56	20	2	bool1	boolean
    //   17	61	3	localObject1	Object
    //   86	6	3	localObject2	Object
    //   26	24	4	str	String
    //   36	4	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   5	9	86	finally
    //   19	23	86	finally
    //   32	36	86	finally
    //   39	44	86	finally
    //   52	56	86	finally
    //   58	62	86	finally
    //   70	74	86	finally
    //   79	83	86	finally
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadProfileSettingsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */