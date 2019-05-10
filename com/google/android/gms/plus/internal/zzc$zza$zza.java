package com.google.android.gms.plus.internal;

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
  public com.google.android.gms.dynamic.zzd zza(com.google.android.gms.dynamic.zzd paramzzd, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: ldc 22
    //   12: astore 8
    //   14: aload 6
    //   16: aload 8
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +100 -> 122
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 8
    //   33: aload 6
    //   35: aload 8
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 6
    //   42: iload_2
    //   43: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   46: aload 6
    //   48: iload_3
    //   49: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   52: aload 6
    //   54: aload 4
    //   56: invokevirtual 43	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   59: aload 6
    //   61: iload 5
    //   63: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/plus/internal/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   70: astore 8
    //   72: iconst_1
    //   73: istore 9
    //   75: aload 8
    //   77: iload 9
    //   79: aload 6
    //   81: aload 7
    //   83: iconst_0
    //   84: invokeinterface 50 5 0
    //   89: pop
    //   90: aload 7
    //   92: invokevirtual 53	android/os/Parcel:readException	()V
    //   95: aload 7
    //   97: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   100: astore 8
    //   102: aload 8
    //   104: invokestatic 62	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   107: astore 8
    //   109: aload 7
    //   111: invokevirtual 65	android/os/Parcel:recycle	()V
    //   114: aload 6
    //   116: invokevirtual 65	android/os/Parcel:recycle	()V
    //   119: aload 8
    //   121: areturn
    //   122: aconst_null
    //   123: astore 8
    //   125: goto -92 -> 33
    //   128: astore 8
    //   130: aload 7
    //   132: invokevirtual 65	android/os/Parcel:recycle	()V
    //   135: aload 6
    //   137: invokevirtual 65	android/os/Parcel:recycle	()V
    //   140: aload 8
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	zza
    //   0	143	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	143	2	paramInt1	int
    //   0	143	3	paramInt2	int
    //   0	143	4	paramString	String
    //   0	143	5	paramInt3	int
    //   3	133	6	localParcel1	android.os.Parcel
    //   8	123	7	localParcel2	android.os.Parcel
    //   12	112	8	localObject1	Object
    //   128	13	8	localObject2	Object
    //   73	5	9	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	128	finally
    //   25	31	128	finally
    //   35	40	128	finally
    //   42	46	128	finally
    //   48	52	128	finally
    //   54	59	128	finally
    //   61	66	128	finally
    //   66	70	128	finally
    //   83	90	128	finally
    //   90	95	128	finally
    //   95	100	128	finally
    //   102	107	128	finally
  }
  
  /* Error */
  public com.google.android.gms.dynamic.zzd zza(com.google.android.gms.dynamic.zzd paramzzd, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: ldc 22
    //   12: astore 8
    //   14: aload 6
    //   16: aload 8
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +100 -> 122
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 8
    //   33: aload 6
    //   35: aload 8
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 6
    //   42: iload_2
    //   43: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   46: aload 6
    //   48: iload_3
    //   49: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   52: aload 6
    //   54: aload 4
    //   56: invokevirtual 43	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   59: aload 6
    //   61: aload 5
    //   63: invokevirtual 43	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/plus/internal/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   70: astore 8
    //   72: iconst_2
    //   73: istore 9
    //   75: aload 8
    //   77: iload 9
    //   79: aload 6
    //   81: aload 7
    //   83: iconst_0
    //   84: invokeinterface 50 5 0
    //   89: pop
    //   90: aload 7
    //   92: invokevirtual 53	android/os/Parcel:readException	()V
    //   95: aload 7
    //   97: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   100: astore 8
    //   102: aload 8
    //   104: invokestatic 62	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   107: astore 8
    //   109: aload 7
    //   111: invokevirtual 65	android/os/Parcel:recycle	()V
    //   114: aload 6
    //   116: invokevirtual 65	android/os/Parcel:recycle	()V
    //   119: aload 8
    //   121: areturn
    //   122: aconst_null
    //   123: astore 8
    //   125: goto -92 -> 33
    //   128: astore 8
    //   130: aload 7
    //   132: invokevirtual 65	android/os/Parcel:recycle	()V
    //   135: aload 6
    //   137: invokevirtual 65	android/os/Parcel:recycle	()V
    //   140: aload 8
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	zza
    //   0	143	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	143	2	paramInt1	int
    //   0	143	3	paramInt2	int
    //   0	143	4	paramString1	String
    //   0	143	5	paramString2	String
    //   3	133	6	localParcel1	android.os.Parcel
    //   8	123	7	localParcel2	android.os.Parcel
    //   12	112	8	localObject1	Object
    //   128	13	8	localObject2	Object
    //   73	5	9	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	128	finally
    //   25	31	128	finally
    //   35	40	128	finally
    //   42	46	128	finally
    //   48	52	128	finally
    //   54	59	128	finally
    //   61	66	128	finally
    //   66	70	128	finally
    //   83	90	128	finally
    //   90	95	128	finally
    //   95	100	128	finally
    //   102	107	128	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */