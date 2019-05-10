package com.google.android.gms.internal;

import android.os.IBinder;

class zzri$zza$zza
  implements zzri
{
  private IBinder zzoz;
  
  zzri$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(zzrh paramzzrh, String paramString1, String paramString2)
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
    //   22: ifnull +70 -> 92
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: aload_2
    //   43: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 4
    //   48: aload_3
    //   49: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/internal/zzri$zza$zza:zzoz	Landroid/os/IBinder;
    //   56: astore 6
    //   58: iconst_1
    //   59: istore 7
    //   61: aload 6
    //   63: iload 7
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 46 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 49	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 52	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: invokevirtual 52	android/os/Parcel:recycle	()V
    //   91: return
    //   92: aconst_null
    //   93: astore 6
    //   95: goto -62 -> 33
    //   98: astore 6
    //   100: aload 5
    //   102: invokevirtual 52	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: invokevirtual 52	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	zza
    //   0	113	1	paramzzrh	zzrh
    //   0	113	2	paramString1	String
    //   0	113	3	paramString2	String
    //   3	103	4	localParcel1	android.os.Parcel
    //   8	93	5	localParcel2	android.os.Parcel
    //   12	82	6	localObject1	Object
    //   98	13	6	localObject2	Object
    //   59	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	98	finally
    //   25	31	98	finally
    //   35	40	98	finally
    //   42	46	98	finally
    //   48	52	98	finally
    //   52	56	98	finally
    //   69	76	98	finally
    //   76	81	98	finally
  }
  
  /* Error */
  public void zzb(zzrh paramzzrh, String paramString1, String paramString2)
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
    //   22: ifnull +70 -> 92
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: aload_2
    //   43: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 4
    //   48: aload_3
    //   49: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/internal/zzri$zza$zza:zzoz	Landroid/os/IBinder;
    //   56: astore 6
    //   58: iconst_2
    //   59: istore 7
    //   61: aload 6
    //   63: iload 7
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 46 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 49	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 52	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: invokevirtual 52	android/os/Parcel:recycle	()V
    //   91: return
    //   92: aconst_null
    //   93: astore 6
    //   95: goto -62 -> 33
    //   98: astore 6
    //   100: aload 5
    //   102: invokevirtual 52	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: invokevirtual 52	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	zza
    //   0	113	1	paramzzrh	zzrh
    //   0	113	2	paramString1	String
    //   0	113	3	paramString2	String
    //   3	103	4	localParcel1	android.os.Parcel
    //   8	93	5	localParcel2	android.os.Parcel
    //   12	82	6	localObject1	Object
    //   98	13	6	localObject2	Object
    //   59	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	98	finally
    //   25	31	98	finally
    //   35	40	98	finally
    //   42	46	98	finally
    //   48	52	98	finally
    //   52	56	98	finally
    //   69	76	98	finally
    //   76	81	98	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzri$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */