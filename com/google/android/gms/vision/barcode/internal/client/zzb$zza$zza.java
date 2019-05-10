package com.google.android.gms.vision.barcode.internal.client;

import android.os.IBinder;

class zzb$zza$zza
  implements zzb
{
  private IBinder zzoz;
  
  zzb$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public com.google.android.gms.vision.barcode.Barcode[] zza(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.vision.internal.client.FrameMetadataParcel paramFrameMetadataParcel)
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
    //   20: ifnull +103 -> 123
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +94 -> 132
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
    //   59: invokevirtual 47	com/google/android/gms/vision/internal/client/FrameMetadataParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/vision/barcode/internal/client/zzb$zza$zza:zzoz	Landroid/os/IBinder;
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
    //   90: getstatic 62	com/google/android/gms/vision/barcode/Barcode:CREATOR	Lcom/google/android/gms/vision/barcode/zzb;
    //   93: astore 5
    //   95: aload 4
    //   97: aload 5
    //   99: invokevirtual 66	android/os/Parcel:createTypedArray	(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //   102: astore 5
    //   104: aload 5
    //   106: checkcast 68	[Lcom/google/android/gms/vision/barcode/Barcode;
    //   109: astore 5
    //   111: aload 4
    //   113: invokevirtual 71	android/os/Parcel:recycle	()V
    //   116: aload_3
    //   117: invokevirtual 71	android/os/Parcel:recycle	()V
    //   120: aload 5
    //   122: areturn
    //   123: iconst_0
    //   124: istore 6
    //   126: aconst_null
    //   127: astore 5
    //   129: goto -98 -> 31
    //   132: iconst_0
    //   133: istore 6
    //   135: aconst_null
    //   136: astore 5
    //   138: aload_3
    //   139: iconst_0
    //   140: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   143: goto -81 -> 62
    //   146: astore 5
    //   148: aload 4
    //   150: invokevirtual 71	android/os/Parcel:recycle	()V
    //   153: aload_3
    //   154: invokevirtual 71	android/os/Parcel:recycle	()V
    //   157: aload 5
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	zza
    //   0	160	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	160	2	paramFrameMetadataParcel	com.google.android.gms.vision.internal.client.FrameMetadataParcel
    //   3	151	3	localParcel1	android.os.Parcel
    //   7	142	4	localParcel2	android.os.Parcel
    //   11	126	5	localObject1	Object
    //   146	12	5	localObject2	Object
    //   42	92	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	146	finally
    //   23	29	146	finally
    //   32	37	146	finally
    //   45	50	146	finally
    //   58	62	146	finally
    //   62	66	146	finally
    //   78	85	146	finally
    //   85	90	146	finally
    //   90	93	146	finally
    //   97	102	146	finally
    //   104	109	146	finally
    //   139	143	146	finally
  }
  
  /* Error */
  public com.google.android.gms.vision.barcode.Barcode[] zzb(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.vision.internal.client.FrameMetadataParcel paramFrameMetadataParcel)
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
    //   20: ifnull +103 -> 123
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +94 -> 132
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
    //   59: invokevirtual 47	com/google/android/gms/vision/internal/client/FrameMetadataParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/vision/barcode/internal/client/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_2
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
    //   90: getstatic 62	com/google/android/gms/vision/barcode/Barcode:CREATOR	Lcom/google/android/gms/vision/barcode/zzb;
    //   93: astore 5
    //   95: aload 4
    //   97: aload 5
    //   99: invokevirtual 66	android/os/Parcel:createTypedArray	(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //   102: astore 5
    //   104: aload 5
    //   106: checkcast 68	[Lcom/google/android/gms/vision/barcode/Barcode;
    //   109: astore 5
    //   111: aload 4
    //   113: invokevirtual 71	android/os/Parcel:recycle	()V
    //   116: aload_3
    //   117: invokevirtual 71	android/os/Parcel:recycle	()V
    //   120: aload 5
    //   122: areturn
    //   123: iconst_0
    //   124: istore 6
    //   126: aconst_null
    //   127: astore 5
    //   129: goto -98 -> 31
    //   132: iconst_0
    //   133: istore 6
    //   135: aconst_null
    //   136: astore 5
    //   138: aload_3
    //   139: iconst_0
    //   140: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   143: goto -81 -> 62
    //   146: astore 5
    //   148: aload 4
    //   150: invokevirtual 71	android/os/Parcel:recycle	()V
    //   153: aload_3
    //   154: invokevirtual 71	android/os/Parcel:recycle	()V
    //   157: aload 5
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	zza
    //   0	160	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	160	2	paramFrameMetadataParcel	com.google.android.gms.vision.internal.client.FrameMetadataParcel
    //   3	151	3	localParcel1	android.os.Parcel
    //   7	142	4	localParcel2	android.os.Parcel
    //   11	126	5	localObject1	Object
    //   146	12	5	localObject2	Object
    //   42	92	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	146	finally
    //   23	29	146	finally
    //   32	37	146	finally
    //   45	50	146	finally
    //   58	62	146	finally
    //   62	66	146	finally
    //   78	85	146	finally
    //   85	90	146	finally
    //   90	93	146	finally
    //   97	102	146	finally
    //   104	109	146	finally
    //   139	143	146	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zzb$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */