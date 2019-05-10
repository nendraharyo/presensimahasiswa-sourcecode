package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzlt$zza$zza
  implements zzlt
{
  private IBinder zzoz;
  
  zzlt$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void destroy()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
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
  
  public void disconnect()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
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
  
  public void zza(zzls paramzzls)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    String str = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    try
    {
      localParcel.writeInterfaceToken(str);
      if (paramzzls != null) {
        localIBinder = paramzzls.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      localIBinder = this.zzoz;
      int i = 6;
      int j = 1;
      localIBinder.transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zza(zzls paramzzls, int paramInt)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    String str = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    try
    {
      localParcel.writeInterfaceToken(str);
      if (paramzzls != null) {
        localIBinder = paramzzls.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      localParcel.writeInt(paramInt);
      localIBinder = this.zzoz;
      int i = 5;
      int j = 1;
      localIBinder.transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(zzls paramzzls, zzlu paramzzlu, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: ldc 22
    //   10: astore 7
    //   12: aload 6
    //   14: aload 7
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +83 -> 103
    //   23: aload_1
    //   24: invokeinterface 44 1 0
    //   29: astore 7
    //   31: aload 6
    //   33: aload 7
    //   35: invokevirtual 48	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   38: aload_2
    //   39: ifnull +11 -> 50
    //   42: aload_2
    //   43: invokeinterface 57 1 0
    //   48: astore 5
    //   50: aload 6
    //   52: aload 5
    //   54: invokevirtual 48	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   57: aload 6
    //   59: aload_3
    //   60: invokevirtual 60	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   63: aload 6
    //   65: aload 4
    //   67: invokevirtual 60	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   70: aload_0
    //   71: getfield 14	com/google/android/gms/internal/zzlt$zza$zza:zzoz	Landroid/os/IBinder;
    //   74: astore 5
    //   76: iconst_4
    //   77: istore 8
    //   79: iconst_1
    //   80: istore 9
    //   82: aload 5
    //   84: iload 8
    //   86: aload 6
    //   88: aconst_null
    //   89: iload 9
    //   91: invokeinterface 34 5 0
    //   96: pop
    //   97: aload 6
    //   99: invokevirtual 37	android/os/Parcel:recycle	()V
    //   102: return
    //   103: iconst_0
    //   104: istore 8
    //   106: aconst_null
    //   107: astore 7
    //   109: goto -78 -> 31
    //   112: astore 5
    //   114: aload 6
    //   116: invokevirtual 37	android/os/Parcel:recycle	()V
    //   119: aload 5
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramzzls	zzls
    //   0	122	2	paramzzlu	zzlu
    //   0	122	3	paramString1	String
    //   0	122	4	paramString2	String
    //   1	82	5	localIBinder	IBinder
    //   112	8	5	localObject1	Object
    //   6	109	6	localParcel	Parcel
    //   10	98	7	localObject2	Object
    //   77	28	8	i	int
    //   80	10	9	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	112	finally
    //   23	29	112	finally
    //   33	38	112	finally
    //   42	48	112	finally
    //   52	57	112	finally
    //   59	63	112	finally
    //   65	70	112	finally
    //   70	74	112	finally
    //   89	97	112	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlt$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */