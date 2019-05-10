package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;

class zzkf$zza$zza
  implements zzkf
{
  private IBinder zzoz;
  
  zzkf$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(GetRecentContextCall.Request paramRequest, zzkg paramzzkg)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramRequest.writeToParcel(localParcel1, 0);
        }
        while (paramzzkg != null)
        {
          localObject1 = paramzzkg.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 5;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zza(zzkg paramzzkg)
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
    //   23: invokeinterface 43 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzkf$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_2
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 54 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 57	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 60	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 60	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 60	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 60	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzkg	zzkg
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
  
  /* Error */
  public void zza(zzkg paramzzkg, String paramString1, String paramString2)
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
    //   22: ifnull +71 -> 93
    //   25: aload_1
    //   26: invokeinterface 43 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: aload_2
    //   43: invokevirtual 64	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 4
    //   48: aload_3
    //   49: invokevirtual 64	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/internal/zzkf$zza$zza:zzoz	Landroid/os/IBinder;
    //   56: astore 6
    //   58: bipush 6
    //   60: istore 7
    //   62: aload 6
    //   64: iload 7
    //   66: aload 4
    //   68: aload 5
    //   70: iconst_0
    //   71: invokeinterface 54 5 0
    //   76: pop
    //   77: aload 5
    //   79: invokevirtual 57	android/os/Parcel:readException	()V
    //   82: aload 5
    //   84: invokevirtual 60	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: invokevirtual 60	android/os/Parcel:recycle	()V
    //   92: return
    //   93: aconst_null
    //   94: astore 6
    //   96: goto -63 -> 33
    //   99: astore 6
    //   101: aload 5
    //   103: invokevirtual 60	android/os/Parcel:recycle	()V
    //   106: aload 4
    //   108: invokevirtual 60	android/os/Parcel:recycle	()V
    //   111: aload 6
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	zza
    //   0	114	1	paramzzkg	zzkg
    //   0	114	2	paramString1	String
    //   0	114	3	paramString2	String
    //   3	104	4	localParcel1	Parcel
    //   8	94	5	localParcel2	Parcel
    //   12	83	6	localObject1	Object
    //   99	13	6	localObject2	Object
    //   60	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	99	finally
    //   25	31	99	finally
    //   35	40	99	finally
    //   42	46	99	finally
    //   48	52	99	finally
    //   52	56	99	finally
    //   70	77	99	finally
    //   77	82	99	finally
  }
  
  /* Error */
  public void zza(zzkg paramzzkg, String paramString, com.google.android.gms.appdatasearch.UsageInfo[] paramArrayOfUsageInfo)
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
    //   22: ifnull +74 -> 96
    //   25: aload_1
    //   26: invokeinterface 43 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: aload_2
    //   43: invokevirtual 64	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aconst_null
    //   47: astore 6
    //   49: aload 4
    //   51: aload_3
    //   52: iconst_0
    //   53: invokevirtual 69	android/os/Parcel:writeTypedArray	([Landroid/os/Parcelable;I)V
    //   56: aload_0
    //   57: getfield 14	com/google/android/gms/internal/zzkf$zza$zza:zzoz	Landroid/os/IBinder;
    //   60: astore 6
    //   62: iconst_1
    //   63: istore 7
    //   65: aload 6
    //   67: iload 7
    //   69: aload 4
    //   71: aload 5
    //   73: iconst_0
    //   74: invokeinterface 54 5 0
    //   79: pop
    //   80: aload 5
    //   82: invokevirtual 57	android/os/Parcel:readException	()V
    //   85: aload 5
    //   87: invokevirtual 60	android/os/Parcel:recycle	()V
    //   90: aload 4
    //   92: invokevirtual 60	android/os/Parcel:recycle	()V
    //   95: return
    //   96: aconst_null
    //   97: astore 6
    //   99: goto -66 -> 33
    //   102: astore 6
    //   104: aload 5
    //   106: invokevirtual 60	android/os/Parcel:recycle	()V
    //   109: aload 4
    //   111: invokevirtual 60	android/os/Parcel:recycle	()V
    //   114: aload 6
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zza
    //   0	117	1	paramzzkg	zzkg
    //   0	117	2	paramString	String
    //   0	117	3	paramArrayOfUsageInfo	com.google.android.gms.appdatasearch.UsageInfo[]
    //   3	107	4	localParcel1	Parcel
    //   8	97	5	localParcel2	Parcel
    //   12	86	6	localObject1	Object
    //   102	13	6	localObject2	Object
    //   63	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	102	finally
    //   25	31	102	finally
    //   35	40	102	finally
    //   42	46	102	finally
    //   52	56	102	finally
    //   56	60	102	finally
    //   73	80	102	finally
    //   80	85	102	finally
  }
  
  /* Error */
  public void zza(zzkg paramzzkg, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   13: astore 6
    //   15: ldc 22
    //   17: astore 7
    //   19: aload 5
    //   21: aload 7
    //   23: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: ifnull +70 -> 97
    //   30: aload_1
    //   31: invokeinterface 43 1 0
    //   36: astore 7
    //   38: aload 5
    //   40: aload 7
    //   42: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   45: iload_2
    //   46: ifeq +5 -> 51
    //   49: iconst_1
    //   50: istore_3
    //   51: aload 5
    //   53: iload_3
    //   54: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   57: aload_0
    //   58: getfield 14	com/google/android/gms/internal/zzkf$zza$zza:zzoz	Landroid/os/IBinder;
    //   61: astore 4
    //   63: iconst_4
    //   64: istore 8
    //   66: aload 4
    //   68: iload 8
    //   70: aload 5
    //   72: aload 6
    //   74: iconst_0
    //   75: invokeinterface 54 5 0
    //   80: pop
    //   81: aload 6
    //   83: invokevirtual 57	android/os/Parcel:readException	()V
    //   86: aload 6
    //   88: invokevirtual 60	android/os/Parcel:recycle	()V
    //   91: aload 5
    //   93: invokevirtual 60	android/os/Parcel:recycle	()V
    //   96: return
    //   97: iconst_0
    //   98: istore 8
    //   100: aconst_null
    //   101: astore 7
    //   103: goto -65 -> 38
    //   106: astore 4
    //   108: aload 6
    //   110: invokevirtual 60	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: invokevirtual 60	android/os/Parcel:recycle	()V
    //   118: aload 4
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramzzkg	zzkg
    //   0	121	2	paramBoolean	boolean
    //   1	53	3	i	int
    //   3	64	4	localIBinder	IBinder
    //   106	13	4	localObject1	Object
    //   8	106	5	localParcel1	Parcel
    //   13	96	6	localParcel2	Parcel
    //   17	85	7	localObject2	Object
    //   64	35	8	j	int
    // Exception table:
    //   from	to	target	type
    //   21	26	106	finally
    //   30	36	106	finally
    //   40	45	106	finally
    //   53	57	106	finally
    //   57	61	106	finally
    //   74	81	106	finally
    //   81	86	106	finally
  }
  
  /* Error */
  public void zzb(zzkg paramzzkg)
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
    //   23: invokeinterface 43 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/internal/zzkf$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_3
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 54 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 57	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 60	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 60	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 60	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 60	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzkg	zzkg
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkf$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */