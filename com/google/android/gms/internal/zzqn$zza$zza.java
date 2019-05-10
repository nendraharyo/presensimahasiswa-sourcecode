package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqn$zza$zza
  implements zzqn
{
  private IBinder zzoz;
  
  zzqn$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public String zzEk()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1016;
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
  
  public void zzF(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1014;
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
  public void zza(zzqm paramzzqm, int paramInt, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: ldc 22
    //   12: astore 9
    //   14: aload 7
    //   16: aload 9
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +79 -> 101
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 9
    //   33: aload 7
    //   35: aload 9
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 7
    //   42: iload_2
    //   43: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   46: aload 7
    //   48: lload_3
    //   49: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   52: aload 7
    //   54: lload 5
    //   56: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   59: aload_0
    //   60: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   63: astore 9
    //   65: sipush 1005
    //   68: istore 10
    //   70: aload 9
    //   72: iload 10
    //   74: aload 7
    //   76: aload 8
    //   78: iconst_0
    //   79: invokeinterface 33 5 0
    //   84: pop
    //   85: aload 8
    //   87: invokevirtual 36	android/os/Parcel:readException	()V
    //   90: aload 8
    //   92: invokevirtual 43	android/os/Parcel:recycle	()V
    //   95: aload 7
    //   97: invokevirtual 43	android/os/Parcel:recycle	()V
    //   100: return
    //   101: aconst_null
    //   102: astore 9
    //   104: goto -71 -> 33
    //   107: astore 9
    //   109: aload 8
    //   111: invokevirtual 43	android/os/Parcel:recycle	()V
    //   114: aload 7
    //   116: invokevirtual 43	android/os/Parcel:recycle	()V
    //   119: aload 9
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramzzqm	zzqm
    //   0	122	2	paramInt	int
    //   0	122	3	paramLong1	long
    //   0	122	5	paramLong2	long
    //   3	112	7	localParcel1	Parcel
    //   8	102	8	localParcel2	Parcel
    //   12	91	9	localObject1	Object
    //   107	13	9	localObject2	Object
    //   68	5	10	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	107	finally
    //   25	31	107	finally
    //   35	40	107	finally
    //   42	46	107	finally
    //   48	52	107	finally
    //   54	59	107	finally
    //   59	63	107	finally
    //   78	85	107	finally
    //   85	90	107	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: ldc 22
    //   12: astore 7
    //   14: aload 5
    //   16: aload 7
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +72 -> 94
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 7
    //   33: aload 5
    //   35: aload 7
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 5
    //   42: aload_2
    //   43: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 5
    //   48: lload_3
    //   49: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   56: astore 7
    //   58: sipush 1009
    //   61: istore 8
    //   63: aload 7
    //   65: iload 8
    //   67: aload 5
    //   69: aload 6
    //   71: iconst_0
    //   72: invokeinterface 33 5 0
    //   77: pop
    //   78: aload 6
    //   80: invokevirtual 36	android/os/Parcel:readException	()V
    //   83: aload 6
    //   85: invokevirtual 43	android/os/Parcel:recycle	()V
    //   88: aload 5
    //   90: invokevirtual 43	android/os/Parcel:recycle	()V
    //   93: return
    //   94: aconst_null
    //   95: astore 7
    //   97: goto -64 -> 33
    //   100: astore 7
    //   102: aload 6
    //   104: invokevirtual 43	android/os/Parcel:recycle	()V
    //   107: aload 5
    //   109: invokevirtual 43	android/os/Parcel:recycle	()V
    //   112: aload 7
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zza
    //   0	115	1	paramzzqm	zzqm
    //   0	115	2	paramString	String
    //   0	115	3	paramLong	long
    //   3	105	5	localParcel1	Parcel
    //   8	95	6	localParcel2	Parcel
    //   12	84	7	localObject1	Object
    //   100	13	7	localObject2	Object
    //   61	5	8	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	100	finally
    //   25	31	100	finally
    //   35	40	100	finally
    //   42	46	100	finally
    //   48	52	100	finally
    //   52	56	100	finally
    //   71	78	100	finally
    //   78	83	100	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: ldc 22
    //   12: astore 9
    //   14: aload 7
    //   16: aload 9
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +79 -> 101
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 9
    //   33: aload 7
    //   35: aload 9
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 7
    //   42: aload_2
    //   43: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 7
    //   48: lload_3
    //   49: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   52: aload 7
    //   54: lload 5
    //   56: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   59: aload_0
    //   60: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   63: astore 9
    //   65: sipush 1003
    //   68: istore 10
    //   70: aload 9
    //   72: iload 10
    //   74: aload 7
    //   76: aload 8
    //   78: iconst_0
    //   79: invokeinterface 33 5 0
    //   84: pop
    //   85: aload 8
    //   87: invokevirtual 36	android/os/Parcel:readException	()V
    //   90: aload 8
    //   92: invokevirtual 43	android/os/Parcel:recycle	()V
    //   95: aload 7
    //   97: invokevirtual 43	android/os/Parcel:recycle	()V
    //   100: return
    //   101: aconst_null
    //   102: astore 9
    //   104: goto -71 -> 33
    //   107: astore 9
    //   109: aload 8
    //   111: invokevirtual 43	android/os/Parcel:recycle	()V
    //   114: aload 7
    //   116: invokevirtual 43	android/os/Parcel:recycle	()V
    //   119: aload 9
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramzzqm	zzqm
    //   0	122	2	paramString	String
    //   0	122	3	paramLong1	long
    //   0	122	5	paramLong2	long
    //   3	112	7	localParcel1	Parcel
    //   8	102	8	localParcel2	Parcel
    //   12	91	9	localObject1	Object
    //   107	13	9	localObject2	Object
    //   68	5	10	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	107	finally
    //   25	31	107	finally
    //   35	40	107	finally
    //   42	46	107	finally
    //   48	52	107	finally
    //   54	59	107	finally
    //   59	63	107	finally
    //   78	85	107	finally
    //   85	90	107	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, com.google.android.gms.nearby.connection.AppMetadata paramAppMetadata, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 8
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 9
    //   10: ldc 22
    //   12: astore 10
    //   14: aload 8
    //   16: aload 10
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +107 -> 129
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 10
    //   33: aload 8
    //   35: aload 10
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 8
    //   42: aload_2
    //   43: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_3
    //   47: ifnull +91 -> 138
    //   50: iconst_1
    //   51: istore 11
    //   53: aload 8
    //   55: iload 11
    //   57: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   60: iconst_0
    //   61: istore 11
    //   63: aconst_null
    //   64: astore 10
    //   66: aload_3
    //   67: aload 8
    //   69: iconst_0
    //   70: invokevirtual 75	com/google/android/gms/nearby/connection/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   73: aload 8
    //   75: lload 4
    //   77: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   80: aload 8
    //   82: lload 6
    //   84: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   87: aload_0
    //   88: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   91: astore 10
    //   93: sipush 1001
    //   96: istore 12
    //   98: aload 10
    //   100: iload 12
    //   102: aload 8
    //   104: aload 9
    //   106: iconst_0
    //   107: invokeinterface 33 5 0
    //   112: pop
    //   113: aload 9
    //   115: invokevirtual 36	android/os/Parcel:readException	()V
    //   118: aload 9
    //   120: invokevirtual 43	android/os/Parcel:recycle	()V
    //   123: aload 8
    //   125: invokevirtual 43	android/os/Parcel:recycle	()V
    //   128: return
    //   129: iconst_0
    //   130: istore 11
    //   132: aconst_null
    //   133: astore 10
    //   135: goto -102 -> 33
    //   138: iconst_0
    //   139: istore 11
    //   141: aconst_null
    //   142: astore 10
    //   144: aload 8
    //   146: iconst_0
    //   147: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   150: goto -77 -> 73
    //   153: astore 10
    //   155: aload 9
    //   157: invokevirtual 43	android/os/Parcel:recycle	()V
    //   160: aload 8
    //   162: invokevirtual 43	android/os/Parcel:recycle	()V
    //   165: aload 10
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	zza
    //   0	168	1	paramzzqm	zzqm
    //   0	168	2	paramString	String
    //   0	168	3	paramAppMetadata	com.google.android.gms.nearby.connection.AppMetadata
    //   0	168	4	paramLong1	long
    //   0	168	6	paramLong2	long
    //   3	158	8	localParcel1	Parcel
    //   8	148	9	localParcel2	Parcel
    //   12	131	10	localObject1	Object
    //   153	13	10	localObject2	Object
    //   51	89	11	i	int
    //   96	5	12	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	153	finally
    //   25	31	153	finally
    //   35	40	153	finally
    //   42	46	153	finally
    //   55	60	153	finally
    //   69	73	153	finally
    //   75	80	153	finally
    //   82	87	153	finally
    //   87	91	153	finally
    //   106	113	153	finally
    //   113	118	153	finally
    //   146	150	153	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: ldc 22
    //   12: astore 9
    //   14: aload 7
    //   16: aload 9
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +86 -> 108
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 9
    //   33: aload 7
    //   35: aload 9
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 7
    //   42: aload_2
    //   43: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 7
    //   48: aload_3
    //   49: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   52: aload 7
    //   54: aload 4
    //   56: invokevirtual 80	android/os/Parcel:writeByteArray	([B)V
    //   59: aload 7
    //   61: lload 5
    //   63: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   70: astore 9
    //   72: sipush 1007
    //   75: istore 10
    //   77: aload 9
    //   79: iload 10
    //   81: aload 7
    //   83: aload 8
    //   85: iconst_0
    //   86: invokeinterface 33 5 0
    //   91: pop
    //   92: aload 8
    //   94: invokevirtual 36	android/os/Parcel:readException	()V
    //   97: aload 8
    //   99: invokevirtual 43	android/os/Parcel:recycle	()V
    //   102: aload 7
    //   104: invokevirtual 43	android/os/Parcel:recycle	()V
    //   107: return
    //   108: aconst_null
    //   109: astore 9
    //   111: goto -78 -> 33
    //   114: astore 9
    //   116: aload 8
    //   118: invokevirtual 43	android/os/Parcel:recycle	()V
    //   121: aload 7
    //   123: invokevirtual 43	android/os/Parcel:recycle	()V
    //   126: aload 9
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	zza
    //   0	129	1	paramzzqm	zzqm
    //   0	129	2	paramString1	String
    //   0	129	3	paramString2	String
    //   0	129	4	paramArrayOfByte	byte[]
    //   0	129	5	paramLong	long
    //   3	119	7	localParcel1	Parcel
    //   8	109	8	localParcel2	Parcel
    //   12	98	9	localObject1	Object
    //   114	13	9	localObject2	Object
    //   75	5	10	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	114	finally
    //   25	31	114	finally
    //   35	40	114	finally
    //   42	46	114	finally
    //   48	52	114	finally
    //   54	59	114	finally
    //   61	66	114	finally
    //   66	70	114	finally
    //   85	92	114	finally
    //   92	97	114	finally
  }
  
  /* Error */
  public void zza(zzqm paramzzqm, String paramString, byte[] paramArrayOfByte, long paramLong)
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
    //   22: ifnull +79 -> 101
    //   25: aload_1
    //   26: invokeinterface 54 1 0
    //   31: astore 8
    //   33: aload 6
    //   35: aload 8
    //   37: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 6
    //   42: aload_2
    //   43: invokevirtual 66	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 6
    //   48: aload_3
    //   49: invokevirtual 80	android/os/Parcel:writeByteArray	([B)V
    //   52: aload 6
    //   54: lload 4
    //   56: invokevirtual 47	android/os/Parcel:writeLong	(J)V
    //   59: aload_0
    //   60: getfield 14	com/google/android/gms/internal/zzqn$zza$zza:zzoz	Landroid/os/IBinder;
    //   63: astore 8
    //   65: sipush 1008
    //   68: istore 9
    //   70: aload 8
    //   72: iload 9
    //   74: aload 6
    //   76: aload 7
    //   78: iconst_0
    //   79: invokeinterface 33 5 0
    //   84: pop
    //   85: aload 7
    //   87: invokevirtual 36	android/os/Parcel:readException	()V
    //   90: aload 7
    //   92: invokevirtual 43	android/os/Parcel:recycle	()V
    //   95: aload 6
    //   97: invokevirtual 43	android/os/Parcel:recycle	()V
    //   100: return
    //   101: aconst_null
    //   102: astore 8
    //   104: goto -71 -> 33
    //   107: astore 8
    //   109: aload 7
    //   111: invokevirtual 43	android/os/Parcel:recycle	()V
    //   114: aload 6
    //   116: invokevirtual 43	android/os/Parcel:recycle	()V
    //   119: aload 8
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramzzqm	zzqm
    //   0	122	2	paramString	String
    //   0	122	3	paramArrayOfByte	byte[]
    //   0	122	4	paramLong	long
    //   3	112	6	localParcel1	Parcel
    //   8	102	7	localParcel2	Parcel
    //   12	91	8	localObject1	Object
    //   107	13	8	localObject2	Object
    //   68	5	9	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	107	finally
    //   25	31	107	finally
    //   35	40	107	finally
    //   42	46	107	finally
    //   48	52	107	finally
    //   54	59	107	finally
    //   59	63	107	finally
    //   78	85	107	finally
    //   85	90	107	finally
  }
  
  public void zza(String[] paramArrayOfString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeStringArray(paramArrayOfString);
      localParcel1.writeByteArray(paramArrayOfByte);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1010;
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
  
  public void zzag(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1002;
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
  
  public void zzah(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1006;
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
  
  public void zzai(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1013;
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
  
  public String zzaj(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1015;
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
  
  public void zzb(String[] paramArrayOfString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeStringArray(paramArrayOfString);
      localParcel1.writeByteArray(paramArrayOfByte);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1011;
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
  
  public void zzh(String paramString, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1004;
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
  
  public void zzi(String paramString, long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      localObject1 = this.zzoz;
      int i = 1012;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqn$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */