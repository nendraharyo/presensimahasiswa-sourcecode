package com.google.android.gms.internal;

import android.os.IBinder;

class zzsa$zza$zza
  implements zzsa
{
  private IBinder zzoz;
  
  zzsa$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public zzrx zza(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.dynamic.zzc paramzzc, com.google.android.gms.wallet.fragment.WalletFragmentOptions paramWalletFragmentOptions, zzry paramzzry)
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
    //   25: ifnull +141 -> 166
    //   28: aload_1
    //   29: invokeinterface 32 1 0
    //   34: astore 8
    //   36: aload 6
    //   38: aload 8
    //   40: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +131 -> 175
    //   47: aload_2
    //   48: invokeinterface 39 1 0
    //   53: astore 8
    //   55: aload 6
    //   57: aload 8
    //   59: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   62: aload_3
    //   63: ifnull +121 -> 184
    //   66: iconst_1
    //   67: istore 9
    //   69: aload 6
    //   71: iload 9
    //   73: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   76: iconst_0
    //   77: istore 9
    //   79: aconst_null
    //   80: astore 8
    //   82: aload_3
    //   83: aload 6
    //   85: iconst_0
    //   86: invokevirtual 50	com/google/android/gms/wallet/fragment/WalletFragmentOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   89: aload 4
    //   91: ifnull +12 -> 103
    //   94: aload 4
    //   96: invokeinterface 53 1 0
    //   101: astore 5
    //   103: aload 6
    //   105: aload 5
    //   107: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   110: aload_0
    //   111: getfield 14	com/google/android/gms/internal/zzsa$zza$zza:zzoz	Landroid/os/IBinder;
    //   114: astore 5
    //   116: iconst_1
    //   117: istore 9
    //   119: aload 5
    //   121: iload 9
    //   123: aload 6
    //   125: aload 7
    //   127: iconst_0
    //   128: invokeinterface 59 5 0
    //   133: pop
    //   134: aload 7
    //   136: invokevirtual 62	android/os/Parcel:readException	()V
    //   139: aload 7
    //   141: invokevirtual 65	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   144: astore 5
    //   146: aload 5
    //   148: invokestatic 71	com/google/android/gms/internal/zzrx$zza:zzej	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrx;
    //   151: astore 5
    //   153: aload 7
    //   155: invokevirtual 74	android/os/Parcel:recycle	()V
    //   158: aload 6
    //   160: invokevirtual 74	android/os/Parcel:recycle	()V
    //   163: aload 5
    //   165: areturn
    //   166: iconst_0
    //   167: istore 9
    //   169: aconst_null
    //   170: astore 8
    //   172: goto -136 -> 36
    //   175: iconst_0
    //   176: istore 9
    //   178: aconst_null
    //   179: astore 8
    //   181: goto -126 -> 55
    //   184: iconst_0
    //   185: istore 9
    //   187: aconst_null
    //   188: astore 8
    //   190: aload 6
    //   192: iconst_0
    //   193: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   196: goto -107 -> 89
    //   199: astore 5
    //   201: aload 7
    //   203: invokevirtual 74	android/os/Parcel:recycle	()V
    //   206: aload 6
    //   208: invokevirtual 74	android/os/Parcel:recycle	()V
    //   211: aload 5
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	zza
    //   0	214	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	214	2	paramzzc	com.google.android.gms.dynamic.zzc
    //   0	214	3	paramWalletFragmentOptions	com.google.android.gms.wallet.fragment.WalletFragmentOptions
    //   0	214	4	paramzzry	zzry
    //   1	163	5	localObject1	Object
    //   199	13	5	localObject2	Object
    //   6	201	6	localParcel1	android.os.Parcel
    //   11	191	7	localParcel2	android.os.Parcel
    //   15	174	8	localObject3	Object
    //   67	119	9	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	199	finally
    //   28	34	199	finally
    //   38	43	199	finally
    //   47	53	199	finally
    //   57	62	199	finally
    //   71	76	199	finally
    //   85	89	199	finally
    //   94	101	199	finally
    //   105	110	199	finally
    //   110	114	199	finally
    //   127	134	199	finally
    //   134	139	199	finally
    //   139	144	199	finally
    //   146	151	199	finally
    //   192	196	199	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsa$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */