package com.google.android.gms.common.internal;

import android.os.IBinder;

class zzu$zza$zza
  implements zzu
{
  private IBinder zzoz;
  
  zzu$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public com.google.android.gms.dynamic.zzd zza(com.google.android.gms.dynamic.zzd paramzzd, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 22
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +86 -> 108
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: iload_2
    //   43: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   46: aload 4
    //   48: iload_3
    //   49: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/common/internal/zzu$zza$zza:zzoz	Landroid/os/IBinder;
    //   56: astore 6
    //   58: iconst_1
    //   59: istore 7
    //   61: aload 6
    //   63: iload 7
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 47 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 50	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 53	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   86: astore 6
    //   88: aload 6
    //   90: invokestatic 59	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   93: astore 6
    //   95: aload 5
    //   97: invokevirtual 62	android/os/Parcel:recycle	()V
    //   100: aload 4
    //   102: invokevirtual 62	android/os/Parcel:recycle	()V
    //   105: aload 6
    //   107: areturn
    //   108: aconst_null
    //   109: astore 6
    //   111: goto -78 -> 33
    //   114: astore 6
    //   116: aload 5
    //   118: invokevirtual 62	android/os/Parcel:recycle	()V
    //   121: aload 4
    //   123: invokevirtual 62	android/os/Parcel:recycle	()V
    //   126: aload 6
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	zza
    //   0	129	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	129	2	paramInt1	int
    //   0	129	3	paramInt2	int
    //   3	119	4	localParcel1	android.os.Parcel
    //   8	109	5	localParcel2	android.os.Parcel
    //   12	98	6	localObject1	Object
    //   114	13	6	localObject2	Object
    //   59	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	114	finally
    //   25	31	114	finally
    //   35	40	114	finally
    //   42	46	114	finally
    //   48	52	114	finally
    //   52	56	114	finally
    //   69	76	114	finally
    //   76	81	114	finally
    //   81	86	114	finally
    //   88	93	114	finally
  }
  
  /* Error */
  public com.google.android.gms.dynamic.zzd zza(com.google.android.gms.dynamic.zzd paramzzd, SignInButtonConfig paramSignInButtonConfig)
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
    //   20: ifnull +96 -> 116
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +87 -> 125
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 68	com/google/android/gms/common/internal/SignInButtonConfig:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/common/internal/zzu$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_2
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 47 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 50	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 53	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   95: astore 5
    //   97: aload 5
    //   99: invokestatic 59	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 62	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 62	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: areturn
    //   116: iconst_0
    //   117: istore 6
    //   119: aconst_null
    //   120: astore 5
    //   122: goto -91 -> 31
    //   125: iconst_0
    //   126: istore 6
    //   128: aconst_null
    //   129: astore 5
    //   131: aload_3
    //   132: iconst_0
    //   133: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   136: goto -74 -> 62
    //   139: astore 5
    //   141: aload 4
    //   143: invokevirtual 62	android/os/Parcel:recycle	()V
    //   146: aload_3
    //   147: invokevirtual 62	android/os/Parcel:recycle	()V
    //   150: aload 5
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	zza
    //   0	153	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	153	2	paramSignInButtonConfig	SignInButtonConfig
    //   3	144	3	localParcel1	android.os.Parcel
    //   7	135	4	localParcel2	android.os.Parcel
    //   11	119	5	localObject1	Object
    //   139	12	5	localObject2	Object
    //   42	85	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	139	finally
    //   23	29	139	finally
    //   32	37	139	finally
    //   45	50	139	finally
    //   58	62	139	finally
    //   62	66	139	finally
    //   78	85	139	finally
    //   85	90	139	finally
    //   90	95	139	finally
    //   97	102	139	finally
    //   132	136	139	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzu$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */