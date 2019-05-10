package android.support.v4.os;

import android.os.IBinder;

class b$a$a
  implements b
{
  private IBinder a;
  
  b$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public void a(int paramInt, android.os.Bundle paramBundle)
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
    //   15: iload_1
    //   16: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   19: aload_2
    //   20: ifnull +55 -> 75
    //   23: iconst_1
    //   24: istore 5
    //   26: aload_3
    //   27: iload 5
    //   29: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 5
    //   35: aconst_null
    //   36: astore 4
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 37	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_0
    //   45: getfield 14	android/support/v4/os/b$a$a:a	Landroid/os/IBinder;
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
    //   64: invokeinterface 43 5 0
    //   69: pop
    //   70: aload_3
    //   71: invokevirtual 46	android/os/Parcel:recycle	()V
    //   74: return
    //   75: iconst_0
    //   76: istore 5
    //   78: aconst_null
    //   79: astore 4
    //   81: aload_3
    //   82: iconst_0
    //   83: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   86: goto -42 -> 44
    //   89: astore 4
    //   91: aload_3
    //   92: invokevirtual 46	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   0	98	1	paramInt	int
    //   0	98	2	paramBundle	android.os.Bundle
    //   3	89	3	localParcel	android.os.Parcel
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
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\b$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */