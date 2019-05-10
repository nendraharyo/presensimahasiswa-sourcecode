package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqm$zza$zza
  implements zzqm
{
  private IBinder zzoz;
  
  zzqm$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onConnectionRequest(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeByteArray(paramArrayOfByte);
      localObject1 = this.zzoz;
      int i = 1001;
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
  
  public void onDisconnected(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 1008;
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
  
  public void onEndpointFound(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeString(paramString4);
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
  
  public void onEndpointLost(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 1003;
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
  
  public void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken(str);
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.zzoz;
      int j = 1007;
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
  
  public void zza(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt);
      localParcel1.writeByteArray(paramArrayOfByte);
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
  
  /* Error */
  public void zza(String paramString1, String paramString2, String paramString3, String paramString4, com.google.android.gms.nearby.connection.AppMetadata paramAppMetadata)
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
    //   21: aload 6
    //   23: aload_1
    //   24: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   27: aload 6
    //   29: aload_2
    //   30: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   33: aload 6
    //   35: aload_3
    //   36: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   39: aload 6
    //   41: aload 4
    //   43: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 5
    //   48: ifnull +69 -> 117
    //   51: iconst_1
    //   52: istore 9
    //   54: aload 6
    //   56: iload 9
    //   58: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   61: iconst_0
    //   62: istore 9
    //   64: aconst_null
    //   65: astore 8
    //   67: aload 5
    //   69: aload 6
    //   71: iconst_0
    //   72: invokevirtual 62	com/google/android/gms/nearby/connection/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   75: aload_0
    //   76: getfield 14	com/google/android/gms/internal/zzqm$zza$zza:zzoz	Landroid/os/IBinder;
    //   79: astore 8
    //   81: sipush 1004
    //   84: istore 10
    //   86: aload 8
    //   88: iload 10
    //   90: aload 6
    //   92: aload 7
    //   94: iconst_0
    //   95: invokeinterface 40 5 0
    //   100: pop
    //   101: aload 7
    //   103: invokevirtual 43	android/os/Parcel:readException	()V
    //   106: aload 7
    //   108: invokevirtual 46	android/os/Parcel:recycle	()V
    //   111: aload 6
    //   113: invokevirtual 46	android/os/Parcel:recycle	()V
    //   116: return
    //   117: iconst_0
    //   118: istore 9
    //   120: aconst_null
    //   121: astore 8
    //   123: aload 6
    //   125: iconst_0
    //   126: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   129: goto -54 -> 75
    //   132: astore 8
    //   134: aload 7
    //   136: invokevirtual 46	android/os/Parcel:recycle	()V
    //   139: aload 6
    //   141: invokevirtual 46	android/os/Parcel:recycle	()V
    //   144: aload 8
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	zza
    //   0	147	1	paramString1	String
    //   0	147	2	paramString2	String
    //   0	147	3	paramString3	String
    //   0	147	4	paramString4	String
    //   0	147	5	paramAppMetadata	com.google.android.gms.nearby.connection.AppMetadata
    //   3	137	6	localParcel1	Parcel
    //   8	127	7	localParcel2	Parcel
    //   12	110	8	localObject1	Object
    //   132	13	8	localObject2	Object
    //   52	67	9	i	int
    //   84	5	10	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	132	finally
    //   23	27	132	finally
    //   29	33	132	finally
    //   35	39	132	finally
    //   41	46	132	finally
    //   56	61	132	finally
    //   71	75	132	finally
    //   75	79	132	finally
    //   94	101	132	finally
    //   101	106	132	finally
    //   125	129	132	finally
  }
  
  public void zzfy(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 1005;
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
  
  public void zziW(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public void zziX(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public void zziY(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public void zziZ(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public void zzja(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public void zzm(int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 1009;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqm$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */