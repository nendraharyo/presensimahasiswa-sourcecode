package com.google.android.gms.internal;

import android.os.IBinder;

class zzly$zza$zza
  implements zzly
{
  private IBinder zzoz;
  
  zzly$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(zzlx paramzzlx, com.google.android.gms.clearcut.LogEventParcelable paramLogEventParcelable)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 22
    //   12: astore 6
    //   14: aload 5
    //   16: aload 6
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +11 -> 33
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 4
    //   33: aload 5
    //   35: aload 4
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload_2
    //   41: ifnull +56 -> 97
    //   44: iconst_1
    //   45: istore_3
    //   46: aload 5
    //   48: iload_3
    //   49: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   52: iconst_0
    //   53: istore_3
    //   54: aconst_null
    //   55: astore 4
    //   57: aload_2
    //   58: aload 5
    //   60: iconst_0
    //   61: invokevirtual 47	com/google/android/gms/clearcut/LogEventParcelable:writeToParcel	(Landroid/os/Parcel;I)V
    //   64: aload_0
    //   65: getfield 14	com/google/android/gms/internal/zzly$zza$zza:zzoz	Landroid/os/IBinder;
    //   68: astore 4
    //   70: iconst_1
    //   71: istore 7
    //   73: iconst_1
    //   74: istore 8
    //   76: aload 4
    //   78: iload 7
    //   80: aload 5
    //   82: aconst_null
    //   83: iload 8
    //   85: invokeinterface 53 5 0
    //   90: pop
    //   91: aload 5
    //   93: invokevirtual 56	android/os/Parcel:recycle	()V
    //   96: return
    //   97: iconst_0
    //   98: istore_3
    //   99: aconst_null
    //   100: astore 4
    //   102: aload 5
    //   104: iconst_0
    //   105: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   108: goto -44 -> 64
    //   111: astore 4
    //   113: aload 5
    //   115: invokevirtual 56	android/os/Parcel:recycle	()V
    //   118: aload 4
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramzzlx	zzlx
    //   0	121	2	paramLogEventParcelable	com.google.android.gms.clearcut.LogEventParcelable
    //   1	98	3	i	int
    //   3	98	4	localIBinder	IBinder
    //   111	8	4	localObject	Object
    //   8	106	5	localParcel	android.os.Parcel
    //   12	5	6	str	String
    //   71	8	7	j	int
    //   74	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   16	21	111	finally
    //   25	31	111	finally
    //   35	40	111	finally
    //   48	52	111	finally
    //   60	64	111	finally
    //   64	68	111	finally
    //   83	91	111	finally
    //   104	108	111	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzly$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */