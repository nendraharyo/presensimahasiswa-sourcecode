package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

class zzi$zza$zza
  implements zzi
{
  private IBinder zzoz;
  
  zzi$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(Status paramStatus, Credential paramCredential)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramStatus != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramStatus.writeToParcel(localParcel1, 0);
          if (paramCredential != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramCredential.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 1;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public void zza(Status paramStatus, String paramString)
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
    //   19: aload_1
    //   20: ifnull +67 -> 87
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 55	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_3
    //   56: istore 7
    //   58: aload 5
    //   60: iload 7
    //   62: aload_3
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 46 5 0
    //   71: pop
    //   72: aload 4
    //   74: invokevirtual 49	android/os/Parcel:readException	()V
    //   77: aload 4
    //   79: invokevirtual 52	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 52	android/os/Parcel:recycle	()V
    //   86: return
    //   87: iconst_0
    //   88: istore 6
    //   90: aconst_null
    //   91: astore 5
    //   93: aload_3
    //   94: iconst_0
    //   95: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   98: goto -54 -> 44
    //   101: astore 5
    //   103: aload 4
    //   105: invokevirtual 52	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: invokevirtual 52	android/os/Parcel:recycle	()V
    //   112: aload 5
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zza
    //   0	115	1	paramStatus	Status
    //   0	115	2	paramString	String
    //   3	106	3	localParcel1	Parcel
    //   7	97	4	localParcel2	Parcel
    //   11	81	5	localObject1	Object
    //   101	12	5	localObject2	Object
    //   24	65	6	i	int
    //   56	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	101	finally
    //   27	32	101	finally
    //   40	44	101	finally
    //   45	49	101	finally
    //   49	53	101	finally
    //   65	72	101	finally
    //   72	77	101	finally
    //   94	98	101	finally
  }
  
  /* Error */
  public void zzg(Status paramStatus)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_2
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 46 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 49	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 52	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 52	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 52	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 52	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramStatus	Status
    //   3	96	2	localParcel1	Parcel
    //   7	88	3	localParcel2	Parcel
    //   10	73	4	localObject1	Object
    //   92	11	4	localObject2	Object
    //   23	57	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	92	finally
    //   26	31	92	finally
    //   39	43	92	finally
    //   43	47	92	finally
    //   58	65	92	finally
    //   65	69	92	finally
    //   85	89	92	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzi$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */