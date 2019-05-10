package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzls$zza$zza
  implements zzls
{
  private IBinder zzoz;
  
  zzls$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onDisconnected()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
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
  
  public void onError(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 2;
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
  public void zza(int paramInt1, int paramInt2, android.view.Surface paramSurface)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 22
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload 4
    //   23: iload_1
    //   24: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   27: aload 4
    //   29: iload_2
    //   30: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   33: aload_3
    //   34: ifnull +66 -> 100
    //   37: iconst_1
    //   38: istore 7
    //   40: aload 4
    //   42: iload 7
    //   44: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   47: iconst_0
    //   48: istore 7
    //   50: aconst_null
    //   51: astore 6
    //   53: aload_3
    //   54: aload 4
    //   56: iconst_0
    //   57: invokevirtual 51	android/view/Surface:writeToParcel	(Landroid/os/Parcel;I)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/internal/zzls$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: astore 6
    //   66: iconst_1
    //   67: istore 8
    //   69: aload 6
    //   71: iload 8
    //   73: aload 4
    //   75: aload 5
    //   77: iconst_0
    //   78: invokeinterface 33 5 0
    //   83: pop
    //   84: aload 5
    //   86: invokevirtual 36	android/os/Parcel:readException	()V
    //   89: aload 5
    //   91: invokevirtual 39	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 39	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 7
    //   103: aconst_null
    //   104: astore 6
    //   106: aload 4
    //   108: iconst_0
    //   109: invokevirtual 43	android/os/Parcel:writeInt	(I)V
    //   112: goto -52 -> 60
    //   115: astore 6
    //   117: aload 5
    //   119: invokevirtual 39	android/os/Parcel:recycle	()V
    //   122: aload 4
    //   124: invokevirtual 39	android/os/Parcel:recycle	()V
    //   127: aload 6
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	zza
    //   0	130	1	paramInt1	int
    //   0	130	2	paramInt2	int
    //   0	130	3	paramSurface	android.view.Surface
    //   3	120	4	localParcel1	Parcel
    //   8	110	5	localParcel2	Parcel
    //   12	93	6	localObject1	Object
    //   115	13	6	localObject2	Object
    //   38	64	7	i	int
    //   67	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	115	finally
    //   23	27	115	finally
    //   29	33	115	finally
    //   42	47	115	finally
    //   56	60	115	finally
    //   60	64	115	finally
    //   77	84	115	finally
    //   84	89	115	finally
    //   108	112	115	finally
  }
  
  public void zzoD()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 4;
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzls$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */