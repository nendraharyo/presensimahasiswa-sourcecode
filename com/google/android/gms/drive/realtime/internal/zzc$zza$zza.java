package com.google.android.gms.drive.realtime.internal;

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
  public void onError(com.google.android.gms.common.api.Status paramStatus)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/drive/realtime/internal/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_2
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 44 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 47	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 50	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 50	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 50	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramStatus	com.google.android.gms.common.api.Status
    //   3	96	2	localParcel1	android.os.Parcel
    //   7	88	3	localParcel2	android.os.Parcel
    //   10	73	4	localObject1	Object
    //   92	11	4	localObject2	Object
    //   23	57	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	92	finally
    //   26	31	92	finally
    //   39	43	92	finally
    //   43	47	92	finally
    //   58	65	92	finally
    //   65	69	92	finally
    //   85	89	92	finally
  }
  
  /* Error */
  public void zzag(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   12: astore 5
    //   14: ldc 22
    //   16: astore 6
    //   18: aload 4
    //   20: aload 6
    //   22: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   25: iload_1
    //   26: ifeq +50 -> 76
    //   29: aload 4
    //   31: iload_2
    //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 14	com/google/android/gms/drive/realtime/internal/zzc$zza$zza:zzoz	Landroid/os/IBinder;
    //   39: astore 7
    //   41: iconst_1
    //   42: istore_3
    //   43: aconst_null
    //   44: astore 6
    //   46: aload 7
    //   48: iload_3
    //   49: aload 4
    //   51: aload 5
    //   53: iconst_0
    //   54: invokeinterface 44 5 0
    //   59: pop
    //   60: aload 5
    //   62: invokevirtual 47	android/os/Parcel:readException	()V
    //   65: aload 5
    //   67: invokevirtual 50	android/os/Parcel:recycle	()V
    //   70: aload 4
    //   72: invokevirtual 50	android/os/Parcel:recycle	()V
    //   75: return
    //   76: iconst_0
    //   77: istore_2
    //   78: aconst_null
    //   79: astore 7
    //   81: goto -52 -> 29
    //   84: astore 7
    //   86: aload 5
    //   88: invokevirtual 50	android/os/Parcel:recycle	()V
    //   91: aload 4
    //   93: invokevirtual 50	android/os/Parcel:recycle	()V
    //   96: aload 7
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	zza
    //   0	99	1	paramBoolean	boolean
    //   1	77	2	i	int
    //   3	46	3	j	int
    //   7	85	4	localParcel1	android.os.Parcel
    //   12	75	5	localParcel2	android.os.Parcel
    //   16	29	6	str	String
    //   39	41	7	localIBinder	IBinder
    //   84	13	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   20	25	84	finally
    //   31	35	84	finally
    //   35	39	84	finally
    //   53	60	84	finally
    //   60	65	84	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */