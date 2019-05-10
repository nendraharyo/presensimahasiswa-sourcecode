package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

class zzsc$zza$zza
  implements zzsc
{
  private IBinder zzoz;
  
  zzsc$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramFullWallet != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramFullWallet.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 2;
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
  
  public void zza(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramMaskedWallet != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramMaskedWallet.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
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
  public void zza(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 6
    //   11: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 7
    //   16: ldc 22
    //   18: astore 8
    //   20: aload 6
    //   22: aload 8
    //   24: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload 6
    //   29: iload_1
    //   30: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   33: iload_2
    //   34: ifeq +80 -> 114
    //   37: aload 6
    //   39: iload 4
    //   41: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   44: aload_3
    //   45: ifnull +78 -> 123
    //   48: iconst_1
    //   49: istore 4
    //   51: aload 6
    //   53: iload 4
    //   55: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   58: iconst_0
    //   59: istore 4
    //   61: aconst_null
    //   62: astore 9
    //   64: aload_3
    //   65: aload 6
    //   67: iconst_0
    //   68: invokevirtual 40	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   71: aload_0
    //   72: getfield 14	com/google/android/gms/internal/zzsc$zza$zza:zzoz	Landroid/os/IBinder;
    //   75: astore 9
    //   77: iconst_3
    //   78: istore 5
    //   80: aconst_null
    //   81: astore 8
    //   83: aload 9
    //   85: iload 5
    //   87: aload 6
    //   89: aload 7
    //   91: iconst_0
    //   92: invokeinterface 47 5 0
    //   97: pop
    //   98: aload 7
    //   100: invokevirtual 50	android/os/Parcel:readException	()V
    //   103: aload 7
    //   105: invokevirtual 53	android/os/Parcel:recycle	()V
    //   108: aload 6
    //   110: invokevirtual 53	android/os/Parcel:recycle	()V
    //   113: return
    //   114: iconst_0
    //   115: istore 4
    //   117: aconst_null
    //   118: astore 9
    //   120: goto -83 -> 37
    //   123: iconst_0
    //   124: istore 4
    //   126: aconst_null
    //   127: astore 9
    //   129: aload 6
    //   131: iconst_0
    //   132: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   135: goto -64 -> 71
    //   138: astore 9
    //   140: aload 7
    //   142: invokevirtual 53	android/os/Parcel:recycle	()V
    //   145: aload 6
    //   147: invokevirtual 53	android/os/Parcel:recycle	()V
    //   150: aload 9
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	zza
    //   0	153	1	paramInt	int
    //   0	153	2	paramBoolean	boolean
    //   0	153	3	paramBundle	Bundle
    //   1	124	4	i	int
    //   4	82	5	j	int
    //   9	137	6	localParcel1	Parcel
    //   14	127	7	localParcel2	Parcel
    //   18	64	8	str	String
    //   62	66	9	localIBinder	IBinder
    //   138	13	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	27	138	finally
    //   29	33	138	finally
    //   39	44	138	finally
    //   53	58	138	finally
    //   67	71	138	finally
    //   71	75	138	finally
    //   91	98	138	finally
    //   98	103	138	finally
    //   131	135	138	finally
  }
  
  public void zza(Status paramStatus, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
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
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 8;
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
  
  public void zza(Status paramStatus, GetBuyFlowInitializationTokenResponse paramGetBuyFlowInitializationTokenResponse, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
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
          if (paramGetBuyFlowInitializationTokenResponse != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramGetBuyFlowInitializationTokenResponse.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label188;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 7;
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
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label188:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(Status paramStatus, GetInstrumentsResponse paramGetInstrumentsResponse, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
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
          if (paramGetInstrumentsResponse != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramGetInstrumentsResponse.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label187;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 5;
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
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label187:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle)
  {
    int i = 1;
    int j = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken(str);
        int k;
        if (paramStatus != null)
        {
          k = 1;
          localParcel1.writeInt(k);
          k = 0;
          str = null;
          paramStatus.writeToParcel(localParcel1, 0);
          if (paramBoolean)
          {
            localParcel1.writeInt(i);
            if (paramBundle == null) {
              break label178;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            IBinder localIBinder = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localIBinder = this.zzoz;
            j = 9;
            k = 0;
            str = null;
            localIBinder.transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          k = 0;
          str = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject2 = null;
      continue;
      label178:
      i = 0;
      localObject2 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public void zzb(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 6
    //   11: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 7
    //   16: ldc 22
    //   18: astore 8
    //   20: aload 6
    //   22: aload 8
    //   24: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload 6
    //   29: iload_1
    //   30: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   33: iload_2
    //   34: ifeq +81 -> 115
    //   37: aload 6
    //   39: iload 4
    //   41: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   44: aload_3
    //   45: ifnull +79 -> 124
    //   48: iconst_1
    //   49: istore 4
    //   51: aload 6
    //   53: iload 4
    //   55: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   58: iconst_0
    //   59: istore 4
    //   61: aconst_null
    //   62: astore 9
    //   64: aload_3
    //   65: aload 6
    //   67: iconst_0
    //   68: invokevirtual 40	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   71: aload_0
    //   72: getfield 14	com/google/android/gms/internal/zzsc$zza$zza:zzoz	Landroid/os/IBinder;
    //   75: astore 9
    //   77: bipush 6
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 8
    //   84: aload 9
    //   86: iload 5
    //   88: aload 6
    //   90: aload 7
    //   92: iconst_0
    //   93: invokeinterface 47 5 0
    //   98: pop
    //   99: aload 7
    //   101: invokevirtual 50	android/os/Parcel:readException	()V
    //   104: aload 7
    //   106: invokevirtual 53	android/os/Parcel:recycle	()V
    //   109: aload 6
    //   111: invokevirtual 53	android/os/Parcel:recycle	()V
    //   114: return
    //   115: iconst_0
    //   116: istore 4
    //   118: aconst_null
    //   119: astore 9
    //   121: goto -84 -> 37
    //   124: iconst_0
    //   125: istore 4
    //   127: aconst_null
    //   128: astore 9
    //   130: aload 6
    //   132: iconst_0
    //   133: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   136: goto -65 -> 71
    //   139: astore 9
    //   141: aload 7
    //   143: invokevirtual 53	android/os/Parcel:recycle	()V
    //   146: aload 6
    //   148: invokevirtual 53	android/os/Parcel:recycle	()V
    //   151: aload 9
    //   153: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	zza
    //   0	154	1	paramInt	int
    //   0	154	2	paramBoolean	boolean
    //   0	154	3	paramBundle	Bundle
    //   1	125	4	i	int
    //   4	83	5	j	int
    //   9	138	6	localParcel1	Parcel
    //   14	128	7	localParcel2	Parcel
    //   18	65	8	str	String
    //   62	67	9	localIBinder	IBinder
    //   139	13	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	27	139	finally
    //   29	33	139	finally
    //   39	44	139	finally
    //   53	58	139	finally
    //   67	71	139	finally
    //   71	75	139	finally
    //   92	99	139	finally
    //   99	104	139	finally
    //   132	136	139	finally
  }
  
  /* Error */
  public void zzj(int paramInt, Bundle paramBundle)
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
    //   46: invokevirtual 40	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/internal/zzsc$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_4
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
    //   0	115	2	paramBundle	Bundle
    //   3	106	3	localParcel1	Parcel
    //   7	97	4	localParcel2	Parcel
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */