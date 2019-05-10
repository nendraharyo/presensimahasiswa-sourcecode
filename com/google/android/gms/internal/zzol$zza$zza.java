package com.google.android.gms.internal;

import android.os.IBinder;

class zzol$zza$zza
  implements zzol
{
  private IBinder zzoz;
  
  zzol$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(com.google.android.gms.fitness.request.DataTypeCreateRequest paramDataTypeCreateRequest)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/fitness/request/DataTypeCreateRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/internal/zzol$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_1
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 43 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 46	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 49	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 49	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 49	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 49	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramDataTypeCreateRequest	com.google.android.gms.fitness.request.DataTypeCreateRequest
    //   3	96	2	localParcel1	android.os.Parcel
    //   7	88	3	localParcel2	android.os.Parcel
    //   10	73	4	localObject1	Object
    //   92	11	4	localObject2	Object
    //   23	57	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	92	finally
    //   26	31	92	finally
    //   39	43	92	finally
    //   43	47	92	finally
    //   58	65	92	finally
    //   65	69	92	finally
    //   85	89	92	finally
  }
  
  /* Error */
  public void zza(com.google.android.gms.fitness.request.DataTypeReadRequest paramDataTypeReadRequest)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 52	com/google/android/gms/fitness/request/DataTypeReadRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/internal/zzol$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_2
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 43 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 46	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 49	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 49	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 49	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 49	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramDataTypeReadRequest	com.google.android.gms.fitness.request.DataTypeReadRequest
    //   3	96	2	localParcel1	android.os.Parcel
    //   7	88	3	localParcel2	android.os.Parcel
    //   10	73	4	localObject1	Object
    //   92	11	4	localObject2	Object
    //   23	57	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	92	finally
    //   26	31	92	finally
    //   39	43	92	finally
    //   43	47	92	finally
    //   58	65	92	finally
    //   65	69	92	finally
    //   85	89	92	finally
  }
  
  /* Error */
  public void zza(com.google.android.gms.fitness.request.DisableFitRequest paramDisableFitRequest)
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
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 56	com/google/android/gms/fitness/request/DisableFitRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/internal/zzol$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 22
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 43 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 46	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 49	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 49	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 49	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramDisableFitRequest	com.google.android.gms.fitness.request.DisableFitRequest
    //   3	97	2	localParcel1	android.os.Parcel
    //   7	89	3	localParcel2	android.os.Parcel
    //   10	74	4	localObject1	Object
    //   93	11	4	localObject2	Object
    //   23	58	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	93	finally
    //   26	31	93	finally
    //   39	43	93	finally
    //   43	47	93	finally
    //   59	66	93	finally
    //   66	70	93	finally
    //   86	90	93	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzol$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */