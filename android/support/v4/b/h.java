package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class h
{
  public static File a(Context paramContext)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(".font");
    int i = Process.myPid();
    localObject1 = ((StringBuilder)localObject1).append(i).append("-");
    i = Process.myTid();
    String str = i + "-";
    int j = 0;
    localObject1 = null;
    i = 0;
    j = 100;
    if (i < j)
    {
      localObject1 = new java/io/File;
      File localFile = paramContext.getCacheDir();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = str + i;
      ((File)localObject1).<init>(localFile, (String)localObject3);
    }
    for (;;)
    {
      try
      {
        boolean bool = ((File)localObject1).createNewFile();
        if (bool) {
          return (File)localObject1;
        }
      }
      catch (IOException localIOException)
      {
        j = i + 1;
        i = j;
      }
      break;
      j = 0;
      Object localObject2 = null;
    }
  }
  
  public static ByteBuffer a(Context paramContext, Resources paramResources, int paramInt)
  {
    ByteBuffer localByteBuffer = null;
    File localFile = a(paramContext);
    if (localFile == null) {}
    for (;;)
    {
      return localByteBuffer;
      try
      {
        boolean bool = a(localFile, paramResources, paramInt);
        if (!bool)
        {
          localFile.delete();
          continue;
        }
        localByteBuffer = a(localFile);
        localFile.delete();
      }
      finally
      {
        localFile.delete();
      }
    }
  }
  
  /* Error */
  public static ByteBuffer a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 69	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_3
    //   5: ldc 71
    //   7: astore 4
    //   9: aload_3
    //   10: aload_2
    //   11: aload 4
    //   13: aload_1
    //   14: invokevirtual 77	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   17: astore 5
    //   19: aload 5
    //   21: ifnonnull +44 -> 65
    //   24: aload 5
    //   26: ifnull +12 -> 38
    //   29: iconst_0
    //   30: ifeq +27 -> 57
    //   33: aload 5
    //   35: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   38: aconst_null
    //   39: astore_3
    //   40: aload_3
    //   41: areturn
    //   42: astore_3
    //   43: aconst_null
    //   44: aload_3
    //   45: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   48: goto -10 -> 38
    //   51: astore_3
    //   52: aconst_null
    //   53: astore_3
    //   54: goto -14 -> 40
    //   57: aload 5
    //   59: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   62: goto -24 -> 38
    //   65: new 90	java/io/FileInputStream
    //   68: astore 6
    //   70: aload 5
    //   72: invokevirtual 94	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   75: astore_3
    //   76: aload 6
    //   78: aload_3
    //   79: invokespecial 97	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   82: aload 6
    //   84: invokevirtual 101	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   87: astore_3
    //   88: aload_3
    //   89: invokevirtual 107	java/nio/channels/FileChannel:size	()J
    //   92: lstore 7
    //   94: getstatic 113	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   97: astore 4
    //   99: lconst_0
    //   100: lstore 9
    //   102: aload_3
    //   103: aload 4
    //   105: lload 9
    //   107: lload 7
    //   109: invokevirtual 117	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   112: astore_3
    //   113: aload 6
    //   115: ifnull +12 -> 127
    //   118: iconst_0
    //   119: ifeq +75 -> 194
    //   122: aload 6
    //   124: invokevirtual 118	java/io/FileInputStream:close	()V
    //   127: aload 5
    //   129: ifnull -89 -> 40
    //   132: iconst_0
    //   133: ifeq +69 -> 202
    //   136: aload 5
    //   138: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   141: goto -101 -> 40
    //   144: astore 4
    //   146: aconst_null
    //   147: aload 4
    //   149: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   152: goto -112 -> 40
    //   155: astore 4
    //   157: aconst_null
    //   158: aload 4
    //   160: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   163: goto -36 -> 127
    //   166: astore_3
    //   167: aload_3
    //   168: athrow
    //   169: astore 11
    //   171: aload_3
    //   172: astore 4
    //   174: aload 11
    //   176: astore_3
    //   177: aload 5
    //   179: ifnull +13 -> 192
    //   182: aload 4
    //   184: ifnull +86 -> 270
    //   187: aload 5
    //   189: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   192: aload_3
    //   193: athrow
    //   194: aload 6
    //   196: invokevirtual 118	java/io/FileInputStream:close	()V
    //   199: goto -72 -> 127
    //   202: aload 5
    //   204: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   207: goto -167 -> 40
    //   210: astore_3
    //   211: aload_3
    //   212: athrow
    //   213: astore 11
    //   215: aload_3
    //   216: astore 4
    //   218: aload 11
    //   220: astore_3
    //   221: aload 6
    //   223: ifnull +13 -> 236
    //   226: aload 4
    //   228: ifnull +22 -> 250
    //   231: aload 6
    //   233: invokevirtual 118	java/io/FileInputStream:close	()V
    //   236: aload_3
    //   237: athrow
    //   238: astore 12
    //   240: aload 4
    //   242: aload 12
    //   244: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   247: goto -11 -> 236
    //   250: aload 6
    //   252: invokevirtual 118	java/io/FileInputStream:close	()V
    //   255: goto -19 -> 236
    //   258: astore 12
    //   260: aload 4
    //   262: aload 12
    //   264: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   267: goto -75 -> 192
    //   270: aload 5
    //   272: invokevirtual 82	android/os/ParcelFileDescriptor:close	()V
    //   275: goto -83 -> 192
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	paramContext	Context
    //   0	278	1	paramCancellationSignal	android.os.CancellationSignal
    //   0	278	2	paramUri	android.net.Uri
    //   4	37	3	localContentResolver	android.content.ContentResolver
    //   42	3	3	localThrowable1	Throwable
    //   51	1	3	localIOException	IOException
    //   53	60	3	localObject1	Object
    //   166	6	3	localObject2	Object
    //   176	17	3	localObject3	Object
    //   210	6	3	localObject4	Object
    //   220	17	3	localObject5	Object
    //   7	97	4	localObject6	Object
    //   144	4	4	localThrowable2	Throwable
    //   155	4	4	localThrowable3	Throwable
    //   172	89	4	localObject7	Object
    //   17	254	5	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   68	183	6	localFileInputStream	FileInputStream
    //   92	16	7	l1	long
    //   100	6	9	l2	long
    //   169	6	11	localObject8	Object
    //   213	6	11	localObject9	Object
    //   238	5	12	localThrowable4	Throwable
    //   258	5	12	localThrowable5	Throwable
    // Exception table:
    //   from	to	target	type
    //   33	38	42	finally
    //   13	17	51	java/io/IOException
    //   44	48	51	java/io/IOException
    //   57	62	51	java/io/IOException
    //   147	152	51	java/io/IOException
    //   192	194	51	java/io/IOException
    //   202	207	51	java/io/IOException
    //   262	267	51	java/io/IOException
    //   270	275	51	java/io/IOException
    //   136	141	144	finally
    //   122	127	155	finally
    //   65	68	166	finally
    //   70	75	166	finally
    //   78	82	166	finally
    //   158	163	166	finally
    //   194	199	166	finally
    //   236	238	166	finally
    //   242	247	166	finally
    //   250	255	166	finally
    //   167	169	169	finally
    //   82	87	210	finally
    //   88	92	210	finally
    //   94	97	210	finally
    //   107	112	210	finally
    //   211	213	213	finally
    //   231	236	238	finally
    //   187	192	258	finally
  }
  
  private static ByteBuffer a(File paramFile)
  {
    try
    {
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramFile);
      Object localObject1;
      long l1;
      FileChannel.MapMode localMapMode;
      long l2;
      Object localObject2;
      Object localObject5;
      Object localObject4;
      localFileInputStream.close();
    }
    catch (IOException localIOException)
    {
      try
      {
        localObject1 = localFileInputStream.getChannel();
        l1 = ((FileChannel)localObject1).size();
        localMapMode = FileChannel.MapMode.READ_ONLY;
        l2 = 0L;
        localObject1 = ((FileChannel)localObject1).map(localMapMode, l2, l1);
        if ((localFileInputStream == null) || (0 != 0)) {}
        for (;;)
        {
          try
          {
            localFileInputStream.close();
            return (ByteBuffer)localObject1;
          }
          finally
          {
            null.addSuppressed(localThrowable1);
            continue;
          }
          localIOException = localIOException;
          localObject2 = null;
          continue;
          localFileInputStream.close();
        }
        try
        {
          localFileInputStream.close();
          throw ((Throwable)localObject4);
        }
        finally
        {
          ((Throwable)localObject5).addSuppressed(localThrowable2);
        }
      }
      finally
      {
        try
        {
          throw ((Throwable)localObject3);
        }
        finally
        {
          localObject5 = localObject3;
          localObject4 = localObject6;
          if (localFileInputStream == null) {}
        }
      }
    }
    for (;;) {}
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(File paramFile, Resources paramResources, int paramInt)
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = paramResources.openRawResource(paramInt);
      boolean bool = a(paramFile, localInputStream);
      return bool;
    }
    finally
    {
      a(localInputStream);
    }
  }
  
  /* Error */
  public static boolean a(File paramFile, InputStream paramInputStream)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: aconst_null
    //   8: astore 5
    //   10: new 138	java/io/FileOutputStream
    //   13: astore 6
    //   15: iconst_0
    //   16: istore 7
    //   18: aconst_null
    //   19: astore 8
    //   21: aload 6
    //   23: aload_0
    //   24: iconst_0
    //   25: invokespecial 141	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   28: sipush 1024
    //   31: istore 7
    //   33: iload 7
    //   35: newarray <illegal type>
    //   37: astore 8
    //   39: aload_1
    //   40: aload 8
    //   42: invokevirtual 148	java/io/InputStream:read	([B)I
    //   45: istore 4
    //   47: iconst_m1
    //   48: istore 9
    //   50: iload 4
    //   52: iload 9
    //   54: if_icmpeq +89 -> 143
    //   57: iconst_0
    //   58: istore 9
    //   60: aconst_null
    //   61: astore 10
    //   63: aload 6
    //   65: aload 8
    //   67: iconst_0
    //   68: iload 4
    //   70: invokevirtual 152	java/io/FileOutputStream:write	([BII)V
    //   73: goto -34 -> 39
    //   76: astore 8
    //   78: ldc -102
    //   80: astore 5
    //   82: new 6	java/lang/StringBuilder
    //   85: astore 10
    //   87: aload 10
    //   89: invokespecial 10	java/lang/StringBuilder:<init>	()V
    //   92: ldc -100
    //   94: astore 11
    //   96: aload 10
    //   98: aload 11
    //   100: invokevirtual 16	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: astore 10
    //   105: aload 8
    //   107: invokevirtual 159	java/io/IOException:getMessage	()Ljava/lang/String;
    //   110: astore 8
    //   112: aload 10
    //   114: aload 8
    //   116: invokevirtual 16	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: astore 8
    //   121: aload 8
    //   123: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: astore 8
    //   128: aload 5
    //   130: aload 8
    //   132: invokestatic 165	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   135: pop
    //   136: aload 6
    //   138: invokestatic 136	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   141: iload_2
    //   142: ireturn
    //   143: iconst_1
    //   144: istore_2
    //   145: aload 6
    //   147: invokestatic 136	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   150: goto -9 -> 141
    //   153: astore_3
    //   154: aconst_null
    //   155: astore 6
    //   157: aload 6
    //   159: invokestatic 136	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   162: aload_3
    //   163: athrow
    //   164: astore_3
    //   165: goto -8 -> 157
    //   168: astore 8
    //   170: aconst_null
    //   171: astore 6
    //   173: goto -95 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramFile	File
    //   0	176	1	paramInputStream	InputStream
    //   1	144	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   153	10	3	localObject2	Object
    //   164	1	3	localObject3	Object
    //   5	64	4	i	int
    //   8	121	5	str1	String
    //   13	159	6	localFileOutputStream	java.io.FileOutputStream
    //   16	18	7	j	int
    //   19	47	8	arrayOfByte	byte[]
    //   76	30	8	localIOException1	IOException
    //   110	21	8	localObject4	Object
    //   168	1	8	localIOException2	IOException
    //   48	11	9	k	int
    //   61	52	10	localStringBuilder	StringBuilder
    //   94	5	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   33	37	76	java/io/IOException
    //   40	45	76	java/io/IOException
    //   68	73	76	java/io/IOException
    //   10	13	153	finally
    //   24	28	153	finally
    //   33	37	164	finally
    //   40	45	164	finally
    //   68	73	164	finally
    //   82	85	164	finally
    //   87	92	164	finally
    //   98	103	164	finally
    //   105	110	164	finally
    //   114	119	164	finally
    //   121	126	164	finally
    //   130	136	164	finally
    //   10	13	168	java/io/IOException
    //   24	28	168	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */