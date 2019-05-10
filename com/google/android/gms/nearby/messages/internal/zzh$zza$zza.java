package com.google.android.gms.nearby.messages.internal;

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
  public void onPermissionChanged(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: ldc 23
    //   8: astore 4
    //   10: aload_3
    //   11: aload 4
    //   13: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: iload_1
    //   17: ifeq +39 -> 56
    //   20: aload_3
    //   21: iload_2
    //   22: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   25: aload_0
    //   26: getfield 14	com/google/android/gms/nearby/messages/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   29: astore 5
    //   31: iconst_1
    //   32: istore 6
    //   34: iconst_1
    //   35: istore 7
    //   37: aload 5
    //   39: iload 6
    //   41: aload_3
    //   42: aconst_null
    //   43: iload 7
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload_3
    //   52: invokevirtual 40	android/os/Parcel:recycle	()V
    //   55: return
    //   56: iconst_0
    //   57: istore_2
    //   58: aconst_null
    //   59: astore 5
    //   61: goto -41 -> 20
    //   64: astore 5
    //   66: aload_3
    //   67: invokevirtual 40	android/os/Parcel:recycle	()V
    //   70: aload 5
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	zza
    //   0	73	1	paramBoolean	boolean
    //   1	57	2	i	int
    //   5	62	3	localParcel	android.os.Parcel
    //   8	4	4	str	String
    //   29	31	5	localIBinder	IBinder
    //   64	7	5	localObject	Object
    //   32	8	6	j	int
    //   35	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	64	finally
    //   21	25	64	finally
    //   25	29	64	finally
    //   43	51	64	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzh$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */