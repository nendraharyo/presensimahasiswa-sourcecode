package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

final class ImageManager$zzc
  implements Runnable
{
  private final Uri mUri;
  private final ParcelFileDescriptor zzajL;
  
  public ImageManager$zzc(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.mUri = paramUri;
    this.zzajL = paramParcelFileDescriptor;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 25
    //   4: invokestatic 31	com/google/android/gms/common/internal/zzb:zzcE	(Ljava/lang/String;)V
    //   7: iconst_0
    //   8: istore_2
    //   9: aconst_null
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 22	com/google/android/gms/common/images/ImageManager$zzc:zzajL	Landroid/os/ParcelFileDescriptor;
    //   18: astore 5
    //   20: aload 5
    //   22: ifnull +34 -> 56
    //   25: aload_0
    //   26: getfield 22	com/google/android/gms/common/images/ImageManager$zzc:zzajL	Landroid/os/ParcelFileDescriptor;
    //   29: astore 5
    //   31: aload 5
    //   33: invokevirtual 37	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   36: astore 5
    //   38: aload 5
    //   40: invokestatic 43	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   43: astore 4
    //   45: aload_0
    //   46: getfield 22	com/google/android/gms/common/images/ImageManager$zzc:zzajL	Landroid/os/ParcelFileDescriptor;
    //   49: astore 5
    //   51: aload 5
    //   53: invokevirtual 46	android/os/ParcelFileDescriptor:close	()V
    //   56: new 48	java/util/concurrent/CountDownLatch
    //   59: astore 6
    //   61: aload 6
    //   63: iload_1
    //   64: invokespecial 51	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   67: aload_0
    //   68: getfield 14	com/google/android/gms/common/images/ImageManager$zzc:zzajK	Lcom/google/android/gms/common/images/ImageManager;
    //   71: invokestatic 57	com/google/android/gms/common/images/ImageManager:zzg	(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //   74: astore 7
    //   76: new 59	com/google/android/gms/common/images/ImageManager$zzf
    //   79: astore 5
    //   81: aload_0
    //   82: getfield 14	com/google/android/gms/common/images/ImageManager$zzc:zzajK	Lcom/google/android/gms/common/images/ImageManager;
    //   85: astore 8
    //   87: aload_0
    //   88: getfield 20	com/google/android/gms/common/images/ImageManager$zzc:mUri	Landroid/net/Uri;
    //   91: astore 9
    //   93: aload 5
    //   95: aload 8
    //   97: aload 9
    //   99: aload 4
    //   101: iload_2
    //   102: aload 6
    //   104: invokespecial 62	com/google/android/gms/common/images/ImageManager$zzf:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
    //   107: aload 7
    //   109: aload 5
    //   111: invokevirtual 68	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   114: pop
    //   115: aload 6
    //   117: invokevirtual 71	java/util/concurrent/CountDownLatch:await	()V
    //   120: return
    //   121: astore 5
    //   123: ldc 73
    //   125: astore 9
    //   127: new 75	java/lang/StringBuilder
    //   130: astore_3
    //   131: aload_3
    //   132: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   135: aload_3
    //   136: ldc 78
    //   138: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: astore_3
    //   142: aload_0
    //   143: getfield 20	com/google/android/gms/common/images/ImageManager$zzc:mUri	Landroid/net/Uri;
    //   146: astore 6
    //   148: aload_3
    //   149: aload 6
    //   151: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: astore_3
    //   158: aload 9
    //   160: aload_3
    //   161: aload 5
    //   163: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   166: pop
    //   167: iload_1
    //   168: istore_2
    //   169: goto -124 -> 45
    //   172: astore 5
    //   174: ldc 73
    //   176: astore 9
    //   178: ldc 97
    //   180: astore 6
    //   182: aload 9
    //   184: aload 6
    //   186: aload 5
    //   188: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   191: pop
    //   192: goto -136 -> 56
    //   195: astore 5
    //   197: ldc 73
    //   199: astore 5
    //   201: new 75	java/lang/StringBuilder
    //   204: astore 8
    //   206: aload 8
    //   208: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   211: aload 8
    //   213: ldc 99
    //   215: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: astore 8
    //   220: aload_0
    //   221: getfield 20	com/google/android/gms/common/images/ImageManager$zzc:mUri	Landroid/net/Uri;
    //   224: astore 9
    //   226: aload 8
    //   228: aload 9
    //   230: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: astore 8
    //   238: aload 5
    //   240: aload 8
    //   242: invokestatic 103	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   245: pop
    //   246: goto -126 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	249	0	this	zzc
    //   1	167	1	i	int
    //   8	161	2	bool	boolean
    //   10	151	3	localObject1	Object
    //   12	88	4	localBitmap	android.graphics.Bitmap
    //   18	92	5	localObject2	Object
    //   121	41	5	localOutOfMemoryError	OutOfMemoryError
    //   172	15	5	localIOException	java.io.IOException
    //   195	1	5	localInterruptedException	InterruptedException
    //   199	40	5	str	String
    //   59	126	6	localObject3	Object
    //   74	34	7	localHandler	android.os.Handler
    //   85	156	8	localObject4	Object
    //   91	138	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   25	29	121	java/lang/OutOfMemoryError
    //   31	36	121	java/lang/OutOfMemoryError
    //   38	43	121	java/lang/OutOfMemoryError
    //   45	49	172	java/io/IOException
    //   51	56	172	java/io/IOException
    //   115	120	195	java/lang/InterruptedException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */