package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;

class zzc$zza$zza
  implements zzc
{
  private IBinder zzoz;
  
  zzc$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public IBinder zza(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.internal.zzex paramzzex, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 5
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 6
    //   13: ldc 22
    //   15: astore 7
    //   17: aload 5
    //   19: aload 7
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +92 -> 117
    //   28: aload_1
    //   29: invokeinterface 32 1 0
    //   34: astore 7
    //   36: aload 5
    //   38: aload 7
    //   40: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +11 -> 55
    //   47: aload_2
    //   48: invokeinterface 39 1 0
    //   53: astore 4
    //   55: aload 5
    //   57: aload 4
    //   59: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   62: aload 5
    //   64: iload_3
    //   65: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   68: aload_0
    //   69: getfield 14	com/google/android/gms/ads/internal/reward/client/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   72: astore 4
    //   74: iconst_1
    //   75: istore 8
    //   77: aload 4
    //   79: iload 8
    //   81: aload 5
    //   83: aload 6
    //   85: iconst_0
    //   86: invokeinterface 50 5 0
    //   91: pop
    //   92: aload 6
    //   94: invokevirtual 53	android/os/Parcel:readException	()V
    //   97: aload 6
    //   99: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   102: astore 4
    //   104: aload 6
    //   106: invokevirtual 59	android/os/Parcel:recycle	()V
    //   109: aload 5
    //   111: invokevirtual 59	android/os/Parcel:recycle	()V
    //   114: aload 4
    //   116: areturn
    //   117: iconst_0
    //   118: istore 8
    //   120: aconst_null
    //   121: astore 7
    //   123: goto -87 -> 36
    //   126: astore 4
    //   128: aload 6
    //   130: invokevirtual 59	android/os/Parcel:recycle	()V
    //   133: aload 5
    //   135: invokevirtual 59	android/os/Parcel:recycle	()V
    //   138: aload 4
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	zza
    //   0	141	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	141	2	paramzzex	com.google.android.gms.internal.zzex
    //   0	141	3	paramInt	int
    //   1	114	4	localIBinder	IBinder
    //   126	13	4	localObject1	Object
    //   6	128	5	localParcel1	android.os.Parcel
    //   11	118	6	localParcel2	android.os.Parcel
    //   15	107	7	localObject2	Object
    //   75	44	8	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	126	finally
    //   28	34	126	finally
    //   38	43	126	finally
    //   47	53	126	finally
    //   57	62	126	finally
    //   64	68	126	finally
    //   68	72	126	finally
    //   85	92	126	finally
    //   92	97	126	finally
    //   97	102	126	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */