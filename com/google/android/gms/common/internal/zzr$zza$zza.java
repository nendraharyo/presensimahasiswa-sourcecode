package com.google.android.gms.common.internal;

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
  public void zza(int paramInt, IBinder paramIBinder, android.os.Bundle paramBundle)
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
    //   24: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   27: aload 4
    //   29: aload_2
    //   30: invokevirtual 34	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: ifnull +66 -> 100
    //   37: iconst_1
    //   38: istore 7
    //   40: aload 4
    //   42: iload 7
    //   44: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   47: iconst_0
    //   48: istore 7
    //   50: aconst_null
    //   51: astore 6
    //   53: aload_3
    //   54: aload 4
    //   56: iconst_0
    //   57: invokevirtual 41	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/common/internal/zzr$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: astore 6
    //   66: iconst_1
    //   67: istore 8
    //   69: aload 6
    //   71: iload 8
    //   73: aload 4
    //   75: aload 5
    //   77: iconst_0
    //   78: invokeinterface 47 5 0
    //   83: pop
    //   84: aload 5
    //   86: invokevirtual 50	android/os/Parcel:readException	()V
    //   89: aload 5
    //   91: invokevirtual 53	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 53	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 7
    //   103: aconst_null
    //   104: astore 6
    //   106: aload 4
    //   108: iconst_0
    //   109: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   112: goto -52 -> 60
    //   115: astore 6
    //   117: aload 5
    //   119: invokevirtual 53	android/os/Parcel:recycle	()V
    //   122: aload 4
    //   124: invokevirtual 53	android/os/Parcel:recycle	()V
    //   127: aload 6
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	zza
    //   0	130	1	paramInt	int
    //   0	130	2	paramIBinder	IBinder
    //   0	130	3	paramBundle	android.os.Bundle
    //   3	120	4	localParcel1	android.os.Parcel
    //   8	110	5	localParcel2	android.os.Parcel
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
  
  /* Error */
  public void zzb(int paramInt, android.os.Bundle paramBundle)
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
    //   20: iload_1
    //   21: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   24: aload_2
    //   25: ifnull +62 -> 87
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 41	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/common/internal/zzr$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_2
    //   56: istore 7
    //   58: aload 5
    //   60: iload 7
    //   62: aload_3
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 47 5 0
    //   71: pop
    //   72: aload 4
    //   74: invokevirtual 50	android/os/Parcel:readException	()V
    //   77: aload 4
    //   79: invokevirtual 53	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 53	android/os/Parcel:recycle	()V
    //   86: return
    //   87: iconst_0
    //   88: istore 6
    //   90: aconst_null
    //   91: astore 5
    //   93: aload_3
    //   94: iconst_0
    //   95: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   98: goto -49 -> 49
    //   101: astore 5
    //   103: aload 4
    //   105: invokevirtual 53	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: invokevirtual 53	android/os/Parcel:recycle	()V
    //   112: aload 5
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zza
    //   0	115	1	paramInt	int
    //   0	115	2	paramBundle	android.os.Bundle
    //   3	106	3	localParcel1	android.os.Parcel
    //   7	97	4	localParcel2	android.os.Parcel
    //   11	81	5	localObject1	Object
    //   101	12	5	localObject2	Object
    //   29	60	6	i	int
    //   56	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	101	finally
    //   20	24	101	finally
    //   32	37	101	finally
    //   45	49	101	finally
    //   49	53	101	finally
    //   65	72	101	finally
    //   72	77	101	finally
    //   94	98	101	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzr$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */