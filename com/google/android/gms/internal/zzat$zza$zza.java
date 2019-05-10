package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzat$zza$zza
  implements zzat
{
  private IBinder zzoz;
  
  zzat$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public String getId()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public void zzb(String paramString, boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    try
    {
      localParcel1.writeInterfaceToken(str);
      localParcel1.writeString(paramString);
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
  public boolean zzc(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: ldc 22
    //   13: astore 5
    //   15: aload_3
    //   16: aload 5
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: iload_1
    //   22: ifeq +63 -> 85
    //   25: iload_2
    //   26: istore 6
    //   28: aload_3
    //   29: iload 6
    //   31: invokevirtual 50	android/os/Parcel:writeInt	(I)V
    //   34: aload_0
    //   35: getfield 14	com/google/android/gms/internal/zzat$zza$zza:zzoz	Landroid/os/IBinder;
    //   38: astore 5
    //   40: iconst_2
    //   41: istore 7
    //   43: aload 5
    //   45: iload 7
    //   47: aload_3
    //   48: aload 4
    //   50: iconst_0
    //   51: invokeinterface 33 5 0
    //   56: pop
    //   57: aload 4
    //   59: invokevirtual 36	android/os/Parcel:readException	()V
    //   62: aload 4
    //   64: invokevirtual 56	android/os/Parcel:readInt	()I
    //   67: istore 6
    //   69: iload 6
    //   71: ifeq +23 -> 94
    //   74: aload 4
    //   76: invokevirtual 43	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: iload_2
    //   84: ireturn
    //   85: iconst_0
    //   86: istore 6
    //   88: aconst_null
    //   89: astore 5
    //   91: goto -63 -> 28
    //   94: iconst_0
    //   95: istore_2
    //   96: aconst_null
    //   97: astore 8
    //   99: goto -25 -> 74
    //   102: astore 8
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 8
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	zza
    //   0	116	1	paramBoolean	boolean
    //   1	95	2	i	int
    //   5	105	3	localParcel1	Parcel
    //   9	96	4	localParcel2	Parcel
    //   13	77	5	localObject1	Object
    //   26	4	6	j	int
    //   67	20	6	k	int
    //   41	5	7	m	int
    //   97	1	8	localObject2	Object
    //   102	12	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	21	102	finally
    //   29	34	102	finally
    //   34	38	102	finally
    //   50	57	102	finally
    //   57	62	102	finally
    //   62	67	102	finally
  }
  
  public String zzo(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 3;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzat$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */