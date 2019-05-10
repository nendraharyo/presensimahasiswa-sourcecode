package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;

class zzd$zza$zza
  implements zzd
{
  private IBinder zzoz;
  
  zzd$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onRewardedVideoAdClosed()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 4;
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
  
  public void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
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
  
  public void onRewardedVideoAdLeftApplication()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 6;
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
  
  public void onRewardedVideoAdLoaded()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
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
  
  public void onRewardedVideoAdOpened()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 2;
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
  
  public void onRewardedVideoStarted()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  /* Error */
  public void zza(zza paramzza)
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
    //   19: ifnull +52 -> 71
    //   22: aload_1
    //   23: invokeinterface 54 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/ads/internal/reward/client/zzd$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_5
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 33 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 36	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 39	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 39	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 39	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 39	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzza	zza
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzd$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */