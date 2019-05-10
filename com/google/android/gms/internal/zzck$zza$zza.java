package com.google.android.gms.internal;

import android.os.IBinder;

class zzck$zza$zza
  implements zzck
{
  private IBinder zzoz;
  
  zzck$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public IBinder zza(com.google.android.gms.dynamic.zzd paramzzd1, com.google.android.gms.dynamic.zzd paramzzd2, com.google.android.gms.dynamic.zzd paramzzd3, int paramInt)
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
    //   25: ifnull +112 -> 137
    //   28: aload_1
    //   29: invokeinterface 32 1 0
    //   34: astore 8
    //   36: aload 6
    //   38: aload 8
    //   40: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +102 -> 146
    //   47: aload_2
    //   48: invokeinterface 32 1 0
    //   53: astore 8
    //   55: aload 6
    //   57: aload 8
    //   59: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   62: aload_3
    //   63: ifnull +11 -> 74
    //   66: aload_3
    //   67: invokeinterface 32 1 0
    //   72: astore 5
    //   74: aload 6
    //   76: aload 5
    //   78: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   81: aload 6
    //   83: iload 4
    //   85: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   88: aload_0
    //   89: getfield 14	com/google/android/gms/internal/zzck$zza$zza:zzoz	Landroid/os/IBinder;
    //   92: astore 5
    //   94: iconst_1
    //   95: istore 9
    //   97: aload 5
    //   99: iload 9
    //   101: aload 6
    //   103: aload 7
    //   105: iconst_0
    //   106: invokeinterface 47 5 0
    //   111: pop
    //   112: aload 7
    //   114: invokevirtual 50	android/os/Parcel:readException	()V
    //   117: aload 7
    //   119: invokevirtual 53	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   122: astore 5
    //   124: aload 7
    //   126: invokevirtual 56	android/os/Parcel:recycle	()V
    //   129: aload 6
    //   131: invokevirtual 56	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: areturn
    //   137: iconst_0
    //   138: istore 9
    //   140: aconst_null
    //   141: astore 8
    //   143: goto -107 -> 36
    //   146: iconst_0
    //   147: istore 9
    //   149: aconst_null
    //   150: astore 8
    //   152: goto -97 -> 55
    //   155: astore 5
    //   157: aload 7
    //   159: invokevirtual 56	android/os/Parcel:recycle	()V
    //   162: aload 6
    //   164: invokevirtual 56	android/os/Parcel:recycle	()V
    //   167: aload 5
    //   169: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	zza
    //   0	170	1	paramzzd1	com.google.android.gms.dynamic.zzd
    //   0	170	2	paramzzd2	com.google.android.gms.dynamic.zzd
    //   0	170	3	paramzzd3	com.google.android.gms.dynamic.zzd
    //   0	170	4	paramInt	int
    //   1	134	5	localIBinder	IBinder
    //   155	13	5	localObject1	Object
    //   6	157	6	localParcel1	android.os.Parcel
    //   11	147	7	localParcel2	android.os.Parcel
    //   15	136	8	localObject2	Object
    //   95	53	9	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	155	finally
    //   28	34	155	finally
    //   38	43	155	finally
    //   47	53	155	finally
    //   57	62	155	finally
    //   66	72	155	finally
    //   76	81	155	finally
    //   83	88	155	finally
    //   88	92	155	finally
    //   105	112	155	finally
    //   112	117	155	finally
    //   117	122	155	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzck$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */