package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.SignInAccount;

class zzh$zza$zza
  implements zzh
{
  private IBinder zzoz;
  
  zzh$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public void zza(zzg paramzzg, com.google.android.gms.auth.api.signin.GoogleSignInOptions paramGoogleSignInOptions)
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
    //   20: ifnull +81 -> 101
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +72 -> 110
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 47	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/signin/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: bipush 101
    //   70: istore 7
    //   72: aload 5
    //   74: iload 7
    //   76: aload_3
    //   77: aload 4
    //   79: iconst_0
    //   80: invokeinterface 54 5 0
    //   85: pop
    //   86: aload 4
    //   88: invokevirtual 57	android/os/Parcel:readException	()V
    //   91: aload 4
    //   93: invokevirtual 60	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: invokevirtual 60	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 5
    //   107: goto -76 -> 31
    //   110: iconst_0
    //   111: istore 6
    //   113: aconst_null
    //   114: astore 5
    //   116: aload_3
    //   117: iconst_0
    //   118: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   121: goto -59 -> 62
    //   124: astore 5
    //   126: aload 4
    //   128: invokevirtual 60	android/os/Parcel:recycle	()V
    //   131: aload_3
    //   132: invokevirtual 60	android/os/Parcel:recycle	()V
    //   135: aload 5
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	zza
    //   0	138	1	paramzzg	zzg
    //   0	138	2	paramGoogleSignInOptions	com.google.android.gms.auth.api.signin.GoogleSignInOptions
    //   3	129	3	localParcel1	Parcel
    //   7	120	4	localParcel2	Parcel
    //   11	104	5	localObject1	Object
    //   124	12	5	localObject2	Object
    //   42	70	6	i	int
    //   70	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	124	finally
    //   23	29	124	finally
    //   32	37	124	finally
    //   45	50	124	finally
    //   58	62	124	finally
    //   62	66	124	finally
    //   79	86	124	finally
    //   86	91	124	finally
    //   117	121	124	finally
  }
  
  /* Error */
  public void zza(zzg paramzzg, SignInConfiguration paramSignInConfiguration)
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
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 63	com/google/android/gms/auth/api/signin/internal/SignInConfiguration:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/signin/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_1
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 54 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 57	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 60	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
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
    //   117: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 60	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 60	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzg	zzg
    //   0	137	2	paramSignInConfiguration	SignInConfiguration
    //   3	128	3	localParcel1	Parcel
    //   7	119	4	localParcel2	Parcel
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
  
  public void zza(zzg paramzzg, SignInConfiguration paramSignInConfiguration, SignInAccount paramSignInAccount, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramzzg != null)
        {
          localObject1 = paramzzg.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          if (paramSignInConfiguration != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramSignInConfiguration.writeToParcel(localParcel1, 0);
            if (paramSignInAccount == null) {
              break label180;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramSignInAccount.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            localObject1 = this.zzoz;
            int j = 3;
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
      label180:
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public void zzb(zzg paramzzg, com.google.android.gms.auth.api.signin.GoogleSignInOptions paramGoogleSignInOptions)
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
    //   20: ifnull +81 -> 101
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +72 -> 110
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 47	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/signin/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: bipush 102
    //   70: istore 7
    //   72: aload 5
    //   74: iload 7
    //   76: aload_3
    //   77: aload 4
    //   79: iconst_0
    //   80: invokeinterface 54 5 0
    //   85: pop
    //   86: aload 4
    //   88: invokevirtual 57	android/os/Parcel:readException	()V
    //   91: aload 4
    //   93: invokevirtual 60	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: invokevirtual 60	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 5
    //   107: goto -76 -> 31
    //   110: iconst_0
    //   111: istore 6
    //   113: aconst_null
    //   114: astore 5
    //   116: aload_3
    //   117: iconst_0
    //   118: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   121: goto -59 -> 62
    //   124: astore 5
    //   126: aload 4
    //   128: invokevirtual 60	android/os/Parcel:recycle	()V
    //   131: aload_3
    //   132: invokevirtual 60	android/os/Parcel:recycle	()V
    //   135: aload 5
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	zza
    //   0	138	1	paramzzg	zzg
    //   0	138	2	paramGoogleSignInOptions	com.google.android.gms.auth.api.signin.GoogleSignInOptions
    //   3	129	3	localParcel1	Parcel
    //   7	120	4	localParcel2	Parcel
    //   11	104	5	localObject1	Object
    //   124	12	5	localObject2	Object
    //   42	70	6	i	int
    //   70	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	124	finally
    //   23	29	124	finally
    //   32	37	124	finally
    //   45	50	124	finally
    //   58	62	124	finally
    //   62	66	124	finally
    //   79	86	124	finally
    //   86	91	124	finally
    //   117	121	124	finally
  }
  
  /* Error */
  public void zzb(zzg paramzzg, SignInConfiguration paramSignInConfiguration)
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
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 63	com/google/android/gms/auth/api/signin/internal/SignInConfiguration:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/signin/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: iconst_2
    //   69: istore 7
    //   71: aload 5
    //   73: iload 7
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokeinterface 54 5 0
    //   84: pop
    //   85: aload 4
    //   87: invokevirtual 57	android/os/Parcel:readException	()V
    //   90: aload 4
    //   92: invokevirtual 60	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
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
    //   117: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   120: goto -58 -> 62
    //   123: astore 5
    //   125: aload 4
    //   127: invokevirtual 60	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: invokevirtual 60	android/os/Parcel:recycle	()V
    //   134: aload 5
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	zza
    //   0	137	1	paramzzg	zzg
    //   0	137	2	paramSignInConfiguration	SignInConfiguration
    //   3	128	3	localParcel1	Parcel
    //   7	119	4	localParcel2	Parcel
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
  public void zzc(zzg paramzzg, com.google.android.gms.auth.api.signin.GoogleSignInOptions paramGoogleSignInOptions)
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
    //   20: ifnull +81 -> 101
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +72 -> 110
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 47	com/google/android/gms/auth/api/signin/GoogleSignInOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/auth/api/signin/internal/zzh$zza$zza:zzoz	Landroid/os/IBinder;
    //   66: astore 5
    //   68: bipush 103
    //   70: istore 7
    //   72: aload 5
    //   74: iload 7
    //   76: aload_3
    //   77: aload 4
    //   79: iconst_0
    //   80: invokeinterface 54 5 0
    //   85: pop
    //   86: aload 4
    //   88: invokevirtual 57	android/os/Parcel:readException	()V
    //   91: aload 4
    //   93: invokevirtual 60	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: invokevirtual 60	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 5
    //   107: goto -76 -> 31
    //   110: iconst_0
    //   111: istore 6
    //   113: aconst_null
    //   114: astore 5
    //   116: aload_3
    //   117: iconst_0
    //   118: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   121: goto -59 -> 62
    //   124: astore 5
    //   126: aload 4
    //   128: invokevirtual 60	android/os/Parcel:recycle	()V
    //   131: aload_3
    //   132: invokevirtual 60	android/os/Parcel:recycle	()V
    //   135: aload 5
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	zza
    //   0	138	1	paramzzg	zzg
    //   0	138	2	paramGoogleSignInOptions	com.google.android.gms.auth.api.signin.GoogleSignInOptions
    //   3	129	3	localParcel1	Parcel
    //   7	120	4	localParcel2	Parcel
    //   11	104	5	localObject1	Object
    //   124	12	5	localObject2	Object
    //   42	70	6	i	int
    //   70	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	124	finally
    //   23	29	124	finally
    //   32	37	124	finally
    //   45	50	124	finally
    //   58	62	124	finally
    //   62	66	124	finally
    //   79	86	124	finally
    //   86	91	124	finally
    //   117	121	124	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzh$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */