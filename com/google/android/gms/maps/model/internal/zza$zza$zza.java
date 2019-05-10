package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

class zza$zza$zza
  implements zza
{
  private IBinder zzoz;
  
  zza$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public zzd zzAn()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 4;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public zzd zzc(android.graphics.Bitmap paramBitmap)
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
    //   19: ifnull +75 -> 94
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 60	android/graphics/Bitmap:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/model/internal/zza$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 6
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 33 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 36	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 40	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   74: astore 4
    //   76: aload 4
    //   78: invokestatic 46	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   81: astore 4
    //   83: aload_3
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: aload_2
    //   88: invokevirtual 49	android/os/Parcel:recycle	()V
    //   91: aload 4
    //   93: areturn
    //   94: iconst_0
    //   95: istore 5
    //   97: aconst_null
    //   98: astore 4
    //   100: aload_2
    //   101: iconst_0
    //   102: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   105: goto -62 -> 43
    //   108: astore 4
    //   110: aload_3
    //   111: invokevirtual 49	android/os/Parcel:recycle	()V
    //   114: aload_2
    //   115: invokevirtual 49	android/os/Parcel:recycle	()V
    //   118: aload 4
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramBitmap	android.graphics.Bitmap
    //   3	112	2	localParcel1	Parcel
    //   7	104	3	localParcel2	Parcel
    //   10	89	4	localObject1	Object
    //   108	11	4	localObject2	Object
    //   23	73	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	108	finally
    //   26	31	108	finally
    //   39	43	108	finally
    //   43	47	108	finally
    //   59	66	108	finally
    //   66	70	108	finally
    //   70	74	108	finally
    //   76	81	108	finally
    //   101	105	108	finally
  }
  
  public zzd zzer(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zzes(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zzet(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 7;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zzh(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localObject1 = this.zzoz;
      int i = 5;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zziz(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zza$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */