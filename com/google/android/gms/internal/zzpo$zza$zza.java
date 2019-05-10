package com.google.android.gms.internal;

import android.os.IBinder;

class zzpo$zza$zza
  implements zzpo
{
  private IBinder zzoz;
  
  zzpo$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zzh(int paramInt, android.os.Bundle paramBundle)
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
    //   46: invokevirtual 37	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/internal/zzpo$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_2
    //   56: istore 7
    //   58: aload 5
    //   60: iload 7
    //   62: aload_3
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 44 5 0
    //   71: pop
    //   72: aload 4
    //   74: invokevirtual 47	android/os/Parcel:readException	()V
    //   77: aload 4
    //   79: invokevirtual 50	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 50	android/os/Parcel:recycle	()V
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
    //   105: invokevirtual 50	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: invokevirtual 50	android/os/Parcel:recycle	()V
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpo$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */