package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.server.response.SafeParcelResponse;

class zzb$zza$zza
  implements zzb
{
  private IBinder zzoz;
  
  zzb$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramBundle1 != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle1.writeToParcel(localParcel1, 0);
          if (paramBundle2 != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle2.writeToParcel(localParcel1, 0);
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
  
  public void zza(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramParcelFileDescriptor != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramParcelFileDescriptor.writeToParcel(localParcel1, 0);
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
  
  public void zza(int paramInt, Bundle paramBundle, SafeParcelResponse paramSafeParcelResponse)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramSafeParcelResponse != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramSafeParcelResponse.writeToParcel(localParcel1, 0);
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
  public void zza(int paramInt, com.google.android.gms.plus.internal.model.people.PersonEntity paramPersonEntity)
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
    //   25: ifnull +63 -> 88
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
    //   46: invokevirtual 60	com/google/android/gms/plus/internal/model/people/PersonEntity:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/plus/internal/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 9
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 43 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 46	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 49	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 49	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 49	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	zza
    //   0	116	1	paramInt	int
    //   0	116	2	paramPersonEntity	com.google.android.gms.plus.internal.model.people.PersonEntity
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  /* Error */
  public void zza(com.google.android.gms.common.data.DataHolder paramDataHolder, String paramString)
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
    //   29: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 64	com/google/android/gms/common/data/DataHolder:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/plus/internal/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_4
    //   56: istore 7
    //   58: aload 5
    //   60: iload 7
    //   62: aload_3
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 43 5 0
    //   71: pop
    //   72: aload 4
    //   74: invokevirtual 46	android/os/Parcel:readException	()V
    //   77: aload 4
    //   79: invokevirtual 49	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 49	android/os/Parcel:recycle	()V
    //   86: return
    //   87: iconst_0
    //   88: istore 6
    //   90: aconst_null
    //   91: astore 5
    //   93: aload_3
    //   94: iconst_0
    //   95: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   98: goto -54 -> 44
    //   101: astore 5
    //   103: aload 4
    //   105: invokevirtual 49	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: invokevirtual 49	android/os/Parcel:recycle	()V
    //   112: aload 5
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zza
    //   0	115	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
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
  public void zza(com.google.android.gms.common.data.DataHolder paramDataHolder, String paramString1, String paramString2)
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
    //   21: aload_1
    //   22: ifnull +79 -> 101
    //   25: iconst_1
    //   26: istore 7
    //   28: aload 4
    //   30: iload 7
    //   32: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 7
    //   38: aconst_null
    //   39: astore 6
    //   41: aload_1
    //   42: aload 4
    //   44: iconst_0
    //   45: invokevirtual 64	com/google/android/gms/common/data/DataHolder:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 4
    //   50: aload_2
    //   51: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 4
    //   56: aload_3
    //   57: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/plus/internal/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: astore 6
    //   66: bipush 6
    //   68: istore 8
    //   70: aload 6
    //   72: iload 8
    //   74: aload 4
    //   76: aload 5
    //   78: iconst_0
    //   79: invokeinterface 43 5 0
    //   84: pop
    //   85: aload 5
    //   87: invokevirtual 46	android/os/Parcel:readException	()V
    //   90: aload 5
    //   92: invokevirtual 49	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 49	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 7
    //   104: aconst_null
    //   105: astore 6
    //   107: aload 4
    //   109: iconst_0
    //   110: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   113: goto -65 -> 48
    //   116: astore 6
    //   118: aload 5
    //   120: invokevirtual 49	android/os/Parcel:recycle	()V
    //   123: aload 4
    //   125: invokevirtual 49	android/os/Parcel:recycle	()V
    //   128: aload 6
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	zza
    //   0	131	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   0	131	2	paramString1	String
    //   0	131	3	paramString2	String
    //   3	121	4	localParcel1	Parcel
    //   8	111	5	localParcel2	Parcel
    //   12	94	6	localObject1	Object
    //   116	13	6	localObject2	Object
    //   26	77	7	i	int
    //   68	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	116	finally
    //   30	35	116	finally
    //   44	48	116	finally
    //   50	54	116	finally
    //   56	60	116	finally
    //   60	64	116	finally
    //   78	85	116	finally
    //   85	90	116	finally
    //   109	113	116	finally
  }
  
  /* Error */
  public void zzbe(com.google.android.gms.common.api.Status paramStatus)
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
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 72	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/plus/internal/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 10
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 43 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 46	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 49	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 49	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 49	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramStatus	com.google.android.gms.common.api.Status
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
  
  public void zzfE(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 3;
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
  
  public void zzfF(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 8;
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
  
  /* Error */
  public void zzi(int paramInt, Bundle paramBundle)
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
    //   25: ifnull +63 -> 88
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
    //   50: getfield 14	com/google/android/gms/plus/internal/zzb$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 7
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 43 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 46	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 49	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 49	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 49	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	zza
    //   0	116	1	paramInt	int
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzb$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */