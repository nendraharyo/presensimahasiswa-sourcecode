package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

class zzm$zza$zza
  implements zzm
{
  private IBinder zzoz;
  
  zzm$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public List zza(AppMetadata paramAppMetadata, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken(str);
        int k;
        if (paramAppMetadata != null)
        {
          k = 1;
          localParcel1.writeInt(k);
          k = 0;
          str = null;
          paramAppMetadata.writeToParcel(localParcel1, 0);
          if (paramBoolean)
          {
            localParcel1.writeInt(i);
            Object localObject1 = this.zzoz;
            j = 7;
            k = 0;
            str = null;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
            localObject1 = UserAttributeParcel.CREATOR;
            localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
            return (List)localObject1;
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
      Object localObject3 = null;
    }
  }
  
  /* Error */
  public void zza(AppMetadata paramAppMetadata)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/measurement/internal/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/measurement/internal/zzm$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_4
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 44 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 47	android/os/Parcel:readException	()V
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
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
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
    //   0	105	1	paramAppMetadata	AppMetadata
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
  
  public void zza(EventParcel paramEventParcel, AppMetadata paramAppMetadata)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramEventParcel != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramEventParcel.writeToParcel(localParcel1, 0);
          if (paramAppMetadata != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramAppMetadata.writeToParcel(localParcel1, 0);
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
  public void zza(EventParcel paramEventParcel, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 23
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +78 -> 100
    //   25: iconst_1
    //   26: istore 7
    //   28: aload 4
    //   30: iload 7
    //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 7
    //   38: aconst_null
    //   39: astore 6
    //   41: aload_1
    //   42: aload 4
    //   44: iconst_0
    //   45: invokevirtual 64	com/google/android/gms/measurement/internal/EventParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 4
    //   50: aload_2
    //   51: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 4
    //   56: aload_3
    //   57: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/measurement/internal/zzm$zza$zza:zzoz	Landroid/os/IBinder;
    //   64: astore 6
    //   66: iconst_5
    //   67: istore 8
    //   69: aload 6
    //   71: iload 8
    //   73: aload 4
    //   75: aload 5
    //   77: iconst_0
    //   78: invokeinterface 44 5 0
    //   83: pop
    //   84: aload 5
    //   86: invokevirtual 47	android/os/Parcel:readException	()V
    //   89: aload 5
    //   91: invokevirtual 60	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 7
    //   103: aconst_null
    //   104: astore 6
    //   106: aload 4
    //   108: iconst_0
    //   109: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   112: goto -64 -> 48
    //   115: astore 6
    //   117: aload 5
    //   119: invokevirtual 60	android/os/Parcel:recycle	()V
    //   122: aload 4
    //   124: invokevirtual 60	android/os/Parcel:recycle	()V
    //   127: aload 6
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	zza
    //   0	130	1	paramEventParcel	EventParcel
    //   0	130	2	paramString1	String
    //   0	130	3	paramString2	String
    //   3	120	4	localParcel1	Parcel
    //   8	110	5	localParcel2	Parcel
    //   12	93	6	localObject1	Object
    //   115	13	6	localObject2	Object
    //   26	76	7	i	int
    //   67	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	115	finally
    //   30	35	115	finally
    //   44	48	115	finally
    //   50	54	115	finally
    //   56	60	115	finally
    //   60	64	115	finally
    //   77	84	115	finally
    //   84	89	115	finally
    //   108	112	115	finally
  }
  
  public void zza(UserAttributeParcel paramUserAttributeParcel, AppMetadata paramAppMetadata)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramUserAttributeParcel != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramUserAttributeParcel.writeToParcel(localParcel1, 0);
          if (paramAppMetadata != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramAppMetadata.writeToParcel(localParcel1, 0);
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
  
  /* Error */
  public void zzb(AppMetadata paramAppMetadata)
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
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/measurement/internal/AppMetadata:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/measurement/internal/zzm$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 6
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 44 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 47	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 60	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 60	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 60	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramAppMetadata	AppMetadata
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzm$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */