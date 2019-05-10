package com.google.android.gms.ads.internal.client;

import android.os.IBinder;

class zzt$zza$zza
  implements zzt
{
  private IBinder zzoz;
  
  zzt$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public IBinder zza(com.google.android.gms.dynamic.zzd paramzzd, String paramString, com.google.android.gms.internal.zzex paramzzex, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 7
    //   13: ldc 22
    //   15: astore 8
    //   17: aload 6
    //   19: aload 8
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +99 -> 124
    //   28: aload_1
    //   29: invokeinterface 32 1 0
    //   34: astore 8
    //   36: aload 6
    //   38: aload 8
    //   40: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload 6
    //   45: aload_2
    //   46: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_3
    //   50: ifnull +11 -> 61
    //   53: aload_3
    //   54: invokeinterface 42 1 0
    //   59: astore 5
    //   61: aload 6
    //   63: aload 5
    //   65: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   68: aload 6
    //   70: iload 4
    //   72: invokevirtual 46	android/os/Parcel:writeInt	(I)V
    //   75: aload_0
    //   76: getfield 14	com/google/android/gms/ads/internal/client/zzt$zza$zza:zzoz	Landroid/os/IBinder;
    //   79: astore 5
    //   81: iconst_1
    //   82: istore 9
    //   84: aload 5
    //   86: iload 9
    //   88: aload 6
    //   90: aload 7
    //   92: iconst_0
    //   93: invokeinterface 53 5 0
    //   98: pop
    //   99: aload 7
    //   101: invokevirtual 56	android/os/Parcel:readException	()V
    //   104: aload 7
    //   106: invokevirtual 59	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   109: astore 5
    //   111: aload 7
    //   113: invokevirtual 62	android/os/Parcel:recycle	()V
    //   116: aload 6
    //   118: invokevirtual 62	android/os/Parcel:recycle	()V
    //   121: aload 5
    //   123: areturn
    //   124: iconst_0
    //   125: istore 9
    //   127: aconst_null
    //   128: astore 8
    //   130: goto -94 -> 36
    //   133: astore 5
    //   135: aload 7
    //   137: invokevirtual 62	android/os/Parcel:recycle	()V
    //   140: aload 6
    //   142: invokevirtual 62	android/os/Parcel:recycle	()V
    //   145: aload 5
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	zza
    //   0	148	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	148	2	paramString	String
    //   0	148	3	paramzzex	com.google.android.gms.internal.zzex
    //   0	148	4	paramInt	int
    //   1	121	5	localIBinder	IBinder
    //   133	13	5	localObject1	Object
    //   6	135	6	localParcel1	android.os.Parcel
    //   11	125	7	localParcel2	android.os.Parcel
    //   15	114	8	localObject2	Object
    //   82	44	9	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	133	finally
    //   28	34	133	finally
    //   38	43	133	finally
    //   45	49	133	finally
    //   53	59	133	finally
    //   63	68	133	finally
    //   70	75	133	finally
    //   75	79	133	finally
    //   92	99	133	finally
    //   99	104	133	finally
    //   104	109	133	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzt$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */