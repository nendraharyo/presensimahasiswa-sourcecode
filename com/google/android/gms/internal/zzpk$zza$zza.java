package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzpk$zza$zza
  implements zzpk
{
  private IBinder zzoz;
  
  zzpk$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 5
    //   8: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 6
    //   13: ldc 23
    //   15: astore 7
    //   17: aload 5
    //   19: aload 7
    //   21: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload 5
    //   26: aload_1
    //   27: invokevirtual 30	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   30: iload_2
    //   31: ifeq +74 -> 105
    //   34: iload 4
    //   36: istore 8
    //   38: aload 5
    //   40: iload 8
    //   42: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   45: aload 5
    //   47: iload_3
    //   48: invokevirtual 34	android/os/Parcel:writeInt	(I)V
    //   51: aload_0
    //   52: getfield 14	com/google/android/gms/internal/zzpk$zza$zza:zzoz	Landroid/os/IBinder;
    //   55: astore 7
    //   57: iconst_2
    //   58: istore 9
    //   60: aload 7
    //   62: iload 9
    //   64: aload 5
    //   66: aload 6
    //   68: iconst_0
    //   69: invokeinterface 41 5 0
    //   74: pop
    //   75: aload 6
    //   77: invokevirtual 44	android/os/Parcel:readException	()V
    //   80: aload 6
    //   82: invokevirtual 48	android/os/Parcel:readInt	()I
    //   85: istore 8
    //   87: iload 8
    //   89: ifeq +25 -> 114
    //   92: aload 6
    //   94: invokevirtual 51	android/os/Parcel:recycle	()V
    //   97: aload 5
    //   99: invokevirtual 51	android/os/Parcel:recycle	()V
    //   102: iload 4
    //   104: ireturn
    //   105: iconst_0
    //   106: istore 8
    //   108: aconst_null
    //   109: astore 7
    //   111: goto -73 -> 38
    //   114: iconst_0
    //   115: istore 4
    //   117: aconst_null
    //   118: astore 10
    //   120: goto -28 -> 92
    //   123: astore 10
    //   125: aload 6
    //   127: invokevirtual 51	android/os/Parcel:recycle	()V
    //   130: aload 5
    //   132: invokevirtual 51	android/os/Parcel:recycle	()V
    //   135: aload 10
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	zza
    //   0	138	1	paramString	String
    //   0	138	2	paramBoolean	boolean
    //   0	138	3	paramInt	int
    //   1	115	4	i	int
    //   6	125	5	localParcel1	Parcel
    //   11	115	6	localParcel2	Parcel
    //   15	95	7	localObject1	Object
    //   36	5	8	j	int
    //   85	22	8	k	int
    //   58	5	9	m	int
    //   118	1	10	localObject2	Object
    //   123	13	10	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   19	24	123	finally
    //   26	30	123	finally
    //   40	45	123	finally
    //   47	51	123	finally
    //   51	55	123	finally
    //   68	75	123	finally
    //   75	80	123	finally
    //   80	85	123	finally
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.flags.IFlagProvider";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.flags.IFlagProvider";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 4;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.flags.IFlagProvider";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 5;
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
  
  /* Error */
  public void init(com.google.android.gms.dynamic.zzd paramzzd)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +52 -> 71
    //   22: aload_1
    //   23: invokeinterface 72 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 76	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzpk$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_1
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 41 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 44	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 51	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 51	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 51	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 51	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzd	com.google.android.gms.dynamic.zzd
    //   3	81	2	localParcel1	Parcel
    //   7	73	3	localParcel2	Parcel
    //   10	63	4	localObject1	Object
    //   77	11	4	localObject2	Object
    //   43	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	77	finally
    //   22	28	77	finally
    //   31	36	77	finally
    //   36	40	77	finally
    //   51	58	77	finally
    //   58	62	77	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpk$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */