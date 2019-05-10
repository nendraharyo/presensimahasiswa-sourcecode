package com.google.android.gms.playlog.internal;

import android.os.IBinder;
import android.os.Parcel;

class zza$zza$zza
  implements zza
{
  private IBinder zzoz;
  
  zza$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(String paramString, PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.playlog.internal.IPlayLogService";
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken((String)localObject1);
        localParcel.writeString(paramString);
        if (paramPlayLoggerContext != null)
        {
          i = 1;
          localParcel.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlayLoggerContext.writeToParcel(localParcel, 0);
          if (paramLogEvent != null)
          {
            i = 1;
            localParcel.writeInt(i);
            i = 0;
            localObject1 = null;
            paramLogEvent.writeToParcel(localParcel, 0);
            localObject1 = this.zzoz;
            int j = 2;
            int k = 1;
            ((IBinder)localObject1).transact(j, localParcel, null, k);
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel.recycle();
      }
      Object localObject3 = null;
      localParcel.writeInt(0);
    }
  }
  
  /* Error */
  public void zza(String paramString, PlayLoggerContext paramPlayLoggerContext, java.util.List paramList)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: aload 4
    //   11: aload 5
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload 4
    //   18: aload_1
    //   19: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: ifnull +65 -> 88
    //   26: iconst_1
    //   27: istore 6
    //   29: aload 4
    //   31: iload 6
    //   33: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   36: iconst_0
    //   37: istore 6
    //   39: aconst_null
    //   40: astore 5
    //   42: aload_2
    //   43: aload 4
    //   45: iconst_0
    //   46: invokevirtual 40	com/google/android/gms/playlog/internal/PlayLoggerContext:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload 4
    //   51: aload_3
    //   52: invokevirtual 57	android/os/Parcel:writeTypedList	(Ljava/util/List;)V
    //   55: aload_0
    //   56: getfield 14	com/google/android/gms/playlog/internal/zza$zza$zza:zzoz	Landroid/os/IBinder;
    //   59: astore 5
    //   61: iconst_3
    //   62: istore 7
    //   64: iconst_1
    //   65: istore 8
    //   67: aload 5
    //   69: iload 7
    //   71: aload 4
    //   73: aconst_null
    //   74: iload 8
    //   76: invokeinterface 50 5 0
    //   81: pop
    //   82: aload 4
    //   84: invokevirtual 53	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload 4
    //   96: iconst_0
    //   97: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   100: goto -51 -> 49
    //   103: astore 5
    //   105: aload 4
    //   107: invokevirtual 53	android/os/Parcel:recycle	()V
    //   110: aload 5
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	zza
    //   0	113	1	paramString	String
    //   0	113	2	paramPlayLoggerContext	PlayLoggerContext
    //   0	113	3	paramList	java.util.List
    //   3	103	4	localParcel	Parcel
    //   7	86	5	localObject1	Object
    //   103	8	5	localObject2	Object
    //   27	63	6	i	int
    //   62	8	7	j	int
    //   65	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	103	finally
    //   18	22	103	finally
    //   31	36	103	finally
    //   45	49	103	finally
    //   51	55	103	finally
    //   55	59	103	finally
    //   74	82	103	finally
    //   96	100	103	finally
  }
  
  /* Error */
  public void zza(String paramString, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: aload 4
    //   11: aload 5
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload 4
    //   18: aload_1
    //   19: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: ifnull +65 -> 88
    //   26: iconst_1
    //   27: istore 6
    //   29: aload 4
    //   31: iload 6
    //   33: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   36: iconst_0
    //   37: istore 6
    //   39: aconst_null
    //   40: astore 5
    //   42: aload_2
    //   43: aload 4
    //   45: iconst_0
    //   46: invokevirtual 40	com/google/android/gms/playlog/internal/PlayLoggerContext:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload 4
    //   51: aload_3
    //   52: invokevirtual 62	android/os/Parcel:writeByteArray	([B)V
    //   55: aload_0
    //   56: getfield 14	com/google/android/gms/playlog/internal/zza$zza$zza:zzoz	Landroid/os/IBinder;
    //   59: astore 5
    //   61: iconst_4
    //   62: istore 7
    //   64: iconst_1
    //   65: istore 8
    //   67: aload 5
    //   69: iload 7
    //   71: aload 4
    //   73: aconst_null
    //   74: iload 8
    //   76: invokeinterface 50 5 0
    //   81: pop
    //   82: aload 4
    //   84: invokevirtual 53	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload 4
    //   96: iconst_0
    //   97: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   100: goto -51 -> 49
    //   103: astore 5
    //   105: aload 4
    //   107: invokevirtual 53	android/os/Parcel:recycle	()V
    //   110: aload 5
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	zza
    //   0	113	1	paramString	String
    //   0	113	2	paramPlayLoggerContext	PlayLoggerContext
    //   0	113	3	paramArrayOfByte	byte[]
    //   3	103	4	localParcel	Parcel
    //   7	86	5	localObject1	Object
    //   103	8	5	localObject2	Object
    //   27	63	6	i	int
    //   62	8	7	j	int
    //   65	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	103	finally
    //   18	22	103	finally
    //   31	36	103	finally
    //   45	49	103	finally
    //   51	55	103	finally
    //   55	59	103	finally
    //   74	82	103	finally
    //   96	100	103	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zza$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */