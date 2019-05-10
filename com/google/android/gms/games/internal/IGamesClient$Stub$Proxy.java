package com.google.android.gms.games.internal;

import android.os.IBinder;

class IGamesClient$Stub$Proxy
  implements IGamesClient
{
  private IBinder zzoz;
  
  IGamesClient$Stub$Proxy(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public PopupLocationInfoParcelable zzws()
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
    //   17: getfield 14	com/google/android/gms/games/internal/IGamesClient$Stub$Proxy:zzoz	Landroid/os/IBinder;
    //   20: astore_3
    //   21: sipush 1001
    //   24: istore 4
    //   26: aload_3
    //   27: iload 4
    //   29: aload_1
    //   30: aload_2
    //   31: iconst_0
    //   32: invokeinterface 33 5 0
    //   37: pop
    //   38: aload_2
    //   39: invokevirtual 36	android/os/Parcel:readException	()V
    //   42: aload_2
    //   43: invokevirtual 40	android/os/Parcel:readInt	()I
    //   46: istore 5
    //   48: iload 5
    //   50: ifeq +23 -> 73
    //   53: getstatic 46	com/google/android/gms/games/internal/PopupLocationInfoParcelable:CREATOR	Lcom/google/android/gms/games/internal/PopupLocationInfoParcelableCreator;
    //   56: astore_3
    //   57: aload_3
    //   58: aload_2
    //   59: invokevirtual 52	com/google/android/gms/games/internal/PopupLocationInfoParcelableCreator:zzem	(Landroid/os/Parcel;)Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;
    //   62: astore_3
    //   63: aload_2
    //   64: invokevirtual 55	android/os/Parcel:recycle	()V
    //   67: aload_1
    //   68: invokevirtual 55	android/os/Parcel:recycle	()V
    //   71: aload_3
    //   72: areturn
    //   73: iconst_0
    //   74: istore 5
    //   76: aconst_null
    //   77: astore_3
    //   78: goto -15 -> 63
    //   81: astore_3
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload_1
    //   87: invokevirtual 55	android/os/Parcel:recycle	()V
    //   90: aload_3
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	Proxy
    //   3	84	1	localParcel1	android.os.Parcel
    //   7	76	2	localParcel2	android.os.Parcel
    //   10	68	3	localObject1	Object
    //   81	10	3	localObject2	Object
    //   24	4	4	i	int
    //   46	29	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	81	finally
    //   16	20	81	finally
    //   31	38	81	finally
    //   38	42	81	finally
    //   42	46	81	finally
    //   53	56	81	finally
    //   58	62	81	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesClient$Stub$Proxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */