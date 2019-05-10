package com.google.android.gms.drive.realtime.internal;

import android.os.IBinder;

class zzh$zza$zza
  implements zzh
{
  private IBinder zzoz;
  
  zzh$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zzc(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   13: astore 6
    //   15: ldc 23
    //   17: astore 7
    //   19: aload 5
    //   21: aload 7
    //   23: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   26: iload_1
    //   27: ifeq +69 -> 96
    //   30: iload_3
    //   31: istore 8
    //   33: aload 5
    //   35: iload 8
    //   37: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   40: iload_2
    //   41: ifeq +64 -> 105
    //   44: aload 5
    //   46: iload_3
    //   47: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   50: aload_0
    //   51: getfield 14	com/google/android/gms/drive/realtime/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   54: astore 9
    //   56: iconst_1
    //   57: istore 4
    //   59: iconst_0
    //   60: istore 8
    //   62: aconst_null
    //   63: astore 7
    //   65: aload 9
    //   67: iload 4
    //   69: aload 5
    //   71: aload 6
    //   73: iconst_0
    //   74: invokeinterface 37 5 0
    //   79: pop
    //   80: aload 6
    //   82: invokevirtual 40	android/os/Parcel:readException	()V
    //   85: aload 6
    //   87: invokevirtual 43	android/os/Parcel:recycle	()V
    //   90: aload 5
    //   92: invokevirtual 43	android/os/Parcel:recycle	()V
    //   95: return
    //   96: iconst_0
    //   97: istore 8
    //   99: aconst_null
    //   100: astore 7
    //   102: goto -69 -> 33
    //   105: iconst_0
    //   106: istore_3
    //   107: aconst_null
    //   108: astore 9
    //   110: goto -66 -> 44
    //   113: astore 9
    //   115: aload 6
    //   117: invokevirtual 43	android/os/Parcel:recycle	()V
    //   120: aload 5
    //   122: invokevirtual 43	android/os/Parcel:recycle	()V
    //   125: aload 9
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	zza
    //   0	128	1	paramBoolean1	boolean
    //   0	128	2	paramBoolean2	boolean
    //   1	106	3	i	int
    //   3	65	4	j	int
    //   8	113	5	localParcel1	android.os.Parcel
    //   13	103	6	localParcel2	android.os.Parcel
    //   17	84	7	str	String
    //   31	67	8	k	int
    //   54	55	9	localIBinder	IBinder
    //   113	13	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   21	26	113	finally
    //   35	40	113	finally
    //   46	50	113	finally
    //   50	54	113	finally
    //   73	80	113	finally
    //   80	85	113	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzh$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */