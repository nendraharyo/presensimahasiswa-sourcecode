package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

class zzd$zza$zza
  implements zzd
{
  private IBinder zzoz;
  
  zzd$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public int getActiveLevelIndex()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int getDefaultLevelIndex()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public List getLevels()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.createBinderArrayList();
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int hashCodeRemote()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 6;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isUnderground()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.zzoz;
      int i = 4;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public boolean zzb(zzd paramzzd)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   12: astore 5
    //   14: ldc 22
    //   16: astore 6
    //   18: aload 4
    //   20: aload 6
    //   22: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: ifnull +73 -> 99
    //   29: aload_1
    //   30: invokeinterface 55 1 0
    //   35: astore 6
    //   37: aload 4
    //   39: aload 6
    //   41: invokevirtual 59	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/maps/model/internal/zzd$zza$zza:zzoz	Landroid/os/IBinder;
    //   48: astore 6
    //   50: iconst_5
    //   51: istore 7
    //   53: aload 6
    //   55: iload 7
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_0
    //   62: invokeinterface 33 5 0
    //   67: pop
    //   68: aload 5
    //   70: invokevirtual 36	android/os/Parcel:readException	()V
    //   73: aload 5
    //   75: invokevirtual 40	android/os/Parcel:readInt	()I
    //   78: istore 8
    //   80: iload 8
    //   82: ifeq +5 -> 87
    //   85: iconst_1
    //   86: istore_2
    //   87: aload 5
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload 4
    //   94: invokevirtual 43	android/os/Parcel:recycle	()V
    //   97: iload_2
    //   98: ireturn
    //   99: iconst_0
    //   100: istore 8
    //   102: aconst_null
    //   103: astore 6
    //   105: goto -68 -> 37
    //   108: astore_3
    //   109: aload 5
    //   111: invokevirtual 43	android/os/Parcel:recycle	()V
    //   114: aload 4
    //   116: invokevirtual 43	android/os/Parcel:recycle	()V
    //   119: aload_3
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramzzd	zzd
    //   1	97	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   108	12	3	localObject2	Object
    //   7	108	4	localParcel1	Parcel
    //   12	98	5	localParcel2	Parcel
    //   16	88	6	localObject3	Object
    //   51	5	7	i	int
    //   78	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	25	108	finally
    //   29	35	108	finally
    //   39	44	108	finally
    //   44	48	108	finally
    //   61	68	108	finally
    //   68	73	108	finally
    //   73	78	108	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzd$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */