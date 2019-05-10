package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.Parcel;

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
  
  public void zzIh()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public FaceParcel[] zzc(com.google.android.gms.dynamic.zzd paramzzd, com.google.android.gms.vision.internal.client.FrameMetadataParcel paramFrameMetadataParcel)
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
    //   24: invokeinterface 45 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 49	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +94 -> 132
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 60	com/google/android/gms/vision/internal/client/FrameMetadataParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/vision/face/internal/client/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_1
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 33 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 36	android/os/Parcel:readException	()V
    //   90: getstatic 66	com/google/android/gms/vision/face/internal/client/FaceParcel:CREATOR	Lcom/google/android/gms/vision/face/internal/client/zza;
    //   93: astore 5
    //   95: aload 4
    //   97: aload 5
    //   99: invokevirtual 70	android/os/Parcel:createTypedArray	(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //   102: astore 5
    //   104: aload 5
    //   106: checkcast 72	[Lcom/google/android/gms/vision/face/internal/client/FaceParcel;
    //   109: astore 5
    //   111: aload 4
    //   113: invokevirtual 39	android/os/Parcel:recycle	()V
    //   116: aload_3
    //   117: invokevirtual 39	android/os/Parcel:recycle	()V
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
    //   140: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   143: goto -81 -> 62
    //   146: astore 5
    //   148: aload 4
    //   150: invokevirtual 39	android/os/Parcel:recycle	()V
    //   153: aload_3
    //   154: invokevirtual 39	android/os/Parcel:recycle	()V
    //   157: aload 5
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	zza
    //   0	160	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   0	160	2	paramFrameMetadataParcel	com.google.android.gms.vision.internal.client.FrameMetadataParcel
    //   3	151	3	localParcel1	Parcel
    //   7	142	4	localParcel2	Parcel
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
  
  public boolean zzkJ(int paramInt)
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localParcel1.writeInt(paramInt);
      localObject3 = this.zzoz;
      int i = 2;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */