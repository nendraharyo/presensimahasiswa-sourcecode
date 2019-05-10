package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;

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
  
  public void disconnect()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 7
    //   8: ldc 22
    //   10: astore 8
    //   12: aload 7
    //   14: aload 8
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload 7
    //   21: dload_1
    //   22: invokevirtual 40	android/os/Parcel:writeDouble	(D)V
    //   25: aload 7
    //   27: dload_3
    //   28: invokevirtual 40	android/os/Parcel:writeDouble	(D)V
    //   31: iload 5
    //   33: ifeq +44 -> 77
    //   36: aload 7
    //   38: iload 6
    //   40: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/cast/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 9
    //   49: bipush 7
    //   51: istore 10
    //   53: iconst_1
    //   54: istore 11
    //   56: aload 9
    //   58: iload 10
    //   60: aload 7
    //   62: aconst_null
    //   63: iload 11
    //   65: invokeinterface 33 5 0
    //   70: pop
    //   71: aload 7
    //   73: invokevirtual 36	android/os/Parcel:recycle	()V
    //   76: return
    //   77: iconst_0
    //   78: istore 6
    //   80: aconst_null
    //   81: astore 9
    //   83: goto -47 -> 36
    //   86: astore 9
    //   88: aload 7
    //   90: invokevirtual 36	android/os/Parcel:recycle	()V
    //   93: aload 9
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	zza
    //   0	96	1	paramDouble1	double
    //   0	96	3	paramDouble2	double
    //   0	96	5	paramBoolean	boolean
    //   1	78	6	i	int
    //   6	83	7	localParcel	Parcel
    //   10	5	8	str	String
    //   47	35	9	localIBinder	IBinder
    //   86	8	9	localObject	Object
    //   51	8	10	j	int
    //   54	10	11	k	int
    // Exception table:
    //   from	to	target	type
    //   14	19	86	finally
    //   21	25	86	finally
    //   27	31	86	finally
    //   38	43	86	finally
    //   43	47	86	finally
    //   63	71	86	finally
  }
  
  /* Error */
  public void zza(String paramString, com.google.android.gms.cast.LaunchOptions paramLaunchOptions)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: ldc 22
    //   6: astore 4
    //   8: aload_3
    //   9: aload 4
    //   11: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_3
    //   15: aload_1
    //   16: invokevirtual 48	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: ifnull +56 -> 76
    //   23: iconst_1
    //   24: istore 5
    //   26: aload_3
    //   27: iload 5
    //   29: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 5
    //   35: aconst_null
    //   36: astore 4
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 54	com/google/android/gms/cast/LaunchOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/cast/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   48: astore 4
    //   50: bipush 13
    //   52: istore 6
    //   54: iconst_1
    //   55: istore 7
    //   57: aload 4
    //   59: iload 6
    //   61: aload_3
    //   62: aconst_null
    //   63: iload 7
    //   65: invokeinterface 33 5 0
    //   70: pop
    //   71: aload_3
    //   72: invokevirtual 36	android/os/Parcel:recycle	()V
    //   75: return
    //   76: iconst_0
    //   77: istore 5
    //   79: aconst_null
    //   80: astore 4
    //   82: aload_3
    //   83: iconst_0
    //   84: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   87: goto -43 -> 44
    //   90: astore 4
    //   92: aload_3
    //   93: invokevirtual 36	android/os/Parcel:recycle	()V
    //   96: aload 4
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	zza
    //   0	99	1	paramString	String
    //   0	99	2	paramLaunchOptions	com.google.android.gms.cast.LaunchOptions
    //   3	90	3	localParcel	Parcel
    //   6	75	4	localObject1	Object
    //   90	7	4	localObject2	Object
    //   24	54	5	i	int
    //   52	8	6	j	int
    //   55	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   9	14	90	finally
    //   15	19	90	finally
    //   27	32	90	finally
    //   40	44	90	finally
    //   44	48	90	finally
    //   63	71	90	finally
    //   83	87	90	finally
  }
  
  /* Error */
  public void zza(String paramString1, String paramString2, com.google.android.gms.cast.JoinOptions paramJoinOptions)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: aload 4
    //   11: aload 5
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload 4
    //   18: aload_1
    //   19: invokevirtual 48	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   22: aload 4
    //   24: aload_2
    //   25: invokevirtual 48	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: ifnull +60 -> 89
    //   32: iconst_1
    //   33: istore 6
    //   35: aload 4
    //   37: iload 6
    //   39: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   42: iconst_0
    //   43: istore 6
    //   45: aconst_null
    //   46: astore 5
    //   48: aload_3
    //   49: aload 4
    //   51: iconst_0
    //   52: invokevirtual 58	com/google/android/gms/cast/JoinOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   55: aload_0
    //   56: getfield 14	com/google/android/gms/cast/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   59: astore 5
    //   61: bipush 14
    //   63: istore 7
    //   65: iconst_1
    //   66: istore 8
    //   68: aload 5
    //   70: iload 7
    //   72: aload 4
    //   74: aconst_null
    //   75: iload 8
    //   77: invokeinterface 33 5 0
    //   82: pop
    //   83: aload 4
    //   85: invokevirtual 36	android/os/Parcel:recycle	()V
    //   88: return
    //   89: iconst_0
    //   90: istore 6
    //   92: aconst_null
    //   93: astore 5
    //   95: aload 4
    //   97: iconst_0
    //   98: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   101: goto -46 -> 55
    //   104: astore 5
    //   106: aload 4
    //   108: invokevirtual 36	android/os/Parcel:recycle	()V
    //   111: aload 5
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	zza
    //   0	114	1	paramString1	String
    //   0	114	2	paramString2	String
    //   0	114	3	paramJoinOptions	com.google.android.gms.cast.JoinOptions
    //   3	104	4	localParcel	Parcel
    //   7	87	5	localObject1	Object
    //   104	8	5	localObject2	Object
    //   33	58	6	i	int
    //   63	8	7	j	int
    //   66	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	104	finally
    //   18	22	104	finally
    //   24	28	104	finally
    //   37	42	104	finally
    //   51	55	104	finally
    //   55	59	104	finally
    //   75	83	104	finally
    //   97	101	104	finally
  }
  
  public void zza(String paramString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localParcel.writeByteArray(paramArrayOfByte);
      localParcel.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 10;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zza(boolean paramBoolean1, double paramDouble, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_1
    //   4: istore 6
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 7
    //   11: ldc 22
    //   13: astore 8
    //   15: aload 7
    //   17: aload 8
    //   19: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   22: iload_1
    //   23: ifeq +72 -> 95
    //   26: iload 6
    //   28: istore 9
    //   30: aload 7
    //   32: iload 9
    //   34: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   37: aload 7
    //   39: dload_2
    //   40: invokevirtual 40	android/os/Parcel:writeDouble	(D)V
    //   43: iload 4
    //   45: ifeq +59 -> 104
    //   48: aload 7
    //   50: iload 6
    //   52: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   55: aload_0
    //   56: getfield 14	com/google/android/gms/cast/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   59: astore 10
    //   61: bipush 8
    //   63: istore 5
    //   65: iconst_0
    //   66: istore 9
    //   68: aconst_null
    //   69: astore 8
    //   71: iconst_1
    //   72: istore 11
    //   74: aload 10
    //   76: iload 5
    //   78: aload 7
    //   80: aconst_null
    //   81: iload 11
    //   83: invokeinterface 33 5 0
    //   88: pop
    //   89: aload 7
    //   91: invokevirtual 36	android/os/Parcel:recycle	()V
    //   94: return
    //   95: iconst_0
    //   96: istore 9
    //   98: aconst_null
    //   99: astore 8
    //   101: goto -71 -> 30
    //   104: iconst_0
    //   105: istore 6
    //   107: aconst_null
    //   108: astore 10
    //   110: goto -62 -> 48
    //   113: astore 10
    //   115: aload 7
    //   117: invokevirtual 36	android/os/Parcel:recycle	()V
    //   120: aload 10
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	zza
    //   0	123	1	paramBoolean1	boolean
    //   0	123	2	paramDouble	double
    //   0	123	4	paramBoolean2	boolean
    //   1	76	5	i	int
    //   4	102	6	j	int
    //   9	107	7	localParcel	Parcel
    //   13	87	8	str	String
    //   28	69	9	k	int
    //   59	50	10	localIBinder	IBinder
    //   113	8	10	localObject	Object
    //   72	10	11	m	int
    // Exception table:
    //   from	to	target	type
    //   17	22	113	finally
    //   32	37	113	finally
    //   39	43	113	finally
    //   50	55	113	finally
    //   55	59	113	finally
    //   81	89	113	finally
  }
  
  public void zzb(String paramString1, String paramString2, long paramLong)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      localParcel.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 9;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzck(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 5;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzcl(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 11;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzcm(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 12;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void zzj(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: ldc 22
    //   9: astore 5
    //   11: aload 4
    //   13: aload 5
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload 4
    //   20: aload_1
    //   21: invokevirtual 48	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: iload_2
    //   25: ifeq +42 -> 67
    //   28: aload 4
    //   30: iload_3
    //   31: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   34: aload_0
    //   35: getfield 14	com/google/android/gms/cast/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   38: astore 6
    //   40: iconst_2
    //   41: istore 7
    //   43: iconst_1
    //   44: istore 8
    //   46: aload 6
    //   48: iload 7
    //   50: aload 4
    //   52: aconst_null
    //   53: iload 8
    //   55: invokeinterface 33 5 0
    //   60: pop
    //   61: aload 4
    //   63: invokevirtual 36	android/os/Parcel:recycle	()V
    //   66: return
    //   67: iconst_0
    //   68: istore_3
    //   69: aconst_null
    //   70: astore 6
    //   72: goto -44 -> 28
    //   75: astore 6
    //   77: aload 4
    //   79: invokevirtual 36	android/os/Parcel:recycle	()V
    //   82: aload 6
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	zza
    //   0	85	1	paramString	String
    //   0	85	2	paramBoolean	boolean
    //   1	68	3	i	int
    //   5	73	4	localParcel	Parcel
    //   9	5	5	str	String
    //   38	33	6	localIBinder	IBinder
    //   75	8	6	localObject	Object
    //   41	8	7	j	int
    //   44	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   13	18	75	finally
    //   20	24	75	finally
    //   30	34	75	finally
    //   34	38	75	finally
    //   53	61	75	finally
  }
  
  public void zzoj()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 6;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzou()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 4;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzu(String paramString1, String paramString2)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzi$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */