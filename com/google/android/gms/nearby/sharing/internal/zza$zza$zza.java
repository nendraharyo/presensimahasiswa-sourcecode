package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;

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
  
  /* Error */
  public void zza(com.google.android.gms.nearby.sharing.AppContentReceivedResult paramAppContentReceivedResult)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 37	com/google/android/gms/nearby/sharing/AppContentReceivedResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/nearby/sharing/internal/zza$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_2
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 44 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 47	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 47	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	zza
    //   0	85	1	paramAppContentReceivedResult	com.google.android.gms.nearby.sharing.AppContentReceivedResult
    //   3	77	2	localParcel	Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
  
  public String zzfC(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.sharing.internal.IAppContentReceiver";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zza$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */