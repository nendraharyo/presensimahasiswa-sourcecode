package com.google.android.gms.internal;

import android.os.IBinder;

class zzkp$zza$zza
  implements zzkp
{
  private IBinder zzoz;
  
  zzkp$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(zzko paramzzko)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 22
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +52 -> 71
    //   22: aload_1
    //   23: invokeinterface 32 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzkp$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_3
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 43 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 46	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 49	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 49	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 49	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzko	zzko
    //   3	81	2	localParcel1	android.os.Parcel
    //   7	73	3	localParcel2	android.os.Parcel
    //   10	63	4	localObject1	Object
    //   77	11	4	localObject2	Object
    //   43	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	77	finally
    //   22	28	77	finally
    //   31	36	77	finally
    //   36	40	77	finally
    //   51	58	77	finally
    //   58	62	77	finally
  }
  
  /* Error */
  public void zza(zzko paramzzko, String paramString)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +60 -> 80
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 52	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/internal/zzkp$zza$zza:zzoz	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_2
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 43 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 46	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 49	android/os/Parcel:recycle	()V
    //   75: aload_3
    //   76: invokevirtual 49	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore 5
    //   83: goto -52 -> 31
    //   86: astore 5
    //   88: aload 4
    //   90: invokevirtual 49	android/os/Parcel:recycle	()V
    //   93: aload_3
    //   94: invokevirtual 49	android/os/Parcel:recycle	()V
    //   97: aload 5
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	zza
    //   0	100	1	paramzzko	zzko
    //   0	100	2	paramString	String
    //   3	91	3	localParcel1	android.os.Parcel
    //   7	82	4	localParcel2	android.os.Parcel
    //   11	71	5	localObject1	Object
    //   86	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	86	finally
    //   23	29	86	finally
    //   32	37	86	finally
    //   38	42	86	finally
    //   42	46	86	finally
    //   58	65	86	finally
    //   65	70	86	finally
  }
  
  /* Error */
  public void zzb(zzko paramzzko, String paramString)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +60 -> 80
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 52	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/internal/zzkp$zza$zza:zzoz	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_1
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 43 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 46	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 49	android/os/Parcel:recycle	()V
    //   75: aload_3
    //   76: invokevirtual 49	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore 5
    //   83: goto -52 -> 31
    //   86: astore 5
    //   88: aload 4
    //   90: invokevirtual 49	android/os/Parcel:recycle	()V
    //   93: aload_3
    //   94: invokevirtual 49	android/os/Parcel:recycle	()V
    //   97: aload 5
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	zza
    //   0	100	1	paramzzko	zzko
    //   0	100	2	paramString	String
    //   3	91	3	localParcel1	android.os.Parcel
    //   7	82	4	localParcel2	android.os.Parcel
    //   11	71	5	localObject1	Object
    //   86	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	86	finally
    //   23	29	86	finally
    //   32	37	86	finally
    //   38	42	86	finally
    //   42	46	86	finally
    //   58	65	86	finally
    //   65	70	86	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkp$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */