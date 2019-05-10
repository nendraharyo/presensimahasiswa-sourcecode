package com.google.android.gms.maps.internal;

import android.os.IBinder;

class zzr$zza$zza
  implements zzr
{
  private IBinder zzoz;
  
  zzr$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public boolean onMyLocationButtonClick()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_2
    //   6: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore_3
    //   10: ldc 23
    //   12: astore 4
    //   14: aload_2
    //   15: aload 4
    //   17: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 14	com/google/android/gms/maps/internal/zzr$zza$zza:zzoz	Landroid/os/IBinder;
    //   24: astore 4
    //   26: iconst_1
    //   27: istore 5
    //   29: aload 4
    //   31: iload 5
    //   33: aload_2
    //   34: aload_3
    //   35: iconst_0
    //   36: invokeinterface 33 5 0
    //   41: pop
    //   42: aload_3
    //   43: invokevirtual 36	android/os/Parcel:readException	()V
    //   46: aload_3
    //   47: invokevirtual 40	android/os/Parcel:readInt	()I
    //   50: istore 6
    //   52: iload 6
    //   54: ifeq +13 -> 67
    //   57: aload_3
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: iload_1
    //   66: ireturn
    //   67: iconst_0
    //   68: istore_1
    //   69: aconst_null
    //   70: astore 7
    //   72: goto -15 -> 57
    //   75: astore 7
    //   77: aload_3
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: aload_2
    //   82: invokevirtual 43	android/os/Parcel:recycle	()V
    //   85: aload 7
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	zza
    //   1	68	1	bool	boolean
    //   5	77	2	localParcel1	android.os.Parcel
    //   9	69	3	localParcel2	android.os.Parcel
    //   12	18	4	localObject1	Object
    //   27	5	5	i	int
    //   50	3	6	j	int
    //   70	1	7	localObject2	Object
    //   75	11	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   15	20	75	finally
    //   20	24	75	finally
    //   35	42	75	finally
    //   42	46	75	finally
    //   46	50	75	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzr$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */