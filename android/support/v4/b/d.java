package android.support.v4.b;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;

class d
  extends g
{
  private File a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    for (;;)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "/proc/self/fd/";
        localObject1 = ((StringBuilder)localObject1).append(str);
        int i = paramParcelFileDescriptor.getFd();
        localObject1 = ((StringBuilder)localObject1).append(i);
        localObject1 = ((StringBuilder)localObject1).toString();
        str = Os.readlink((String)localObject1);
        localObject1 = Os.stat(str);
        int j = ((StructStat)localObject1).st_mode;
        bool = OsConstants.S_ISREG(j);
        if (!bool) {
          continue;
        }
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(str);
      }
      catch (ErrnoException localErrnoException)
      {
        Object localObject1;
        boolean bool = false;
        Object localObject2 = null;
        continue;
      }
      return (File)localObject1;
      bool = false;
      localObject1 = null;
    }
  }
  
  /* Error */
  public android.graphics.Typeface a(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.support.v4.f.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_3
    //   4: arraylength
    //   5: istore 6
    //   7: iconst_1
    //   8: istore 7
    //   10: iload 6
    //   12: iload 7
    //   14: if_icmpge +6 -> 20
    //   17: aload 5
    //   19: areturn
    //   20: aload_0
    //   21: aload_3
    //   22: iload 4
    //   24: invokevirtual 64	android/support/v4/b/d:a	([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
    //   27: astore 8
    //   29: aload_1
    //   30: invokevirtual 70	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   33: astore 9
    //   35: aload 8
    //   37: invokevirtual 75	android/support/v4/f/b$b:a	()Landroid/net/Uri;
    //   40: astore 8
    //   42: ldc 77
    //   44: astore 10
    //   46: aload 9
    //   48: aload 8
    //   50: aload 10
    //   52: aload_2
    //   53: invokevirtual 83	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   56: astore 10
    //   58: iconst_0
    //   59: istore 7
    //   61: aconst_null
    //   62: astore 9
    //   64: aload_0
    //   65: aload 10
    //   67: invokespecial 86	android/support/v4/b/d:a	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   70: astore 8
    //   72: aload 8
    //   74: ifnull +15 -> 89
    //   77: aload 8
    //   79: invokevirtual 90	java/io/File:canRead	()Z
    //   82: istore 11
    //   84: iload 11
    //   86: ifne +187 -> 273
    //   89: new 92	java/io/FileInputStream
    //   92: astore 12
    //   94: aload 10
    //   96: invokevirtual 96	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   99: astore 8
    //   101: aload 12
    //   103: aload 8
    //   105: invokespecial 99	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   108: aload_0
    //   109: aload_1
    //   110: aload 12
    //   112: invokespecial 102	android/support/v4/b/g:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   115: astore 8
    //   117: aload 12
    //   119: ifnull +12 -> 131
    //   122: iconst_0
    //   123: ifeq +78 -> 201
    //   126: aload 12
    //   128: invokevirtual 105	java/io/FileInputStream:close	()V
    //   131: aload 10
    //   133: ifnull +12 -> 145
    //   136: iconst_0
    //   137: ifeq +83 -> 220
    //   140: aload 10
    //   142: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   145: aload 8
    //   147: astore 5
    //   149: goto -132 -> 17
    //   152: astore 12
    //   154: aconst_null
    //   155: aload 12
    //   157: invokevirtual 112	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   160: goto -29 -> 131
    //   163: astore 8
    //   165: aload 8
    //   167: athrow
    //   168: astore 13
    //   170: aload 8
    //   172: astore 9
    //   174: aload 13
    //   176: astore 8
    //   178: aload 10
    //   180: ifnull +13 -> 193
    //   183: aload 9
    //   185: ifnull +147 -> 332
    //   188: aload 10
    //   190: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   193: aload 8
    //   195: athrow
    //   196: astore 8
    //   198: goto -181 -> 17
    //   201: aload 12
    //   203: invokevirtual 105	java/io/FileInputStream:close	()V
    //   206: goto -75 -> 131
    //   209: astore 10
    //   211: aconst_null
    //   212: aload 10
    //   214: invokevirtual 112	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   217: goto -72 -> 145
    //   220: aload 10
    //   222: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   225: goto -80 -> 145
    //   228: astore 9
    //   230: aload 9
    //   232: athrow
    //   233: astore 8
    //   235: aload 12
    //   237: ifnull +13 -> 250
    //   240: aload 9
    //   242: ifnull +23 -> 265
    //   245: aload 12
    //   247: invokevirtual 105	java/io/FileInputStream:close	()V
    //   250: aload 8
    //   252: athrow
    //   253: astore 12
    //   255: aload 9
    //   257: aload 12
    //   259: invokevirtual 112	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   262: goto -12 -> 250
    //   265: aload 12
    //   267: invokevirtual 105	java/io/FileInputStream:close	()V
    //   270: goto -20 -> 250
    //   273: aload 8
    //   275: invokestatic 118	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   278: astore 8
    //   280: aload 10
    //   282: ifnull +12 -> 294
    //   285: iconst_0
    //   286: ifeq +26 -> 312
    //   289: aload 10
    //   291: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   294: aload 8
    //   296: astore 5
    //   298: goto -281 -> 17
    //   301: astore 10
    //   303: aconst_null
    //   304: aload 10
    //   306: invokevirtual 112	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   309: goto -15 -> 294
    //   312: aload 10
    //   314: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   317: goto -23 -> 294
    //   320: astore 10
    //   322: aload 9
    //   324: aload 10
    //   326: invokevirtual 112	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   329: goto -136 -> 193
    //   332: aload 10
    //   334: invokevirtual 106	android/os/ParcelFileDescriptor:close	()V
    //   337: goto -144 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	340	0	this	d
    //   0	340	1	paramContext	android.content.Context
    //   0	340	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	340	3	paramArrayOfb	android.support.v4.f.b.b[]
    //   0	340	4	paramInt	int
    //   1	296	5	localObject1	Object
    //   5	10	6	i	int
    //   8	52	7	j	int
    //   27	119	8	localObject2	Object
    //   163	8	8	localObject3	Object
    //   176	18	8	localObject4	Object
    //   196	1	8	localIOException	java.io.IOException
    //   233	41	8	localFile	File
    //   278	17	8	localTypeface	android.graphics.Typeface
    //   33	151	9	localObject5	Object
    //   228	95	9	localObject6	Object
    //   44	145	10	localObject7	Object
    //   209	81	10	localThrowable1	Throwable
    //   301	12	10	localThrowable2	Throwable
    //   320	13	10	localThrowable3	Throwable
    //   82	3	11	bool	boolean
    //   92	35	12	localFileInputStream	java.io.FileInputStream
    //   152	94	12	localThrowable4	Throwable
    //   253	13	12	localThrowable5	Throwable
    //   168	7	13	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   126	131	152	finally
    //   65	70	163	finally
    //   77	82	163	finally
    //   89	92	163	finally
    //   94	99	163	finally
    //   103	108	163	finally
    //   155	160	163	finally
    //   201	206	163	finally
    //   250	253	163	finally
    //   257	262	163	finally
    //   265	270	163	finally
    //   273	278	163	finally
    //   165	168	168	finally
    //   35	40	196	java/io/IOException
    //   52	56	196	java/io/IOException
    //   193	196	196	java/io/IOException
    //   212	217	196	java/io/IOException
    //   220	225	196	java/io/IOException
    //   304	309	196	java/io/IOException
    //   312	317	196	java/io/IOException
    //   324	329	196	java/io/IOException
    //   332	337	196	java/io/IOException
    //   140	145	209	finally
    //   110	115	228	finally
    //   230	233	233	finally
    //   245	250	253	finally
    //   289	294	301	finally
    //   188	193	320	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */