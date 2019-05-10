package com.google.android.gms.maps.internal;

import android.os.IBinder;

class IProjectionDelegate$zza$zza
  implements IProjectionDelegate
{
  private IBinder zzoz;
  
  IProjectionDelegate$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public com.google.android.gms.maps.model.LatLng fromScreenLocation(com.google.android.gms.dynamic.zzd paramzzd)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: ldc 22
    //   13: astore 5
    //   15: aload_3
    //   16: aload 5
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +79 -> 101
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 5
    //   33: aload_3
    //   34: aload 5
    //   36: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   39: aload_0
    //   40: getfield 14	com/google/android/gms/maps/internal/IProjectionDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   43: astore 5
    //   45: iconst_1
    //   46: istore 6
    //   48: aload 5
    //   50: iload 6
    //   52: aload_3
    //   53: aload 4
    //   55: iconst_0
    //   56: invokeinterface 43 5 0
    //   61: pop
    //   62: aload 4
    //   64: invokevirtual 46	android/os/Parcel:readException	()V
    //   67: aload 4
    //   69: invokevirtual 50	android/os/Parcel:readInt	()I
    //   72: istore 7
    //   74: iload 7
    //   76: ifeq +14 -> 90
    //   79: getstatic 56	com/google/android/gms/maps/model/LatLng:CREATOR	Lcom/google/android/gms/maps/model/zze;
    //   82: astore_2
    //   83: aload_2
    //   84: aload 4
    //   86: invokevirtual 62	com/google/android/gms/maps/model/zze:zzfz	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLng;
    //   89: astore_2
    //   90: aload 4
    //   92: invokevirtual 65	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 65	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: areturn
    //   101: iconst_0
    //   102: istore 7
    //   104: aconst_null
    //   105: astore 5
    //   107: goto -74 -> 33
    //   110: astore_2
    //   111: aload 4
    //   113: invokevirtual 65	android/os/Parcel:recycle	()V
    //   116: aload_3
    //   117: invokevirtual 65	android/os/Parcel:recycle	()V
    //   120: aload_2
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   1	99	2	localObject1	Object
    //   110	11	2	localObject2	Object
    //   5	112	3	localParcel1	android.os.Parcel
    //   9	103	4	localParcel2	android.os.Parcel
    //   13	93	5	localObject3	Object
    //   46	5	6	i	int
    //   72	31	7	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	110	finally
    //   25	31	110	finally
    //   34	39	110	finally
    //   39	43	110	finally
    //   55	62	110	finally
    //   62	67	110	finally
    //   67	72	110	finally
    //   79	82	110	finally
    //   84	89	110	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.VisibleRegion getVisibleRegion()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	com/google/android/gms/maps/internal/IProjectionDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   20: astore_3
    //   21: iconst_3
    //   22: istore 4
    //   24: aload_3
    //   25: iload 4
    //   27: aload_1
    //   28: aload_2
    //   29: iconst_0
    //   30: invokeinterface 43 5 0
    //   35: pop
    //   36: aload_2
    //   37: invokevirtual 46	android/os/Parcel:readException	()V
    //   40: aload_2
    //   41: invokevirtual 50	android/os/Parcel:readInt	()I
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq +23 -> 71
    //   51: getstatic 71	com/google/android/gms/maps/model/VisibleRegion:CREATOR	Lcom/google/android/gms/maps/model/zzp;
    //   54: astore_3
    //   55: aload_3
    //   56: aload_2
    //   57: invokevirtual 77	com/google/android/gms/maps/model/zzp:zzfK	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/VisibleRegion;
    //   60: astore_3
    //   61: aload_2
    //   62: invokevirtual 65	android/os/Parcel:recycle	()V
    //   65: aload_1
    //   66: invokevirtual 65	android/os/Parcel:recycle	()V
    //   69: aload_3
    //   70: areturn
    //   71: iconst_0
    //   72: istore 5
    //   74: aconst_null
    //   75: astore_3
    //   76: goto -15 -> 61
    //   79: astore_3
    //   80: aload_2
    //   81: invokevirtual 65	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: invokevirtual 65	android/os/Parcel:recycle	()V
    //   88: aload_3
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   3	82	1	localParcel1	android.os.Parcel
    //   7	74	2	localParcel2	android.os.Parcel
    //   10	66	3	localObject1	Object
    //   79	10	3	localObject2	Object
    //   22	4	4	i	int
    //   44	29	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	79	finally
    //   16	20	79	finally
    //   29	36	79	finally
    //   36	40	79	finally
    //   40	44	79	finally
    //   51	54	79	finally
    //   56	60	79	finally
  }
  
  /* Error */
  public com.google.android.gms.dynamic.zzd toScreenLocation(com.google.android.gms.maps.model.LatLng paramLatLng)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 22
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +74 -> 93
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 81	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 85	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/IProjectionDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_2
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 43 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 46	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 89	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   73: astore 4
    //   75: aload 4
    //   77: invokestatic 95	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   80: astore 4
    //   82: aload_3
    //   83: invokevirtual 65	android/os/Parcel:recycle	()V
    //   86: aload_2
    //   87: invokevirtual 65	android/os/Parcel:recycle	()V
    //   90: aload 4
    //   92: areturn
    //   93: iconst_0
    //   94: istore 5
    //   96: aconst_null
    //   97: astore 4
    //   99: aload_2
    //   100: iconst_0
    //   101: invokevirtual 81	android/os/Parcel:writeInt	(I)V
    //   104: goto -61 -> 43
    //   107: astore 4
    //   109: aload_3
    //   110: invokevirtual 65	android/os/Parcel:recycle	()V
    //   113: aload_2
    //   114: invokevirtual 65	android/os/Parcel:recycle	()V
    //   117: aload 4
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	zza
    //   0	120	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	111	2	localParcel1	android.os.Parcel
    //   7	103	3	localParcel2	android.os.Parcel
    //   10	88	4	localObject1	Object
    //   107	11	4	localObject2	Object
    //   23	72	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	107	finally
    //   26	31	107	finally
    //   39	43	107	finally
    //   43	47	107	finally
    //   58	65	107	finally
    //   65	69	107	finally
    //   69	73	107	finally
    //   75	80	107	finally
    //   100	104	107	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IProjectionDelegate$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */