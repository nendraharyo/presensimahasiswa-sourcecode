package com.google.android.gms.internal;

import android.os.IBinder;

class zzgh$zza$zza
  implements zzgh
{
  private IBinder zzoz;
  
  zzgh$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public boolean isValidPurchase(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: ldc 23
    //   13: astore 5
    //   15: aload_3
    //   16: aload 5
    //   18: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_3
    //   22: aload_1
    //   23: invokevirtual 30	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 14	com/google/android/gms/internal/zzgh$zza$zza:zzoz	Landroid/os/IBinder;
    //   30: astore 5
    //   32: iconst_1
    //   33: istore 6
    //   35: aload 5
    //   37: iload 6
    //   39: aload_3
    //   40: aload 4
    //   42: iconst_0
    //   43: invokeinterface 36 5 0
    //   48: pop
    //   49: aload 4
    //   51: invokevirtual 39	android/os/Parcel:readException	()V
    //   54: aload 4
    //   56: invokevirtual 43	android/os/Parcel:readInt	()I
    //   59: istore 7
    //   61: iload 7
    //   63: ifeq +14 -> 77
    //   66: aload 4
    //   68: invokevirtual 46	android/os/Parcel:recycle	()V
    //   71: aload_3
    //   72: invokevirtual 46	android/os/Parcel:recycle	()V
    //   75: iload_2
    //   76: ireturn
    //   77: iconst_0
    //   78: istore_2
    //   79: aconst_null
    //   80: astore 8
    //   82: goto -16 -> 66
    //   85: astore 8
    //   87: aload 4
    //   89: invokevirtual 46	android/os/Parcel:recycle	()V
    //   92: aload_3
    //   93: invokevirtual 46	android/os/Parcel:recycle	()V
    //   96: aload 8
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	zza
    //   0	99	1	paramString	String
    //   1	78	2	bool	boolean
    //   5	88	3	localParcel1	android.os.Parcel
    //   9	79	4	localParcel2	android.os.Parcel
    //   13	23	5	localObject1	Object
    //   33	5	6	i	int
    //   59	3	7	j	int
    //   80	1	8	localObject2	Object
    //   85	12	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	21	85	finally
    //   22	26	85	finally
    //   26	30	85	finally
    //   42	49	85	finally
    //   49	54	85	finally
    //   54	59	85	finally
  }
  
  /* Error */
  public void zza(zzgg paramzzgg)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +52 -> 71
    //   22: aload_1
    //   23: invokeinterface 52 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzgh$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_2
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 36 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 39	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 46	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 46	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 46	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 46	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzgg	zzgg
    //   3	81	2	localParcel1	android.os.Parcel
    //   7	73	3	localParcel2	android.os.Parcel
    //   10	63	4	localObject1	Object
    //   77	11	4	localObject2	Object
    //   43	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	77	finally
    //   22	28	77	finally
    //   31	36	77	finally
    //   36	40	77	finally
    //   51	58	77	finally
    //   58	62	77	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgh$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */