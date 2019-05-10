package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

class b$a$a
  implements b
{
  private IBinder a;
  
  b$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.a;
      int i = 44;
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
  
  public void a(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
      localObject1 = this.a;
      int i = 11;
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
  
  public void a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.a;
      int i = 17;
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
  
  public void a(Uri paramUri, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramUri != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramUri.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.a;
            int j = 36;
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
  public void a(android.support.v4.media.MediaDescriptionCompat paramMediaDescriptionCompat)
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
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 66	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 41
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 37 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 40	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 43	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 43	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 43	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 43	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramMediaDescriptionCompat	android.support.v4.media.MediaDescriptionCompat
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
  
  /* Error */
  public void a(android.support.v4.media.MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
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
    //   20: ifnull +68 -> 88
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 66	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: iload_2
    //   46: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 42
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -55 -> 44
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramMediaDescriptionCompat	android.support.v4.media.MediaDescriptionCompat
    //   0	116	2	paramInt	int
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   24	66	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   27	32	102	finally
    //   40	44	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  /* Error */
  public void a(RatingCompat paramRatingCompat)
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
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 71	android/support/v4/media/RatingCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 25
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 37 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 40	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 43	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 43	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 43	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 43	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramRatingCompat	RatingCompat
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
  
  public void a(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramRatingCompat != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramRatingCompat.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.a;
            int j = 51;
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
  public void a(a parama)
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
    //   23: invokeinterface 79 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_3
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 37 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 40	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 43	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 43	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	a
    //   0	90	1	parama	a
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
  public void a(String paramString, Bundle paramBundle)
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
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 46	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +63 -> 88
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 62	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 34
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramString	String
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  public void a(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramResultReceiverWrapper != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramResultReceiverWrapper.writeToParcel(localParcel1, 0);
            localObject1 = this.a;
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
  
  public void a(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.a;
      int j = 46;
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
  
  public boolean a()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.a;
      int i = 5;
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
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        int i;
        if (paramKeyEvent != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramKeyEvent.writeToParcel(localParcel1, 0);
          localObject1 = this.a;
          int j = 2;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i != 0) {
            return bool;
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        bool = false;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public String b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 6;
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
  
  public void b(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.a;
      int i = 39;
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
  
  public void b(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
      localObject1 = this.a;
      int i = 12;
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
  
  public void b(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localObject1 = this.a;
      int i = 24;
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
  
  public void b(Uri paramUri, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramUri != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramUri.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.a;
            int j = 16;
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
  public void b(android.support.v4.media.MediaDescriptionCompat paramMediaDescriptionCompat)
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
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 66	android/support/v4/media/MediaDescriptionCompat:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 43
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 37 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 40	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 43	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 43	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 43	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 43	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramMediaDescriptionCompat	android.support.v4.media.MediaDescriptionCompat
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
  
  /* Error */
  public void b(a parama)
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
    //   23: invokeinterface 79 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_4
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 37 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 40	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 43	android/os/Parcel:recycle	()V
    //   66: aload_2
    //   67: invokevirtual 43	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aconst_null
    //   72: astore 4
    //   74: goto -44 -> 30
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	a
    //   0	90	1	parama	a
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
  public void b(String paramString, Bundle paramBundle)
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
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 46	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +63 -> 88
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 62	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 35
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramString	String
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  public void b(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.a;
      int j = 40;
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
  
  public String c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 7;
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
  
  public void c(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.a;
      int i = 48;
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
  public void c(String paramString, Bundle paramBundle)
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
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 46	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +63 -> 88
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 62	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 14
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramString	String
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  /* Error */
  public android.app.PendingIntent d()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 8
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 121	android/app/PendingIntent:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 117	android/app/PendingIntent
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  /* Error */
  public void d(String paramString, Bundle paramBundle)
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
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 46	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +63 -> 88
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 62	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 15
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramString	String
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  public long e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 9;
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
  
  /* Error */
  public void e(String paramString, Bundle paramBundle)
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
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 46	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +63 -> 88
    //   28: iconst_1
    //   29: istore 6
    //   31: aload_3
    //   32: iload 6
    //   34: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 5
    //   43: aload_2
    //   44: aload_3
    //   45: iconst_0
    //   46: invokevirtual 62	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 26
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 37 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 40	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   99: goto -50 -> 49
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 43	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramString	String
    //   0	116	2	paramBundle	Bundle
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   29	61	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   20	24	102	finally
    //   32	37	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  /* Error */
  public ParcelableVolumeInfo f()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 10
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 138	android/support/v4/media/session/ParcelableVolumeInfo:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 137	android/support/v4/media/session/ParcelableVolumeInfo
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  /* Error */
  public android.support.v4.media.MediaMetadataCompat g()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 27
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 142	android/support/v4/media/MediaMetadataCompat:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 141	android/support/v4/media/MediaMetadataCompat
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  /* Error */
  public PlaybackStateCompat h()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 28
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 146	android/support/v4/media/session/PlaybackStateCompat:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 145	android/support/v4/media/session/PlaybackStateCompat
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  public List i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 29;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = MediaSessionCompat.QueueItem.CREATOR;
      localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public CharSequence j()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 30
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 160	android/text/TextUtils:CHAR_SEQUENCE_CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 162	java/lang/CharSequence
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  /* Error */
  public Bundle k()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	android/support/v4/media/session/b$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 31
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 40	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 164	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 127 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 61	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  public int l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 32;
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
  
  public boolean m()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.a;
      int i = 45;
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
  
  public int n()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 37;
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
  
  public boolean o()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.a;
      int i = 38;
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
  
  public int p()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 47;
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
  
  public void q()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 33;
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
  
  public void r()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 13;
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
  
  public void s()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 18;
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
  
  public void t()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 19;
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
  
  public void u()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 20;
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
  
  public void v()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 21;
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
  
  public void w()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 22;
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
  
  public void x()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "android.support.v4.media.session.IMediaSession";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.a;
      int i = 23;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\b$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */