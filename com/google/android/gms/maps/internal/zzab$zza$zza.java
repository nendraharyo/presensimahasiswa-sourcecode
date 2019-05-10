package com.google.android.gms.maps.internal;

import android.os.IBinder;

class zzab$zza$zza
  implements zzab
{
  private IBinder zzoz;
  
  zzab$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void onSnapshotReady(android.graphics.Bitmap paramBitmap)
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
    //   40: invokevirtual 37	android/graphics/Bitmap:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/zzab$zza$zza:zzoz	Landroid/os/IBinder;
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
    //   0	105	1	paramBitmap	android.graphics.Bitmap
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
  public void zzr(com.google.android.gms.dynamic.zzd paramzzd)
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
    //   23: invokeinterface 55 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 59	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/maps/internal/zzab$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_2
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
    //   0	90	1	paramzzd	com.google.android.gms.dynamic.zzd
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzab$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */