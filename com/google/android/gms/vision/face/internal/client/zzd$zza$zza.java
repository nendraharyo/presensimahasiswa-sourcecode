package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;

class zzd$zza$zza
  implements zzd
{
  private IBinder zzoz;
  
  zzd$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public zzc zza(com.google.android.gms.dynamic.zzd paramzzd, FaceSettingsParcel paramFaceSettingsParcel)
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
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 47	com/google/android/gms/vision/face/internal/client/FaceSettingsParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/vision/face/internal/client/zzd$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_1
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 53 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 56	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 59	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   95: astore 5
    //   97: aload 5
    //   99: invokestatic 65	com/google/android/gms/vision/face/internal/client/zzc$zza:zzeg	(Landroid/os/IBinder;)Lcom/google/android/gms/vision/face/internal/client/zzc;
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 68	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 68	android/os/Parcel:recycle	()V
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
    //   133: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   136: goto -74 -> 62
    //   139: astore 5
    //   141: aload 4
    //   143: invokevirtual 68	android/os/Parcel:recycle	()V
    //   146: aload_3
    //   147: invokevirtual 68	android/os/Parcel:recycle	()V
    //   150: aload 5
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	zza
    //   0	153	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	153	2	paramFaceSettingsParcel	FaceSettingsParcel
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzd$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */