package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

class zzcj$zza$zza
  implements zzcj
{
  private IBinder zzoz;
  
  zzcj$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void destroy()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
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
  
  public zzd zzK(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
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
  
  /* Error */
  public void zza(zzd paramzzd)
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
    //   19: ifnull +52 -> 71
    //   22: aload_1
    //   23: invokeinterface 58 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 62	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzcj$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_3
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 33 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 36	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 39	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 39	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 39	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 39	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzd	zzd
    //   3	81	2	localParcel1	Parcel
    //   7	73	3	localParcel2	Parcel
    //   10	63	4	localObject1	Object
    //   77	11	4	localObject2	Object
    //   43	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	77	finally
    //   22	28	77	finally
    //   31	36	77	finally
    //   36	40	77	finally
    //   51	58	77	finally
    //   58	62	77	finally
  }
  
  /* Error */
  public void zza(String paramString, zzd paramzzd)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 42	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +55 -> 80
    //   28: aload_2
    //   29: invokeinterface 58 1 0
    //   34: astore 5
    //   36: aload_3
    //   37: aload 5
    //   39: invokevirtual 62	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/internal/zzcj$zza$zza:zzoz	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_1
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 33 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 36	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 39	android/os/Parcel:recycle	()V
    //   75: aload_3
    //   76: invokevirtual 39	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore 5
    //   83: goto -47 -> 36
    //   86: astore 5
    //   88: aload 4
    //   90: invokevirtual 39	android/os/Parcel:recycle	()V
    //   93: aload_3
    //   94: invokevirtual 39	android/os/Parcel:recycle	()V
    //   97: aload 5
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	zza
    //   0	100	1	paramString	String
    //   0	100	2	paramzzd	zzd
    //   3	91	3	localParcel1	Parcel
    //   7	82	4	localParcel2	Parcel
    //   11	71	5	localObject1	Object
    //   86	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	86	finally
    //   20	24	86	finally
    //   28	34	86	finally
    //   37	42	86	finally
    //   42	46	86	finally
    //   58	65	86	finally
    //   65	70	86	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcj$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */