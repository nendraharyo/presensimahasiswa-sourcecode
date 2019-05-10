package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

class a$a$a
  implements a
{
  private IBinder a;
  
  a$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaControllerCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 2;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void a(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaControllerCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeInt(paramInt);
      localObject1 = this.a;
      int i = 9;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void a(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +53 -> 66
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 48	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: bipush 7
    //   43: istore 5
    //   45: iconst_1
    //   46: istore 6
    //   48: aload_3
    //   49: iload 5
    //   51: aload_2
    //   52: aconst_null
    //   53: iload 6
    //   55: invokeinterface 34 5 0
    //   60: pop
    //   61: aload_2
    //   62: invokevirtual 37	android/os/Parcel:recycle	()V
    //   65: return
    //   66: iconst_0
    //   67: istore 4
    //   69: aconst_null
    //   70: astore_3
    //   71: aload_2
    //   72: iconst_0
    //   73: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   76: goto -40 -> 36
    //   79: astore_3
    //   80: aload_2
    //   81: invokevirtual 37	android/os/Parcel:recycle	()V
    //   84: aload_3
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	a
    //   0	86	1	paramBundle	android.os.Bundle
    //   3	78	2	localParcel	Parcel
    //   6	65	3	localObject1	Object
    //   79	6	3	localObject2	Object
    //   17	51	4	i	int
    //   43	7	5	j	int
    //   46	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	79	finally
    //   20	25	79	finally
    //   32	36	79	finally
    //   36	40	79	finally
    //   53	61	79	finally
    //   72	76	79	finally
  }
  
  /* Error */
  public void a(android.support.v4.media.MediaMetadataCompat paramMediaMetadataCompat)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 52	android/support/v4/media/MediaMetadataCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_4
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 34 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 37	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 37	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	a
    //   0	85	1	paramMediaMetadataCompat	android.support.v4.media.MediaMetadataCompat
    //   3	77	2	localParcel	Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +53 -> 66
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 56	android/support/v4/media/session/ParcelableVolumeInfo:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: bipush 8
    //   43: istore 5
    //   45: iconst_1
    //   46: istore 6
    //   48: aload_3
    //   49: iload 5
    //   51: aload_2
    //   52: aconst_null
    //   53: iload 6
    //   55: invokeinterface 34 5 0
    //   60: pop
    //   61: aload_2
    //   62: invokevirtual 37	android/os/Parcel:recycle	()V
    //   65: return
    //   66: iconst_0
    //   67: istore 4
    //   69: aconst_null
    //   70: astore_3
    //   71: aload_2
    //   72: iconst_0
    //   73: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   76: goto -40 -> 36
    //   79: astore_3
    //   80: aload_2
    //   81: invokevirtual 37	android/os/Parcel:recycle	()V
    //   84: aload_3
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	a
    //   0	86	1	paramParcelableVolumeInfo	ParcelableVolumeInfo
    //   3	78	2	localParcel	Parcel
    //   6	65	3	localObject1	Object
    //   79	6	3	localObject2	Object
    //   17	51	4	i	int
    //   43	7	5	j	int
    //   46	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	79	finally
    //   20	25	79	finally
    //   32	36	79	finally
    //   36	40	79	finally
    //   53	61	79	finally
    //   72	76	79	finally
  }
  
  /* Error */
  public void a(PlaybackStateCompat paramPlaybackStateCompat)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 60	android/support/v4/media/session/PlaybackStateCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_3
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 34 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 37	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 37	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	a
    //   0	85	1	paramPlaybackStateCompat	PlaybackStateCompat
    //   3	77	2	localParcel	Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public void a(CharSequence paramCharSequence)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +53 -> 66
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokestatic 66	android/text/TextUtils:writeToParcel	(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: bipush 6
    //   43: istore 5
    //   45: iconst_1
    //   46: istore 6
    //   48: aload_3
    //   49: iload 5
    //   51: aload_2
    //   52: aconst_null
    //   53: iload 6
    //   55: invokeinterface 34 5 0
    //   60: pop
    //   61: aload_2
    //   62: invokevirtual 37	android/os/Parcel:recycle	()V
    //   65: return
    //   66: iconst_0
    //   67: istore 4
    //   69: aconst_null
    //   70: astore_3
    //   71: aload_2
    //   72: iconst_0
    //   73: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   76: goto -40 -> 36
    //   79: astore_3
    //   80: aload_2
    //   81: invokevirtual 37	android/os/Parcel:recycle	()V
    //   84: aload_3
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	a
    //   0	86	1	paramCharSequence	CharSequence
    //   3	78	2	localParcel	Parcel
    //   6	65	3	localObject1	Object
    //   79	6	3	localObject2	Object
    //   17	51	4	i	int
    //   43	7	5	j	int
    //   46	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	79	finally
    //   20	25	79	finally
    //   32	36	79	finally
    //   36	40	79	finally
    //   53	61	79	finally
    //   72	76	79	finally
  }
  
  /* Error */
  public void a(String paramString, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: ldc 22
    //   6: astore 4
    //   8: aload_3
    //   9: aload 4
    //   11: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_3
    //   15: aload_1
    //   16: invokevirtual 70	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: ifnull +55 -> 75
    //   23: iconst_1
    //   24: istore 5
    //   26: aload_3
    //   27: iload 5
    //   29: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 5
    //   35: aconst_null
    //   36: astore 4
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 48	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_0
    //   45: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   48: astore 4
    //   50: iconst_1
    //   51: istore 6
    //   53: iconst_1
    //   54: istore 7
    //   56: aload 4
    //   58: iload 6
    //   60: aload_3
    //   61: aconst_null
    //   62: iload 7
    //   64: invokeinterface 34 5 0
    //   69: pop
    //   70: aload_3
    //   71: invokevirtual 37	android/os/Parcel:recycle	()V
    //   74: return
    //   75: iconst_0
    //   76: istore 5
    //   78: aconst_null
    //   79: astore 4
    //   81: aload_3
    //   82: iconst_0
    //   83: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   86: goto -42 -> 44
    //   89: astore 4
    //   91: aload_3
    //   92: invokevirtual 37	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   0	98	1	paramString	String
    //   0	98	2	paramBundle	android.os.Bundle
    //   3	89	3	localParcel	Parcel
    //   6	74	4	localObject1	Object
    //   89	7	4	localObject2	Object
    //   24	53	5	i	int
    //   51	8	6	j	int
    //   54	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   9	14	89	finally
    //   15	19	89	finally
    //   27	32	89	finally
    //   40	44	89	finally
    //   44	48	89	finally
    //   62	70	89	finally
    //   82	86	89	finally
  }
  
  public void a(List paramList)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaControllerCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeTypedList(paramList);
      localObject1 = this.a;
      int i = 5;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: ldc 22
    //   8: astore 4
    //   10: aload_3
    //   11: aload 4
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: iload_1
    //   17: ifeq +40 -> 57
    //   20: aload_3
    //   21: iload_2
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: aload_0
    //   26: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   29: astore 5
    //   31: bipush 10
    //   33: istore 6
    //   35: iconst_1
    //   36: istore 7
    //   38: aload 5
    //   40: iload 6
    //   42: aload_3
    //   43: aconst_null
    //   44: iload 7
    //   46: invokeinterface 34 5 0
    //   51: pop
    //   52: aload_3
    //   53: invokevirtual 37	android/os/Parcel:recycle	()V
    //   56: return
    //   57: iconst_0
    //   58: istore_2
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -42 -> 20
    //   65: astore 5
    //   67: aload_3
    //   68: invokevirtual 37	android/os/Parcel:recycle	()V
    //   71: aload 5
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	a
    //   0	74	1	paramBoolean	boolean
    //   1	58	2	i	int
    //   5	63	3	localParcel	Parcel
    //   8	4	4	str	String
    //   29	32	5	localIBinder	IBinder
    //   65	7	5	localObject	Object
    //   33	8	6	j	int
    //   36	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	65	finally
    //   21	25	65	finally
    //   25	29	65	finally
    //   44	52	65	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public void b()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaControllerCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 13;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void b(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaControllerCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeInt(paramInt);
      localObject1 = this.a;
      int i = 12;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: ldc 22
    //   8: astore 4
    //   10: aload_3
    //   11: aload 4
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: iload_1
    //   17: ifeq +40 -> 57
    //   20: aload_3
    //   21: iload_2
    //   22: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   25: aload_0
    //   26: getfield 14	android/support/v4/media/session/a$a$a:a	Landroid/os/IBinder;
    //   29: astore 5
    //   31: bipush 11
    //   33: istore 6
    //   35: iconst_1
    //   36: istore 7
    //   38: aload 5
    //   40: iload 6
    //   42: aload_3
    //   43: aconst_null
    //   44: iload 7
    //   46: invokeinterface 34 5 0
    //   51: pop
    //   52: aload_3
    //   53: invokevirtual 37	android/os/Parcel:recycle	()V
    //   56: return
    //   57: iconst_0
    //   58: istore_2
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -42 -> 20
    //   65: astore 5
    //   67: aload_3
    //   68: invokevirtual 37	android/os/Parcel:recycle	()V
    //   71: aload 5
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	a
    //   0	74	1	paramBoolean	boolean
    //   1	58	2	i	int
    //   5	63	3	localParcel	Parcel
    //   8	4	4	str	String
    //   29	32	5	localIBinder	IBinder
    //   65	7	5	localObject	Object
    //   33	8	6	j	int
    //   36	9	7	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	65	finally
    //   21	25	65	finally
    //   25	29	65	finally
    //   44	52	65	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\a$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */