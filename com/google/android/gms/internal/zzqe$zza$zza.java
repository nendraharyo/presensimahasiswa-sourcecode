package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqe$zza$zza
  implements zzqe
{
  private IBinder zzoz;
  
  zzqe$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onDisconnected()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 2;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 3;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzEc()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 5;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(com.google.android.gms.nearby.bootstrap.Device paramDevice, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: ldc 22
    //   6: astore 4
    //   8: aload_3
    //   9: aload 4
    //   11: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +60 -> 75
    //   18: iconst_1
    //   19: istore 5
    //   21: aload_3
    //   22: iload 5
    //   24: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   27: iconst_0
    //   28: istore 5
    //   30: aconst_null
    //   31: astore 4
    //   33: aload_1
    //   34: aload_3
    //   35: iconst_0
    //   36: invokevirtual 49	com/google/android/gms/nearby/bootstrap/Device:writeToParcel	(Landroid/os/Parcel;I)V
    //   39: aload_3
    //   40: aload_2
    //   41: invokevirtual 53	android/os/Parcel:writeByteArray	([B)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/internal/zzqe$zza$zza:zzoz	Landroid/os/IBinder;
    //   48: astore 4
    //   50: iconst_1
    //   51: istore 6
    //   53: iconst_1
    //   54: istore 7
    //   56: aload 4
    //   58: iload 6
    //   60: aload_3
    //   61: aconst_null
    //   62: iload 7
    //   64: invokeinterface 34 5 0
    //   69: pop
    //   70: aload_3
    //   71: invokevirtual 37	android/os/Parcel:recycle	()V
    //   74: return
    //   75: iconst_0
    //   76: istore 5
    //   78: aconst_null
    //   79: astore 4
    //   81: aload_3
    //   82: iconst_0
    //   83: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   86: goto -47 -> 39
    //   89: astore 4
    //   91: aload_3
    //   92: invokevirtual 37	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	zza
    //   0	98	1	paramDevice	com.google.android.gms.nearby.bootstrap.Device
    //   0	98	2	paramArrayOfByte	byte[]
    //   3	89	3	localParcel	Parcel
    //   6	74	4	localObject1	Object
    //   89	7	4	localObject2	Object
    //   19	58	5	i	int
    //   51	8	6	j	int
    //   54	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   9	14	89	finally
    //   22	27	89	finally
    //   35	39	89	finally
    //   40	44	89	finally
    //   44	48	89	finally
    //   62	70	89	finally
    //   82	86	89	finally
  }
  
  public void zzfw(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 4;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzfx(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 6;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqe$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */