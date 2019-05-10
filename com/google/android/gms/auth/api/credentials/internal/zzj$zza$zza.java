package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;

class zzj$zza$zza
  implements zzj
{
  private IBinder zzoz;
  
  zzj$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(zzi paramzzi)
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
    //   23: invokeinterface 32 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza:zzoz	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_4
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 43 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 46	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 49	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 49	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 49	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zza
    //   0	90	1	paramzzi	zzi
    //   3	81	2	localParcel1	android.os.Parcel
    //   7	73	3	localParcel2	android.os.Parcel
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
  public void zza(zzi paramzzi, com.google.android.gms.auth.api.credentials.CredentialRequest paramCredentialRequest)
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
    //   20: ifnull +80 -> 100
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +71 -> 109
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 60	com/google/android/gms/auth/api/credentials/CredentialRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_1
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 43 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 46	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 49	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 6
    //   103: aconst_null
    //   104: astore 5
    //   106: goto -75 -> 31
    //   109: iconst_0
    //   110: istore 6
    //   112: aconst_null
    //   113: astore 5
    //   115: aload_3
    //   116: iconst_0
    //   117: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 49	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 49	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzi	zzi
    //   0	137	2	paramCredentialRequest	com.google.android.gms.auth.api.credentials.CredentialRequest
    //   3	128	3	localParcel1	android.os.Parcel
    //   7	119	4	localParcel2	android.os.Parcel
    //   11	103	5	localObject1	Object
    //   123	12	5	localObject2	Object
    //   42	69	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	123	finally
    //   23	29	123	finally
    //   32	37	123	finally
    //   45	50	123	finally
    //   58	62	123	finally
    //   62	66	123	finally
    //   78	85	123	finally
    //   85	90	123	finally
    //   116	120	123	finally
  }
  
  /* Error */
  public void zza(zzi paramzzi, DeleteRequest paramDeleteRequest)
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
    //   20: ifnull +80 -> 100
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +71 -> 109
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 63	com/google/android/gms/auth/api/credentials/internal/DeleteRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_3
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 43 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 46	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 49	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 6
    //   103: aconst_null
    //   104: astore 5
    //   106: goto -75 -> 31
    //   109: iconst_0
    //   110: istore 6
    //   112: aconst_null
    //   113: astore 5
    //   115: aload_3
    //   116: iconst_0
    //   117: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 49	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 49	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzi	zzi
    //   0	137	2	paramDeleteRequest	DeleteRequest
    //   3	128	3	localParcel1	android.os.Parcel
    //   7	119	4	localParcel2	android.os.Parcel
    //   11	103	5	localObject1	Object
    //   123	12	5	localObject2	Object
    //   42	69	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	123	finally
    //   23	29	123	finally
    //   32	37	123	finally
    //   45	50	123	finally
    //   58	62	123	finally
    //   62	66	123	finally
    //   78	85	123	finally
    //   85	90	123	finally
    //   116	120	123	finally
  }
  
  /* Error */
  public void zza(zzi paramzzi, GeneratePasswordRequest paramGeneratePasswordRequest)
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
    //   20: ifnull +80 -> 100
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +71 -> 109
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 67	com/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_5
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 43 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 46	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 49	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 6
    //   103: aconst_null
    //   104: astore 5
    //   106: goto -75 -> 31
    //   109: iconst_0
    //   110: istore 6
    //   112: aconst_null
    //   113: astore 5
    //   115: aload_3
    //   116: iconst_0
    //   117: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 49	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 49	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzi	zzi
    //   0	137	2	paramGeneratePasswordRequest	GeneratePasswordRequest
    //   3	128	3	localParcel1	android.os.Parcel
    //   7	119	4	localParcel2	android.os.Parcel
    //   11	103	5	localObject1	Object
    //   123	12	5	localObject2	Object
    //   42	69	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	123	finally
    //   23	29	123	finally
    //   32	37	123	finally
    //   45	50	123	finally
    //   58	62	123	finally
    //   62	66	123	finally
    //   78	85	123	finally
    //   85	90	123	finally
    //   116	120	123	finally
  }
  
  /* Error */
  public void zza(zzi paramzzi, SaveRequest paramSaveRequest)
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
    //   20: ifnull +80 -> 100
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +71 -> 109
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 71	com/google/android/gms/auth/api/credentials/internal/SaveRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_2
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 43 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 46	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 49	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 49	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 6
    //   103: aconst_null
    //   104: astore 5
    //   106: goto -75 -> 31
    //   109: iconst_0
    //   110: istore 6
    //   112: aconst_null
    //   113: astore 5
    //   115: aload_3
    //   116: iconst_0
    //   117: invokevirtual 54	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 49	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 49	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzi	zzi
    //   0	137	2	paramSaveRequest	SaveRequest
    //   3	128	3	localParcel1	android.os.Parcel
    //   7	119	4	localParcel2	android.os.Parcel
    //   11	103	5	localObject1	Object
    //   123	12	5	localObject2	Object
    //   42	69	6	i	int
    //   69	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	123	finally
    //   23	29	123	finally
    //   32	37	123	finally
    //   45	50	123	finally
    //   58	62	123	finally
    //   62	66	123	finally
    //   78	85	123	finally
    //   85	90	123	finally
    //   116	120	123	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzj$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */