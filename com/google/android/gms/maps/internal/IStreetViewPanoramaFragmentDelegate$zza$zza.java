package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

class IStreetViewPanoramaFragmentDelegate$zza$zza
  implements IStreetViewPanoramaFragmentDelegate
{
  private IBinder zzoz;
  
  IStreetViewPanoramaFragmentDelegate$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public IStreetViewPanoramaDelegate getStreetViewPanorama()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = IStreetViewPanoramaDelegate.zza.zzcZ((IBinder)localObject1);
      return (IStreetViewPanoramaDelegate)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void getStreetViewPanoramaAsync(zzaa paramzzaa)
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
    //   23: invokeinterface 54 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 12
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 33 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 36	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 49	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 49	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 49	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 49	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	zza
    //   0	91	1	paramzzaa	zzaa
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
  
  public boolean isReady()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.zzoz;
      int i = 11;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void onCreate(Bundle paramBundle)
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
    //   28: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 74	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_3
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 33 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 36	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 49	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 49	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 49	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 49	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	zza
    //   0	105	1	paramBundle	Bundle
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
  public zzd onCreateView(zzd paramzzd1, zzd paramzzd2, Bundle paramBundle)
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
    //   28: ifnull +120 -> 148
    //   31: aload_1
    //   32: invokeinterface 78 1 0
    //   37: astore 8
    //   39: aload 6
    //   41: aload 8
    //   43: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload_2
    //   47: ifnull +11 -> 58
    //   50: aload_2
    //   51: invokeinterface 78 1 0
    //   56: astore 5
    //   58: aload 6
    //   60: aload 5
    //   62: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   65: aload_3
    //   66: ifnull +91 -> 157
    //   69: iconst_1
    //   70: istore 4
    //   72: aload 6
    //   74: iload 4
    //   76: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   79: iconst_0
    //   80: istore 4
    //   82: aconst_null
    //   83: astore 5
    //   85: aload_3
    //   86: aload 6
    //   88: iconst_0
    //   89: invokevirtual 74	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   92: aload_0
    //   93: getfield 14	com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   96: astore 5
    //   98: iconst_4
    //   99: istore 9
    //   101: aload 5
    //   103: iload 9
    //   105: aload 6
    //   107: aload 7
    //   109: iconst_0
    //   110: invokeinterface 33 5 0
    //   115: pop
    //   116: aload 7
    //   118: invokevirtual 36	android/os/Parcel:readException	()V
    //   121: aload 7
    //   123: invokevirtual 40	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   126: astore 5
    //   128: aload 5
    //   130: invokestatic 85	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   133: astore 5
    //   135: aload 7
    //   137: invokevirtual 49	android/os/Parcel:recycle	()V
    //   140: aload 6
    //   142: invokevirtual 49	android/os/Parcel:recycle	()V
    //   145: aload 5
    //   147: areturn
    //   148: iconst_0
    //   149: istore 9
    //   151: aconst_null
    //   152: astore 8
    //   154: goto -115 -> 39
    //   157: iconst_0
    //   158: istore 4
    //   160: aconst_null
    //   161: astore 5
    //   163: aload 6
    //   165: iconst_0
    //   166: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   169: goto -77 -> 92
    //   172: astore 5
    //   174: aload 7
    //   176: invokevirtual 49	android/os/Parcel:recycle	()V
    //   179: aload 6
    //   181: invokevirtual 49	android/os/Parcel:recycle	()V
    //   184: aload 5
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	zza
    //   0	187	1	paramzzd1	zzd
    //   0	187	2	paramzzd2	zzd
    //   0	187	3	paramBundle	Bundle
    //   1	158	4	i	int
    //   4	158	5	localObject1	Object
    //   172	13	5	localObject2	Object
    //   9	171	6	localParcel1	Parcel
    //   14	161	7	localParcel2	Parcel
    //   18	135	8	localObject3	Object
    //   99	51	9	j	int
    // Exception table:
    //   from	to	target	type
    //   22	27	172	finally
    //   31	37	172	finally
    //   41	46	172	finally
    //   50	56	172	finally
    //   60	65	172	finally
    //   74	79	172	finally
    //   88	92	172	finally
    //   92	96	172	finally
    //   109	116	172	finally
    //   116	121	172	finally
    //   121	126	172	finally
    //   128	133	172	finally
    //   165	169	172	finally
  }
  
  public void onDestroy()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public void onDestroyView()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public void onInflate(zzd paramzzd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramzzd != null)
        {
          localObject1 = paramzzd.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          if (paramStreetViewPanoramaOptions != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramStreetViewPanoramaOptions.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label173;
            }
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
          continue;
        }
        int i = 0;
        localObject1 = null;
        localParcel1.writeInt(0);
        continue;
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label173:
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void onLowMemory()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 9;
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
  
  public void onPause()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
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
  
  public void onResume()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 5;
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
  public void onSaveInstanceState(Bundle paramBundle)
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
    //   19: ifnull +76 -> 95
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 74	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 10
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 33 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 36	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 64	android/os/Parcel:readInt	()I
    //   74: istore 5
    //   76: iload 5
    //   78: ifeq +8 -> 86
    //   81: aload_1
    //   82: aload_3
    //   83: invokevirtual 99	android/os/Bundle:readFromParcel	(Landroid/os/Parcel;)V
    //   86: aload_3
    //   87: invokevirtual 49	android/os/Parcel:recycle	()V
    //   90: aload_2
    //   91: invokevirtual 49	android/os/Parcel:recycle	()V
    //   94: return
    //   95: iconst_0
    //   96: istore 5
    //   98: aconst_null
    //   99: astore 4
    //   101: aload_2
    //   102: iconst_0
    //   103: invokevirtual 68	android/os/Parcel:writeInt	(I)V
    //   106: goto -63 -> 43
    //   109: astore 4
    //   111: aload_3
    //   112: invokevirtual 49	android/os/Parcel:recycle	()V
    //   115: aload_2
    //   116: invokevirtual 49	android/os/Parcel:recycle	()V
    //   119: aload 4
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramBundle	Bundle
    //   3	113	2	localParcel1	Parcel
    //   7	105	3	localParcel2	Parcel
    //   10	90	4	localObject1	Object
    //   109	11	4	localObject2	Object
    //   23	74	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	109	finally
    //   26	31	109	finally
    //   39	43	109	finally
    //   43	47	109	finally
    //   59	66	109	finally
    //   66	70	109	finally
    //   70	74	109	finally
    //   82	86	109	finally
    //   102	106	109	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IStreetViewPanoramaFragmentDelegate$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */