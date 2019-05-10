package com.google.android.gms.ads.internal.client;

import android.os.IBinder;

class zzz$zza$zza
  implements zzz
{
  private IBinder zzoz;
  
  zzz$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public IBinder zza(com.google.android.gms.dynamic.zzd paramzzd, int paramInt)
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
    //   20: ifnull +69 -> 89
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: iload_2
    //   39: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/ads/internal/client/zzz$zza$zza:zzoz	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_1
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 47 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 50	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 53	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   75: astore 5
    //   77: aload 4
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 56	android/os/Parcel:recycle	()V
    //   86: aload 5
    //   88: areturn
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -61 -> 31
    //   95: astore 5
    //   97: aload 4
    //   99: invokevirtual 56	android/os/Parcel:recycle	()V
    //   102: aload_3
    //   103: invokevirtual 56	android/os/Parcel:recycle	()V
    //   106: aload 5
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	zza
    //   0	109	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	109	2	paramInt	int
    //   3	100	3	localParcel1	android.os.Parcel
    //   7	91	4	localParcel2	android.os.Parcel
    //   11	80	5	localObject1	Object
    //   95	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	95	finally
    //   23	29	95	finally
    //   32	37	95	finally
    //   38	42	95	finally
    //   42	46	95	finally
    //   58	65	95	finally
    //   65	70	95	finally
    //   70	75	95	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzz$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */