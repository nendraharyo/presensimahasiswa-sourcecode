package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzt;

class zze$zza$zza
  implements zze
{
  private IBinder zzoz;
  
  zze$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(int paramInt, Account paramAccount, zzd paramzzd)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccount.writeToParcel(localParcel1, 0);
        }
        while (paramzzd != null)
        {
          localObject1 = paramzzd.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 8;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(AuthAccountRequest paramAuthAccountRequest, zzd paramzzd)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAuthAccountRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAuthAccountRequest.writeToParcel(localParcel1, 0);
        }
        while (paramzzd != null)
        {
          localObject1 = paramzzd.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 2;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(ResolveAccountRequest paramResolveAccountRequest, zzt paramzzt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramResolveAccountRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramResolveAccountRequest.writeToParcel(localParcel1, 0);
        }
        while (paramzzt != null)
        {
          localObject1 = paramzzt.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 5;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zza(com.google.android.gms.common.internal.zzp paramzzp, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 6
    //   11: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 7
    //   16: ldc 22
    //   18: astore 8
    //   20: aload 6
    //   22: aload 8
    //   24: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: ifnull +79 -> 107
    //   31: aload_1
    //   32: invokeinterface 74 1 0
    //   37: astore 8
    //   39: aload 6
    //   41: aload 8
    //   43: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload 6
    //   48: iload_2
    //   49: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   52: iload_3
    //   53: ifeq +6 -> 59
    //   56: iconst_1
    //   57: istore 4
    //   59: aload 6
    //   61: iload 4
    //   63: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/signin/internal/zze$zza$zza:zzoz	Landroid/os/IBinder;
    //   70: astore 5
    //   72: bipush 9
    //   74: istore 9
    //   76: aload 5
    //   78: iload 9
    //   80: aload 6
    //   82: aload 7
    //   84: iconst_0
    //   85: invokeinterface 54 5 0
    //   90: pop
    //   91: aload 7
    //   93: invokevirtual 57	android/os/Parcel:readException	()V
    //   96: aload 7
    //   98: invokevirtual 60	android/os/Parcel:recycle	()V
    //   101: aload 6
    //   103: invokevirtual 60	android/os/Parcel:recycle	()V
    //   106: return
    //   107: iconst_0
    //   108: istore 9
    //   110: aconst_null
    //   111: astore 8
    //   113: goto -74 -> 39
    //   116: astore 5
    //   118: aload 7
    //   120: invokevirtual 60	android/os/Parcel:recycle	()V
    //   123: aload 6
    //   125: invokevirtual 60	android/os/Parcel:recycle	()V
    //   128: aload 5
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	zza
    //   0	131	1	paramzzp	com.google.android.gms.common.internal.zzp
    //   0	131	2	paramInt	int
    //   0	131	3	paramBoolean	boolean
    //   1	61	4	i	int
    //   4	73	5	localIBinder	IBinder
    //   116	13	5	localObject1	Object
    //   9	115	6	localParcel1	Parcel
    //   14	105	7	localParcel2	Parcel
    //   18	94	8	localObject2	Object
    //   74	35	9	j	int
    // Exception table:
    //   from	to	target	type
    //   22	27	116	finally
    //   31	37	116	finally
    //   41	46	116	finally
    //   48	52	116	finally
    //   61	66	116	finally
    //   66	70	116	finally
    //   84	91	116	finally
    //   91	96	116	finally
  }
  
  /* Error */
  public void zza(CheckServerAuthResult paramCheckServerAuthResult)
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
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 78	com/google/android/gms/signin/internal/CheckServerAuthResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/signin/internal/zze$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_3
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 54 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 57	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 60	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 60	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 60	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 60	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramCheckServerAuthResult	CheckServerAuthResult
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
  
  public void zza(RecordConsentRequest paramRecordConsentRequest, zzd paramzzd)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramRecordConsentRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramRecordConsentRequest.writeToParcel(localParcel1, 0);
        }
        while (paramzzd != null)
        {
          localObject1 = paramzzd.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 10;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(SignInRequest paramSignInRequest, zzd paramzzd)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramSignInRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramSignInRequest.writeToParcel(localParcel1, 0);
        }
        while (paramzzd != null)
        {
          localObject1 = paramzzd.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 12;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zzav(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.signin.internal.ISignInService";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.zzoz;
      int j = 4;
      localIBinder.transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void zzb(zzd paramzzd)
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
    //   19: ifnull +53 -> 72
    //   22: aload_1
    //   23: invokeinterface 43 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/signin/internal/zze$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 11
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 54 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 57	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 60	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 60	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 60	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 60	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	zza
    //   0	91	1	paramzzd	zzd
    //   3	82	2	localParcel1	Parcel
    //   7	74	3	localParcel2	Parcel
    //   10	64	4	localObject1	Object
    //   78	11	4	localObject2	Object
    //   44	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	78	finally
    //   22	28	78	finally
    //   31	36	78	finally
    //   36	40	78	finally
    //   52	59	78	finally
    //   59	63	78	finally
  }
  
  public void zzka(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 7;
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zze$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */