package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

class zzg$zza$zza
  implements zzg
{
  private IBinder zzoz;
  
  zzg$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramGoogleSignInAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramGoogleSignInAccount.writeToParcel(localParcel1, 0);
          if (paramStatus != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramStatus.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 101;
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
  
  public void zza(Status paramStatus, SignInAccount paramSignInAccount)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
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
          if (paramSignInAccount != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramSignInAccount.writeToParcel(localParcel1, 0);
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
  public void zza(Status paramStatus, String paramString1, String paramString2, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: ldc 22
    //   12: astore 8
    //   14: aload 6
    //   16: aload 8
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +85 -> 107
    //   25: iconst_1
    //   26: istore 9
    //   28: aload 6
    //   30: iload 9
    //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 9
    //   38: aconst_null
    //   39: astore 8
    //   41: aload_1
    //   42: aload 6
    //   44: iconst_0
    //   45: invokevirtual 40	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 6
    //   50: aload_2
    //   51: invokevirtual 59	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 6
    //   56: aload_3
    //   57: invokevirtual 59	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload 6
    //   62: lload 4
    //   64: invokevirtual 63	android/os/Parcel:writeLong	(J)V
    //   67: aload_0
    //   68: getfield 14	com/google/android/gms/auth/api/signin/internal/zzg$zza$zza:zzoz	Landroid/os/IBinder;
    //   71: astore 8
    //   73: iconst_3
    //   74: istore 10
    //   76: aload 8
    //   78: iload 10
    //   80: aload 6
    //   82: aload 7
    //   84: iconst_0
    //   85: invokeinterface 47 5 0
    //   90: pop
    //   91: aload 7
    //   93: invokevirtual 50	android/os/Parcel:readException	()V
    //   96: aload 7
    //   98: invokevirtual 53	android/os/Parcel:recycle	()V
    //   101: aload 6
    //   103: invokevirtual 53	android/os/Parcel:recycle	()V
    //   106: return
    //   107: iconst_0
    //   108: istore 9
    //   110: aconst_null
    //   111: astore 8
    //   113: aload 6
    //   115: iconst_0
    //   116: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   119: goto -71 -> 48
    //   122: astore 8
    //   124: aload 7
    //   126: invokevirtual 53	android/os/Parcel:recycle	()V
    //   129: aload 6
    //   131: invokevirtual 53	android/os/Parcel:recycle	()V
    //   134: aload 8
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramStatus	Status
    //   0	137	2	paramString1	String
    //   0	137	3	paramString2	String
    //   0	137	4	paramLong	long
    //   3	127	6	localParcel1	Parcel
    //   8	117	7	localParcel2	Parcel
    //   12	100	8	localObject1	Object
    //   122	13	8	localObject2	Object
    //   26	83	9	i	int
    //   74	5	10	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	122	finally
    //   30	35	122	finally
    //   44	48	122	finally
    //   50	54	122	finally
    //   56	60	122	finally
    //   62	67	122	finally
    //   67	71	122	finally
    //   84	91	122	finally
    //   91	96	122	finally
    //   115	119	122	finally
  }
  
  /* Error */
  public void zzk(Status paramStatus)
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
    //   40: invokevirtual 40	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/auth/api/signin/internal/zzg$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_2
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 47 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 50	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 53	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 53	android/os/Parcel:recycle	()V
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
    //   95: invokevirtual 53	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 53	android/os/Parcel:recycle	()V
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
  
  /* Error */
  public void zzl(Status paramStatus)
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
    //   19: ifnull +60 -> 79
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
    //   40: invokevirtual 40	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/auth/api/signin/internal/zzg$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 102
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 47 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 50	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 53	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 53	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 53	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 53	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramStatus	Status
    //   3	97	2	localParcel1	Parcel
    //   7	89	3	localParcel2	Parcel
    //   10	74	4	localObject1	Object
    //   93	11	4	localObject2	Object
    //   23	58	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	93	finally
    //   26	31	93	finally
    //   39	43	93	finally
    //   43	47	93	finally
    //   59	66	93	finally
    //   66	70	93	finally
    //   86	90	93	finally
  }
  
  /* Error */
  public void zzm(Status paramStatus)
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
    //   19: ifnull +60 -> 79
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
    //   40: invokevirtual 40	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/auth/api/signin/internal/zzg$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 103
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 47 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 50	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 53	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 53	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 53	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 53	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramStatus	Status
    //   3	97	2	localParcel1	Parcel
    //   7	89	3	localParcel2	Parcel
    //   10	74	4	localObject1	Object
    //   93	11	4	localObject2	Object
    //   23	58	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	93	finally
    //   26	31	93	finally
    //   39	43	93	finally
    //   43	47	93	finally
    //   59	66	93	finally
    //   66	70	93	finally
    //   86	90	93	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzg$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */